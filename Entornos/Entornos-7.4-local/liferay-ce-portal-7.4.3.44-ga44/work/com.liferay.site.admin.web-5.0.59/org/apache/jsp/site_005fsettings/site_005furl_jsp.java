package org.apache.jsp.site_005fsettings;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.asset.kernel.model.AssetVocabularyConstants;
import com.liferay.frontend.taglib.clay.servlet.taglib.util.JSPNavigationItemList;
import com.liferay.frontend.taglib.clay.servlet.taglib.util.NavigationItem;
import com.liferay.frontend.taglib.form.navigator.constants.FormNavigatorConstants;
import com.liferay.map.constants.MapProviderWebKeys;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.AvailableLocaleException;
import com.liferay.portal.kernel.exception.DuplicateGroupException;
import com.liferay.portal.kernel.exception.GroupFriendlyURLException;
import com.liferay.portal.kernel.exception.GroupInheritContentException;
import com.liferay.portal.kernel.exception.GroupKeyException;
import com.liferay.portal.kernel.exception.GroupNameException;
import com.liferay.portal.kernel.exception.GroupParentException;
import com.liferay.portal.kernel.exception.LayoutSetVirtualHostException;
import com.liferay.portal.kernel.exception.NoSuchGroupException;
import com.liferay.portal.kernel.exception.NoSuchLayoutException;
import com.liferay.portal.kernel.exception.NoSuchLayoutSetException;
import com.liferay.portal.kernel.exception.NoSuchRoleException;
import com.liferay.portal.kernel.exception.PendingBackgroundTaskException;
import com.liferay.portal.kernel.exception.RequiredGroupException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.GroupConstants;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.model.LayoutSet;
import com.liferay.portal.kernel.model.LayoutSetPrototype;
import com.liferay.portal.kernel.model.MembershipRequest;
import com.liferay.portal.kernel.model.Organization;
import com.liferay.portal.kernel.model.Portlet;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.SiteConstants;
import com.liferay.portal.kernel.model.Team;
import com.liferay.portal.kernel.model.role.RoleConstants;
import com.liferay.portal.kernel.module.configuration.ConfigurationProviderUtil;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.portlet.PortletProvider;
import com.liferay.portal.kernel.portlet.PortletProviderUtil;
import com.liferay.portal.kernel.portlet.url.builder.PortletURLBuilder;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.ResourceActionsUtil;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.portal.kernel.service.LayoutSetLocalServiceUtil;
import com.liferay.portal.kernel.service.LayoutSetPrototypeLocalServiceUtil;
import com.liferay.portal.kernel.service.LayoutSetPrototypeServiceUtil;
import com.liferay.portal.kernel.service.OrganizationLocalServiceUtil;
import com.liferay.portal.kernel.service.PortletLocalServiceUtil;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.service.TeamLocalServiceUtil;
import com.liferay.portal.kernel.service.UserGroupLocalServiceUtil;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.service.permission.PortalPermissionUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.HttpComponentsUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.PrefsPropsUtil;
import com.liferay.portal.kernel.util.PropertiesParamUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.TextFormatter;
import com.liferay.portal.kernel.util.TreeMapBuilder;
import com.liferay.portal.kernel.util.UnicodeFormatter;
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.liveusers.LiveUsers;
import com.liferay.portal.util.PropsValues;
import com.liferay.ratings.kernel.RatingsType;
import com.liferay.ratings.kernel.display.context.CompanyPortletRatingsDefinitionDisplayContext;
import com.liferay.ratings.kernel.display.context.GroupPortletRatingsDefinitionDisplayContext;
import com.liferay.ratings.kernel.transformer.RatingsDataTransformerUtil;
import com.liferay.site.admin.web.internal.configuration.SiteAdminConfiguration;
import com.liferay.site.admin.web.internal.constants.SiteAdminPortletKeys;
import com.liferay.site.admin.web.internal.constants.SiteAdminWebKeys;
import com.liferay.site.admin.web.internal.display.context.AddGroupDisplayContext;
import com.liferay.site.admin.web.internal.display.context.DisplaySettingsDisplayContext;
import com.liferay.site.admin.web.internal.display.context.SelectSiteInitializerDisplayContext;
import com.liferay.site.admin.web.internal.display.context.SiteAdminDisplayContext;
import com.liferay.site.admin.web.internal.display.context.SiteAdminManagementToolbarDisplayContext;
import com.liferay.site.admin.web.internal.frontend.taglib.clay.servlet.taglib.SelectSiteInitializerVerticalCard;
import com.liferay.site.admin.web.internal.frontend.taglib.clay.servlet.taglib.SiteVerticalCard;
import com.liferay.site.settings.configuration.admin.display.SiteSettingsConfigurationScreenContributor;
import com.liferay.sites.kernel.util.Sites;
import com.liferay.sites.kernel.util.SitesUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.WindowState;

