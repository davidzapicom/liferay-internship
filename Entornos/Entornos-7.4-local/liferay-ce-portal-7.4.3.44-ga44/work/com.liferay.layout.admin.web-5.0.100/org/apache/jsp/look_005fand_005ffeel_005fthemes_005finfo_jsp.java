package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.asset.kernel.model.AssetVocabularyConstants;
import com.liferay.client.extension.type.item.selector.CETItemSelectorReturnType;
import com.liferay.document.library.kernel.exception.FileSizeException;
import com.liferay.exportimport.kernel.lar.PortletDataHandlerKeys;
import com.liferay.exportimport.kernel.staging.LayoutStagingUtil;
import com.liferay.exportimport.kernel.staging.StagingUtil;
import com.liferay.friendly.url.exception.DuplicateFriendlyURLEntryException;
import com.liferay.frontend.taglib.form.navigator.constants.FormNavigatorConstants;
import com.liferay.layout.admin.constants.LayoutScreenNavigationEntryConstants;
import com.liferay.layout.admin.web.internal.constants.LayoutAdminWebKeys;
import com.liferay.layout.admin.web.internal.display.context.LayoutLookAndFeelDisplayContext;
import com.liferay.layout.admin.web.internal.display.context.LayoutUtilityPageEntryDisplayContext;
import com.liferay.layout.admin.web.internal.display.context.LayoutUtilityPageEntryManagementToolbarDisplayContext;
import com.liferay.layout.admin.web.internal.display.context.LayoutsAdminDisplayContext;
import com.liferay.layout.admin.web.internal.display.context.LayoutsAdminManagementToolbarDisplayContext;
import com.liferay.layout.admin.web.internal.display.context.MillerColumnsDisplayContext;
import com.liferay.layout.admin.web.internal.display.context.OrphanPortletsDisplayContext;
import com.liferay.layout.admin.web.internal.display.context.OrphanPortletsManagementToolbarDisplayContext;
import com.liferay.layout.admin.web.internal.display.context.SelectCollectionManagementToolbarDisplayContext;
import com.liferay.layout.admin.web.internal.display.context.SelectLayoutCollectionDisplayContext;
import com.liferay.layout.admin.web.internal.display.context.SelectLayoutPageTemplateEntryDisplayContext;
import com.liferay.layout.admin.web.internal.display.context.SelectStyleBookEntryDisplayContext;
import com.liferay.layout.admin.web.internal.display.context.SelectThemeDisplayContext;
import com.liferay.layout.admin.web.internal.display.context.SelectThemeManagementToolbarDisplayContext;
import com.liferay.layout.admin.web.internal.frontend.taglib.clay.servlet.taglib.CollectionProvidersVerticalCard;
import com.liferay.layout.admin.web.internal.frontend.taglib.clay.servlet.taglib.CollectionsVerticalCard;
import com.liferay.layout.admin.web.internal.frontend.taglib.clay.servlet.taglib.LayoutUtilityPageEntryVerticalCard;
import com.liferay.layout.admin.web.internal.frontend.taglib.clay.servlet.taglib.SelectBasicTemplatesNavigationCard;
import com.liferay.layout.admin.web.internal.frontend.taglib.clay.servlet.taglib.SelectBasicTemplatesVerticalCard;
import com.liferay.layout.admin.web.internal.frontend.taglib.clay.servlet.taglib.SelectGlobalTemplatesVerticalCard;
import com.liferay.layout.admin.web.internal.frontend.taglib.clay.servlet.taglib.SelectLayoutMasterLayoutVerticalCard;
import com.liferay.layout.admin.web.internal.frontend.taglib.clay.servlet.taglib.SelectLayoutPageTemplateEntryVerticalCard;
import com.liferay.layout.admin.web.internal.frontend.taglib.clay.servlet.taglib.SelectMasterLayoutVerticalCard;
import com.liferay.layout.admin.web.internal.frontend.taglib.clay.servlet.taglib.SelectStylebookLayoutVerticalCard;
import com.liferay.layout.admin.web.internal.frontend.taglib.clay.servlet.taglib.SelectThemeVerticalCard;
import com.liferay.layout.admin.web.internal.servlet.taglib.util.LayoutActionDropdownItemsProvider;
import com.liferay.layout.admin.web.internal.util.CustomizationSettingsUtil;
import com.liferay.layout.page.template.model.LayoutPageTemplateCollection;
import com.liferay.layout.page.template.model.LayoutPageTemplateEntry;
import com.liferay.layout.page.template.service.LayoutPageTemplateCollectionLocalServiceUtil;
import com.liferay.layout.page.template.service.LayoutPageTemplateCollectionServiceUtil;
import com.liferay.layout.page.template.service.LayoutPageTemplateEntryServiceUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.bean.BeanParamUtil;
import com.liferay.portal.kernel.dao.search.ResultRow;
import com.liferay.portal.kernel.exception.GroupInheritContentException;
import com.liferay.portal.kernel.exception.ImageTypeException;
import com.liferay.portal.kernel.exception.LayoutFriendlyURLException;
import com.liferay.portal.kernel.exception.LayoutFriendlyURLsException;
import com.liferay.portal.kernel.exception.LayoutNameException;
import com.liferay.portal.kernel.exception.LayoutTypeException;
import com.liferay.portal.kernel.exception.NoSuchGroupException;
import com.liferay.portal.kernel.exception.NoSuchLayoutException;
import com.liferay.portal.kernel.exception.NoSuchRoleException;
import com.liferay.portal.kernel.exception.RequiredLayoutException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.language.UnicodeLanguageUtil;
import com.liferay.portal.kernel.model.ColorScheme;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.GroupConstants;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.model.LayoutBranch;
import com.liferay.portal.kernel.model.LayoutBranchConstants;
import com.liferay.portal.kernel.model.LayoutConstants;
import com.liferay.portal.kernel.model.LayoutPrototype;
import com.liferay.portal.kernel.model.LayoutRevision;
import com.liferay.portal.kernel.model.LayoutSet;
import com.liferay.portal.kernel.model.LayoutSetBranch;
import com.liferay.portal.kernel.model.LayoutSetBranchConstants;
import com.liferay.portal.kernel.model.LayoutSetPrototype;
import com.liferay.portal.kernel.model.LayoutTemplate;
import com.liferay.portal.kernel.model.LayoutTemplateConstants;
import com.liferay.portal.kernel.model.LayoutType;
import com.liferay.portal.kernel.model.LayoutTypeController;
import com.liferay.portal.kernel.model.LayoutTypePortlet;
import com.liferay.portal.kernel.model.Portlet;
import com.liferay.portal.kernel.model.Theme;
import com.liferay.portal.kernel.model.ThemeSetting;
import com.liferay.portal.kernel.model.UserGroup;
import com.liferay.portal.kernel.plugin.PluginPackage;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.ResourceActionsUtil;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.portal.kernel.service.LayoutPrototypeLocalServiceUtil;
import com.liferay.portal.kernel.service.LayoutPrototypeServiceUtil;
import com.liferay.portal.kernel.service.LayoutSetBranchLocalServiceUtil;
import com.liferay.portal.kernel.service.LayoutSetPrototypeLocalServiceUtil;
import com.liferay.portal.kernel.service.LayoutTemplateLocalServiceUtil;
import com.liferay.portal.kernel.service.PortletLocalServiceUtil;
import com.liferay.portal.kernel.service.ThemeLocalServiceUtil;
import com.liferay.portal.kernel.service.UserGroupLocalServiceUtil;
import com.liferay.portal.kernel.service.permission.GroupPermissionUtil;
import com.liferay.portal.kernel.service.permission.LayoutPermissionUtil;
import com.liferay.portal.kernel.servlet.HttpHeaders;
import com.liferay.portal.kernel.servlet.ServletContextPool;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.template.StringTemplateResource;
import com.liferay.portal.kernel.util.AggregateResourceBundle;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.HttpComponentsUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.PortletKeys;
import com.liferay.portal.kernel.util.PropertiesParamUtil;
import com.liferay.portal.kernel.util.ResourceBundleUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.webserver.WebServerServletTokenUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.util.LayoutTypeControllerTracker;
import com.liferay.portal.util.PropsValues;
import com.liferay.segments.exception.RequiredSegmentsExperienceException;
import com.liferay.site.navigation.model.SiteNavigationMenu;
import com.liferay.sites.kernel.util.SitesUtil;
import com.liferay.style.book.model.StyleBookEntry;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.TreeMap;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

