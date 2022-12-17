package org.apache.jsp.dynamic_005finclude;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.portal.kernel.model.LayoutSet;
import com.liferay.portal.kernel.servlet.HttpHeaders;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.WebKeys;

public final class text_005fhtml_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/dynamic_include/init.jsp");
    _jspx_dependants.add("/META-INF/c.tld");
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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');


// According to http://www.webmasterworld.com/forum91/3087.htm a semicolon in
// the URL for a meta-refresh tag does not work in IE 6.

// To work around this issue, we use a URL without a session id for meta-refresh
// and rely on the load event on the body element to properly rewrite the URL.

// However, if the original request was an AJAX request, sending a redirect is
// less than ideal. In this case we will simply print the error message.

ErrorData errorData = pageContext.getErrorData();

int code = errorData.getStatusCode();

String msg = String.valueOf(request.getAttribute(JavaConstants.JAVAX_SERVLET_ERROR_MESSAGE));
String uri = errorData.getRequestURI();

String xRequestWith = request.getHeader(HttpHeaders.X_REQUESTED_WITH);

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\t");
      out.write("\n");
      out.write("\t\t");
if (
 !StringUtil.equalsIgnoreCase(HttpHeaders.XML_HTTP_REQUEST, xRequestWith) ) {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");

			String redirect = null;

			LayoutSet layoutSet = (LayoutSet)request.getAttribute(WebKeys.VIRTUAL_HOST_LAYOUT_SET);

			if (layoutSet != null) {
				redirect = PortalUtil.getPathMain();
			}
			else {
				redirect = PortalUtil.getPortalURL(PortalUtil.getValidPortalDomain(PortalUtil.getDefaultCompanyId(), request.getServerName()), request.getServerPort(), request.isSecure()) + PortalUtil.getPathContext() + PortalUtil.getRelativeHomeURL(request);
			}

			if (!request.isRequestedSessionIdFromCookie()) {
				redirect = PortalUtil.getURLWithSessionId(redirect, session.getId());
			}
			
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<head>\n");
      out.write("\t\t\t\t<title></title>\n");
      out.write("\n");
      out.write("\t\t\t\t<meta content=\"1; url=");
      out.print( HtmlUtil.escapeAttribute(redirect) );
      out.write("\" http-equiv=\"refresh\" />\n");
      out.write("\t\t\t</head>\n");
      out.write("\n");
      out.write("\t\t\t<body onload=\"javascript:location.replace('");
      out.print( HtmlUtil.escapeJS(redirect) );
      out.write("')\">\n");
      out.write("\n");
      out.write("\t\t\t\t<!--\n");
      out.write("\t\t\t\tThe numbers below are used to fill up space so that this works properly in IE.\n");
      out.write("\t\t\t\tSee http://support.microsoft.com/default.aspx?scid=kb;en-us;Q294807 for more\n");
      out.write("\t\t\t\tinformation on why this is necessary.\n");
      out.write("\n");
      out.write("\t\t\t\t12345678901234567890123456789012345678901234567890123456789012345678901234567890\n");
      out.write("\t\t\t\t12345678901234567890123456789012345678901234567890123456789012345678901234567890\n");
      out.write("\t\t\t\t12345678901234567890123456789012345678901234567890123456789012345678901234567890\n");
      out.write("\t\t\t\t-->\n");
      out.write("\t\t\t</body>\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t");
}
else {
      out.write("\n");
      out.write("\t\t\t<head>\n");
      out.write("\t\t\t\t<title>Http Status ");
      out.print( code );
      out.write(" - ");
      //  liferay-ui:message
      com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
      _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_message_0.setParent(null);
      _jspx_th_liferay$1ui_message_0.setKey( "http-status-code[" + code + "]" );
      int _jspx_eval_liferay$1ui_message_0 = _jspx_th_liferay$1ui_message_0.doStartTag();
      if (_jspx_th_liferay$1ui_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
        _jspx_th_liferay$1ui_message_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
      _jspx_th_liferay$1ui_message_0.release();
      out.write("</title>\n");
      out.write("\t\t\t</head>\n");
      out.write("\n");
      out.write("\t\t\t<body>\n");
      out.write("\t\t\t\t<h1>Http Status ");
      out.print( code );
      out.write(" - ");
      //  liferay-ui:message
      com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
      _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_message_1.setParent(null);
      _jspx_th_liferay$1ui_message_1.setKey( "http-status-code[" + code + "]" );
      int _jspx_eval_liferay$1ui_message_1 = _jspx_th_liferay$1ui_message_1.doStartTag();
      if (_jspx_th_liferay$1ui_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_1);
        _jspx_th_liferay$1ui_message_1.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_1);
      _jspx_th_liferay$1ui_message_1.release();
      out.write("</h1>\n");
      out.write("\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_liferay$1ui_message_2(_jspx_page_context))
        return;
      out.write(':');
      out.write(' ');
      out.print( HtmlUtil.escape(msg) );
      out.write("\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_liferay$1ui_message_3(_jspx_page_context))
        return;
      out.write(':');
      out.write(' ');
      out.print( HtmlUtil.escape(uri) );
      out.write("\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</body>\n");
      out.write("\t\t");
      out.write('\n');
      out.write('	');
}
      out.write("\n");
      out.write("</html>");
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

  private boolean _jspx_meth_liferay$1ui_message_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_2.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_2.setParent(null);
    _jspx_th_liferay$1ui_message_2.setKey("message");
    int _jspx_eval_liferay$1ui_message_2 = _jspx_th_liferay$1ui_message_2.doStartTag();
    if (_jspx_th_liferay$1ui_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
      _jspx_th_liferay$1ui_message_2.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
    _jspx_th_liferay$1ui_message_2.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_3.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_3.setParent(null);
    _jspx_th_liferay$1ui_message_3.setKey("resource");
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
}
