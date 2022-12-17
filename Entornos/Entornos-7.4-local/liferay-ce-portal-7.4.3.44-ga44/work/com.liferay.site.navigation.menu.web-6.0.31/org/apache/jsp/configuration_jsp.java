package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.item.selector.constants.ItemSelectorPortletKeys;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.theme.NavItem;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.site.navigation.constants.SiteNavigationConstants;
import com.liferay.site.navigation.menu.web.internal.constants.SiteNavigationMenuWebKeys;
import com.liferay.site.navigation.menu.web.internal.display.context.SiteNavigationMenuDisplayContext;
import com.liferay.site.navigation.model.SiteNavigationMenu;
import com.liferay.site.navigation.model.SiteNavigationMenuItem;
import com.liferay.site.navigation.service.SiteNavigationMenuItemLocalServiceUtil;
import com.liferay.site.navigation.service.SiteNavigationMenuLocalServiceUtil;
import com.liferay.site.navigation.type.SiteNavigationMenuItemType;
import com.liferay.site.navigation.type.SiteNavigationMenuItemTypeRegistry;

public final class configuration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(12);
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/META-INF/c.tld");
    _jspx_dependants.add("/META-INF/liferay-portlet_2_0.tld");
    _jspx_dependants.add("/META-INF/liferay-aui.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-clay.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-frontend.tld");
    _jspx_dependants.add("/META-INF/liferay-portlet-ext.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-site-navigation.tld");
    _jspx_dependants.add("/META-INF/resources/liferay-template.tld");
    _jspx_dependants.add("/META-INF/liferay-theme.tld");
    _jspx_dependants.add("/META-INF/liferay-ui.tld");
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

String portletResource = ParamUtil.getString(request, "portletResource");

SiteNavigationMenuDisplayContext siteNavigationMenuDisplayContext = new SiteNavigationMenuDisplayContext(request);

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');

String rootMenuItemType = siteNavigationMenuDisplayContext.getRootMenuItemType();

