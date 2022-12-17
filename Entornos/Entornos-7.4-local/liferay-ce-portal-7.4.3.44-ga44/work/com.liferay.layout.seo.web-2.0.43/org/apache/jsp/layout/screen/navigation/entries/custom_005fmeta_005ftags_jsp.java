package org.apache.jsp.layout.screen.navigation.entries;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.dynamic.data.mapping.validator.DDMFormValuesValidationException;
import com.liferay.layout.admin.kernel.model.LayoutTypePortletConstants;
import com.liferay.layout.seo.model.LayoutSEOEntry;
import com.liferay.layout.seo.model.LayoutSEOSite;
import com.liferay.layout.seo.web.internal.constants.LayoutSEOWebKeys;
import com.liferay.layout.seo.web.internal.display.context.LayoutsSEODisplayContext;
import com.liferay.layout.seo.web.internal.display.context.OpenGraphSettingsDisplayContext;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.SitemapChangeFrequencyException;
import com.liferay.portal.kernel.exception.SitemapIncludeException;
import com.liferay.portal.kernel.exception.SitemapPagePriorityException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.util.PropsValues;
import java.util.Collections;

public final class custom_005fmeta_005ftags_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write('\n');
      out.write('\n');

String redirect = ParamUtil.getString(request, "redirect");

String backURL = ParamUtil.getString(request, "backURL", redirect);

LayoutsSEODisplayContext layoutsSEODisplayContext = (LayoutsSEODisplayContext)request.getAttribute(LayoutSEOWebKeys.LAYOUT_PAGE_LAYOUT_SEO_DISPLAY_CONTEXT);

