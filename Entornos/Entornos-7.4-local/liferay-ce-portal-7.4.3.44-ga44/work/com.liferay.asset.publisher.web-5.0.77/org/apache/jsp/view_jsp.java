package org.apache.jsp;

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

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(21);
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/META-INF/c.tld");
    _jspx_dependants.add("/META-INF/liferay-portlet_2_0.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-asset.tld");
    _jspx_dependants.add("/META-INF/liferay-aui.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-clay.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-comment.tld");
    _jspx_dependants.add("/META-INF/resources/liferay-ddm.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-flags.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-frontend.tld");
    _jspx_dependants.add("/META-INF/liferay-portlet-ext.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/ratings.tld");
    _jspx_dependants.add("/META-INF/resources/react.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-rss.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-site.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-social-bookmarks.tld");
    _jspx_dependants.add("/META-INF/resources/liferay-template.tld");
    _jspx_dependants.add("/META-INF/liferay-theme.tld");
    _jspx_dependants.add("/META-INF/liferay-ui.tld");
    _jspx_dependants.add("/META-INF/liferay-util.tld");
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
      out.write('\n');
      out.write('\n');

assetPublisherDisplayContext.setPageKeywords();

if (assetPublisherDisplayContext.isEnableTagBasedNavigation() && !assetPublisherDisplayContext.isSelectionStyleAssetList() && assetPublisherDisplayContext.isSelectionStyleManual() && (ArrayUtil.isNotEmpty(assetPublisherDisplayContext.getAllAssetCategoryIds()) || ArrayUtil.isNotEmpty(assetPublisherDisplayContext.getAllAssetTagNames()))) {
	assetPublisherDisplayContext.setSelectionStyle(AssetPublisherSelectionStyleConstants.TYPE_DYNAMIC);
}

      out.write('\n');
      out.write('\n');
      //  liferay-ui:success
      com.liferay.taglib.ui.SuccessTag _jspx_th_liferay$1ui_success_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SuccessTag.class) : new com.liferay.taglib.ui.SuccessTag();
      _jspx_th_liferay$1ui_success_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_success_0.setParent(null);
      _jspx_th_liferay$1ui_success_0.setKey( AssetPublisherPortletKeys.ASSET_PUBLISHER + "requestProcessed" );
      _jspx_th_liferay$1ui_success_0.setMessage("your-request-completed-successfully");
      int _jspx_eval_liferay$1ui_success_0 = _jspx_th_liferay$1ui_success_0.doStartTag();
      if (_jspx_th_liferay$1ui_success_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_success_0);
        _jspx_th_liferay$1ui_success_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_success_0);
      _jspx_th_liferay$1ui_success_0.release();
      out.write('\n');
      out.write('\n');