public final class site_005furl_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(16);
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/META-INF/c.tld");
    _jspx_dependants.add("/META-INF/liferay-portlet_2_0.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-asset.tld");
    _jspx_dependants.add("/META-INF/liferay-aui.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-clay.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-expando.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-frontend.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-map.tld");
    _jspx_dependants.add("/META-INF/liferay-portlet-ext.tld");
    _jspx_dependants.add("/META-INF/resources/react.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-site-navigation.tld");
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

portletDisplay.setShowStagingIcon(false);

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');

Group liveGroup = (Group)request.getAttribute("site.liveGroup");
long liveGroupId = (long)request.getAttribute("site.liveGroupId");
Group stagingGroup = (Group)request.getAttribute("site.stagingGroup");
long stagingGroupId = (long)request.getAttribute("site.stagingGroupId");

LayoutSet publicLayoutSet = LayoutSetLocalServiceUtil.getLayoutSet(liveGroupId, false);

Set<Locale> availableLocales = LanguageUtil.getAvailableLocales(liveGroupId);

TreeMap<String, String> publicVirtualHostnames = publicLayoutSet.getVirtualHostnames();

if (publicVirtualHostnames.isEmpty()) {
	publicVirtualHostnames = TreeMapBuilder.put(
		StringPool.BLANK, StringPool.BLANK
	).build();
}

      out.write('\n');
      out.write('\n');
      //  aui:model-context
      com.liferay.taglib.aui.ModelContextTag _jspx_th_aui_model$1context_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ModelContextTag.class) : new com.liferay.taglib.aui.ModelContextTag();
      _jspx_th_aui_model$1context_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_model$1context_0.setParent(null);
      _jspx_th_aui_model$1context_0.setBean( liveGroup );
      _jspx_th_aui_model$1context_0.setModel( Group.class );
      int _jspx_eval_aui_model$1context_0 = _jspx_th_aui_model$1context_0.doStartTag();
      if (_jspx_th_aui_model$1context_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_model$1context_0);
        _jspx_th_aui_model$1context_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_model$1context_0);
      _jspx_th_aui_model$1context_0.release();
      out.write('\n');
      out.write('\n');
      //  liferay-ui:error
      com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
      _jspx_th_liferay$1ui_error_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_error_0.setParent(null);
      _jspx_th_liferay$1ui_error_0.setException( AvailableLocaleException.class );
      _jspx_th_liferay$1ui_error_0.setMessage("please-select-a-valid-language-for-each-virtual-host");
      int _jspx_eval_liferay$1ui_error_0 = _jspx_th_liferay$1ui_error_0.doStartTag();
      if (_jspx_th_liferay$1ui_error_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_0);
        _jspx_th_liferay$1ui_error_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_0);
      _jspx_th_liferay$1ui_error_0.release();
      out.write('\n');
      out.write('\n');
      //  liferay-ui:error
      com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
      _jspx_th_liferay$1ui_error_1.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_error_1.setParent(null);
      _jspx_th_liferay$1ui_error_1.setException( GroupFriendlyURLException.class );
      int _jspx_eval_liferay$1ui_error_1 = _jspx_th_liferay$1ui_error_1.doStartTag();
      if (_jspx_eval_liferay$1ui_error_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object errorException = null;
        if (_jspx_eval_liferay$1ui_error_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_liferay$1ui_error_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_liferay$1ui_error_1.doInitBody();
        }
        errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
        do {
          out.write("\n");
          out.write("\n");
          out.write("\t");

	GroupFriendlyURLException gfurle = (GroupFriendlyURLException)errorException;
	
          out.write("\n");
          out.write("\n");
          out.write("\t");
if (
 gfurle.getType() == GroupFriendlyURLException.ADJACENT_SLASHES ) {
          out.write("\n");
          out.write("\t\t");
          if (_jspx_meth_liferay$1ui_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_error_1, _jspx_page_context))
            return;
          out.write('\n');
          out.write('	');
}
          out.write("\n");
          out.write("\n");
          out.write("\t");
if (
 gfurle.getType() == GroupFriendlyURLException.DOES_NOT_START_WITH_SLASH ) {
          out.write("\n");
          out.write("\t\t");
          if (_jspx_meth_liferay$1ui_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_error_1, _jspx_page_context))
            return;
          out.write('\n');
          out.write('	');
}
          out.write("\n");
          out.write("\n");
          out.write("\t");
