package org.apache.jsp.configuration;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.asset.constants.AssetWebKeys;
import com.liferay.asset.display.page.constants.AssetDisplayPageConstants;
import com.liferay.asset.display.page.model.AssetDisplayPageEntry;
import com.liferay.asset.display.page.service.AssetDisplayPageEntryLocalServiceUtil;
import com.liferay.asset.kernel.AssetRendererFactoryRegistryUtil;
import com.liferay.asset.kernel.exception.DuplicateQueryRuleException;
import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.model.AssetRenderer;
import com.liferay.asset.kernel.model.AssetRendererFactory;
import com.liferay.asset.kernel.model.AssetVocabulary;
import com.liferay.asset.kernel.model.ClassType;
import com.liferay.asset.kernel.model.ClassTypeField;
import com.liferay.asset.kernel.model.ClassTypeReader;
import com.liferay.asset.kernel.service.AssetVocabularyLocalServiceUtil;
import com.liferay.asset.list.model.AssetListEntry;
import com.liferay.asset.publisher.constants.AssetPublisherConstants;
import com.liferay.asset.publisher.constants.AssetPublisherPortletKeys;
import com.liferay.asset.publisher.constants.AssetPublisherWebKeys;
import com.liferay.asset.publisher.util.AssetEntryResult;
import com.liferay.asset.publisher.util.AssetPublisherHelper;
import com.liferay.asset.publisher.web.internal.constants.AssetPublisherSelectionStyleConstants;
import com.liferay.asset.publisher.web.internal.display.context.AssetPublisherDisplayContext;
import com.liferay.asset.publisher.web.internal.display.context.AssetPublisherViewContentDisplayContext;
import com.liferay.asset.publisher.web.internal.display.context.ItemSelectorViewDisplayContext;
import com.liferay.asset.publisher.web.internal.display.context.SelectStructureFieldDisplayContext;
import com.liferay.asset.publisher.web.internal.helper.AssetPublisherWebHelper;
import com.liferay.asset.publisher.web.internal.servlet.taglib.util.AssetEntryActionDropdownItemsProvider;
import com.liferay.asset.publisher.web.internal.util.AssetRendererUtil;
import com.liferay.asset.util.AssetHelper;
import com.liferay.asset.util.AssetPublisherAddItemHolder;
import com.liferay.asset.util.comparator.AssetRendererFactoryTypeNameComparator;
import com.liferay.document.library.kernel.document.conversion.DocumentConversionUtil;
import com.liferay.dynamic.data.mapping.model.DDMStructure;
import com.liferay.frontend.taglib.clay.servlet.taglib.util.DropdownItem;
import com.liferay.info.list.provider.item.selector.criterion.InfoListProviderItemSelectorReturnType;
import com.liferay.item.selector.ItemSelector;
import com.liferay.item.selector.criteria.GroupItemSelectorReturnType;
import com.liferay.item.selector.criteria.InfoListItemSelectorReturnType;
import com.liferay.item.selector.criteria.group.criterion.GroupItemSelectorCriterion;
import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.dao.search.ResultRow;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.NoSuchGroupException;
import com.liferay.portal.kernel.exception.NoSuchModelException;
import com.liferay.portal.kernel.frontend.icons.FrontendIconsUtil;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.ClassName;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.portlet.PortletProvider;
import com.liferay.portal.kernel.portlet.PortletProviderUtil;
import com.liferay.portal.kernel.portlet.RequestBackedPortletURLFactoryUtil;
import com.liferay.portal.kernel.portlet.url.builder.PortletURLBuilder;
import com.liferay.portal.kernel.portletdisplaytemplate.PortletDisplayTemplateManager;
import com.liferay.portal.kernel.security.permission.ResourceActionsUtil;
import com.liferay.portal.kernel.service.ClassNameLocalServiceUtil;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.WorkflowDefinitionLinkLocalServiceUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.trash.TrashHandler;
import com.liferay.portal.kernel.trash.TrashHandlerRegistryUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.FastDateFormatFactoryUtil;
import com.liferay.portal.kernel.util.FriendlyURLNormalizerUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.HttpComponentsUtil;
import com.liferay.portal.kernel.util.KeyValuePair;
import com.liferay.portal.kernel.util.KeyValuePairComparator;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.TextFormatter;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.view.count.ViewCountManagerUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portlet.usersadmin.search.GroupSearch;
import com.liferay.rss.util.RSSUtil;
import com.liferay.taglib.aui.AUIUtil;
import java.io.Serializable;
import java.text.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.portlet.PortletMode;
import javax.portlet.PortletURL;

