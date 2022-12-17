package org.apache.jsp.layout.screen.navigation.entries;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.dynamic.data.mapping.validator.DDMFormValuesValidationException;
import com.liferay.layout.admin.kernel.model.LayoutTypePortletConstants;
import com.liferay.layout.seo.model.LayoutSEOEntry;
import com.liferay.layout.seo.model.LayoutSEOSite;
import com.liferay.layout.seo.web.internal.constants.LayoutSEOWebKeys;
import com.liferay.layout.seo.web.internal.display.context.LayoutsSEODisplayContext;
import com.liferay.layout.seo.web.internal.display.context.OpenGraphSettingsDisplayContext;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.SitemapChangeFrequencyException;
import com.liferay.portal.kernel.exception.SitemapIncludeException;
import com.liferay.portal.kernel.exception.SitemapPagePriorityException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.util.PropsValues;
import java.util.Collections;

public final class open_005fgraph_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write('\n');
      out.write('\n');

String redirect = ParamUtil.getString(request, "redirect");

String backURL = ParamUtil.getString(request, "backURL", redirect);

LayoutsSEODisplayContext layoutsSEODisplayContext = (LayoutsSEODisplayContext)request.getAttribute(LayoutSEOWebKeys.LAYOUT_PAGE_LAYOUT_SEO_DISPLAY_CONTEXT);

if (Validator.isNull(backURL)) {
	backURL = PortalUtil.getLayoutFullURL(layoutsSEODisplayContext.getSelLayout(), themeDisplay);
}