if (
 assetPublisherDisplayContext.isEnableSubscriptions() ) {
      out.write("\n");
      out.write("\t<div class=\"mb-4 subscribe-action\">\n");
      out.write("\t\t");
if (
 PortalUtil.isRSSFeedsEnabled() && assetPublisherDisplayContext.isEnableRSS() ) {
      out.write("\n");
      out.write("\t\t\t");
      //  liferay-portlet:resourceURL
      com.liferay.taglib.portlet.ResourceURLTag _jspx_th_liferay$1portlet_resourceURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ResourceURLTag.class) : new com.liferay.taglib.portlet.ResourceURLTag();
      _jspx_th_liferay$1portlet_resourceURL_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1portlet_resourceURL_0.setParent(null);
      _jspx_th_liferay$1portlet_resourceURL_0.setId("getRSS");
      _jspx_th_liferay$1portlet_resourceURL_0.setVarImpl("rssURL");
      int _jspx_eval_liferay$1portlet_resourceURL_0 = _jspx_th_liferay$1portlet_resourceURL_0.doStartTag();
      if (_jspx_th_liferay$1portlet_resourceURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_resourceURL_0);
        _jspx_th_liferay$1portlet_resourceURL_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_resourceURL_0);
      _jspx_th_liferay$1portlet_resourceURL_0.release();
      com.liferay.portal.kernel.portlet.LiferayPortletURL rssURL = null;
      rssURL = (com.liferay.portal.kernel.portlet.LiferayPortletURL) _jspx_page_context.findAttribute("rssURL");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"btn-group-item\">\n");
      out.write("\t\t\t\t");
      //  clay:link
      com.liferay.frontend.taglib.clay.servlet.taglib.LinkTag _jspx_th_clay_link_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.LinkTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.LinkTag();
      _jspx_th_clay_link_0.setPageContext(_jspx_page_context);
      _jspx_th_clay_link_0.setParent(null);
      _jspx_th_clay_link_0.setBorderless( true );
      _jspx_th_clay_link_0.setDynamicAttribute(null, "data-senna-off",  true );
      _jspx_th_clay_link_0.setDisplayType("secondary");
      _jspx_th_clay_link_0.setHref( rssURL.toString() );
      _jspx_th_clay_link_0.setIcon("rss-full");
      _jspx_th_clay_link_0.setLabel("rss");
      _jspx_th_clay_link_0.setOutline( true );
      _jspx_th_clay_link_0.setSmall( true );
      _jspx_th_clay_link_0.setType("button");
      int _jspx_eval_clay_link_0 = _jspx_th_clay_link_0.doStartTag();
      if (_jspx_th_clay_link_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_link_0);
        _jspx_th_clay_link_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_link_0);
      _jspx_th_clay_link_0.release();
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t");
      //  liferay-util:html-top
      com.liferay.taglib.util.HtmlTopTag _jspx_th_liferay$1util_html$1top_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.HtmlTopTag.class) : new com.liferay.taglib.util.HtmlTopTag();
      _jspx_th_liferay$1util_html$1top_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1util_html$1top_0.setParent(null);
      int _jspx_eval_liferay$1util_html$1top_0 = _jspx_th_liferay$1util_html$1top_0.doStartTag();
      if (_jspx_eval_liferay$1util_html$1top_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_liferay$1util_html$1top_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_liferay$1util_html$1top_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_liferay$1util_html$1top_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\t\t\t\t<link href=\"");
          out.print( HtmlUtil.escapeAttribute(rssURL.toString()) );
          out.write("\" rel=\"alternate\" title=\"RSS\" type=\"application/rss+xml\" />\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_liferay$1util_html$1top_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_liferay$1util_html$1top_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_liferay$1util_html$1top_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_html$1top_0);
        _jspx_th_liferay$1util_html$1top_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_html$1top_0);
      _jspx_th_liferay$1util_html$1top_0.release();
      out.write("\n");
      out.write("\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t");
