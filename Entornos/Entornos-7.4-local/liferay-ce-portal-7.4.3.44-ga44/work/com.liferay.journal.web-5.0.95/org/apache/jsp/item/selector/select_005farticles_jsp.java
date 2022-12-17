package org.apache.jsp.item.selector;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.dynamic.data.mapping.model.DDMStructure;
import com.liferay.journal.model.JournalArticle;
import com.liferay.journal.model.JournalFolder;
import com.liferay.journal.web.internal.constants.JournalWebConstants;
import com.liferay.journal.web.internal.dao.search.JournalResultRowSplitter;
import com.liferay.journal.web.internal.display.context.JournalArticleItemSelectorViewDisplayContext;
import com.liferay.journal.web.internal.display.context.JournalArticleItemSelectorViewManagementToolbarDisplayContext;
import com.liferay.journal.web.internal.frontend.taglib.clay.servlet.taglib.JournalArticleItemSelectorVerticalCard;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.portlet.url.builder.PortletURLBuilder;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringUtil;
import java.util.Date;
import java.util.Objects;
import javax.portlet.PortletURL;

public final class select_005farticles_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/item/selector/init.jsp");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-clay.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-site-navigation.tld");
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

JournalArticleItemSelectorViewDisplayContext journalArticleItemSelectorViewDisplayContext = (JournalArticleItemSelectorViewDisplayContext)request.getAttribute(JournalWebConstants.JOURNAL_ARTICLE_ITEM_SELECTOR_VIEW_DISPLAY_CONTEXT);

      out.write('\n');
      out.write('\n');
      //  clay:management-toolbar
      com.liferay.frontend.taglib.clay.servlet.taglib.ManagementToolbarTag _jspx_th_clay_management$1toolbar_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ManagementToolbarTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ManagementToolbarTag();
      _jspx_th_clay_management$1toolbar_0.setPageContext(_jspx_page_context);
      _jspx_th_clay_management$1toolbar_0.setParent(null);
      _jspx_th_clay_management$1toolbar_0.setManagementToolbarDisplayContext( new JournalArticleItemSelectorViewManagementToolbarDisplayContext(request, liferayPortletRequest, liferayPortletResponse, journalArticleItemSelectorViewDisplayContext) );
      int _jspx_eval_clay_management$1toolbar_0 = _jspx_th_clay_management$1toolbar_0.doStartTag();
      if (_jspx_th_clay_management$1toolbar_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_management$1toolbar_0);
        _jspx_th_clay_management$1toolbar_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_management$1toolbar_0);
      _jspx_th_clay_management$1toolbar_0.release();
      out.write('\n');
      out.write('\n');
      //  clay:container-fluid
      com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag _jspx_th_clay_container$1fluid_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag();
      _jspx_th_clay_container$1fluid_0.setPageContext(_jspx_page_context);
      _jspx_th_clay_container$1fluid_0.setParent(null);
      _jspx_th_clay_container$1fluid_0.setCssClass("item-selector lfr-item-viewer");
      _jspx_th_clay_container$1fluid_0.setDynamicAttribute(null, "id",  liferayPortletResponse.getNamespace() + "articlesContainer" );
      int _jspx_eval_clay_container$1fluid_0 = _jspx_th_clay_container$1fluid_0.doStartTag();
      if (_jspx_eval_clay_container$1fluid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write('\n');
        out.write('	');
        //  liferay-site-navigation:breadcrumb
        com.liferay.site.navigation.taglib.servlet.taglib.BreadcrumbTag _jspx_th_liferay$1site$1navigation_breadcrumb_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.site.navigation.taglib.servlet.taglib.BreadcrumbTag.class) : new com.liferay.site.navigation.taglib.servlet.taglib.BreadcrumbTag();
        _jspx_th_liferay$1site$1navigation_breadcrumb_0.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1site$1navigation_breadcrumb_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_0);
        _jspx_th_liferay$1site$1navigation_breadcrumb_0.setBreadcrumbEntries( journalArticleItemSelectorViewDisplayContext.getPortletBreadcrumbEntries() );
        int _jspx_eval_liferay$1site$1navigation_breadcrumb_0 = _jspx_th_liferay$1site$1navigation_breadcrumb_0.doStartTag();
        if (_jspx_th_liferay$1site$1navigation_breadcrumb_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1site$1navigation_breadcrumb_0);
          _jspx_th_liferay$1site$1navigation_breadcrumb_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1site$1navigation_breadcrumb_0);
        _jspx_th_liferay$1site$1navigation_breadcrumb_0.release();
        out.write("\n");
        out.write("\n");
        out.write("\t");
        //  liferay-ui:search-container
        com.liferay.taglib.ui.SearchContainerTag _jspx_th_liferay$1ui_search$1container_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerTag.class) : new com.liferay.taglib.ui.SearchContainerTag();
        _jspx_th_liferay$1ui_search$1container_0.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_search$1container_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_0);
        _jspx_th_liferay$1ui_search$1container_0.setEmptyResultsMessage("no-web-content-was-found");
        _jspx_th_liferay$1ui_search$1container_0.setId("articles");
        _jspx_th_liferay$1ui_search$1container_0.setSearchContainer( journalArticleItemSelectorViewDisplayContext.getSearchContainer() );
        int _jspx_eval_liferay$1ui_search$1container_0 = _jspx_th_liferay$1ui_search$1container_0.doStartTag();
        if (_jspx_eval_liferay$1ui_search$1container_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          java.lang.Integer total = null;
          com.liferay.portal.kernel.dao.search.SearchContainer searchContainer = null;
          total = (java.lang.Integer) _jspx_page_context.findAttribute("total");
          searchContainer = (com.liferay.portal.kernel.dao.search.SearchContainer) _jspx_page_context.findAttribute("searchContainer");
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:search-container-row
          com.liferay.taglib.ui.SearchContainerRowTag _jspx_th_liferay$1ui_search$1container$1row_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerRowTag.class) : new com.liferay.taglib.ui.SearchContainerRowTag();
          _jspx_th_liferay$1ui_search$1container$1row_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_search$1container$1row_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container_0);
          _jspx_th_liferay$1ui_search$1container$1row_0.setClassName("Object");
          _jspx_th_liferay$1ui_search$1container$1row_0.setModelVar("object");
          int _jspx_eval_liferay$1ui_search$1container$1row_0 = _jspx_th_liferay$1ui_search$1container$1row_0.doStartTag();
          if (_jspx_eval_liferay$1ui_search$1container$1row_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Integer index = null;
            Object object = null;
            com.liferay.portal.kernel.dao.search.ResultRow row = null;
            if (_jspx_eval_liferay$1ui_search$1container$1row_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_liferay$1ui_search$1container$1row_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_liferay$1ui_search$1container$1row_0.doInitBody();
            }
            index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
            object = (Object) _jspx_page_context.findAttribute("object");
            row = (com.liferay.portal.kernel.dao.search.ResultRow) _jspx_page_context.findAttribute("row");
            do {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");

			JournalArticle curArticle = null;
			JournalFolder curFolder = null;

			Object result = row.getObject();

			if (result instanceof JournalFolder) {
				curFolder = (JournalFolder)result;
			}
			else {
				curArticle = journalArticleItemSelectorViewDisplayContext.getLatestArticle((JournalArticle)result);
			}
			
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t");
if (
 curArticle != null ) {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t");

					row.setCssClass("articles selector-button" + row.getCssClass());

					row.setData(journalArticleItemSelectorViewDisplayContext.getJournalArticleContext(curArticle));
					
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t\t\t");
if (
 Objects.equals(journalArticleItemSelectorViewDisplayContext.getDisplayStyle(), "descriptive") ) {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");

							row.setCssClass("item-preview " + row.getCssClass());
							
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_0.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_0 = _jspx_th_liferay$1ui_search$1container$1column$1text_0.doStartTag();
              if (_jspx_eval_liferay$1ui_search$1container$1column$1text_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_liferay$1ui_search$1container$1column$1text_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_liferay$1ui_search$1container$1column$1text_0.doInitBody();
                }
                do {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  liferay-ui:user-portrait
                  com.liferay.taglib.ui.UserPortraitTag _jspx_th_liferay$1ui_user$1portrait_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.UserPortraitTag.class) : new com.liferay.taglib.ui.UserPortraitTag();
                  _jspx_th_liferay$1ui_user$1portrait_0.setPageContext(_jspx_page_context);
                  _jspx_th_liferay$1ui_user$1portrait_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_0);
                  _jspx_th_liferay$1ui_user$1portrait_0.setUserId( curArticle.getUserId() );
                  int _jspx_eval_liferay$1ui_user$1portrait_0 = _jspx_th_liferay$1ui_user$1portrait_0.doStartTag();
                  if (_jspx_th_liferay$1ui_user$1portrait_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_user$1portrait_0);
                    _jspx_th_liferay$1ui_user$1portrait_0.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_user$1portrait_0);
                  _jspx_th_liferay$1ui_user$1portrait_0.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_liferay$1ui_search$1container$1column$1text_0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_0);
                _jspx_th_liferay$1ui_search$1container$1column$1text_0.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_0);
              _jspx_th_liferay$1ui_search$1container$1column$1text_0.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_1.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1text_1.setColspan( 2 );
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_1 = _jspx_th_liferay$1ui_search$1container$1column$1text_1.doStartTag();
              if (_jspx_eval_liferay$1ui_search$1container$1column$1text_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_liferay$1ui_search$1container$1column$1text_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_liferay$1ui_search$1container$1column$1text_1.doInitBody();
                }
                do {
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t");

								Date createDate = curArticle.getModifiedDate();

								String modifiedDateDescription = LanguageUtil.getTimeDescription(request, System.currentTimeMillis() - createDate.getTime(), true);
								
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t<span class=\"text-default\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t");
                  //  liferay-ui:message
                  com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
                  _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
                  _jspx_th_liferay$1ui_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_1);
                  _jspx_th_liferay$1ui_message_0.setArguments( new String[] {HtmlUtil.escape(curArticle.getUserName()), modifiedDateDescription} );
                  _jspx_th_liferay$1ui_message_0.setKey("x-modified-x-ago");
                  int _jspx_eval_liferay$1ui_message_0 = _jspx_th_liferay$1ui_message_0.doStartTag();
                  if (_jspx_th_liferay$1ui_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
                    _jspx_th_liferay$1ui_message_0.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
                  _jspx_th_liferay$1ui_message_0.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t</span>\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t<p class=\"font-weight-bold h5\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t");
                  out.print( HtmlUtil.escape(curArticle.getTitle(locale, true)) );
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t</p>\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t");
if (
 journalArticleItemSelectorViewDisplayContext.isSearchEverywhere() ) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t<h6 class=\"text-default\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_liferay$1ui_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_search$1container$1column$1text_1, _jspx_page_context))
                    return;
                  out.write(":\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"text-secondary\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t");
                  //  clay:icon
                  com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
                  _jspx_th_clay_icon_0.setPageContext(_jspx_page_context);
                  _jspx_th_clay_icon_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_1);
                  _jspx_th_clay_icon_0.setSymbol( journalArticleItemSelectorViewDisplayContext.getGroupCssIcon(curArticle.getGroupId()) );
                  int _jspx_eval_clay_icon_0 = _jspx_th_clay_icon_0.doStartTag();
                  if (_jspx_th_clay_icon_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_0);
                    _jspx_th_clay_icon_0.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_0);
                  _jspx_th_clay_icon_0.release();
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t<small>");
                  out.print( journalArticleItemSelectorViewDisplayContext.getGroupLabel(curArticle.getGroupId(), locale) );
                  out.write("</small>\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t</span>\n");
                  out.write("\t\t\t\t\t\t\t\t\t</h6>\n");
                  out.write("\t\t\t\t\t\t\t\t");
}
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_liferay$1ui_search$1container$1column$1text_1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_1);
                _jspx_th_liferay$1ui_search$1container$1column$1text_1.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_1);
              _jspx_th_liferay$1ui_search$1container$1column$1text_1.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t\t\t");
}
else if (
 Objects.equals(journalArticleItemSelectorViewDisplayContext.getDisplayStyle(), "icon") ) {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");

							row.setCssClass("card-page-item card-page-item-directory entry " + row.getCssClass());
							
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_2.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_2 = _jspx_th_liferay$1ui_search$1container$1column$1text_2.doStartTag();
              if (_jspx_eval_liferay$1ui_search$1container$1column$1text_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_liferay$1ui_search$1container$1column$1text_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_liferay$1ui_search$1container$1column$1text_2.doInitBody();
                }
                do {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  clay:vertical-card
                  com.liferay.frontend.taglib.clay.servlet.taglib.VerticalCardTag _jspx_th_clay_vertical$1card_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.VerticalCardTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.VerticalCardTag();
                  _jspx_th_clay_vertical$1card_0.setPageContext(_jspx_page_context);
                  _jspx_th_clay_vertical$1card_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_2);
                  _jspx_th_clay_vertical$1card_0.setVerticalCard( new JournalArticleItemSelectorVerticalCard(curArticle, renderRequest) );
                  int _jspx_eval_clay_vertical$1card_0 = _jspx_th_clay_vertical$1card_0.doStartTag();
                  if (_jspx_th_clay_vertical$1card_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_vertical$1card_0);
                    _jspx_th_clay_vertical$1card_0.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_vertical$1card_0);
                  _jspx_th_clay_vertical$1card_0.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_liferay$1ui_search$1container$1column$1text_2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_2);
                _jspx_th_liferay$1ui_search$1container$1column$1text_2.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_2);
              _jspx_th_liferay$1ui_search$1container$1column$1text_2.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t\t\t");
}
else {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");

							row.setCssClass("item-preview " + row.getCssClass());
							
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
if (
 journalArticleItemSelectorViewDisplayContext.showArticleId() ) {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_3.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1text_3.setName("id");
              _jspx_th_liferay$1ui_search$1container$1column$1text_3.setValue( HtmlUtil.escape(curArticle.getArticleId()) );
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_3 = _jspx_th_liferay$1ui_search$1container$1column$1text_3.doStartTag();
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_3);
                _jspx_th_liferay$1ui_search$1container$1column$1text_3.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_3);
              _jspx_th_liferay$1ui_search$1container$1column$1text_3.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
}
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_4.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1text_4.setCssClass("table-cell-expand table-cell-minw-200 table-title");
              _jspx_th_liferay$1ui_search$1container$1column$1text_4.setName("title");
              _jspx_th_liferay$1ui_search$1container$1column$1text_4.setValue( curArticle.getTitle(locale, true) );
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_4 = _jspx_th_liferay$1ui_search$1container$1column$1text_4.doStartTag();
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_4);
                _jspx_th_liferay$1ui_search$1container$1column$1text_4.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_4);
              _jspx_th_liferay$1ui_search$1container$1column$1text_4.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_5.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1text_5.setCssClass("table-cell-expand table-cell-minw-200 text-truncate");
              _jspx_th_liferay$1ui_search$1container$1column$1text_5.setName("description");
              _jspx_th_liferay$1ui_search$1container$1column$1text_5.setValue( StringUtil.shorten(HtmlUtil.stripHtml(curArticle.getDescription(locale)), 200) );
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_5 = _jspx_th_liferay$1ui_search$1container$1column$1text_5.doStartTag();
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_5);
                _jspx_th_liferay$1ui_search$1container$1column$1text_5.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_5);
              _jspx_th_liferay$1ui_search$1container$1column$1text_5.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