public final class set_005fenable_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/init-ext.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      //  liferay-frontend:defineObjects
      com.liferay.frontend.taglib.servlet.taglib.DefineObjectsTag _jspx_th_liferay$1frontend_defineObjects_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.DefineObjectsTag.class) : new com.liferay.frontend.taglib.servlet.taglib.DefineObjectsTag();
      _jspx_th_liferay$1frontend_defineObjects_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1frontend_defineObjects_0.setParent(null);
      int _jspx_eval_liferay$1frontend_defineObjects_0 = _jspx_th_liferay$1frontend_defineObjects_0.doStartTag();
      if (_jspx_th_liferay$1frontend_defineObjects_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_defineObjects_0);
        _jspx_th_liferay$1frontend_defineObjects_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_defineObjects_0);
      _jspx_th_liferay$1frontend_defineObjects_0.release();
      java.lang.String currentURL = null;
      javax.portlet.PortletURL currentURLObj = null;
      java.lang.String npmResolvedPackageName = null;
      java.util.ResourceBundle resourceBundle = null;
      javax.portlet.WindowState windowState = null;
      currentURL = (java.lang.String) _jspx_page_context.findAttribute("currentURL");
      currentURLObj = (javax.portlet.PortletURL) _jspx_page_context.findAttribute("currentURLObj");
      npmResolvedPackageName = (java.lang.String) _jspx_page_context.findAttribute("npmResolvedPackageName");
      resourceBundle = (java.util.ResourceBundle) _jspx_page_context.findAttribute("resourceBundle");
      windowState = (javax.portlet.WindowState) _jspx_page_context.findAttribute("windowState");
      out.write('\n');
      out.write('\n');
      //  liferay-theme:defineObjects
      com.liferay.taglib.theme.DefineObjectsTag _jspx_th_liferay$1theme_defineObjects_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.theme.DefineObjectsTag.class) : new com.liferay.taglib.theme.DefineObjectsTag();
      _jspx_th_liferay$1theme_defineObjects_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1theme_defineObjects_0.setParent(null);
      int _jspx_eval_liferay$1theme_defineObjects_0 = _jspx_th_liferay$1theme_defineObjects_0.doStartTag();
      if (_jspx_th_liferay$1theme_defineObjects_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1theme_defineObjects_0);
        _jspx_th_liferay$1theme_defineObjects_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1theme_defineObjects_0);
      _jspx_th_liferay$1theme_defineObjects_0.release();
      com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay = null;
      com.liferay.portal.kernel.model.Company company = null;
      com.liferay.portal.kernel.model.User user = null;
      com.liferay.portal.kernel.model.User realUser = null;
      com.liferay.portal.kernel.model.Contact contact = null;
      com.liferay.portal.kernel.model.Layout layout = null;
      java.util.List layouts = null;
      java.lang.Long plid = null;
      com.liferay.portal.kernel.model.LayoutTypePortlet layoutTypePortlet = null;
      java.lang.Long scopeGroupId = null;
      com.liferay.portal.kernel.security.permission.PermissionChecker permissionChecker = null;
      java.util.Locale locale = null;
      java.util.TimeZone timeZone = null;
      com.liferay.portal.kernel.model.Theme theme = null;
      com.liferay.portal.kernel.model.ColorScheme colorScheme = null;
      com.liferay.portal.kernel.theme.PortletDisplay portletDisplay = null;
      java.lang.Long portletGroupId = null;
      themeDisplay = (com.liferay.portal.kernel.theme.ThemeDisplay) _jspx_page_context.findAttribute("themeDisplay");
      company = (com.liferay.portal.kernel.model.Company) _jspx_page_context.findAttribute("company");
      user = (com.liferay.portal.kernel.model.User) _jspx_page_context.findAttribute("user");
      realUser = (com.liferay.portal.kernel.model.User) _jspx_page_context.findAttribute("realUser");
      contact = (com.liferay.portal.kernel.model.Contact) _jspx_page_context.findAttribute("contact");
      layout = (com.liferay.portal.kernel.model.Layout) _jspx_page_context.findAttribute("layout");
      layouts = (java.util.List) _jspx_page_context.findAttribute("layouts");
      plid = (java.lang.Long) _jspx_page_context.findAttribute("plid");
      layoutTypePortlet = (com.liferay.portal.kernel.model.LayoutTypePortlet) _jspx_page_context.findAttribute("layoutTypePortlet");
      scopeGroupId = (java.lang.Long) _jspx_page_context.findAttribute("scopeGroupId");
      permissionChecker = (com.liferay.portal.kernel.security.permission.PermissionChecker) _jspx_page_context.findAttribute("permissionChecker");
      locale = (java.util.Locale) _jspx_page_context.findAttribute("locale");
      timeZone = (java.util.TimeZone) _jspx_page_context.findAttribute("timeZone");
      theme = (com.liferay.portal.kernel.model.Theme) _jspx_page_context.findAttribute("theme");
      colorScheme = (com.liferay.portal.kernel.model.ColorScheme) _jspx_page_context.findAttribute("colorScheme");
      portletDisplay = (com.liferay.portal.kernel.theme.PortletDisplay) _jspx_page_context.findAttribute("portletDisplay");
      portletGroupId = (java.lang.Long) _jspx_page_context.findAttribute("portletGroupId");
      out.write('\n');
      out.write('\n');
      //  portlet:defineObjects
      com.liferay.taglib.portlet.DefineObjectsTag _jspx_th_portlet_defineObjects_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.DefineObjectsTag.class) : new com.liferay.taglib.portlet.DefineObjectsTag();
      _jspx_th_portlet_defineObjects_0.setPageContext(_jspx_page_context);
      _jspx_th_portlet_defineObjects_0.setParent(null);
      int _jspx_eval_portlet_defineObjects_0 = _jspx_th_portlet_defineObjects_0.doStartTag();
      if (_jspx_th_portlet_defineObjects_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_defineObjects_0);
        _jspx_th_portlet_defineObjects_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_defineObjects_0);
      _jspx_th_portlet_defineObjects_0.release();
      javax.portlet.ActionRequest actionRequest = null;
      javax.portlet.ActionResponse actionResponse = null;
      javax.portlet.EventRequest eventRequest = null;
      javax.portlet.EventResponse eventResponse = null;
      com.liferay.portal.kernel.portlet.LiferayPortletRequest liferayPortletRequest = null;
      com.liferay.portal.kernel.portlet.LiferayPortletResponse liferayPortletResponse = null;
      javax.portlet.PortletConfig portletConfig = null;
      java.lang.String portletName = null;
      javax.portlet.PortletPreferences portletPreferences = null;
      java.util.Map portletPreferencesValues = null;
      javax.portlet.PortletSession portletSession = null;
      java.util.Map portletSessionScope = null;
      javax.portlet.RenderRequest renderRequest = null;
      javax.portlet.RenderResponse renderResponse = null;
      javax.portlet.ResourceRequest resourceRequest = null;
      javax.portlet.ResourceResponse resourceResponse = null;
      actionRequest = (javax.portlet.ActionRequest) _jspx_page_context.findAttribute("actionRequest");
      actionResponse = (javax.portlet.ActionResponse) _jspx_page_context.findAttribute("actionResponse");
      eventRequest = (javax.portlet.EventRequest) _jspx_page_context.findAttribute("eventRequest");
      eventResponse = (javax.portlet.EventResponse) _jspx_page_context.findAttribute("eventResponse");
      liferayPortletRequest = (com.liferay.portal.kernel.portlet.LiferayPortletRequest) _jspx_page_context.findAttribute("liferayPortletRequest");
      liferayPortletResponse = (com.liferay.portal.kernel.portlet.LiferayPortletResponse) _jspx_page_context.findAttribute("liferayPortletResponse");
      portletConfig = (javax.portlet.PortletConfig) _jspx_page_context.findAttribute("portletConfig");
      portletName = (java.lang.String) _jspx_page_context.findAttribute("portletName");
      portletPreferences = (javax.portlet.PortletPreferences) _jspx_page_context.findAttribute("portletPreferences");
      portletPreferencesValues = (java.util.Map) _jspx_page_context.findAttribute("portletPreferencesValues");
      portletSession = (javax.portlet.PortletSession) _jspx_page_context.findAttribute("portletSession");
      portletSessionScope = (java.util.Map) _jspx_page_context.findAttribute("portletSessionScope");
      renderRequest = (javax.portlet.RenderRequest) _jspx_page_context.findAttribute("renderRequest");
      renderResponse = (javax.portlet.RenderResponse) _jspx_page_context.findAttribute("renderResponse");
      resourceRequest = (javax.portlet.ResourceRequest) _jspx_page_context.findAttribute("resourceRequest");
      resourceResponse = (javax.portlet.ResourceResponse) _jspx_page_context.findAttribute("resourceResponse");
      out.write('\n');
      out.write('\n');

