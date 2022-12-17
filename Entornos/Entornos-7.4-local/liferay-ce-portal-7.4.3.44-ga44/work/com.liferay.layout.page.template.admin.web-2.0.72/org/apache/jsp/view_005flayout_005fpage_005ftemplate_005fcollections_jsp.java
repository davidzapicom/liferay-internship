package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.frontend.taglib.servlet.taglib.util.EmptyResultMessageKeys;
import com.liferay.layout.page.template.admin.web.internal.constants.LayoutPageTemplateAdminWebKeys;
import com.liferay.layout.page.template.admin.web.internal.display.context.AssetDisplayPageUsagesDisplayContext;
import com.liferay.layout.page.template.admin.web.internal.display.context.AssetDisplayPageUsagesManagementToolbarDisplayContext;
import com.liferay.layout.page.template.admin.web.internal.display.context.DisplayPageDisplayContext;
import com.liferay.layout.page.template.admin.web.internal.display.context.DisplayPageManagementToolbarDisplayContext;
import com.liferay.layout.page.template.admin.web.internal.display.context.ImportDisplayContext;
import com.liferay.layout.page.template.admin.web.internal.display.context.LayoutPageTemplateCollectionsDisplayContext;
import com.liferay.layout.page.template.admin.web.internal.display.context.LayoutPageTemplateCollectionsManagementToolbarDisplayContext;
import com.liferay.layout.page.template.admin.web.internal.display.context.LayoutPageTemplateDisplayContext;
import com.liferay.layout.page.template.admin.web.internal.display.context.LayoutPageTemplateManagementToolbarDisplayContext;
import com.liferay.layout.page.template.admin.web.internal.display.context.LayoutPageTemplatesAdminDisplayContext;
import com.liferay.layout.page.template.admin.web.internal.display.context.LayoutPrototypeDisplayContext;
import com.liferay.layout.page.template.admin.web.internal.display.context.LayoutPrototypeManagementToolbarDisplayContext;
import com.liferay.layout.page.template.admin.web.internal.display.context.MasterLayoutDisplayContext;
import com.liferay.layout.page.template.admin.web.internal.display.context.MasterLayoutManagementToolbarDisplayContext;
import com.liferay.layout.page.template.admin.web.internal.display.context.SelectDisplayPageMasterLayoutDisplayContext;
import com.liferay.layout.page.template.admin.web.internal.frontend.taglib.clay.servlet.taglib.DisplayPageVerticalCard;
import com.liferay.layout.page.template.admin.web.internal.frontend.taglib.clay.servlet.taglib.LayoutPageTemplateEntryVerticalCard;
import com.liferay.layout.page.template.admin.web.internal.frontend.taglib.clay.servlet.taglib.LayoutPrototypeVerticalCard;
import com.liferay.layout.page.template.admin.web.internal.frontend.taglib.clay.servlet.taglib.MasterLayoutVerticalCard;
import com.liferay.layout.page.template.admin.web.internal.frontend.taglib.clay.servlet.taglib.SelectDisplayPageMasterLayoutVerticalCard;
import com.liferay.layout.page.template.admin.web.internal.frontend.taglib.clay.servlet.taglib.SelectLayoutPageTemplateEntryMasterLayoutVerticalCard;
import com.liferay.layout.page.template.admin.web.internal.servlet.taglib.util.LayoutPageTemplateCollectionActionDropdownItem;
import com.liferay.layout.page.template.constants.LayoutPageTemplateActionKeys;
import com.liferay.layout.page.template.constants.LayoutPageTemplateEntryTypeConstants;
import com.liferay.layout.page.template.exception.DuplicateLayoutPageTemplateCollectionException;
import com.liferay.layout.page.template.exception.LayoutPageTemplateCollectionNameException;
import com.liferay.layout.page.template.exception.LayoutPageTemplateEntryNameException;
import com.liferay.layout.page.template.exception.RequiredLayoutPageTemplateEntryException;
import com.liferay.layout.page.template.importer.LayoutPageTemplatesImporterResultEntry;
import com.liferay.layout.page.template.model.LayoutPageTemplateCollection;
import com.liferay.layout.page.template.model.LayoutPageTemplateEntry;
import com.liferay.layout.page.template.service.LayoutPageTemplateCollectionLocalServiceUtil;
import com.liferay.layout.page.template.service.LayoutPageTemplateEntryLocalServiceUtil;
import com.liferay.layout.page.template.service.LayoutPageTemplateEntryServiceUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.RequiredLayoutPrototypeException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.LayoutPrototype;
import com.liferay.portal.kernel.model.ModelHintsUtil;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.portlet.url.builder.PortletURLBuilder;
import com.liferay.portal.kernel.service.LayoutPrototypeServiceUtil;
import com.liferay.portal.kernel.servlet.MultiSessionMessages;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.impl.LayoutPrototypeImpl;
import com.liferay.portal.util.PropsValues;
import com.liferay.sites.kernel.util.SitesUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.portlet.PortletURL;
import javax.portlet.WindowState;

