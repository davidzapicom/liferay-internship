package org.apache.jsp.dynamic_005finclude;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.portlet.PortletProvider;
import com.liferay.portal.kernel.portlet.PortletProviderUtil;
import com.liferay.portal.kernel.portlet.url.builder.PortletURLBuilder;
import com.liferay.sharing.model.SharingEntry;
import javax.portlet.PortletURL;

public final class bottom_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/dynamic_include/init.jsp");
    _jspx_dependants.add("/META-INF/liferay-aui.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-frontend.tld");
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

PortletURL manageCollaboratorsURL = PortletURLBuilder.create(
	PortletProviderUtil.getPortletURL(request, SharingEntry.class.getName(), PortletProvider.Action.MANAGE)
).setWindowState(
	LiferayWindowState.POP_UP
).buildPortletURL();

PortletURL sharingURL = PortletURLBuilder.create(
	PortletProviderUtil.getPortletURL(request, SharingEntry.class.getName(), PortletProvider.Action.EDIT)
).setWindowState(
	LiferayWindowState.POP_UP
).buildPortletURL();

      out.write('\n');
      out.write('\n');
      //  aui:script
      com.liferay.taglib.aui.ScriptTag _jspx_th_aui_script_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ScriptTag.class) : new com.liferay.taglib.aui.ScriptTag();
      _jspx_th_aui_script_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_script_0.setParent(null);
      _jspx_th_aui_script_0.setSandbox( true );
      int _jspx_eval_aui_script_0 = _jspx_th_aui_script_0.doStartTag();
      if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_aui_script_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_aui_script_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\tfunction showDialog(uri, title) {\n");
          out.write("\t\tLiferay.Util.openModal({\n");
          out.write("\t\t\tid: 'sharingDialog',\n");
          out.write("\t\t\tiframeBodyCssClass: 'sharing-dialog',\n");
          out.write("\t\t\theight: '475px',\n");
          out.write("\t\t\tsize: 'md',\n");
          out.write("\t\t\ttitle: title,\n");
          out.write("\t\t\turl: uri,\n");
          out.write("\t\t});\n");
          out.write("\t}\n");
          out.write("\n");
          out.write("\tvar Sharing = {\n");
          out.write("\t\tmanageCollaborators: function (classNameId, classPK) {\n");
          out.write("\t\t\tvar manageCollaboratorsParameters = {\n");
          out.write("\t\t\t\tclassNameId: classNameId,\n");
          out.write("\t\t\t\tclassPK: classPK,\n");
          out.write("\t\t\t};\n");
          out.write("\n");
          out.write("\t\t\tvar manageCollaboratorsURL = Liferay.Util.PortletURL.createPortletURL(\n");
          out.write("\t\t\t\t'");
          out.print( manageCollaboratorsURL.toString() );
          out.write("',\n");
          out.write("\t\t\t\tmanageCollaboratorsParameters\n");
          out.write("\t\t\t);\n");
          out.write("\n");
          out.write("\t\t\tshowDialog(\n");
          out.write("\t\t\t\tmanageCollaboratorsURL.toString(),\n");
          out.write("\t\t\t\t'");
          out.print( LanguageUtil.get(resourceBundle, "manage-collaborators") );
          out.write("'\n");
          out.write("\t\t\t);\n");
          out.write("\t\t},\n");
          out.write("\n");
          out.write("\t\tshare: function (classNameId, classPK, title) {\n");
          out.write("\t\t\tvar sharingParameters = {\n");
          out.write("\t\t\t\tclassNameId: classNameId,\n");
          out.write("\t\t\t\tclassPK: classPK,\n");
          out.write("\t\t\t};\n");
          out.write("\n");
          out.write("\t\t\tvar sharingURL = Liferay.Util.PortletURL.createPortletURL(\n");
          out.write("\t\t\t\t'");
          out.print( sharingURL.toString() );
          out.write("',\n");
          out.write("\t\t\t\tsharingParameters\n");
          out.write("\t\t\t);\n");
          out.write("\n");
          out.write("\t\t\tshowDialog(sharingURL.toString(), title);\n");
          out.write("\t\t},\n");
          out.write("\t};\n");
          out.write("\n");
          out.write("\tLiferay.Sharing = Sharing;\n");
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
}