if (
 assetPublisherDisplayContext.isSubscriptionEnabled() ) {
      out.write("\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
if (
 assetPublisherWebHelper.isSubscribed(themeDisplay.getCompanyId(), user.getUserId(), themeDisplay.getPlid(), portletDisplay.getId()) ) {
      out.write("\n");
      out.write("\t\t\t\t\t");
      //  portlet:actionURL
      com.liferay.taglib.portlet.ActionURLTag _jspx_th_portlet_actionURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ActionURLTag.class) : new com.liferay.taglib.portlet.ActionURLTag();
      _jspx_th_portlet_actionURL_0.setPageContext(_jspx_page_context);
      _jspx_th_portlet_actionURL_0.setParent(null);
      _jspx_th_portlet_actionURL_0.setName("unsubscribe");
      _jspx_th_portlet_actionURL_0.setVar("unsubscribeURL");
      int _jspx_eval_portlet_actionURL_0 = _jspx_th_portlet_actionURL_0.doStartTag();
      if (_jspx_eval_portlet_actionURL_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        //  portlet:param
        com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
        _jspx_th_portlet_param_0.setPageContext(_jspx_page_context);
        _jspx_th_portlet_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_0);
        _jspx_th_portlet_param_0.setName("redirect");
        _jspx_th_portlet_param_0.setValue( currentURL );
        int _jspx_eval_portlet_param_0 = _jspx_th_portlet_param_0.doStartTag();
        if (_jspx_th_portlet_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_0);
          _jspx_th_portlet_param_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_0);
        _jspx_th_portlet_param_0.release();
        out.write("\n");
        out.write("\t\t\t\t\t");
      }
      if (_jspx_th_portlet_actionURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_0);
        _jspx_th_portlet_actionURL_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_0);
      _jspx_th_portlet_actionURL_0.release();
      java.lang.String unsubscribeURL = null;
      unsubscribeURL = (java.lang.String) _jspx_page_context.findAttribute("unsubscribeURL");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t");
      //  clay:link
      com.liferay.frontend.taglib.clay.servlet.taglib.LinkTag _jspx_th_clay_link_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.LinkTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.LinkTag();
      _jspx_th_clay_link_1.setPageContext(_jspx_page_context);
      _jspx_th_clay_link_1.setParent(null);
      _jspx_th_clay_link_1.setDisplayType("secondary");
      _jspx_th_clay_link_1.setHref( unsubscribeURL );
      _jspx_th_clay_link_1.setLabel("unsubscribe");
      _jspx_th_clay_link_1.setSmall( true );
      _jspx_th_clay_link_1.setType("button");
      int _jspx_eval_clay_link_1 = _jspx_th_clay_link_1.doStartTag();
      if (_jspx_th_clay_link_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_link_1);
        _jspx_th_clay_link_1.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_link_1);
      _jspx_th_clay_link_1.release();
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
}
else {
      out.write("\n");
      out.write("\t\t\t\t\t");
      //  portlet:actionURL
      com.liferay.taglib.portlet.ActionURLTag _jspx_th_portlet_actionURL_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ActionURLTag.class) : new com.liferay.taglib.portlet.ActionURLTag();
      _jspx_th_portlet_actionURL_1.setPageContext(_jspx_page_context);
      _jspx_th_portlet_actionURL_1.setParent(null);
      _jspx_th_portlet_actionURL_1.setName("subscribe");
      _jspx_th_portlet_actionURL_1.setVar("subscribeURL");
      int _jspx_eval_portlet_actionURL_1 = _jspx_th_portlet_actionURL_1.doStartTag();
      if (_jspx_eval_portlet_actionURL_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        //  portlet:param
        com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
        _jspx_th_portlet_param_1.setPageContext(_jspx_page_context);
        _jspx_th_portlet_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_1);
        _jspx_th_portlet_param_1.setName("redirect");
        _jspx_th_portlet_param_1.setValue( currentURL );
        int _jspx_eval_portlet_param_1 = _jspx_th_portlet_param_1.doStartTag();
        if (_jspx_th_portlet_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_1);
          _jspx_th_portlet_param_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_1);
        _jspx_th_portlet_param_1.release();
        out.write("\n");
        out.write("\t\t\t\t\t");
      }
      if (_jspx_th_portlet_actionURL_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_1);
        _jspx_th_portlet_actionURL_1.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_1);
      _jspx_th_portlet_actionURL_1.release();
      java.lang.String subscribeURL = null;
      subscribeURL = (java.lang.String) _jspx_page_context.findAttribute("subscribeURL");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t");
      //  clay:link
      com.liferay.frontend.taglib.clay.servlet.taglib.LinkTag _jspx_th_clay_link_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.LinkTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.LinkTag();
      _jspx_th_clay_link_2.setPageContext(_jspx_page_context);
      _jspx_th_clay_link_2.setParent(null);
      _jspx_th_clay_link_2.setDisplayType("secondary");
      _jspx_th_clay_link_2.setHref( subscribeURL );
      _jspx_th_clay_link_2.setLabel("subscribe");
      _jspx_th_clay_link_2.setSmall( true );
      _jspx_th_clay_link_2.setType("button");
      int _jspx_eval_clay_link_2 = _jspx_th_clay_link_2.doStartTag();
      if (_jspx_th_clay_link_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_link_2);
        _jspx_th_clay_link_2.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_link_2);
      _jspx_th_clay_link_2.release();
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\t\t");
}
      out.write("\n");
      out.write("\t</div>\n");
}
      out.write('\n');
      out.write('\n');