AssetHelper assetHelper = (AssetHelper)request.getAttribute(AssetWebKeys.ASSET_HELPER);
AssetPublisherDisplayContext assetPublisherDisplayContext = (AssetPublisherDisplayContext)request.getAttribute(AssetPublisherWebKeys.ASSET_PUBLISHER_DISPLAY_CONTEXT);
AssetPublisherHelper assetPublisherHelper = (AssetPublisherHelper)request.getAttribute(AssetPublisherWebKeys.ASSET_PUBLISHER_HELPER);
AssetPublisherWebHelper assetPublisherWebHelper = (AssetPublisherWebHelper)request.getAttribute(AssetPublisherWebKeys.ASSET_PUBLISHER_WEB_HELPER);

Format dateFormatDate = FastDateFormatFactoryUtil.getDate(locale, timeZone);

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<p class=\"h4 sheet-tertiary-title\">\n");
      out.write("\t");
      if (_jspx_meth_liferay$1ui_message_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</p>\n");
      out.write("\n");
if (
 assetPublisherDisplayContext.isShowEnableAddContentButton() ) {
      out.write('\n');
      out.write('	');
      //  aui:input
      com.liferay.taglib.aui.InputTag _jspx_th_aui_input_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
      _jspx_th_aui_input_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_input_0.setParent(null);
      _jspx_th_aui_input_0.setHelpMessage("show-add-content-button-help");
      _jspx_th_aui_input_0.setName("preferences--showAddContentButton--");
      _jspx_th_aui_input_0.setType("checkbox");
      _jspx_th_aui_input_0.setValue( assetPublisherDisplayContext.isShowAddContentButton() );
      int _jspx_eval_aui_input_0 = _jspx_th_aui_input_0.doStartTag();
      if (_jspx_th_aui_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_0);
        _jspx_th_aui_input_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_0);
      _jspx_th_aui_input_0.release();
      out.write('\n');
}
      out.write('\n');
      out.write('\n');