public final class view_005flayout_005fpage_005ftemplate_005fcollections_jsp extends org.apache.jasper.runtime.HttpJspBase
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

LayoutPageTemplatesAdminDisplayContext layoutPageTemplatesAdminDisplayContext = new LayoutPageTemplatesAdminDisplayContext(liferayPortletRequest, liferayPortletResponse);

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');

LayoutPageTemplateDisplayContext layoutPageTemplateDisplayContext = new LayoutPageTemplateDisplayContext(request, renderRequest, renderResponse);

List<LayoutPageTemplateCollection> layoutPageTemplateCollections = layoutPageTemplateDisplayContext.getLayoutPageTemplateCollections();

      out.write('\n');
      out.write('\n');
      //  clay:navigation-bar
      com.liferay.frontend.taglib.clay.servlet.taglib.NavigationBarTag _jspx_th_clay_navigation$1bar_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.NavigationBarTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.NavigationBarTag();
      _jspx_th_clay_navigation$1bar_0.setPageContext(_jspx_page_context);
      _jspx_th_clay_navigation$1bar_0.setParent(null);
      _jspx_th_clay_navigation$1bar_0.setInverted( true );
      _jspx_th_clay_navigation$1bar_0.setNavigationItems( layoutPageTemplatesAdminDisplayContext.getNavigationItems() );
      int _jspx_eval_clay_navigation$1bar_0 = _jspx_th_clay_navigation$1bar_0.doStartTag();
      if (_jspx_th_clay_navigation$1bar_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_navigation$1bar_0);
        _jspx_th_clay_navigation$1bar_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_navigation$1bar_0);
      _jspx_th_clay_navigation$1bar_0.release();
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_liferay$1ui_success_0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      //  clay:container-fluid
      com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag _jspx_th_clay_container$1fluid_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag();
      _jspx_th_clay_container$1fluid_0.setPageContext(_jspx_page_context);
      _jspx_th_clay_container$1fluid_0.setParent(null);
      _jspx_th_clay_container$1fluid_0.setCssClass("container-view");
      int _jspx_eval_clay_container$1fluid_0 = _jspx_th_clay_container$1fluid_0.doStartTag();
      if (_jspx_eval_clay_container$1fluid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write('\n');
        out.write('	');
        //  clay:row
        com.liferay.frontend.taglib.clay.servlet.taglib.RowTag _jspx_th_clay_row_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.RowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.RowTag();
        _jspx_th_clay_row_0.setPageContext(_jspx_page_context);
        _jspx_th_clay_row_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_0);
        int _jspx_eval_clay_row_0 = _jspx_th_clay_row_0.doStartTag();
        if (_jspx_eval_clay_row_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t");
          //  clay:col
          com.liferay.frontend.taglib.clay.servlet.taglib.ColTag _jspx_th_clay_col_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ColTag();
          _jspx_th_clay_col_0.setPageContext(_jspx_page_context);
          _jspx_th_clay_col_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_row_0);
          _jspx_th_clay_col_0.setLg("3");
          int _jspx_eval_clay_col_0 = _jspx_th_clay_col_0.doStartTag();
          if (_jspx_eval_clay_col_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t<nav class=\"menubar menubar-transparent menubar-vertical-expand-lg\">\n");
            out.write("\t\t\t\t<ul class=\"nav nav-nested\">\n");
            out.write("\t\t\t\t\t<li class=\"nav-item\">\n");
            out.write("\t\t\t\t\t\t");
            //  portlet:renderURL
            com.liferay.taglib.portlet.RenderURLTag _jspx_th_portlet_renderURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.RenderURLTag.class) : new com.liferay.taglib.portlet.RenderURLTag();
            _jspx_th_portlet_renderURL_0.setPageContext(_jspx_page_context);
            _jspx_th_portlet_renderURL_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
            _jspx_th_portlet_renderURL_0.setVar("editLayoutPageTemplateCollectionURL");
            int _jspx_eval_portlet_renderURL_0 = _jspx_th_portlet_renderURL_0.doStartTag();
            if (_jspx_eval_portlet_renderURL_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              if (_jspx_meth_portlet_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_portlet_renderURL_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  portlet:param
              com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
              _jspx_th_portlet_param_1.setPageContext(_jspx_page_context);
              _jspx_th_portlet_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_renderURL_0);
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
              out.write("\t\t\t\t\t\t");
            }
            if (_jspx_th_portlet_renderURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_renderURL_0);
              _jspx_th_portlet_renderURL_0.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_renderURL_0);
            _jspx_th_portlet_renderURL_0.release();
            java.lang.String editLayoutPageTemplateCollectionURL = null;
            editLayoutPageTemplateCollectionURL = (java.lang.String) _jspx_page_context.findAttribute("editLayoutPageTemplateCollectionURL");
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t");
if (
 ListUtil.isNotEmpty(layoutPageTemplateCollections) ) {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t");
            //  clay:content-row
            com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag _jspx_th_clay_content$1row_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag();
            _jspx_th_clay_content$1row_0.setPageContext(_jspx_page_context);
            _jspx_th_clay_content$1row_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
            _jspx_th_clay_content$1row_0.setVerticalAlign("center");
            int _jspx_eval_clay_content$1row_0 = _jspx_th_clay_content$1row_0.doStartTag();
            if (_jspx_eval_clay_content$1row_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t");
              //  clay:content-col
              com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
              _jspx_th_clay_content$1col_0.setPageContext(_jspx_page_context);
              _jspx_th_clay_content$1col_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_0);
              _jspx_th_clay_content$1col_0.setExpand( true );
              int _jspx_eval_clay_content$1col_0 = _jspx_th_clay_content$1col_0.doStartTag();
              if (_jspx_eval_clay_content$1col_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t<strong class=\"text-uppercase\">\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t");
                if (_jspx_meth_liferay$1ui_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_content$1col_0, _jspx_page_context))
                  return;
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t</strong>\n");
                out.write("\t\t\t\t\t\t\t\t\t");
              }
              if (_jspx_th_clay_content$1col_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_0);
                _jspx_th_clay_content$1col_0.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_0);
              _jspx_th_clay_content$1col_0.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t");
              //  clay:content-col
              com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
              _jspx_th_clay_content$1col_1.setPageContext(_jspx_page_context);
              _jspx_th_clay_content$1col_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_0);
              _jspx_th_clay_content$1col_1.setDynamicAttribute(null, "verticalAlign", new String("end"));
              int _jspx_eval_clay_content$1col_1 = _jspx_th_clay_content$1col_1.doStartTag();
              if (_jspx_eval_clay_content$1col_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"navbar-nav\">\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t");