if (
 assetPublisherDisplayContext.isShowMetadataDescriptions() ) {
      out.write('\n');
      out.write('	');
      //  liferay-asset:categorization-filter
      com.liferay.asset.taglib.servlet.taglib.CategorizationFilterTag _jspx_th_liferay$1asset_categorization$1filter_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.asset.taglib.servlet.taglib.CategorizationFilterTag.class) : new com.liferay.asset.taglib.servlet.taglib.CategorizationFilterTag();
      _jspx_th_liferay$1asset_categorization$1filter_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1asset_categorization$1filter_0.setParent(null);
      _jspx_th_liferay$1asset_categorization$1filter_0.setAssetType("content");
      _jspx_th_liferay$1asset_categorization$1filter_0.setGroupIds( assetPublisherDisplayContext.getGroupIds() );
      _jspx_th_liferay$1asset_categorization$1filter_0.setPortletURL( assetPublisherDisplayContext.getPortletURL() );
      int _jspx_eval_liferay$1asset_categorization$1filter_0 = _jspx_th_liferay$1asset_categorization$1filter_0.doStartTag();
      if (_jspx_th_liferay$1asset_categorization$1filter_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1asset_categorization$1filter_0);
        _jspx_th_liferay$1asset_categorization$1filter_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1asset_categorization$1filter_0);
      _jspx_th_liferay$1asset_categorization$1filter_0.release();
      out.write('\n');
}
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('	');
if (
 ListUtil.isNotEmpty(assetPublisherDisplayContext.getAssetEntryResults()) ) {
      out.write("\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t\t");
if (
 ArrayUtil.contains(assetPublisherDisplayContext.getDisplayStyles(), assetPublisherDisplayContext.getDisplayStyle()) || StringUtil.startsWith(assetPublisherDisplayContext.getDisplayStyle(), PortletDisplayTemplateManager.DISPLAY_STYLE_PREFIX) ) {
      out.write("\n");
      out.write("\t\t\t\t");
      //  liferay-util:include
      com.liferay.taglib.util.IncludeTag _jspx_th_liferay$1util_include_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.IncludeTag.class) : new com.liferay.taglib.util.IncludeTag();
      _jspx_th_liferay$1util_include_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1util_include_0.setParent(null);
      _jspx_th_liferay$1util_include_0.setPage("/view_asset_entry_list.jsp");
      _jspx_th_liferay$1util_include_0.setServletContext( application );
      int _jspx_eval_liferay$1util_include_0 = _jspx_th_liferay$1util_include_0.doStartTag();
      if (_jspx_th_liferay$1util_include_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_include_0);
        _jspx_th_liferay$1util_include_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_include_0);
      _jspx_th_liferay$1util_include_0.release();
      out.write("\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t");
}
else {
      out.write("\n");
      out.write("\t\t\t\t");
      //  liferay-ui:message
      com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
      _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_message_0.setParent(null);
      _jspx_th_liferay$1ui_message_0.setArguments( assetPublisherDisplayContext.getDisplayStyle() );
      _jspx_th_liferay$1ui_message_0.setEscape( true );
      _jspx_th_liferay$1ui_message_0.setKey("x-is-not-a-display-type");
      int _jspx_eval_liferay$1ui_message_0 = _jspx_th_liferay$1ui_message_0.doStartTag();
      if (_jspx_th_liferay$1ui_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
        _jspx_th_liferay$1ui_message_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
      _jspx_th_liferay$1ui_message_0.release();
      out.write("\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t");
}
      out.write('\n');
      out.write('	');
      out.write('\n');
      out.write('	');
}
else {
      out.write("\n");
      out.write("\t\t");
      //  liferay-ddm:template-renderer
      com.liferay.dynamic.data.mapping.taglib.servlet.taglib.TemplateRendererTag _jspx_th_liferay$1ddm_template$1renderer_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.dynamic.data.mapping.taglib.servlet.taglib.TemplateRendererTag.class) : new com.liferay.dynamic.data.mapping.taglib.servlet.taglib.TemplateRendererTag();
      _jspx_th_liferay$1ddm_template$1renderer_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ddm_template$1renderer_0.setParent(null);
      _jspx_th_liferay$1ddm_template$1renderer_0.setClassName( AssetEntry.class.getName() );
      _jspx_th_liferay$1ddm_template$1renderer_0.setDisplayStyle( assetPublisherDisplayContext.getDisplayStyle() );
      _jspx_th_liferay$1ddm_template$1renderer_0.setDisplayStyleGroupId( assetPublisherDisplayContext.getDisplayStyleGroupId() );
      _jspx_th_liferay$1ddm_template$1renderer_0.setEntries( new ArrayList<AssetEntry>() );
      int _jspx_eval_liferay$1ddm_template$1renderer_0 = _jspx_th_liferay$1ddm_template$1renderer_0.doStartTag();
      if (_jspx_eval_liferay$1ddm_template$1renderer_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t");

			Map<Long, List<AssetPublisherAddItemHolder>> scopeAssetPublisherAddItemHolders = assetPublisherDisplayContext.getScopeAssetPublisherAddItemHolders(1);
			
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t");
if (
 portletName.equals(AssetPublisherPortletKeys.RELATED_ASSETS) || (MapUtil.isEmpty(scopeAssetPublisherAddItemHolders) && !((assetPublisherDisplayContext.getAssetCategoryId() > 0) || Validator.isNotNull(assetPublisherDisplayContext.getAssetTagName()))) ) {
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t");

				renderRequest.setAttribute(WebKeys.PORTLET_CONFIGURATOR_VISIBILITY, Boolean.TRUE);
				
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t");
}
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t<div class=\"alert alert-info text-center\">\n");
        out.write("\t\t\t\t");
        out.write("\n");
        out.write("\t\t\t\t\t");