public final class look_005fand_005ffeel_005fthemes_005finfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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

LayoutsAdminDisplayContext layoutsAdminDisplayContext = (LayoutsAdminDisplayContext)request.getAttribute(LayoutAdminWebKeys.LAYOUT_PAGE_LAYOUT_ADMIN_DISPLAY_CONTEXT);

portletDisplay.setShowExportImportIcon(false);

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');

Long companyId = ParamUtil.getLong(request, "companyId");
String themeId = ParamUtil.getString(request, "themeId");

Theme selTheme = null;

Layout selLayout = layoutsAdminDisplayContext.getSelLayout();

if (Validator.isNotNull(themeId) && Validator.isNotNull(companyId)) {
	selTheme = ThemeLocalServiceUtil.getTheme(companyId, themeId);
}
else if (selLayout == null) {
	selTheme = selLayout.getTheme();
}

PluginPackage selPluginPackage = selTheme.getPluginPackage();

      out.write("\n");
      out.write("\n");
      out.write("<p class=\"h4 mb-3 mt-3\">");
      if (_jspx_meth_liferay$1ui_message_0(_jspx_page_context))
        return;
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
        _jspx_th_clay_col_0.setSize("6");
        _jspx_th_clay_col_0.setSm("4");
        int _jspx_eval_clay_col_0 = _jspx_th_clay_col_0.doStartTag();
        if (_jspx_eval_clay_col_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t<div class=\"card card-type-asset image-card\">\n");
          out.write("\t\t\t<div class=\"aspect-ratio card-item-first card-item-last\">\n");
          out.write("\t\t\t\t<img alt=\"");
          out.print( HtmlUtil.escapeAttribute(selTheme.getName()) );
          out.write("\" class=\"aspect-ratio-item aspect-ratio-item-center-middle aspect-ratio-item-fluid\" src=\"");
          out.print( themeDisplay.getCDNBaseURL() );
          out.print( HtmlUtil.escapeAttribute(selTheme.getStaticResourcePath()) );
          out.print( HtmlUtil.escapeAttribute(selTheme.getImagesPath()) );
          out.write("/thumbnail.png\" />\n");
          out.write("\t\t\t</div>\n");
          out.write("\t\t</div>\n");
          out.write("\t");
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
        _jspx_th_clay_col_1.setSize("6");
        _jspx_th_clay_col_1.setSm("8");
        int _jspx_eval_clay_col_1 = _jspx_th_clay_col_1.doStartTag();
        if (_jspx_eval_clay_col_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t");
if (
 Validator.isNotNull(selTheme.getName()) ) {
          out.write("\n");
          out.write("\t\t\t<h2 class=\"h4\">");
          if (_jspx_meth_liferay$1ui_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_col_1, _jspx_page_context))
            return;
          out.write("</h2>\n");
          out.write("\n");
          out.write("\t\t\t<p class=\"text-default\">\n");
          out.write("\t\t\t\t");
          out.print( HtmlUtil.escape(selTheme.getName()) );
          out.write("\n");
          out.write("\t\t\t</p>\n");
          out.write("\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
if (
 (selPluginPackage != null) && Validator.isNotNull(selPluginPackage.getAuthor()) ) {
          out.write("\n");
          out.write("\t\t\t<h2 class=\"h4\">");
          if (_jspx_meth_liferay$1ui_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_col_1, _jspx_page_context))
            return;
          out.write("</h2>\n");
          out.write("\n");
          out.write("\t\t\t<p class=\"text-default\">\n");
          out.write("\t\t\t\t");
          //  aui:a
          com.liferay.taglib.aui.ATag _jspx_th_aui_a_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ATag.class) : new com.liferay.taglib.aui.ATag();
          _jspx_th_aui_a_0.setPageContext(_jspx_page_context);
          _jspx_th_aui_a_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_1);
          _jspx_th_aui_a_0.setHref( HtmlUtil.escapeHREF(selPluginPackage.getPageURL()) );
          _jspx_th_aui_a_0.setTarget("_blank");
          int _jspx_eval_aui_a_0 = _jspx_th_aui_a_0.doStartTag();
          if (_jspx_eval_aui_a_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.print( HtmlUtil.escape(selPluginPackage.getAuthor()) );
          }
          if (_jspx_th_aui_a_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_0);
            _jspx_th_aui_a_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_0);
          _jspx_th_aui_a_0.release();
          out.write("\n");
          out.write("\t\t\t</p>\n");
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
 (selPluginPackage != null) && Validator.isNotNull(selPluginPackage.getShortDescription()) ) {
      out.write("\n");
      out.write("\t<h2 class=\"h4\">");
      if (_jspx_meth_liferay$1ui_message_3(_jspx_page_context))
        return;
      out.write("</h2>\n");
      out.write("\n");
      out.write("\t<p class=\"text-default\">\n");
      out.write("\t\t");
      out.print( HtmlUtil.escape(selPluginPackage.getShortDescription()) );
      out.write("\n");
      out.write("\t</p>\n");
}
      out.write('\n');
      out.write('\n');