if (
 gfurle.getType() == GroupFriendlyURLException.DUPLICATE ) {
          out.write("\n");
          out.write("\n");
          out.write("\t\t");

		long duplicateClassPK = gfurle.getDuplicateClassPK();
		String duplicateClassName = gfurle.getDuplicateClassName();

		String name = StringPool.BLANK;

		if (duplicateClassName.equals(Group.class.getName())) {
			Group duplicateGroup = GroupLocalServiceUtil.getGroup(duplicateClassPK);

			name = duplicateGroup.getDescriptiveName(locale);
		}
		else if (duplicateClassName.equals(Layout.class.getName())) {
			Layout duplicateLayout = LayoutLocalServiceUtil.getLayout(duplicateClassPK);

			name = duplicateLayout.getName(locale);
		}
		
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:message
          com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
          _jspx_th_liferay$1ui_message_2.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_error_1);
          _jspx_th_liferay$1ui_message_2.setArguments( new Object[] {ResourceActionsUtil.getModelResource(locale, duplicateClassName), name} );
          _jspx_th_liferay$1ui_message_2.setKey("please-enter-a-unique-friendly-url.-x-and-x-has-the-same-friendly-url");
          _jspx_th_liferay$1ui_message_2.setTranslateArguments( false );
          int _jspx_eval_liferay$1ui_message_2 = _jspx_th_liferay$1ui_message_2.doStartTag();
          if (_jspx_th_liferay$1ui_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
            _jspx_th_liferay$1ui_message_2.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
          _jspx_th_liferay$1ui_message_2.release();
          out.write('\n');
          out.write('	');
}
          out.write("\n");
          out.write("\n");
          out.write("\t");
if (
 gfurle.getType() == GroupFriendlyURLException.ENDS_WITH_DASH ) {
          out.write("\n");
          out.write("\t\t");
          if (_jspx_meth_liferay$1ui_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_error_1, _jspx_page_context))
            return;
          out.write('\n');
          out.write('	');
}
          out.write("\n");
          out.write("\n");
          out.write("\t");
if (
 gfurle.getType() == GroupFriendlyURLException.ENDS_WITH_SLASH ) {
          out.write("\n");
          out.write("\t\t");
          if (_jspx_meth_liferay$1ui_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_error_1, _jspx_page_context))
            return;
          out.write('\n');
          out.write('	');
}
          out.write("\n");
          out.write("\n");
          out.write("\t");
if (
 gfurle.getType() == GroupFriendlyURLException.INVALID_CHARACTERS ) {
          out.write("\n");
          out.write("\t\t");
          if (_jspx_meth_liferay$1ui_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_error_1, _jspx_page_context))
            return;
          out.write('\n');
          out.write('	');
}
          out.write("\n");
          out.write("\n");
          out.write("\t");
if (
 gfurle.getType() == GroupFriendlyURLException.KEYWORD_CONFLICT ) {
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:message
          com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
          _jspx_th_liferay$1ui_message_6.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_message_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_error_1);
          _jspx_th_liferay$1ui_message_6.setArguments( gfurle.getKeywordConflict() );
          _jspx_th_liferay$1ui_message_6.setKey("please-enter-a-friendly-url-that-does-not-conflict-with-the-keyword-x");
          _jspx_th_liferay$1ui_message_6.setTranslateArguments( false );
          int _jspx_eval_liferay$1ui_message_6 = _jspx_th_liferay$1ui_message_6.doStartTag();
          if (_jspx_th_liferay$1ui_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_6);
            _jspx_th_liferay$1ui_message_6.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_6);
          _jspx_th_liferay$1ui_message_6.release();
          out.write('\n');
          out.write('	');
}
          out.write("\n");
          out.write("\n");
          out.write("\t");
if (
 gfurle.getType() == GroupFriendlyURLException.POSSIBLE_DUPLICATE ) {
          out.write("\n");
          out.write("\t\t");
          if (_jspx_meth_liferay$1ui_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_error_1, _jspx_page_context))
            return;
          out.write('\n');
          out.write('	');
}
          out.write("\n");
          out.write("\n");
          out.write("\t");
if (
 gfurle.getType() == GroupFriendlyURLException.TOO_DEEP ) {
          out.write("\n");
          out.write("\t\t");
          if (_jspx_meth_liferay$1ui_message_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_error_1, _jspx_page_context))
            return;
          out.write('\n');
          out.write('	');
}
          out.write("\n");
          out.write("\n");
          out.write("\t");
