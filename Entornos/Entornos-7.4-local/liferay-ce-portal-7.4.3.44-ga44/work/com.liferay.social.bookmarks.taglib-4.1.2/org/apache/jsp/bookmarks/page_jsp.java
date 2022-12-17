package org.apache.jsp.bookmarks;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.configuration.Filter;
import com.liferay.portal.kernel.servlet.BrowserSnifferUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.KeyValuePair;
import com.liferay.portal.kernel.util.KeyValuePairComparator;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.social.bookmarks.SocialBookmark;
import com.liferay.social.bookmarks.taglib.internal.util.SocialBookmarksRegistryUtil;
import com.liferay.social.bookmarks.taglib.internal.util.SocialBookmarksTagUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class page_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(10);
    _jspx_dependants.add("/bookmarks/init.jsp");
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/META-INF/c.tld");
    _jspx_dependants.add("/META-INF/liferay-portlet_2_0.tld");
    _jspx_dependants.add("/META-INF/liferay-aui.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-clay.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-social-bookmarks.tld");
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
      javax.portlet.ActionRequest actionRequest = null;
      javax.portlet.ActionResponse actionResponse = null;
      javax.portlet.EventRequest eventRequest = null;
      javax.portlet.EventResponse eventResponse = null;
      com.liferay.portal.kernel.portlet.LiferayPortletRequest liferayPortletRequest = null;
      com.liferay.portal.kernel.portlet.LiferayPortletResponse liferayPortletResponse = null;
      javax.portlet.PortletConfig portletConfig = null;
      java.lang.String portletName = null;
      javax.portlet.PortletPreferences portletPreferences = null;
      java.util.Map portletPreferencesValues = null;
      javax.portlet.PortletSession portletSession = null;
      java.util.Map portletSessionScope = null;
      javax.portlet.RenderRequest renderRequest = null;
      javax.portlet.RenderResponse renderResponse = null;
      javax.portlet.ResourceRequest resourceRequest = null;
      javax.portlet.ResourceResponse resourceResponse = null;
      actionRequest = (javax.portlet.ActionRequest) _jspx_page_context.findAttribute("actionRequest");
      actionResponse = (javax.portlet.ActionResponse) _jspx_page_context.findAttribute("actionResponse");
      eventRequest = (javax.portlet.EventRequest) _jspx_page_context.findAttribute("eventRequest");
      eventResponse = (javax.portlet.EventResponse) _jspx_page_context.findAttribute("eventResponse");
      liferayPortletRequest = (com.liferay.portal.kernel.portlet.LiferayPortletRequest) _jspx_page_context.findAttribute("liferayPortletRequest");
      liferayPortletResponse = (com.liferay.portal.kernel.portlet.LiferayPortletResponse) _jspx_page_context.findAttribute("liferayPortletResponse");
      portletConfig = (javax.portlet.PortletConfig) _jspx_page_context.findAttribute("portletConfig");
      portletName = (java.lang.String) _jspx_page_context.findAttribute("portletName");
      portletPreferences = (javax.portlet.PortletPreferences) _jspx_page_context.findAttribute("portletPreferences");
      portletPreferencesValues = (java.util.Map) _jspx_page_context.findAttribute("portletPreferencesValues");
      portletSession = (javax.portlet.PortletSession) _jspx_page_context.findAttribute("portletSession");
      portletSessionScope = (java.util.Map) _jspx_page_context.findAttribute("portletSessionScope");
      renderRequest = (javax.portlet.RenderRequest) _jspx_page_context.findAttribute("renderRequest");
      renderResponse = (javax.portlet.RenderResponse) _jspx_page_context.findAttribute("renderResponse");
      resourceRequest = (javax.portlet.ResourceRequest) _jspx_page_context.findAttribute("resourceRequest");
      resourceResponse = (javax.portlet.ResourceResponse) _jspx_page_context.findAttribute("resourceResponse");
      out.write('\n');
      out.write('\n');