Layout selLayout = layoutsSEODisplayContext.getSelLayout();

      out.write('\n');
      out.write('\n');
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
          out.write("\t<link href=\"");
          out.print( PortalUtil.getStaticResourceURL(request, PortalUtil.getPathProxy() + application.getContextPath() + "/css/main.css") );
          out.write("\" rel=\"stylesheet\" type=\"text/css\" />\n");
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
      out.write('\n');
      out.write('\n');
      //  portlet:actionURL
      com.liferay.taglib.portlet.ActionURLTag _jspx_th_portlet_actionURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ActionURLTag.class) : new com.liferay.taglib.portlet.ActionURLTag();
      _jspx_th_portlet_actionURL_0.setPageContext(_jspx_page_context);
      _jspx_th_portlet_actionURL_0.setParent(null);
      _jspx_th_portlet_actionURL_0.setCopyCurrentRenderParameters( true );
      _jspx_th_portlet_actionURL_0.setName("/layout/edit_open_graph");
      _jspx_th_portlet_actionURL_0.setVar("editOpenGraphURL");
      int _jspx_eval_portlet_actionURL_0 = _jspx_th_portlet_actionURL_0.doStartTag();
      if (_jspx_th_portlet_actionURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_0);
        _jspx_th_portlet_actionURL_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_0);
      _jspx_th_portlet_actionURL_0.release();
      java.lang.String editOpenGraphURL = null;
      editOpenGraphURL = (java.lang.String) _jspx_page_context.findAttribute("editOpenGraphURL");
      out.write('\n');
      out.write('\n');
      //  aui:form
      com.liferay.taglib.aui.FormTag _jspx_th_aui_form_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FormTag.class) : new com.liferay.taglib.aui.FormTag();
      _jspx_th_aui_form_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_form_0.setParent(null);
      _jspx_th_aui_form_0.setAction( editOpenGraphURL );
      _jspx_th_aui_form_0.setMethod("post");
      _jspx_th_aui_form_0.setName("fm");
      int _jspx_eval_aui_form_0 = _jspx_th_aui_form_0.doStartTag();
      if (_jspx_eval_aui_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write('\n');
        out.write('	');
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_0.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_0.setName("redirect");
        _jspx_th_aui_input_0.setType("hidden");
        _jspx_th_aui_input_0.setValue( currentURL );
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
        _jspx_th_aui_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_1.setName("portletResource");
        _jspx_th_aui_input_1.setType("hidden");
        _jspx_th_aui_input_1.setValue( ParamUtil.getString(request, "portletResource") );
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
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_2.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_2.setName("groupId");
        _jspx_th_aui_input_2.setType("hidden");
        _jspx_th_aui_input_2.setValue( layoutsSEODisplayContext.getGroupId() );
        int _jspx_eval_aui_input_2 = _jspx_th_aui_input_2.doStartTag();
        if (_jspx_th_aui_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_2);
          _jspx_th_aui_input_2.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_2);
        _jspx_th_aui_input_2.release();
        out.write('\n');
        out.write('	');
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_3.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_3.setName("privateLayout");
        _jspx_th_aui_input_3.setType("hidden");
        _jspx_th_aui_input_3.setValue( layoutsSEODisplayContext.isPrivateLayout() );
        int _jspx_eval_aui_input_3 = _jspx_th_aui_input_3.doStartTag();
        if (_jspx_th_aui_input_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_3);
          _jspx_th_aui_input_3.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_3);
        _jspx_th_aui_input_3.release();
        out.write('\n');
        out.write('	');
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_4.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_4.setName("layoutId");
        _jspx_th_aui_input_4.setType("hidden");
        _jspx_th_aui_input_4.setValue( layoutsSEODisplayContext.getLayoutId() );
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
        out.write("\t");
        //  clay:sheet
        com.liferay.frontend.taglib.clay.servlet.taglib.SheetTag _jspx_th_clay_sheet_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.SheetTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.SheetTag();
        _jspx_th_clay_sheet_0.setPageContext(_jspx_page_context);
        _jspx_th_clay_sheet_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        int _jspx_eval_clay_sheet_0 = _jspx_th_clay_sheet_0.doStartTag();
        if (_jspx_eval_clay_sheet_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t");
          if (_jspx_meth_clay_sheet$1header_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_sheet_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  clay:sheet-section
          com.liferay.frontend.taglib.clay.servlet.taglib.SheetSectionTag _jspx_th_clay_sheet$1section_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.SheetSectionTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.SheetSectionTag();
          _jspx_th_clay_sheet$1section_0.setPageContext(_jspx_page_context);
          _jspx_th_clay_sheet$1section_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet_0);
          int _jspx_eval_clay_sheet$1section_0 = _jspx_th_clay_sheet$1section_0.doStartTag();
          if (_jspx_eval_clay_sheet$1section_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t");
            //  liferay-ui:error-marker
            com.liferay.taglib.ui.ErrorMarkerTag _jspx_th_liferay$1ui_error$1marker_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorMarkerTag.class) : new com.liferay.taglib.ui.ErrorMarkerTag();
            _jspx_th_liferay$1ui_error$1marker_0.setPageContext(_jspx_page_context);
            _jspx_th_liferay$1ui_error$1marker_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
            _jspx_th_liferay$1ui_error$1marker_0.setKey( WebKeys.ERROR_SECTION );
            _jspx_th_liferay$1ui_error$1marker_0.setValue("open-graph");
            int _jspx_eval_liferay$1ui_error$1marker_0 = _jspx_th_liferay$1ui_error$1marker_0.doStartTag();
            if (_jspx_th_liferay$1ui_error$1marker_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error$1marker_0);
              _jspx_th_liferay$1ui_error$1marker_0.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error$1marker_0);
            _jspx_th_liferay$1ui_error$1marker_0.release();
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t<p class=\"text-secondary\">\n");
            out.write("\t\t\t\t");
            if (_jspx_meth_liferay$1ui_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_sheet$1section_0, _jspx_page_context))
              return;
            out.write("\n");
            out.write("\t\t\t</p>\n");
            out.write("\n");
            out.write("\t\t\t");
            //  clay:alert
            com.liferay.frontend.taglib.clay.servlet.taglib.AlertTag _jspx_th_clay_alert_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.AlertTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.AlertTag();
            _jspx_th_clay_alert_0.setPageContext(_jspx_page_context);
            _jspx_th_clay_alert_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
            _jspx_th_clay_alert_0.setDisplayType("info");
            _jspx_th_clay_alert_0.setMessage( LanguageUtil.get(request, "add-multiple-fields-to-define-how-the-meta-tags-will-be-filled") );
            int _jspx_eval_clay_alert_0 = _jspx_th_clay_alert_0.doStartTag();
            if (_jspx_th_clay_alert_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_alert_0);
              _jspx_th_clay_alert_0.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_alert_0);
            _jspx_th_clay_alert_0.release();
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t");
            out.write("\n");
            out.write("\t\t\t\t");