if (
 gfurle.getType() == GroupFriendlyURLException.TOO_SHORT ) {
          out.write("\n");
          out.write("\t\t");
          if (_jspx_meth_liferay$1ui_message_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_error_1, _jspx_page_context))
            return;
          out.write('\n');
          out.write('	');
}
          out.write('\n');
          int evalDoAfterBody = _jspx_th_liferay$1ui_error_1.doAfterBody();
          errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_liferay$1ui_error_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_liferay$1ui_error_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_1);
        _jspx_th_liferay$1ui_error_1.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_1);
      _jspx_th_liferay$1ui_error_1.release();
      out.write('\n');
      out.write('\n');
      //  liferay-ui:error
      com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
      _jspx_th_liferay$1ui_error_2.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_error_2.setParent(null);
      _jspx_th_liferay$1ui_error_2.setException( LayoutSetVirtualHostException.class );
      int _jspx_eval_liferay$1ui_error_2 = _jspx_th_liferay$1ui_error_2.doStartTag();
      if (_jspx_eval_liferay$1ui_error_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object errorException = null;
        if (_jspx_eval_liferay$1ui_error_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_liferay$1ui_error_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_liferay$1ui_error_2.doInitBody();
        }
        errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
        do {
          out.write('\n');
          out.write('	');
          if (_jspx_meth_liferay$1ui_message_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_error_2, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\n");
          out.write("\t");
          if (_jspx_meth_liferay$1ui_message_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_error_2, _jspx_page_context))
            return;
          out.write('\n');
          int evalDoAfterBody = _jspx_th_liferay$1ui_error_2.doAfterBody();
          errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_liferay$1ui_error_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_liferay$1ui_error_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_2);
        _jspx_th_liferay$1ui_error_2.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_2);
      _jspx_th_liferay$1ui_error_2.release();
      out.write('\n');
      out.write('\n');
      //  aui:fieldset
      com.liferay.taglib.aui.FieldsetTag _jspx_th_aui_fieldset_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FieldsetTag.class) : new com.liferay.taglib.aui.FieldsetTag();
      _jspx_th_aui_fieldset_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_fieldset_0.setParent(null);
      int _jspx_eval_aui_fieldset_0 = _jspx_th_aui_fieldset_0.doStartTag();
      if (_jspx_eval_aui_fieldset_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t<p class=\"small text-secondary\">\n");
        out.write("\t\t");
        if (_jspx_meth_liferay$1ui_message_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_0, _jspx_page_context))
          return;
        out.write("\n");
        out.write("\n");
        out.write("\t\t");
        //  liferay-ui:message
        com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_13 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
        _jspx_th_liferay$1ui_message_13.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_message_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
        _jspx_th_liferay$1ui_message_13.setArguments( new Object[] {"<strong>" + themeDisplay.getPortalURL() + themeDisplay.getPathFriendlyURLPublic() + "</strong>"} );
        _jspx_th_liferay$1ui_message_13.setKey("the-friendly-url-is-appended-to-x-for-pages");
        _jspx_th_liferay$1ui_message_13.setTranslateArguments( false );
        int _jspx_eval_liferay$1ui_message_13 = _jspx_th_liferay$1ui_message_13.doStartTag();
        if (_jspx_th_liferay$1ui_message_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_13);
          _jspx_th_liferay$1ui_message_13.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_13);
        _jspx_th_liferay$1ui_message_13.release();
        out.write("\n");
        out.write("\t</p>\n");
        out.write("\n");
        out.write("\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_0.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
        _jspx_th_aui_input_0.setLabel("friendly-url");
        _jspx_th_aui_input_0.setName("groupFriendlyURL");
        _jspx_th_aui_input_0.setType("text");
        _jspx_th_aui_input_0.setValue( HttpComponentsUtil.decodeURL(liveGroup.getFriendlyURL()) );
        int _jspx_eval_aui_input_0 = _jspx_th_aui_input_0.doStartTag();
        if (_jspx_th_aui_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_0);
          _jspx_th_aui_input_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_0);
        _jspx_th_aui_input_0.release();
        out.write("\n");
        out.write("\n");
        out.write("\t");
