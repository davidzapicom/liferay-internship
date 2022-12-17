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

public final class text_005fstyles_jsp extends org.apache.jasper.runtime.HttpJspBase
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

DecimalFormat decimalFormat = portletConfigurationCSSPortletDisplayContext.getDecimalFormat();

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
        _jspx_th_clay_col_0.setMd("4");
        int _jspx_eval_clay_col_0 = _jspx_th_clay_col_0.doStartTag();
        if (_jspx_eval_clay_col_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t");
          //  aui:select
          com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.SelectTag.class) : new com.liferay.taglib.aui.SelectTag();
          _jspx_th_aui_select_0.setPageContext(_jspx_page_context);
          _jspx_th_aui_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
          _jspx_th_aui_select_0.setLabel("font");
          _jspx_th_aui_select_0.setName("fontFamily");
          _jspx_th_aui_select_0.setShowEmptyOption( true );
          int _jspx_eval_aui_select_0 = _jspx_th_aui_select_0.doStartTag();
          if (_jspx_eval_aui_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_aui_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_aui_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_aui_select_0.doInitBody();
            }
            do {
              out.write("\n");
              out.write("\t\t\t");
              //  aui:option
              com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
              _jspx_th_aui_option_0.setPageContext(_jspx_page_context);
              _jspx_th_aui_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
              _jspx_th_aui_option_0.setLabel(new String("Arial"));
              _jspx_th_aui_option_0.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getTextDataProperty("fontFamily"), "Arial") );
              int _jspx_eval_aui_option_0 = _jspx_th_aui_option_0.doStartTag();
              if (_jspx_th_aui_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_0);
                _jspx_th_aui_option_0.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_0);
              _jspx_th_aui_option_0.release();
              out.write("\n");
              out.write("\t\t\t");
              //  aui:option
              com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
              _jspx_th_aui_option_1.setPageContext(_jspx_page_context);
              _jspx_th_aui_option_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
              _jspx_th_aui_option_1.setLabel(new String("Georgia"));
              _jspx_th_aui_option_1.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getTextDataProperty("fontFamily"), "Georgia") );
              int _jspx_eval_aui_option_1 = _jspx_th_aui_option_1.doStartTag();
              if (_jspx_th_aui_option_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_1);
                _jspx_th_aui_option_1.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_1);
              _jspx_th_aui_option_1.release();
              out.write("\n");
              out.write("\t\t\t");
              //  aui:option
              com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
              _jspx_th_aui_option_2.setPageContext(_jspx_page_context);
              _jspx_th_aui_option_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
              _jspx_th_aui_option_2.setLabel(new String("Times New Roman"));
              _jspx_th_aui_option_2.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getTextDataProperty("fontFamily"), "Times New Roman") );
              int _jspx_eval_aui_option_2 = _jspx_th_aui_option_2.doStartTag();
              if (_jspx_th_aui_option_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_2);
                _jspx_th_aui_option_2.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_2);
              _jspx_th_aui_option_2.release();
              out.write("\n");
              out.write("\t\t\t");
              //  aui:option
              com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
              _jspx_th_aui_option_3.setPageContext(_jspx_page_context);
              _jspx_th_aui_option_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
              _jspx_th_aui_option_3.setLabel(new String("Tahoma"));
              _jspx_th_aui_option_3.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getTextDataProperty("fontFamily"), "Tahoma") );
              int _jspx_eval_aui_option_3 = _jspx_th_aui_option_3.doStartTag();
              if (_jspx_th_aui_option_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_3);
                _jspx_th_aui_option_3.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_3);
              _jspx_th_aui_option_3.release();
              out.write("\n");
              out.write("\t\t\t");
              //  aui:option
              com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
              _jspx_th_aui_option_4.setPageContext(_jspx_page_context);
              _jspx_th_aui_option_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
              _jspx_th_aui_option_4.setLabel(new String("Trebuchet MS"));
              _jspx_th_aui_option_4.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getTextDataProperty("fontFamily"), "Trebuchet MS") );
              int _jspx_eval_aui_option_4 = _jspx_th_aui_option_4.doStartTag();
              if (_jspx_th_aui_option_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_4);
                _jspx_th_aui_option_4.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_4);
              _jspx_th_aui_option_4.release();
              out.write("\n");
              out.write("\t\t\t");
              //  aui:option
              com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
              _jspx_th_aui_option_5.setPageContext(_jspx_page_context);
              _jspx_th_aui_option_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
              _jspx_th_aui_option_5.setLabel(new String("Verdana"));
              _jspx_th_aui_option_5.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getTextDataProperty("fontFamily"), "Verdana") );
              int _jspx_eval_aui_option_5 = _jspx_th_aui_option_5.doStartTag();
              if (_jspx_th_aui_option_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_5);
                _jspx_th_aui_option_5.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_5);
              _jspx_th_aui_option_5.release();
              out.write("\n");
              out.write("\t\t");
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
          out.write("\n");
          out.write("\t\t");
          //  aui:input
          com.liferay.taglib.aui.InputTag _jspx_th_aui_input_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
          _jspx_th_aui_input_0.setPageContext(_jspx_page_context);
          _jspx_th_aui_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
          _jspx_th_aui_input_0.setInlineLabel("right");
          _jspx_th_aui_input_0.setLabel("bold");
          _jspx_th_aui_input_0.setLabelCssClass("simple-toggle-switch");
          _jspx_th_aui_input_0.setName("fontBold");
          _jspx_th_aui_input_0.setType("toggle-switch");
          _jspx_th_aui_input_0.setValue( Objects.equals(portletConfigurationCSSPortletDisplayContext.getTextDataProperty("fontWeight"), "bold") );
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
          out.write("\t\t");
          //  aui:input
          com.liferay.taglib.aui.InputTag _jspx_th_aui_input_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
          _jspx_th_aui_input_1.setPageContext(_jspx_page_context);
          _jspx_th_aui_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
          _jspx_th_aui_input_1.setInlineLabel("right");
          _jspx_th_aui_input_1.setLabel("italic");
          _jspx_th_aui_input_1.setLabelCssClass("simple-toggle-switch");
          _jspx_th_aui_input_1.setName("fontItalic");
          _jspx_th_aui_input_1.setType("toggle-switch");
          _jspx_th_aui_input_1.setValue( Objects.equals(portletConfigurationCSSPortletDisplayContext.getTextDataProperty("fontStyle"), "italic") );
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
          out.write("\t\t");
          //  aui:select
          com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.SelectTag.class) : new com.liferay.taglib.aui.SelectTag();
          _jspx_th_aui_select_1.setPageContext(_jspx_page_context);
          _jspx_th_aui_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
          _jspx_th_aui_select_1.setLabel("size");
          _jspx_th_aui_select_1.setName("fontSize");
          _jspx_th_aui_select_1.setShowEmptyOption( true );
          int _jspx_eval_aui_select_1 = _jspx_th_aui_select_1.doStartTag();
          if (_jspx_eval_aui_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_aui_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_aui_select_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_aui_select_1.doInitBody();
            }
            do {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");

			for (double i = 0.1; i <= 12; i += 0.1) {
				String value = decimalFormat.format(i);
			
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t");
              //  aui:option
              com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
              _jspx_th_aui_option_6.setPageContext(_jspx_page_context);
              _jspx_th_aui_option_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_1);
              _jspx_th_aui_option_6.setLabel( value );
              _jspx_th_aui_option_6.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getTextDataProperty("fontSize"), value) );
              int _jspx_eval_aui_option_6 = _jspx_th_aui_option_6.doStartTag();
              if (_jspx_th_aui_option_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_6);
                _jspx_th_aui_option_6.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_6);
              _jspx_th_aui_option_6.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");

			}
			
              out.write("\n");
              out.write("\n");
              out.write("\t\t");
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
          out.write("\n");
          out.write("\t\t");
          //  liferay-util:include
          com.liferay.taglib.util.IncludeTag _jspx_th_liferay$1util_include_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.IncludeTag.class) : new com.liferay.taglib.util.IncludeTag();
          _jspx_th_liferay$1util_include_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1util_include_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
          _jspx_th_liferay$1util_include_0.setPage("/color_picker_input.jsp");
          _jspx_th_liferay$1util_include_0.setServletContext( application );
          int _jspx_eval_liferay$1util_include_0 = _jspx_th_liferay$1util_include_0.doStartTag();
          if (_jspx_eval_liferay$1util_include_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t");
            //  liferay-util:param
            com.liferay.taglib.util.ParamTag _jspx_th_liferay$1util_param_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
            _jspx_th_liferay$1util_param_0.setPageContext(_jspx_page_context);
            _jspx_th_liferay$1util_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1util_include_0);
            _jspx_th_liferay$1util_param_0.setName("color");
            _jspx_th_liferay$1util_param_0.setValue( portletConfigurationCSSPortletDisplayContext.getTextDataProperty("color") );
            int _jspx_eval_liferay$1util_param_0 = _jspx_th_liferay$1util_param_0.doStartTag();
            if (_jspx_th_liferay$1util_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_param_0);
              _jspx_th_liferay$1util_param_0.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_param_0);
            _jspx_th_liferay$1util_param_0.release();
            out.write("\n");
            out.write("\t\t\t");
            //  liferay-util:param
            com.liferay.taglib.util.ParamTag _jspx_th_liferay$1util_param_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
            _jspx_th_liferay$1util_param_1.setPageContext(_jspx_page_context);
            _jspx_th_liferay$1util_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1util_include_0);
            _jspx_th_liferay$1util_param_1.setName("label");
            _jspx_th_liferay$1util_param_1.setValue( LanguageUtil.get(request, "color") );
            int _jspx_eval_liferay$1util_param_1 = _jspx_th_liferay$1util_param_1.doStartTag();
            if (_jspx_th_liferay$1util_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_param_1);
              _jspx_th_liferay$1util_param_1.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_param_1);
            _jspx_th_liferay$1util_param_1.release();
            out.write("\n");
            out.write("\t\t\t");
            //  liferay-util:param
            com.liferay.taglib.util.ParamTag _jspx_th_liferay$1util_param_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
            _jspx_th_liferay$1util_param_2.setPageContext(_jspx_page_context);
            _jspx_th_liferay$1util_param_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1util_include_0);
            _jspx_th_liferay$1util_param_2.setName("name");
            _jspx_th_liferay$1util_param_2.setValue( liferayPortletResponse.getNamespace() + "fontColor" );
            int _jspx_eval_liferay$1util_param_2 = _jspx_th_liferay$1util_param_2.doStartTag();
            if (_jspx_th_liferay$1util_param_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_param_2);
              _jspx_th_liferay$1util_param_2.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_param_2);
            _jspx_th_liferay$1util_param_2.release();
            out.write("\n");
            out.write("\t\t");
          }
          if (_jspx_th_liferay$1util_include_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_include_0);
            _jspx_th_liferay$1util_include_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_include_0);
          _jspx_th_liferay$1util_include_0.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  aui:select
          com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.SelectTag.class) : new com.liferay.taglib.aui.SelectTag();
          _jspx_th_aui_select_2.setPageContext(_jspx_page_context);
          _jspx_th_aui_select_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
          _jspx_th_aui_select_2.setLabel("alignment");
          _jspx_th_aui_select_2.setName("textAlign");
          _jspx_th_aui_select_2.setShowEmptyOption( true );
          int _jspx_eval_aui_select_2 = _jspx_th_aui_select_2.doStartTag();
          if (_jspx_eval_aui_select_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_aui_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_aui_select_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_aui_select_2.doInitBody();
            }
            do {
              out.write("\n");
              out.write("\t\t\t");
              //  aui:option
              com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
              _jspx_th_aui_option_7.setPageContext(_jspx_page_context);
              _jspx_th_aui_option_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_2);
              _jspx_th_aui_option_7.setLabel(new String("justify"));
              _jspx_th_aui_option_7.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getTextDataProperty("textAlign"), "justify") );
              int _jspx_eval_aui_option_7 = _jspx_th_aui_option_7.doStartTag();
              if (_jspx_th_aui_option_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_7);
                _jspx_th_aui_option_7.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_7);
              _jspx_th_aui_option_7.release();
              out.write("\n");
              out.write("\t\t\t");
              //  aui:option
              com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
              _jspx_th_aui_option_8.setPageContext(_jspx_page_context);
              _jspx_th_aui_option_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_2);
              _jspx_th_aui_option_8.setLabel(new String("left"));
              _jspx_th_aui_option_8.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getTextDataProperty("textAlign"), "left") );
              int _jspx_eval_aui_option_8 = _jspx_th_aui_option_8.doStartTag();
              if (_jspx_th_aui_option_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_8);
                _jspx_th_aui_option_8.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_8);
              _jspx_th_aui_option_8.release();
              out.write("\n");
              out.write("\t\t\t");
              //  aui:option
              com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
              _jspx_th_aui_option_9.setPageContext(_jspx_page_context);
              _jspx_th_aui_option_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_2);
              _jspx_th_aui_option_9.setLabel(new String("right"));
              _jspx_th_aui_option_9.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getTextDataProperty("textAlign"), "right") );
              int _jspx_eval_aui_option_9 = _jspx_th_aui_option_9.doStartTag();
              if (_jspx_th_aui_option_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_9);
                _jspx_th_aui_option_9.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_9);
              _jspx_th_aui_option_9.release();
              out.write("\n");
              out.write("\t\t\t");
              //  aui:option
              com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
              _jspx_th_aui_option_10.setPageContext(_jspx_page_context);
              _jspx_th_aui_option_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_2);
              _jspx_th_aui_option_10.setLabel(new String("center"));
              _jspx_th_aui_option_10.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getTextDataProperty("textAlign"), "center") );
              int _jspx_eval_aui_option_10 = _jspx_th_aui_option_10.doStartTag();
              if (_jspx_th_aui_option_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_10);
                _jspx_th_aui_option_10.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_10);
              _jspx_th_aui_option_10.release();
              out.write("\n");
              out.write("\t\t");
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
          out.write("\n");
          out.write("\t\t");
          //  aui:select
          com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.SelectTag.class) : new com.liferay.taglib.aui.SelectTag();
          _jspx_th_aui_select_3.setPageContext(_jspx_page_context);
          _jspx_th_aui_select_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
          _jspx_th_aui_select_3.setLabel("text-decoration");
          _jspx_th_aui_select_3.setName("textDecoration");
          _jspx_th_aui_select_3.setShowEmptyOption( true );
          int _jspx_eval_aui_select_3 = _jspx_th_aui_select_3.doStartTag();
          if (_jspx_eval_aui_select_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_aui_select_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_aui_select_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_aui_select_3.doInitBody();
            }
            do {
              out.write("\n");
              out.write("\t\t\t");
              //  aui:option
              com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
              _jspx_th_aui_option_11.setPageContext(_jspx_page_context);
              _jspx_th_aui_option_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_3);
              _jspx_th_aui_option_11.setLabel(new String("none"));
              _jspx_th_aui_option_11.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getTextDataProperty("textDecoration"), "none") );
              int _jspx_eval_aui_option_11 = _jspx_th_aui_option_11.doStartTag();
              if (_jspx_th_aui_option_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_11);
                _jspx_th_aui_option_11.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_11);
              _jspx_th_aui_option_11.release();
              out.write("\n");
              out.write("\t\t\t");
              //  aui:option
              com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_12 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
              _jspx_th_aui_option_12.setPageContext(_jspx_page_context);
              _jspx_th_aui_option_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_3);
              _jspx_th_aui_option_12.setLabel(new String("underline"));
              _jspx_th_aui_option_12.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getTextDataProperty("textDecoration"), "underline") );
              int _jspx_eval_aui_option_12 = _jspx_th_aui_option_12.doStartTag();
              if (_jspx_th_aui_option_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_12);
                _jspx_th_aui_option_12.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_12);
              _jspx_th_aui_option_12.release();
              out.write("\n");
              out.write("\t\t\t");
              //  aui:option
              com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_13 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
              _jspx_th_aui_option_13.setPageContext(_jspx_page_context);
              _jspx_th_aui_option_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_3);
              _jspx_th_aui_option_13.setLabel(new String("overline"));
              _jspx_th_aui_option_13.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getTextDataProperty("textDecoration"), "overline") );
              int _jspx_eval_aui_option_13 = _jspx_th_aui_option_13.doStartTag();
              if (_jspx_th_aui_option_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_13);
                _jspx_th_aui_option_13.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_13);
              _jspx_th_aui_option_13.release();
              out.write("\n");
              out.write("\t\t\t");
              //  aui:option
              com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_14 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
              _jspx_th_aui_option_14.setPageContext(_jspx_page_context);
              _jspx_th_aui_option_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_3);
              _jspx_th_aui_option_14.setLabel(new String("strikethrough"));
              _jspx_th_aui_option_14.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getTextDataProperty("textDecoration"), "line-through") );
              _jspx_th_aui_option_14.setValue(new String("line-through"));
              int _jspx_eval_aui_option_14 = _jspx_th_aui_option_14.doStartTag();
              if (_jspx_th_aui_option_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_14);
                _jspx_th_aui_option_14.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_14);
              _jspx_th_aui_option_14.release();
              out.write("\n");
              out.write("\t\t");
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
        _jspx_th_clay_col_1.setMd("8");
        int _jspx_eval_clay_col_1 = _jspx_th_clay_col_1.doStartTag();
        if (_jspx_eval_clay_col_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t");
          //  aui:select
          com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.SelectTag.class) : new com.liferay.taglib.aui.SelectTag();
          _jspx_th_aui_select_4.setPageContext(_jspx_page_context);
          _jspx_th_aui_select_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_1);
          _jspx_th_aui_select_4.setLabel("word-spacing");
          _jspx_th_aui_select_4.setName("wordSpacing");
          _jspx_th_aui_select_4.setShowEmptyOption( true );
          int _jspx_eval_aui_select_4 = _jspx_th_aui_select_4.doStartTag();
          if (_jspx_eval_aui_select_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_aui_select_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_aui_select_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_aui_select_4.doInitBody();
            }
            do {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");

			for (double i = -1; i <= 1; i += 0.05) {
				String value = decimalFormat.format(i);

				if (value.equals("0em")) {
					value = "normal";
				}
			
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t");
              //  aui:option
              com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_15 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
              _jspx_th_aui_option_15.setPageContext(_jspx_page_context);
              _jspx_th_aui_option_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_4);
              _jspx_th_aui_option_15.setLabel( value );
              _jspx_th_aui_option_15.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getTextDataProperty("wordSpacing"), value) );
              int _jspx_eval_aui_option_15 = _jspx_th_aui_option_15.doStartTag();
              if (_jspx_th_aui_option_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_15);
                _jspx_th_aui_option_15.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_15);
              _jspx_th_aui_option_15.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");

			}
			
              out.write("\n");
              out.write("\n");
              out.write("\t\t");
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
          out.write("\n");
          out.write("\t\t");
          //  aui:select
          com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.SelectTag.class) : new com.liferay.taglib.aui.SelectTag();
          _jspx_th_aui_select_5.setPageContext(_jspx_page_context);
          _jspx_th_aui_select_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_1);
          _jspx_th_aui_select_5.setLabel("line-height");
          _jspx_th_aui_select_5.setName("lineHeight");
          _jspx_th_aui_select_5.setShowEmptyOption( true );
          int _jspx_eval_aui_select_5 = _jspx_th_aui_select_5.doStartTag();
          if (_jspx_eval_aui_select_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_aui_select_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_aui_select_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_aui_select_5.doInitBody();
            }
            do {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");

			for (double i = 0.1; i <= 12; i += 0.1) {
				String value = decimalFormat.format(i);
			
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t");
              //  aui:option
              com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_16 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
              _jspx_th_aui_option_16.setPageContext(_jspx_page_context);
              _jspx_th_aui_option_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_5);
              _jspx_th_aui_option_16.setLabel( value );
              _jspx_th_aui_option_16.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getTextDataProperty("lineHeight"), value) );
              int _jspx_eval_aui_option_16 = _jspx_th_aui_option_16.doStartTag();
              if (_jspx_th_aui_option_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_16);
                _jspx_th_aui_option_16.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_16);
              _jspx_th_aui_option_16.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");

			}
			
              out.write("\n");
              out.write("\n");
              out.write("\t\t");
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
          out.write("\n");
          out.write("\t\t");
          //  aui:select
          com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.SelectTag.class) : new com.liferay.taglib.aui.SelectTag();
          _jspx_th_aui_select_6.setPageContext(_jspx_page_context);
          _jspx_th_aui_select_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_1);
          _jspx_th_aui_select_6.setLabel("letter-spacing");
          _jspx_th_aui_select_6.setName("letterSpacing");
          _jspx_th_aui_select_6.setShowEmptyOption( true );
          int _jspx_eval_aui_select_6 = _jspx_th_aui_select_6.doStartTag();
          if (_jspx_eval_aui_select_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_aui_select_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_aui_select_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_aui_select_6.doInitBody();
            }
            do {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");

			for (int i = -10; i <= 50; i++) {
				String value = i + "px";

				if (i == 0) {
					value = "0";
				}
			
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t");
              //  aui:option
              com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_17 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
              _jspx_th_aui_option_17.setPageContext(_jspx_page_context);
              _jspx_th_aui_option_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_6);
              _jspx_th_aui_option_17.setLabel( value );
              _jspx_th_aui_option_17.setSelected( Objects.equals(portletConfigurationCSSPortletDisplayContext.getTextDataProperty("letterSpacing"), value) );
              int _jspx_eval_aui_option_17 = _jspx_th_aui_option_17.doStartTag();
              if (_jspx_th_aui_option_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_17);
                _jspx_th_aui_option_17.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_17);
              _jspx_th_aui_option_17.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");

			}
			
              out.write("\n");
              out.write("\n");
              out.write("\t\t");
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
