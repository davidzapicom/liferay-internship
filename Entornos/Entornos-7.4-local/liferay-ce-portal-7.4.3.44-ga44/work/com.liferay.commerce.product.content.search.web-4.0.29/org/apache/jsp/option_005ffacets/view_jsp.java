package org.apache.jsp.option_005ffacets;

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
    _jspx_dependants = new java.util.ArrayList<String>(12);
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/META-INF/c.tld");
    _jspx_dependants.add("/META-INF/liferay-portlet_2_0.tld");
    _jspx_dependants.add("/META-INF/liferay-aui.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-clay.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-commerce-product.tld");
    _jspx_dependants.add("/META-INF/resources/liferay-ddm.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-frontend.tld");
    _jspx_dependants.add("/META-INF/liferay-portlet-ext.tld");
    _jspx_dependants.add("/META-INF/resources/liferay-template.tld");
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

CPOptionsSearchFacetDisplayContext cpOptionsSearchFacetDisplayContext = (CPOptionsSearchFacetDisplayContext)request.getAttribute(WebKeys.PORTLET_DISPLAY_CONTEXT);

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('	');
if (
 !cpOptionsSearchFacetDisplayContext.hasCommerceChannel() ) {
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
else {
      out.write("\n");
      out.write("\n");
      out.write("\t\t");

		List<Facet> facets = cpOptionsSearchFacetDisplayContext.getFacets();

		long companyId = company.getCompanyId();
		
      out.write("\n");
      out.write("\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t\t");
if (
 !facets.isEmpty() ) {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");

				for (Facet facet : facets) {
					FacetCollector facetCollector = facet.getFacetCollector();

					List<TermCollector> termCollectors = facetCollector.getTermCollectors();
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t");
if (
 !termCollectors.isEmpty() ) {
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      //  aui:form
      com.liferay.taglib.aui.FormTag _jspx_th_aui_form_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FormTag.class) : new com.liferay.taglib.aui.FormTag();
      _jspx_th_aui_form_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_form_0.setParent(null);
      _jspx_th_aui_form_0.setMethod("post");
      _jspx_th_aui_form_0.setName( "assetEntriesFacetForm_" + facet.getFieldName() );
      int _jspx_eval_aui_form_0 = _jspx_th_aui_form_0.doStartTag();
      if (_jspx_eval_aui_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_0.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_0.setCssClass("facet-parameter-name");
        _jspx_th_aui_input_0.setName("facet-parameter-name");
        _jspx_th_aui_input_0.setType("hidden");
        _jspx_th_aui_input_0.setValue( cpOptionsSearchFacetDisplayContext.getCPOptionKey(companyId, facet.getFieldName()) );
        int _jspx_eval_aui_input_0 = _jspx_th_aui_input_0.doStartTag();
        if (_jspx_th_aui_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_0);
          _jspx_th_aui_input_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_0);
        _jspx_th_aui_input_0.release();
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_1.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_1.setCssClass("start-parameter-name");
        _jspx_th_aui_input_1.setName("start-parameter-name");
        _jspx_th_aui_input_1.setType("hidden");
        _jspx_th_aui_input_1.setValue( cpOptionsSearchFacetDisplayContext.getPaginationStartParameterName() );
        int _jspx_eval_aui_input_1 = _jspx_th_aui_input_1.doStartTag();
        if (_jspx_th_aui_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_1);
          _jspx_th_aui_input_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_1);
        _jspx_th_aui_input_1.release();
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        //  liferay-ddm:template-renderer
        com.liferay.dynamic.data.mapping.taglib.servlet.taglib.TemplateRendererTag _jspx_th_liferay$1ddm_template$1renderer_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.dynamic.data.mapping.taglib.servlet.taglib.TemplateRendererTag.class) : new com.liferay.dynamic.data.mapping.taglib.servlet.taglib.TemplateRendererTag();
        _jspx_th_liferay$1ddm_template$1renderer_0.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ddm_template$1renderer_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_liferay$1ddm_template$1renderer_0.setClassName( CPOptionsSearchFacetDisplayContext.class.getName() );
        _jspx_th_liferay$1ddm_template$1renderer_0.setContextObjects(
									HashMapBuilder.<String, Object>put(
										"companyId", companyId
									).put(
										"cpOptionsSearchFacetDisplayContext", cpOptionsSearchFacetDisplayContext
									).put(
										"fieldName", facet.getFieldName()
									).put(
										"name", liferayPortletResponse.getNamespace() + "term_" + facet.getFieldName()
									).put(
										"namespace", liferayPortletResponse.getNamespace()
									).put(
										"showFrequencies", GetterUtil.getBoolean(portletPreferences.getValue("frequenciesVisible", null), true)
									).put(
										"title", HtmlUtil.escape(cpOptionsSearchFacetDisplayContext.getCPOptionName(companyId, facet.getFieldId()))
									).build()
								);
        _jspx_th_liferay$1ddm_template$1renderer_0.setDisplayStyle( portletPreferences.getValue("displayStyle", "") );
        _jspx_th_liferay$1ddm_template$1renderer_0.setDisplayStyleGroupId( cpOptionsSearchFacetDisplayContext.getDisplayStyleGroupId() );
        _jspx_th_liferay$1ddm_template$1renderer_0.setEntries( cpOptionsSearchFacetDisplayContext.getTermDisplayContexts() );
        int _jspx_eval_liferay$1ddm_template$1renderer_0 = _jspx_th_liferay$1ddm_template$1renderer_0.doStartTag();
        if (_jspx_eval_liferay$1ddm_template$1renderer_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
          //  liferay-ui:panel-container
          com.liferay.taglib.ui.PanelContainerTag _jspx_th_liferay$1ui_panel$1container_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.PanelContainerTag.class) : new com.liferay.taglib.ui.PanelContainerTag();
          _jspx_th_liferay$1ui_panel$1container_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_panel$1container_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ddm_template$1renderer_0);
          _jspx_th_liferay$1ui_panel$1container_0.setExtended( true );
          _jspx_th_liferay$1ui_panel$1container_0.setId( liferayPortletResponse.getNamespace() + "facetCPOptionsPanelContainer" );
          _jspx_th_liferay$1ui_panel$1container_0.setMarkupView("lexicon");
          _jspx_th_liferay$1ui_panel$1container_0.setPersistState( true );
          int _jspx_eval_liferay$1ui_panel$1container_0 = _jspx_th_liferay$1ui_panel$1container_0.doStartTag();
          if (_jspx_eval_liferay$1ui_panel$1container_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_liferay$1ui_panel$1container_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_liferay$1ui_panel$1container_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_liferay$1ui_panel$1container_0.doInitBody();
            }
            do {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  liferay-ui:panel
              com.liferay.taglib.ui.PanelTag _jspx_th_liferay$1ui_panel_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.PanelTag.class) : new com.liferay.taglib.ui.PanelTag();
              _jspx_th_liferay$1ui_panel_0.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_panel_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_panel$1container_0);
              _jspx_th_liferay$1ui_panel_0.setCollapsible( true );
              _jspx_th_liferay$1ui_panel_0.setCssClass("search-facet");
              _jspx_th_liferay$1ui_panel_0.setId( liferayPortletResponse.getNamespace() + "facetCPOptionsPanel" );
              _jspx_th_liferay$1ui_panel_0.setMarkupView("lexicon");
              _jspx_th_liferay$1ui_panel_0.setPersistState( true );
              _jspx_th_liferay$1ui_panel_0.setTitle( HtmlUtil.escape(cpOptionsSearchFacetDisplayContext.getCPOptionName(companyId, facet.getFieldId())) );
              int _jspx_eval_liferay$1ui_panel_0 = _jspx_th_liferay$1ui_panel_0.doStartTag();
              if (_jspx_eval_liferay$1ui_panel_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t\t\t");
                //  aui:fieldset
                com.liferay.taglib.aui.FieldsetTag _jspx_th_aui_fieldset_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FieldsetTag.class) : new com.liferay.taglib.aui.FieldsetTag();
                _jspx_th_aui_fieldset_0.setPageContext(_jspx_page_context);
                _jspx_th_aui_fieldset_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_panel_0);
                int _jspx_eval_aui_fieldset_0 = _jspx_th_aui_fieldset_0.doStartTag();
                if (_jspx_eval_aui_fieldset_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t<ul class=\"list-unstyled\" data-qa-id=\"");
                  out.print( HtmlUtil.escape(cpOptionsSearchFacetDisplayContext.getCPOptionName(companyId, facet.getFieldId())) );
                  out.write("\">\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t");

								int i = 0;

								for (TermCollector termCollector : termCollectors) {
									i++;
								
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t<li class=\"facet-value\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t<div class=\"custom-checkbox custom-control\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"");
                  if (_jspx_meth_portlet_namespace_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_0, _jspx_page_context))
                    return;
                  out.write("term_");
                  out.print( facet.getFieldName() + i );
                  out.write("\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t<input\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"custom-control-input facet-term\"\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\tdata-term-id=\"");
                  out.print( HtmlUtil.escapeAttribute(termCollector.getTerm()) );
                  out.write("\"\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\tid=\"");
                  if (_jspx_meth_portlet_namespace_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_0, _jspx_page_context))
                    return;
                  out.write("term_");
                  out.print( facet.getFieldName() + i );
                  out.write("\"\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\tname=\"");
                  if (_jspx_meth_portlet_namespace_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_0, _jspx_page_context))
                    return;
                  out.write("term_");
                  out.print( facet.getFieldName() + i );
                  out.write("\"\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\tonChange=\"Liferay.Search.FacetUtil.changeSelection(event);\"\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\ttype=\"checkbox\"\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                  out.print( cpOptionsSearchFacetDisplayContext.isCPOptionValueSelected(companyId, facet.getFieldName(), termCollector.getTerm()) ? "checked" : "" );
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t/>\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"custom-control-label term-name ");
                  out.print( cpOptionsSearchFacetDisplayContext.isCPOptionValueSelected(companyId, facet.getFieldName(), termCollector.getTerm()) ? "facet-term-selected" : "facet-term-unselected" );
                  out.write("\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"custom-control-label-text\">");
                  out.print( HtmlUtil.escape(termCollector.getTerm()) );
                  out.write("</span>\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t</span>\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t");