ColorScheme selColorScheme = selLayout.getColorScheme();

List<ColorScheme> colorSchemes = selTheme.getColorSchemes();

      out.write('\n');
      out.write('\n');
if (
 !colorSchemes.isEmpty() && (selColorScheme != null) ) {
      out.write("\n");
      out.write("\t<h2 class=\"h4\">");
      if (_jspx_meth_liferay$1ui_message_4(_jspx_page_context))
        return;
      out.write("</h2>\n");
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
        _jspx_th_clay_col_2.setMd("3");
        _jspx_th_clay_col_2.setSize("6");
        _jspx_th_clay_col_2.setSm("4");
        int _jspx_eval_clay_col_2 = _jspx_th_clay_col_2.doStartTag();
        if (_jspx_eval_clay_col_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t<div class=\"card image-card img-thumbnail\">\n");
          out.write("\t\t\t\t<div class=\"aspect-ratio aspect-ratio-16-to-9\">\n");
          out.write("\t\t\t\t\t<img alt=\"\" class=\"aspect-ratio-item-flush aspect-ratio-item-top-center img-thumbnail theme-screenshot\" src=\"");
          out.print( themeDisplay.getCDNBaseURL() );
          out.print( HtmlUtil.escapeAttribute(selTheme.getStaticResourcePath()) );
          out.print( HtmlUtil.escapeAttribute(selColorScheme.getColorSchemeThumbnailPath()) );
          out.write("/thumbnail.png\" title=\"");
          out.print( HtmlUtil.escapeAttribute(selColorScheme.getName()) );
          out.write("\" />\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\n");
          out.write("\t\t\t\t<div class=\"card-body p-2\">\n");
          out.write("\t\t\t\t\t<div class=\"card-row\">\n");
          out.write("\t\t\t\t\t\t<div class=\"card-title text-truncate\">\n");
          out.write("\t\t\t\t\t\t\t");
          out.print( HtmlUtil.escapeAttribute(selColorScheme.getName()) );
          out.write("\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\t\t\t</div>\n");
          out.write("\t\t");
        }
        if (_jspx_th_clay_col_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_2);
          _jspx_th_clay_col_2.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_2);
        _jspx_th_clay_col_2.release();
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
      out.write('\n');
      out.write('\n');

