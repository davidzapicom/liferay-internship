package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(7);
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/META-INF/c.tld");
    _jspx_dependants.add("/META-INF/liferay-portlet_2_0.tld");
    _jspx_dependants.add("/META-INF/liferay-aui.tld");
    _jspx_dependants.add("/META-INF/liferay-portlet-ext.tld");
    _jspx_dependants.add("/META-INF/liferay-theme.tld");
    _jspx_dependants.add("/META-INF/liferay-ui.tld");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<p>\r\n");
      out.write("\t<b>");
      if (_jspx_meth_liferay$1ui_message_0(_jspx_page_context))
        return;
      out.write("</b>\r\n");
      out.write("</p>\r\n");
      out.write("\r\n");
      //  portlet:resourceURL
      com.liferay.taglib.portlet.ResourceURLTag _jspx_th_portlet_resourceURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ResourceURLTag.class) : new com.liferay.taglib.portlet.ResourceURLTag();
      _jspx_th_portlet_resourceURL_0.setPageContext(_jspx_page_context);
      _jspx_th_portlet_resourceURL_0.setParent(null);
      _jspx_th_portlet_resourceURL_0.setId("/select/pais");
      _jspx_th_portlet_resourceURL_0.setVar("mvcselectResourceCommandUrl");
      int _jspx_eval_portlet_resourceURL_0 = _jspx_th_portlet_resourceURL_0.doStartTag();
      if (_jspx_th_portlet_resourceURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_resourceURL_0);
        _jspx_th_portlet_resourceURL_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_resourceURL_0);
      _jspx_th_portlet_resourceURL_0.release();
      out.write('\r');
      out.write('\n');
      //  portlet:resourceURL
      com.liferay.taglib.portlet.ResourceURLTag _jspx_th_portlet_resourceURL_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ResourceURLTag.class) : new com.liferay.taglib.portlet.ResourceURLTag();
      _jspx_th_portlet_resourceURL_1.setPageContext(_jspx_page_context);
      _jspx_th_portlet_resourceURL_1.setParent(null);
      _jspx_th_portlet_resourceURL_1.setId("/select/provincia");
      _jspx_th_portlet_resourceURL_1.setVar("mvcselectProvinciaCommandUrl");
      int _jspx_eval_portlet_resourceURL_1 = _jspx_th_portlet_resourceURL_1.doStartTag();
      if (_jspx_th_portlet_resourceURL_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_resourceURL_1);
        _jspx_th_portlet_resourceURL_1.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_resourceURL_1);
      _jspx_th_portlet_resourceURL_1.release();
      out.write('\r');
      out.write('\n');
      //  portlet:resourceURL
      com.liferay.taglib.portlet.ResourceURLTag _jspx_th_portlet_resourceURL_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ResourceURLTag.class) : new com.liferay.taglib.portlet.ResourceURLTag();
      _jspx_th_portlet_resourceURL_2.setPageContext(_jspx_page_context);
      _jspx_th_portlet_resourceURL_2.setParent(null);
      _jspx_th_portlet_resourceURL_2.setId("/select/ciudad");
      _jspx_th_portlet_resourceURL_2.setVar("mvcselectCiudadCommandUrl");
      int _jspx_eval_portlet_resourceURL_2 = _jspx_th_portlet_resourceURL_2.doStartTag();
      if (_jspx_th_portlet_resourceURL_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_resourceURL_2);
        _jspx_th_portlet_resourceURL_2.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_resourceURL_2);
      _jspx_th_portlet_resourceURL_2.release();
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_aui_form_0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_aui_button_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("    cargarPais();\r\n");
      out.write("    \r\n");
      out.write("    $('#");
      if (_jspx_meth_portlet_namespace_0(_jspx_page_context))
        return;
      out.write("selectPaises').on('change', function() {\r\n");
      out.write("    \tcargarProvincia(this.value);\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    $('#");
      if (_jspx_meth_portlet_namespace_1(_jspx_page_context))
        return;
      out.write("selectProvincias').on('change', function() {\r\n");
      out.write("    \tcargarCiudad(this.value);\r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function cargarPais(){\r\n");
      out.write("    $.ajax({\r\n");
      out.write("        // la URL para la peticiÃ³n\r\n");
      out.write("        url : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mvcselectResourceCommandUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("',\r\n");
      out.write("    \r\n");
      out.write("        // la informaciÃ³n a enviar\r\n");
      out.write("        // (tambiÃ©n es posible utilizar una cadena de datos)\r\n");
      out.write("        //  data : { pais : 123 },\r\n");
      out.write("    \r\n");
      out.write("        // especifica si serÃ¡ una peticiÃ³n POST o GET\r\n");
      out.write("        type : 'GET',\r\n");
      out.write("    \r\n");
      out.write("        // el tipo de informaciÃ³n que se espera de respuesta\r\n");
      out.write("        dataType : 'json',\r\n");
      out.write("    \r\n");
      out.write("        // cÃ³digo a ejecutar si la peticiÃ³n es satisfactoria;\r\n");
      out.write("        // la respuesta es pasada como argumento a la funciÃ³n\r\n");
      out.write("        success : function(jsonPaises) {\r\n");
      out.write("        \tvar select = $(\"#");
      if (_jspx_meth_portlet_namespace_2(_jspx_page_context))
        return;
      out.write("selectPaises\");\r\n");
      out.write("        \tfor(var i in jsonPaises){\r\n");
      out.write("         \t\tvar opcion = document.createElement('option');\r\n");
      out.write("\t          \tvar opcionValue = jsonPaises[i].value;\r\n");
      out.write("\t          \tvar opcionText = jsonPaises[i].option;\r\n");
      out.write("\t          \topcion.setAttribute(\"value\", opcionValue);\r\n");
      out.write("\t          \topcion.append(opcionText);\r\n");
      out.write("\t          \tselect.append(opcion);\r\n");
      out.write("        \t} \r\n");
      out.write("        \t\r\n");
      out.write("            console.log(\"SUCCESS PAIS\");  \r\n");
      out.write("         // hacer for del jsonPises     \r\n");
      out.write("         // acceder a un pais:   jsonPaises[i]\r\n");
      out.write("         // acceder a un campo de pais:   jsonPaises[i].option\r\n");
      out.write("         // crear dinamicamente elemento <option>\r\n");
      out.write("         // aÃ±adir option al select   $(\"#");
      if (_jspx_meth_portlet_namespace_3(_jspx_page_context))
        return;
      out.write("selectPaises\")\r\n");
      out.write("        },\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        // cÃ³digo a ejecutar si la peticiÃ³n falla;\r\n");
      out.write("        // son pasados como argumentos a la funciÃ³n\r\n");
      out.write("        // el objeto de la peticiÃ³n en crudo y cÃ³digo de estatus de la peticiÃ³n\r\n");
      out.write("        error : function(xhr, status) {\r\n");
      out.write("            alert('Disculpe, existio un problema');\r\n");
      out.write("        }     \r\n");
      out.write("    });\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function cargarProvincia(idPais){\r\n");
      out.write("    console.log(\"Provincias de: \" +idPais);\r\n");
      out.write("    $.ajax({\r\n");
      out.write("        url : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mvcselectProvinciaCommandUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("',\r\n");
      out.write("        type : 'GET',\r\n");
      out.write("        data : { ");
      if (_jspx_meth_portlet_namespace_4(_jspx_page_context))
        return;
      out.write("pais : idPais },\r\n");
      out.write("        dataType : 'json',\r\n");
      out.write("        success : function(jsonProvincias) {\r\n");
      out.write("            var select = $(\"#");
      if (_jspx_meth_portlet_namespace_5(_jspx_page_context))
        return;
      out.write("selectProvincias\");\r\n");
      out.write("            select.empty();\r\n");
      out.write("            for(var i in jsonProvincias){\r\n");
      out.write("                var opcion = document.createElement('option');\r\n");
      out.write("                var opcionValue = jsonProvincias[i].value;\r\n");
      out.write("                var opcionText = jsonProvincias[i].option;\r\n");
      out.write("                opcion.append(opcionText);\r\n");
      out.write("                select.append(opcion);\r\n");
      out.write("            }\r\n");
      out.write("        },\r\n");
      out.write("        \r\n");
      out.write("    });\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function cargarCiudad(idProvincia){\r\n");
      out.write("    console.log(\"Ciudades de: \" +idProvincia);\r\n");
      out.write("    $.ajax({\r\n");
      out.write("        url : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mvcselectCiudadCommandUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("',\r\n");
      out.write("        type : 'GET',\r\n");
      out.write("        data : { ");
      if (_jspx_meth_portlet_namespace_6(_jspx_page_context))
        return;
      out.write("provincia : idProvincia },\r\n");
      out.write("        dataType : 'json',\r\n");
      out.write("        success : function(jsonCiudades) {\r\n");
      out.write("            var select = $(\"#");
      if (_jspx_meth_portlet_namespace_7(_jspx_page_context))
        return;
      out.write("selectCiudades\");\r\n");
      out.write("            select.empty();\r\n");
      out.write("            for(var i in jsonCiudades){\r\n");
      out.write("                var opcion = document.createElement('option');\r\n");
      out.write("                var opcionValue = jsonCiudades[i].value;\r\n");
      out.write("                var opcionText = jsonCiudades[i].option;\r\n");
      out.write("                opcion.append(opcionText);\r\n");
      out.write("                select.append(opcion);\r\n");
      out.write("            }\r\n");
      out.write("        },\r\n");
      out.write("        \r\n");
      out.write("    });\r\n");
      out.write("}\r\n");
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

  private boolean _jspx_meth_liferay$1ui_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent(null);
    _jspx_th_liferay$1ui_message_0.setKey("selec.caption");
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

  private boolean _jspx_meth_aui_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:form
    com.liferay.taglib.aui.FormTag _jspx_th_aui_form_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FormTag.class) : new com.liferay.taglib.aui.FormTag();
    _jspx_th_aui_form_0.setPageContext(_jspx_page_context);
    _jspx_th_aui_form_0.setParent(null);
    int _jspx_eval_aui_form_0 = _jspx_th_aui_form_0.doStartTag();
    if (_jspx_eval_aui_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_aui_fieldset_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_form_0, _jspx_page_context))
        return true;
      out.write('\r');
      out.write('\n');
    }
    if (_jspx_th_aui_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_form_0);
      _jspx_th_aui_form_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_form_0);
    _jspx_th_aui_form_0.release();
    return false;
  }

  private boolean _jspx_meth_aui_fieldset_0(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:fieldset
    com.liferay.taglib.aui.FieldsetTag _jspx_th_aui_fieldset_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FieldsetTag.class) : new com.liferay.taglib.aui.FieldsetTag();
    _jspx_th_aui_fieldset_0.setPageContext(_jspx_page_context);
    _jspx_th_aui_fieldset_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
    int _jspx_eval_aui_fieldset_0 = _jspx_th_aui_fieldset_0.doStartTag();
    if (_jspx_eval_aui_fieldset_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_aui_select_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_0, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("  \t");
      if (_jspx_meth_aui_select_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_0, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_aui_select_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_0, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("    ");
    }
    if (_jspx_th_aui_fieldset_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset_0);
      _jspx_th_aui_fieldset_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset_0);
    _jspx_th_aui_fieldset_0.release();
    return false;
  }

  private boolean _jspx_meth_aui_select_0(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:select
    com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.SelectTag.class) : new com.liferay.taglib.aui.SelectTag();
    _jspx_th_aui_select_0.setPageContext(_jspx_page_context);
    _jspx_th_aui_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
    _jspx_th_aui_select_0.setLabel("Selecciona el pais:");
    _jspx_th_aui_select_0.setName("selectPaises");
    _jspx_th_aui_select_0.setId("selectPaises");
    _jspx_th_aui_select_0.setRequired(true);
    _jspx_th_aui_select_0.setShowEmptyOption(true);
    int _jspx_eval_aui_select_0 = _jspx_th_aui_select_0.doStartTag();
    if (_jspx_eval_aui_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_aui_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_aui_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_aui_select_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("    ");
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
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_select_0);
    _jspx_th_aui_select_0.release();
    return false;
  }

  private boolean _jspx_meth_aui_select_1(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:select
    com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.SelectTag.class) : new com.liferay.taglib.aui.SelectTag();
    _jspx_th_aui_select_1.setPageContext(_jspx_page_context);
    _jspx_th_aui_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
    _jspx_th_aui_select_1.setLabel("Selecciona la provincia:");
    _jspx_th_aui_select_1.setName("selectProvincias");
    _jspx_th_aui_select_1.setId("selectProvincias");
    _jspx_th_aui_select_1.setRequired(true);
    _jspx_th_aui_select_1.setShowEmptyOption(true);
    int _jspx_eval_aui_select_1 = _jspx_th_aui_select_1.doStartTag();
    if (_jspx_eval_aui_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_aui_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_aui_select_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_aui_select_1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("    ");
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
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_select_1);
    _jspx_th_aui_select_1.release();
    return false;
  }

  private boolean _jspx_meth_aui_select_2(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:select
    com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.SelectTag.class) : new com.liferay.taglib.aui.SelectTag();
    _jspx_th_aui_select_2.setPageContext(_jspx_page_context);
    _jspx_th_aui_select_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
    _jspx_th_aui_select_2.setLabel("Selecciona la ciudad");
    _jspx_th_aui_select_2.setName("selectCiudades");
    _jspx_th_aui_select_2.setId("selectCiudades");
    _jspx_th_aui_select_2.setRequired(true);
    _jspx_th_aui_select_2.setShowEmptyOption(true);
    int _jspx_eval_aui_select_2 = _jspx_th_aui_select_2.doStartTag();
    if (_jspx_eval_aui_select_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_aui_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_aui_select_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_aui_select_2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("    ");
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
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_select_2);
    _jspx_th_aui_select_2.release();
    return false;
  }

  private boolean _jspx_meth_aui_button_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:button
    com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
    _jspx_th_aui_button_0.setPageContext(_jspx_page_context);
    _jspx_th_aui_button_0.setParent(null);
    _jspx_th_aui_button_0.setName("mvcselectResourceCommandButton");
    _jspx_th_aui_button_0.setType("submit");
    _jspx_th_aui_button_0.setValue("Seleccionar");
    _jspx_th_aui_button_0.setOnClick((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mvcselectResourceCommandUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
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

  private boolean _jspx_meth_portlet_namespace_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_0.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_0.setParent(null);
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

  private boolean _jspx_meth_portlet_namespace_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_1.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_1.setParent(null);
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

  private boolean _jspx_meth_portlet_namespace_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_2.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_2.setParent(null);
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

  private boolean _jspx_meth_portlet_namespace_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_3.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_3.setParent(null);
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

  private boolean _jspx_meth_portlet_namespace_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_4.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_4.setParent(null);
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

  private boolean _jspx_meth_portlet_namespace_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_5.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_5.setParent(null);
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

  private boolean _jspx_meth_portlet_namespace_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_7.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_7.setParent(null);
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
