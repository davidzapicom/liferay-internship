package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.ratings.kernel.RatingsType;
import java.util.Map;

public final class page_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(7);
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/META-INF/c.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-clay.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-frontend.tld");
    _jspx_dependants.add("/META-INF/resources/react.tld");
    _jspx_dependants.add("/META-INF/liferay-theme.tld");
    _jspx_dependants.add("/META-INF/liferay-util.tld");
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

String type = GetterUtil.getString((String)request.getAttribute("liferay-ratings:ratings:type"));

      out.write('\n');
      out.write('\n');
      //  liferay-util:html-top
      com.liferay.taglib.util.HtmlTopTag _jspx_th_liferay$1util_html$1top_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.HtmlTopTag.class) : new com.liferay.taglib.util.HtmlTopTag();
      _jspx_th_liferay$1util_html$1top_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1util_html$1top_0.setParent(null);
      _jspx_th_liferay$1util_html$1top_0.setOutputKey("com.liferay.ratings.taglib.servlet.taglib#/page.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"ratings\">\n");
      out.write("\t");
      out.write("\n");
      out.write("\t\t");
if (
 type.equals(RatingsType.LIKE.getValue()) ) {
      out.write("\n");
      out.write("\t\t\t<div class=\"ratings-like\">\n");
      out.write("\t\t\t\t");
      //  clay:button
      com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag _jspx_th_clay_button_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag();
      _jspx_th_clay_button_0.setPageContext(_jspx_page_context);
      _jspx_th_clay_button_0.setParent(null);
      _jspx_th_clay_button_0.setBorderless( true );
      _jspx_th_clay_button_0.setDynamicAttribute(null, "disabled",  true );
      _jspx_th_clay_button_0.setDisplayType("secondary");
      _jspx_th_clay_button_0.setSmall( true );
      int _jspx_eval_clay_button_0 = _jspx_th_clay_button_0.doStartTag();
      if (_jspx_eval_clay_button_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_clay_icon_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_button_0, _jspx_page_context))
          return;
        out.write("\n");
        out.write("\t\t\t\t");
      }
      if (_jspx_th_clay_button_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_0);
        _jspx_th_clay_button_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_0);
      _jspx_th_clay_button_0.release();
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t");
}
else if (
 type.equals(RatingsType.THUMBS.getValue()) ) {
      out.write("\n");
      out.write("\t\t\t<div class=\"ratings-thumbs\">\n");
      out.write("\t\t\t\t");
      //  clay:button
      com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag _jspx_th_clay_button_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag();
      _jspx_th_clay_button_1.setPageContext(_jspx_page_context);
      _jspx_th_clay_button_1.setParent(null);
      _jspx_th_clay_button_1.setBorderless( true );
      _jspx_th_clay_button_1.setDynamicAttribute(null, "disabled",  true );
      _jspx_th_clay_button_1.setDisplayType("secondary");
      _jspx_th_clay_button_1.setSmall( true );
      int _jspx_eval_clay_button_1 = _jspx_th_clay_button_1.doStartTag();
      if (_jspx_eval_clay_button_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_clay_icon_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_button_1, _jspx_page_context))
          return;
        out.write("\n");
        out.write("\t\t\t\t");
      }
      if (_jspx_th_clay_button_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_1);
        _jspx_th_clay_button_1.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_1);
      _jspx_th_clay_button_1.release();
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");
      //  clay:button
      com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag _jspx_th_clay_button_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag();
      _jspx_th_clay_button_2.setPageContext(_jspx_page_context);
      _jspx_th_clay_button_2.setParent(null);
      _jspx_th_clay_button_2.setBorderless( true );
      _jspx_th_clay_button_2.setDynamicAttribute(null, "disabled",  true );
      _jspx_th_clay_button_2.setDisplayType("secondary");
      _jspx_th_clay_button_2.setIcon("thumbs-down");
      _jspx_th_clay_button_2.setSmall( true );
      int _jspx_eval_clay_button_2 = _jspx_th_clay_button_2.doStartTag();
      if (_jspx_eval_clay_button_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_clay_icon_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_button_2, _jspx_page_context))
          return;
        out.write("\n");
        out.write("\t\t\t\t");
      }
      if (_jspx_th_clay_button_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_2);
        _jspx_th_clay_button_2.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_2);
      _jspx_th_clay_button_2.release();
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t");
}
else if (
 type.equals(RatingsType.STARS.getValue()) ) {
      out.write("\n");
      out.write("\t\t\t");
      //  clay:content-row
      com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag _jspx_th_clay_content$1row_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag();
      _jspx_th_clay_content$1row_0.setPageContext(_jspx_page_context);
      _jspx_th_clay_content$1row_0.setParent(null);
      _jspx_th_clay_content$1row_0.setCssClass("ratings-stars");
      _jspx_th_clay_content$1row_0.setVerticalAlign("center");
      int _jspx_eval_clay_content$1row_0 = _jspx_th_clay_content$1row_0.doStartTag();
      if (_jspx_eval_clay_content$1row_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t");
        //  clay:content-col
        com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
        _jspx_th_clay_content$1col_0.setPageContext(_jspx_page_context);
        _jspx_th_clay_content$1col_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_0);
        int _jspx_eval_clay_content$1col_0 = _jspx_th_clay_content$1col_0.doStartTag();
        if (_jspx_eval_clay_content$1col_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t\t\t<div class=\"dropdown\">\n");
          out.write("\t\t\t\t\t\t");
          //  clay:button
          com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag _jspx_th_clay_button_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag();
          _jspx_th_clay_button_3.setPageContext(_jspx_page_context);
          _jspx_th_clay_button_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_0);
          _jspx_th_clay_button_3.setBorderless( true );
          _jspx_th_clay_button_3.setCssClass("dropdown-toggle");
          _jspx_th_clay_button_3.setDynamicAttribute(null, "disabled",  true );
          _jspx_th_clay_button_3.setDisplayType("secondary");
          _jspx_th_clay_button_3.setSmall( true );
          int _jspx_eval_clay_button_3 = _jspx_th_clay_button_3.doStartTag();
          if (_jspx_eval_clay_button_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t<span class=\"inline-item inline-item-before\">\n");
            out.write("\t\t\t\t\t\t\t\t");
            if (_jspx_meth_clay_icon_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_button_3, _jspx_page_context))
              return;
            out.write("\n");
            out.write("\t\t\t\t\t\t\t</span>\n");
            out.write("\t\t\t\t\t\t\t<span class=\"inline-item ratings-stars-button-text\">-</span>\n");
            out.write("\t\t\t\t\t\t");
          }
          if (_jspx_th_clay_button_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_3);
            _jspx_th_clay_button_3.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_3);
          _jspx_th_clay_button_3.release();
          out.write("\n");
          out.write("\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t");
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
        out.write("\t\t\t\t");
        if (_jspx_meth_clay_content$1col_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_content$1row_0, _jspx_page_context))
          return;
        out.write("\n");
        out.write("\t\t\t");
      }
      if (_jspx_th_clay_content$1row_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_0);
        _jspx_th_clay_content$1row_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_0);
      _jspx_th_clay_content$1row_0.release();
      out.write("\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t");
}
else if (
 type.equals(RatingsType.STACKED_STARS.getValue()) ) {
      out.write("\n");
      out.write("\t\t\t<div class=\"ratings-stacked-stars ratings-stars\">\n");
      out.write("\t\t\t\t<div class=\"disabled ratings-stars-average\">\n");
      out.write("\t\t\t\t\t<span class=\"inline-item inline-item-before\">\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_clay_icon_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_clay_icon_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_clay_icon_7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_clay_icon_8(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_clay_icon_9(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"disabled ratings-stars-average\">\n");
      out.write("\t\t\t\t\t<span class=\"inline-item inline-item-before\">\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_clay_icon_10(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_clay_icon_11(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_clay_icon_12(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_clay_icon_13(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_clay_icon_14(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t");
      out.write('\n');
      out.write('	');
}
      out.write("\n");
      out.write("\n");
      out.write("\t");
      //  react:component
      com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag _jspx_th_react_component_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag.class) : new com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag();
      _jspx_th_react_component_0.setPageContext(_jspx_page_context);
      _jspx_th_react_component_0.setParent(null);
      _jspx_th_react_component_0.setModule("js/Ratings");
      _jspx_th_react_component_0.setProps( (Map<String, Object>)request.getAttribute("liferay-ratings:ratings:data") );
      int _jspx_eval_react_component_0 = _jspx_th_react_component_0.doStartTag();
      if (_jspx_th_react_component_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_react_component_0);
        _jspx_th_react_component_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_react_component_0);
      _jspx_th_react_component_0.release();
      out.write("\n");
      out.write("</div>");
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

  private boolean _jspx_meth_clay_icon_0(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_button_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:icon
    com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
    _jspx_th_clay_icon_0.setPageContext(_jspx_page_context);
    _jspx_th_clay_icon_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_button_0);
    _jspx_th_clay_icon_0.setSymbol("heart");
    int _jspx_eval_clay_icon_0 = _jspx_th_clay_icon_0.doStartTag();
    if (_jspx_th_clay_icon_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_0);
      _jspx_th_clay_icon_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_0);
    _jspx_th_clay_icon_0.release();
    return false;
  }

  private boolean _jspx_meth_clay_icon_1(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_button_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:icon
    com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
    _jspx_th_clay_icon_1.setPageContext(_jspx_page_context);
    _jspx_th_clay_icon_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_button_1);
    _jspx_th_clay_icon_1.setSymbol("thumbs-up");
    int _jspx_eval_clay_icon_1 = _jspx_th_clay_icon_1.doStartTag();
    if (_jspx_th_clay_icon_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_1);
      _jspx_th_clay_icon_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_1);
    _jspx_th_clay_icon_1.release();
    return false;
  }

  private boolean _jspx_meth_clay_icon_2(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_button_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:icon
    com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
    _jspx_th_clay_icon_2.setPageContext(_jspx_page_context);
    _jspx_th_clay_icon_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_button_2);
    _jspx_th_clay_icon_2.setSymbol("thumbs-down");
    int _jspx_eval_clay_icon_2 = _jspx_th_clay_icon_2.doStartTag();
    if (_jspx_th_clay_icon_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_2);
      _jspx_th_clay_icon_2.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_2);
    _jspx_th_clay_icon_2.release();
    return false;
  }

  private boolean _jspx_meth_clay_icon_3(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_button_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:icon
    com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
    _jspx_th_clay_icon_3.setPageContext(_jspx_page_context);
    _jspx_th_clay_icon_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_button_3);
    _jspx_th_clay_icon_3.setSymbol("star-o");
    int _jspx_eval_clay_icon_3 = _jspx_th_clay_icon_3.doStartTag();
    if (_jspx_th_clay_icon_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_3);
      _jspx_th_clay_icon_3.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_3);
    _jspx_th_clay_icon_3.release();
    return false;
  }

  private boolean _jspx_meth_clay_content$1col_1(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_content$1row_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:content-col
    com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
    _jspx_th_clay_content$1col_1.setPageContext(_jspx_page_context);
    _jspx_th_clay_content$1col_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_0);
    int _jspx_eval_clay_content$1col_1 = _jspx_th_clay_content$1col_1.doStartTag();
    if (_jspx_eval_clay_content$1col_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_clay_icon_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_content$1col_1, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("\t\t\t\t");
    }
    if (_jspx_th_clay_content$1col_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_1);
      _jspx_th_clay_content$1col_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_1);
    _jspx_th_clay_content$1col_1.release();
    return false;
  }

  private boolean _jspx_meth_clay_icon_4(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_content$1col_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:icon
    com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
    _jspx_th_clay_icon_4.setPageContext(_jspx_page_context);
    _jspx_th_clay_icon_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_1);
    _jspx_th_clay_icon_4.setCssClass("ratings-stars-average-icon");
    _jspx_th_clay_icon_4.setSymbol("star");
    int _jspx_eval_clay_icon_4 = _jspx_th_clay_icon_4.doStartTag();
    if (_jspx_th_clay_icon_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_4);
      _jspx_th_clay_icon_4.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_4);
    _jspx_th_clay_icon_4.release();
    return false;
  }

  private boolean _jspx_meth_clay_icon_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:icon
    com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
    _jspx_th_clay_icon_5.setPageContext(_jspx_page_context);
    _jspx_th_clay_icon_5.setParent(null);
    _jspx_th_clay_icon_5.setCssClass("ratings-stars-average-icon");
    _jspx_th_clay_icon_5.setSymbol("star");
    int _jspx_eval_clay_icon_5 = _jspx_th_clay_icon_5.doStartTag();
    if (_jspx_th_clay_icon_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_5);
      _jspx_th_clay_icon_5.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_5);
    _jspx_th_clay_icon_5.release();
    return false;
  }

  private boolean _jspx_meth_clay_icon_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:icon
    com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
    _jspx_th_clay_icon_6.setPageContext(_jspx_page_context);
    _jspx_th_clay_icon_6.setParent(null);
    _jspx_th_clay_icon_6.setCssClass("ratings-stars-average-icon");
    _jspx_th_clay_icon_6.setSymbol("star");
    int _jspx_eval_clay_icon_6 = _jspx_th_clay_icon_6.doStartTag();
    if (_jspx_th_clay_icon_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_6);
      _jspx_th_clay_icon_6.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_6);
    _jspx_th_clay_icon_6.release();
    return false;
  }

  private boolean _jspx_meth_clay_icon_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:icon
    com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
    _jspx_th_clay_icon_7.setPageContext(_jspx_page_context);
    _jspx_th_clay_icon_7.setParent(null);
    _jspx_th_clay_icon_7.setCssClass("ratings-stars-average-icon");
    _jspx_th_clay_icon_7.setSymbol("star");
    int _jspx_eval_clay_icon_7 = _jspx_th_clay_icon_7.doStartTag();
    if (_jspx_th_clay_icon_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_7);
      _jspx_th_clay_icon_7.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_7);
    _jspx_th_clay_icon_7.release();
    return false;
  }

  private boolean _jspx_meth_clay_icon_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:icon
    com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
    _jspx_th_clay_icon_8.setPageContext(_jspx_page_context);
    _jspx_th_clay_icon_8.setParent(null);
    _jspx_th_clay_icon_8.setCssClass("ratings-stars-average-icon");
    _jspx_th_clay_icon_8.setSymbol("star");
    int _jspx_eval_clay_icon_8 = _jspx_th_clay_icon_8.doStartTag();
    if (_jspx_th_clay_icon_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_8);
      _jspx_th_clay_icon_8.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_8);
    _jspx_th_clay_icon_8.release();
    return false;
  }

  private boolean _jspx_meth_clay_icon_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:icon
    com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
    _jspx_th_clay_icon_9.setPageContext(_jspx_page_context);
    _jspx_th_clay_icon_9.setParent(null);
    _jspx_th_clay_icon_9.setCssClass("ratings-stars-average-icon");
    _jspx_th_clay_icon_9.setSymbol("star");
    int _jspx_eval_clay_icon_9 = _jspx_th_clay_icon_9.doStartTag();
    if (_jspx_th_clay_icon_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_9);
      _jspx_th_clay_icon_9.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_9);
    _jspx_th_clay_icon_9.release();
    return false;
  }

  private boolean _jspx_meth_clay_icon_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:icon
    com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
    _jspx_th_clay_icon_10.setPageContext(_jspx_page_context);
    _jspx_th_clay_icon_10.setParent(null);
    _jspx_th_clay_icon_10.setCssClass("ratings-stars-average-icon");
    _jspx_th_clay_icon_10.setSymbol("star");
    int _jspx_eval_clay_icon_10 = _jspx_th_clay_icon_10.doStartTag();
    if (_jspx_th_clay_icon_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_10);
      _jspx_th_clay_icon_10.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_10);
    _jspx_th_clay_icon_10.release();
    return false;
  }

  private boolean _jspx_meth_clay_icon_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:icon
    com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
    _jspx_th_clay_icon_11.setPageContext(_jspx_page_context);
    _jspx_th_clay_icon_11.setParent(null);
    _jspx_th_clay_icon_11.setCssClass("ratings-stars-average-icon");
    _jspx_th_clay_icon_11.setSymbol("star");
    int _jspx_eval_clay_icon_11 = _jspx_th_clay_icon_11.doStartTag();
    if (_jspx_th_clay_icon_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_11);
      _jspx_th_clay_icon_11.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_11);
    _jspx_th_clay_icon_11.release();
    return false;
  }

  private boolean _jspx_meth_clay_icon_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:icon
    com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_12 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
    _jspx_th_clay_icon_12.setPageContext(_jspx_page_context);
    _jspx_th_clay_icon_12.setParent(null);
    _jspx_th_clay_icon_12.setCssClass("ratings-stars-average-icon");
    _jspx_th_clay_icon_12.setSymbol("star");
    int _jspx_eval_clay_icon_12 = _jspx_th_clay_icon_12.doStartTag();
    if (_jspx_th_clay_icon_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_12);
      _jspx_th_clay_icon_12.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_12);
    _jspx_th_clay_icon_12.release();
    return false;
  }

  private boolean _jspx_meth_clay_icon_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:icon
    com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_13 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
    _jspx_th_clay_icon_13.setPageContext(_jspx_page_context);
    _jspx_th_clay_icon_13.setParent(null);
    _jspx_th_clay_icon_13.setCssClass("ratings-stars-average-icon");
    _jspx_th_clay_icon_13.setSymbol("star");
    int _jspx_eval_clay_icon_13 = _jspx_th_clay_icon_13.doStartTag();
    if (_jspx_th_clay_icon_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_13);
      _jspx_th_clay_icon_13.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_13);
    _jspx_th_clay_icon_13.release();
    return false;
  }

  private boolean _jspx_meth_clay_icon_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:icon
    com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_14 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
    _jspx_th_clay_icon_14.setPageContext(_jspx_page_context);
    _jspx_th_clay_icon_14.setParent(null);
    _jspx_th_clay_icon_14.setCssClass("ratings-stars-average-icon");
    _jspx_th_clay_icon_14.setSymbol("star");
    int _jspx_eval_clay_icon_14 = _jspx_th_clay_icon_14.doStartTag();
    if (_jspx_th_clay_icon_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_14);
      _jspx_th_clay_icon_14.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_14);
    _jspx_th_clay_icon_14.release();
    return false;
  }
}