if (Validator.isNull(backURL)) {
	backURL = PortalUtil.getLayoutFullURL(layoutsSEODisplayContext.getSelLayout(), themeDisplay);
}

      out.write('\n');
      out.write('\n');
      //  aui:form
      com.liferay.taglib.aui.FormTag _jspx_th_aui_form_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FormTag.class) : new com.liferay.taglib.aui.FormTag();
      _jspx_th_aui_form_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_form_0.setParent(null);
      _jspx_th_aui_form_0.setAction( layoutsSEODisplayContext.getEditCustomMetaTagsURL() );
      _jspx_th_aui_form_0.setMethod("post");
      _jspx_th_aui_form_0.setName("fm");
      int _jspx_eval_aui_form_0 = _jspx_th_aui_form_0.doStartTag();
      if (_jspx_eval_aui_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write('\n');
        out.write('	');
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_0.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_0.setName("redirect");
        _jspx_th_aui_input_0.setType("hidden");
        _jspx_th_aui_input_0.setValue( layoutsSEODisplayContext.getRedirectURL() );
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
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_1.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_1.setName("portletResource");
        _jspx_th_aui_input_1.setType("hidden");
        _jspx_th_aui_input_1.setValue( ParamUtil.getString(request, "portletResource") );
        int _jspx_eval_aui_input_1 = _jspx_th_aui_input_1.doStartTag();
        if (_jspx_th_aui_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_1);
          _jspx_th_aui_input_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_1);
        _jspx_th_aui_input_1.release();
        out.write('\n');
        out.write('	');
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_2.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_2.setName("groupId");
        _jspx_th_aui_input_2.setType("hidden");
        _jspx_th_aui_input_2.setValue( layoutsSEODisplayContext.getGroupId() );
        int _jspx_eval_aui_input_2 = _jspx_th_aui_input_2.doStartTag();
        if (_jspx_th_aui_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_2);
          _jspx_th_aui_input_2.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_2);
        _jspx_th_aui_input_2.release();
        out.write('\n');
        out.write('	');
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_3.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_3.setName("privateLayout");
        _jspx_th_aui_input_3.setType("hidden");
        _jspx_th_aui_input_3.setValue( layoutsSEODisplayContext.isPrivateLayout() );
        int _jspx_eval_aui_input_3 = _jspx_th_aui_input_3.doStartTag();
        if (_jspx_th_aui_input_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_3);
          _jspx_th_aui_input_3.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_3);
        _jspx_th_aui_input_3.release();
        out.write('\n');
        out.write('	');
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_4.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_4.setName("layoutId");
        _jspx_th_aui_input_4.setType("hidden");
        _jspx_th_aui_input_4.setValue( layoutsSEODisplayContext.getLayoutId() );
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
        out.write("\t");
        //  clay:sheet
        com.liferay.frontend.taglib.clay.servlet.taglib.SheetTag _jspx_th_clay_sheet_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.SheetTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.SheetTag();
        _jspx_th_clay_sheet_0.setPageContext(_jspx_page_context);
        _jspx_th_clay_sheet_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        int _jspx_eval_clay_sheet_0 = _jspx_th_clay_sheet_0.doStartTag();
        if (_jspx_eval_clay_sheet_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t");
          if (_jspx_meth_clay_sheet$1header_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_sheet_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
          _jspx_th_liferay$1ui_error_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_error_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet_0);
          _jspx_th_liferay$1ui_error_0.setException( DDMFormValuesValidationException.class );
          _jspx_th_liferay$1ui_error_0.setMessage("field-validation-failed");
          int _jspx_eval_liferay$1ui_error_0 = _jspx_th_liferay$1ui_error_0.doStartTag();
          if (_jspx_th_liferay$1ui_error_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_0);
            _jspx_th_liferay$1ui_error_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_0);
          _jspx_th_liferay$1ui_error_0.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
          _jspx_th_liferay$1ui_error_1.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_error_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet_0);
          _jspx_th_liferay$1ui_error_1.setException( DDMFormValuesValidationException.RequiredValue.class );
          int _jspx_eval_liferay$1ui_error_1 = _jspx_th_liferay$1ui_error_1.doStartTag();
          if (_jspx_eval_liferay$1ui_error_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Object errorException = null;
            if (_jspx_eval_liferay$1ui_error_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_liferay$1ui_error_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_liferay$1ui_error_1.doInitBody();
            }
            errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
            do {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");

			DDMFormValuesValidationException.RequiredValue rv = (DDMFormValuesValidationException.RequiredValue)errorException;

			String fieldLabelValue = rv.getFieldLabelValue(themeDisplay.getLocale());

			if (Validator.isNull(fieldLabelValue)) {
				fieldLabelValue = rv.getFieldName();
			}
			
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");
              //  liferay-ui:message
              com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
              _jspx_th_liferay$1ui_message_2.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_error_1);
              _jspx_th_liferay$1ui_message_2.setArguments( HtmlUtil.escape(fieldLabelValue) );
              _jspx_th_liferay$1ui_message_2.setKey("no-value-is-defined-for-field-x");
              _jspx_th_liferay$1ui_message_2.setTranslateArguments( false );
              int _jspx_eval_liferay$1ui_message_2 = _jspx_th_liferay$1ui_message_2.doStartTag();
              if (_jspx_th_liferay$1ui_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
                _jspx_th_liferay$1ui_message_2.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
              _jspx_th_liferay$1ui_message_2.release();
              out.write("\n");
              out.write("\t\t");
              int evalDoAfterBody = _jspx_th_liferay$1ui_error_1.doAfterBody();
              errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_liferay$1ui_error_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_liferay$1ui_error_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_1);
            _jspx_th_liferay$1ui_error_1.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_1);
          _jspx_th_liferay$1ui_error_1.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  liferay-ddm:html
          com.liferay.dynamic.data.mapping.taglib.servlet.taglib.HTMLTag _jspx_th_liferay$1ddm_html_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.dynamic.data.mapping.taglib.servlet.taglib.HTMLTag.class) : new com.liferay.dynamic.data.mapping.taglib.servlet.taglib.HTMLTag();
          _jspx_th_liferay$1ddm_html_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ddm_html_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet_0);
          _jspx_th_liferay$1ddm_html_0.setClassNameId( PortalUtil.getClassNameId(com.liferay.dynamic.data.mapping.model.DDMStructure.class) );
          _jspx_th_liferay$1ddm_html_0.setClassPK( layoutsSEODisplayContext.getDDMStructurePrimaryKey() );
          _jspx_th_liferay$1ddm_html_0.setDdmFormValues( layoutsSEODisplayContext.getDDMFormValues() );
          _jspx_th_liferay$1ddm_html_0.setDefaultEditLocale( PortalUtil.getSiteDefaultLocale(layoutsSEODisplayContext.getGroupId()) );
          _jspx_th_liferay$1ddm_html_0.setDefaultLocale( PortalUtil.getSiteDefaultLocale(layoutsSEODisplayContext.getGroupId()) );
          _jspx_th_liferay$1ddm_html_0.setFieldsNamespace( String.valueOf(layoutsSEODisplayContext.getDDMStructurePrimaryKey()) );
          _jspx_th_liferay$1ddm_html_0.setGroupId( layoutsSEODisplayContext.getGroupId() );
          _jspx_th_liferay$1ddm_html_0.setRequestedLocale( locale );
          int _jspx_eval_liferay$1ddm_html_0 = _jspx_th_liferay$1ddm_html_0.doStartTag();
          if (_jspx_th_liferay$1ddm_html_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ddm_html_0);
            _jspx_th_liferay$1ddm_html_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ddm_html_0);
          _jspx_th_liferay$1ddm_html_0.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  clay:sheet-footer
          com.liferay.frontend.taglib.clay.servlet.taglib.SheetFooterTag _jspx_th_clay_sheet$1footer_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.SheetFooterTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.SheetFooterTag();
          _jspx_th_clay_sheet$1footer_0.setPageContext(_jspx_page_context);
          _jspx_th_clay_sheet$1footer_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet_0);
          int _jspx_eval_clay_sheet$1footer_0 = _jspx_th_clay_sheet$1footer_0.doStartTag();
          if (_jspx_eval_clay_sheet$1footer_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t");
            //  aui:button
            com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
            _jspx_th_aui_button_0.setPageContext(_jspx_page_context);
            _jspx_th_aui_button_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1footer_0);
            _jspx_th_aui_button_0.setPrimary( true );
            _jspx_th_aui_button_0.setType("submit");
            int _jspx_eval_aui_button_0 = _jspx_th_aui_button_0.doStartTag();
            if (_jspx_th_aui_button_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_0);
              _jspx_th_aui_button_0.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_0);
            _jspx_th_aui_button_0.release();
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t");
            //  aui:button
            com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
            _jspx_th_aui_button_1.setPageContext(_jspx_page_context);
            _jspx_th_aui_button_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1footer_0);
            _jspx_th_aui_button_1.setHref( backURL );
            _jspx_th_aui_button_1.setType("cancel");
            int _jspx_eval_aui_button_1 = _jspx_th_aui_button_1.doStartTag();
            if (_jspx_th_aui_button_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_1);
              _jspx_th_aui_button_1.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_1);
            _jspx_th_aui_button_1.release();
            out.write("\n");
            out.write("\t\t");
          }
          if (_jspx_th_clay_sheet$1footer_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sheet$1footer_0);
            _jspx_th_clay_sheet$1footer_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sheet$1footer_0);
          _jspx_th_clay_sheet$1footer_0.release();
          out.write('\n');
          out.write('	');
        }
        if (_jspx_th_clay_sheet_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sheet_0);
          _jspx_th_clay_sheet_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sheet_0);
        _jspx_th_clay_sheet_0.release();
        out.write('\n');
      }
      if (_jspx_th_aui_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_form_0);
        _jspx_th_aui_form_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_form_0);
      _jspx_th_aui_form_0.release();
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

  private boolean _jspx_meth_clay_sheet$1header_0(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_sheet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:sheet-header
    com.liferay.frontend.taglib.clay.servlet.taglib.SheetHeaderTag _jspx_th_clay_sheet$1header_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.SheetHeaderTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.SheetHeaderTag();
    _jspx_th_clay_sheet$1header_0.setPageContext(_jspx_page_context);
    _jspx_th_clay_sheet$1header_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet_0);
    int _jspx_eval_clay_sheet$1header_0 = _jspx_th_clay_sheet$1header_0.doStartTag();
    if (_jspx_eval_clay_sheet$1header_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("\t\t\t<h2 class=\"sheet-title\">");
      if (_jspx_meth_liferay$1ui_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_sheet$1header_0, _jspx_page_context))
        return true;
      out.write("</h2>\n");
      out.write("\n");
      out.write("\t\t\t<p class=\"text-muted\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_liferay$1ui_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_sheet$1header_0, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t");
    }
    if (_jspx_th_clay_sheet$1header_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sheet$1header_0);
      _jspx_th_clay_sheet$1header_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sheet$1header_0);
    _jspx_th_clay_sheet$1header_0.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_sheet$1header_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1header_0);
    _jspx_th_liferay$1ui_message_0.setKey("custom-meta-tags");
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

  private boolean _jspx_meth_liferay$1ui_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_sheet$1header_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1header_0);
    _jspx_th_liferay$1ui_message_1.setKey("custom-meta-tags-description");
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