SiteNavigationMenu siteNavigationMenu = siteNavigationMenuDisplayContext.getSiteNavigationMenu();

      out.write('\n');
      out.write('\n');
      //  liferay-portlet:actionURL
      com.liferay.taglib.portlet.ActionURLTag _jspx_th_liferay$1portlet_actionURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ActionURLTag.class) : new com.liferay.taglib.portlet.ActionURLTag();
      _jspx_th_liferay$1portlet_actionURL_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1portlet_actionURL_0.setParent(null);
      _jspx_th_liferay$1portlet_actionURL_0.setPortletConfiguration( true );
      _jspx_th_liferay$1portlet_actionURL_0.setVar("configurationActionURL");
      int _jspx_eval_liferay$1portlet_actionURL_0 = _jspx_th_liferay$1portlet_actionURL_0.doStartTag();
      if (_jspx_th_liferay$1portlet_actionURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_actionURL_0);
        _jspx_th_liferay$1portlet_actionURL_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_actionURL_0);
      _jspx_th_liferay$1portlet_actionURL_0.release();
      java.lang.String configurationActionURL = null;
      configurationActionURL = (java.lang.String) _jspx_page_context.findAttribute("configurationActionURL");
      out.write('\n');
      out.write('\n');
      //  liferay-portlet:renderURL
      com.liferay.taglib.portlet.RenderURLTag _jspx_th_liferay$1portlet_renderURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.RenderURLTag.class) : new com.liferay.taglib.portlet.RenderURLTag();
      _jspx_th_liferay$1portlet_renderURL_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1portlet_renderURL_0.setParent(null);
      _jspx_th_liferay$1portlet_renderURL_0.setPortletConfiguration( true );
      _jspx_th_liferay$1portlet_renderURL_0.setVar("configurationRenderURL");
      int _jspx_eval_liferay$1portlet_renderURL_0 = _jspx_th_liferay$1portlet_renderURL_0.doStartTag();
      if (_jspx_th_liferay$1portlet_renderURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_renderURL_0);
        _jspx_th_liferay$1portlet_renderURL_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_renderURL_0);
      _jspx_th_liferay$1portlet_renderURL_0.release();
      java.lang.String configurationRenderURL = null;
      configurationRenderURL = (java.lang.String) _jspx_page_context.findAttribute("configurationRenderURL");
      out.write('\n');
      out.write('\n');
      //  liferay-frontend:edit-form
      com.liferay.frontend.taglib.servlet.taglib.EditFormTag _jspx_th_liferay$1frontend_edit$1form_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.EditFormTag.class) : new com.liferay.frontend.taglib.servlet.taglib.EditFormTag();
      _jspx_th_liferay$1frontend_edit$1form_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1frontend_edit$1form_0.setParent(null);
      _jspx_th_liferay$1frontend_edit$1form_0.setAction( configurationActionURL );
      _jspx_th_liferay$1frontend_edit$1form_0.setMethod("post");
      _jspx_th_liferay$1frontend_edit$1form_0.setName("fm");
      int _jspx_eval_liferay$1frontend_edit$1form_0 = _jspx_th_liferay$1frontend_edit$1form_0.doStartTag();
      if (_jspx_eval_liferay$1frontend_edit$1form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write('\n');
        out.write('	');
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_0.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form_0);
        _jspx_th_aui_input_0.setName( Constants.CMD );
        _jspx_th_aui_input_0.setType("hidden");
        _jspx_th_aui_input_0.setValue( Constants.UPDATE );
        int _jspx_eval_aui_input_0 = _jspx_th_aui_input_0.doStartTag();
        if (_jspx_th_aui_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_0);
          _jspx_th_aui_input_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_0);
        _jspx_th_aui_input_0.release();
        out.write('\n');
        out.write('	');
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_1.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form_0);
        _jspx_th_aui_input_1.setName("redirect");
        _jspx_th_aui_input_1.setType("hidden");
        _jspx_th_aui_input_1.setValue( configurationRenderURL );
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
        out.write("\t");
        //  liferay-frontend:edit-form-body
        com.liferay.frontend.taglib.servlet.taglib.EditFormBodyTag _jspx_th_liferay$1frontend_edit$1form$1body_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.EditFormBodyTag.class) : new com.liferay.frontend.taglib.servlet.taglib.EditFormBodyTag();
        _jspx_th_liferay$1frontend_edit$1form$1body_0.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1frontend_edit$1form$1body_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form_0);
        int _jspx_eval_liferay$1frontend_edit$1form$1body_0 = _jspx_th_liferay$1frontend_edit$1form$1body_0.doStartTag();
        if (_jspx_eval_liferay$1frontend_edit$1form$1body_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t");
          //  clay:row
          com.liferay.frontend.taglib.clay.servlet.taglib.RowTag _jspx_th_clay_row_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.RowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.RowTag();
          _jspx_th_clay_row_0.setPageContext(_jspx_page_context);
          _jspx_th_clay_row_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form$1body_0);
          int _jspx_eval_clay_row_0 = _jspx_th_clay_row_0.doStartTag();
          if (_jspx_eval_clay_row_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t");
            //  clay:col
            com.liferay.frontend.taglib.clay.servlet.taglib.ColTag _jspx_th_clay_col_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ColTag();
            _jspx_th_clay_col_0.setPageContext(_jspx_page_context);
            _jspx_th_clay_col_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_row_0);
            _jspx_th_clay_col_0.setMd("6");
            int _jspx_eval_clay_col_0 = _jspx_th_clay_col_0.doStartTag();
            if (_jspx_eval_clay_col_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              out.write("\n");
              out.write("\t\t\t\t");
              //  liferay-frontend:fieldset-group
              com.liferay.frontend.taglib.servlet.taglib.FieldsetGroupTag _jspx_th_liferay$1frontend_fieldset$1group_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.FieldsetGroupTag.class) : new com.liferay.frontend.taglib.servlet.taglib.FieldsetGroupTag();
              _jspx_th_liferay$1frontend_fieldset$1group_0.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1frontend_fieldset$1group_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
              int _jspx_eval_liferay$1frontend_fieldset$1group_0 = _jspx_th_liferay$1frontend_fieldset$1group_0.doStartTag();
              if (_jspx_eval_liferay$1frontend_fieldset$1group_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  liferay-frontend:fieldset
                com.liferay.frontend.taglib.servlet.taglib.FieldsetTag _jspx_th_liferay$1frontend_fieldset_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.FieldsetTag.class) : new com.liferay.frontend.taglib.servlet.taglib.FieldsetTag();
                _jspx_th_liferay$1frontend_fieldset_0.setPageContext(_jspx_page_context);
                _jspx_th_liferay$1frontend_fieldset_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset$1group_0);
                _jspx_th_liferay$1frontend_fieldset_0.setCssClass("p-3");
                _jspx_th_liferay$1frontend_fieldset_0.setLabel("navigation-menu");
                int _jspx_eval_liferay$1frontend_fieldset_0 = _jspx_th_liferay$1frontend_fieldset_0.doStartTag();
                if (_jspx_eval_liferay$1frontend_fieldset_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t");
                  //  aui:input
                  com.liferay.taglib.aui.InputTag _jspx_th_aui_input_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
                  _jspx_th_aui_input_2.setPageContext(_jspx_page_context);
                  _jspx_th_aui_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
                  _jspx_th_aui_input_2.setId("siteNavigationMenuId");
                  _jspx_th_aui_input_2.setName("preferences--siteNavigationMenuId--");
                  _jspx_th_aui_input_2.setType("hidden");
                  _jspx_th_aui_input_2.setValue( siteNavigationMenuDisplayContext.getSiteNavigationMenuId() );
                  int _jspx_eval_aui_input_2 = _jspx_th_aui_input_2.doStartTag();
                  if (_jspx_th_aui_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_2);
                    _jspx_th_aui_input_2.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_2);
                  _jspx_th_aui_input_2.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t");
                  //  aui:input
                  com.liferay.taglib.aui.InputTag _jspx_th_aui_input_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
                  _jspx_th_aui_input_3.setPageContext(_jspx_page_context);
                  _jspx_th_aui_input_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
                  _jspx_th_aui_input_3.setId("siteNavigationMenuType");
                  _jspx_th_aui_input_3.setName("preferences--siteNavigationMenuType--");
                  _jspx_th_aui_input_3.setType("hidden");
                  _jspx_th_aui_input_3.setValue( siteNavigationMenuDisplayContext.getSiteNavigationMenuType() );
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
                  //  aui:input
                  com.liferay.taglib.aui.InputTag _jspx_th_aui_input_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
                  _jspx_th_aui_input_4.setPageContext(_jspx_page_context);
                  _jspx_th_aui_input_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
                  _jspx_th_aui_input_4.setChecked( !siteNavigationMenuDisplayContext.isSiteNavigationMenuSelected() );
                  _jspx_th_aui_input_4.setCssClass("select-navigation");
                  _jspx_th_aui_input_4.setLabel("select-navigation");
                  _jspx_th_aui_input_4.setName("selectNavigation");
                  _jspx_th_aui_input_4.setType("radio");
                  _jspx_th_aui_input_4.setValue(new String("0"));
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
                  out.write("\t\t\t\t\t\t");
                  //  aui:select
                  com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.SelectTag.class) : new com.liferay.taglib.aui.SelectTag();
                  _jspx_th_aui_select_0.setPageContext(_jspx_page_context);
                  _jspx_th_aui_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
                  _jspx_th_aui_select_0.setDisabled( siteNavigationMenuDisplayContext.isSiteNavigationMenuSelected() );
                  _jspx_th_aui_select_0.setLabel("");
                  _jspx_th_aui_select_0.setName("selectSiteNavigationMenuType");
                  _jspx_th_aui_select_0.setValue( siteNavigationMenuDisplayContext.getSelectSiteNavigationMenuType() );
                  int _jspx_eval_aui_select_0 = _jspx_th_aui_select_0.doStartTag();
                  if (_jspx_eval_aui_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_aui_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_aui_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_aui_select_0.doInitBody();
                    }
                    do {
                      out.write("\n");
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t");

							Group scopeGroup = themeDisplay.getScopeGroup();
							
                      out.write("\n");
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t");
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t");
if (
 scopeGroup.isPrivateLayoutsEnabled() ) {
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t");
if (
 scopeGroup.hasPublicLayouts() && layout.isPublicLayout() ) {
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t");
                      //  aui:option
                      com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                      _jspx_th_aui_option_0.setPageContext(_jspx_page_context);
                      _jspx_th_aui_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
                      _jspx_th_aui_option_0.setLabel(new String("public-pages-hierarchy"));
                      _jspx_th_aui_option_0.setSelected( siteNavigationMenuDisplayContext.getSelectSiteNavigationMenuType() == SiteNavigationConstants.TYPE_PUBLIC_PAGES_HIERARCHY );
                      _jspx_th_aui_option_0.setValue( SiteNavigationConstants.TYPE_PUBLIC_PAGES_HIERARCHY );
                      int _jspx_eval_aui_option_0 = _jspx_th_aui_option_0.doStartTag();
                      if (_jspx_th_aui_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_0);
                        _jspx_th_aui_option_0.release();
                        return;
                      }
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_0);
                      _jspx_th_aui_option_0.release();
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t");
}
                      out.write("\n");
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t");
if (
 scopeGroup.hasPrivateLayouts() && layout.isPrivateLayout() ) {
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t");
                      //  aui:option
                      com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                      _jspx_th_aui_option_1.setPageContext(_jspx_page_context);
                      _jspx_th_aui_option_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
                      _jspx_th_aui_option_1.setLabel(new String("private-pages-hierarchy"));
                      _jspx_th_aui_option_1.setSelected( siteNavigationMenuDisplayContext.getSelectSiteNavigationMenuType() == SiteNavigationConstants.TYPE_PRIVATE_PAGES_HIERARCHY );
                      _jspx_th_aui_option_1.setValue( SiteNavigationConstants.TYPE_PRIVATE_PAGES_HIERARCHY );
                      int _jspx_eval_aui_option_1 = _jspx_th_aui_option_1.doStartTag();
                      if (_jspx_th_aui_option_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_1);
                        _jspx_th_aui_option_1.release();
                        return;
                      }
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_1);
                      _jspx_th_aui_option_1.release();
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t");
}
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t");
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t");
}
else {
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t");
if (
 scopeGroup.hasPublicLayouts() && layout.isPublicLayout() ) {
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t");
                      //  aui:option
                      com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                      _jspx_th_aui_option_2.setPageContext(_jspx_page_context);
                      _jspx_th_aui_option_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
                      _jspx_th_aui_option_2.setLabel(new String("pages-hierarchy"));
                      _jspx_th_aui_option_2.setSelected( siteNavigationMenuDisplayContext.getSelectSiteNavigationMenuType() == SiteNavigationConstants.TYPE_PUBLIC_PAGES_HIERARCHY );
                      _jspx_th_aui_option_2.setValue( SiteNavigationConstants.TYPE_PUBLIC_PAGES_HIERARCHY );
                      int _jspx_eval_aui_option_2 = _jspx_th_aui_option_2.doStartTag();
                      if (_jspx_th_aui_option_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_2);
                        _jspx_th_aui_option_2.release();
                        return;
                      }
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_2);
                      _jspx_th_aui_option_2.release();
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t");
}
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t");
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t");
}
                      out.write("\n");
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t");
                      //  aui:option
                      com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                      _jspx_th_aui_option_3.setPageContext(_jspx_page_context);
                      _jspx_th_aui_option_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
                      _jspx_th_aui_option_3.setLabel(new String("primary-navigation"));
                      _jspx_th_aui_option_3.setSelected( siteNavigationMenuDisplayContext.getSelectSiteNavigationMenuType() == SiteNavigationConstants.TYPE_PRIMARY );
                      _jspx_th_aui_option_3.setValue( SiteNavigationConstants.TYPE_PRIMARY );
                      int _jspx_eval_aui_option_3 = _jspx_th_aui_option_3.doStartTag();
                      if (_jspx_th_aui_option_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_3);
                        _jspx_th_aui_option_3.release();
                        return;
                      }
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_3);
                      _jspx_th_aui_option_3.release();
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t");
                      //  aui:option
                      com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                      _jspx_th_aui_option_4.setPageContext(_jspx_page_context);
                      _jspx_th_aui_option_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
                      _jspx_th_aui_option_4.setLabel(new String("secondary-navigation"));
                      _jspx_th_aui_option_4.setSelected( siteNavigationMenuDisplayContext.getSelectSiteNavigationMenuType() == SiteNavigationConstants.TYPE_SECONDARY );
                      _jspx_th_aui_option_4.setValue( SiteNavigationConstants.TYPE_SECONDARY );
                      int _jspx_eval_aui_option_4 = _jspx_th_aui_option_4.doStartTag();
                      if (_jspx_th_aui_option_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_4);
                        _jspx_th_aui_option_4.release();
                        return;
                      }
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_4);
                      _jspx_th_aui_option_4.release();
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t");
                      //  aui:option
                      com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                      _jspx_th_aui_option_5.setPageContext(_jspx_page_context);
                      _jspx_th_aui_option_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
                      _jspx_th_aui_option_5.setLabel(new String("social-navigation"));
                      _jspx_th_aui_option_5.setSelected( siteNavigationMenuDisplayContext.getSelectSiteNavigationMenuType() == SiteNavigationConstants.TYPE_SOCIAL );
                      _jspx_th_aui_option_5.setValue( SiteNavigationConstants.TYPE_SOCIAL );
                      int _jspx_eval_aui_option_5 = _jspx_th_aui_option_5.doStartTag();
                      if (_jspx_th_aui_option_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_5);
                        _jspx_th_aui_option_5.release();
                        return;
                      }
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_5);
                      _jspx_th_aui_option_5.release();
                      out.write("\n");
                      out.write("\t\t\t\t\t\t");
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
                  out.write("\t\t\t\t\t\t");
                  //  aui:input
                  com.liferay.taglib.aui.InputTag _jspx_th_aui_input_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
                  _jspx_th_aui_input_5.setPageContext(_jspx_page_context);
                  _jspx_th_aui_input_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
                  _jspx_th_aui_input_5.setChecked( siteNavigationMenuDisplayContext.isSiteNavigationMenuSelected() );
                  _jspx_th_aui_input_5.setCssClass("select-navigation");
                  _jspx_th_aui_input_5.setLabel("choose-menu");
                  _jspx_th_aui_input_5.setName("selectNavigation");
                  _jspx_th_aui_input_5.setType("radio");
                  _jspx_th_aui_input_5.setValue(new String("-1"));
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
                  out.write("\t\t\t\t\t\t<div class=\"mb-2 text-muted\">\n");
                  out.write("\t\t\t\t\t\t\t<span id=\"");
                  if (_jspx_meth_portlet_namespace_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1frontend_fieldset_0, _jspx_page_context))
                    return;
                  out.write("navigationMenuName\">\n");
                  out.write("\t\t\t\t\t\t\t\t");