if (
 liveGroup.hasStagingGroup() ) {
        out.write("\n");
        out.write("\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_1.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
        _jspx_th_aui_input_1.setLabel("staging-friendly-url");
        _jspx_th_aui_input_1.setName("stagingFriendlyURL");
        _jspx_th_aui_input_1.setType("text");
        _jspx_th_aui_input_1.setValue( HttpComponentsUtil.decodeURL(stagingGroup.getFriendlyURL()) );
        int _jspx_eval_aui_input_1 = _jspx_th_aui_input_1.doStartTag();
        if (_jspx_th_aui_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_1);
          _jspx_th_aui_input_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_1);
        _jspx_th_aui_input_1.release();
        out.write('\n');
        out.write('	');
}
        out.write("\n");
        out.write("\n");
        out.write("\t<p class=\"small text-secondary\">\n");
        out.write("\t\t");
        if (_jspx_meth_liferay$1ui_message_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_0, _jspx_page_context))
          return;
        out.write("\n");
        out.write("\n");
        out.write("\t\t");
        //  liferay-ui:message
        com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_15 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
        _jspx_th_liferay$1ui_message_15.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_message_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
        _jspx_th_liferay$1ui_message_15.setArguments( new Object[] {"<strong>www.helloworld.com</strong>", "<strong>/helloworld</strong>", "<strong>" + HttpComponentsUtil.getProtocol(request) + "://www.helloworld.com</strong>", "<strong>" + themeDisplay.getPortalURL() + themeDisplay.getPathFriendlyURLPublic() + "/helloworld</strong>"} );
        _jspx_th_liferay$1ui_message_15.setKey("for-example,-if-the-virtual-host-is-x-and-the-friendly-url-is-x,-then-x-is-mapped-to-x");
        _jspx_th_liferay$1ui_message_15.setTranslateArguments( false );
        int _jspx_eval_liferay$1ui_message_15 = _jspx_th_liferay$1ui_message_15.doStartTag();
        if (_jspx_th_liferay$1ui_message_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_15);
          _jspx_th_liferay$1ui_message_15.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_15);
        _jspx_th_liferay$1ui_message_15.release();
        out.write("\n");
        out.write("\t</p>\n");
        out.write("\n");
        out.write("\t<div class=\"mb-5\" id=\"");
        if (_jspx_meth_portlet_namespace_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_0, _jspx_page_context))
          return;
        out.write("publicVirtualHostFields\">\n");
        out.write("\t\t<h4 class=\"sheet-subtitle\">");
        if (_jspx_meth_liferay$1ui_message_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_0, _jspx_page_context))
          return;
        out.write("</h4>\n");
        out.write("\n");
        out.write("\t\t");

		for (Map.Entry<String, String> entry : publicVirtualHostnames.entrySet()) {
			String virtualHostname = entry.getKey();

			String virtualHostLanguageId = Validator.isNotNull(entry.getValue()) ? entry.getValue() : StringPool.BLANK;
		
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t");
        //  clay:container-fluid
        com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag _jspx_th_clay_container$1fluid_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag();
        _jspx_th_clay_container$1fluid_0.setPageContext(_jspx_page_context);
        _jspx_th_clay_container$1fluid_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
        _jspx_th_clay_container$1fluid_0.setCssClass("lfr-form-row");
        int _jspx_eval_clay_container$1fluid_0 = _jspx_th_clay_container$1fluid_0.doStartTag();
        if (_jspx_eval_clay_container$1fluid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t\t");
          //  clay:row
          com.liferay.frontend.taglib.clay.servlet.taglib.RowTag _jspx_th_clay_row_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.RowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.RowTag();
          _jspx_th_clay_row_0.setPageContext(_jspx_page_context);
          _jspx_th_clay_row_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_0);
          int _jspx_eval_clay_row_0 = _jspx_th_clay_row_0.doStartTag();
          if (_jspx_eval_clay_row_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
            _jspx_th_aui_input_2.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_row_0);
            _jspx_th_aui_input_2.setInlineField( true );
            _jspx_th_aui_input_2.setLabel("virtual-host");
            _jspx_th_aui_input_2.setDynamicAttribute(null, "maxlength", new String("200"));
            _jspx_th_aui_input_2.setName("publicVirtualHostname[]");
            _jspx_th_aui_input_2.setPlaceholder("virtual-host");
            _jspx_th_aui_input_2.setType("text");
            _jspx_th_aui_input_2.setValue( virtualHostname );
            _jspx_th_aui_input_2.setWrapperCssClass("col-sm-6");
            int _jspx_eval_aui_input_2 = _jspx_th_aui_input_2.doStartTag();
            if (_jspx_th_aui_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_2);
              _jspx_th_aui_input_2.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_2);
            _jspx_th_aui_input_2.release();
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t");
            //  aui:select
            com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.SelectTag.class) : new com.liferay.taglib.aui.SelectTag();
            _jspx_th_aui_select_0.setPageContext(_jspx_page_context);
            _jspx_th_aui_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_row_0);
            _jspx_th_aui_select_0.setInlineField( true );
            _jspx_th_aui_select_0.setLabel("language");
            _jspx_th_aui_select_0.setName("publicVirtualHostLanguageId[]");
            _jspx_th_aui_select_0.setWrapperCssClass("col-sm-6");
            int _jspx_eval_aui_select_0 = _jspx_th_aui_select_0.doStartTag();
            if (_jspx_eval_aui_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              if (_jspx_eval_aui_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                out = _jspx_page_context.pushBody();
                _jspx_th_aui_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                _jspx_th_aui_select_0.doInitBody();
              }
              do {
                out.write("\n");
                out.write("\t\t\t\t\t\t");
                if (_jspx_meth_aui_option_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_select_0, _jspx_page_context))
                  return;
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t\t");

						for (Locale localeEntry : availableLocales) {
							String languageId = LocaleUtil.toLanguageId(localeEntry);
						
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t\t\t");
                //  aui:option
                com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                _jspx_th_aui_option_1.setPageContext(_jspx_page_context);
                _jspx_th_aui_option_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
                _jspx_th_aui_option_1.setLabel( localeEntry.getDisplayName(themeDisplay.getLocale()) );
                _jspx_th_aui_option_1.setSelected( languageId.equals(virtualHostLanguageId) );
                _jspx_th_aui_option_1.setValue( languageId );
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
                out.write("\t\t\t\t\t\t");

						}
						
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t");
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
            out.write("\t\t\t\t");
          }
          if (_jspx_th_clay_row_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_row_0);
            _jspx_th_clay_row_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_row_0);
          _jspx_th_clay_row_0.release();
          out.write("\n");
          out.write("\t\t\t");
        }
        if (_jspx_th_clay_container$1fluid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_0);
          _jspx_th_clay_container$1fluid_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_0);
        _jspx_th_clay_container$1fluid_0.release();
        out.write("\n");
        out.write("\n");
        out.write("\t\t");

		}
		
        out.write("\n");
        out.write("\n");
        out.write("\t</div>\n");
        out.write("\n");
        out.write("\t");