if (
 journalArticleItemSelectorViewDisplayContext.isSearchEverywhere() ) {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_6.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1text_6.setName("location");
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_6 = _jspx_th_liferay$1ui_search$1container$1column$1text_6.doStartTag();
              if (_jspx_eval_liferay$1ui_search$1container$1column$1text_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_liferay$1ui_search$1container$1column$1text_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_liferay$1ui_search$1container$1column$1text_6.doInitBody();
                }
                do {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t<span class=\"text-secondary\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t");
                  //  clay:icon
                  com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
                  _jspx_th_clay_icon_1.setPageContext(_jspx_page_context);
                  _jspx_th_clay_icon_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_6);
                  _jspx_th_clay_icon_1.setSymbol( journalArticleItemSelectorViewDisplayContext.getGroupCssIcon(curArticle.getGroupId()) );
                  int _jspx_eval_clay_icon_1 = _jspx_th_clay_icon_1.doStartTag();
                  if (_jspx_th_clay_icon_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_1);
                    _jspx_th_clay_icon_1.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_1);
                  _jspx_th_clay_icon_1.release();
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t<small>");
                  out.print( journalArticleItemSelectorViewDisplayContext.getGroupLabel(curArticle.getGroupId(), locale) );
                  out.write("</small>\n");
                  out.write("\t\t\t\t\t\t\t\t\t</span>\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_liferay$1ui_search$1container$1column$1text_6.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_6);
                _jspx_th_liferay$1ui_search$1container$1column$1text_6.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_6);
              _jspx_th_liferay$1ui_search$1container$1column$1text_6.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
}
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_7.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1text_7.setCssClass("table-cell-expand-smallest table-cell-minw-100");
              _jspx_th_liferay$1ui_search$1container$1column$1text_7.setName("author");
              _jspx_th_liferay$1ui_search$1container$1column$1text_7.setValue( HtmlUtil.escape(PortalUtil.getUserName(curArticle)) );
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_7 = _jspx_th_liferay$1ui_search$1container$1column$1text_7.doStartTag();
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_7);
                _jspx_th_liferay$1ui_search$1container$1column$1text_7.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_7);
              _jspx_th_liferay$1ui_search$1container$1column$1text_7.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-date
              com.liferay.taglib.ui.SearchContainerColumnDateTag _jspx_th_liferay$1ui_search$1container$1column$1date_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnDateTag.class) : new com.liferay.taglib.ui.SearchContainerColumnDateTag();
              _jspx_th_liferay$1ui_search$1container$1column$1date_0.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1date_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1date_0.setCssClass("table-cell-expand-smallest table-cell-ws-nowrap");
              _jspx_th_liferay$1ui_search$1container$1column$1date_0.setName("modified-date");
              _jspx_th_liferay$1ui_search$1container$1column$1date_0.setValue( curArticle.getModifiedDate() );
              int _jspx_eval_liferay$1ui_search$1container$1column$1date_0 = _jspx_th_liferay$1ui_search$1container$1column$1date_0.doStartTag();
              if (_jspx_th_liferay$1ui_search$1container$1column$1date_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1date_0);
                _jspx_th_liferay$1ui_search$1container$1column$1date_0.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1date_0);
              _jspx_th_liferay$1ui_search$1container$1column$1date_0.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-date
              com.liferay.taglib.ui.SearchContainerColumnDateTag _jspx_th_liferay$1ui_search$1container$1column$1date_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnDateTag.class) : new com.liferay.taglib.ui.SearchContainerColumnDateTag();
              _jspx_th_liferay$1ui_search$1container$1column$1date_1.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1date_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1date_1.setCssClass("table-cell-expand-smallest table-cell-ws-nowrap");
              _jspx_th_liferay$1ui_search$1container$1column$1date_1.setName("display-date");
              _jspx_th_liferay$1ui_search$1container$1column$1date_1.setValue( curArticle.getDisplayDate() );
              int _jspx_eval_liferay$1ui_search$1container$1column$1date_1 = _jspx_th_liferay$1ui_search$1container$1column$1date_1.doStartTag();
              if (_jspx_th_liferay$1ui_search$1container$1column$1date_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1date_1);
                _jspx_th_liferay$1ui_search$1container$1column$1date_1.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1date_1);
              _jspx_th_liferay$1ui_search$1container$1column$1date_1.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");

							DDMStructure ddmStructure = curArticle.getDDMStructure();
							
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_8.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1text_8.setCssClass("table-cell-expand-smallest table-cell-minw-100");
              _jspx_th_liferay$1ui_search$1container$1column$1text_8.setName("type");
              _jspx_th_liferay$1ui_search$1container$1column$1text_8.setValue( HtmlUtil.escape(ddmStructure.getName(locale)) );
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_8 = _jspx_th_liferay$1ui_search$1container$1column$1text_8.doStartTag();
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_8);
                _jspx_th_liferay$1ui_search$1container$1column$1text_8.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_8);
              _jspx_th_liferay$1ui_search$1container$1column$1text_8.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t\t");
}
              out.write("\n");
              out.write("\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t");
}
else if (
 curFolder != null ) {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t");

					PortletURL rowURL = PortletURLBuilder.create(
						journalArticleItemSelectorViewDisplayContext.getPortletURL()
					).setParameter(
						"folderId", curFolder.getFolderId()
					).setParameter(
						"groupId", curFolder.getGroupId()
					).buildPortletURL();
					
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t\t\t");
if (
 Objects.equals(journalArticleItemSelectorViewDisplayContext.getDisplayStyle(), "descriptive") ) {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-icon
              com.liferay.taglib.ui.SearchContainerColumnIconTag _jspx_th_liferay$1ui_search$1container$1column$1icon_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnIconTag.class) : new com.liferay.taglib.ui.SearchContainerColumnIconTag();
              _jspx_th_liferay$1ui_search$1container$1column$1icon_0.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1icon_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1icon_0.setIcon("folder");
              _jspx_th_liferay$1ui_search$1container$1column$1icon_0.setToggleRowChecker( true );
              int _jspx_eval_liferay$1ui_search$1container$1column$1icon_0 = _jspx_th_liferay$1ui_search$1container$1column$1icon_0.doStartTag();
              if (_jspx_th_liferay$1ui_search$1container$1column$1icon_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1icon_0);
                _jspx_th_liferay$1ui_search$1container$1column$1icon_0.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1icon_0);
              _jspx_th_liferay$1ui_search$1container$1column$1icon_0.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_9.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1text_9.setColspan( 2 );
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_9 = _jspx_th_liferay$1ui_search$1container$1column$1text_9.doStartTag();
              if (_jspx_eval_liferay$1ui_search$1container$1column$1text_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_liferay$1ui_search$1container$1column$1text_9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_liferay$1ui_search$1container$1column$1text_9.doInitBody();
                }
                do {
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t");

								Date createDate = curFolder.getCreateDate();

								String createDateDescription = LanguageUtil.getTimeDescription(request, System.currentTimeMillis() - createDate.getTime(), true);
								
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t<span class=\"text-default\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t");
                  //  liferay-ui:message
                  com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
                  _jspx_th_liferay$1ui_message_2.setPageContext(_jspx_page_context);
                  _jspx_th_liferay$1ui_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_9);
                  _jspx_th_liferay$1ui_message_2.setArguments( new String[] {HtmlUtil.escape(curFolder.getUserName()), createDateDescription} );
                  _jspx_th_liferay$1ui_message_2.setKey("x-modified-x-ago");
                  int _jspx_eval_liferay$1ui_message_2 = _jspx_th_liferay$1ui_message_2.doStartTag();
                  if (_jspx_th_liferay$1ui_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
                    _jspx_th_liferay$1ui_message_2.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
                  _jspx_th_liferay$1ui_message_2.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t</span>\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t<p class=\"font-weight-bold h5\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t<a href=\"");
                  out.print( rowURL );
                  out.write("\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t");
                  out.print( HtmlUtil.escape(curFolder.getName()) );
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t</a>\n");
                  out.write("\t\t\t\t\t\t\t\t</p>\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t");