String className = GetterUtil.getString((String)request.getAttribute("liferay-social-bookmarks:bookmarks:className"));
long classPK = GetterUtil.getLong((Long)request.getAttribute("liferay-social-bookmarks:bookmarks:classPK"));
String displayStyle = GetterUtil.getString((String)request.getAttribute("liferay-social-bookmarks:bookmarks:displayStyle"));
int maxInlineItems = GetterUtil.getInteger(request.getAttribute("liferay-social-bookmarks:bookmarks:maxInlineItems"));
String target = GetterUtil.getString((String)request.getAttribute("liferay-social-bookmarks:bookmarks:target"));
String title = GetterUtil.getString((String)request.getAttribute("liferay-social-bookmarks:bookmarks:title"));
String[] types = SocialBookmarksRegistryUtil.getValidTypes((String[])request.getAttribute("liferay-social-bookmarks:bookmarks:types"));
String url = GetterUtil.getString((String)request.getAttribute("liferay-social-bookmarks:bookmarks:url"));

      out.write('\n');
      out.write('\n');
      //  liferay-util:html-top
      com.liferay.taglib.util.HtmlTopTag _jspx_th_liferay$1util_html$1top_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.HtmlTopTag.class) : new com.liferay.taglib.util.HtmlTopTag();
      _jspx_th_liferay$1util_html$1top_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1util_html$1top_0.setParent(null);
      _jspx_th_liferay$1util_html$1top_0.setOutputKey("social_bookmarks_css");
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
      out.write("<div class=\"taglib-social-bookmarks\" id=\"");
      out.print( PortalUtil.generateRandomKey(request, "taglib_ui_social_bookmarks_page") + StringPool.UNDERLINE );
      out.write("socialBookmarks\">\n");
      out.write("\t");
      out.write("\n");
      out.write("\t\t");
