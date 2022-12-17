package org.apache.jsp.data_005flayout_005frenderer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.portal.json.JSONFactoryImpl;
import com.liferay.portal.kernel.servlet.taglib.aui.ScriptData;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.frontend.icons.FrontendIconsUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class page_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/data_layout_renderer/init.jsp");
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-clay.tld");
    _jspx_dependants.add("/META-INF/c.tld");
    _jspx_dependants.add("/data_layout_renderer/init-ext.jspf");
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
      out.write('\n');
      out.write('\n');

java.lang.String containerId = GetterUtil.getString((java.lang.String)request.getAttribute("liferay-data-engine:data-layout-renderer:containerId"));
java.lang.Long dataDefinitionId = GetterUtil.getLong(String.valueOf(request.getAttribute("liferay-data-engine:data-layout-renderer:dataDefinitionId")));
java.lang.Long dataLayoutId = GetterUtil.getLong(String.valueOf(request.getAttribute("liferay-data-engine:data-layout-renderer:dataLayoutId")));
java.lang.Long dataRecordId = GetterUtil.getLong(String.valueOf(request.getAttribute("liferay-data-engine:data-layout-renderer:dataRecordId")));
java.util.Map<java.lang.String, java.lang.Object> dataRecordValues = (java.util.Map<java.lang.String, java.lang.Object>)request.getAttribute("liferay-data-engine:data-layout-renderer:dataRecordValues");
java.lang.String defaultLanguageId = GetterUtil.getString((java.lang.String)request.getAttribute("liferay-data-engine:data-layout-renderer:defaultLanguageId"));
java.lang.String languageId = GetterUtil.getString((java.lang.String)request.getAttribute("liferay-data-engine:data-layout-renderer:languageId"));
java.lang.String namespace = GetterUtil.getString((java.lang.String)request.getAttribute("liferay-data-engine:data-layout-renderer:namespace"));
boolean persistDefaultValues = GetterUtil.getBoolean(String.valueOf(request.getAttribute("liferay-data-engine:data-layout-renderer:persistDefaultValues")));
boolean persisted = GetterUtil.getBoolean(String.valueOf(request.getAttribute("liferay-data-engine:data-layout-renderer:persisted")));
boolean readOnly = GetterUtil.getBoolean(String.valueOf(request.getAttribute("liferay-data-engine:data-layout-renderer:readOnly")));
boolean submittable = GetterUtil.getBoolean(String.valueOf(request.getAttribute("liferay-data-engine:data-layout-renderer:submittable")), true);
Map<String, Object> dynamicAttributes = (Map<String, Object>)request.getAttribute("liferay-data-engine:data-layout-renderer:dynamicAttributes");

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');

String content = (String)request.getAttribute("liferay-data-engine:data-layout-renderer:content");

      out.write("\n");
      out.write("\n");
      out.write("<div class=\"sheet\">\n");
      out.write("\t");
      //  clay:container-fluid
      com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag _jspx_th_clay_container$1fluid_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag();
      _jspx_th_clay_container$1fluid_0.setPageContext(_jspx_page_context);
      _jspx_th_clay_container$1fluid_0.setParent(null);
      _jspx_th_clay_container$1fluid_0.setCssClass("ddm-form-builder-app");
      int _jspx_eval_clay_container$1fluid_0 = _jspx_th_clay_container$1fluid_0.doStartTag();
      if (_jspx_eval_clay_container$1fluid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t");
        out.print( content );
        out.write('\n');
        out.write('	');
      }
      if (_jspx_th_clay_container$1fluid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_0);
        _jspx_th_clay_container$1fluid_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_0);
      _jspx_th_clay_container$1fluid_0.release();
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
}
