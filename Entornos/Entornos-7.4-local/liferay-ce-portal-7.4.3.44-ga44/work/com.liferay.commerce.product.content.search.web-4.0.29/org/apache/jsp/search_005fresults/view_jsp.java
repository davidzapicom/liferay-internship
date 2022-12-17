package org.apache.jsp.search_005fresults;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.commerce.product.catalog.CPCatalogEntry;
import com.liferay.commerce.product.content.constants.CPContentWebKeys;
import com.liferay.commerce.product.content.render.list.CPContentListRenderer;
import com.liferay.commerce.product.content.render.list.entry.CPContentListEntryRenderer;
import com.liferay.commerce.product.content.search.web.internal.constants.CPSearchResultsConstants;
import com.liferay.commerce.product.content.search.web.internal.display.context.CPOptionsSearchFacetDisplayContext;
import com.liferay.commerce.product.content.search.web.internal.display.context.CPPriceRangeFacetsDisplayContext;
import com.liferay.commerce.product.content.search.web.internal.display.context.CPSearchResultsDisplayContext;
import com.liferay.commerce.product.content.search.web.internal.display.context.CPSpecificationOptionFacetsDisplayContext;
import com.liferay.commerce.product.content.search.web.internal.display.context.CPSpecificationOptionsSearchFacetDisplayContext;
import com.liferay.commerce.product.content.search.web.internal.display.context.CPSpecificationOptionsSearchFacetTermDisplayContext;
import com.liferay.commerce.product.content.search.web.internal.portlet.CPSearchResultsPortlet;
import com.liferay.commerce.product.type.CPType;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.search.facet.Facet;
import com.liferay.portal.kernel.search.facet.collector.FacetCollector;
import com.liferay.portal.kernel.search.facet.collector.TermCollector;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;
import java.util.List;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/init.jsp");
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

CPSearchResultsDisplayContext cpSearchResultsDisplayContext = (CPSearchResultsDisplayContext)request.getAttribute(WebKeys.PORTLET_DISPLAY_CONTEXT);

SearchContainer<CPCatalogEntry> cpCatalogEntrySearchContainer = cpSearchResultsDisplayContext.getSearchContainer();

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('	');
if (
 !cpSearchResultsDisplayContext.hasCommerceChannel() ) {
      out.write("\n");
      out.write("\t\t<div class=\"alert alert-info mx-auto\">\n");
      out.write("\t\t\t");
      if (_jspx_meth_liferay$1ui_message_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t");
      out.write('\n');
      out.write('	');
}
else if (
 cpSearchResultsDisplayContext.isSelectionStyleADT() ) {
      out.write("\n");
      out.write("\t\t");
      //  liferay-ddm:template-renderer
      com.liferay.dynamic.data.mapping.taglib.servlet.taglib.TemplateRendererTag _jspx_th_liferay$1ddm_template$1renderer_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.dynamic.data.mapping.taglib.servlet.taglib.TemplateRendererTag.class) : new com.liferay.dynamic.data.mapping.taglib.servlet.taglib.TemplateRendererTag();
      _jspx_th_liferay$1ddm_template$1renderer_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ddm_template$1renderer_0.setParent(null);
      _jspx_th_liferay$1ddm_template$1renderer_0.setClassName( CPSearchResultsPortlet.class.getName() );
      _jspx_th_liferay$1ddm_template$1renderer_0.setContextObjects(
				HashMapBuilder.<String, Object>put(
					"cpContentHelper", request.getAttribute(CPContentWebKeys.CP_CONTENT_HELPER)
				).put(
					"cpSearchResultsDisplayContext", cpSearchResultsDisplayContext
				).build()
			);
      _jspx_th_liferay$1ddm_template$1renderer_0.setDisplayStyle( cpSearchResultsDisplayContext.getDisplayStyle() );
      _jspx_th_liferay$1ddm_template$1renderer_0.setDisplayStyleGroupId( cpSearchResultsDisplayContext.getDisplayStyleGroupId() );
      _jspx_th_liferay$1ddm_template$1renderer_0.setEntries( cpCatalogEntrySearchContainer.getResults() );
      int _jspx_eval_liferay$1ddm_template$1renderer_0 = _jspx_th_liferay$1ddm_template$1renderer_0.doStartTag();
      if (_jspx_th_liferay$1ddm_template$1renderer_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ddm_template$1renderer_0);
        _jspx_th_liferay$1ddm_template$1renderer_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ddm_template$1renderer_0);
      _jspx_th_liferay$1ddm_template$1renderer_0.release();
      out.write("\n");
      out.write("\n");
      out.write("\t\t");