if (
 siteNavigationMenuDisplayContext.isSiteNavigationMenuSelected() && (siteNavigationMenu != null) ) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t");
                  out.print( siteNavigationMenuDisplayContext.getSiteNavigationMenuName() );
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t");
}
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t</span>\n");
                  out.write("\t\t\t\t\t\t\t<span class=\"mt-1 ");
                  out.print( (siteNavigationMenuDisplayContext.isSiteNavigationMenuSelected() && (siteNavigationMenu != null)) ? StringPool.BLANK : "hide" );
                  out.write("\" id=\"");
                  if (_jspx_meth_portlet_namespace_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1frontend_fieldset_0, _jspx_page_context))
                    return;
                  out.write("removeSiteNavigationMenu\" role=\"button\">\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_aui_icon_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1frontend_fieldset_0, _jspx_page_context))
                    return;
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t</span>\n");
                  out.write("\t\t\t\t\t\t</div>\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t");
                  //  aui:button
                  com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
                  _jspx_th_aui_button_0.setPageContext(_jspx_page_context);
                  _jspx_th_aui_button_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
                  _jspx_th_aui_button_0.setDisabled( !siteNavigationMenuDisplayContext.isSiteNavigationMenuSelected() );
                  _jspx_th_aui_button_0.setName("chooseSiteNavigationMenu");
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
                  out.write("\n");
                  out.write("\t\t\t\t\t\t<div class=\"display-template mt-4\">\n");
                  out.write("\t\t\t\t\t\t\t");
                  //  liferay-template:template-selector
                  com.liferay.template.taglib.servlet.taglib.TemplateSelectorTag _jspx_th_liferay$1template_template$1selector_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.template.taglib.servlet.taglib.TemplateSelectorTag.class) : new com.liferay.template.taglib.servlet.taglib.TemplateSelectorTag();
                  _jspx_th_liferay$1template_template$1selector_0.setPageContext(_jspx_page_context);
                  _jspx_th_liferay$1template_template$1selector_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
                  _jspx_th_liferay$1template_template$1selector_0.setClassName( NavItem.class.getName() );
                  _jspx_th_liferay$1template_template$1selector_0.setDisplayStyle( siteNavigationMenuDisplayContext.getDisplayStyle() );
                  _jspx_th_liferay$1template_template$1selector_0.setDisplayStyleGroupId( siteNavigationMenuDisplayContext.getDisplayStyleGroupId() );
                  _jspx_th_liferay$1template_template$1selector_0.setRefreshURL( configurationRenderURL );
                  int _jspx_eval_liferay$1template_template$1selector_0 = _jspx_th_liferay$1template_template$1selector_0.doStartTag();
                  if (_jspx_th_liferay$1template_template$1selector_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1template_template$1selector_0);
                    _jspx_th_liferay$1template_template$1selector_0.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1template_template$1selector_0);
                  _jspx_th_liferay$1template_template$1selector_0.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t</div>\n");
                  out.write("\t\t\t\t\t");
                }
                if (_jspx_th_liferay$1frontend_fieldset_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_fieldset_0);
                  _jspx_th_liferay$1frontend_fieldset_0.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_fieldset_0);
                _jspx_th_liferay$1frontend_fieldset_0.release();
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  liferay-frontend:fieldset
                com.liferay.frontend.taglib.servlet.taglib.FieldsetTag _jspx_th_liferay$1frontend_fieldset_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.FieldsetTag.class) : new com.liferay.frontend.taglib.servlet.taglib.FieldsetTag();
                _jspx_th_liferay$1frontend_fieldset_1.setPageContext(_jspx_page_context);
                _jspx_th_liferay$1frontend_fieldset_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset$1group_0);
                _jspx_th_liferay$1frontend_fieldset_1.setCssClass("p-3");
                _jspx_th_liferay$1frontend_fieldset_1.setLabel("menu-items-to-show");
                int _jspx_eval_liferay$1frontend_fieldset_1 = _jspx_th_liferay$1frontend_fieldset_1.doStartTag();
                if (_jspx_eval_liferay$1frontend_fieldset_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t<div id=\"");
                  if (_jspx_meth_portlet_namespace_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1frontend_fieldset_1, _jspx_page_context))
                    return;
                  out.write("customDisplayOptions\">\n");
                  out.write("\t\t\t\t\t\t\t");
                  //  clay:row
                  com.liferay.frontend.taglib.clay.servlet.taglib.RowTag _jspx_th_clay_row_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.RowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.RowTag();
                  _jspx_th_clay_row_1.setPageContext(_jspx_page_context);
                  _jspx_th_clay_row_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_1);
                  int _jspx_eval_clay_row_1 = _jspx_th_clay_row_1.doStartTag();
                  if (_jspx_eval_clay_row_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t");
                    //  clay:col
                    com.liferay.frontend.taglib.clay.servlet.taglib.ColTag _jspx_th_clay_col_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ColTag();
                    _jspx_th_clay_col_1.setPageContext(_jspx_page_context);
                    _jspx_th_clay_col_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_row_1);
                    _jspx_th_clay_col_1.setMd("9");
                    int _jspx_eval_clay_col_1 = _jspx_th_clay_col_1.doStartTag();
                    if (_jspx_eval_clay_col_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t");
                      //  aui:select
                      com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.SelectTag.class) : new com.liferay.taglib.aui.SelectTag();
                      _jspx_th_aui_select_1.setPageContext(_jspx_page_context);
                      _jspx_th_aui_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_1);
                      _jspx_th_aui_select_1.setId("rootMenuItemType");
                      _jspx_th_aui_select_1.setLabel("start-with-menu-items-in");
                      _jspx_th_aui_select_1.setName("preferences--rootMenuItemType--");
                      _jspx_th_aui_select_1.setValue( rootMenuItemType );
                      int _jspx_eval_aui_select_1 = _jspx_th_aui_select_1.doStartTag();
                      if (_jspx_eval_aui_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_aui_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_aui_select_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_aui_select_1.doInitBody();
                        }
                        do {
                          out.write("\n");
                          out.write("\t\t\t\t\t\t\t\t\t\t");
                          if (_jspx_meth_aui_option_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_select_1, _jspx_page_context))
                            return;
                          out.write("\n");
                          out.write("\t\t\t\t\t\t\t\t\t\t");
                          if (_jspx_meth_aui_option_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_select_1, _jspx_page_context))
                            return;
                          out.write("\n");
                          out.write("\t\t\t\t\t\t\t\t\t\t");
                          if (_jspx_meth_aui_option_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_select_1, _jspx_page_context))
                            return;
                          out.write("\n");
                          out.write("\t\t\t\t\t\t\t\t\t");
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
                      out.write("\t\t\t\t\t\t\t\t");
                    }
                    if (_jspx_th_clay_col_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_1);
                      _jspx_th_clay_col_1.release();
                      return;
                    }
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_1);
                    _jspx_th_clay_col_1.release();
                    out.write("\n");
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t");
                    //  clay:col
                    com.liferay.frontend.taglib.clay.servlet.taglib.ColTag _jspx_th_clay_col_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ColTag();
                    _jspx_th_clay_col_2.setPageContext(_jspx_page_context);
                    _jspx_th_clay_col_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_row_1);
                    _jspx_th_clay_col_2.setMd("3");
                    int _jspx_eval_clay_col_2 = _jspx_th_clay_col_2.doStartTag();
                    if (_jspx_eval_clay_col_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t<div class=\"mt-4 pt-1 ");
                      out.print( (rootMenuItemType.equals("parent-at-level") || rootMenuItemType.equals("relative-parent-up-by")) ? StringPool.BLANK : "hide" );
                      out.write("\" id=\"");
                      if (_jspx_meth_portlet_namespace_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_col_2, _jspx_page_context))
                        return;
                      out.write("rootMenuItemLevel\">\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t");
                      //  aui:select
                      com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.SelectTag.class) : new com.liferay.taglib.aui.SelectTag();
                      _jspx_th_aui_select_2.setPageContext(_jspx_page_context);
                      _jspx_th_aui_select_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_2);
                      _jspx_th_aui_select_2.setLabel("");
                      _jspx_th_aui_select_2.setName("preferences--rootMenuItemLevel--");
                      int _jspx_eval_aui_select_2 = _jspx_th_aui_select_2.doStartTag();
                      if (_jspx_eval_aui_select_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_aui_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_aui_select_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_aui_select_2.doInitBody();
                        }
                        do {
                          out.write("\n");
                          out.write("\n");
                          out.write("\t\t\t\t\t\t\t\t\t\t\t");

											for (int i = 0; i <= 4; i++) {
											
                          out.write("\n");
                          out.write("\n");
                          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                          //  aui:option
                          com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                          _jspx_th_aui_option_9.setPageContext(_jspx_page_context);
                          _jspx_th_aui_option_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_2);
                          _jspx_th_aui_option_9.setLabel( i );
                          _jspx_th_aui_option_9.setSelected( siteNavigationMenuDisplayContext.getRootMenuItemLevel() == i );
                          int _jspx_eval_aui_option_9 = _jspx_th_aui_option_9.doStartTag();
                          if (_jspx_th_aui_option_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_9);
                            _jspx_th_aui_option_9.release();
                            return;
                          }
                          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_9);
                          _jspx_th_aui_option_9.release();
                          out.write("\n");
                          out.write("\n");
                          out.write("\t\t\t\t\t\t\t\t\t\t\t");

											}
											
                          out.write("\n");
                          out.write("\n");
                          out.write("\t\t\t\t\t\t\t\t\t\t");
                          int evalDoAfterBody = _jspx_th_aui_select_2.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_aui_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                          out = _jspx_page_context.popBody();
                      }
                      if (_jspx_th_aui_select_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_select_2);
                        _jspx_th_aui_select_2.release();
                        return;
                      }
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_select_2);
                      _jspx_th_aui_select_2.release();
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
                      out.write("\t\t\t\t\t\t\t\t");
                    }
                    if (_jspx_th_clay_col_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_2);
                      _jspx_th_clay_col_2.release();
                      return;
                    }
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_2);
                    _jspx_th_clay_col_2.release();
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t");
                  }
                  if (_jspx_th_clay_row_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_row_1);
                    _jspx_th_clay_row_1.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_row_1);
                  _jspx_th_clay_row_1.release();
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t");
                  //  clay:row
                  com.liferay.frontend.taglib.clay.servlet.taglib.RowTag _jspx_th_clay_row_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.RowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.RowTag();
                  _jspx_th_clay_row_2.setPageContext(_jspx_page_context);
                  _jspx_th_clay_row_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_1);
                  int _jspx_eval_clay_row_2 = _jspx_th_clay_row_2.doStartTag();
                  if (_jspx_eval_clay_row_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t");
                    //  clay:col
                    com.liferay.frontend.taglib.clay.servlet.taglib.ColTag _jspx_th_clay_col_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ColTag();
                    _jspx_th_clay_col_3.setPageContext(_jspx_page_context);
                    _jspx_th_clay_col_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_row_2);
                    _jspx_th_clay_col_3.setMd("10");
                    int _jspx_eval_clay_col_3 = _jspx_th_clay_col_3.doStartTag();
                    if (_jspx_eval_clay_col_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t<div class=\"mb-3 ");
                      out.print( rootMenuItemType.equals("select") ? StringPool.BLANK : "hide" );
                      out.write("\" id=\"");
                      if (_jspx_meth_portlet_namespace_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_col_3, _jspx_page_context))
                        return;
                      out.write("rootMenuItemIdPanel\">\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t");
                      //  aui:input
                      com.liferay.taglib.aui.InputTag _jspx_th_aui_input_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
                      _jspx_th_aui_input_6.setPageContext(_jspx_page_context);
                      _jspx_th_aui_input_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_3);
                      _jspx_th_aui_input_6.setId("rootMenuItemId");
                      _jspx_th_aui_input_6.setIgnoreRequestValue( true );
                      _jspx_th_aui_input_6.setName("preferences--rootMenuItemId--");
                      _jspx_th_aui_input_6.setType("hidden");
                      _jspx_th_aui_input_6.setValue( siteNavigationMenuDisplayContext.getRootMenuItemId() );
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
                      out.write("\t\t\t\t\t\t\t\t\t\t");

										String rootMenuItemName = siteNavigationMenuDisplayContext.getSiteNavigationMenuName();

										SiteNavigationMenuItem siteNavigationMenuItem = SiteNavigationMenuItemLocalServiceUtil.fetchSiteNavigationMenuItem(GetterUtil.getLong(siteNavigationMenuDisplayContext.getRootMenuItemId()));

										if (siteNavigationMenuItem != null) {
											SiteNavigationMenuItemTypeRegistry siteNavigationMenuItemTypeRegistry = (SiteNavigationMenuItemTypeRegistry)request.getAttribute(SiteNavigationMenuWebKeys.SITE_NAVIGATION_MENU_ITEM_TYPE_REGISTRY);

											SiteNavigationMenuItemType siteNavigationMenuItemType = siteNavigationMenuItemTypeRegistry.getSiteNavigationMenuItemType(siteNavigationMenuItem.getType());

											rootMenuItemName = siteNavigationMenuItemType.getTitle(siteNavigationMenuItem, locale);
										}
										
                      out.write("\n");
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"card card-horizontal card-type-directory\">\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"card-body\">\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                      //  clay:content-row
                      com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag _jspx_th_clay_content$1row_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag();
                      _jspx_th_clay_content$1row_0.setPageContext(_jspx_page_context);
                      _jspx_th_clay_content$1row_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_3);
                      _jspx_th_clay_content$1row_0.setVerticalAlign("center");
                      int _jspx_eval_clay_content$1row_0 = _jspx_th_clay_content$1row_0.doStartTag();
                      if (_jspx_eval_clay_content$1row_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        out.write("\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
                        if (_jspx_meth_clay_content$1col_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_content$1row_0, _jspx_page_context))
                          return;
                        out.write("\n");
                        out.write("\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
                        //  clay:content-col
                        com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
                        _jspx_th_clay_content$1col_1.setPageContext(_jspx_page_context);
                        _jspx_th_clay_content$1col_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_0);
                        _jspx_th_clay_content$1col_1.setExpand( true );
                        _jspx_th_clay_content$1col_1.setGutters( true );
                        int _jspx_eval_clay_content$1col_1 = _jspx_th_clay_content$1col_1.doStartTag();
                        if (_jspx_eval_clay_content$1col_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                          out.write("\n");
                          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h3 class=\"card-title\">\n");
                          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"text-truncate-inline\">\n");
                          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"text-truncate\" id=\"");
                          if (_jspx_meth_portlet_namespace_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_content$1col_1, _jspx_page_context))
                            return;
                          out.write("rootMenuItemName\">");
                          out.print( HtmlUtil.escape(rootMenuItemName) );
                          out.write("</span>\n");
                          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\n");
                          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</h3>\n");
                          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
                        }
                        if (_jspx_th_clay_content$1col_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_1);
                          _jspx_th_clay_content$1col_1.release();
                          return;
                        }
                        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_1);
                        _jspx_th_clay_content$1col_1.release();
                        out.write("\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                      }
                      if (_jspx_th_clay_content$1row_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_0);
                        _jspx_th_clay_content$1row_0.release();
                        return;
                      }
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_0);
                      _jspx_th_clay_content$1row_0.release();
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t");
                      if (_jspx_meth_aui_button_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_col_3, _jspx_page_context))
                        return;
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
                      out.write("\t\t\t\t\t\t\t\t");
                    }
                    if (_jspx_th_clay_col_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_3);
                      _jspx_th_clay_col_3.release();
                      return;
                    }
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_3);
                    _jspx_th_clay_col_3.release();
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t");
                  }
                  if (_jspx_th_clay_row_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_row_2);
                    _jspx_th_clay_row_2.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_row_2);
                  _jspx_th_clay_row_2.release();
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t");
                  //  clay:row
                  com.liferay.frontend.taglib.clay.servlet.taglib.RowTag _jspx_th_clay_row_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.RowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.RowTag();
                  _jspx_th_clay_row_3.setPageContext(_jspx_page_context);
                  _jspx_th_clay_row_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_1);
                  int _jspx_eval_clay_row_3 = _jspx_th_clay_row_3.doStartTag();
                  if (_jspx_eval_clay_row_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t");
                    //  clay:col
                    com.liferay.frontend.taglib.clay.servlet.taglib.ColTag _jspx_th_clay_col_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ColTag();
                    _jspx_th_clay_col_4.setPageContext(_jspx_page_context);
                    _jspx_th_clay_col_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_row_3);
                    _jspx_th_clay_col_4.setMd("6");
                    int _jspx_eval_clay_col_4 = _jspx_th_clay_col_4.doStartTag();
                    if (_jspx_eval_clay_col_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t");
                      //  aui:select
                      com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.SelectTag.class) : new com.liferay.taglib.aui.SelectTag();
                      _jspx_th_aui_select_3.setPageContext(_jspx_page_context);
                      _jspx_th_aui_select_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_4);
                      _jspx_th_aui_select_3.setLabel("levels-to-display");
                      _jspx_th_aui_select_3.setName("preferences--displayDepth--");
                      int _jspx_eval_aui_select_3 = _jspx_th_aui_select_3.doStartTag();
                      if (_jspx_eval_aui_select_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_aui_select_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_aui_select_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_aui_select_3.doInitBody();
                        }
                        do {
                          out.write("\n");
                          out.write("\t\t\t\t\t\t\t\t\t\t");
                          if (_jspx_meth_aui_option_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_select_3, _jspx_page_context))
                            return;
                          out.write("\n");
                          out.write("\n");
                          out.write("\t\t\t\t\t\t\t\t\t\t");

										for (int i = 1; i <= 20; i++) {
										
                          out.write("\n");
                          out.write("\n");
                          out.write("\t\t\t\t\t\t\t\t\t\t\t");
                          //  aui:option
                          com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                          _jspx_th_aui_option_11.setPageContext(_jspx_page_context);
                          _jspx_th_aui_option_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_3);
                          _jspx_th_aui_option_11.setLabel( i );
                          _jspx_th_aui_option_11.setSelected( siteNavigationMenuDisplayContext.getDisplayDepth() == i );
                          int _jspx_eval_aui_option_11 = _jspx_th_aui_option_11.doStartTag();
                          if (_jspx_th_aui_option_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_11);
                            _jspx_th_aui_option_11.release();
                            return;
                          }
                          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_11);
                          _jspx_th_aui_option_11.release();
                          out.write("\n");
                          out.write("\n");
                          out.write("\t\t\t\t\t\t\t\t\t\t");

										}
										
                          out.write("\n");
                          out.write("\n");
                          out.write("\t\t\t\t\t\t\t\t\t");
                          int evalDoAfterBody = _jspx_th_aui_select_3.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_aui_select_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                          out = _jspx_page_context.popBody();
                      }
                      if (_jspx_th_aui_select_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_select_3);
                        _jspx_th_aui_select_3.release();
                        return;
                      }
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_select_3);
                      _jspx_th_aui_select_3.release();
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t");
                    }
                    if (_jspx_th_clay_col_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_4);
                      _jspx_th_clay_col_4.release();
                      return;
                    }
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_4);
                    _jspx_th_clay_col_4.release();
                    out.write("\n");
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t");
                    //  clay:col
                    com.liferay.frontend.taglib.clay.servlet.taglib.ColTag _jspx_th_clay_col_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ColTag();
                    _jspx_th_clay_col_5.setPageContext(_jspx_page_context);
                    _jspx_th_clay_col_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_row_3);
                    _jspx_th_clay_col_5.setMd("6");
                    int _jspx_eval_clay_col_5 = _jspx_th_clay_col_5.doStartTag();
                    if (_jspx_eval_clay_col_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t");
                      //  aui:select
                      com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.SelectTag.class) : new com.liferay.taglib.aui.SelectTag();
                      _jspx_th_aui_select_4.setPageContext(_jspx_page_context);
                      _jspx_th_aui_select_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_5);
                      _jspx_th_aui_select_4.setLabel("expand-sublevels");
                      _jspx_th_aui_select_4.setName("preferences--expandedLevels--");
                      _jspx_th_aui_select_4.setValue( siteNavigationMenuDisplayContext.getExpandedLevels() );
                      int _jspx_eval_aui_select_4 = _jspx_th_aui_select_4.doStartTag();
                      if (_jspx_eval_aui_select_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_aui_select_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_aui_select_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_aui_select_4.doInitBody();
                        }
                        do {
                          out.write("\n");
                          out.write("\t\t\t\t\t\t\t\t\t\t");
                          if (_jspx_meth_aui_option_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_select_4, _jspx_page_context))
                            return;
                          out.write("\n");
                          out.write("\t\t\t\t\t\t\t\t\t\t");
                          if (_jspx_meth_aui_option_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_select_4, _jspx_page_context))
                            return;
                          out.write("\n");
                          out.write("\t\t\t\t\t\t\t\t\t");
                          int evalDoAfterBody = _jspx_th_aui_select_4.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_aui_select_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                          out = _jspx_page_context.popBody();
                      }
                      if (_jspx_th_aui_select_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_select_4);
                        _jspx_th_aui_select_4.release();
                        return;
                      }
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_select_4);
                      _jspx_th_aui_select_4.release();
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t");
                    }
                    if (_jspx_th_clay_col_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_5);
                      _jspx_th_clay_col_5.release();
                      return;
                    }
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_5);
                    _jspx_th_clay_col_5.release();
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t");
                  }
                  if (_jspx_th_clay_row_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_row_3);
                    _jspx_th_clay_row_3.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_row_3);
                  _jspx_th_clay_row_3.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t</div>\n");
                  out.write("\t\t\t\t\t");
                }
                if (_jspx_th_liferay$1frontend_fieldset_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_fieldset_1);
                  _jspx_th_liferay$1frontend_fieldset_1.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_fieldset_1);
                _jspx_th_liferay$1frontend_fieldset_1.release();
                out.write("\n");
                out.write("\t\t\t\t");
              }
              if (_jspx_th_liferay$1frontend_fieldset$1group_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_fieldset$1group_0);
                _jspx_th_liferay$1frontend_fieldset$1group_0.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_fieldset$1group_0);
              _jspx_th_liferay$1frontend_fieldset$1group_0.release();
              out.write("\n");
              out.write("\t\t\t");
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
            out.write("\t\t\t");
            //  clay:col
            com.liferay.frontend.taglib.clay.servlet.taglib.ColTag _jspx_th_clay_col_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ColTag();
            _jspx_th_clay_col_6.setPageContext(_jspx_page_context);
            _jspx_th_clay_col_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_row_0);
            _jspx_th_clay_col_6.setMd("6");
            int _jspx_eval_clay_col_6 = _jspx_th_clay_col_6.doStartTag();
            if (_jspx_eval_clay_col_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              out.write("\n");
              out.write("\t\t\t\t");
              //  liferay-portlet:preview
              com.liferay.taglib.portletext.PreviewTag _jspx_th_liferay$1portlet_preview_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portletext.PreviewTag.class) : new com.liferay.taglib.portletext.PreviewTag();
              _jspx_th_liferay$1portlet_preview_0.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1portlet_preview_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_6);
              _jspx_th_liferay$1portlet_preview_0.setPortletName( portletResource );
              _jspx_th_liferay$1portlet_preview_0.setShowBorders( true );
              int _jspx_eval_liferay$1portlet_preview_0 = _jspx_th_liferay$1portlet_preview_0.doStartTag();
              if (_jspx_th_liferay$1portlet_preview_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_preview_0);
                _jspx_th_liferay$1portlet_preview_0.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_preview_0);
              _jspx_th_liferay$1portlet_preview_0.release();
              out.write("\n");
              out.write("\t\t\t");
            }
            if (_jspx_th_clay_col_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_6);
              _jspx_th_clay_col_6.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_6);
            _jspx_th_clay_col_6.release();
            out.write("\n");
            out.write("\t\t");
          }
          if (_jspx_th_clay_row_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_row_0);
            _jspx_th_clay_row_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_row_0);
          _jspx_th_clay_row_0.release();
          out.write('\n');
          out.write('	');
        }
        if (_jspx_th_liferay$1frontend_edit$1form$1body_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_edit$1form$1body_0);
          _jspx_th_liferay$1frontend_edit$1form$1body_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_edit$1form$1body_0);
        _jspx_th_liferay$1frontend_edit$1form$1body_0.release();
        out.write("\n");
        out.write("\n");
        out.write("\t");
        if (_jspx_meth_liferay$1frontend_edit$1form$1footer_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1frontend_edit$1form_0, _jspx_page_context))
          return;
        out.write('\n');
      }
      if (_jspx_th_liferay$1frontend_edit$1form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_edit$1form_0);
        _jspx_th_liferay$1frontend_edit$1form_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_edit$1form_0);
      _jspx_th_liferay$1frontend_edit$1form_0.release();
      out.write('\n');
      out.write('\n');
      //  aui:script
      com.liferay.taglib.aui.ScriptTag _jspx_th_aui_script_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ScriptTag.class) : new com.liferay.taglib.aui.ScriptTag();
      _jspx_th_aui_script_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_script_0.setParent(null);
      _jspx_th_aui_script_0.setRequire("frontend-js-web/liferay/delegate/delegate.es as delegateModule");
      int _jspx_eval_aui_script_0 = _jspx_th_aui_script_0.doStartTag();
      if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_aui_script_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_aui_script_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\tvar form = document.");
          if (_jspx_meth_portlet_namespace_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("fm;\n");
          out.write("\n");
          out.write("\tform.addEventListener('change', ");
          if (_jspx_meth_portlet_namespace_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("resetPreview);\n");
          out.write("\tform.addEventListener('select', ");
          if (_jspx_meth_portlet_namespace_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("resetPreview);\n");
          out.write("\n");
          out.write("\tfunction ");
          if (_jspx_meth_portlet_namespace_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("resetPreview() {\n");
          out.write("\t\tvar displayDepthSelect = Liferay.Util.getFormElement(form, 'displayDepth');\n");
          out.write("\t\tvar displayStyleSelect = Liferay.Util.getFormElement(form, 'displayStyle');\n");
          out.write("\t\tvar expandedLevelsSelect = Liferay.Util.getFormElement(\n");
          out.write("\t\t\tform,\n");
          out.write("\t\t\t'expandedLevels'\n");
          out.write("\t\t);\n");
          out.write("\t\tvar rootMenuItemIdInput = Liferay.Util.getFormElement(\n");
          out.write("\t\t\tform,\n");
          out.write("\t\t\t'rootMenuItemId'\n");
          out.write("\t\t);\n");
          out.write("\t\tvar rootMenuItemLevelSelect = Liferay.Util.getFormElement(\n");
          out.write("\t\t\tform,\n");
          out.write("\t\t\t'rootMenuItemLevel'\n");
          out.write("\t\t);\n");
          out.write("\t\tvar rootMenuItemTypeSelect = Liferay.Util.getFormElement(\n");
          out.write("\t\t\tform,\n");
          out.write("\t\t\t'rootMenuItemType'\n");
          out.write("\t\t);\n");
          out.write("\t\tvar siteNavigationMenuIdInput = Liferay.Util.getFormElement(\n");
          out.write("\t\t\tform,\n");
          out.write("\t\t\t'siteNavigationMenuId'\n");
          out.write("\t\t);\n");
          out.write("\t\tvar siteNavigationMenuTypeInput = Liferay.Util.getFormElement(\n");
          out.write("\t\t\tform,\n");
          out.write("\t\t\t'siteNavigationMenuType'\n");
          out.write("\t\t);\n");
          out.write("\n");
          out.write("\t\tvar data = {\n");
          out.write("\t\t\tpreview: true,\n");
          out.write("\t\t};\n");
          out.write("\n");
          out.write("\t\tif (\n");
          out.write("\t\t\tdisplayDepthSelect &&\n");
          out.write("\t\t\tdisplayStyleSelect &&\n");
          out.write("\t\t\texpandedLevelsSelect &&\n");
          out.write("\t\t\trootMenuItemIdInput &&\n");
          out.write("\t\t\trootMenuItemLevelSelect &&\n");
          out.write("\t\t\trootMenuItemTypeSelect &&\n");
          out.write("\t\t\tsiteNavigationMenuIdInput &&\n");
          out.write("\t\t\tsiteNavigationMenuTypeInput\n");
          out.write("\t\t) {\n");
          out.write("\t\t\tdata.displayDepth = displayDepthSelect.value;\n");
          out.write("\t\t\tdata.displayStyle = displayStyleSelect.value;\n");
          out.write("\t\t\tdata.expandedLevels = expandedLevelsSelect.value;\n");
          out.write("\t\t\tdata.rootMenuItemLevel = rootMenuItemLevelSelect.value;\n");
          out.write("\t\t\tdata.rootMenuItemType = rootMenuItemTypeSelect.value;\n");
          out.write("\t\t\tdata.rootMenuItemId = rootMenuItemIdInput.value;\n");
          out.write("\t\t\tdata.siteNavigationMenuId = siteNavigationMenuIdInput.value;\n");
          out.write("\t\t\tdata.siteNavigationMenuType = siteNavigationMenuTypeInput.value;\n");
          out.write("\t\t}\n");
          out.write("\n");
          out.write("\t\tdata = Liferay.Util.ns('_");
          out.print( HtmlUtil.escapeJS(portletResource) );
          out.write("_', data);\n");
          out.write("\n");
          out.write("\t\tLiferay.Portlet.refresh(\n");
          out.write("\t\t\t'#p_p_id_");
          out.print( HtmlUtil.escapeJS(portletResource) );
          out.write("_',\n");
          out.write("\t\t\tdata\n");
          out.write("\t\t);\n");
          out.write("\t}\n");
          out.write("\n");
          out.write("\tvar chooseRootMenuItemButton = document.getElementById(\n");
          out.write("\t\t'");
          if (_jspx_meth_portlet_namespace_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("chooseRootMenuItem'\n");
          out.write("\t);\n");
          out.write("\tvar rootMenuItemIdInput = document.getElementById(\n");
          out.write("\t\t'");
          if (_jspx_meth_portlet_namespace_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("rootMenuItemId'\n");
          out.write("\t);\n");
          out.write("\tvar rootMenuItemNameSpan = document.getElementById(\n");
          out.write("\t\t'");
          if (_jspx_meth_portlet_namespace_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("rootMenuItemName'\n");
          out.write("\t);\n");
          out.write("\tvar selectSiteNavigationMenuTypeSelect = document.getElementById(\n");
          out.write("\t\t'");
          if (_jspx_meth_portlet_namespace_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("selectSiteNavigationMenuType'\n");
          out.write("\t);\n");
          out.write("\tvar siteNavigationMenuIdInput = document.getElementById(\n");
          out.write("\t\t'");
          if (_jspx_meth_portlet_namespace_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("siteNavigationMenuId'\n");
          out.write("\t);\n");
          out.write("\n");
          out.write("\tif (\n");
          out.write("\t\tchooseRootMenuItemButton &&\n");
          out.write("\t\trootMenuItemIdInput &&\n");
          out.write("\t\trootMenuItemNameSpan &&\n");
          out.write("\t\tselectSiteNavigationMenuTypeSelect &&\n");
          out.write("\t\tsiteNavigationMenuIdInput\n");
          out.write("\t) {\n");
          out.write("\t\tchooseRootMenuItemButton.addEventListener('click', (event) => {\n");
          out.write("\t\t\tevent.preventDefault();\n");
          out.write("\n");
          out.write("\t\t\tvar uri =\n");
          out.write("\t\t\t\t'");
          out.print( siteNavigationMenuDisplayContext.getRootMenuItemSelectorURL() );
          out.write("';\n");
          out.write("\n");
          out.write("\t\t\turi = Liferay.Util.addParams(\n");
          out.write("\t\t\t\t'");
          out.print( PortalUtil.getPortletNamespace(ItemSelectorPortletKeys.ITEM_SELECTOR) );
          out.write("siteNavigationMenuType=' +\n");
          out.write("\t\t\t\t\tselectSiteNavigationMenuTypeSelect.value,\n");
          out.write("\t\t\t\turi\n");
          out.write("\t\t\t);\n");
          out.write("\t\t\turi = Liferay.Util.addParams(\n");
          out.write("\t\t\t\t'");
          out.print( PortalUtil.getPortletNamespace(ItemSelectorPortletKeys.ITEM_SELECTOR) );
          out.write("siteNavigationMenuId=' +\n");
          out.write("\t\t\t\t\tsiteNavigationMenuIdInput.value,\n");
          out.write("\t\t\t\turi\n");
          out.write("\t\t\t);\n");
          out.write("\n");
          out.write("\t\t\tLiferay.Util.openSelectionModal({\n");
          out.write("\t\t\t\theight: '70vh',\n");
          out.write("\t\t\t\tonSelect: function (selectedItem) {\n");
          out.write("\t\t\t\t\tif (selectedItem) {\n");
          out.write("\t\t\t\t\t\trootMenuItemIdInput.value =\n");
          out.write("\t\t\t\t\t\t\tselectedItem.selectSiteNavigationMenuItemId;\n");
          out.write("\t\t\t\t\t\trootMenuItemNameSpan.innerText =\n");
          out.write("\t\t\t\t\t\t\tselectedItem.selectSiteNavigationMenuItemName;\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_portlet_namespace_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("resetPreview();\n");
          out.write("\t\t\t\t\t}\n");
          out.write("\t\t\t\t},\n");
          out.write("\t\t\t\tselectEventName:\n");
          out.write("\t\t\t\t\t'");
          out.print( siteNavigationMenuDisplayContext.getRootMenuItemEventName() );
          out.write("',\n");
          out.write("\t\t\t\tsize: 'md',\n");
          out.write("\t\t\t\ttitle:\n");
          out.write("\t\t\t\t\t'");
          if (_jspx_meth_liferay$1ui_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("',\n");
          out.write("\t\t\t\turl: uri,\n");
          out.write("\t\t\t});\n");
          out.write("\t\t});\n");
          out.write("\t}\n");
          out.write("\n");
          out.write("\tvar chooseSiteNavigationMenuButton = document.getElementById(\n");
          out.write("\t\t'");
          if (_jspx_meth_portlet_namespace_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("chooseSiteNavigationMenu'\n");
          out.write("\t);\n");
          out.write("\tvar navigationMenuName = document.getElementById(\n");
          out.write("\t\t'");
          if (_jspx_meth_portlet_namespace_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("navigationMenuName'\n");
          out.write("\t);\n");
          out.write("\tvar removeSiteNavigationMenu = document.getElementById(\n");
          out.write("\t\t'");
          if (_jspx_meth_portlet_namespace_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("removeSiteNavigationMenu'\n");
          out.write("\t);\n");
          out.write("\n");
          out.write("\tif (\n");
          out.write("\t\tchooseSiteNavigationMenuButton &&\n");
          out.write("\t\tnavigationMenuName &&\n");
          out.write("\t\tremoveSiteNavigationMenu &&\n");
          out.write("\t\trootMenuItemIdInput &&\n");
          out.write("\t\trootMenuItemNameSpan &&\n");
          out.write("\t\tsiteNavigationMenuIdInput\n");
          out.write("\t) {\n");
          out.write("\t\tchooseSiteNavigationMenuButton.addEventListener('click', (event) => {\n");
          out.write("\t\t\tLiferay.Util.openSelectionModal({\n");
          out.write("\t\t\t\tid: '");
          if (_jspx_meth_portlet_namespace_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("selectSiteNavigationMenu',\n");
          out.write("\t\t\t\tonSelect: function (selectedItem) {\n");
          out.write("\t\t\t\t\tconst itemValue = JSON.parse(selectedItem.value);\n");
          out.write("\n");
          out.write("\t\t\t\t\tif (itemValue) {\n");
          out.write("\t\t\t\t\t\tnavigationMenuName.innerText = itemValue.name;\n");
          out.write("\t\t\t\t\t\trootMenuItemIdInput.value = '0';\n");
          out.write("\t\t\t\t\t\trootMenuItemNameSpan.innerText = itemValue.name;\n");
          out.write("\t\t\t\t\t\tsiteNavigationMenuIdInput.value = itemValue.id;\n");
          out.write("\n");
          out.write("\t\t\t\t\t\tremoveSiteNavigationMenu.classList.toggle('hide');\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_portlet_namespace_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("resetPreview();\n");
          out.write("\t\t\t\t\t}\n");
          out.write("\t\t\t\t},\n");
          out.write("\t\t\t\tselectEventName:\n");
          out.write("\t\t\t\t\t'");
          out.print( siteNavigationMenuDisplayContext.getSiteNavigationMenuEventName() );
          out.write("',\n");
          out.write("\t\t\t\ttitle: '");
          if (_jspx_meth_liferay$1ui_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("',\n");
          out.write("\t\t\t\turl:\n");
          out.write("\t\t\t\t\t'");
          out.print( siteNavigationMenuDisplayContext.getSiteNavigationMenuItemSelectorURL() );
          out.write("',\n");
          out.write("\t\t\t});\n");
          out.write("\t\t});\n");
          out.write("\t}\n");
          out.write("\n");
          out.write("\tvar removeSiteNavigationMenuButton = document.getElementById(\n");
          out.write("\t\t'");
          if (_jspx_meth_portlet_namespace_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("removeSiteNavigationMenu'\n");
          out.write("\t);\n");
          out.write("\n");
          out.write("\tif (\n");
          out.write("\t\tnavigationMenuName &&\n");
          out.write("\t\tremoveSiteNavigationMenu &&\n");
          out.write("\t\tremoveSiteNavigationMenuButton &&\n");
          out.write("\t\trootMenuItemIdInput &&\n");
          out.write("\t\trootMenuItemNameSpan &&\n");
          out.write("\t\tsiteNavigationMenuIdInput\n");
          out.write("\t) {\n");
          out.write("\t\tremoveSiteNavigationMenuButton.addEventListener('click', (event) => {\n");
          out.write("\t\t\tnavigationMenuName.innerText = '';\n");
          out.write("\t\t\trootMenuItemIdInput.value = '0';\n");
          out.write("\t\t\trootMenuItemNameSpan.innerText = '';\n");
          out.write("\t\t\tsiteNavigationMenuIdInput.value = '0';\n");
          out.write("\n");
          out.write("\t\t\tremoveSiteNavigationMenu.classList.toggle('hide');\n");
          out.write("\n");
          out.write("\t\t\t");
          if (_jspx_meth_portlet_namespace_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("resetPreview();\n");
          out.write("\t\t});\n");
          out.write("\t}\n");
          out.write("\n");
          out.write("\tLiferay.Util.toggleSelectBox(\n");
          out.write("\t\t'");
          if (_jspx_meth_portlet_namespace_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("rootMenuItemType',\n");
          out.write("\t\t'select',\n");
          out.write("\t\t'");
          if (_jspx_meth_portlet_namespace_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("rootMenuItemIdPanel'\n");
          out.write("\t);\n");
          out.write("\n");
          out.write("\tLiferay.Util.toggleSelectBox(\n");
          out.write("\t\t'");
          if (_jspx_meth_portlet_namespace_25((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("rootMenuItemType',\n");
          out.write("\t\t(currentValue, value) => {\n");
          out.write("\t\t\treturn currentValue === 'absolute' || currentValue === 'relative';\n");
          out.write("\t\t},\n");
          out.write("\t\t'");
          if (_jspx_meth_portlet_namespace_26((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("rootMenuItemLevel'\n");
          out.write("\t);\n");
          out.write("\n");
          out.write("\tvar siteNavigationMenuType = document.getElementById(\n");
          out.write("\t\t'");
          if (_jspx_meth_portlet_namespace_27((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("siteNavigationMenuType'\n");
          out.write("\t);\n");
          out.write("\n");
          out.write("\tif (\n");
          out.write("\t\trootMenuItemNameSpan &&\n");
          out.write("\t\tselectSiteNavigationMenuTypeSelect &&\n");
          out.write("\t\tsiteNavigationMenuType\n");
          out.write("\t) {\n");
          out.write("\t\tselectSiteNavigationMenuTypeSelect.addEventListener('change', () => {\n");
          out.write("\t\t\tvar selectedSelectSiteNavigationMenuType = document.querySelector(\n");
          out.write("\t\t\t\t'#");
          if (_jspx_meth_portlet_namespace_28((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("selectSiteNavigationMenuType option:checked'\n");
          out.write("\t\t\t);\n");
          out.write("\n");
          out.write("\t\t\tif (selectedSelectSiteNavigationMenuType) {\n");
          out.write("\t\t\t\trootMenuItemNameSpan.innerText =\n");
          out.write("\t\t\t\t\tselectedSelectSiteNavigationMenuType.innerText;\n");
          out.write("\t\t\t}\n");
          out.write("\n");
          out.write("\t\t\tsiteNavigationMenuType.value = selectSiteNavigationMenuTypeSelect.value;\n");
          out.write("\t\t});\n");
          out.write("\t}\n");
          out.write("\n");
          out.write("\tvar chooseSiteNavigationMenu = document.getElementById(\n");
          out.write("\t\t'");
          if (_jspx_meth_portlet_namespace_29((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("chooseSiteNavigationMenu'\n");
          out.write("\t);\n");
          out.write("\n");
          out.write("\tif (\n");
          out.write("\t\tchooseSiteNavigationMenu &&\n");
          out.write("\t\tnavigationMenuName &&\n");
          out.write("\t\tremoveSiteNavigationMenu &&\n");
          out.write("\t\tsiteNavigationMenuIdInput &&\n");
          out.write("\t\tsiteNavigationMenuType\n");
          out.write("\t) {\n");
          out.write("\t\tvar delegate = delegateModule.default;\n");
          out.write("\n");
          out.write("\t\tdelegate(\n");
          out.write("\t\t\tdocument.");
          if (_jspx_meth_portlet_namespace_30((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("fm,\n");
          out.write("\t\t\t'change',\n");
          out.write("\t\t\t'.select-navigation',\n");
          out.write("\t\t\t() => {\n");
          out.write("\t\t\t\tvar siteNavigationDisabled =\n");
          out.write("\t\t\t\t\tselectSiteNavigationMenuTypeSelect.disabled;\n");
          out.write("\n");
          out.write("\t\t\t\tLiferay.Util.toggleDisabled(\n");
          out.write("\t\t\t\t\tchooseSiteNavigationMenu,\n");
          out.write("\t\t\t\t\tsiteNavigationDisabled\n");
          out.write("\t\t\t\t);\n");
          out.write("\t\t\t\tLiferay.Util.toggleDisabled(\n");
          out.write("\t\t\t\t\tselectSiteNavigationMenuTypeSelect,\n");
          out.write("\t\t\t\t\t!siteNavigationDisabled\n");
          out.write("\t\t\t\t);\n");
          out.write("\n");
          out.write("\t\t\t\tnavigationMenuName.innerText = '';\n");
          out.write("\t\t\t\tsiteNavigationMenuIdInput.value = 0;\n");
          out.write("\t\t\t\tsiteNavigationMenuType.value = -1;\n");
          out.write("\n");
          out.write("\t\t\t\tremoveSiteNavigationMenu.classList.add('hide');\n");
          out.write("\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_portlet_namespace_31((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("resetPreview();\n");
          out.write("\t\t\t}\n");
          out.write("\t\t);\n");
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

  private boolean _jspx_meth_aui_icon_0(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1frontend_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:icon
    com.liferay.taglib.aui.IconTag _jspx_th_aui_icon_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.IconTag.class) : new com.liferay.taglib.aui.IconTag();
    _jspx_th_aui_icon_0.setPageContext(_jspx_page_context);
    _jspx_th_aui_icon_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
    _jspx_th_aui_icon_0.setCssClass("icon-monospaced");
    _jspx_th_aui_icon_0.setImage("times-circle");
    _jspx_th_aui_icon_0.setMarkupView("lexicon");
    int _jspx_eval_aui_icon_0 = _jspx_th_aui_icon_0.doStartTag();
    if (_jspx_th_aui_icon_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_icon_0);
      _jspx_th_aui_icon_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_icon_0);
    _jspx_th_aui_icon_0.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_2(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1frontend_fieldset_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_2.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_1);
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

  private boolean _jspx_meth_aui_option_6(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:option
    com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
    _jspx_th_aui_option_6.setPageContext(_jspx_page_context);
    _jspx_th_aui_option_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_1);
    _jspx_th_aui_option_6.setLabel(new String("level"));
    _jspx_th_aui_option_6.setValue(new String("absolute"));
    int _jspx_eval_aui_option_6 = _jspx_th_aui_option_6.doStartTag();
    if (_jspx_th_aui_option_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_6);
      _jspx_th_aui_option_6.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_6);
    _jspx_th_aui_option_6.release();
    return false;
  }

  private boolean _jspx_meth_aui_option_7(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:option
    com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
    _jspx_th_aui_option_7.setPageContext(_jspx_page_context);
    _jspx_th_aui_option_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_1);
    _jspx_th_aui_option_7.setLabel(new String("level-relative-to-the-current-menu-item"));
    _jspx_th_aui_option_7.setValue(new String("relative"));
    int _jspx_eval_aui_option_7 = _jspx_th_aui_option_7.doStartTag();
    if (_jspx_th_aui_option_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_7);
      _jspx_th_aui_option_7.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_7);
    _jspx_th_aui_option_7.release();
    return false;
  }

  private boolean _jspx_meth_aui_option_8(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:option
    com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
    _jspx_th_aui_option_8.setPageContext(_jspx_page_context);
    _jspx_th_aui_option_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_1);
    _jspx_th_aui_option_8.setLabel(new String("select-parent"));
    _jspx_th_aui_option_8.setValue(new String("select"));
    int _jspx_eval_aui_option_8 = _jspx_th_aui_option_8.doStartTag();
    if (_jspx_th_aui_option_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_8);
      _jspx_th_aui_option_8.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_8);
    _jspx_th_aui_option_8.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_3(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_col_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_3.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_2);
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

  private boolean _jspx_meth_portlet_namespace_4(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_col_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_4.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_3);
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

  private boolean _jspx_meth_clay_content$1col_0(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_content$1row_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:content-col
    com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
    _jspx_th_clay_content$1col_0.setPageContext(_jspx_page_context);
    _jspx_th_clay_content$1col_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_0);
    int _jspx_eval_clay_content$1col_0 = _jspx_th_clay_content$1col_0.doStartTag();
    if (_jspx_eval_clay_content$1col_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_clay_sticker_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_content$1col_0, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
    }
    if (_jspx_th_clay_content$1col_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_0);
      _jspx_th_clay_content$1col_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_0);
    _jspx_th_clay_content$1col_0.release();
    return false;
  }

  private boolean _jspx_meth_clay_sticker_0(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_content$1col_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:sticker
    com.liferay.frontend.taglib.clay.servlet.taglib.StickerTag _jspx_th_clay_sticker_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.StickerTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.StickerTag();
    _jspx_th_clay_sticker_0.setPageContext(_jspx_page_context);
    _jspx_th_clay_sticker_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_0);
    _jspx_th_clay_sticker_0.setCssClass("sticker-static");
    _jspx_th_clay_sticker_0.setDisplayType("secondary");
    _jspx_th_clay_sticker_0.setIcon("blogs");
    int _jspx_eval_clay_sticker_0 = _jspx_th_clay_sticker_0.doStartTag();
    if (_jspx_th_clay_sticker_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sticker_0);
      _jspx_th_clay_sticker_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sticker_0);
    _jspx_th_clay_sticker_0.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_5(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_content$1col_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_5.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_1);
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

  private boolean _jspx_meth_aui_button_1(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_col_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:button
    com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
    _jspx_th_aui_button_1.setPageContext(_jspx_page_context);
    _jspx_th_aui_button_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_3);
    _jspx_th_aui_button_1.setName("chooseRootMenuItem");
    _jspx_th_aui_button_1.setValue("menu-item");
    int _jspx_eval_aui_button_1 = _jspx_th_aui_button_1.doStartTag();
    if (_jspx_th_aui_button_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_1);
      _jspx_th_aui_button_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_1);
    _jspx_th_aui_button_1.release();
    return false;
  }

  private boolean _jspx_meth_aui_option_10(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_select_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:option
    com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
    _jspx_th_aui_option_10.setPageContext(_jspx_page_context);
    _jspx_th_aui_option_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_3);
    _jspx_th_aui_option_10.setLabel(new String("unlimited"));
    _jspx_th_aui_option_10.setValue(new String("0"));
    int _jspx_eval_aui_option_10 = _jspx_th_aui_option_10.doStartTag();
    if (_jspx_th_aui_option_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_10);
      _jspx_th_aui_option_10.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_10);
    _jspx_th_aui_option_10.release();
    return false;
  }

  private boolean _jspx_meth_aui_option_12(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_select_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:option
    com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_12 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
    _jspx_th_aui_option_12.setPageContext(_jspx_page_context);
    _jspx_th_aui_option_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_4);
    _jspx_th_aui_option_12.setLabel(new String("auto"));
    int _jspx_eval_aui_option_12 = _jspx_th_aui_option_12.doStartTag();
    if (_jspx_th_aui_option_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_12);
      _jspx_th_aui_option_12.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_12);
    _jspx_th_aui_option_12.release();
    return false;
  }

  private boolean _jspx_meth_aui_option_13(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_select_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:option
    com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_13 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
    _jspx_th_aui_option_13.setPageContext(_jspx_page_context);
    _jspx_th_aui_option_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_4);
    _jspx_th_aui_option_13.setLabel(new String("all"));
    int _jspx_eval_aui_option_13 = _jspx_th_aui_option_13.doStartTag();
    if (_jspx_th_aui_option_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_13);
      _jspx_th_aui_option_13.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_13);
    _jspx_th_aui_option_13.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1frontend_edit$1form$1footer_0(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1frontend_edit$1form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-frontend:edit-form-footer
    com.liferay.frontend.taglib.servlet.taglib.EditFormFooterTag _jspx_th_liferay$1frontend_edit$1form$1footer_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.EditFormFooterTag.class) : new com.liferay.frontend.taglib.servlet.taglib.EditFormFooterTag();
    _jspx_th_liferay$1frontend_edit$1form$1footer_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1frontend_edit$1form$1footer_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form_0);
    int _jspx_eval_liferay$1frontend_edit$1form$1footer_0 = _jspx_th_liferay$1frontend_edit$1form$1footer_0.doStartTag();
    if (_jspx_eval_liferay$1frontend_edit$1form$1footer_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("\t\t");
      if (_jspx_meth_aui_button_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1frontend_edit$1form$1footer_0, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("\n");
      out.write("\t\t");
      if (_jspx_meth_aui_button_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1frontend_edit$1form$1footer_0, _jspx_page_context))
        return true;
      out.write('\n');
      out.write('	');
    }
    if (_jspx_th_liferay$1frontend_edit$1form$1footer_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_edit$1form$1footer_0);
      _jspx_th_liferay$1frontend_edit$1form$1footer_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_edit$1form$1footer_0);
    _jspx_th_liferay$1frontend_edit$1form$1footer_0.release();
    return false;
  }

  private boolean _jspx_meth_aui_button_2(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1frontend_edit$1form$1footer_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:button
    com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
    _jspx_th_aui_button_2.setPageContext(_jspx_page_context);
    _jspx_th_aui_button_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form$1footer_0);
    _jspx_th_aui_button_2.setType("submit");
    int _jspx_eval_aui_button_2 = _jspx_th_aui_button_2.doStartTag();
    if (_jspx_th_aui_button_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_2);
      _jspx_th_aui_button_2.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_2);
    _jspx_th_aui_button_2.release();
    return false;
  }

  private boolean _jspx_meth_aui_button_3(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1frontend_edit$1form$1footer_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:button
    com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
    _jspx_th_aui_button_3.setPageContext(_jspx_page_context);
    _jspx_th_aui_button_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form$1footer_0);
    _jspx_th_aui_button_3.setType("cancel");
    int _jspx_eval_aui_button_3 = _jspx_th_aui_button_3.doStartTag();
    if (_jspx_th_aui_button_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_3);
      _jspx_th_aui_button_3.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_3);
    _jspx_th_aui_button_3.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_6(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_6.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
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

  private boolean _jspx_meth_portlet_namespace_7(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_7.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
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

  private boolean _jspx_meth_portlet_namespace_8(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_8.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_8 = _jspx_th_portlet_namespace_8.doStartTag();
    if (_jspx_th_portlet_namespace_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_8);
      _jspx_th_portlet_namespace_8.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_8);
    _jspx_th_portlet_namespace_8.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_9(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_9.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_9 = _jspx_th_portlet_namespace_9.doStartTag();
    if (_jspx_th_portlet_namespace_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_9);
      _jspx_th_portlet_namespace_9.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_9);
    _jspx_th_portlet_namespace_9.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_10(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_10.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_10 = _jspx_th_portlet_namespace_10.doStartTag();
    if (_jspx_th_portlet_namespace_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_10);
      _jspx_th_portlet_namespace_10.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_10);
    _jspx_th_portlet_namespace_10.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_11(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_11.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_11 = _jspx_th_portlet_namespace_11.doStartTag();
    if (_jspx_th_portlet_namespace_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_11);
      _jspx_th_portlet_namespace_11.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_11);
    _jspx_th_portlet_namespace_11.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_12(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_12 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_12.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_12 = _jspx_th_portlet_namespace_12.doStartTag();
    if (_jspx_th_portlet_namespace_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_12);
      _jspx_th_portlet_namespace_12.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_12);
    _jspx_th_portlet_namespace_12.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_13(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_13 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_13.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_13 = _jspx_th_portlet_namespace_13.doStartTag();
    if (_jspx_th_portlet_namespace_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_13);
      _jspx_th_portlet_namespace_13.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_13);
    _jspx_th_portlet_namespace_13.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_14(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_14 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_14.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_14 = _jspx_th_portlet_namespace_14.doStartTag();
    if (_jspx_th_portlet_namespace_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_14);
      _jspx_th_portlet_namespace_14.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_14);
    _jspx_th_portlet_namespace_14.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_15(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_15 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_15.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_15 = _jspx_th_portlet_namespace_15.doStartTag();
    if (_jspx_th_portlet_namespace_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_15);
      _jspx_th_portlet_namespace_15.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_15);
    _jspx_th_portlet_namespace_15.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    _jspx_th_liferay$1ui_message_0.setKey("select-site-navigation-menu-item");
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

  private boolean _jspx_meth_portlet_namespace_16(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_16 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_16.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_16 = _jspx_th_portlet_namespace_16.doStartTag();
    if (_jspx_th_portlet_namespace_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_16);
      _jspx_th_portlet_namespace_16.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_16);
    _jspx_th_portlet_namespace_16.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_17(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_17 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_17.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_17 = _jspx_th_portlet_namespace_17.doStartTag();
    if (_jspx_th_portlet_namespace_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_17);
      _jspx_th_portlet_namespace_17.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_17);
    _jspx_th_portlet_namespace_17.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_18(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_18 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_18.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_18 = _jspx_th_portlet_namespace_18.doStartTag();
    if (_jspx_th_portlet_namespace_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_18);
      _jspx_th_portlet_namespace_18.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_18);
    _jspx_th_portlet_namespace_18.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_19(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_19 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_19.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_19 = _jspx_th_portlet_namespace_19.doStartTag();
    if (_jspx_th_portlet_namespace_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_19);
      _jspx_th_portlet_namespace_19.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_19);
    _jspx_th_portlet_namespace_19.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_20(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_20 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_20.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_20 = _jspx_th_portlet_namespace_20.doStartTag();
    if (_jspx_th_portlet_namespace_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_20);
      _jspx_th_portlet_namespace_20.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_20);
    _jspx_th_portlet_namespace_20.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    _jspx_th_liferay$1ui_message_1.setKey("select-site-navigation-menu");
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

  private boolean _jspx_meth_portlet_namespace_21(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_21 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_21.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_21 = _jspx_th_portlet_namespace_21.doStartTag();
    if (_jspx_th_portlet_namespace_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_21);
      _jspx_th_portlet_namespace_21.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_21);
    _jspx_th_portlet_namespace_21.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_22(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_22 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_22.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_22 = _jspx_th_portlet_namespace_22.doStartTag();
    if (_jspx_th_portlet_namespace_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_22);
      _jspx_th_portlet_namespace_22.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_22);
    _jspx_th_portlet_namespace_22.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_23(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_23 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_23.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_23 = _jspx_th_portlet_namespace_23.doStartTag();
    if (_jspx_th_portlet_namespace_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_23);
      _jspx_th_portlet_namespace_23.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_23);
    _jspx_th_portlet_namespace_23.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_24(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_24 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_24.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_24 = _jspx_th_portlet_namespace_24.doStartTag();
    if (_jspx_th_portlet_namespace_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_24);
      _jspx_th_portlet_namespace_24.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_24);
    _jspx_th_portlet_namespace_24.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_25(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_25 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_25.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_25 = _jspx_th_portlet_namespace_25.doStartTag();
    if (_jspx_th_portlet_namespace_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_25);
      _jspx_th_portlet_namespace_25.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_25);
    _jspx_th_portlet_namespace_25.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_26(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_26 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_26.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_26 = _jspx_th_portlet_namespace_26.doStartTag();
    if (_jspx_th_portlet_namespace_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_26);
      _jspx_th_portlet_namespace_26.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_26);
    _jspx_th_portlet_namespace_26.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_27(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_27 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_27.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_27 = _jspx_th_portlet_namespace_27.doStartTag();
    if (_jspx_th_portlet_namespace_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_27);
      _jspx_th_portlet_namespace_27.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_27);
    _jspx_th_portlet_namespace_27.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_28(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_28 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_28.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_28 = _jspx_th_portlet_namespace_28.doStartTag();
    if (_jspx_th_portlet_namespace_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_28);
      _jspx_th_portlet_namespace_28.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_28);
    _jspx_th_portlet_namespace_28.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_29(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_29 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_29.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_29 = _jspx_th_portlet_namespace_29.doStartTag();
    if (_jspx_th_portlet_namespace_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_29);
      _jspx_th_portlet_namespace_29.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_29);
    _jspx_th_portlet_namespace_29.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_30(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_30 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_30.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_30 = _jspx_th_portlet_namespace_30.doStartTag();
    if (_jspx_th_portlet_namespace_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_30);
      _jspx_th_portlet_namespace_30.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_30);
    _jspx_th_portlet_namespace_30.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_31(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_31 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_31.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_31 = _jspx_th_portlet_namespace_31.doStartTag();
    if (_jspx_th_portlet_namespace_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_31);
      _jspx_th_portlet_namespace_31.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_31);
    _jspx_th_portlet_namespace_31.release();
    return false;
  }
}