String helpMessage1 = "<em>" + LanguageUtil.format(request, "content-related-to-x", StringPool.DOUBLE_PERIOD, false) + "</em>";
String helpMessage2 = "<em>" + LanguageUtil.format(request, "content-with-tag-x", StringPool.DOUBLE_PERIOD, false) + "</em>";

      out.write('\n');
      out.write('\n');
      //  aui:input
      com.liferay.taglib.aui.InputTag _jspx_th_aui_input_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
      _jspx_th_aui_input_1.setPageContext(_jspx_page_context);
      _jspx_th_aui_input_1.setParent(null);
      _jspx_th_aui_input_1.setHelpMessage( LanguageUtil.format(request, "such-as-x-or-x", new Object[] {helpMessage1, helpMessage2}, false) );
      _jspx_th_aui_input_1.setName("preferences--showMetadataDescriptions--");
      _jspx_th_aui_input_1.setType("checkbox");
      _jspx_th_aui_input_1.setValue( assetPublisherDisplayContext.isShowMetadataDescriptions() );
      int _jspx_eval_aui_input_1 = _jspx_th_aui_input_1.doStartTag();
      if (_jspx_th_aui_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_1);
        _jspx_th_aui_input_1.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_1);
      _jspx_th_aui_input_1.release();
      out.write('\n');
      out.write('\n');
      //  aui:input
      com.liferay.taglib.aui.InputTag _jspx_th_aui_input_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
      _jspx_th_aui_input_2.setPageContext(_jspx_page_context);
      _jspx_th_aui_input_2.setParent(null);
      _jspx_th_aui_input_2.setName("preferences--showAvailableLocales--");
      _jspx_th_aui_input_2.setType("checkbox");
      _jspx_th_aui_input_2.setValue( assetPublisherDisplayContext.isShowAvailableLocales() );
      int _jspx_eval_aui_input_2 = _jspx_th_aui_input_2.doStartTag();
      if (_jspx_th_aui_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_2);
        _jspx_th_aui_input_2.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_2);
      _jspx_th_aui_input_2.release();
      out.write('\n');
      out.write('\n');
if (
 assetPublisherDisplayContext.isEnableSetAsDefaultAssetPublisher() ) {
      out.write('\n');
      out.write('	');
      //  aui:input
      com.liferay.taglib.aui.InputTag _jspx_th_aui_input_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
      _jspx_th_aui_input_3.setPageContext(_jspx_page_context);
      _jspx_th_aui_input_3.setParent(null);
      _jspx_th_aui_input_3.setHelpMessage("set-as-the-default-asset-publisher-for-this-page-help");
      _jspx_th_aui_input_3.setLabel("set-as-the-default-asset-publisher-for-this-page");
      _jspx_th_aui_input_3.setName("defaultAssetPublisher");
      _jspx_th_aui_input_3.setType("checkbox");
      _jspx_th_aui_input_3.setValue( assetPublisherWebHelper.isDefaultAssetPublisher(layout, portletDisplay.getId(), assetPublisherDisplayContext.getPortletResource()) );
      int _jspx_eval_aui_input_3 = _jspx_th_aui_input_3.doStartTag();
      if (_jspx_th_aui_input_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_3);
        _jspx_th_aui_input_3.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_3);
      _jspx_th_aui_input_3.release();
      out.write("\n");
      out.write("\n");
      out.write("\t");
      //  aui:input
      com.liferay.taglib.aui.InputTag _jspx_th_aui_input_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
      _jspx_th_aui_input_4.setPageContext(_jspx_page_context);
      _jspx_th_aui_input_4.setParent(null);
      _jspx_th_aui_input_4.setLabel( LanguageUtil.format(request, "show-only-assets-with-x-as-its-display-page-template", HtmlUtil.escape(layout.getName(locale)), false) );
      _jspx_th_aui_input_4.setName("preferences--showOnlyLayoutAssets--");
      _jspx_th_aui_input_4.setType("checkbox");
      _jspx_th_aui_input_4.setValue( assetPublisherDisplayContext.isShowOnlyLayoutAssets() );
      int _jspx_eval_aui_input_4 = _jspx_th_aui_input_4.doStartTag();
      if (_jspx_th_aui_input_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_4);
        _jspx_th_aui_input_4.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_4);
      _jspx_th_aui_input_4.release();
      out.write('\n');
}
      out.write('\n');
      out.write('\n');
      //  aui:input
      com.liferay.taglib.aui.InputTag _jspx_th_aui_input_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
      _jspx_th_aui_input_5.setPageContext(_jspx_page_context);
      _jspx_th_aui_input_5.setParent(null);
      _jspx_th_aui_input_5.setLabel("include-tags-specified-in-the-url");
      _jspx_th_aui_input_5.setName("preferences--mergeUrlTags--");
      _jspx_th_aui_input_5.setType("checkbox");
      _jspx_th_aui_input_5.setValue( assetPublisherDisplayContext.isMergeURLTags() );
      int _jspx_eval_aui_input_5 = _jspx_th_aui_input_5.doStartTag();
      if (_jspx_th_aui_input_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_5);
        _jspx_th_aui_input_5.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_5);
      _jspx_th_aui_input_5.release();
      out.write("\n");
      out.write("\n");
      out.write("<p class=\"h4 sheet-tertiary-title\">\n");
      out.write("\t");
      if (_jspx_meth_liferay$1ui_message_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</p>\n");
      out.write("\n");
      //  clay:row
      com.liferay.frontend.taglib.clay.servlet.taglib.RowTag _jspx_th_clay_row_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.RowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.RowTag();
      _jspx_th_clay_row_0.setPageContext(_jspx_page_context);
      _jspx_th_clay_row_0.setParent(null);
      int _jspx_eval_clay_row_0 = _jspx_th_clay_row_0.doStartTag();
      if (_jspx_eval_clay_row_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write('\n');
        out.write('	');
        //  clay:col
        com.liferay.frontend.taglib.clay.servlet.taglib.ColTag _jspx_th_clay_col_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ColTag();
        _jspx_th_clay_col_0.setPageContext(_jspx_page_context);
        _jspx_th_clay_col_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_row_0);
        _jspx_th_clay_col_0.setMd("6");
        int _jspx_eval_clay_col_0 = _jspx_th_clay_col_0.doStartTag();
        if (_jspx_eval_clay_col_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t");
          //  aui:input
          com.liferay.taglib.aui.InputTag _jspx_th_aui_input_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
          _jspx_th_aui_input_6.setPageContext(_jspx_page_context);
          _jspx_th_aui_input_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
          _jspx_th_aui_input_6.setLabel("print");
          _jspx_th_aui_input_6.setName("preferences--enablePrint--");
          _jspx_th_aui_input_6.setType("checkbox");
          _jspx_th_aui_input_6.setValue( assetPublisherDisplayContext.isEnablePrint() );
          int _jspx_eval_aui_input_6 = _jspx_th_aui_input_6.doStartTag();
          if (_jspx_th_aui_input_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_6);
            _jspx_th_aui_input_6.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_6);
          _jspx_th_aui_input_6.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  aui:input
          com.liferay.taglib.aui.InputTag _jspx_th_aui_input_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
          _jspx_th_aui_input_7.setPageContext(_jspx_page_context);
          _jspx_th_aui_input_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
          _jspx_th_aui_input_7.setLabel("flags");
          _jspx_th_aui_input_7.setName("preferences--enableFlags--");
          _jspx_th_aui_input_7.setType("checkbox");
          _jspx_th_aui_input_7.setValue( assetPublisherDisplayContext.isEnableFlags() );
          int _jspx_eval_aui_input_7 = _jspx_th_aui_input_7.doStartTag();
          if (_jspx_th_aui_input_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_7);
            _jspx_th_aui_input_7.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_7);
          _jspx_th_aui_input_7.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  aui:input
          com.liferay.taglib.aui.InputTag _jspx_th_aui_input_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
          _jspx_th_aui_input_8.setPageContext(_jspx_page_context);
          _jspx_th_aui_input_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
          _jspx_th_aui_input_8.setLabel("ratings");
          _jspx_th_aui_input_8.setName("preferences--enableRatings--");
          _jspx_th_aui_input_8.setType("checkbox");
          _jspx_th_aui_input_8.setValue( assetPublisherDisplayContext.isEnableRatings() );
          int _jspx_eval_aui_input_8 = _jspx_th_aui_input_8.doStartTag();
          if (_jspx_th_aui_input_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_8);
            _jspx_th_aui_input_8.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_8);
          _jspx_th_aui_input_8.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          out.write("\n");
          out.write("\t\t\t");
