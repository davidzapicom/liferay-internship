package org.apache.jsp.category.facet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.search.web.internal.category.facet.configuration.CategoryFacetPortletInstanceConfiguration;
import com.liferay.portal.search.web.internal.facet.display.context.AssetCategoriesSearchFacetDisplayContext;
import com.liferay.portal.search.web.internal.facet.display.context.AssetCategoriesSearchFacetTermDisplayContext;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/META-INF/c.tld");
    _jspx_dependants.add("/META-INF/liferay-portlet_2_0.tld");
    _jspx_dependants.add("/META-INF/resources/liferay-ddm.tld");
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

AssetCategoriesSearchFacetDisplayContext assetCategoriesSearchFacetDisplayContext = (AssetCategoriesSearchFacetDisplayContext)java.util.Objects.requireNonNull(request.getAttribute(WebKeys.PORTLET_DISPLAY_CONTEXT));

if (assetCategoriesSearchFacetDisplayContext.isRenderNothing()) {
	return;
}

CategoryFacetPortletInstanceConfiguration categoryFacetPortletInstanceConfiguration = assetCategoriesSearchFacetDisplayContext.getCategoryFacetPortletInstanceConfiguration();

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('	');
if (
 assetCategoriesSearchFacetDisplayContext.isRenderNothing() ) {
      out.write("\n");
      out.write("\t\t");
      //  aui:input
      com.liferay.taglib.aui.InputTag _jspx_th_aui_input_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
      _jspx_th_aui_input_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_input_0.setParent(null);
      _jspx_th_aui_input_0.setDynamicAttribute(null, "autocomplete", new String("off"));
      _jspx_th_aui_input_0.setName( HtmlUtil.escapeAttribute(assetCategoriesSearchFacetDisplayContext.getParameterName()) );
      _jspx_th_aui_input_0.setType("hidden");
      _jspx_th_aui_input_0.setValue( assetCategoriesSearchFacetDisplayContext.getParameterValue() );
      int _jspx_eval_aui_input_0 = _jspx_th_aui_input_0.doStartTag();
      if (_jspx_th_aui_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_0);
        _jspx_th_aui_input_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_0);
      _jspx_th_aui_input_0.release();
      out.write('\n');
      out.write('	');
      out.write('\n');
      out.write('	');
}
else {
      out.write("\n");
      out.write("\t\t");
      //  aui:form
      com.liferay.taglib.aui.FormTag _jspx_th_aui_form_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FormTag.class) : new com.liferay.taglib.aui.FormTag();
      _jspx_th_aui_form_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_form_0.setParent(null);
      _jspx_th_aui_form_0.setAction("#");
      _jspx_th_aui_form_0.setMethod("post");
      _jspx_th_aui_form_0.setName("fm");
      int _jspx_eval_aui_form_0 = _jspx_th_aui_form_0.doStartTag();
      if (_jspx_eval_aui_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_1.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_1.setDynamicAttribute(null, "autocomplete", new String("off"));
        _jspx_th_aui_input_1.setName( HtmlUtil.escapeAttribute(assetCategoriesSearchFacetDisplayContext.getParameterName()) );
        _jspx_th_aui_input_1.setType("hidden");
        _jspx_th_aui_input_1.setValue( assetCategoriesSearchFacetDisplayContext.getParameterValue() );
        int _jspx_eval_aui_input_1 = _jspx_th_aui_input_1.doStartTag();
        if (_jspx_th_aui_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_1);
          _jspx_th_aui_input_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_1);
        _jspx_th_aui_input_1.release();
        out.write("\n");
        out.write("\t\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_2.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_2.setCssClass("facet-parameter-name");
        _jspx_th_aui_input_2.setName("facet-parameter-name");
        _jspx_th_aui_input_2.setType("hidden");
        _jspx_th_aui_input_2.setValue( assetCategoriesSearchFacetDisplayContext.getParameterName() );
        int _jspx_eval_aui_input_2 = _jspx_th_aui_input_2.doStartTag();
        if (_jspx_th_aui_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_2);
          _jspx_th_aui_input_2.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_2);
        _jspx_th_aui_input_2.release();
        out.write("\n");
        out.write("\t\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_3.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_3.setCssClass("start-parameter-name");
        _jspx_th_aui_input_3.setName("start-parameter-name");
        _jspx_th_aui_input_3.setType("hidden");
        _jspx_th_aui_input_3.setValue( assetCategoriesSearchFacetDisplayContext.getPaginationStartParameterName() );
        int _jspx_eval_aui_input_3 = _jspx_th_aui_input_3.doStartTag();
        if (_jspx_th_aui_input_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_3);
          _jspx_th_aui_input_3.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_3);
        _jspx_th_aui_input_3.release();
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t");
        //  liferay-ddm:template-renderer
        com.liferay.dynamic.data.mapping.taglib.servlet.taglib.TemplateRendererTag _jspx_th_liferay$1ddm_template$1renderer_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.dynamic.data.mapping.taglib.servlet.taglib.TemplateRendererTag.class) : new com.liferay.dynamic.data.mapping.taglib.servlet.taglib.TemplateRendererTag();
        _jspx_th_liferay$1ddm_template$1renderer_0.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ddm_template$1renderer_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_liferay$1ddm_template$1renderer_0.setClassName( AssetCategoriesSearchFacetTermDisplayContext.class.getName() );
        _jspx_th_liferay$1ddm_template$1renderer_0.setContextObjects(
					HashMapBuilder.<String, Object>put(
						"assetCategoriesSearchFacetDisplayContext", assetCategoriesSearchFacetDisplayContext
					).put(
						"namespace", liferayPortletResponse.getNamespace()
					).build()
				);
        _jspx_th_liferay$1ddm_template$1renderer_0.setDisplayStyle( categoryFacetPortletInstanceConfiguration.displayStyle() );
        _jspx_th_liferay$1ddm_template$1renderer_0.setDisplayStyleGroupId( assetCategoriesSearchFacetDisplayContext.getDisplayStyleGroupId() );
        _jspx_th_liferay$1ddm_template$1renderer_0.setEntries( assetCategoriesSearchFacetDisplayContext.getTermDisplayContexts() );
        int _jspx_eval_liferay$1ddm_template$1renderer_0 = _jspx_th_liferay$1ddm_template$1renderer_0.doStartTag();
        if (_jspx_eval_liferay$1ddm_template$1renderer_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t\t");
          //  liferay-ui:panel-container
          com.liferay.taglib.ui.PanelContainerTag _jspx_th_liferay$1ui_panel$1container_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.PanelContainerTag.class) : new com.liferay.taglib.ui.PanelContainerTag();
          _jspx_th_liferay$1ui_panel$1container_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_panel$1container_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ddm_template$1renderer_0);
          _jspx_th_liferay$1ui_panel$1container_0.setExtended( true );
          _jspx_th_liferay$1ui_panel$1container_0.setId( liferayPortletResponse.getNamespace() + "facetAssetCategoriesPanelContainer" );
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
              out.write("\t\t\t\t\t");
              //  liferay-ui:panel
              com.liferay.taglib.ui.PanelTag _jspx_th_liferay$1ui_panel_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.PanelTag.class) : new com.liferay.taglib.ui.PanelTag();
              _jspx_th_liferay$1ui_panel_0.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_panel_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_panel$1container_0);
              _jspx_th_liferay$1ui_panel_0.setCollapsible( true );
              _jspx_th_liferay$1ui_panel_0.setCssClass("search-facet");
              _jspx_th_liferay$1ui_panel_0.setId( liferayPortletResponse.getNamespace() + "facetAssetCategoriesPanel" );
              _jspx_th_liferay$1ui_panel_0.setMarkupView("lexicon");
              _jspx_th_liferay$1ui_panel_0.setPersistState( true );
              _jspx_th_liferay$1ui_panel_0.setTitle("category");
              int _jspx_eval_liferay$1ui_panel_0 = _jspx_th_liferay$1ui_panel_0.doStartTag();
              if (_jspx_eval_liferay$1ui_panel_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                out.write("\n");
                out.write("\t\t\t\t\t\t");
                //  aui:fieldset
                com.liferay.taglib.aui.FieldsetTag _jspx_th_aui_fieldset_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FieldsetTag.class) : new com.liferay.taglib.aui.FieldsetTag();
                _jspx_th_aui_fieldset_0.setPageContext(_jspx_page_context);
                _jspx_th_aui_fieldset_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_panel_0);
                int _jspx_eval_aui_fieldset_0 = _jspx_th_aui_fieldset_0.doStartTag();
                if (_jspx_eval_aui_fieldset_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t<ul class=\"list-unstyled\">\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t");

								int i = 0;

								for (AssetCategoriesSearchFacetTermDisplayContext assetCategoriesSearchFacetTermDisplayContext : assetCategoriesSearchFacetDisplayContext.getTermDisplayContexts()) {
									i++;
								
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t<li class=\"facet-value\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"custom-checkbox custom-control\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t<label class=\"facet-checkbox-label\" for=\"");
                  if (_jspx_meth_portlet_namespace_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_0, _jspx_page_context))
                    return;
                  out.write("term_");
                  out.print( i );
                  out.write("\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  out.print( assetCategoriesSearchFacetTermDisplayContext.isSelected() ? "checked" : StringPool.BLANK );
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"custom-control-input facet-term\"\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdata-term-id=\"");
                  out.print( assetCategoriesSearchFacetTermDisplayContext.getAssetCategoryId() );
                  out.write("\"\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdisabled\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"");
                  if (_jspx_meth_portlet_namespace_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_0, _jspx_page_context))
                    return;
                  out.write("term_");
                  out.print( i );
                  out.write("\"\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"");
                  if (_jspx_meth_portlet_namespace_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_0, _jspx_page_context))
                    return;
                  out.write("term_");
                  out.print( i );
                  out.write("\"\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tonChange=\"Liferay.Search.FacetUtil.changeSelection(event);\"\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\ttype=\"checkbox\"\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t/>\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"custom-control-label term-name ");
                  out.print( assetCategoriesSearchFacetTermDisplayContext.isSelected() ? "facet-term-selected" : "facet-term-unselected" );
                  out.write("\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"custom-control-label-text\">");
                  out.print( HtmlUtil.escape(assetCategoriesSearchFacetTermDisplayContext.getDisplayName()) );
                  out.write("</span>\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t</span>\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
if (
 assetCategoriesSearchFacetTermDisplayContext.isFrequencyVisible() ) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<small class=\"term-count\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t(");
                  out.print( assetCategoriesSearchFacetTermDisplayContext.getFrequency() );
                  out.write(")\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</small>\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
}
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t</label>\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
                  out.write("\t\t\t\t\t\t\t\t\t</li>\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t");

								}
								
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t</ul>\n");
                  out.write("\t\t\t\t\t\t");
                }
                if (_jspx_th_aui_fieldset_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset_0);
                  _jspx_th_aui_fieldset_0.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset_0);
                _jspx_th_aui_fieldset_0.release();
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t\t");
if (
 !assetCategoriesSearchFacetDisplayContext.isNothingSelected() ) {
                out.write("\n");
                out.write("\t\t\t\t\t\t\t");
                if (_jspx_meth_aui_button_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_panel_0, _jspx_page_context))
                  return;
                out.write("\n");
                out.write("\t\t\t\t\t\t");
}
                out.write("\n");
                out.write("\t\t\t\t\t");
              }
              if (_jspx_th_liferay$1ui_panel_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_panel_0);
                _jspx_th_liferay$1ui_panel_0.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_panel_0);
              _jspx_th_liferay$1ui_panel_0.release();
              out.write("\n");
              out.write("\t\t\t\t");
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
          out.write("\t\t\t");
        }
        if (_jspx_th_liferay$1ddm_template$1renderer_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ddm_template$1renderer_0);
          _jspx_th_liferay$1ddm_template$1renderer_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ddm_template$1renderer_0);
        _jspx_th_liferay$1ddm_template$1renderer_0.release();
        out.write("\n");
        out.write("\t\t");
      }
      if (_jspx_th_aui_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_form_0);
        _jspx_th_aui_form_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_form_0);
      _jspx_th_aui_form_0.release();
      out.write('\n');
      out.write('	');
      out.write('\n');
}
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_aui_script_0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_aui_button_0(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_panel_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:button
    com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
    _jspx_th_aui_button_0.setPageContext(_jspx_page_context);
    _jspx_th_aui_button_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_panel_0);
    _jspx_th_aui_button_0.setCssClass("btn-link btn-unstyled facet-clear-btn");
    _jspx_th_aui_button_0.setOnClick("Liferay.Search.FacetUtil.clearSelections(event);");
    _jspx_th_aui_button_0.setValue("clear");
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

  private boolean _jspx_meth_aui_script_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:script
    com.liferay.taglib.aui.ScriptTag _jspx_th_aui_script_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ScriptTag.class) : new com.liferay.taglib.aui.ScriptTag();
    _jspx_th_aui_script_0.setPageContext(_jspx_page_context);
    _jspx_th_aui_script_0.setParent(null);
    _jspx_th_aui_script_0.setUse("liferay-search-facet-util");
    int _jspx_eval_aui_script_0 = _jspx_th_aui_script_0.doStartTag();
    if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_aui_script_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_aui_script_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\tLiferay.Search.FacetUtil.enableInputs(\n");
        out.write("\t\tdocument.querySelectorAll('#");
        if (_jspx_meth_portlet_namespace_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
          return true;
        out.write("fm .facet-term')\n");
        out.write("\t);\n");
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
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_script_0);
    _jspx_th_aui_script_0.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_3(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_3.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
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
}
