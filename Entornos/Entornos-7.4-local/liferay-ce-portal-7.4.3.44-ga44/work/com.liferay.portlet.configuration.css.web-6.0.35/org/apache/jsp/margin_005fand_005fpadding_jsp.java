package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.model.PortletDecorator;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portlet.configuration.css.web.internal.constants.PortletConfigurationCSSConstants;
import com.liferay.portlet.configuration.css.web.internal.display.context.PortletConfigurationCSSPortletDisplayContext;
import java.text.DecimalFormat;
import java.util.Objects;

public final class margin_005fand_005fpadding_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/init-ext.jsp");
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

PortletConfigurationCSSPortletDisplayContext portletConfigurationCSSPortletDisplayContext = new PortletConfigurationCSSPortletDisplayContext(renderRequest);

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      //  clay:row
      com.liferay.frontend.taglib.clay.servlet.taglib.RowTag _jspx_th_clay_row_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.RowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.RowTag();
      _jspx_th_clay_row_0.setPageContext(_jspx_page_context);
      _jspx_th_clay_row_0.setParent(null);
      int _jspx_eval_clay_row_0 = _jspx_th_clay_row_0.doStartTag();
      if (_jspx_eval_clay_row_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write('\n');
        out.write('	');
        //  clay:col
        com.liferay.frontend.taglib.clay.servlet.taglib.ColTag _jspx_th_clay_col_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ColTag();
        _jspx_th_clay_col_0.setPageContext(_jspx_page_context);
        _jspx_th_clay_col_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_row_0);
        _jspx_th_clay_col_0.setCssClass("lfr-padding use-for-all-column");
        _jspx_th_clay_col_0.setMd("6");
        int _jspx_eval_clay_col_0 = _jspx_th_clay_col_0.doStartTag();
        if (_jspx_eval_clay_col_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t");
          //  aui:fieldset
          com.liferay.taglib.aui.FieldsetTag _jspx_th_aui_fieldset_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FieldsetTag.class) : new com.liferay.taglib.aui.FieldsetTag();
          _jspx_th_aui_fieldset_0.setPageContext(_jspx_page_context);
          _jspx_th_aui_fieldset_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
          _jspx_th_aui_fieldset_0.setLabel("padding");
          int _jspx_eval_aui_fieldset_0 = _jspx_th_aui_fieldset_0.doStartTag();
          if (_jspx_eval_aui_fieldset_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
            _jspx_th_aui_input_0.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
            _jspx_th_aui_input_0.setChecked( portletConfigurationCSSPortletDisplayContext.isSpacingSameForAll("padding") );
            _jspx_th_aui_input_0.setDynamicAttribute(null, "data-inputselector", new String(".same-padding"));
            _jspx_th_aui_input_0.setInlineLabel("right");
            _jspx_th_aui_input_0.setLabel("same-for-all");
            _jspx_th_aui_input_0.setLabelCssClass("simple-toggle-switch");
            _jspx_th_aui_input_0.setName("useForAllPadding");
            _jspx_th_aui_input_0.setType("toggle-switch");
            int _jspx_eval_aui_input_0 = _jspx_th_aui_input_0.doStartTag();
            if (_jspx_th_aui_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_0);
              _jspx_th_aui_input_0.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_0);
            _jspx_th_aui_input_0.release();
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t<span class=\"align-items-end d-flex\">\n");
            out.write("\t\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
            _jspx_th_aui_input_1.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
            _jspx_th_aui_input_1.setInlineField( true );
            _jspx_th_aui_input_1.setLabel("top");
            _jspx_th_aui_input_1.setName("paddingTop");
            _jspx_th_aui_input_1.setValue( portletConfigurationCSSPortletDisplayContext.getPaddingProperty("top", "value") );
            _jspx_th_aui_input_1.setWrapperCssClass("pr-2");
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
            out.write("\t\t\t\t");
            //  aui:select
            com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.SelectTag.class) : new com.liferay.taglib.aui.SelectTag();
            _jspx_th_aui_select_0.setPageContext(_jspx_page_context);
            _jspx_th_aui_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
            _jspx_th_aui_select_0.setInlineField( true );
            _jspx_th_aui_select_0.setLabel("");
            _jspx_th_aui_select_0.setName("paddingTopUnit");
            _jspx_th_aui_select_0.setTitle("top-padding-unit");
            int _jspx_eval_aui_select_0 = _jspx_th_aui_select_0.doStartTag();
            if (_jspx_eval_aui_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              if (_jspx_eval_aui_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                out = _jspx_page_context.pushBody();
                _jspx_th_aui_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                _jspx_th_aui_select_0.doInitBody();
              }
              do {
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  aui:option
                com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                _jspx_th_aui_option_0.setPageContext(_jspx_page_context);
                _jspx_th_aui_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
                _jspx_th_aui_option_0.setLabel(new String("%"));
                _jspx_th_aui_option_0.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getPaddingProperty("top", "unit"), "%") );
                int _jspx_eval_aui_option_0 = _jspx_th_aui_option_0.doStartTag();
                if (_jspx_th_aui_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_0);
                  _jspx_th_aui_option_0.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_0);
                _jspx_th_aui_option_0.release();
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  aui:option
                com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                _jspx_th_aui_option_1.setPageContext(_jspx_page_context);
                _jspx_th_aui_option_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
                _jspx_th_aui_option_1.setLabel(new String("px"));
                _jspx_th_aui_option_1.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getPaddingProperty("top", "unit"), "px") );
                int _jspx_eval_aui_option_1 = _jspx_th_aui_option_1.doStartTag();
                if (_jspx_th_aui_option_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_1);
                  _jspx_th_aui_option_1.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_1);
                _jspx_th_aui_option_1.release();
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  aui:option
                com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                _jspx_th_aui_option_2.setPageContext(_jspx_page_context);
                _jspx_th_aui_option_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
                _jspx_th_aui_option_2.setLabel(new String("em"));
                _jspx_th_aui_option_2.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getPaddingProperty("top", "unit"), "em") );
                int _jspx_eval_aui_option_2 = _jspx_th_aui_option_2.doStartTag();
                if (_jspx_th_aui_option_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_2);
                  _jspx_th_aui_option_2.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_2);
                _jspx_th_aui_option_2.release();
                out.write("\n");
                out.write("\t\t\t\t");
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
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_select_0);
            _jspx_th_aui_select_0.release();
            out.write("\n");
            out.write("\t\t\t</span>\n");
            out.write("\t\t\t<span class=\"align-items-end d-flex\">\n");
            out.write("\t\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
            _jspx_th_aui_input_2.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
            _jspx_th_aui_input_2.setCssClass("same-padding");
            _jspx_th_aui_input_2.setDisabled( portletConfigurationCSSPortletDisplayContext.isSpacingSameForAll("padding") );
            _jspx_th_aui_input_2.setInlineField( true );
            _jspx_th_aui_input_2.setLabel("right");
            _jspx_th_aui_input_2.setName("paddingRight");
            _jspx_th_aui_input_2.setValue( portletConfigurationCSSPortletDisplayContext.getPaddingProperty("right", "value") );
            _jspx_th_aui_input_2.setWrapperCssClass("pr-2");
            int _jspx_eval_aui_input_2 = _jspx_th_aui_input_2.doStartTag();
            if (_jspx_th_aui_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_2);
              _jspx_th_aui_input_2.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_2);
            _jspx_th_aui_input_2.release();
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t");
            //  aui:select
            com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.SelectTag.class) : new com.liferay.taglib.aui.SelectTag();
            _jspx_th_aui_select_1.setPageContext(_jspx_page_context);
            _jspx_th_aui_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
            _jspx_th_aui_select_1.setCssClass("same-padding");
            _jspx_th_aui_select_1.setDisabled( portletConfigurationCSSPortletDisplayContext.isSpacingSameForAll("padding") );
            _jspx_th_aui_select_1.setInlineField( true );
            _jspx_th_aui_select_1.setLabel("");
            _jspx_th_aui_select_1.setName("paddingRightUnit");
            _jspx_th_aui_select_1.setTitle("right-padding-unit");
            int _jspx_eval_aui_select_1 = _jspx_th_aui_select_1.doStartTag();
            if (_jspx_eval_aui_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              if (_jspx_eval_aui_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                out = _jspx_page_context.pushBody();
                _jspx_th_aui_select_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                _jspx_th_aui_select_1.doInitBody();
              }
              do {
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  aui:option
                com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                _jspx_th_aui_option_3.setPageContext(_jspx_page_context);
                _jspx_th_aui_option_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_1);
                _jspx_th_aui_option_3.setLabel(new String("%"));
                _jspx_th_aui_option_3.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getPaddingProperty("right", "unit"), "%") );
                int _jspx_eval_aui_option_3 = _jspx_th_aui_option_3.doStartTag();
                if (_jspx_th_aui_option_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_3);
                  _jspx_th_aui_option_3.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_3);
                _jspx_th_aui_option_3.release();
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  aui:option
                com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                _jspx_th_aui_option_4.setPageContext(_jspx_page_context);
                _jspx_th_aui_option_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_1);
                _jspx_th_aui_option_4.setLabel(new String("px"));
                _jspx_th_aui_option_4.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getPaddingProperty("right", "unit"), "px") );
                int _jspx_eval_aui_option_4 = _jspx_th_aui_option_4.doStartTag();
                if (_jspx_th_aui_option_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_4);
                  _jspx_th_aui_option_4.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_4);
                _jspx_th_aui_option_4.release();
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  aui:option
                com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                _jspx_th_aui_option_5.setPageContext(_jspx_page_context);
                _jspx_th_aui_option_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_1);
                _jspx_th_aui_option_5.setLabel(new String("em"));
                _jspx_th_aui_option_5.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getPaddingProperty("right", "unit"), "em") );
                int _jspx_eval_aui_option_5 = _jspx_th_aui_option_5.doStartTag();
                if (_jspx_th_aui_option_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_5);
                  _jspx_th_aui_option_5.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_5);
                _jspx_th_aui_option_5.release();
                out.write("\n");
                out.write("\t\t\t\t");
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
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_select_1);
            _jspx_th_aui_select_1.release();
            out.write("\n");
            out.write("\t\t\t</span>\n");
            out.write("\t\t\t<span class=\"align-items-end d-flex\">\n");
            out.write("\t\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
            _jspx_th_aui_input_3.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
            _jspx_th_aui_input_3.setCssClass("same-padding");
            _jspx_th_aui_input_3.setDisabled( portletConfigurationCSSPortletDisplayContext.isSpacingSameForAll("padding") );
            _jspx_th_aui_input_3.setInlineField( true );
            _jspx_th_aui_input_3.setLabel("bottom");
            _jspx_th_aui_input_3.setName("paddingBottom");
            _jspx_th_aui_input_3.setValue( portletConfigurationCSSPortletDisplayContext.getPaddingProperty("bottom", "value") );
            _jspx_th_aui_input_3.setWrapperCssClass("pr-2");
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
            out.write("\t\t\t\t");
            //  aui:select
            com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.SelectTag.class) : new com.liferay.taglib.aui.SelectTag();
            _jspx_th_aui_select_2.setPageContext(_jspx_page_context);
            _jspx_th_aui_select_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
            _jspx_th_aui_select_2.setCssClass("same-padding");
            _jspx_th_aui_select_2.setDisabled( portletConfigurationCSSPortletDisplayContext.isSpacingSameForAll("padding") );
            _jspx_th_aui_select_2.setInlineField( true );
            _jspx_th_aui_select_2.setLabel("");
            _jspx_th_aui_select_2.setName("paddingBottomUnit");
            _jspx_th_aui_select_2.setTitle("bottom-padding-unit");
            int _jspx_eval_aui_select_2 = _jspx_th_aui_select_2.doStartTag();
            if (_jspx_eval_aui_select_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              if (_jspx_eval_aui_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                out = _jspx_page_context.pushBody();
                _jspx_th_aui_select_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                _jspx_th_aui_select_2.doInitBody();
              }
              do {
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  aui:option
                com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                _jspx_th_aui_option_6.setPageContext(_jspx_page_context);
                _jspx_th_aui_option_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_2);
                _jspx_th_aui_option_6.setLabel(new String("%"));
                _jspx_th_aui_option_6.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getPaddingProperty("bottom", "unit"), "%") );
                int _jspx_eval_aui_option_6 = _jspx_th_aui_option_6.doStartTag();
                if (_jspx_th_aui_option_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_6);
                  _jspx_th_aui_option_6.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_6);
                _jspx_th_aui_option_6.release();
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  aui:option
                com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                _jspx_th_aui_option_7.setPageContext(_jspx_page_context);
                _jspx_th_aui_option_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_2);
                _jspx_th_aui_option_7.setLabel(new String("px"));
                _jspx_th_aui_option_7.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getPaddingProperty("bottom", "unit"), "px") );
                int _jspx_eval_aui_option_7 = _jspx_th_aui_option_7.doStartTag();
                if (_jspx_th_aui_option_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_7);
                  _jspx_th_aui_option_7.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_7);
                _jspx_th_aui_option_7.release();
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  aui:option
                com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                _jspx_th_aui_option_8.setPageContext(_jspx_page_context);
                _jspx_th_aui_option_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_2);
                _jspx_th_aui_option_8.setLabel(new String("em"));
                _jspx_th_aui_option_8.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getPaddingProperty("bottom", "unit"), "em") );
                int _jspx_eval_aui_option_8 = _jspx_th_aui_option_8.doStartTag();
                if (_jspx_th_aui_option_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_8);
                  _jspx_th_aui_option_8.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_8);
                _jspx_th_aui_option_8.release();
                out.write("\n");
                out.write("\t\t\t\t");
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
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_select_2);
            _jspx_th_aui_select_2.release();
            out.write("\n");
            out.write("\t\t\t</span>\n");
            out.write("\t\t\t<span class=\"align-items-end d-flex\">\n");
            out.write("\t\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
            _jspx_th_aui_input_4.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
            _jspx_th_aui_input_4.setCssClass("same-padding");
            _jspx_th_aui_input_4.setDisabled( portletConfigurationCSSPortletDisplayContext.isSpacingSameForAll("padding") );
            _jspx_th_aui_input_4.setInlineField( true );
            _jspx_th_aui_input_4.setLabel("left");
            _jspx_th_aui_input_4.setName("paddingLeft");
            _jspx_th_aui_input_4.setValue( portletConfigurationCSSPortletDisplayContext.getPaddingProperty("left", "value") );
            _jspx_th_aui_input_4.setWrapperCssClass("pr-2");
            int _jspx_eval_aui_input_4 = _jspx_th_aui_input_4.doStartTag();
            if (_jspx_th_aui_input_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_4);
              _jspx_th_aui_input_4.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_4);
            _jspx_th_aui_input_4.release();
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t");
            //  aui:select
            com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.SelectTag.class) : new com.liferay.taglib.aui.SelectTag();
            _jspx_th_aui_select_3.setPageContext(_jspx_page_context);
            _jspx_th_aui_select_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
            _jspx_th_aui_select_3.setCssClass("same-padding");
            _jspx_th_aui_select_3.setDisabled( portletConfigurationCSSPortletDisplayContext.isSpacingSameForAll("padding") );
            _jspx_th_aui_select_3.setInlineField( true );
            _jspx_th_aui_select_3.setLabel("");
            _jspx_th_aui_select_3.setName("paddingLeftUnit");
            _jspx_th_aui_select_3.setTitle("left-padding-unit");
            int _jspx_eval_aui_select_3 = _jspx_th_aui_select_3.doStartTag();
            if (_jspx_eval_aui_select_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              if (_jspx_eval_aui_select_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                out = _jspx_page_context.pushBody();
                _jspx_th_aui_select_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                _jspx_th_aui_select_3.doInitBody();
              }
              do {
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  aui:option
                com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                _jspx_th_aui_option_9.setPageContext(_jspx_page_context);
                _jspx_th_aui_option_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_3);
                _jspx_th_aui_option_9.setLabel(new String("%"));
                _jspx_th_aui_option_9.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getPaddingProperty("left", "unit"), "%") );
                int _jspx_eval_aui_option_9 = _jspx_th_aui_option_9.doStartTag();
                if (_jspx_th_aui_option_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_9);
                  _jspx_th_aui_option_9.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_9);
                _jspx_th_aui_option_9.release();
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  aui:option
                com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                _jspx_th_aui_option_10.setPageContext(_jspx_page_context);
                _jspx_th_aui_option_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_3);
                _jspx_th_aui_option_10.setLabel(new String("px"));
                _jspx_th_aui_option_10.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getPaddingProperty("left", "unit"), "px") );
                int _jspx_eval_aui_option_10 = _jspx_th_aui_option_10.doStartTag();
                if (_jspx_th_aui_option_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_10);
                  _jspx_th_aui_option_10.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_10);
                _jspx_th_aui_option_10.release();
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  aui:option
                com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                _jspx_th_aui_option_11.setPageContext(_jspx_page_context);
                _jspx_th_aui_option_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_3);
                _jspx_th_aui_option_11.setLabel(new String("em"));
                _jspx_th_aui_option_11.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getPaddingProperty("left", "unit"), "em") );
                int _jspx_eval_aui_option_11 = _jspx_th_aui_option_11.doStartTag();
                if (_jspx_th_aui_option_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_11);
                  _jspx_th_aui_option_11.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_11);
                _jspx_th_aui_option_11.release();
                out.write("\n");
                out.write("\t\t\t\t");
                int evalDoAfterBody = _jspx_th_aui_select_3.doAfterBody();
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                  break;
              } while (true);
              if (_jspx_eval_aui_select_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                out = _jspx_page_context.popBody();
            }
            if (_jspx_th_aui_select_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_select_3);
              _jspx_th_aui_select_3.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_select_3);
            _jspx_th_aui_select_3.release();
            out.write("\n");
            out.write("\t\t\t</span>\n");
            out.write("\t\t");
          }
          if (_jspx_th_aui_fieldset_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset_0);
            _jspx_th_aui_fieldset_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset_0);
          _jspx_th_aui_fieldset_0.release();
          out.write('\n');
          out.write('	');
        }
        if (_jspx_th_clay_col_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_0);
          _jspx_th_clay_col_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_0);
        _jspx_th_clay_col_0.release();
        out.write("\n");
        out.write("\n");
        out.write("\t");
        //  clay:col
        com.liferay.frontend.taglib.clay.servlet.taglib.ColTag _jspx_th_clay_col_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ColTag();
        _jspx_th_clay_col_1.setPageContext(_jspx_page_context);
        _jspx_th_clay_col_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_row_0);
        _jspx_th_clay_col_1.setCssClass("lfr-margin use-for-all-column");
        _jspx_th_clay_col_1.setMd("6");
        int _jspx_eval_clay_col_1 = _jspx_th_clay_col_1.doStartTag();
        if (_jspx_eval_clay_col_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t");
          //  aui:fieldset
          com.liferay.taglib.aui.FieldsetTag _jspx_th_aui_fieldset_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FieldsetTag.class) : new com.liferay.taglib.aui.FieldsetTag();
          _jspx_th_aui_fieldset_1.setPageContext(_jspx_page_context);
          _jspx_th_aui_fieldset_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_1);
          _jspx_th_aui_fieldset_1.setLabel("margin");
          int _jspx_eval_aui_fieldset_1 = _jspx_th_aui_fieldset_1.doStartTag();
          if (_jspx_eval_aui_fieldset_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
            _jspx_th_aui_input_5.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_1);
            _jspx_th_aui_input_5.setChecked( portletConfigurationCSSPortletDisplayContext.isSpacingSameForAll("margin") );
            _jspx_th_aui_input_5.setDynamicAttribute(null, "data-inputselector", new String(".same-margin"));
            _jspx_th_aui_input_5.setInlineLabel("right");
            _jspx_th_aui_input_5.setLabel("same-for-all");
            _jspx_th_aui_input_5.setLabelCssClass("simple-toggle-switch");
            _jspx_th_aui_input_5.setName("useForAllMargin");
            _jspx_th_aui_input_5.setType("toggle-switch");
            int _jspx_eval_aui_input_5 = _jspx_th_aui_input_5.doStartTag();
            if (_jspx_th_aui_input_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_5);
              _jspx_th_aui_input_5.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_5);
            _jspx_th_aui_input_5.release();
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t<span class=\"align-items-end d-flex\">\n");
            out.write("\t\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
            _jspx_th_aui_input_6.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_1);
            _jspx_th_aui_input_6.setInlineField( true );
            _jspx_th_aui_input_6.setLabel("top");
            _jspx_th_aui_input_6.setName("marginTop");
            _jspx_th_aui_input_6.setValue( portletConfigurationCSSPortletDisplayContext.getMarginProperty("top", "value") );
            _jspx_th_aui_input_6.setWrapperCssClass("pr-2");
            int _jspx_eval_aui_input_6 = _jspx_th_aui_input_6.doStartTag();
            if (_jspx_th_aui_input_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_6);
              _jspx_th_aui_input_6.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_6);
            _jspx_th_aui_input_6.release();
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t");
            //  aui:select
            com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.SelectTag.class) : new com.liferay.taglib.aui.SelectTag();
            _jspx_th_aui_select_4.setPageContext(_jspx_page_context);
            _jspx_th_aui_select_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_1);
            _jspx_th_aui_select_4.setInlineField( true );
            _jspx_th_aui_select_4.setLabel("");
            _jspx_th_aui_select_4.setName("marginTopUnit");
            _jspx_th_aui_select_4.setTitle("top-margin-unit");
            int _jspx_eval_aui_select_4 = _jspx_th_aui_select_4.doStartTag();
            if (_jspx_eval_aui_select_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              if (_jspx_eval_aui_select_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                out = _jspx_page_context.pushBody();
                _jspx_th_aui_select_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                _jspx_th_aui_select_4.doInitBody();
              }
              do {
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  aui:option
                com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_12 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                _jspx_th_aui_option_12.setPageContext(_jspx_page_context);
                _jspx_th_aui_option_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_4);
                _jspx_th_aui_option_12.setLabel(new String("%"));
                _jspx_th_aui_option_12.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getMarginProperty("top", "unit"), "%") );
                int _jspx_eval_aui_option_12 = _jspx_th_aui_option_12.doStartTag();
                if (_jspx_th_aui_option_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_12);
                  _jspx_th_aui_option_12.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_12);
                _jspx_th_aui_option_12.release();
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  aui:option
                com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_13 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                _jspx_th_aui_option_13.setPageContext(_jspx_page_context);
                _jspx_th_aui_option_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_4);
                _jspx_th_aui_option_13.setLabel(new String("px"));
                _jspx_th_aui_option_13.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getMarginProperty("top", "unit"), "px") );
                int _jspx_eval_aui_option_13 = _jspx_th_aui_option_13.doStartTag();
                if (_jspx_th_aui_option_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_13);
                  _jspx_th_aui_option_13.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_13);
                _jspx_th_aui_option_13.release();
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  aui:option
                com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_14 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                _jspx_th_aui_option_14.setPageContext(_jspx_page_context);
                _jspx_th_aui_option_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_4);
                _jspx_th_aui_option_14.setLabel(new String("em"));
                _jspx_th_aui_option_14.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getMarginProperty("top", "unit"), "em") );
                int _jspx_eval_aui_option_14 = _jspx_th_aui_option_14.doStartTag();
                if (_jspx_th_aui_option_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_14);
                  _jspx_th_aui_option_14.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_14);
                _jspx_th_aui_option_14.release();
                out.write("\n");
                out.write("\t\t\t\t");
                int evalDoAfterBody = _jspx_th_aui_select_4.doAfterBody();
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                  break;
              } while (true);
              if (_jspx_eval_aui_select_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                out = _jspx_page_context.popBody();
            }
            if (_jspx_th_aui_select_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_select_4);
              _jspx_th_aui_select_4.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_select_4);
            _jspx_th_aui_select_4.release();
            out.write("\n");
            out.write("\t\t\t</span>\n");
            out.write("\t\t\t<span class=\"align-items-end d-flex\">\n");
            out.write("\t\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
            _jspx_th_aui_input_7.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_1);
            _jspx_th_aui_input_7.setCssClass("same-margin");
            _jspx_th_aui_input_7.setDisabled( portletConfigurationCSSPortletDisplayContext.isSpacingSameForAll("margin") );
            _jspx_th_aui_input_7.setInlineField( true );
            _jspx_th_aui_input_7.setLabel("right");
            _jspx_th_aui_input_7.setName("marginRight");
            _jspx_th_aui_input_7.setValue( portletConfigurationCSSPortletDisplayContext.getMarginProperty("right", "value") );
            _jspx_th_aui_input_7.setWrapperCssClass("pr-2");
            int _jspx_eval_aui_input_7 = _jspx_th_aui_input_7.doStartTag();
            if (_jspx_th_aui_input_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_7);
              _jspx_th_aui_input_7.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_7);
            _jspx_th_aui_input_7.release();
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t");
            //  aui:select
            com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.SelectTag.class) : new com.liferay.taglib.aui.SelectTag();
            _jspx_th_aui_select_5.setPageContext(_jspx_page_context);
            _jspx_th_aui_select_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_1);
            _jspx_th_aui_select_5.setCssClass("same-margin");
            _jspx_th_aui_select_5.setDisabled( portletConfigurationCSSPortletDisplayContext.isSpacingSameForAll("margin") );
            _jspx_th_aui_select_5.setInlineField( true );
            _jspx_th_aui_select_5.setLabel("");
            _jspx_th_aui_select_5.setName("marginRightUnit");
            _jspx_th_aui_select_5.setTitle("top-margin-unit");
            int _jspx_eval_aui_select_5 = _jspx_th_aui_select_5.doStartTag();
            if (_jspx_eval_aui_select_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              if (_jspx_eval_aui_select_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                out = _jspx_page_context.pushBody();
                _jspx_th_aui_select_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                _jspx_th_aui_select_5.doInitBody();
              }
              do {
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  aui:option
                com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_15 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                _jspx_th_aui_option_15.setPageContext(_jspx_page_context);
                _jspx_th_aui_option_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_5);
                _jspx_th_aui_option_15.setLabel(new String("%"));
                _jspx_th_aui_option_15.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getMarginProperty("right", "unit"), "%") );
                int _jspx_eval_aui_option_15 = _jspx_th_aui_option_15.doStartTag();
                if (_jspx_th_aui_option_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_15);
                  _jspx_th_aui_option_15.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_15);
                _jspx_th_aui_option_15.release();
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  aui:option
                com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_16 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                _jspx_th_aui_option_16.setPageContext(_jspx_page_context);
                _jspx_th_aui_option_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_5);
                _jspx_th_aui_option_16.setLabel(new String("px"));
                _jspx_th_aui_option_16.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getMarginProperty("right", "unit"), "px") );
                int _jspx_eval_aui_option_16 = _jspx_th_aui_option_16.doStartTag();
                if (_jspx_th_aui_option_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_16);
                  _jspx_th_aui_option_16.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_16);
                _jspx_th_aui_option_16.release();
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  aui:option
                com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_17 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                _jspx_th_aui_option_17.setPageContext(_jspx_page_context);
                _jspx_th_aui_option_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_5);
                _jspx_th_aui_option_17.setLabel(new String("em"));
                _jspx_th_aui_option_17.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getMarginProperty("right", "unit"), "em") );
                int _jspx_eval_aui_option_17 = _jspx_th_aui_option_17.doStartTag();
                if (_jspx_th_aui_option_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_17);
                  _jspx_th_aui_option_17.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_17);
                _jspx_th_aui_option_17.release();
                out.write("\n");
                out.write("\t\t\t\t");
                int evalDoAfterBody = _jspx_th_aui_select_5.doAfterBody();
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                  break;
              } while (true);
              if (_jspx_eval_aui_select_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                out = _jspx_page_context.popBody();
            }
            if (_jspx_th_aui_select_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_select_5);
              _jspx_th_aui_select_5.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_select_5);
            _jspx_th_aui_select_5.release();
            out.write("\n");
            out.write("\t\t\t</span>\n");
            out.write("\t\t\t<span class=\"align-items-end d-flex\">\n");
            out.write("\t\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
            _jspx_th_aui_input_8.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_1);
            _jspx_th_aui_input_8.setCssClass("same-margin");
            _jspx_th_aui_input_8.setDisabled( portletConfigurationCSSPortletDisplayContext.isSpacingSameForAll("margin") );
            _jspx_th_aui_input_8.setInlineField( true );
            _jspx_th_aui_input_8.setLabel("bottom");
            _jspx_th_aui_input_8.setName("marginBottom");
            _jspx_th_aui_input_8.setValue( portletConfigurationCSSPortletDisplayContext.getMarginProperty("bottom", "value") );
            _jspx_th_aui_input_8.setWrapperCssClass("pr-2");
            int _jspx_eval_aui_input_8 = _jspx_th_aui_input_8.doStartTag();
            if (_jspx_th_aui_input_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_8);
              _jspx_th_aui_input_8.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_8);
            _jspx_th_aui_input_8.release();
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t");
            //  aui:select
            com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.SelectTag.class) : new com.liferay.taglib.aui.SelectTag();
            _jspx_th_aui_select_6.setPageContext(_jspx_page_context);
            _jspx_th_aui_select_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_1);
            _jspx_th_aui_select_6.setCssClass("same-margin");
            _jspx_th_aui_select_6.setDisabled( portletConfigurationCSSPortletDisplayContext.isSpacingSameForAll("margin") );
            _jspx_th_aui_select_6.setInlineField( true );
            _jspx_th_aui_select_6.setLabel("");
            _jspx_th_aui_select_6.setName("marginBottomUnit");
            _jspx_th_aui_select_6.setTitle("top-margin-unit");
            int _jspx_eval_aui_select_6 = _jspx_th_aui_select_6.doStartTag();
            if (_jspx_eval_aui_select_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              if (_jspx_eval_aui_select_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                out = _jspx_page_context.pushBody();
                _jspx_th_aui_select_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                _jspx_th_aui_select_6.doInitBody();
              }
              do {
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  aui:option
                com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_18 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                _jspx_th_aui_option_18.setPageContext(_jspx_page_context);
                _jspx_th_aui_option_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_6);
                _jspx_th_aui_option_18.setLabel(new String("%"));
                _jspx_th_aui_option_18.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getMarginProperty("bottom", "unit"), "%") );
                int _jspx_eval_aui_option_18 = _jspx_th_aui_option_18.doStartTag();
                if (_jspx_th_aui_option_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_18);
                  _jspx_th_aui_option_18.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_18);
                _jspx_th_aui_option_18.release();
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  aui:option
                com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_19 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                _jspx_th_aui_option_19.setPageContext(_jspx_page_context);
                _jspx_th_aui_option_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_6);
                _jspx_th_aui_option_19.setLabel(new String("px"));
                _jspx_th_aui_option_19.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getMarginProperty("bottom", "unit"), "px") );
                int _jspx_eval_aui_option_19 = _jspx_th_aui_option_19.doStartTag();
                if (_jspx_th_aui_option_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_19);
                  _jspx_th_aui_option_19.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_19);
                _jspx_th_aui_option_19.release();
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  aui:option
                com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_20 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                _jspx_th_aui_option_20.setPageContext(_jspx_page_context);
                _jspx_th_aui_option_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_6);
                _jspx_th_aui_option_20.setLabel(new String("em"));
                _jspx_th_aui_option_20.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getMarginProperty("bottom", "unit"), "em") );
                int _jspx_eval_aui_option_20 = _jspx_th_aui_option_20.doStartTag();
                if (_jspx_th_aui_option_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_20);
                  _jspx_th_aui_option_20.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_20);
                _jspx_th_aui_option_20.release();
                out.write("\n");
                out.write("\t\t\t\t");
                int evalDoAfterBody = _jspx_th_aui_select_6.doAfterBody();
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                  break;
              } while (true);
              if (_jspx_eval_aui_select_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                out = _jspx_page_context.popBody();
            }
            if (_jspx_th_aui_select_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_select_6);
              _jspx_th_aui_select_6.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_select_6);
            _jspx_th_aui_select_6.release();
            out.write("\n");
            out.write("\t\t\t</span>\n");
            out.write("\t\t\t<span class=\"align-items-end d-flex\">\n");
            out.write("\t\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
            _jspx_th_aui_input_9.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_1);
            _jspx_th_aui_input_9.setCssClass("same-margin");
            _jspx_th_aui_input_9.setDisabled( portletConfigurationCSSPortletDisplayContext.isSpacingSameForAll("margin") );
            _jspx_th_aui_input_9.setInlineField( true );
            _jspx_th_aui_input_9.setLabel("left");
            _jspx_th_aui_input_9.setName("marginLeft");
            _jspx_th_aui_input_9.setValue( portletConfigurationCSSPortletDisplayContext.getMarginProperty("left", "value") );
            _jspx_th_aui_input_9.setWrapperCssClass("pr-2");
            int _jspx_eval_aui_input_9 = _jspx_th_aui_input_9.doStartTag();
            if (_jspx_th_aui_input_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_9);
              _jspx_th_aui_input_9.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_9);
            _jspx_th_aui_input_9.release();
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t");
            //  aui:select
            com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.SelectTag.class) : new com.liferay.taglib.aui.SelectTag();
            _jspx_th_aui_select_7.setPageContext(_jspx_page_context);
            _jspx_th_aui_select_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_1);
            _jspx_th_aui_select_7.setCssClass("same-margin");
            _jspx_th_aui_select_7.setDisabled( portletConfigurationCSSPortletDisplayContext.isSpacingSameForAll("margin") );
            _jspx_th_aui_select_7.setInlineField( true );
            _jspx_th_aui_select_7.setLabel("");
            _jspx_th_aui_select_7.setName("marginLeftUnit");
            _jspx_th_aui_select_7.setTitle("top-margin-unit");
            int _jspx_eval_aui_select_7 = _jspx_th_aui_select_7.doStartTag();
            if (_jspx_eval_aui_select_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              if (_jspx_eval_aui_select_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                out = _jspx_page_context.pushBody();
                _jspx_th_aui_select_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                _jspx_th_aui_select_7.doInitBody();
              }
              do {
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  aui:option
                com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_21 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                _jspx_th_aui_option_21.setPageContext(_jspx_page_context);
                _jspx_th_aui_option_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_7);
                _jspx_th_aui_option_21.setLabel(new String("%"));
                _jspx_th_aui_option_21.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getMarginProperty("left", "unit"), "%") );
                int _jspx_eval_aui_option_21 = _jspx_th_aui_option_21.doStartTag();
                if (_jspx_th_aui_option_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_21);
                  _jspx_th_aui_option_21.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_21);
                _jspx_th_aui_option_21.release();
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  aui:option
                com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_22 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                _jspx_th_aui_option_22.setPageContext(_jspx_page_context);
                _jspx_th_aui_option_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_7);
                _jspx_th_aui_option_22.setLabel(new String("px"));
                _jspx_th_aui_option_22.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getMarginProperty("left", "unit"), "px") );
                int _jspx_eval_aui_option_22 = _jspx_th_aui_option_22.doStartTag();
                if (_jspx_th_aui_option_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_22);
                  _jspx_th_aui_option_22.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_22);
                _jspx_th_aui_option_22.release();
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  aui:option
                com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_23 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
                _jspx_th_aui_option_23.setPageContext(_jspx_page_context);
                _jspx_th_aui_option_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_7);
                _jspx_th_aui_option_23.setLabel(new String("em"));
                _jspx_th_aui_option_23.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getMarginProperty("left", "unit"), "em") );
                int _jspx_eval_aui_option_23 = _jspx_th_aui_option_23.doStartTag();
                if (_jspx_th_aui_option_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_23);
                  _jspx_th_aui_option_23.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_23);
                _jspx_th_aui_option_23.release();
                out.write("\n");
                out.write("\t\t\t\t");
                int evalDoAfterBody = _jspx_th_aui_select_7.doAfterBody();
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                  break;
              } while (true);
              if (_jspx_eval_aui_select_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                out = _jspx_page_context.popBody();
            }
            if (_jspx_th_aui_select_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_select_7);
              _jspx_th_aui_select_7.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_select_7);
            _jspx_th_aui_select_7.release();
            out.write("\n");
            out.write("\t\t\t</span>\n");
            out.write("\t\t");
          }
          if (_jspx_th_aui_fieldset_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset_1);
            _jspx_th_aui_fieldset_1.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset_1);
          _jspx_th_aui_fieldset_1.release();
          out.write('\n');
          out.write('	');
        }
        if (_jspx_th_clay_col_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_1);
          _jspx_th_clay_col_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_1);
        _jspx_th_clay_col_1.release();
        out.write('\n');
      }
      if (_jspx_th_clay_row_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_row_0);
        _jspx_th_clay_row_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_row_0);
      _jspx_th_clay_row_0.release();
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