if (
 !assetPublisherDisplayContext.isShowEnableRelatedAssets() ) {
          out.write("\n");
          out.write("\t\t\t\t");
          //  aui:input
          com.liferay.taglib.aui.InputTag _jspx_th_aui_input_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
          _jspx_th_aui_input_9.setPageContext(_jspx_page_context);
          _jspx_th_aui_input_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
          _jspx_th_aui_input_9.setLabel("related-assets");
          _jspx_th_aui_input_9.setName("preferences--enableRelatedAssets--");
          _jspx_th_aui_input_9.setType("hidden");
          _jspx_th_aui_input_9.setValue( assetPublisherDisplayContext.isEnableRelatedAssets() );
          int _jspx_eval_aui_input_9 = _jspx_th_aui_input_9.doStartTag();
          if (_jspx_th_aui_input_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_9);
            _jspx_th_aui_input_9.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_9);
          _jspx_th_aui_input_9.release();
          out.write("\n");
          out.write("\t\t\t");
          out.write("\n");
          out.write("\t\t\t");
}
else {
          out.write("\n");
          out.write("\t\t\t\t");
          //  aui:input
          com.liferay.taglib.aui.InputTag _jspx_th_aui_input_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
          _jspx_th_aui_input_10.setPageContext(_jspx_page_context);
          _jspx_th_aui_input_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
          _jspx_th_aui_input_10.setLabel("related-assets");
          _jspx_th_aui_input_10.setName("preferences--enableRelatedAssets--");
          _jspx_th_aui_input_10.setType("checkbox");
          _jspx_th_aui_input_10.setValue( assetPublisherDisplayContext.isEnableRelatedAssets() );
          int _jspx_eval_aui_input_10 = _jspx_th_aui_input_10.doStartTag();
          if (_jspx_th_aui_input_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_10);
            _jspx_th_aui_input_10.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_10);
          _jspx_th_aui_input_10.release();
          out.write("\n");
          out.write("\t\t\t");
          out.write("\n");
          out.write("\t\t");
}
          out.write('\n');
          out.write('	');
        }
        if (_jspx_th_clay_col_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_0);
          _jspx_th_clay_col_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_0);
        _jspx_th_clay_col_0.release();
        out.write("\n");
        out.write("\n");
        out.write("\t");
        //  clay:col
        com.liferay.frontend.taglib.clay.servlet.taglib.ColTag _jspx_th_clay_col_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ColTag();
        _jspx_th_clay_col_1.setPageContext(_jspx_page_context);
        _jspx_th_clay_col_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_row_0);
        _jspx_th_clay_col_1.setMd("6");
        int _jspx_eval_clay_col_1 = _jspx_th_clay_col_1.doStartTag();
        if (_jspx_eval_clay_col_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t");
          //  aui:input
          com.liferay.taglib.aui.InputTag _jspx_th_aui_input_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
          _jspx_th_aui_input_11.setPageContext(_jspx_page_context);
          _jspx_th_aui_input_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_1);
          _jspx_th_aui_input_11.setLabel("subscribe");
          _jspx_th_aui_input_11.setName("preferences--enableSubscriptions--");
          _jspx_th_aui_input_11.setType("checkbox");
          _jspx_th_aui_input_11.setValue( assetPublisherDisplayContext.isEnableSubscriptions() );
          int _jspx_eval_aui_input_11 = _jspx_th_aui_input_11.doStartTag();
          if (_jspx_th_aui_input_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_11);
            _jspx_th_aui_input_11.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_11);
          _jspx_th_aui_input_11.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  aui:input
          com.liferay.taglib.aui.InputTag _jspx_th_aui_input_12 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
          _jspx_th_aui_input_12.setPageContext(_jspx_page_context);
          _jspx_th_aui_input_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_1);
          _jspx_th_aui_input_12.setLabel("comments");
          _jspx_th_aui_input_12.setName("preferences--enableComments--");
          _jspx_th_aui_input_12.setType("checkbox");
          _jspx_th_aui_input_12.setValue( assetPublisherDisplayContext.isEnableComments() );
          int _jspx_eval_aui_input_12 = _jspx_th_aui_input_12.doStartTag();
          if (_jspx_th_aui_input_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_12);
            _jspx_th_aui_input_12.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_12);
          _jspx_th_aui_input_12.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  aui:input
          com.liferay.taglib.aui.InputTag _jspx_th_aui_input_13 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
          _jspx_th_aui_input_13.setPageContext(_jspx_page_context);
          _jspx_th_aui_input_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_1);
          _jspx_th_aui_input_13.setLabel("comment-ratings");
          _jspx_th_aui_input_13.setName("preferences--enableCommentRatings--");
          _jspx_th_aui_input_13.setType("checkbox");
          _jspx_th_aui_input_13.setValue( assetPublisherDisplayContext.isEnableCommentRatings() );
          int _jspx_eval_aui_input_13 = _jspx_th_aui_input_13.doStartTag();
          if (_jspx_th_aui_input_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_13);
            _jspx_th_aui_input_13.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_13);
          _jspx_th_aui_input_13.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