if (
 liveGroup.hasStagingGroup() ) {
        out.write("\n");
        out.write("\n");
        out.write("\t\t");

		LayoutSet stagingPublicLayoutSet = LayoutSetLocalServiceUtil.getLayoutSet(stagingGroupId, false);

		TreeMap<String, String> stagingPublicVirtualHostnames = stagingPublicLayoutSet.getVirtualHostnames();

		if (stagingPublicVirtualHostnames.isEmpty()) {
			stagingPublicVirtualHostnames = TreeMapBuilder.put(
				StringPool.BLANK, StringPool.BLANK
			).build();
		}
		
        out.write("\n");
        out.write("\n");
        out.write("\t\t<div id=\"");
        if (_jspx_meth_portlet_namespace_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_0, _jspx_page_context))
          return;
        out.write("stagingPublicVirtualHostFields\">\n");
        out.write("\n");
        out.write("\t\t\t");

			for (Map.Entry<String, String> entry : stagingPublicVirtualHostnames.entrySet()) {
				String virtualHostname = entry.getKey();

				String virtualHostLanguageId = Validator.isNotNull(entry.getValue()) ? entry.getValue() : StringPool.BLANK;
			
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t");
        //  clay:container-fluid
        com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag _jspx_th_clay_container$1fluid_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag();
        _jspx_th_clay_container$1fluid_1.setPageContext(_jspx_page_context);
        _jspx_th_clay_container$1fluid_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
        _jspx_th_clay_container$1fluid_1.setCssClass("lfr-form-row");
        int _jspx_eval_clay_container$1fluid_1 = _jspx_th_clay_container$1fluid_1.doStartTag();
        if (_jspx_eval_clay_container$1fluid_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t\t\t");
          //  clay:row
          com.liferay.frontend.taglib.clay.servlet.taglib.RowTag _jspx_th_clay_row_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.RowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.RowTag();
          _jspx_th_clay_row_1.setPageContext(_jspx_page_context);
          _jspx_th_clay_row_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_1);
          int _jspx_eval_clay_row_1 = _jspx_th_clay_row_1.doStartTag();
          if (_jspx_eval_clay_row_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
            _jspx_th_aui_input_3.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_row_1);
            _jspx_th_aui_input_3.setInlineField( true );
            _jspx_th_aui_input_3.setLabel("staging-pages");
            _jspx_th_aui_input_3.setDynamicAttribute(null, "maxlength", new String("200"));
            _jspx_th_aui_input_3.setName("stagingPublicVirtualHostname[]");
            _jspx_th_aui_input_3.setPlaceholder("virtual-host");
            _jspx_th_aui_input_3.setType("text");
            _jspx_th_aui_input_3.setValue( virtualHostname );
            _jspx_th_aui_input_3.setWrapperCssClass("col-sm-6");
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
            out.write("\t\t\t\t\t\t");
            //  aui:select
            com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.SelectTag.class) : new com.liferay.taglib.aui.SelectTag();
            _jspx_th_aui_select_1.setPageContext(_jspx_page_context);
            _jspx_th_aui_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_row_1);
            _jspx_th_aui_select_1.setInlineField( true );
            _jspx_th_aui_select_1.setLabel("language");
            _jspx_th_aui_select_1.setName("stagingPublicVirtualHostLanguageId[]");
            _jspx_th_aui_select_1.setWrapperCssClass("col-sm-6");
            int _jspx_eval_aui_select_1 = _jspx_th_aui_select_1.doStartTag();
            if (_jspx_eval_aui_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              if (_jspx_eval_aui_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                out = _jspx_page_context.pushBody();
                _jspx_th_aui_select_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                _jspx_th_aui_select_1.doInitBody();
              }
              do {
                out.write("\n");
                out.write("\t\t\t\t\t\t\t");
                if (_jspx_meth_aui_option_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_select_1, _jspx_page_context))
                  return;
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t\t\t");

							for (Locale localeEntry : availableLocales) {
								String languageId = LocaleUtil.toLanguageId(localeEntry);
							
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t");
                //  aui:option
                com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                _jspx_th_aui_option_3.setPageContext(_jspx_page_context);
                _jspx_th_aui_option_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_1);
                _jspx_th_aui_option_3.setLabel( localeEntry.getDisplayName(themeDisplay.getLocale()) );
                _jspx_th_aui_option_3.setSelected( languageId.equals(virtualHostLanguageId) );
                _jspx_th_aui_option_3.setValue( languageId );
                int _jspx_eval_aui_option_3 = _jspx_th_aui_option_3.doStartTag();
                if (_jspx_th_aui_option_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_3);
                  _jspx_th_aui_option_3.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_3);
                _jspx_th_aui_option_3.release();
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t\t\t");

							}
							
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t\t");
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
            out.write("\t\t\t\t\t");
          }
          if (_jspx_th_clay_row_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_row_1);
            _jspx_th_clay_row_1.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_row_1);
          _jspx_th_clay_row_1.release();
          out.write("\n");
          out.write("\t\t\t\t");
        }
        if (_jspx_th_clay_container$1fluid_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_1);
          _jspx_th_clay_container$1fluid_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_1);
        _jspx_th_clay_container$1fluid_1.release();
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t");

			}
			
        out.write("\n");
        out.write("\n");
        out.write("\t\t</div>\n");
        out.write("\t");
}
        out.write('\n');
      }
      if (_jspx_th_aui_fieldset_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset_0);
        _jspx_th_aui_fieldset_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset_0);
      _jspx_th_aui_fieldset_0.release();
      out.write('\n');
      out.write('\n');
      //  aui:script
      com.liferay.taglib.aui.ScriptTag _jspx_th_aui_script_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ScriptTag.class) : new com.liferay.taglib.aui.ScriptTag();
      _jspx_th_aui_script_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_script_0.setParent(null);
      _jspx_th_aui_script_0.setUse("liferay-auto-fields");
      int _jspx_eval_aui_script_0 = _jspx_th_aui_script_0.doStartTag();
      if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_aui_script_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_aui_script_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\tnew Liferay.AutoFields({\n");
          out.write("\t\tcontentBox: '#");
          if (_jspx_meth_portlet_namespace_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("publicVirtualHostFields',\n");
          out.write("\t\tnamespace: '");
          if (_jspx_meth_portlet_namespace_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("',\n");
          out.write("\t}).render();\n");
          out.write("\n");
          out.write("\t");
if (
 liveGroup.hasStagingGroup() ) {
          out.write("\n");
          out.write("\t\tnew Liferay.AutoFields({\n");
          out.write("\t\t\tcontentBox: '#");
          if (_jspx_meth_portlet_namespace_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("stagingPublicVirtualHostFields',\n");
          out.write("\t\t\tnamespace: '");
          if (_jspx_meth_portlet_namespace_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("',\n");
          out.write("\t\t}).render();\n");
          out.write("\t");
}
          out.write('\n');
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
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\tvar friendlyURL = document.getElementById(\n");
      out.write("\t\t'");
      if (_jspx_meth_portlet_namespace_6(_jspx_page_context))
        return;
      out.write("groupFriendlyURL'\n");
      out.write("\t);\n");
      out.write("\n");
      out.write("\tif (friendlyURL) {\n");
      out.write("\t\tfriendlyURL.addEventListener('change', (event) => {\n");
      out.write("\t\t\tvar value = friendlyURL.value.trim();\n");
      out.write("\n");
      out.write("\t\t\tif (value == '/') {\n");
      out.write("\t\t\t\tvalue = '';\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\telse {\n");
      out.write("\t\t\t\tvalue = value.replace(/^[^\\/]|\\/$/g, (match, index) => {\n");
      out.write("\t\t\t\t\tvar str = '';\n");
      out.write("\n");
      out.write("\t\t\t\t\tif (index == 0) {\n");
      out.write("\t\t\t\t\t\tstr = '/' + match;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\t\treturn str;\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\tfriendlyURL.value = value;\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("</script>");
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

  private boolean _jspx_meth_liferay$1ui_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_error_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_error_1);
    _jspx_th_liferay$1ui_message_0.setKey("please-enter-a-friendly-url-that-does-not-have-adjacent-slashes");
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

  private boolean _jspx_meth_liferay$1ui_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_error_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_error_1);
    _jspx_th_liferay$1ui_message_1.setKey("please-enter-a-friendly-url-that-begins-with-a-slash");
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

  private boolean _jspx_meth_liferay$1ui_message_3(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_error_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_3.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_error_1);
    _jspx_th_liferay$1ui_message_3.setKey("please-enter-a-friendly-url-that-does-not-end-with-a-dash");
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

  private boolean _jspx_meth_liferay$1ui_message_4(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_error_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_4.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_error_1);
    _jspx_th_liferay$1ui_message_4.setKey("please-enter-a-friendly-url-that-does-not-end-with-a-slash");
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

  private boolean _jspx_meth_liferay$1ui_message_5(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_error_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_5.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_error_1);
    _jspx_th_liferay$1ui_message_5.setKey("please-enter-a-friendly-url-with-valid-characters");
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

  private boolean _jspx_meth_liferay$1ui_message_7(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_error_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_7.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_error_1);
    _jspx_th_liferay$1ui_message_7.setKey("the-friendly-url-may-conflict-with-another-page");
    int _jspx_eval_liferay$1ui_message_7 = _jspx_th_liferay$1ui_message_7.doStartTag();
    if (_jspx_th_liferay$1ui_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_7);
      _jspx_th_liferay$1ui_message_7.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_7);
    _jspx_th_liferay$1ui_message_7.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_8(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_error_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_8.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_error_1);
    _jspx_th_liferay$1ui_message_8.setKey("the-friendly-url-has-too-many-slashes");
    int _jspx_eval_liferay$1ui_message_8 = _jspx_th_liferay$1ui_message_8.doStartTag();
    if (_jspx_th_liferay$1ui_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_8);
      _jspx_th_liferay$1ui_message_8.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_8);
    _jspx_th_liferay$1ui_message_8.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_9(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_error_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_9.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_error_1);
    _jspx_th_liferay$1ui_message_9.setKey("please-enter-a-friendly-url-that-is-at-least-two-characters-long");
    int _jspx_eval_liferay$1ui_message_9 = _jspx_th_liferay$1ui_message_9.doStartTag();
    if (_jspx_th_liferay$1ui_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_9);
      _jspx_th_liferay$1ui_message_9.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_9);
    _jspx_th_liferay$1ui_message_9.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_10(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_error_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_10.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_error_2);
    _jspx_th_liferay$1ui_message_10.setKey("please-enter-a-unique-virtual-host");
    int _jspx_eval_liferay$1ui_message_10 = _jspx_th_liferay$1ui_message_10.doStartTag();
    if (_jspx_th_liferay$1ui_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_10);
      _jspx_th_liferay$1ui_message_10.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_10);
    _jspx_th_liferay$1ui_message_10.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_11(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_error_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_11.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_error_2);
    _jspx_th_liferay$1ui_message_11.setKey("virtual-hosts-must-be-valid-domain-names");
    int _jspx_eval_liferay$1ui_message_11 = _jspx_th_liferay$1ui_message_11.doStartTag();
    if (_jspx_th_liferay$1ui_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_11);
      _jspx_th_liferay$1ui_message_11.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_11);
    _jspx_th_liferay$1ui_message_11.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_12(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_12 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_12.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
    _jspx_th_liferay$1ui_message_12.setKey("enter-the-friendly-url-that-is-used-by-pages");
    int _jspx_eval_liferay$1ui_message_12 = _jspx_th_liferay$1ui_message_12.doStartTag();
    if (_jspx_th_liferay$1ui_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_12);
      _jspx_th_liferay$1ui_message_12.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_12);
    _jspx_th_liferay$1ui_message_12.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_14(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_14 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_14.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
    _jspx_th_liferay$1ui_message_14.setKey("enter-the-virtual-host-that-map-to-the-friendly-url");
    int _jspx_eval_liferay$1ui_message_14 = _jspx_th_liferay$1ui_message_14.doStartTag();
    if (_jspx_th_liferay$1ui_message_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_14);
      _jspx_th_liferay$1ui_message_14.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_14);
    _jspx_th_liferay$1ui_message_14.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_0(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_0.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
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

  private boolean _jspx_meth_liferay$1ui_message_16(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_16 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_16.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
    _jspx_th_liferay$1ui_message_16.setKey("pages");
    int _jspx_eval_liferay$1ui_message_16 = _jspx_th_liferay$1ui_message_16.doStartTag();
    if (_jspx_th_liferay$1ui_message_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_16);
      _jspx_th_liferay$1ui_message_16.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_16);
    _jspx_th_liferay$1ui_message_16.release();
    return false;
  }

  private boolean _jspx_meth_aui_option_0(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:option
    com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
    _jspx_th_aui_option_0.setPageContext(_jspx_page_context);
    _jspx_th_aui_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
    _jspx_th_aui_option_0.setLabel(new String("default-language"));
    _jspx_th_aui_option_0.setValue(new String(""));
    int _jspx_eval_aui_option_0 = _jspx_th_aui_option_0.doStartTag();
    if (_jspx_th_aui_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_0);
      _jspx_th_aui_option_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_0);
    _jspx_th_aui_option_0.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_1(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_1.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
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

  private boolean _jspx_meth_aui_option_2(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:option
    com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
    _jspx_th_aui_option_2.setPageContext(_jspx_page_context);
    _jspx_th_aui_option_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_1);
    _jspx_th_aui_option_2.setLabel(new String("default-language"));
    _jspx_th_aui_option_2.setValue(new String(""));
    int _jspx_eval_aui_option_2 = _jspx_th_aui_option_2.doStartTag();
    if (_jspx_th_aui_option_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_2);
      _jspx_th_aui_option_2.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_2);
    _jspx_th_aui_option_2.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_2(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_2.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
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

  private boolean _jspx_meth_portlet_namespace_3(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_3.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
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

  private boolean _jspx_meth_portlet_namespace_4(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_4.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
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

  private boolean _jspx_meth_portlet_namespace_5(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_5.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
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

  private boolean _jspx_meth_portlet_namespace_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_6.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_6.setParent(null);
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
}
