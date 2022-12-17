package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.social.bookmarks.SocialBookmark;
import java.util.HashMap;

public final class page_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-clay.tld");
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

SocialBookmark socialBookmark = (SocialBookmark)request.getAttribute("liferay-social-bookmarks:bookmark:socialBookmark");
String title = GetterUtil.getString((String)request.getAttribute("liferay-social-bookmarks:bookmark:title"));
String url = GetterUtil.getString((String)request.getAttribute("liferay-social-bookmarks:bookmark:url"));

      out.write('\n');
      out.write('\n');
      //  clay:link
      com.liferay.frontend.taglib.clay.servlet.taglib.LinkTag _jspx_th_clay_link_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.LinkTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.LinkTag();
      _jspx_th_clay_link_0.setPageContext(_jspx_page_context);
      _jspx_th_clay_link_0.setParent(null);
      _jspx_th_clay_link_0.setAdditionalProps( (HashMap)request.getAttribute("liferay-social-bookmarks:bookmark:additionalProps") );
      _jspx_th_clay_link_0.setDynamicAttribute(null, "aria-label",  socialBookmark.getName(request.getLocale()) );
      _jspx_th_clay_link_0.setBorderless( true );
      _jspx_th_clay_link_0.setCssClass("lfr-portal-tooltip");
      _jspx_th_clay_link_0.setDisplayType("secondary");
      _jspx_th_clay_link_0.setHref( socialBookmark.getPostURL(title, url) );
      _jspx_th_clay_link_0.setIcon("social-facebook");
      _jspx_th_clay_link_0.setMonospaced( true );
      _jspx_th_clay_link_0.setOutline( true );
      _jspx_th_clay_link_0.setPropsTransformer("js/OpenSocialBookmarkPropsTransformer");
      _jspx_th_clay_link_0.setSmall( true );
      _jspx_th_clay_link_0.setDynamicAttribute(null, "title",  socialBookmark.getName(request.getLocale()) );
      _jspx_th_clay_link_0.setType("button");
      int _jspx_eval_clay_link_0 = _jspx_th_clay_link_0.doStartTag();
      if (_jspx_th_clay_link_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_link_0);
        _jspx_th_clay_link_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_link_0);
      _jspx_th_clay_link_0.release();
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