if (
 journalArticleItemSelectorViewDisplayContext.isSearchEverywhere() ) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t<h6 class=\"text-default\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_liferay$1ui_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_search$1container$1column$1text_9, _jspx_page_context))
                    return;
                  out.write(":\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"text-secondary\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t");
                  //  clay:icon
                  com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
                  _jspx_th_clay_icon_2.setPageContext(_jspx_page_context);
                  _jspx_th_clay_icon_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_9);
                  _jspx_th_clay_icon_2.setSymbol( journalArticleItemSelectorViewDisplayContext.getGroupCssIcon(curFolder.getGroupId()) );
                  int _jspx_eval_clay_icon_2 = _jspx_th_clay_icon_2.doStartTag();
                  if (_jspx_th_clay_icon_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_2);
                    _jspx_th_clay_icon_2.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_2);
                  _jspx_th_clay_icon_2.release();
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t<small>");
                  out.print( journalArticleItemSelectorViewDisplayContext.getGroupLabel(curFolder.getGroupId(), locale) );
                  out.write("</small>\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t</span>\n");
                  out.write("\t\t\t\t\t\t\t\t\t</h6>\n");
                  out.write("\t\t\t\t\t\t\t\t");
}
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_liferay$1ui_search$1container$1column$1text_9.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_9);
                _jspx_th_liferay$1ui_search$1container$1column$1text_9.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_9);
              _jspx_th_liferay$1ui_search$1container$1column$1text_9.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t\t\t");
}
else if (
 Objects.equals(journalArticleItemSelectorViewDisplayContext.getDisplayStyle(), "icon") ) {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");

							row.setCssClass("card-page-item card-page-item-directory " + row.getCssClass());
							
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_10.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1text_10.setColspan( 2 );
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_10 = _jspx_th_liferay$1ui_search$1container$1column$1text_10.doStartTag();
              if (_jspx_eval_liferay$1ui_search$1container$1column$1text_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_liferay$1ui_search$1container$1column$1text_10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_liferay$1ui_search$1container$1column$1text_10.doInitBody();
                }
                do {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t<div class=\"card card-horizontal card-interactive card-interactive-secondary card-type-directory\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t<div class=\"card-body\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"card-row\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t");
                  //  clay:content-col
                  com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
                  _jspx_th_clay_content$1col_0.setPageContext(_jspx_page_context);
                  _jspx_th_clay_content$1col_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_10);
                  int _jspx_eval_clay_content$1col_0 = _jspx_th_clay_content$1col_0.doStartTag();
                  if (_jspx_eval_clay_content$1col_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                    //  clay:sticker
                    com.liferay.frontend.taglib.clay.servlet.taglib.StickerTag _jspx_th_clay_sticker_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.StickerTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.StickerTag();
                    _jspx_th_clay_sticker_0.setPageContext(_jspx_page_context);
                    _jspx_th_clay_sticker_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_0);
                    _jspx_th_clay_sticker_0.setDisplayType("secondary");
                    _jspx_th_clay_sticker_0.setIcon("folder");
                    _jspx_th_clay_sticker_0.setInline( true );
                    int _jspx_eval_clay_sticker_0 = _jspx_th_clay_sticker_0.doStartTag();
                    if (_jspx_th_clay_sticker_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sticker_0);
                      _jspx_th_clay_sticker_0.release();
                      return;
                    }
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sticker_0);
                    _jspx_th_clay_sticker_0.release();
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t\t");
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
                  out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"autofit-col autofit-col-expand autofit-col-gutters\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a class=\"card-title text-truncate\" href=\"");
                  out.print( rowURL );
                  out.write("\" title=\"");
                  out.print( HtmlUtil.escapeAttribute(curFolder.getName()) );
                  out.write("\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  out.print( HtmlUtil.escape(curFolder.getName()) );
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
if (
 journalArticleItemSelectorViewDisplayContext.isSearchEverywhere() ) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"text-secondary\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  //  clay:icon
                  com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
                  _jspx_th_clay_icon_3.setPageContext(_jspx_page_context);
                  _jspx_th_clay_icon_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_10);
                  _jspx_th_clay_icon_3.setSymbol( journalArticleItemSelectorViewDisplayContext.getGroupCssIcon(curFolder.getGroupId()) );
                  int _jspx_eval_clay_icon_3 = _jspx_th_clay_icon_3.doStartTag();
                  if (_jspx_th_clay_icon_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_3);
                    _jspx_th_clay_icon_3.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_3);
                  _jspx_th_clay_icon_3.release();
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<small>");
                  out.print( journalArticleItemSelectorViewDisplayContext.getGroupLabel(curFolder.getGroupId(), locale) );
                  out.write("</small>\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
}
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
                  out.write("\t\t\t\t\t\t\t\t\t</div>\n");
                  out.write("\t\t\t\t\t\t\t\t</div>\n");
                  out.write("\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_liferay$1ui_search$1container$1column$1text_10.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_10);
                _jspx_th_liferay$1ui_search$1container$1column$1text_10.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_10);
              _jspx_th_liferay$1ui_search$1container$1column$1text_10.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t\t\t");
}
else {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_11.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1text_11.setCssClass("table-cell-expand table-cell-minw-200 table-list-title");
              _jspx_th_liferay$1ui_search$1container$1column$1text_11.setHref( rowURL );
              _jspx_th_liferay$1ui_search$1container$1column$1text_11.setName("title");
              _jspx_th_liferay$1ui_search$1container$1column$1text_11.setValue( HtmlUtil.escape(curFolder.getName()) );
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_11 = _jspx_th_liferay$1ui_search$1container$1column$1text_11.doStartTag();
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_11);
                _jspx_th_liferay$1ui_search$1container$1column$1text_11.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_11);
              _jspx_th_liferay$1ui_search$1container$1column$1text_11.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_12 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_12.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1text_12.setCssClass("table-cell-expand table-cell-minw-200 text-truncate");
              _jspx_th_liferay$1ui_search$1container$1column$1text_12.setName("description");
              _jspx_th_liferay$1ui_search$1container$1column$1text_12.setValue( HtmlUtil.escape(curFolder.getDescription()) );
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_12 = _jspx_th_liferay$1ui_search$1container$1column$1text_12.doStartTag();
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_12);
                _jspx_th_liferay$1ui_search$1container$1column$1text_12.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_12);
              _jspx_th_liferay$1ui_search$1container$1column$1text_12.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