if (
 assetPublisherDisplayContext.isSelectionStyleAssetList() && (assetPublisherDisplayContext.fetchAssetListEntry() == null) && Validator.isNull(assetPublisherDisplayContext.getInfoListProviderKey()) && !portletName.equals(AssetPublisherPortletKeys.RELATED_ASSETS) ) {
        out.write("\n");
        out.write("\t\t\t\t\t\t<div>\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_liferay$1ui_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ddm_template$1renderer_0, _jspx_page_context))
          return;
        out.write("\n");
        out.write("\t\t\t\t\t\t</div>\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t<div>\n");
        out.write("\t\t\t\t\t\t\t");
        //  aui:a
        com.liferay.taglib.aui.ATag _jspx_th_aui_a_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ATag.class) : new com.liferay.taglib.aui.ATag();
        _jspx_th_aui_a_0.setPageContext(_jspx_page_context);
        _jspx_th_aui_a_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ddm_template$1renderer_0);
        _jspx_th_aui_a_0.setHref("javascript:void(0);");
        _jspx_th_aui_a_0.setOnClick( portletDisplay.getURLConfigurationJS() );
        int _jspx_eval_aui_a_0 = _jspx_th_aui_a_0.doStartTag();
        if (_jspx_eval_aui_a_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          if (_jspx_meth_liferay$1ui_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_a_0, _jspx_page_context))
            return;
        }
        if (_jspx_th_aui_a_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_0);
          _jspx_th_aui_a_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_0);
        _jspx_th_aui_a_0.release();
        out.write("\n");
        out.write("\t\t\t\t\t\t</div>\n");
        out.write("\t\t\t\t\t");
        out.write("\n");
        out.write("\t\t\t\t\t");
}
else if (
 !portletName.equals(AssetPublisherPortletKeys.RELATED_ASSETS) ) {
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_liferay$1ui_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ddm_template$1renderer_0, _jspx_page_context))
          return;
        out.write("\n");
        out.write("\t\t\t\t\t");
        out.write("\n");
        out.write("\t\t\t\t\t");
}
else {
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_liferay$1ui_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ddm_template$1renderer_0, _jspx_page_context))
          return;
        out.write("\n");
        out.write("\t\t\t\t\t");
        out.write("\n");
        out.write("\t\t\t\t");
}
        out.write("\n");
        out.write("\t\t\t</div>\n");
        out.write("\t\t");
      }
      if (_jspx_th_liferay$1ddm_template$1renderer_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ddm_template$1renderer_0);
        _jspx_th_liferay$1ddm_template$1renderer_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ddm_template$1renderer_0);
      _jspx_th_liferay$1ddm_template$1renderer_0.release();
      out.write('\n');
      out.write('	');
      out.write('\n');
}
      out.write('\n');
      out.write('\n');