if (
 ViewCountManagerUtil.isViewCountEnabled() ) {
          out.write("\n");
          out.write("\t\t\t");
          //  aui:input
          com.liferay.taglib.aui.InputTag _jspx_th_aui_input_14 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
          _jspx_th_aui_input_14.setPageContext(_jspx_page_context);
          _jspx_th_aui_input_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_1);
          _jspx_th_aui_input_14.setLabel("view-count-increment");
          _jspx_th_aui_input_14.setName("preferences--enableViewCountIncrement--");
          _jspx_th_aui_input_14.setType("checkbox");
          _jspx_th_aui_input_14.setValue( assetPublisherDisplayContext.isEnableViewCountIncrement() );
          int _jspx_eval_aui_input_14 = _jspx_th_aui_input_14.doStartTag();
          if (_jspx_th_aui_input_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_14);
            _jspx_th_aui_input_14.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_14);
          _jspx_th_aui_input_14.release();
          out.write("\n");
          out.write("\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
if (
 assetPublisherDisplayContext.isSelectionStyleManual() ) {
          out.write("\n");
          out.write("\t\t\t");
          //  aui:input
          com.liferay.taglib.aui.InputTag _jspx_th_aui_input_15 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
          _jspx_th_aui_input_15.setPageContext(_jspx_page_context);
          _jspx_th_aui_input_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_1);
          _jspx_th_aui_input_15.setHelpMessage("enable-tag-based-navigation-help");
          _jspx_th_aui_input_15.setLabel("tag-based-navigation");
          _jspx_th_aui_input_15.setName("preferences--enableTagBasedNavigation--");
          _jspx_th_aui_input_15.setType("checkbox");
          _jspx_th_aui_input_15.setValue( assetPublisherDisplayContext.isEnableTagBasedNavigation() );
          int _jspx_eval_aui_input_15 = _jspx_th_aui_input_15.doStartTag();
          if (_jspx_th_aui_input_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_15);
            _jspx_th_aui_input_15.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_15);
          _jspx_th_aui_input_15.release();
          out.write("\n");
          out.write("\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          out.write("\n");
          out.write("\t\t\t");
if (
 !assetPublisherDisplayContext.isShowEnablePermissions() ) {
          out.write("\n");
          out.write("\t\t\t\t");
          //  aui:input
          com.liferay.taglib.aui.InputTag _jspx_th_aui_input_16 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
          _jspx_th_aui_input_16.setPageContext(_jspx_page_context);
          _jspx_th_aui_input_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_1);
          _jspx_th_aui_input_16.setLabel("permissions");
          _jspx_th_aui_input_16.setName("preferences--enablePermissions--");
          _jspx_th_aui_input_16.setType("hidden");
          _jspx_th_aui_input_16.setValue( assetPublisherDisplayContext.isEnablePermissions() );
          int _jspx_eval_aui_input_16 = _jspx_th_aui_input_16.doStartTag();
          if (_jspx_th_aui_input_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_16);
            _jspx_th_aui_input_16.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_16);
          _jspx_th_aui_input_16.release();
          out.write("\n");
          out.write("\t\t\t");
          out.write("\n");
          out.write("\t\t\t");
}
else {
          out.write("\n");
          out.write("\t\t\t\t");
          //  aui:input
          com.liferay.taglib.aui.InputTag _jspx_th_aui_input_17 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
          _jspx_th_aui_input_17.setPageContext(_jspx_page_context);
          _jspx_th_aui_input_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_1);
          _jspx_th_aui_input_17.setLabel("permissions");
          _jspx_th_aui_input_17.setName("preferences--enablePermissions--");
          _jspx_th_aui_input_17.setType("checkbox");
          _jspx_th_aui_input_17.setValue( assetPublisherDisplayContext.isEnablePermissions() );
          int _jspx_eval_aui_input_17 = _jspx_th_aui_input_17.doStartTag();
          if (_jspx_th_aui_input_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_17);
            _jspx_th_aui_input_17.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_17);
          _jspx_th_aui_input_17.release();
          out.write("\n");
          out.write("\t\t\t");
          out.write("\n");
          out.write("\t\t");
}
          out.write('\n');
          out.write('	');
        }
        if (_jspx_th_clay_col_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_1);
          _jspx_th_clay_col_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_1);
        _jspx_th_clay_col_1.release();
        out.write('\n');
      }
      if (_jspx_th_clay_row_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_row_0);
        _jspx_th_clay_row_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_row_0);
      _jspx_th_clay_row_0.release();
      out.write('\n');
      out.write('\n');