Map<String, ThemeSetting> configurableSettings = selTheme.getConfigurableSettings();

      out.write('\n');
      out.write('\n');
if (
 !configurableSettings.isEmpty() ) {
      out.write("\n");
      out.write("\t<h2 class=\"h4\">");
      if (_jspx_meth_liferay$1ui_message_5(_jspx_page_context))
        return;
      out.write("</h2>\n");
      out.write("\n");
      out.write("\t");

	LayoutSet selLayoutSet = layoutsAdminDisplayContext.getSelLayoutSet();

	for (String name : configurableSettings.keySet()) {
		String value = selLayoutSet.getThemeSetting(name, "regular");
	
      out.write("\n");
      out.write("\n");
      out.write("\t\t<p class=\"text-default\">");
      //  liferay-ui:message
      com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
      _jspx_th_liferay$1ui_message_6.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_message_6.setParent(null);
      _jspx_th_liferay$1ui_message_6.setKey( HtmlUtil.escape(name) );
      int _jspx_eval_liferay$1ui_message_6 = _jspx_th_liferay$1ui_message_6.doStartTag();
      if (_jspx_th_liferay$1ui_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_6);
        _jspx_th_liferay$1ui_message_6.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_6);
      _jspx_th_liferay$1ui_message_6.release();
      out.write(':');
      out.write(' ');
      out.print( HtmlUtil.escape(LanguageUtil.get(request, value)) );
      out.write("</p>\n");
      out.write("\n");
      out.write("\t");

	}
	
      out.write('\n');
      out.write('\n');
}
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
    _jspx_th_liferay$1ui_message_0.setKey("current-theme");
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

  private boolean _jspx_meth_liferay$1ui_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_col_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_1);
    _jspx_th_liferay$1ui_message_1.setKey("name");
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

  private boolean _jspx_meth_liferay$1ui_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_col_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_2.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_1);
    _jspx_th_liferay$1ui_message_2.setKey("author");
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

  private boolean _jspx_meth_liferay$1ui_message_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_3.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_3.setParent(null);
    _jspx_th_liferay$1ui_message_3.setKey("description");
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

  private boolean _jspx_meth_liferay$1ui_message_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_4.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_4.setParent(null);
    _jspx_th_liferay$1ui_message_4.setKey("color-scheme");
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

  private boolean _jspx_meth_liferay$1ui_message_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_5.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_5.setParent(null);
    _jspx_th_liferay$1ui_message_5.setKey("settings");
    int _jspx_eval_liferay$1ui_message_5 = _jspx_th_liferay$1ui_message_5.doStartTag();
    if (_jspx_th_liferay$1ui_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_5);
      _jspx_th_liferay$1ui_message_5.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_5);
    _jspx_th_liferay$1ui_message_5.release();
    return false;
  }
}