SearchContainer<AssetEntry> searchContainer = assetPublisherDisplayContext.getSearchContainer();

      out.write('\n');
      out.write('\n');
if (
 !assetPublisherDisplayContext.isPaginationTypeNone() && (searchContainer.getTotal() > searchContainer.getDelta()) ) {
      out.write('\n');
      out.write('	');
      //  liferay-ui:search-paginator
      com.liferay.taglib.ui.SearchPaginatorTag _jspx_th_liferay$1ui_search$1paginator_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchPaginatorTag.class) : new com.liferay.taglib.ui.SearchPaginatorTag();
      _jspx_th_liferay$1ui_search$1paginator_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_search$1paginator_0.setParent(null);
      _jspx_th_liferay$1ui_search$1paginator_0.setSearchContainer( searchContainer );
      _jspx_th_liferay$1ui_search$1paginator_0.setType( assetPublisherDisplayContext.getPaginationType() );
      int _jspx_eval_liferay$1ui_search$1paginator_0 = _jspx_th_liferay$1ui_search$1paginator_0.doStartTag();
      if (_jspx_th_liferay$1ui_search$1paginator_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1paginator_0);
        _jspx_th_liferay$1ui_search$1paginator_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1paginator_0);
      _jspx_th_liferay$1ui_search$1paginator_0.release();
      out.write('\n');
}
      out.write('\n');
      out.write('\n');
      //  aui:script
      com.liferay.taglib.aui.ScriptTag _jspx_th_aui_script_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ScriptTag.class) : new com.liferay.taglib.aui.ScriptTag();
      _jspx_th_aui_script_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_script_0.setParent(null);
      _jspx_th_aui_script_0.setSandbox( true );
      int _jspx_eval_aui_script_0 = _jspx_th_aui_script_0.doStartTag();
      if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_aui_script_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_aui_script_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\tvar assetEntryId =\n");
          out.write("\t\t'");
          out.print( HtmlUtil.escape(assetPublisherDisplayContext.getAssetEntryId()) );
          out.write("';\n");
          out.write("\n");
          out.write("\tif (assetEntryId) {\n");
          out.write("\t\twindow.location.hash = assetEntryId;\n");
          out.write("\t}\n");
          int evalDoAfterBody = _jspx_th_aui_script_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_aui_script_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_script_0);
        _jspx_th_aui_script_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_script_0);
      _jspx_th_aui_script_0.release();
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

  private boolean _jspx_meth_liferay$1ui_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ddm_template$1renderer_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ddm_template$1renderer_0);
    _jspx_th_liferay$1ui_message_1.setKey("this-application-is-not-visible-to-users-yet");
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

  private boolean _jspx_meth_liferay$1ui_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_a_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_2.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_a_0);
    _jspx_th_liferay$1ui_message_2.setKey("select-a-collection-to-make-it-visible");
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

  private boolean _jspx_meth_liferay$1ui_message_3(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ddm_template$1renderer_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_3.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ddm_template$1renderer_0);
    _jspx_th_liferay$1ui_message_3.setKey("there-are-no-results");
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

  private boolean _jspx_meth_liferay$1ui_message_4(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ddm_template$1renderer_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_4.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ddm_template$1renderer_0);
    _jspx_th_liferay$1ui_message_4.setKey("there-are-no-related-assets");
    int _jspx_eval_liferay$1ui_message_4 = _jspx_th_liferay$1ui_message_4.doStartTag();
    if (_jspx_th_liferay$1ui_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_4);
      _jspx_th_liferay$1ui_message_4.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_4);
    _jspx_th_liferay$1ui_message_4.release();
    return false;
  }
}