if (
 journalArticleItemSelectorViewDisplayContext.isSearchEverywhere() ) {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_13 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_13.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1text_13.setName("location");
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_13 = _jspx_th_liferay$1ui_search$1container$1column$1text_13.doStartTag();
              if (_jspx_eval_liferay$1ui_search$1container$1column$1text_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_liferay$1ui_search$1container$1column$1text_13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_liferay$1ui_search$1container$1column$1text_13.doInitBody();
                }
                do {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t<span class=\"text-secondary\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t");
                  //  clay:icon
                  com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
                  _jspx_th_clay_icon_4.setPageContext(_jspx_page_context);
                  _jspx_th_clay_icon_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_13);
                  _jspx_th_clay_icon_4.setSymbol( journalArticleItemSelectorViewDisplayContext.getGroupCssIcon(curFolder.getGroupId()) );
                  int _jspx_eval_clay_icon_4 = _jspx_th_clay_icon_4.doStartTag();
                  if (_jspx_th_clay_icon_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_4);
                    _jspx_th_clay_icon_4.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_4);
                  _jspx_th_clay_icon_4.release();
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t<small>");
                  out.print( journalArticleItemSelectorViewDisplayContext.getGroupLabel(curFolder.getGroupId(), locale) );
                  out.write("</small>\n");
                  out.write("\t\t\t\t\t\t\t\t\t</span>\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_liferay$1ui_search$1container$1column$1text_13.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_13);
                _jspx_th_liferay$1ui_search$1container$1column$1text_13.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_13);
              _jspx_th_liferay$1ui_search$1container$1column$1text_13.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
}
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_14 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_14.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1text_14.setCssClass("table-cell-expand-smallest table-cell-minw-150");
              _jspx_th_liferay$1ui_search$1container$1column$1text_14.setName("author");
              _jspx_th_liferay$1ui_search$1container$1column$1text_14.setValue( HtmlUtil.escape(PortalUtil.getUserName(curFolder)) );
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_14 = _jspx_th_liferay$1ui_search$1container$1column$1text_14.doStartTag();
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_14);
                _jspx_th_liferay$1ui_search$1container$1column$1text_14.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_14);
              _jspx_th_liferay$1ui_search$1container$1column$1text_14.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-date
              com.liferay.taglib.ui.SearchContainerColumnDateTag _jspx_th_liferay$1ui_search$1container$1column$1date_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnDateTag.class) : new com.liferay.taglib.ui.SearchContainerColumnDateTag();
              _jspx_th_liferay$1ui_search$1container$1column$1date_2.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1date_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1date_2.setCssClass("table-cell-expand-smallest table-cell-ws-nowrap");
              _jspx_th_liferay$1ui_search$1container$1column$1date_2.setName("modified-date");
              _jspx_th_liferay$1ui_search$1container$1column$1date_2.setValue( curFolder.getModifiedDate() );
              int _jspx_eval_liferay$1ui_search$1container$1column$1date_2 = _jspx_th_liferay$1ui_search$1container$1column$1date_2.doStartTag();
              if (_jspx_th_liferay$1ui_search$1container$1column$1date_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1date_2);
                _jspx_th_liferay$1ui_search$1container$1column$1date_2.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1date_2);
              _jspx_th_liferay$1ui_search$1container$1column$1date_2.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              if (_jspx_meth_liferay$1ui_search$1container$1column$1text_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_search$1container$1row_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_16 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_16.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1text_16.setCssClass("table-cell-expand-smallest table-cell-minw-150");
              _jspx_th_liferay$1ui_search$1container$1column$1text_16.setName("type");
              _jspx_th_liferay$1ui_search$1container$1column$1text_16.setValue( LanguageUtil.get(request, "folder") );
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_16 = _jspx_th_liferay$1ui_search$1container$1column$1text_16.doStartTag();
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_16);
                _jspx_th_liferay$1ui_search$1container$1column$1text_16.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_16);
              _jspx_th_liferay$1ui_search$1container$1column$1text_16.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t");
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
              int evalDoAfterBody = _jspx_th_liferay$1ui_search$1container$1row_0.doAfterBody();
              index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
              object = (Object) _jspx_page_context.findAttribute("object");
              row = (com.liferay.portal.kernel.dao.search.ResultRow) _jspx_page_context.findAttribute("row");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_liferay$1ui_search$1container$1row_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_liferay$1ui_search$1container$1row_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1row_0);
            _jspx_th_liferay$1ui_search$1container$1row_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1row_0);
          _jspx_th_liferay$1ui_search$1container$1row_0.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:search-iterator
          com.liferay.taglib.ui.SearchIteratorTag _jspx_th_liferay$1ui_search$1iterator_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchIteratorTag.class) : new com.liferay.taglib.ui.SearchIteratorTag();
          _jspx_th_liferay$1ui_search$1iterator_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_search$1iterator_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container_0);
          _jspx_th_liferay$1ui_search$1iterator_0.setDisplayStyle( journalArticleItemSelectorViewDisplayContext.getDisplayStyle() );
          _jspx_th_liferay$1ui_search$1iterator_0.setMarkupView("lexicon");
          _jspx_th_liferay$1ui_search$1iterator_0.setResultRowSplitter( new JournalResultRowSplitter() );
          _jspx_th_liferay$1ui_search$1iterator_0.setSearchContainer( searchContainer );
          int _jspx_eval_liferay$1ui_search$1iterator_0 = _jspx_th_liferay$1ui_search$1iterator_0.doStartTag();
          if (_jspx_th_liferay$1ui_search$1iterator_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1iterator_0);
            _jspx_th_liferay$1ui_search$1iterator_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1iterator_0);
          _jspx_th_liferay$1ui_search$1iterator_0.release();
          out.write('\n');
          out.write('	');
        }
        if (_jspx_th_liferay$1ui_search$1container_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container_0);
          _jspx_th_liferay$1ui_search$1container_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container_0);
        _jspx_th_liferay$1ui_search$1container_0.release();
        out.write('\n');
      }
      if (_jspx_th_clay_container$1fluid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_0);
        _jspx_th_clay_container$1fluid_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_0);
      _jspx_th_clay_container$1fluid_0.release();
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

  private boolean _jspx_meth_liferay$1ui_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_search$1container$1column$1text_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_1);
    _jspx_th_liferay$1ui_message_1.setKey("location");
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

  private boolean _jspx_meth_liferay$1ui_message_3(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_search$1container$1column$1text_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_3.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_9);
    _jspx_th_liferay$1ui_message_3.setKey("location");
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

  private boolean _jspx_meth_liferay$1ui_search$1container$1column$1text_15(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_search$1container$1row_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:search-container-column-text
    com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_15 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
    _jspx_th_liferay$1ui_search$1container$1column$1text_15.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_search$1container$1column$1text_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
    _jspx_th_liferay$1ui_search$1container$1column$1text_15.setCssClass("table-cell-expand-smallest table-cell-ws-nowrap");
    _jspx_th_liferay$1ui_search$1container$1column$1text_15.setName("display-date");
    _jspx_th_liferay$1ui_search$1container$1column$1text_15.setValue("--");
    int _jspx_eval_liferay$1ui_search$1container$1column$1text_15 = _jspx_th_liferay$1ui_search$1container$1column$1text_15.doStartTag();
    if (_jspx_th_liferay$1ui_search$1container$1column$1text_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_15);
      _jspx_th_liferay$1ui_search$1container$1column$1text_15.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_15);
    _jspx_th_liferay$1ui_search$1container$1column$1text_15.release();
    return false;
  }
}