if (
 selLayout.isTypeAssetDisplay() ) {
            out.write("\n");
            out.write("\t\t\t\t\t<div class=\"dpt-mapping\">\n");
            out.write("\t\t\t\t\t\t<div class=\"dpt-mapping-placeholder\">\n");
            out.write("\t\t\t\t\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
            _jspx_th_aui_input_5.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
            _jspx_th_aui_input_5.setDisabled( true );
            _jspx_th_aui_input_5.setLabel("title");
            _jspx_th_aui_input_5.setLocalized( false );
            _jspx_th_aui_input_5.setName("openGraphTitle");
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
            out.write("\t\t\t\t\t\t\t<div class=\"form-text\">\n");
            out.write("\t\t\t\t\t\t\t\t");
            //  liferay-ui:message
            com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
            _jspx_th_liferay$1ui_message_2.setPageContext(_jspx_page_context);
            _jspx_th_liferay$1ui_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
            _jspx_th_liferay$1ui_message_2.setArguments( new String[] {"text", "title"} );
            _jspx_th_liferay$1ui_message_2.setKey("map-a-x-field-it-will-be-used-as-x");
            int _jspx_eval_liferay$1ui_message_2 = _jspx_th_liferay$1ui_message_2.doStartTag();
            if (_jspx_th_liferay$1ui_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
              _jspx_th_liferay$1ui_message_2.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
            _jspx_th_liferay$1ui_message_2.release();
            out.write("\n");
            out.write("\t\t\t\t\t\t\t</div>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
            _jspx_th_aui_input_6.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
            _jspx_th_aui_input_6.setDisabled( true );
            _jspx_th_aui_input_6.setLabel("description");
            _jspx_th_aui_input_6.setLocalized( false );
            _jspx_th_aui_input_6.setName("openGraphDescription");
            _jspx_th_aui_input_6.setType("textarea");
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
            out.write("\t\t\t\t\t\t\t<div class=\"form-text\">\n");
            out.write("\t\t\t\t\t\t\t\t");
            //  liferay-ui:message
            com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
            _jspx_th_liferay$1ui_message_3.setPageContext(_jspx_page_context);
            _jspx_th_liferay$1ui_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
            _jspx_th_liferay$1ui_message_3.setArguments( new String[] {"text", "description"} );
            _jspx_th_liferay$1ui_message_3.setKey("map-a-x-field-it-will-be-used-as-x");
            int _jspx_eval_liferay$1ui_message_3 = _jspx_th_liferay$1ui_message_3.doStartTag();
            if (_jspx_th_liferay$1ui_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_3);
              _jspx_th_liferay$1ui_message_3.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_3);
            _jspx_th_liferay$1ui_message_3.release();
            out.write("\n");
            out.write("\t\t\t\t\t\t\t</div>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
            _jspx_th_aui_input_7.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
            _jspx_th_aui_input_7.setDisabled( true );
            _jspx_th_aui_input_7.setLabel("image");
            _jspx_th_aui_input_7.setLocalized( false );
            _jspx_th_aui_input_7.setName("openGraphImageTitle");
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
            out.write("\t\t\t\t\t\t\t<div class=\"form-text\">\n");
            out.write("\t\t\t\t\t\t\t\t");
            //  liferay-ui:message
            com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
            _jspx_th_liferay$1ui_message_4.setPageContext(_jspx_page_context);
            _jspx_th_liferay$1ui_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
            _jspx_th_liferay$1ui_message_4.setArguments( new String[] {"image", "image"} );
            _jspx_th_liferay$1ui_message_4.setKey("map-a-x-field-it-will-be-used-as-x");
            int _jspx_eval_liferay$1ui_message_4 = _jspx_th_liferay$1ui_message_4.doStartTag();
            if (_jspx_th_liferay$1ui_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_4);
              _jspx_th_liferay$1ui_message_4.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_4);
            _jspx_th_liferay$1ui_message_4.release();
            out.write("\n");
            out.write("\t\t\t\t\t\t\t</div>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
            _jspx_th_aui_input_8.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
            _jspx_th_aui_input_8.setDisabled( true );
            _jspx_th_aui_input_8.setLabel("open-graph-image-alt-description");
            _jspx_th_aui_input_8.setName("openGraphImageAlt");
            _jspx_th_aui_input_8.setType("textarea");
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
            out.write("\t\t\t\t\t\t\t<div class=\"form-text\">\n");
            out.write("\t\t\t\t\t\t\t\t");
            //  liferay-ui:message
            com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
            _jspx_th_liferay$1ui_message_5.setPageContext(_jspx_page_context);
            _jspx_th_liferay$1ui_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
            _jspx_th_liferay$1ui_message_5.setArguments( new String[] {"text", "open-graph-image-alt-description"} );
            _jspx_th_liferay$1ui_message_5.setKey("map-a-x-field-it-will-be-used-as-x");
            int _jspx_eval_liferay$1ui_message_5 = _jspx_th_liferay$1ui_message_5.doStartTag();
            if (_jspx_th_liferay$1ui_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_5);
              _jspx_th_liferay$1ui_message_5.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_5);
            _jspx_th_liferay$1ui_message_5.release();
            out.write("\n");
            out.write("\t\t\t\t\t\t\t</div>\n");
            out.write("\t\t\t\t\t\t</div>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t");
            //  react:component
            com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag _jspx_th_react_component_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag.class) : new com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag();
            _jspx_th_react_component_0.setPageContext(_jspx_page_context);
            _jspx_th_react_component_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
            _jspx_th_react_component_0.setModule("js/seo/display_page_templates/OpenGraphMapping");
            _jspx_th_react_component_0.setProps( layoutsSEODisplayContext.getOpenGraphMappingData() );
            _jspx_th_react_component_0.setServletContext( application );
            int _jspx_eval_react_component_0 = _jspx_th_react_component_0.doStartTag();
            if (_jspx_th_react_component_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_react_component_0);
              _jspx_th_react_component_0.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_react_component_0);
            _jspx_th_react_component_0.release();
            out.write("\n");
            out.write("\t\t\t\t\t</div>\n");
            out.write("\t\t\t\t");
            out.write("\n");
            out.write("\t\t\t\t");
}
else {
            out.write("\n");
            out.write("\t\t\t\t\t");
            //  aui:model-context
            com.liferay.taglib.aui.ModelContextTag _jspx_th_aui_model$1context_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ModelContextTag.class) : new com.liferay.taglib.aui.ModelContextTag();
            _jspx_th_aui_model$1context_0.setPageContext(_jspx_page_context);
            _jspx_th_aui_model$1context_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
            _jspx_th_aui_model$1context_0.setBean( selLayout );
            _jspx_th_aui_model$1context_0.setModel( Layout.class );
            int _jspx_eval_aui_model$1context_0 = _jspx_th_aui_model$1context_0.doStartTag();
            if (_jspx_th_aui_model$1context_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_model$1context_0);
              _jspx_th_aui_model$1context_0.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_model$1context_0);
            _jspx_th_aui_model$1context_0.release();
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t<div class=\"form-group\">\n");
            out.write("\t\t\t\t\t\t<label class=\"control-label\">");
            if (_jspx_meth_liferay$1ui_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_sheet$1section_0, _jspx_page_context))
              return;
            out.write(' ');
            if (_jspx_meth_liferay$1ui_icon$1help_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_sheet$1section_0, _jspx_page_context))
              return;
            out.write("</label>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
            _jspx_th_aui_input_9.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
            _jspx_th_aui_input_9.setLabel( StringPool.BLANK );
            _jspx_th_aui_input_9.setName("openGraphImageTitle");
            _jspx_th_aui_input_9.setPlaceholder("image");
            _jspx_th_aui_input_9.setDynamicAttribute(null, "readonly",  true );
            _jspx_th_aui_input_9.setTitle("image");
            _jspx_th_aui_input_9.setType("text");
            _jspx_th_aui_input_9.setValue( layoutsSEODisplayContext.getOpenGraphImageTitle() );
            _jspx_th_aui_input_9.setWrapperCssClass("mb-3");
            int _jspx_eval_aui_input_9 = _jspx_th_aui_input_9.doStartTag();
            if (_jspx_th_aui_input_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_9);
              _jspx_th_aui_input_9.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_9);
            _jspx_th_aui_input_9.release();
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t");
            if (_jspx_meth_aui_button$1row_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_sheet$1section_0, _jspx_page_context))
              return;
            out.write("\n");
            out.write("\t\t\t\t\t</div>\n");
            out.write("\n");
            out.write("\t\t\t\t\t");

					LayoutSEOEntry selLayoutSEOEntry = layoutsSEODisplayContext.getSelLayoutSEOEntry();
					
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t<div id=\"");
            if (_jspx_meth_portlet_namespace_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_sheet$1section_0, _jspx_page_context))
              return;
            out.write("openGraphSettings\">\n");
            out.write("\t\t\t\t\t\t");
            //  aui:model-context
            com.liferay.taglib.aui.ModelContextTag _jspx_th_aui_model$1context_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ModelContextTag.class) : new com.liferay.taglib.aui.ModelContextTag();
            _jspx_th_aui_model$1context_1.setPageContext(_jspx_page_context);
            _jspx_th_aui_model$1context_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
            _jspx_th_aui_model$1context_1.setBean( selLayoutSEOEntry );
            _jspx_th_aui_model$1context_1.setModel( LayoutSEOEntry.class );
            int _jspx_eval_aui_model$1context_1 = _jspx_th_aui_model$1context_1.doStartTag();
            if (_jspx_th_aui_model$1context_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_model$1context_1);
              _jspx_th_aui_model$1context_1.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_model$1context_1);
            _jspx_th_aui_model$1context_1.release();
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
            _jspx_th_aui_input_10.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
            _jspx_th_aui_input_10.setDisabled( (selLayoutSEOEntry != null) ? Validator.isNull(layoutsSEODisplayContext.getOpenGraphImageTitle()) : true );
            _jspx_th_aui_input_10.setHelpMessage("open-graph-image-alt-description-help");
            _jspx_th_aui_input_10.setLabel("open-graph-image-alt-description");
            _jspx_th_aui_input_10.setName("openGraphImageAlt");
            _jspx_th_aui_input_10.setPlaceholder("open-graph-alt-description");
            int _jspx_eval_aui_input_10 = _jspx_th_aui_input_10.doStartTag();
            if (_jspx_th_aui_input_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_10);
              _jspx_th_aui_input_10.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_10);
            _jspx_th_aui_input_10.release();
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
            _jspx_th_aui_input_11.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
            _jspx_th_aui_input_11.setChecked( (selLayoutSEOEntry != null) ? selLayoutSEOEntry.isOpenGraphTitleEnabled() : false );
            _jspx_th_aui_input_11.setHelpMessage("use-custom-open-graph-title-help");
            _jspx_th_aui_input_11.setLabel("use-custom-open-graph-title");
            _jspx_th_aui_input_11.setName("openGraphTitleEnabled");
            _jspx_th_aui_input_11.setType("checkbox");
            _jspx_th_aui_input_11.setWrapperCssClass("mb-1");
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
            out.write("\t\t\t\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_12 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
            _jspx_th_aui_input_12.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
            _jspx_th_aui_input_12.setDisabled( (selLayoutSEOEntry != null) ? !selLayoutSEOEntry.isOpenGraphTitleEnabled() : true );
            _jspx_th_aui_input_12.setLabel( StringPool.BLANK );
            _jspx_th_aui_input_12.setName("openGraphTitle");
            _jspx_th_aui_input_12.setPlaceholder("title");
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
            out.write("\t\t\t\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_13 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
            _jspx_th_aui_input_13.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
            _jspx_th_aui_input_13.setChecked( (selLayoutSEOEntry != null) ? selLayoutSEOEntry.isOpenGraphDescriptionEnabled() : false );
            _jspx_th_aui_input_13.setHelpMessage("use-custom-open-graph-description-help");
            _jspx_th_aui_input_13.setLabel("use-custom-open-graph-description");
            _jspx_th_aui_input_13.setName("openGraphDescriptionEnabled");
            _jspx_th_aui_input_13.setType("checkbox");
            _jspx_th_aui_input_13.setWrapperCssClass("mb-1");
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
            out.write("\t\t\t\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_14 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
            _jspx_th_aui_input_14.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
            _jspx_th_aui_input_14.setDisabled( (selLayoutSEOEntry != null) ? !selLayoutSEOEntry.isOpenGraphDescriptionEnabled() : true );
            _jspx_th_aui_input_14.setLabel( StringPool.BLANK );
            _jspx_th_aui_input_14.setName("openGraphDescription");
            _jspx_th_aui_input_14.setPlaceholder("description");
            int _jspx_eval_aui_input_14 = _jspx_th_aui_input_14.doStartTag();
            if (_jspx_th_aui_input_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_14);
              _jspx_th_aui_input_14.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_14);
            _jspx_th_aui_input_14.release();
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t");
            if (_jspx_meth_aui_input_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_sheet$1section_0, _jspx_page_context))
              return;
            out.write("\n");
            out.write("\t\t\t\t\t</div>\n");
            out.write("\n");
            out.write("\t\t\t\t\t<div class=\"form-group\">\n");
            out.write("\t\t\t\t\t\t<label>");
            if (_jspx_meth_liferay$1ui_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_sheet$1section_0, _jspx_page_context))
              return;
            out.write(' ');
            if (_jspx_meth_liferay$1ui_icon$1help_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_sheet$1section_0, _jspx_page_context))
              return;
            out.write("</label>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t<div>\n");
            out.write("\t\t\t\t\t\t\t");
            //  react:component
            com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag _jspx_th_react_component_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag.class) : new com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag();
            _jspx_th_react_component_1.setPageContext(_jspx_page_context);
            _jspx_th_react_component_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
            _jspx_th_react_component_1.setModule("js/seo/PreviewSeo.es");
            _jspx_th_react_component_1.setProps(
									HashMapBuilder.<String, Object>put(
										"displayType", "og"
									).put(
										"targets",
										HashMapBuilder.<String, Object>put(
											"description",
											HashMapBuilder.<String, Object>put(
												"defaultValue", selLayout.getDescriptionMap()
											).put(
												"id", "openGraphDescription"
											).build()
										).put(
											"imgUrl",
											HashMapBuilder.<String, Object>put(
												"defaultValue", layoutsSEODisplayContext.getDefaultOpenGraphImageURL()
											).put(
												"value", layoutsSEODisplayContext.getOpenGraphImageURL()
											).build()
										).put(
											"title",
											HashMapBuilder.<String, Object>put(
												"defaultValue", layoutsSEODisplayContext.getDefaultPageTitleWithSuffixMap()
											).put(
												"id", "openGraphTitle"
											).build()
										).put(
											"url", Collections.singletonMap("defaultValue", layoutsSEODisplayContext.getDefaultCanonicalURLMap())
										).build()
									).build()
								);
            _jspx_th_react_component_1.setServletContext( application );
            int _jspx_eval_react_component_1 = _jspx_th_react_component_1.doStartTag();
            if (_jspx_th_react_component_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_react_component_1);
              _jspx_th_react_component_1.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_react_component_1);
            _jspx_th_react_component_1.release();
            out.write("\n");
            out.write("\t\t\t\t\t\t</div>\n");
            out.write("\t\t\t\t\t</div>\n");
            out.write("\n");
            out.write("\t\t\t\t\t");
            //  portlet:actionURL
            com.liferay.taglib.portlet.ActionURLTag _jspx_th_portlet_actionURL_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ActionURLTag.class) : new com.liferay.taglib.portlet.ActionURLTag();
            _jspx_th_portlet_actionURL_1.setPageContext(_jspx_page_context);
            _jspx_th_portlet_actionURL_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
            _jspx_th_portlet_actionURL_1.setName("/layout/upload_open_graph_image");
            _jspx_th_portlet_actionURL_1.setVar("uploadOpenGraphImageURL");
            int _jspx_eval_portlet_actionURL_1 = _jspx_th_portlet_actionURL_1.doStartTag();
            if (_jspx_th_portlet_actionURL_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_1);
              _jspx_th_portlet_actionURL_1.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_1);
            _jspx_th_portlet_actionURL_1.release();
            java.lang.String uploadOpenGraphImageURL = null;
            uploadOpenGraphImageURL = (java.lang.String) _jspx_page_context.findAttribute("uploadOpenGraphImageURL");
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t");
            //  liferay-frontend:component
            com.liferay.frontend.taglib.servlet.taglib.ComponentTag _jspx_th_liferay$1frontend_component_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.ComponentTag.class) : new com.liferay.frontend.taglib.servlet.taglib.ComponentTag();
            _jspx_th_liferay$1frontend_component_0.setPageContext(_jspx_page_context);
            _jspx_th_liferay$1frontend_component_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
            _jspx_th_liferay$1frontend_component_0.setContext(
							HashMapBuilder.<String, Object>put(
								"uploadOpenGraphImageURL", layoutsSEODisplayContext.getItemSelectorURL()
							).build()
						);
            _jspx_th_liferay$1frontend_component_0.setModule("js/seo/openGraph.es");
            _jspx_th_liferay$1frontend_component_0.setServletContext( application );
            int _jspx_eval_liferay$1frontend_component_0 = _jspx_th_liferay$1frontend_component_0.doStartTag();
            if (_jspx_th_liferay$1frontend_component_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_component_0);
              _jspx_th_liferay$1frontend_component_0.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_component_0);
            _jspx_th_liferay$1frontend_component_0.release();
            out.write("\n");
            out.write("\t\t\t\t");
            out.write("\n");
            out.write("\t\t\t");
}
            out.write("\n");
            out.write("\t\t");
          }
          if (_jspx_th_clay_sheet$1section_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sheet$1section_0);
            _jspx_th_clay_sheet$1section_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sheet$1section_0);
          _jspx_th_clay_sheet$1section_0.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  clay:sheet-footer
          com.liferay.frontend.taglib.clay.servlet.taglib.SheetFooterTag _jspx_th_clay_sheet$1footer_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.SheetFooterTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.SheetFooterTag();
          _jspx_th_clay_sheet$1footer_0.setPageContext(_jspx_page_context);
          _jspx_th_clay_sheet$1footer_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet_0);
          int _jspx_eval_clay_sheet$1footer_0 = _jspx_th_clay_sheet$1footer_0.doStartTag();
          if (_jspx_eval_clay_sheet$1footer_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t");
            //  aui:button
            com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
            _jspx_th_aui_button_2.setPageContext(_jspx_page_context);
            _jspx_th_aui_button_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1footer_0);
            _jspx_th_aui_button_2.setPrimary( true );
            _jspx_th_aui_button_2.setType("submit");
            int _jspx_eval_aui_button_2 = _jspx_th_aui_button_2.doStartTag();
            if (_jspx_th_aui_button_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_2);
              _jspx_th_aui_button_2.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_2);
            _jspx_th_aui_button_2.release();
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t");
            //  aui:button
            com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
            _jspx_th_aui_button_3.setPageContext(_jspx_page_context);
            _jspx_th_aui_button_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1footer_0);
            _jspx_th_aui_button_3.setHref( backURL );
            _jspx_th_aui_button_3.setType("cancel");
            int _jspx_eval_aui_button_3 = _jspx_th_aui_button_3.doStartTag();
            if (_jspx_th_aui_button_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_3);
              _jspx_th_aui_button_3.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_3);
            _jspx_th_aui_button_3.release();
            out.write("\n");
            out.write("\t\t");
          }
          if (_jspx_th_clay_sheet$1footer_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sheet$1footer_0);
            _jspx_th_clay_sheet$1footer_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sheet$1footer_0);
          _jspx_th_clay_sheet$1footer_0.release();
          out.write('\n');
          out.write('	');
        }
        if (_jspx_th_clay_sheet_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sheet_0);
          _jspx_th_clay_sheet_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sheet_0);
        _jspx_th_clay_sheet_0.release();
        out.write('\n');
      }
      if (_jspx_th_aui_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_form_0);
        _jspx_th_aui_form_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_form_0);
      _jspx_th_aui_form_0.release();
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

  private boolean _jspx_meth_clay_sheet$1header_0(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_sheet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:sheet-header
    com.liferay.frontend.taglib.clay.servlet.taglib.SheetHeaderTag _jspx_th_clay_sheet$1header_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.SheetHeaderTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.SheetHeaderTag();
    _jspx_th_clay_sheet$1header_0.setPageContext(_jspx_page_context);
    _jspx_th_clay_sheet$1header_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet_0);
    int _jspx_eval_clay_sheet$1header_0 = _jspx_th_clay_sheet$1header_0.doStartTag();
    if (_jspx_eval_clay_sheet$1header_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("\t\t\t<h2 class=\"sheet-title\">");
      if (_jspx_meth_liferay$1ui_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_sheet$1header_0, _jspx_page_context))
        return true;
      out.write("</h2>\n");
      out.write("\t\t");
    }
    if (_jspx_th_clay_sheet$1header_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sheet$1header_0);
      _jspx_th_clay_sheet$1header_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sheet$1header_0);
    _jspx_th_clay_sheet$1header_0.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_sheet$1header_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1header_0);
    _jspx_th_liferay$1ui_message_0.setKey("open-graph");
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

  private boolean _jspx_meth_liferay$1ui_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_sheet$1section_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
    _jspx_th_liferay$1ui_message_1.setKey("open-graph-description");
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

  private boolean _jspx_meth_liferay$1ui_message_6(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_sheet$1section_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_6.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
    _jspx_th_liferay$1ui_message_6.setKey("image");
    int _jspx_eval_liferay$1ui_message_6 = _jspx_th_liferay$1ui_message_6.doStartTag();
    if (_jspx_th_liferay$1ui_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_6);
      _jspx_th_liferay$1ui_message_6.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_6);
    _jspx_th_liferay$1ui_message_6.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_icon$1help_0(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_sheet$1section_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:icon-help
    com.liferay.taglib.ui.IconHelpTag _jspx_th_liferay$1ui_icon$1help_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconHelpTag.class) : new com.liferay.taglib.ui.IconHelpTag();
    _jspx_th_liferay$1ui_icon$1help_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_icon$1help_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
    _jspx_th_liferay$1ui_icon$1help_0.setMessage("open-graph-image-help");
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

  private boolean _jspx_meth_aui_button$1row_0(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_sheet$1section_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:button-row
    com.liferay.taglib.aui.ButtonRowTag _jspx_th_aui_button$1row_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonRowTag.class) : new com.liferay.taglib.aui.ButtonRowTag();
    _jspx_th_aui_button$1row_0.setPageContext(_jspx_page_context);
    _jspx_th_aui_button$1row_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
    _jspx_th_aui_button$1row_0.setCssClass("mt-0");
    int _jspx_eval_aui_button$1row_0 = _jspx_th_aui_button$1row_0.doStartTag();
    if (_jspx_eval_aui_button$1row_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_aui_button_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_button$1row_0, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_aui_button_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_button$1row_0, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("\t\t\t\t\t\t");
    }
    if (_jspx_th_aui_button$1row_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button$1row_0);
      _jspx_th_aui_button$1row_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button$1row_0);
    _jspx_th_aui_button$1row_0.release();
    return false;
  }

  private boolean _jspx_meth_aui_button_0(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_button$1row_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:button
    com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
    _jspx_th_aui_button_0.setPageContext(_jspx_page_context);
    _jspx_th_aui_button_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_button$1row_0);
    _jspx_th_aui_button_0.setName("openGraphImageButton");
    _jspx_th_aui_button_0.setValue("select");
    int _jspx_eval_aui_button_0 = _jspx_th_aui_button_0.doStartTag();
    if (_jspx_th_aui_button_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_0);
      _jspx_th_aui_button_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_0);
    _jspx_th_aui_button_0.release();
    return false;
  }

  private boolean _jspx_meth_aui_button_1(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_button$1row_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:button
    com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
    _jspx_th_aui_button_1.setPageContext(_jspx_page_context);
    _jspx_th_aui_button_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_button$1row_0);
    _jspx_th_aui_button_1.setName("openGraphClearImageButton");
    _jspx_th_aui_button_1.setValue("clear");
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

  private boolean _jspx_meth_portlet_namespace_0(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_sheet$1section_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_0.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
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

  private boolean _jspx_meth_aui_input_15(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_sheet$1section_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:input
    com.liferay.taglib.aui.InputTag _jspx_th_aui_input_15 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
    _jspx_th_aui_input_15.setPageContext(_jspx_page_context);
    _jspx_th_aui_input_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
    _jspx_th_aui_input_15.setId("openGraphImageFileEntryId");
    _jspx_th_aui_input_15.setName("openGraphImageFileEntryId");
    _jspx_th_aui_input_15.setType("hidden");
    int _jspx_eval_aui_input_15 = _jspx_th_aui_input_15.doStartTag();
    if (_jspx_th_aui_input_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_15);
      _jspx_th_aui_input_15.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_15);
    _jspx_th_aui_input_15.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_7(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_sheet$1section_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_7.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
    _jspx_th_liferay$1ui_message_7.setKey("preview");
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

  private boolean _jspx_meth_liferay$1ui_icon$1help_1(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_sheet$1section_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:icon-help
    com.liferay.taglib.ui.IconHelpTag _jspx_th_liferay$1ui_icon$1help_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconHelpTag.class) : new com.liferay.taglib.ui.IconHelpTag();
    _jspx_th_liferay$1ui_icon$1help_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_icon$1help_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
    _jspx_th_liferay$1ui_icon$1help_1.setMessage("preview-help");
    int _jspx_eval_liferay$1ui_icon$1help_1 = _jspx_th_liferay$1ui_icon$1help_1.doStartTag();
    if (_jspx_th_liferay$1ui_icon$1help_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon$1help_1);
      _jspx_th_liferay$1ui_icon$1help_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon$1help_1);
    _jspx_th_liferay$1ui_icon$1help_1.release();
    return false;
  }
}