if (
 assetPublisherDisplayContext.isOpenOfficeServerEnabled() ) {
      out.write("\n");
      out.write("\n");
      out.write("\t");

	String[] conversions = DocumentConversionUtil.getConversions("html");
	
      out.write("\n");
      out.write("\n");
      out.write("\t<p class=\"h4 sheet-tertiary-title\">\n");
      out.write("\t\t");
      if (_jspx_meth_liferay$1ui_message_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t");
      if (_jspx_meth_liferay$1ui_icon$1help_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t</p>\n");
      out.write("\n");
      out.write("\t");
      //  clay:row
      com.liferay.frontend.taglib.clay.servlet.taglib.RowTag _jspx_th_clay_row_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.RowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.RowTag();
      _jspx_th_clay_row_1.setPageContext(_jspx_page_context);
      _jspx_th_clay_row_1.setParent(null);
      int _jspx_eval_clay_row_1 = _jspx_th_clay_row_1.doStartTag();
      if (_jspx_eval_clay_row_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t");
        //  clay:col
        com.liferay.frontend.taglib.clay.servlet.taglib.ColTag _jspx_th_clay_col_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ColTag();
        _jspx_th_clay_col_2.setPageContext(_jspx_page_context);
        _jspx_th_clay_col_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_row_1);
        _jspx_th_clay_col_2.setMd("6");
        int _jspx_eval_clay_col_2 = _jspx_th_clay_col_2.doStartTag();
        if (_jspx_eval_clay_col_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t");

			for (int i = 0; i < (conversions.length / 2); i++) {
				String conversion = conversions[i];
			
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t");
          //  aui:input
          com.liferay.taglib.aui.InputTag _jspx_th_aui_input_18 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
          _jspx_th_aui_input_18.setPageContext(_jspx_page_context);
          _jspx_th_aui_input_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_2);
          _jspx_th_aui_input_18.setChecked( ArrayUtil.contains(assetPublisherDisplayContext.getExtensions(), conversion) );
          _jspx_th_aui_input_18.setId( "extensions" + conversion );
          _jspx_th_aui_input_18.setLabel( StringUtil.toUpperCase(conversion) );
          _jspx_th_aui_input_18.setName("extensions");
          _jspx_th_aui_input_18.setType("checkbox");
          _jspx_th_aui_input_18.setValue( conversion );
          int _jspx_eval_aui_input_18 = _jspx_th_aui_input_18.doStartTag();
          if (_jspx_th_aui_input_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_18);
            _jspx_th_aui_input_18.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_18);
          _jspx_th_aui_input_18.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t");

			}
			
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
        }
        if (_jspx_th_clay_col_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_2);
          _jspx_th_clay_col_2.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_2);
        _jspx_th_clay_col_2.release();
        out.write("\n");
        out.write("\n");
        out.write("\t\t");
        //  clay:col
        com.liferay.frontend.taglib.clay.servlet.taglib.ColTag _jspx_th_clay_col_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ColTag();
        _jspx_th_clay_col_3.setPageContext(_jspx_page_context);
        _jspx_th_clay_col_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_row_1);
        _jspx_th_clay_col_3.setMd("6");
        int _jspx_eval_clay_col_3 = _jspx_th_clay_col_3.doStartTag();
        if (_jspx_eval_clay_col_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t");

			for (int i = conversions.length / 2; i < conversions.length; i++) {
				String conversion = conversions[i];
			
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t");
          //  aui:input
          com.liferay.taglib.aui.InputTag _jspx_th_aui_input_19 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
          _jspx_th_aui_input_19.setPageContext(_jspx_page_context);
          _jspx_th_aui_input_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_3);
          _jspx_th_aui_input_19.setChecked( ArrayUtil.contains(assetPublisherDisplayContext.getExtensions(), conversion) );
          _jspx_th_aui_input_19.setId( "extensions" + conversion );
          _jspx_th_aui_input_19.setLabel( StringUtil.toUpperCase(conversion) );
          _jspx_th_aui_input_19.setName("extensions");
          _jspx_th_aui_input_19.setType("checkbox");
          _jspx_th_aui_input_19.setValue( conversion );
          int _jspx_eval_aui_input_19 = _jspx_th_aui_input_19.doStartTag();
          if (_jspx_th_aui_input_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_19);
            _jspx_th_aui_input_19.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_19);
          _jspx_th_aui_input_19.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t");

			}
			
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
        }
        if (_jspx_th_clay_col_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_3);
          _jspx_th_clay_col_3.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_3);
        _jspx_th_clay_col_3.release();
        out.write('\n');
        out.write('	');
      }
      if (_jspx_th_clay_row_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_row_1);
        _jspx_th_clay_row_1.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_row_1);
      _jspx_th_clay_row_1.release();
      out.write('\n');
}
      out.write("\n");
      out.write("\n");
      out.write("<p class=\"h4 sheet-tertiary-title\">\n");
      out.write("\t");
      if (_jspx_meth_liferay$1ui_message_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</p>\n");
      out.write("\n");
      //  liferay-social-bookmarks:bookmarks-settings
      com.liferay.social.bookmarks.taglib.servlet.taglib.SocialBookmarksSettingsTag _jspx_th_liferay$1social$1bookmarks_bookmarks$1settings_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.social.bookmarks.taglib.servlet.taglib.SocialBookmarksSettingsTag.class) : new com.liferay.social.bookmarks.taglib.servlet.taglib.SocialBookmarksSettingsTag();
      _jspx_th_liferay$1social$1bookmarks_bookmarks$1settings_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1social$1bookmarks_bookmarks$1settings_0.setParent(null);
      _jspx_th_liferay$1social$1bookmarks_bookmarks$1settings_0.setDisplayStyle( assetPublisherDisplayContext.getSocialBookmarksDisplayStyle() );
      _jspx_th_liferay$1social$1bookmarks_bookmarks$1settings_0.setTypes( assetPublisherDisplayContext.getSocialBookmarksTypes() );
      int _jspx_eval_liferay$1social$1bookmarks_bookmarks$1settings_0 = _jspx_th_liferay$1social$1bookmarks_bookmarks$1settings_0.doStartTag();
      if (_jspx_th_liferay$1social$1bookmarks_bookmarks$1settings_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1social$1bookmarks_bookmarks$1settings_0);
        _jspx_th_liferay$1social$1bookmarks_bookmarks$1settings_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1social$1bookmarks_bookmarks$1settings_0);
      _jspx_th_liferay$1social$1bookmarks_bookmarks$1settings_0.release();
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_liferay$1ui_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent(null);
    _jspx_th_liferay$1ui_message_0.setKey("show-and-set");
    int _jspx_eval_liferay$1ui_message_0 = _jspx_th_liferay$1ui_message_0.doStartTag();
    if (_jspx_th_liferay$1ui_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
      _jspx_th_liferay$1ui_message_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
    _jspx_th_liferay$1ui_message_0.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent(null);
    _jspx_th_liferay$1ui_message_1.setKey("enable");
    int _jspx_eval_liferay$1ui_message_1 = _jspx_th_liferay$1ui_message_1.doStartTag();
    if (_jspx_th_liferay$1ui_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_1);
      _jspx_th_liferay$1ui_message_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_1);
    _jspx_th_liferay$1ui_message_1.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_2.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_2.setParent(null);
    _jspx_th_liferay$1ui_message_2.setKey("enable-conversion-to");
    int _jspx_eval_liferay$1ui_message_2 = _jspx_th_liferay$1ui_message_2.doStartTag();
    if (_jspx_th_liferay$1ui_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
      _jspx_th_liferay$1ui_message_2.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
    _jspx_th_liferay$1ui_message_2.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_icon$1help_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:icon-help
    com.liferay.taglib.ui.IconHelpTag _jspx_th_liferay$1ui_icon$1help_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconHelpTag.class) : new com.liferay.taglib.ui.IconHelpTag();
    _jspx_th_liferay$1ui_icon$1help_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_icon$1help_0.setParent(null);
    _jspx_th_liferay$1ui_icon$1help_0.setMessage("enabling-openoffice-integration-provides-document-conversion-functionality");
    int _jspx_eval_liferay$1ui_icon$1help_0 = _jspx_th_liferay$1ui_icon$1help_0.doStartTag();
    if (_jspx_th_liferay$1ui_icon$1help_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon$1help_0);
      _jspx_th_liferay$1ui_icon$1help_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon$1help_0);
    _jspx_th_liferay$1ui_icon$1help_0.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_3.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_3.setParent(null);
    _jspx_th_liferay$1ui_message_3.setKey("social-bookmarks");
    int _jspx_eval_liferay$1ui_message_3 = _jspx_th_liferay$1ui_message_3.doStartTag();
    if (_jspx_th_liferay$1ui_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_3);
      _jspx_th_liferay$1ui_message_3.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_3);
    _jspx_th_liferay$1ui_message_3.release();
    return false;
  }
}
