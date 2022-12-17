package org.apache.jsp.price;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.commerce.frontend.model.PriceModel;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONSerializer;
import com.liferay.portal.kernel.util.Validator;

public final class page_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(6);
    _jspx_dependants.add("/price/init.jsp");
    _jspx_dependants.add("/META-INF/c.tld");
    _jspx_dependants.add("/META-INF/liferay-aui.tld");
    _jspx_dependants.add("/META-INF/liferay-theme.tld");
    _jspx_dependants.add("/META-INF/liferay-ui.tld");
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

boolean compact = (boolean)request.getAttribute("commerce-ui:price:compact");
boolean displayDiscountLevels = (boolean)request.getAttribute("commerce-ui:price:displayDiscountLevels");
String namespace = (String)request.getAttribute("commerce-ui:price:namespace");
boolean netPrice = (boolean)request.getAttribute("commerce-ui:price:netPrice");
PriceModel priceModel = (PriceModel)request.getAttribute("commerce-ui:price:priceModel");

JSONSerializer jsonSerializer = JSONFactoryUtil.createJSONSerializer();

      out.write("\n");
      out.write("\n");
      out.write("<span class=\"");
      out.print( Validator.isNotNull(namespace) ? namespace + "price price" : "price" );
      out.print( compact ? " compact" : StringPool.BLANK );
      out.write("\" id=\"");
      out.print( Validator.isNotNull(namespace) ? namespace + "price" : "" );
      out.write("\">\n");
      out.write("\t");
      //  liferay-util:include
      com.liferay.taglib.util.IncludeTag _jspx_th_liferay$1util_include_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.IncludeTag.class) : new com.liferay.taglib.util.IncludeTag();
      _jspx_th_liferay$1util_include_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1util_include_0.setParent(null);
      _jspx_th_liferay$1util_include_0.setPage("/price/default.jsp");
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
      out.write("\n");
      out.write("\t");
      out.write("\n");
      out.write("\t\t");
if (
 compact ) {
      out.write("\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
if (
 Validator.isNull(priceModel.getDiscount()) ) {
      out.write("\n");
      out.write("\t\t\t\t\t");
if (
 Validator.isNotNull(priceModel.getPromoPrice()) ) {
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      //  liferay-util:include
      com.liferay.taglib.util.IncludeTag _jspx_th_liferay$1util_include_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.IncludeTag.class) : new com.liferay.taglib.util.IncludeTag();
      _jspx_th_liferay$1util_include_1.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1util_include_1.setParent(null);
      _jspx_th_liferay$1util_include_1.setPage("/price/promo.jsp");
      _jspx_th_liferay$1util_include_1.setServletContext( application );
      int _jspx_eval_liferay$1util_include_1 = _jspx_th_liferay$1util_include_1.doStartTag();
      if (_jspx_th_liferay$1util_include_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_include_1);
        _jspx_th_liferay$1util_include_1.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_include_1);
      _jspx_th_liferay$1util_include_1.release();
      out.write("\n");
      out.write("\t\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
}
else {
      out.write("\n");
      out.write("\t\t\t\t\t");
if (
 Validator.isNotNull(priceModel.getFinalPrice()) ) {
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      //  liferay-util:include
      com.liferay.taglib.util.IncludeTag _jspx_th_liferay$1util_include_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.IncludeTag.class) : new com.liferay.taglib.util.IncludeTag();
      _jspx_th_liferay$1util_include_2.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1util_include_2.setParent(null);
      _jspx_th_liferay$1util_include_2.setPage("/price/discount.jsp");
      _jspx_th_liferay$1util_include_2.setServletContext( application );
      int _jspx_eval_liferay$1util_include_2 = _jspx_th_liferay$1util_include_2.doStartTag();
      if (_jspx_th_liferay$1util_include_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_include_2);
        _jspx_th_liferay$1util_include_2.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_include_2);
      _jspx_th_liferay$1util_include_2.release();
      out.write("\n");
      out.write("\t\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t");
}
else {
      out.write("\n");
      out.write("\t\t\t");
if (
 Validator.isNotNull(priceModel.getPromoPrice()) ) {
      out.write("\n");
      out.write("\t\t\t\t");
      //  liferay-util:include
      com.liferay.taglib.util.IncludeTag _jspx_th_liferay$1util_include_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.IncludeTag.class) : new com.liferay.taglib.util.IncludeTag();
      _jspx_th_liferay$1util_include_3.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1util_include_3.setParent(null);
      _jspx_th_liferay$1util_include_3.setPage("/price/promo.jsp");
      _jspx_th_liferay$1util_include_3.setServletContext( application );
      int _jspx_eval_liferay$1util_include_3 = _jspx_th_liferay$1util_include_3.doStartTag();
      if (_jspx_th_liferay$1util_include_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_include_3);
        _jspx_th_liferay$1util_include_3.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_include_3);
      _jspx_th_liferay$1util_include_3.release();
      out.write("\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
if (
 Validator.isNotNull(priceModel.getFinalPrice()) ) {
      out.write("\n");
      out.write("\t\t\t\t");
      //  liferay-util:include
      com.liferay.taglib.util.IncludeTag _jspx_th_liferay$1util_include_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.IncludeTag.class) : new com.liferay.taglib.util.IncludeTag();
      _jspx_th_liferay$1util_include_4.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1util_include_4.setParent(null);
      _jspx_th_liferay$1util_include_4.setPage("/price/discount.jsp");
      _jspx_th_liferay$1util_include_4.setServletContext( application );
      int _jspx_eval_liferay$1util_include_4 = _jspx_th_liferay$1util_include_4.doStartTag();
      if (_jspx_th_liferay$1util_include_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_include_4);
        _jspx_th_liferay$1util_include_4.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_include_4);
      _jspx_th_liferay$1util_include_4.release();
      out.write("\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\t\t");
      out.write('\n');
      out.write('	');
}
      out.write("\n");
      out.write("</span>\n");
      out.write("\n");
if (
 Validator.isNotNull(namespace) ) {
      out.write('\n');
      out.write('	');
      //  aui:script
      com.liferay.taglib.aui.ScriptTag _jspx_th_aui_script_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ScriptTag.class) : new com.liferay.taglib.aui.ScriptTag();
      _jspx_th_aui_script_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_script_0.setParent(null);
      _jspx_th_aui_script_0.setRequire("commerce-frontend-js/components/price/entry as Price");
      int _jspx_eval_aui_script_0 = _jspx_th_aui_script_0.doStartTag();
      if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_aui_script_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_aui_script_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\t\tconst componentId = '");
          out.print( namespace + "price" );
          out.write("';\n");
          out.write("\n");
          out.write("\t\tconst initialProps = {\n");
          out.write("\t\t\tdisplayDiscountLevels: ");
          out.print( displayDiscountLevels );
          out.write(",\n");
          out.write("\t\t\tnamespace: '");
          out.print( namespace );
          out.write("',\n");
          out.write("\t\t\tnetPrice: ");
          out.print( netPrice );
          out.write(",\n");
          out.write("\t\t\tprice: ");
          out.print( jsonSerializer.serializeDeep(priceModel) );
          out.write(",\n");
          out.write("\t\t\tstandalone: true,\n");
          out.write("\t\t};\n");
          out.write("\n");
          out.write("\t\tPrice.default(componentId, componentId, initialProps);\n");
          out.write("\t");
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
}