if (
 GetterUtil.getBoolean(portletPreferences.getValue("frequenciesVisible", null), true) ) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t<small class=\"term-count\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t(");
                  out.print( termCollector.getFrequency() );
                  out.write(")\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t</small>\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t");
}
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t</label>\n");
                  out.write("\t\t\t\t\t\t\t\t\t</div>\n");
                  out.write("\t\t\t\t\t\t\t\t</li>\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t");

								}
								
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t");
                }
                if (_jspx_th_aui_fieldset_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset_0);
                  _jspx_th_aui_fieldset_0.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset_0);
                _jspx_th_aui_fieldset_0.release();
                out.write("\n");
                out.write("\t\t\t\t\t\t\t");
              }
              if (_jspx_th_liferay$1ui_panel_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_panel_0);
                _jspx_th_liferay$1ui_panel_0.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_panel_0);
              _jspx_th_liferay$1ui_panel_0.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              int evalDoAfterBody = _jspx_th_liferay$1ui_panel$1container_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_liferay$1ui_panel$1container_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_liferay$1ui_panel$1container_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_panel$1container_0);
            _jspx_th_liferay$1ui_panel$1container_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_panel$1container_0);
          _jspx_th_liferay$1ui_panel$1container_0.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
        }
        if (_jspx_th_liferay$1ddm_template$1renderer_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ddm_template$1renderer_0);
          _jspx_th_liferay$1ddm_template$1renderer_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ddm_template$1renderer_0);
        _jspx_th_liferay$1ddm_template$1renderer_0.release();
        out.write("\n");
        out.write("\t\t\t\t\t\t");
      }
      if (_jspx_th_aui_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_form_0);
        _jspx_th_aui_form_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_form_0);
      _jspx_th_aui_form_0.release();
      out.write("\n");
      out.write("\t\t\t\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");

				}
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t");
}
else {
      out.write("\n");
      out.write("\t\t\t\t<div class=\"alert alert-info\">\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_liferay$1ui_message_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t");
}
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

  private boolean _jspx_meth_portlet_namespace_0(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_0.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
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

  private boolean _jspx_meth_portlet_namespace_1(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_1.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
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

  private boolean _jspx_meth_portlet_namespace_2(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_2.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
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

  private boolean _jspx_meth_liferay$1ui_message_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent(null);
    _jspx_th_liferay$1ui_message_1.setKey("no-facets-were-found");
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
}