if (
 cpSearchResultsDisplayContext.isPaginate() ) {
      out.write("\n");
      out.write("\t\t\t");
      //  aui:form
      com.liferay.taglib.aui.FormTag _jspx_th_aui_form_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FormTag.class) : new com.liferay.taglib.aui.FormTag();
      _jspx_th_aui_form_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_form_0.setParent(null);
      _jspx_th_aui_form_0.setUseNamespace( false );
      int _jspx_eval_aui_form_0 = _jspx_th_aui_form_0.doStartTag();
      if (_jspx_eval_aui_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t");
        //  liferay-ui:search-paginator
        com.liferay.taglib.ui.SearchPaginatorTag _jspx_th_liferay$1ui_search$1paginator_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchPaginatorTag.class) : new com.liferay.taglib.ui.SearchPaginatorTag();
        _jspx_th_liferay$1ui_search$1paginator_0.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_search$1paginator_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_liferay$1ui_search$1paginator_0.setMarkupView("lexicon");
        _jspx_th_liferay$1ui_search$1paginator_0.setSearchContainer( cpCatalogEntrySearchContainer );
        int _jspx_eval_liferay$1ui_search$1paginator_0 = _jspx_th_liferay$1ui_search$1paginator_0.doStartTag();
        if (_jspx_th_liferay$1ui_search$1paginator_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1paginator_0);
          _jspx_th_liferay$1ui_search$1paginator_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1paginator_0);
        _jspx_th_liferay$1ui_search$1paginator_0.release();
        out.write("\n");
        out.write("\t\t\t");
      }
      if (_jspx_th_aui_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_form_0);
        _jspx_th_aui_form_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_form_0);
      _jspx_th_aui_form_0.release();
      out.write("\n");
      out.write("\t\t");
}
      out.write('\n');
      out.write('	');
      out.write('\n');
      out.write('	');
}
else if (
 cpSearchResultsDisplayContext.isSelectionStyleCustomRenderer() ) {
      out.write("\n");
      out.write("\t\t");
      //  liferay-commerce-product:product-list-renderer
      com.liferay.commerce.product.taglib.servlet.taglib.ProductListRendererTag _jspx_th_liferay$1commerce$1product_product$1list$1renderer_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.commerce.product.taglib.servlet.taglib.ProductListRendererTag.class) : new com.liferay.commerce.product.taglib.servlet.taglib.ProductListRendererTag();
      _jspx_th_liferay$1commerce$1product_product$1list$1renderer_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1commerce$1product_product$1list$1renderer_0.setParent(null);
      _jspx_th_liferay$1commerce$1product_product$1list$1renderer_0.setCPDataSourceResult( cpSearchResultsDisplayContext.getCPDataSourceResult() );
      _jspx_th_liferay$1commerce$1product_product$1list$1renderer_0.setEntryKeys( cpSearchResultsDisplayContext.getCPContentListEntryRendererKeys() );
      _jspx_th_liferay$1commerce$1product_product$1list$1renderer_0.setKey( cpSearchResultsDisplayContext.getCPContentListRendererKey() );
      int _jspx_eval_liferay$1commerce$1product_product$1list$1renderer_0 = _jspx_th_liferay$1commerce$1product_product$1list$1renderer_0.doStartTag();
      if (_jspx_th_liferay$1commerce$1product_product$1list$1renderer_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1commerce$1product_product$1list$1renderer_0);
        _jspx_th_liferay$1commerce$1product_product$1list$1renderer_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1commerce$1product_product$1list$1renderer_0);
      _jspx_th_liferay$1commerce$1product_product$1list$1renderer_0.release();
      out.write("\n");
      out.write("\n");
      out.write("\t\t");
if (
 cpSearchResultsDisplayContext.isPaginate() ) {
      out.write("\n");
      out.write("\t\t\t");
      //  aui:form
      com.liferay.taglib.aui.FormTag _jspx_th_aui_form_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FormTag.class) : new com.liferay.taglib.aui.FormTag();
      _jspx_th_aui_form_1.setPageContext(_jspx_page_context);
      _jspx_th_aui_form_1.setParent(null);
      _jspx_th_aui_form_1.setUseNamespace( false );
      int _jspx_eval_aui_form_1 = _jspx_th_aui_form_1.doStartTag();
      if (_jspx_eval_aui_form_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t");
        //  liferay-ui:search-paginator
        com.liferay.taglib.ui.SearchPaginatorTag _jspx_th_liferay$1ui_search$1paginator_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchPaginatorTag.class) : new com.liferay.taglib.ui.SearchPaginatorTag();
        _jspx_th_liferay$1ui_search$1paginator_1.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_search$1paginator_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_1);
        _jspx_th_liferay$1ui_search$1paginator_1.setMarkupView("lexicon");
        _jspx_th_liferay$1ui_search$1paginator_1.setSearchContainer( cpCatalogEntrySearchContainer );
        int _jspx_eval_liferay$1ui_search$1paginator_1 = _jspx_th_liferay$1ui_search$1paginator_1.doStartTag();
        if (_jspx_th_liferay$1ui_search$1paginator_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1paginator_1);
          _jspx_th_liferay$1ui_search$1paginator_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1paginator_1);
        _jspx_th_liferay$1ui_search$1paginator_1.release();
        out.write("\n");
        out.write("\t\t\t");
      }
      if (_jspx_th_aui_form_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_form_1);
        _jspx_th_aui_form_1.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_form_1);
      _jspx_th_aui_form_1.release();
      out.write("\n");
      out.write("\t\t");
}
      out.write('\n');
      out.write('	');
      out.write('\n');
      out.write('	');
}
else {
      out.write('\n');
      out.write('	');
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

  private boolean _jspx_meth_liferay$1ui_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent(null);
    _jspx_th_liferay$1ui_message_0.setKey("this-site-does-not-have-a-channel");
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
}