if (
 layoutPageTemplateDisplayContext.isShowAddButton(LayoutPageTemplateActionKeys.ADD_LAYOUT_PAGE_TEMPLATE_COLLECTION) ) {
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li>\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
                //  clay:link
                com.liferay.frontend.taglib.clay.servlet.taglib.LinkTag _jspx_th_clay_link_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.LinkTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.LinkTag();
                _jspx_th_clay_link_0.setPageContext(_jspx_page_context);
                _jspx_th_clay_link_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_1);
                _jspx_th_clay_link_0.setBorderless( true );
                _jspx_th_clay_link_0.setCssClass("component-action");
                _jspx_th_clay_link_0.setHref( editLayoutPageTemplateCollectionURL.toString() );
                _jspx_th_clay_link_0.setIcon("plus");
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
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t");
}
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t<li>\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                //  portlet:renderURL
                com.liferay.taglib.portlet.RenderURLTag _jspx_th_portlet_renderURL_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.RenderURLTag.class) : new com.liferay.taglib.portlet.RenderURLTag();
                _jspx_th_portlet_renderURL_1.setPageContext(_jspx_page_context);
                _jspx_th_portlet_renderURL_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_1);
                _jspx_th_portlet_renderURL_1.setVar("viewLayoutPageTemplateCollectionURL");
                _jspx_th_portlet_renderURL_1.setWindowState( LiferayWindowState.POP_UP.toString() );
                int _jspx_eval_portlet_renderURL_1 = _jspx_th_portlet_renderURL_1.doStartTag();
                if (_jspx_eval_portlet_renderURL_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_portlet_param_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_portlet_renderURL_1, _jspx_page_context))
                    return;
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                }
                if (_jspx_th_portlet_renderURL_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_renderURL_1);
                  _jspx_th_portlet_renderURL_1.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_renderURL_1);
                _jspx_th_portlet_renderURL_1.release();
                java.lang.String viewLayoutPageTemplateCollectionURL = null;
                viewLayoutPageTemplateCollectionURL = (java.lang.String) _jspx_page_context.findAttribute("viewLayoutPageTemplateCollectionURL");
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                //  portlet:renderURL
                com.liferay.taglib.portlet.RenderURLTag _jspx_th_portlet_renderURL_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.RenderURLTag.class) : new com.liferay.taglib.portlet.RenderURLTag();
                _jspx_th_portlet_renderURL_2.setPageContext(_jspx_page_context);
                _jspx_th_portlet_renderURL_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_1);
                _jspx_th_portlet_renderURL_2.setVar("redirectURL");
                int _jspx_eval_portlet_renderURL_2 = _jspx_th_portlet_renderURL_2.doStartTag();
                if (_jspx_eval_portlet_renderURL_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_portlet_param_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_portlet_renderURL_2, _jspx_page_context))
                    return;
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                }
                if (_jspx_th_portlet_renderURL_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_renderURL_2);
                  _jspx_th_portlet_renderURL_2.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_renderURL_2);
                _jspx_th_portlet_renderURL_2.release();
                java.lang.String redirectURL = null;
                redirectURL = (java.lang.String) _jspx_page_context.findAttribute("redirectURL");
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                //  liferay-portlet:actionURL
                com.liferay.taglib.portlet.ActionURLTag _jspx_th_liferay$1portlet_actionURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ActionURLTag.class) : new com.liferay.taglib.portlet.ActionURLTag();
                _jspx_th_liferay$1portlet_actionURL_0.setPageContext(_jspx_page_context);
                _jspx_th_liferay$1portlet_actionURL_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_1);
                _jspx_th_liferay$1portlet_actionURL_0.setCopyCurrentRenderParameters( false );
                _jspx_th_liferay$1portlet_actionURL_0.setName("/layout_page_template_admin/delete_layout_page_template_collection");
                _jspx_th_liferay$1portlet_actionURL_0.setVar("deleteLayoutPageTemplateCollectionURL");
                int _jspx_eval_liferay$1portlet_actionURL_0 = _jspx_th_liferay$1portlet_actionURL_0.doStartTag();
                if (_jspx_eval_liferay$1portlet_actionURL_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  //  portlet:param
                  com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
                  _jspx_th_portlet_param_4.setPageContext(_jspx_page_context);
                  _jspx_th_portlet_param_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1portlet_actionURL_0);
                  _jspx_th_portlet_param_4.setName("redirect");
                  _jspx_th_portlet_param_4.setValue( redirectURL );
                  int _jspx_eval_portlet_param_4 = _jspx_th_portlet_param_4.doStartTag();
                  if (_jspx_th_portlet_param_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_4);
                    _jspx_th_portlet_param_4.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_4);
                  _jspx_th_portlet_param_4.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                }
                if (_jspx_th_liferay$1portlet_actionURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_actionURL_0);
                  _jspx_th_liferay$1portlet_actionURL_0.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_actionURL_0);
                _jspx_th_liferay$1portlet_actionURL_0.release();
                java.lang.String deleteLayoutPageTemplateCollectionURL = null;
                deleteLayoutPageTemplateCollectionURL = (java.lang.String) _jspx_page_context.findAttribute("deleteLayoutPageTemplateCollectionURL");
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                //  clay:dropdown-actions
                com.liferay.frontend.taglib.clay.servlet.taglib.DropdownActionsTag _jspx_th_clay_dropdown$1actions_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.DropdownActionsTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.DropdownActionsTag();
                _jspx_th_clay_dropdown$1actions_0.setPageContext(_jspx_page_context);
                _jspx_th_clay_dropdown$1actions_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_1);
                _jspx_th_clay_dropdown$1actions_0.setAdditionalProps(
														HashMapBuilder.<String, Object>put(
															"deleteLayoutPageTemplateCollectionURL", deleteLayoutPageTemplateCollectionURL.toString()
														).put(
															"viewLayoutPageTemplateCollectionURL", viewLayoutPageTemplateCollectionURL.toString()
														).build()
													);
                _jspx_th_clay_dropdown$1actions_0.setDropdownItems( layoutPageTemplateDisplayContext.getCollectionsDropdownItems() );
                _jspx_th_clay_dropdown$1actions_0.setPropsTransformer("js/ActionsComponentPropsTransformer");
                int _jspx_eval_clay_dropdown$1actions_0 = _jspx_th_clay_dropdown$1actions_0.doStartTag();
                if (_jspx_th_clay_dropdown$1actions_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_dropdown$1actions_0);
                  _jspx_th_clay_dropdown$1actions_0.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_dropdown$1actions_0);
                _jspx_th_clay_dropdown$1actions_0.release();
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t</li>\n");
                out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
                out.write("\t\t\t\t\t\t\t\t\t");
              }
              if (_jspx_th_clay_content$1col_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_1);
                _jspx_th_clay_content$1col_1.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_1);
              _jspx_th_clay_content$1col_1.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t");
            }
            if (_jspx_th_clay_content$1row_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_0);
              _jspx_th_clay_content$1row_0.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_0);
            _jspx_th_clay_content$1row_0.release();
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t<ul class=\"nav nav-stacked\">\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t");

									for (LayoutPageTemplateCollection layoutPageTemplateCollection : layoutPageTemplateCollections) {
									
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"nav-item\">\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<a\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"nav-link text-truncate ");
            out.print( (layoutPageTemplateCollection.getLayoutPageTemplateCollectionId() == layoutPageTemplateDisplayContext.getLayoutPageTemplateCollectionId()) ? "active" : StringPool.BLANK );
            out.write("\"\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"");
            out.print(
													PortletURLBuilder.createRenderURL(
														renderResponse
													).setTabs1(
														"page-templates"
													).setParameter(
														"layoutPageTemplateCollectionId", layoutPageTemplateCollection.getLayoutPageTemplateCollectionId()
													).buildString()
												);
            out.write("\"\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
            out.print( HtmlUtil.escape(layoutPageTemplateCollection.getName()) );
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t");

									}
									
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t</ul>\n");
            out.write("\t\t\t\t\t\t\t");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t");
}
else {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t<p class=\"text-uppercase\">\n");
            out.write("\t\t\t\t\t\t\t\t\t<strong>");
            if (_jspx_meth_liferay$1ui_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_col_0, _jspx_page_context))
              return;
            out.write("</strong>\n");
            out.write("\t\t\t\t\t\t\t\t</p>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t");
            //  liferay-frontend:empty-result-message
            com.liferay.frontend.taglib.servlet.taglib.EmptyResultMessageTag _jspx_th_liferay$1frontend_empty$1result$1message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.EmptyResultMessageTag.class) : new com.liferay.frontend.taglib.servlet.taglib.EmptyResultMessageTag();
            _jspx_th_liferay$1frontend_empty$1result$1message_0.setPageContext(_jspx_page_context);
            _jspx_th_liferay$1frontend_empty$1result$1message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
            _jspx_th_liferay$1frontend_empty$1result$1message_0.setActionDropdownItems( layoutPageTemplateDisplayContext.isShowAddButton(LayoutPageTemplateActionKeys.ADD_LAYOUT_PAGE_TEMPLATE_COLLECTION) ? layoutPageTemplateDisplayContext.getActionDropdownItems() : null );
            _jspx_th_liferay$1frontend_empty$1result$1message_0.setAnimationType( EmptyResultMessageKeys.AnimationType.NONE );
            _jspx_th_liferay$1frontend_empty$1result$1message_0.setDescription( LanguageUtil.get(request, "page-template-sets-are-needed-to-create-page-templates") );
            _jspx_th_liferay$1frontend_empty$1result$1message_0.setElementType( LanguageUtil.get(request, "page-template-sets") );
            int _jspx_eval_liferay$1frontend_empty$1result$1message_0 = _jspx_th_liferay$1frontend_empty$1result$1message_0.doStartTag();
            if (_jspx_th_liferay$1frontend_empty$1result$1message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_empty$1result$1message_0);
              _jspx_th_liferay$1frontend_empty$1result$1message_0.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_empty$1result$1message_0);
            _jspx_th_liferay$1frontend_empty$1result$1message_0.release();
            out.write("\n");
            out.write("\t\t\t\t\t\t\t");
            out.write("\n");
            out.write("\t\t\t\t\t\t");
}
            out.write("\n");
            out.write("\t\t\t\t\t</li>\n");
            out.write("\t\t\t\t</ul>\n");
            out.write("\t\t\t</nav>\n");
            out.write("\t\t");
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
          out.write("\t\t");
          //  clay:col
          com.liferay.frontend.taglib.clay.servlet.taglib.ColTag _jspx_th_clay_col_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ColTag();
          _jspx_th_clay_col_1.setPageContext(_jspx_page_context);
          _jspx_th_clay_col_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_row_0);
          _jspx_th_clay_col_1.setLg("9");
          int _jspx_eval_clay_col_1 = _jspx_th_clay_col_1.doStartTag();
          if (_jspx_eval_clay_col_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t");

			LayoutPageTemplateCollection layoutPageTemplateCollection = layoutPageTemplateDisplayContext.getLayoutPageTemplateCollection();
			
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t");
if (
 layoutPageTemplateCollection != null ) {
            out.write("\n");
            out.write("\t\t\t\t");
            //  clay:sheet
            com.liferay.frontend.taglib.clay.servlet.taglib.SheetTag _jspx_th_clay_sheet_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.SheetTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.SheetTag();
            _jspx_th_clay_sheet_0.setPageContext(_jspx_page_context);
            _jspx_th_clay_sheet_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_1);
            _jspx_th_clay_sheet_0.setSize("full");
            int _jspx_eval_clay_sheet_0 = _jspx_th_clay_sheet_0.doStartTag();
            if (_jspx_eval_clay_sheet_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              out.write("\n");
              out.write("\t\t\t\t\t<h2 class=\"sheet-title\">\n");
              out.write("\t\t\t\t\t\t");
              //  clay:content-row
              com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag _jspx_th_clay_content$1row_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag();
              _jspx_th_clay_content$1row_1.setPageContext(_jspx_page_context);
              _jspx_th_clay_content$1row_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet_0);
              _jspx_th_clay_content$1row_1.setVerticalAlign("center");
              int _jspx_eval_clay_content$1row_1 = _jspx_th_clay_content$1row_1.doStartTag();
              if (_jspx_eval_clay_content$1row_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                out.write("\n");
                out.write("\t\t\t\t\t\t\t");
                //  clay:content-col
                com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
                _jspx_th_clay_content$1col_2.setPageContext(_jspx_page_context);
                _jspx_th_clay_content$1col_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_1);
                _jspx_th_clay_content$1col_2.setExpand( true );
                int _jspx_eval_clay_content$1col_2 = _jspx_th_clay_content$1col_2.doStartTag();
                if (_jspx_eval_clay_content$1col_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t<span class=\"text-uppercase\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t");
                  out.print( HtmlUtil.escape(layoutPageTemplateCollection.getName()) );
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t</span>\n");
                  out.write("\t\t\t\t\t\t\t");
                }
                if (_jspx_th_clay_content$1col_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_2);
                  _jspx_th_clay_content$1col_2.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_2);
                _jspx_th_clay_content$1col_2.release();
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t\t\t");
                //  clay:content-col
                com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
                _jspx_th_clay_content$1col_3.setPageContext(_jspx_page_context);
                _jspx_th_clay_content$1col_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_1);
                _jspx_th_clay_content$1col_3.setCssClass("inline-item-after");
                _jspx_th_clay_content$1col_3.setDynamicAttribute(null, "verticalAlign", new String("end"));
                int _jspx_eval_clay_content$1col_3 = _jspx_th_clay_content$1col_3.doStartTag();
                if (_jspx_eval_clay_content$1col_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t");

								LayoutPageTemplateCollectionActionDropdownItem layoutPageTemplateCollectionActionDropdownItem = new LayoutPageTemplateCollectionActionDropdownItem(request, renderResponse);
								
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  clay:dropdown-actions
                  com.liferay.frontend.taglib.clay.servlet.taglib.DropdownActionsTag _jspx_th_clay_dropdown$1actions_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.DropdownActionsTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.DropdownActionsTag();
                  _jspx_th_clay_dropdown$1actions_1.setPageContext(_jspx_page_context);
                  _jspx_th_clay_dropdown$1actions_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_3);
                  _jspx_th_clay_dropdown$1actions_1.setDropdownItems( layoutPageTemplateCollectionActionDropdownItem.getActionDropdownItems(layoutPageTemplateCollection) );
                  _jspx_th_clay_dropdown$1actions_1.setPropsTransformer("js/propsTransformers/LayoutPageTemplateCollectionPropsTransformer");
                  int _jspx_eval_clay_dropdown$1actions_1 = _jspx_th_clay_dropdown$1actions_1.doStartTag();
                  if (_jspx_th_clay_dropdown$1actions_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_dropdown$1actions_1);
                    _jspx_th_clay_dropdown$1actions_1.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_dropdown$1actions_1);
                  _jspx_th_clay_dropdown$1actions_1.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t");
                }
                if (_jspx_th_clay_content$1col_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_3);
                  _jspx_th_clay_content$1col_3.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_3);
                _jspx_th_clay_content$1col_3.release();
                out.write("\n");
                out.write("\t\t\t\t\t\t");
              }
              if (_jspx_th_clay_content$1row_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_1);
                _jspx_th_clay_content$1row_1.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_1);
              _jspx_th_clay_content$1row_1.release();
              out.write("\n");
              out.write("\t\t\t\t\t</h2>\n");
              out.write("\n");
              out.write("\t\t\t\t\t");
              //  clay:sheet-section
              com.liferay.frontend.taglib.clay.servlet.taglib.SheetSectionTag _jspx_th_clay_sheet$1section_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.SheetSectionTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.SheetSectionTag();
              _jspx_th_clay_sheet$1section_0.setPageContext(_jspx_page_context);
              _jspx_th_clay_sheet$1section_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet_0);
              int _jspx_eval_clay_sheet$1section_0 = _jspx_th_clay_sheet$1section_0.doStartTag();
              if (_jspx_eval_clay_sheet$1section_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                out.write("\n");
                out.write("\t\t\t\t\t\t");
                //  liferay-util:include
                com.liferay.taglib.util.IncludeTag _jspx_th_liferay$1util_include_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.IncludeTag.class) : new com.liferay.taglib.util.IncludeTag();
                _jspx_th_liferay$1util_include_0.setPageContext(_jspx_page_context);
                _jspx_th_liferay$1util_include_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
                _jspx_th_liferay$1util_include_0.setPage("/view_layout_page_template_entries.jsp");
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
                out.write("\t\t\t\t\t");
              }
              if (_jspx_th_clay_sheet$1section_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sheet$1section_0);
                _jspx_th_clay_sheet$1section_0.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sheet$1section_0);
              _jspx_th_clay_sheet$1section_0.release();
              out.write("\n");
              out.write("\t\t\t\t");
            }
            if (_jspx_th_clay_sheet_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sheet_0);
              _jspx_th_clay_sheet_0.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sheet_0);
            _jspx_th_clay_sheet_0.release();
            out.write("\n");
            out.write("\t\t\t");
}
            out.write("\n");
            out.write("\t\t");
          }
          if (_jspx_th_clay_col_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_1);
            _jspx_th_clay_col_1.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_1);
          _jspx_th_clay_col_1.release();
          out.write('\n');
          out.write('	');
        }
        if (_jspx_th_clay_row_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_row_0);
          _jspx_th_clay_row_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_row_0);
        _jspx_th_clay_row_0.release();
        out.write('\n');
      }
      if (_jspx_th_clay_container$1fluid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_0);
        _jspx_th_clay_container$1fluid_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_0);
      _jspx_th_clay_container$1fluid_0.release();
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

  private boolean _jspx_meth_liferay$1ui_success_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:success
    com.liferay.taglib.ui.SuccessTag _jspx_th_liferay$1ui_success_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SuccessTag.class) : new com.liferay.taglib.ui.SuccessTag();
    _jspx_th_liferay$1ui_success_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_success_0.setParent(null);
    _jspx_th_liferay$1ui_success_0.setKey("layoutPageTemplatePublished");
    _jspx_th_liferay$1ui_success_0.setMessage("the-page-template-was-published-successfully");
    int _jspx_eval_liferay$1ui_success_0 = _jspx_th_liferay$1ui_success_0.doStartTag();
    if (_jspx_th_liferay$1ui_success_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_success_0);
      _jspx_th_liferay$1ui_success_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_success_0);
    _jspx_th_liferay$1ui_success_0.release();
    return false;
  }

  private boolean _jspx_meth_portlet_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_portlet_renderURL_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:param
    com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
    _jspx_th_portlet_param_0.setPageContext(_jspx_page_context);
    _jspx_th_portlet_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_renderURL_0);
    _jspx_th_portlet_param_0.setName("mvcRenderCommandName");
    _jspx_th_portlet_param_0.setValue("/layout_page_template_admin/edit_layout_page_template_collection");
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

  private boolean _jspx_meth_liferay$1ui_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_content$1col_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_0);
    _jspx_th_liferay$1ui_message_0.setKey("page-template-sets");
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

  private boolean _jspx_meth_portlet_param_2(javax.servlet.jsp.tagext.JspTag _jspx_th_portlet_renderURL_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:param
    com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
    _jspx_th_portlet_param_2.setPageContext(_jspx_page_context);
    _jspx_th_portlet_param_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_renderURL_1);
    _jspx_th_portlet_param_2.setName("mvcRenderCommandName");
    _jspx_th_portlet_param_2.setValue("/layout_page_template_admin/select_layout_page_template_collections");
    int _jspx_eval_portlet_param_2 = _jspx_th_portlet_param_2.doStartTag();
    if (_jspx_th_portlet_param_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_2);
      _jspx_th_portlet_param_2.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_2);
    _jspx_th_portlet_param_2.release();
    return false;
  }

  private boolean _jspx_meth_portlet_param_3(javax.servlet.jsp.tagext.JspTag _jspx_th_portlet_renderURL_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:param
    com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
    _jspx_th_portlet_param_3.setPageContext(_jspx_page_context);
    _jspx_th_portlet_param_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_renderURL_2);
    _jspx_th_portlet_param_3.setName("tabs1");
    _jspx_th_portlet_param_3.setValue("page-templates");
    int _jspx_eval_portlet_param_3 = _jspx_th_portlet_param_3.doStartTag();
    if (_jspx_th_portlet_param_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_3);
      _jspx_th_portlet_param_3.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_3);
    _jspx_th_portlet_param_3.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_col_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
    _jspx_th_liferay$1ui_message_1.setKey("page-template-sets");
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
}
