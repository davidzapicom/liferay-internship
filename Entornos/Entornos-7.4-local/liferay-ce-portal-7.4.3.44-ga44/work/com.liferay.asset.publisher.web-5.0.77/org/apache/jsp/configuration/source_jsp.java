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

public final class source_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write('\n');
      out.write('\n');

List<AssetRendererFactory<?>> classTypesAssetRendererFactories = (List<AssetRendererFactory<?>>)request.getAttribute("configuration.jsp-classTypesAssetRendererFactories");
List<Map<String, Object>> classTypesList = new ArrayList<>();

      out.write('\n');
      out.write('\n');
      //  liferay-frontend:fieldset-group
      com.liferay.frontend.taglib.servlet.taglib.FieldsetGroupTag _jspx_th_liferay$1frontend_fieldset$1group_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.FieldsetGroupTag.class) : new com.liferay.frontend.taglib.servlet.taglib.FieldsetGroupTag();
      _jspx_th_liferay$1frontend_fieldset$1group_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1frontend_fieldset$1group_0.setParent(null);
      int _jspx_eval_liferay$1frontend_fieldset$1group_0 = _jspx_th_liferay$1frontend_fieldset$1group_0.doStartTag();
      if (_jspx_eval_liferay$1frontend_fieldset$1group_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write('\n');
        out.write('	');
        //  liferay-frontend:fieldset
        com.liferay.frontend.taglib.servlet.taglib.FieldsetTag _jspx_th_liferay$1frontend_fieldset_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.FieldsetTag.class) : new com.liferay.frontend.taglib.servlet.taglib.FieldsetTag();
        _jspx_th_liferay$1frontend_fieldset_0.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1frontend_fieldset_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset$1group_0);
        _jspx_th_liferay$1frontend_fieldset_0.setCssClass("source-container");
        int _jspx_eval_liferay$1frontend_fieldset_0 = _jspx_th_liferay$1frontend_fieldset_0.doStartTag();
        if (_jspx_eval_liferay$1frontend_fieldset_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\n");
          out.write("\t\t");

		Set<Long> availableClassNameIdsSet = SetUtil.fromArray(assetPublisherDisplayContext.getAvailableClassNameIds());

		// Left list

		List<KeyValuePair> typesLeftList = new ArrayList<KeyValuePair>();

		long[] classNameIds = assetPublisherDisplayContext.getClassNameIds();

		for (long classNameId : classNameIds) {
			typesLeftList.add(new KeyValuePair(String.valueOf(classNameId), ResourceActionsUtil.getModelResource(locale, PortalUtil.getClassName(classNameId))));
		}

		// Right list

		List<KeyValuePair> typesRightList = new ArrayList<KeyValuePair>();

		Arrays.sort(classNameIds);
		
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  aui:select
          com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.SelectTag.class) : new com.liferay.taglib.aui.SelectTag();
          _jspx_th_aui_select_0.setPageContext(_jspx_page_context);
          _jspx_th_aui_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
          _jspx_th_aui_select_0.setLabel("asset-type");
          _jspx_th_aui_select_0.setName("preferences--anyAssetType--");
          _jspx_th_aui_select_0.setTitle("asset-type");
          int _jspx_eval_aui_select_0 = _jspx_th_aui_select_0.doStartTag();
          if (_jspx_eval_aui_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_aui_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_aui_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_aui_select_0.doInitBody();
            }
            do {
              out.write("\n");
              out.write("\t\t\t");
              //  aui:option
              com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
              _jspx_th_aui_option_0.setPageContext(_jspx_page_context);
              _jspx_th_aui_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
              _jspx_th_aui_option_0.setLabel(new String("any"));
              _jspx_th_aui_option_0.setSelected( assetPublisherDisplayContext.isAnyAssetType() );
              _jspx_th_aui_option_0.setValue( true );
              int _jspx_eval_aui_option_0 = _jspx_th_aui_option_0.doStartTag();
              if (_jspx_th_aui_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_0);
                _jspx_th_aui_option_0.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_0);
              _jspx_th_aui_option_0.release();
              out.write("\n");
              out.write("\t\t\t");
              //  aui:option
              com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
              _jspx_th_aui_option_1.setPageContext(_jspx_page_context);
              _jspx_th_aui_option_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
              _jspx_th_aui_option_1.setLabel( LanguageUtil.get(request, "select-more-than-one") + StringPool.TRIPLE_PERIOD );
              _jspx_th_aui_option_1.setSelected( !assetPublisherDisplayContext.isAnyAssetType() && (classNameIds.length > 1) );
              _jspx_th_aui_option_1.setValue(new String("select-more-than-one"));
              int _jspx_eval_aui_option_1 = _jspx_th_aui_option_1.doStartTag();
              if (_jspx_th_aui_option_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_1);
                _jspx_th_aui_option_1.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_1);
              _jspx_th_aui_option_1.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t<optgroup label=\"");
              if (_jspx_meth_liferay$1ui_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_select_0, _jspx_page_context))
                return;
              out.write("\">\n");
              out.write("\n");
              out.write("\t\t\t\t");

				for (long classNameId : availableClassNameIdsSet) {
					ClassName className = ClassNameLocalServiceUtil.getClassName(classNameId);

					if (Arrays.binarySearch(classNameIds, classNameId) < 0) {
						typesRightList.add(new KeyValuePair(String.valueOf(classNameId), ResourceActionsUtil.getModelResource(locale, className.getValue())));
					}
				
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t");
              //  aui:option
              com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
              _jspx_th_aui_option_2.setPageContext(_jspx_page_context);
              _jspx_th_aui_option_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
              _jspx_th_aui_option_2.setLabel( ResourceActionsUtil.getModelResource(locale, className.getValue()) );
              _jspx_th_aui_option_2.setSelected( (classNameIds.length == 1) && (classNameId == classNameIds[0]) );
              _jspx_th_aui_option_2.setValue( classNameId );
              int _jspx_eval_aui_option_2 = _jspx_th_aui_option_2.doStartTag();
              if (_jspx_th_aui_option_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_2);
                _jspx_th_aui_option_2.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_2);
              _jspx_th_aui_option_2.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t");

				}
				
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t</optgroup>\n");
              out.write("\t\t");
              int evalDoAfterBody = _jspx_th_aui_select_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_aui_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_aui_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_select_0);
            _jspx_th_aui_select_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_select_0);
          _jspx_th_aui_select_0.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          if (_jspx_meth_aui_input_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1frontend_fieldset_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\n");
          out.write("\t\t");

		typesRightList = ListUtil.sort(typesRightList, new KeyValuePairComparator(false, true));
		
          out.write("\n");
          out.write("\n");
          out.write("\t\t<div class=\"");
          out.print( assetPublisherDisplayContext.isAnyAssetType() ? "hide" : "" );
          out.write("\" id=\"");
          if (_jspx_meth_portlet_namespace_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1frontend_fieldset_0, _jspx_page_context))
            return;
          out.write("classNamesBoxes\">\n");
          out.write("\t\t\t");
          //  liferay-ui:input-move-boxes
          com.liferay.taglib.ui.InputMoveBoxesTag _jspx_th_liferay$1ui_input$1move$1boxes_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.InputMoveBoxesTag.class) : new com.liferay.taglib.ui.InputMoveBoxesTag();
          _jspx_th_liferay$1ui_input$1move$1boxes_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_input$1move$1boxes_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
          _jspx_th_liferay$1ui_input$1move$1boxes_0.setLeftBoxName("currentClassNameIds");
          _jspx_th_liferay$1ui_input$1move$1boxes_0.setLeftList( typesLeftList );
          _jspx_th_liferay$1ui_input$1move$1boxes_0.setLeftReorder( Boolean.TRUE.toString() );
          _jspx_th_liferay$1ui_input$1move$1boxes_0.setLeftTitle("selected");
          _jspx_th_liferay$1ui_input$1move$1boxes_0.setRightBoxName("availableClassNameIds");
          _jspx_th_liferay$1ui_input$1move$1boxes_0.setRightList( typesRightList );
          _jspx_th_liferay$1ui_input$1move$1boxes_0.setRightTitle("available");
          int _jspx_eval_liferay$1ui_input$1move$1boxes_0 = _jspx_th_liferay$1ui_input$1move$1boxes_0.doStartTag();
          if (_jspx_th_liferay$1ui_input$1move$1boxes_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_input$1move$1boxes_0);
            _jspx_th_liferay$1ui_input$1move$1boxes_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_input$1move$1boxes_0);
          _jspx_th_liferay$1ui_input$1move$1boxes_0.release();
          out.write("\n");
          out.write("\t\t</div>\n");
          out.write("\n");
          out.write("\t\t");

		List<AssetRendererFactory<?>> assetRendererFactories = ListUtil.sort(AssetRendererFactoryRegistryUtil.getAssetRendererFactories(company.getCompanyId()), new AssetRendererFactoryTypeNameComparator(locale));

		for (AssetRendererFactory<?> assetRendererFactory : assetRendererFactories) {
			ClassTypeReader classTypeReader = assetRendererFactory.getClassTypeReader();

			List<ClassType> classTypes = classTypeReader.getAvailableClassTypes(assetPublisherDisplayContext.getReferencedModelsGroupIds(), locale);

			if (classTypes.isEmpty()) {
				continue;
			}

			classTypesAssetRendererFactories.add(assetRendererFactory);

			String className = assetPublisherWebHelper.getClassName(assetRendererFactory);

			Long[] assetSelectedClassTypeIds = assetPublisherWebHelper.getClassTypeIds(portletPreferences, className, classTypes);

			// Left list

			List<KeyValuePair> subtypesLeftList = new ArrayList<KeyValuePair>();

			for (long subtypeId : assetSelectedClassTypeIds) {
				try {
					ClassType classType = classTypeReader.getClassType(subtypeId, locale);

					subtypesLeftList.add(new KeyValuePair(String.valueOf(subtypeId), HtmlUtil.escape(classType.getName())));
				}
				catch (NoSuchModelException nsme) {
				}
			}

			Arrays.sort(assetSelectedClassTypeIds);

			// Right list

			List<KeyValuePair> subtypesRightList = new ArrayList<KeyValuePair>();

			boolean anyAssetSubtype = GetterUtil.getBoolean(portletPreferences.getValue("anyClassType" + className, Boolean.TRUE.toString()));
		
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t<div class='asset-subtype ");
          out.print( (assetSelectedClassTypeIds.length < 1) ? StringPool.BLANK : "hide" );
          out.write("' id=\"");
          if (_jspx_meth_portlet_namespace_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1frontend_fieldset_0, _jspx_page_context))
            return;
          out.print( className );
          out.write("Options\">\n");
          out.write("\t\t\t\t");
          //  aui:select
          com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.SelectTag.class) : new com.liferay.taglib.aui.SelectTag();
          _jspx_th_aui_select_1.setPageContext(_jspx_page_context);
          _jspx_th_aui_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
          _jspx_th_aui_select_1.setLabel( ResourceActionsUtil.getModelResource(locale, assetRendererFactory.getClassName()) + StringPool.SPACE + assetRendererFactory.getSubtypeTitle(themeDisplay.getLocale()) );
          _jspx_th_aui_select_1.setName( "preferences--anyClassType" + className + "--" );
          int _jspx_eval_aui_select_1 = _jspx_th_aui_select_1.doStartTag();
          if (_jspx_eval_aui_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_aui_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_aui_select_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_aui_select_1.doInitBody();
            }
            do {
              out.write("\n");
              out.write("\t\t\t\t\t");
              //  aui:option
              com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
              _jspx_th_aui_option_3.setPageContext(_jspx_page_context);
              _jspx_th_aui_option_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_1);
              _jspx_th_aui_option_3.setLabel(new String("any"));
              _jspx_th_aui_option_3.setSelected( anyAssetSubtype );
              _jspx_th_aui_option_3.setValue( true );
              int _jspx_eval_aui_option_3 = _jspx_th_aui_option_3.doStartTag();
              if (_jspx_th_aui_option_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_3);
                _jspx_th_aui_option_3.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_3);
              _jspx_th_aui_option_3.release();
              out.write("\n");
              out.write("\t\t\t\t\t");
              //  aui:option
              com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
              _jspx_th_aui_option_4.setPageContext(_jspx_page_context);
              _jspx_th_aui_option_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_1);
              _jspx_th_aui_option_4.setLabel( LanguageUtil.get(request, "select-more-than-one") + StringPool.TRIPLE_PERIOD );
              _jspx_th_aui_option_4.setSelected( !anyAssetSubtype && (assetSelectedClassTypeIds.length > 1) );
              _jspx_th_aui_option_4.setValue(new String("select-more-than-one"));
              int _jspx_eval_aui_option_4 = _jspx_th_aui_option_4.doStartTag();
              if (_jspx_th_aui_option_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_4);
                _jspx_th_aui_option_4.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_4);
              _jspx_th_aui_option_4.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t<optgroup label=\"");
              out.print( assetRendererFactory.getSubtypeTitle(themeDisplay.getLocale()) );
              out.write("\">\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t");

						for (ClassType classType : classTypes) {
							if (Arrays.binarySearch(assetSelectedClassTypeIds, classType.getClassTypeId()) < 0) {
								subtypesRightList.add(new KeyValuePair(String.valueOf(classType.getClassTypeId()), HtmlUtil.escape(classType.getName())));
							}
						
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  aui:option
              com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
              _jspx_th_aui_option_5.setPageContext(_jspx_page_context);
              _jspx_th_aui_option_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_1);
              _jspx_th_aui_option_5.setLabel( HtmlUtil.escapeAttribute(classType.getName()) );
              _jspx_th_aui_option_5.setSelected( !anyAssetSubtype && (assetSelectedClassTypeIds.length == 1) && (assetSelectedClassTypeIds[0]).equals(classType.getClassTypeId()) );
              _jspx_th_aui_option_5.setValue( classType.getClassTypeId() );
              int _jspx_eval_aui_option_5 = _jspx_th_aui_option_5.doStartTag();
              if (_jspx_th_aui_option_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_5);
                _jspx_th_aui_option_5.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_5);
              _jspx_th_aui_option_5.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t");

						}
						
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t</optgroup>\n");
              out.write("\t\t\t\t");
              int evalDoAfterBody = _jspx_th_aui_select_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_aui_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_aui_select_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_select_1);
            _jspx_th_aui_select_1.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_select_1);
          _jspx_th_aui_select_1.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t");
          //  aui:input
          com.liferay.taglib.aui.InputTag _jspx_th_aui_input_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
          _jspx_th_aui_input_1.setPageContext(_jspx_page_context);
          _jspx_th_aui_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
          _jspx_th_aui_input_1.setName( "preferences--classTypeIds" + className + "--" );
          _jspx_th_aui_input_1.setType("hidden");
          int _jspx_eval_aui_input_1 = _jspx_th_aui_input_1.doStartTag();
          if (_jspx_th_aui_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_1);
            _jspx_th_aui_input_1.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_1);
          _jspx_th_aui_input_1.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t");
