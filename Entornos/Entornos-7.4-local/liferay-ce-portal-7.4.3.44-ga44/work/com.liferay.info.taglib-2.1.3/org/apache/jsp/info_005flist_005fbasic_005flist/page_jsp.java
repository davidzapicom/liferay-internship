package org.apache.jsp.info_005flist_005fbasic_005flist;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.info.item.renderer.InfoItemRenderer;
import com.liferay.info.item.renderer.InfoItemTemplatedRenderer;
import com.liferay.portal.kernel.util.GetterUtil;
import java.util.List;
import com.liferay.info.taglib.internal.list.renderer.BasicListInfoListStyle;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.taglib.servlet.PipingServletResponseFactory;
import java.util.Objects;

public final class page_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/info_list_basic_list/init.jsp");
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/META-INF/c.tld");
    _jspx_dependants.add("/META-INF/liferay-theme.tld");
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

InfoItemRenderer<Object> infoItemRenderer = (InfoItemRenderer<Object>)request.getAttribute("liferay-info:info-list-grid:infoItemRenderer");
List<Object> infoListObjects = (List<Object>)request.getAttribute("liferay-info:info-list-grid:infoListObjects");
String templateKey = GetterUtil.getString(request.getAttribute("liferay-info:info-list-grid:templateKey"));

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

String infoListStyleKey = GetterUtil.getString(request.getAttribute("liferay-info:info-list-grid:listStyleKey"));

String listCssClass = "";
String listItemCssClass = "";

if (Objects.equals(infoListStyleKey, BasicListInfoListStyle.BORDERED.getKey())) {
	listCssClass = "list-group";
	listItemCssClass = "list-group-item";
}
else if (Objects.equals(infoListStyleKey, BasicListInfoListStyle.INLINE.getKey())) {
	listCssClass = "d-flex list-inline";
	listItemCssClass = "flex-grow-1";
}
else if (Objects.equals(infoListStyleKey, BasicListInfoListStyle.UNSTYLED.getKey())) {
	listCssClass = "list-unstyled";
}

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('	');
if (
 Objects.equals(infoListStyleKey, BasicListInfoListStyle.NUMBERED.getKey()) ) {
      out.write("\n");
      out.write("\t\t<ol>\n");
      out.write("\n");
      out.write("\t\t\t");

			for (Object infoListObject : infoListObjects) {
			
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
if (
 (infoItemRenderer instanceof InfoItemTemplatedRenderer) && Validator.isNotNull(templateKey) ) {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");

							InfoItemTemplatedRenderer<Object> infoItemTemplatedRenderer = (InfoItemTemplatedRenderer)infoItemRenderer;

							infoItemTemplatedRenderer.render(infoListObject, templateKey, request, PipingServletResponseFactory.createPipingServletResponse(pageContext));
							
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
}
else {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");

							infoItemRenderer.render(infoListObject, request, PipingServletResponseFactory.createPipingServletResponse(pageContext));
							
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t");

			}
			
      out.write("\n");
      out.write("\n");
      out.write("\t\t</ol>\n");
      out.write("\t");
      out.write('\n');
      out.write('	');
}
else {
      out.write("\n");
      out.write("\t\t<ul class=\"");
      out.print( listCssClass );
      out.write("\">\n");
      out.write("\n");
      out.write("\t\t\t");

			for (Object infoListObject : infoListObjects) {
			
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<li class=\"");
      out.print( listItemCssClass );
      out.write("\">\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
if (
 (infoItemRenderer instanceof InfoItemTemplatedRenderer) && Validator.isNotNull(templateKey) ) {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");

							InfoItemTemplatedRenderer<Object> infoItemTemplatedRenderer = (InfoItemTemplatedRenderer)infoItemRenderer;

							infoItemTemplatedRenderer.render(infoListObject, templateKey, request, PipingServletResponseFactory.createPipingServletResponse(pageContext));
							
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
}
else {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");

							infoItemRenderer.render(infoListObject, request, PipingServletResponseFactory.createPipingServletResponse(pageContext));
							
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t");

			}
			
      out.write("\n");
      out.write("\n");
      out.write("\t\t</ul>\n");
      out.write("\t");
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