if (
 displayStyle.equals("menu") || BrowserSnifferUtil.isMobile(request) ) {
      out.write("\n");
      out.write("\t\t\t");
      //  clay:dropdown-menu
      com.liferay.frontend.taglib.clay.servlet.taglib.DropdownMenuTag _jspx_th_clay_dropdown$1menu_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.DropdownMenuTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.DropdownMenuTag();
      _jspx_th_clay_dropdown$1menu_0.setPageContext(_jspx_page_context);
      _jspx_th_clay_dropdown$1menu_0.setParent(null);
      _jspx_th_clay_dropdown$1menu_0.setBorderless( true );
      _jspx_th_clay_dropdown$1menu_0.setDisplayType("secondary");
      _jspx_th_clay_dropdown$1menu_0.setDropdownItems( SocialBookmarksTagUtil.getDropdownItems(request.getLocale(), types, className, classPK, title, url) );
      _jspx_th_clay_dropdown$1menu_0.setIcon("share");
      _jspx_th_clay_dropdown$1menu_0.setLabel( BrowserSnifferUtil.isMobile(request) ? null : "share" );
      _jspx_th_clay_dropdown$1menu_0.setPropsTransformer("js/SocialBookmarksDropdownPropsTransformer");
      _jspx_th_clay_dropdown$1menu_0.setSmall( true );
      int _jspx_eval_clay_dropdown$1menu_0 = _jspx_th_clay_dropdown$1menu_0.doStartTag();
      if (_jspx_th_clay_dropdown$1menu_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_dropdown$1menu_0);
        _jspx_th_clay_dropdown$1menu_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_dropdown$1menu_0);
      _jspx_th_clay_dropdown$1menu_0.release();
      out.write("\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t");
}
else {
      out.write("\n");
      out.write("\t\t\t<ul class=\"list-unstyled ");
      out.print( displayStyle );
      out.write("\">\n");
      out.write("\n");
      out.write("\t\t\t\t");

				for (int i = 0; i < Math.min(types.length, maxInlineItems); i++) {
					SocialBookmark socialBookmark = SocialBookmarksRegistryUtil.getSocialBookmark(types[i]);
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"taglib-social-bookmark ");
      out.print( "taglib-social-bookmark-" + types[i] );
      out.write("\">\n");
      out.write("\t\t\t\t\t\t");
      //  liferay-social-bookmarks:bookmark
      com.liferay.social.bookmarks.taglib.servlet.taglib.SocialBookmarkTag _jspx_th_liferay$1social$1bookmarks_bookmark_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.social.bookmarks.taglib.servlet.taglib.SocialBookmarkTag.class) : new com.liferay.social.bookmarks.taglib.servlet.taglib.SocialBookmarkTag();
      _jspx_th_liferay$1social$1bookmarks_bookmark_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1social$1bookmarks_bookmark_0.setParent(null);
      _jspx_th_liferay$1social$1bookmarks_bookmark_0.setAdditionalProps( HashMapBuilder.<String, Object>put("className", HtmlUtil.escapeJS(className)).put("classPK", String.valueOf(classPK)).put("postURL", socialBookmark.getPostURL(title, url)).put("type", types[i]).put("url", HtmlUtil.escapeJS(url)).build() );
      _jspx_th_liferay$1social$1bookmarks_bookmark_0.setDisplayStyle( displayStyle );
      _jspx_th_liferay$1social$1bookmarks_bookmark_0.setTarget( target );
      _jspx_th_liferay$1social$1bookmarks_bookmark_0.setTitle( title );
      _jspx_th_liferay$1social$1bookmarks_bookmark_0.setType( types[i] );
      _jspx_th_liferay$1social$1bookmarks_bookmark_0.setUrl( url );
      int _jspx_eval_liferay$1social$1bookmarks_bookmark_0 = _jspx_th_liferay$1social$1bookmarks_bookmark_0.doStartTag();
      if (_jspx_th_liferay$1social$1bookmarks_bookmark_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1social$1bookmarks_bookmark_0);
        _jspx_th_liferay$1social$1bookmarks_bookmark_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1social$1bookmarks_bookmark_0);
      _jspx_th_liferay$1social$1bookmarks_bookmark_0.release();
      out.write("\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t");

				}
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t");
if (
 types.length > maxInlineItems ) {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");

				String[] remainingTypes = ArrayUtil.subset(types, maxInlineItems, types.length);
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");
      //  clay:dropdown-menu
      com.liferay.frontend.taglib.clay.servlet.taglib.DropdownMenuTag _jspx_th_clay_dropdown$1menu_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.DropdownMenuTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.DropdownMenuTag();
      _jspx_th_clay_dropdown$1menu_1.setPageContext(_jspx_page_context);
      _jspx_th_clay_dropdown$1menu_1.setParent(null);
      _jspx_th_clay_dropdown$1menu_1.setBorderless( true );
      _jspx_th_clay_dropdown$1menu_1.setDisplayType("secondary");
      _jspx_th_clay_dropdown$1menu_1.setDropdownItems( SocialBookmarksTagUtil.getDropdownItems(request.getLocale(), remainingTypes, className, classPK, title, url) );
      _jspx_th_clay_dropdown$1menu_1.setIcon("share");
      _jspx_th_clay_dropdown$1menu_1.setMonospaced( true );
      _jspx_th_clay_dropdown$1menu_1.setPropsTransformer("js/SocialBookmarksDropdownPropsTransformer");
      _jspx_th_clay_dropdown$1menu_1.setSmall( true );
      _jspx_th_clay_dropdown$1menu_1.setDynamicAttribute(null, "title", new String("share"));
      int _jspx_eval_clay_dropdown$1menu_1 = _jspx_th_clay_dropdown$1menu_1.doStartTag();
      if (_jspx_th_clay_dropdown$1menu_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_dropdown$1menu_1);
        _jspx_th_clay_dropdown$1menu_1.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_dropdown$1menu_1);
      _jspx_th_clay_dropdown$1menu_1.release();
      out.write("\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\t\t");
      out.write('\n');
      out.write('	');
}
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