if (
 assetPublisherDisplayContext.isShowSubtypeFieldsFilter() ) {
          out.write("\n");
          out.write("\t\t\t\t\t<div class=\"asset-subtypefields-wrapper-enable hide\" id=\"");
          if (_jspx_meth_portlet_namespace_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1frontend_fieldset_0, _jspx_page_context))
            return;
          out.print( className );
          out.write("subtypeFieldsFilterEnableWrapper\">\n");
          out.write("\t\t\t\t\t\t");
          //  aui:input
          com.liferay.taglib.aui.InputTag _jspx_th_aui_input_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
          _jspx_th_aui_input_2.setPageContext(_jspx_page_context);
          _jspx_th_aui_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
          _jspx_th_aui_input_2.setInlineLabel("right");
          _jspx_th_aui_input_2.setLabel("filter-by-field");
          _jspx_th_aui_input_2.setLabelCssClass("simple-toggle-switch");
          _jspx_th_aui_input_2.setName( "preferences--subtypeFieldsFilterEnabled" + className + "--" );
          _jspx_th_aui_input_2.setType("toggle-switch");
          _jspx_th_aui_input_2.setValue( assetPublisherDisplayContext.isSubtypeFieldsFilterEnabled() );
          int _jspx_eval_aui_input_2 = _jspx_th_aui_input_2.doStartTag();
          if (_jspx_th_aui_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_2);
            _jspx_th_aui_input_2.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_2);
          _jspx_th_aui_input_2.release();
          out.write("\n");
          out.write("\t\t\t\t\t</div>\n");
          out.write("\n");
          out.write("\t\t\t\t\t<span class=\"asset-subtypefields-message\" id=\"");
          if (_jspx_meth_portlet_namespace_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1frontend_fieldset_0, _jspx_page_context))
            return;
          out.print( className );
          out.write("ddmStructureFieldMessage\">\n");
          out.write("\t\t\t\t\t\t");
if (
 Validator.isNotNull(assetPublisherDisplayContext.getDDMStructureFieldLabel()) && (classNameIds[0] == PortalUtil.getClassNameId(assetRendererFactory.getClassName())) ) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
          out.print( HtmlUtil.escape(assetPublisherDisplayContext.getDDMStructureFieldLabel()) + ": " + HtmlUtil.escape(assetPublisherDisplayContext.getDDMStructureDisplayFieldValue()) );
          out.write("\n");
          out.write("\t\t\t\t\t\t");
}
          out.write("\n");
          out.write("\t\t\t\t\t</span>\n");
          out.write("\n");
          out.write("\t\t\t\t\t<div class=\"asset-subtypefields-wrapper hide\" id=\"");
          if (_jspx_meth_portlet_namespace_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1frontend_fieldset_0, _jspx_page_context))
            return;
          out.print( className );
          out.write("subtypeFieldsWrapper\">\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t");

						for (ClassType classType : classTypes) {
							if (classType.getClassTypeFieldsCount() == 0) {
								continue;
							}
						
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t<span class=\"asset-subtypefields hide\" id=\"");
          if (_jspx_meth_portlet_namespace_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1frontend_fieldset_0, _jspx_page_context))
            return;
          out.print( classType.getClassTypeId() );
          out.write('_');
          out.print( className );
          out.write("Options\">\n");
          out.write("\t\t\t\t\t\t\t\t");
          //  liferay-portlet:renderURL
          com.liferay.taglib.portlet.RenderURLTag _jspx_th_liferay$1portlet_renderURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.RenderURLTag.class) : new com.liferay.taglib.portlet.RenderURLTag();
          _jspx_th_liferay$1portlet_renderURL_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1portlet_renderURL_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
          _jspx_th_liferay$1portlet_renderURL_0.setPortletName( assetPublisherDisplayContext.getPortletResource() );
          _jspx_th_liferay$1portlet_renderURL_0.setVar("selectStructureFieldURL");
          _jspx_th_liferay$1portlet_renderURL_0.setWindowState( LiferayWindowState.POP_UP.toString() );
          int _jspx_eval_liferay$1portlet_renderURL_0 = _jspx_th_liferay$1portlet_renderURL_0.doStartTag();
          if (_jspx_eval_liferay$1portlet_renderURL_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t");
            if (_jspx_meth_portlet_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1portlet_renderURL_0, _jspx_page_context))
              return;
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t");
            //  portlet:param
            com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
            _jspx_th_portlet_param_1.setPageContext(_jspx_page_context);
            _jspx_th_portlet_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1portlet_renderURL_0);
            _jspx_th_portlet_param_1.setName("portletResource");
            _jspx_th_portlet_param_1.setValue( HtmlUtil.escapeJS(assetPublisherDisplayContext.getPortletResource()) );
            int _jspx_eval_portlet_param_1 = _jspx_th_portlet_param_1.doStartTag();
            if (_jspx_th_portlet_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_1);
              _jspx_th_portlet_param_1.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_1);
            _jspx_th_portlet_param_1.release();
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t");
            //  portlet:param
            com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
            _jspx_th_portlet_param_2.setPageContext(_jspx_page_context);
            _jspx_th_portlet_param_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1portlet_renderURL_0);
            _jspx_th_portlet_param_2.setName("className");
            _jspx_th_portlet_param_2.setValue( assetRendererFactory.getClassName() );
            int _jspx_eval_portlet_param_2 = _jspx_th_portlet_param_2.doStartTag();
            if (_jspx_th_portlet_param_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_2);
              _jspx_th_portlet_param_2.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_2);
            _jspx_th_portlet_param_2.release();
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t");
            //  portlet:param
            com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
            _jspx_th_portlet_param_3.setPageContext(_jspx_page_context);
            _jspx_th_portlet_param_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1portlet_renderURL_0);
            _jspx_th_portlet_param_3.setName("classTypeId");
            _jspx_th_portlet_param_3.setValue( String.valueOf(classType.getClassTypeId()) );
            int _jspx_eval_portlet_param_3 = _jspx_th_portlet_param_3.doStartTag();
            if (_jspx_th_portlet_param_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_3);
              _jspx_th_portlet_param_3.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_3);
            _jspx_th_portlet_param_3.release();
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t");
            //  portlet:param
            com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
            _jspx_th_portlet_param_4.setPageContext(_jspx_page_context);
            _jspx_th_portlet_param_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1portlet_renderURL_0);
            _jspx_th_portlet_param_4.setName("eventName");
            _jspx_th_portlet_param_4.setValue( liferayPortletResponse.getNamespace() + "selectDDMStructureField" );
            int _jspx_eval_portlet_param_4 = _jspx_th_portlet_param_4.doStartTag();
            if (_jspx_th_portlet_param_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_4);
              _jspx_th_portlet_param_4.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_4);
            _jspx_th_portlet_param_4.release();
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t");
          }
          if (_jspx_th_liferay$1portlet_renderURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_renderURL_0);
            _jspx_th_liferay$1portlet_renderURL_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_renderURL_0);
          _jspx_th_liferay$1portlet_renderURL_0.release();
          java.lang.String selectStructureFieldURL = null;
          selectStructureFieldURL = (java.lang.String) _jspx_page_context.findAttribute("selectStructureFieldURL");
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t<span class=\"asset-subtypefields-popup\" id=\"");
          if (_jspx_meth_portlet_namespace_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1frontend_fieldset_0, _jspx_page_context))
            return;
          out.print( classType.getClassTypeId() );
          out.write('_');
          out.print( className );
          out.write("PopUpButton\">\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          //  aui:button
          com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
          _jspx_th_aui_button_0.setPageContext(_jspx_page_context);
          _jspx_th_aui_button_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
          _jspx_th_aui_button_0.setDynamicAttribute(null, "data-href",  selectStructureFieldURL.toString() );
          _jspx_th_aui_button_0.setDisabled( !assetPublisherDisplayContext.isSubtypeFieldsFilterEnabled() );
          _jspx_th_aui_button_0.setValue("select");
          int _jspx_eval_aui_button_0 = _jspx_th_aui_button_0.doStartTag();
          if (_jspx_th_aui_button_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_0);
            _jspx_th_aui_button_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_0);
          _jspx_th_aui_button_0.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</span>\n");
          out.write("\t\t\t\t\t\t\t</span>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t");

						}

						typesRightList = ListUtil.sort(typesRightList, new KeyValuePairComparator(false, true));
						
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t<div class=\"");
          out.print( (assetSelectedClassTypeIds.length > 1) ? StringPool.BLANK : "hide" );
          out.write("\" id=\"");
          if (_jspx_meth_portlet_namespace_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1frontend_fieldset_0, _jspx_page_context))
            return;
          out.print( className );
          out.write("Boxes\">\n");
          out.write("\t\t\t\t\t");
          //  liferay-ui:input-move-boxes
          com.liferay.taglib.ui.InputMoveBoxesTag _jspx_th_liferay$1ui_input$1move$1boxes_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.InputMoveBoxesTag.class) : new com.liferay.taglib.ui.InputMoveBoxesTag();
          _jspx_th_liferay$1ui_input$1move$1boxes_1.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_input$1move$1boxes_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
          _jspx_th_liferay$1ui_input$1move$1boxes_1.setLeftBoxName( className + "currentClassTypeIds" );
          _jspx_th_liferay$1ui_input$1move$1boxes_1.setLeftList( subtypesLeftList );
          _jspx_th_liferay$1ui_input$1move$1boxes_1.setLeftReorder( Boolean.TRUE.toString() );
          _jspx_th_liferay$1ui_input$1move$1boxes_1.setLeftTitle("selected");
          _jspx_th_liferay$1ui_input$1move$1boxes_1.setRightBoxName( className + "availableClassTypeIds" );
          _jspx_th_liferay$1ui_input$1move$1boxes_1.setRightList( subtypesRightList );
          _jspx_th_liferay$1ui_input$1move$1boxes_1.setRightTitle("available");
          int _jspx_eval_liferay$1ui_input$1move$1boxes_1 = _jspx_th_liferay$1ui_input$1move$1boxes_1.doStartTag();
          if (_jspx_th_liferay$1ui_input$1move$1boxes_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_input$1move$1boxes_1);
            _jspx_th_liferay$1ui_input$1move$1boxes_1.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_input$1move$1boxes_1);
          _jspx_th_liferay$1ui_input$1move$1boxes_1.release();
          out.write("\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\t\t\t</div>\n");
          out.write("\n");
          out.write("\t\t");

		}

		for (AssetRendererFactory<?> curRendererFactory : classTypesAssetRendererFactories) {
			ClassTypeReader classTypeReader = curRendererFactory.getClassTypeReader();

			List<ClassType> assetAvailableClassTypes = classTypeReader.getAvailableClassTypes(assetPublisherDisplayContext.getReferencedModelsGroupIds(), locale);

			if (assetAvailableClassTypes.isEmpty()) {
				continue;
			}

			List<Map<String, Object>> classSubtypes = new ArrayList<>();

			for (ClassType classType : assetAvailableClassTypes) {
				List<ClassTypeField> classTypeFields = classType.getClassTypeFields();

				if (classTypeFields.isEmpty()) {
					continue;
				}

				List<Map<String, Object>> classTypeFieldsList = new ArrayList<>();
				String orderByColumn1 = assetPublisherDisplayContext.getOrderByColumn1();
				String orderByColumn2 = assetPublisherDisplayContext.getOrderByColumn2();

				for (ClassTypeField classTypeField : classTypeFields) {
					String value = assetPublisherWebHelper.encodeName(classTypeField.getClassTypeId(), classTypeField.getFieldReference(), null);
					String selectedOrderByColumn1 = StringPool.BLANK;
					String selectedOrderByColumn2 = StringPool.BLANK;

					if (orderByColumn1.equals(value)) {
						selectedOrderByColumn1 = "selected";
					}

					if (orderByColumn2.equals(value)) {
						selectedOrderByColumn2 = "selected";
					}

					classTypeFieldsList.add(
						HashMapBuilder.<String, Object>put(
							"label", HtmlUtil.escape(classTypeField.getLabel())
						).put(
							"selectedOrderByColumn1", selectedOrderByColumn1
						).put(
							"selectedOrderByColumn2", selectedOrderByColumn2
						).put(
							"value", value
						).build());
				}

				classSubtypes.add(
					HashMapBuilder.<String, Object>put(
						"classTypeFields", classTypeFieldsList
					).put(
						"classTypeId", classType.getClassTypeId()
					).put(
						"name", HtmlUtil.escape(classType.getName())
					).build());
			}

			classTypesList.add(
				HashMapBuilder.<String, Object>put(
					"className", assetPublisherWebHelper.getClassName(curRendererFactory)
				).put(
					"classNameId", curRendererFactory.getClassNameId()
				).put(
					"classSubtypes", classSubtypes
				).build());
		}
		
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
if (
 assetPublisherDisplayContext.isShowSubtypeFieldsFilter() ) {
          out.write("\n");
          out.write("\t\t\t<div class=\"asset-subtypefield-selected ");
          out.print( Validator.isNull(assetPublisherDisplayContext.getDDMStructureFieldName()) ? "hide" : StringPool.BLANK );
          out.write("\">\n");
          out.write("\t\t\t\t");
          //  aui:input
          com.liferay.taglib.aui.InputTag _jspx_th_aui_input_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
          _jspx_th_aui_input_3.setPageContext(_jspx_page_context);
          _jspx_th_aui_input_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
          _jspx_th_aui_input_3.setName("preferences--ddmStructureFieldName--");
          _jspx_th_aui_input_3.setType("hidden");
          _jspx_th_aui_input_3.setValue( assetPublisherDisplayContext.getDDMStructureFieldName() );
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
          out.write("\t\t\t\t");
          //  aui:input
          com.liferay.taglib.aui.InputTag _jspx_th_aui_input_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
          _jspx_th_aui_input_4.setPageContext(_jspx_page_context);
          _jspx_th_aui_input_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
          _jspx_th_aui_input_4.setName("preferences--ddmStructureFieldValue--");
          _jspx_th_aui_input_4.setType("hidden");
          _jspx_th_aui_input_4.setValue( assetPublisherDisplayContext.getDDMStructureFieldValue() );
          int _jspx_eval_aui_input_4 = _jspx_th_aui_input_4.doStartTag();
          if (_jspx_th_aui_input_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_4);
            _jspx_th_aui_input_4.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_4);
          _jspx_th_aui_input_4.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t");
          //  aui:input
          com.liferay.taglib.aui.InputTag _jspx_th_aui_input_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
          _jspx_th_aui_input_5.setPageContext(_jspx_page_context);
          _jspx_th_aui_input_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
          _jspx_th_aui_input_5.setName("preferences--ddmStructureDisplayFieldValue--");
          _jspx_th_aui_input_5.setType("hidden");
          _jspx_th_aui_input_5.setValue( assetPublisherDisplayContext.getDDMStructureDisplayFieldValue() );
          int _jspx_eval_aui_input_5 = _jspx_th_aui_input_5.doStartTag();
          if (_jspx_th_aui_input_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_5);
            _jspx_th_aui_input_5.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_5);
          _jspx_th_aui_input_5.release();
          out.write("\n");
          out.write("\t\t\t</div>\n");
          out.write("\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  liferay-frontend:component
          com.liferay.frontend.taglib.servlet.taglib.ComponentTag _jspx_th_liferay$1frontend_component_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.ComponentTag.class) : new com.liferay.frontend.taglib.servlet.taglib.ComponentTag();
          _jspx_th_liferay$1frontend_component_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1frontend_component_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
          _jspx_th_liferay$1frontend_component_0.setComponentId( liferayPortletResponse.getNamespace() + "selectDDMStructureField" );
          _jspx_th_liferay$1frontend_component_0.setContext(
				HashMapBuilder.<String, Object>put(
					"assetPublisherNamespace", HtmlUtil.escapeJS(assetPublisherDisplayContext.getPortletResource())
				).put(
					"classTypes", classTypesList
				).build()
			);
          _jspx_th_liferay$1frontend_component_0.setModule("js/Source");
          int _jspx_eval_liferay$1frontend_component_0 = _jspx_th_liferay$1frontend_component_0.doStartTag();
          if (_jspx_th_liferay$1frontend_component_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_component_0);
            _jspx_th_liferay$1frontend_component_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_component_0);
          _jspx_th_liferay$1frontend_component_0.release();
          out.write('\n');
          out.write('	');
        }
        if (_jspx_th_liferay$1frontend_fieldset_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_fieldset_0);
          _jspx_th_liferay$1frontend_fieldset_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_fieldset_0);
        _jspx_th_liferay$1frontend_fieldset_0.release();
        out.write('\n');
      }
      if (_jspx_th_liferay$1frontend_fieldset$1group_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_fieldset$1group_0);
        _jspx_th_liferay$1frontend_fieldset$1group_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_fieldset$1group_0);
      _jspx_th_liferay$1frontend_fieldset$1group_0.release();
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

  private boolean _jspx_meth_liferay$1ui_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
    _jspx_th_liferay$1ui_message_0.setKey("asset-type");
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

  private boolean _jspx_meth_aui_input_0(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1frontend_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:input
    com.liferay.taglib.aui.InputTag _jspx_th_aui_input_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
    _jspx_th_aui_input_0.setPageContext(_jspx_page_context);
    _jspx_th_aui_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
    _jspx_th_aui_input_0.setName("preferences--classNameIds--");
    _jspx_th_aui_input_0.setType("hidden");
    int _jspx_eval_aui_input_0 = _jspx_th_aui_input_0.doStartTag();
    if (_jspx_th_aui_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_0);
      _jspx_th_aui_input_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_0);
    _jspx_th_aui_input_0.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_0(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1frontend_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_0.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
    int _jspx_eval_portlet_namespace_0 = _jspx_th_portlet_namespace_0.doStartTag();
    if (_jspx_th_portlet_namespace_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_0);
      _jspx_th_portlet_namespace_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_0);
    _jspx_th_portlet_namespace_0.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_1(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1frontend_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_1.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
    int _jspx_eval_portlet_namespace_1 = _jspx_th_portlet_namespace_1.doStartTag();
    if (_jspx_th_portlet_namespace_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_1);
      _jspx_th_portlet_namespace_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_1);
    _jspx_th_portlet_namespace_1.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_2(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1frontend_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_2.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
    int _jspx_eval_portlet_namespace_2 = _jspx_th_portlet_namespace_2.doStartTag();
    if (_jspx_th_portlet_namespace_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_2);
      _jspx_th_portlet_namespace_2.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_2);
    _jspx_th_portlet_namespace_2.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_3(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1frontend_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_3.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
    int _jspx_eval_portlet_namespace_3 = _jspx_th_portlet_namespace_3.doStartTag();
    if (_jspx_th_portlet_namespace_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_3);
      _jspx_th_portlet_namespace_3.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_3);
    _jspx_th_portlet_namespace_3.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_4(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1frontend_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_4.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
    int _jspx_eval_portlet_namespace_4 = _jspx_th_portlet_namespace_4.doStartTag();
    if (_jspx_th_portlet_namespace_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_4);
      _jspx_th_portlet_namespace_4.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_4);
    _jspx_th_portlet_namespace_4.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_5(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1frontend_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_5.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
    int _jspx_eval_portlet_namespace_5 = _jspx_th_portlet_namespace_5.doStartTag();
    if (_jspx_th_portlet_namespace_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_5);
      _jspx_th_portlet_namespace_5.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_5);
    _jspx_th_portlet_namespace_5.release();
    return false;
  }

  private boolean _jspx_meth_portlet_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1portlet_renderURL_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:param
    com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
    _jspx_th_portlet_param_0.setPageContext(_jspx_page_context);
    _jspx_th_portlet_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1portlet_renderURL_0);
    _jspx_th_portlet_param_0.setName("mvcRenderCommandName");
    _jspx_th_portlet_param_0.setValue("/asset_publisher/select_structure_field");
    int _jspx_eval_portlet_param_0 = _jspx_th_portlet_param_0.doStartTag();
    if (_jspx_th_portlet_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_0);
      _jspx_th_portlet_param_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_0);
    _jspx_th_portlet_param_0.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_6(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1frontend_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_6.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
    int _jspx_eval_portlet_namespace_6 = _jspx_th_portlet_namespace_6.doStartTag();
    if (_jspx_th_portlet_namespace_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_6);
      _jspx_th_portlet_namespace_6.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_6);
    _jspx_th_portlet_namespace_6.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_7(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1frontend_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_7.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
    int _jspx_eval_portlet_namespace_7 = _jspx_th_portlet_namespace_7.doStartTag();
    if (_jspx_th_portlet_namespace_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_7);
      _jspx_th_portlet_namespace_7.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_7);
    _jspx_th_portlet_namespace_7.release();
    return false;
  }
}
