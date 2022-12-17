package org.apache.jsp.display;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.dynamic.data.mapping.constants.DDMPortletKeys;
import com.liferay.dynamic.data.mapping.exception.NoSuchFormInstanceException;
import com.liferay.dynamic.data.mapping.exception.NoSuchStructureException;
import com.liferay.dynamic.data.mapping.exception.NoSuchStructureLayoutException;
import com.liferay.dynamic.data.mapping.exception.StorageException;
import com.liferay.dynamic.data.mapping.form.renderer.DDMFormRenderingException;
import com.liferay.dynamic.data.mapping.form.web.internal.display.context.DDMFormDisplayContext;
import com.liferay.dynamic.data.mapping.form.web.internal.display.context.util.DDMFormInstanceExpirationStatusUtil;
import com.liferay.dynamic.data.mapping.form.web.internal.display.context.util.DDMFormInstanceSubmissionLimitStatusUtil;
import com.liferay.dynamic.data.mapping.model.DDMFormInstance;
import com.liferay.dynamic.data.mapping.model.DDMFormInstanceRecord;
import com.liferay.dynamic.data.mapping.model.DDMFormInstanceRecordVersion;
import com.liferay.dynamic.data.mapping.service.DDMFormInstanceServiceUtil;
import com.liferay.dynamic.data.mapping.validator.DDMFormValuesValidationException;
import com.liferay.object.exception.ObjectEntryValuesException;
import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.captcha.CaptchaException;
import com.liferay.portal.kernel.captcha.CaptchaTextException;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.portlet.PortletPreferencesFactoryUtil;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PrefsParamUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import java.util.Locale;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(11);
    _jspx_dependants.add("/display/init.jsp");
    _jspx_dependants.add("/META-INF/c.tld");
    _jspx_dependants.add("/META-INF/liferay-portlet_2_0.tld");
    _jspx_dependants.add("/META-INF/liferay-aui.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-clay.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-frontend.tld");
    _jspx_dependants.add("/META-INF/liferay-portlet-ext.tld");
    _jspx_dependants.add("/META-INF/resources/react.tld");
    _jspx_dependants.add("/META-INF/liferay-theme.tld");
    _jspx_dependants.add("/META-INF/liferay-ui.tld");
    _jspx_dependants.add("/display/init-ext.jsp");
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

DDMFormDisplayContext ddmFormDisplayContext = (DDMFormDisplayContext)request.getAttribute(WebKeys.PORTLET_DISPLAY_CONTEXT);

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');

long formInstanceId = ddmFormDisplayContext.getFormInstanceId();
boolean limitToOneSubmissionPerUser = DDMFormInstanceSubmissionLimitStatusUtil.isLimitToOneSubmissionPerUser(ddmFormDisplayContext.getFormInstance());

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('	');
if (
 formInstanceId == 0 ) {
      out.write("\n");
      out.write("\t\t<div class=\"alert alert-info\">\n");
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
 ddmFormDisplayContext.getFormInstance() == null ) {
      out.write("\n");
      out.write("\t\t<div class=\"ddm-form-basic-info\">\n");
      out.write("\t\t\t");
      if (_jspx_meth_clay_container$1fluid_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t");
      out.write('\n');
      out.write('	');
}
else if (
 !ddmFormDisplayContext.hasAddFormInstanceRecordPermission() && !ddmFormDisplayContext.hasViewPermission() ) {
      out.write("\n");
      out.write("\t\t<div class=\"ddm-form-basic-info\">\n");
      out.write("\t\t\t");
      if (_jspx_meth_clay_container$1fluid_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t");
      out.write('\n');
      out.write('	');
}
else if (
 (!ddmFormDisplayContext.isLoggedUser() && limitToOneSubmissionPerUser) || ddmFormDisplayContext.isRequireAuthentication() ) {
      out.write("\n");
      out.write("\t\t<div class=\"ddm-form-basic-info\">\n");
      out.write("\t\t\t");
      if (_jspx_meth_clay_container$1fluid_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t");
      out.write('\n');
      out.write('	');
}
else {
      out.write("\n");
      out.write("\t\t");
      //  liferay-portlet:resourceURL
      com.liferay.taglib.portlet.ResourceURLTag _jspx_th_liferay$1portlet_resourceURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ResourceURLTag.class) : new com.liferay.taglib.portlet.ResourceURLTag();
      _jspx_th_liferay$1portlet_resourceURL_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1portlet_resourceURL_0.setParent(null);
      _jspx_th_liferay$1portlet_resourceURL_0.setCopyCurrentRenderParameters( false );
      _jspx_th_liferay$1portlet_resourceURL_0.setId("/dynamic_data_mapping_form/get_form_report_data");
      _jspx_th_liferay$1portlet_resourceURL_0.setVar("formReportDataURL");
      int _jspx_eval_liferay$1portlet_resourceURL_0 = _jspx_th_liferay$1portlet_resourceURL_0.doStartTag();
      if (_jspx_eval_liferay$1portlet_resourceURL_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t");
        //  portlet:param
        com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
        _jspx_th_portlet_param_0.setPageContext(_jspx_page_context);
        _jspx_th_portlet_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1portlet_resourceURL_0);
        _jspx_th_portlet_param_0.setName("formInstanceId");
        _jspx_th_portlet_param_0.setValue( String.valueOf(formInstanceId) );
        int _jspx_eval_portlet_param_0 = _jspx_th_portlet_param_0.doStartTag();
        if (_jspx_th_portlet_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_0);
          _jspx_th_portlet_param_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_0);
        _jspx_th_portlet_param_0.release();
        out.write("\n");
        out.write("\t\t");
      }
      if (_jspx_th_liferay$1portlet_resourceURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_resourceURL_0);
        _jspx_th_liferay$1portlet_resourceURL_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_resourceURL_0);
      _jspx_th_liferay$1portlet_resourceURL_0.release();
      java.lang.String formReportDataURL = null;
      formReportDataURL = (java.lang.String) _jspx_page_context.findAttribute("formReportDataURL");
      out.write("\n");
      out.write("\n");
      out.write("\t\t");

		DDMFormInstance formInstance = ddmFormDisplayContext.getFormInstance();

		boolean expired = DDMFormInstanceExpirationStatusUtil.isFormExpired(formInstance, timeZone);

		boolean formAvailable = ddmFormDisplayContext.isFormAvailable();
		boolean formShared = ddmFormDisplayContext.isFormShared();
		boolean preview = ddmFormDisplayContext.isPreview();
		boolean showSuccessPage = ddmFormDisplayContext.isShowSuccessPage();

		String languageId = ddmFormDisplayContext.getDefaultLanguageId();

		Locale displayLocale = LocaleUtil.fromLanguageId(languageId);
		
      out.write("\n");
      out.write("\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t\t");
if (
 !preview && (ddmFormDisplayContext.isSubmissionLimitReached() || expired || showSuccessPage) ) {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");

				String pageDescription = null;
				String pageTitle = null;

				if (expired) {
					pageDescription = LanguageUtil.get(request, "this-form-has-an-expiration-date");
					pageTitle = LanguageUtil.get(request, "this-form-is-no-longer-available");
				}
				else if (showSuccessPage) {
					pageDescription = ddmFormDisplayContext.getSuccessPageDescription(displayLocale);
					pageTitle = ddmFormDisplayContext.getSuccessPageTitle(displayLocale);
				}
				else {
					pageDescription = LanguageUtil.get(request, "you-can-fill-out-this-form-only-once.-contact-the-owner-of-the-form-if-you-think-this-is-a-mistake");
					pageTitle = LanguageUtil.get(request, "you-have-already-responded");
				}
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");
      //  react:component
      com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag _jspx_th_react_component_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag.class) : new com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag();
      _jspx_th_react_component_0.setPageContext(_jspx_page_context);
      _jspx_th_react_component_0.setParent(null);
      _jspx_th_react_component_0.setModule("admin/js/components/DefaultPage");
      _jspx_th_react_component_0.setProps(
						HashMapBuilder.<String, Object>put(
							"dataEngineModule", ddmFormDisplayContext.getDataEngineModule()
						).put(
							"formDescription", formInstance.getDescription(displayLocale)
						).put(
							"formReportDataURL", formReportDataURL.toString()
						).put(
							"formTitle", formInstance.getName(displayLocale)
						).put(
							"pageDescription", pageDescription
						).put(
							"pageTitle", pageTitle
						).put(
							"showPartialResultsToRespondents", ddmFormDisplayContext.isShowPartialResultsToRespondents()
						).put(
							"showSubmitAgainButton", !expired && !limitToOneSubmissionPerUser
						).build()
					);
      int _jspx_eval_react_component_0 = _jspx_th_react_component_0.doStartTag();
      if (_jspx_th_react_component_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_react_component_0);
        _jspx_th_react_component_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_react_component_0);
      _jspx_th_react_component_0.release();
      out.write("\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t");
}
else if (
 formAvailable || preview ) {
      out.write("\n");
      out.write("\t\t\t\t");
      //  portlet:actionURL
      com.liferay.taglib.portlet.ActionURLTag _jspx_th_portlet_actionURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ActionURLTag.class) : new com.liferay.taglib.portlet.ActionURLTag();
      _jspx_th_portlet_actionURL_0.setPageContext(_jspx_page_context);
      _jspx_th_portlet_actionURL_0.setParent(null);
      _jspx_th_portlet_actionURL_0.setName("/dynamic_data_mapping_form/add_form_instance_record");
      _jspx_th_portlet_actionURL_0.setVar("addFormInstanceRecordActionURL");
      int _jspx_eval_portlet_actionURL_0 = _jspx_th_portlet_actionURL_0.doStartTag();
      if (_jspx_th_portlet_actionURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_0);
        _jspx_th_portlet_actionURL_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_0);
      _jspx_th_portlet_actionURL_0.release();
      java.lang.String addFormInstanceRecordActionURL = null;
      addFormInstanceRecordActionURL = (java.lang.String) _jspx_page_context.findAttribute("addFormInstanceRecordActionURL");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"portlet-forms\">\n");
      out.write("\t\t\t\t\t");
      //  aui:form
      com.liferay.taglib.aui.FormTag _jspx_th_aui_form_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FormTag.class) : new com.liferay.taglib.aui.FormTag();
      _jspx_th_aui_form_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_form_0.setParent(null);
      _jspx_th_aui_form_0.setAction( addFormInstanceRecordActionURL );
      _jspx_th_aui_form_0.setDynamicAttribute(null, "data-DDMFormInstanceId",  formInstanceId );
      _jspx_th_aui_form_0.setDynamicAttribute(null, "data-senna-off", new String("true"));
      _jspx_th_aui_form_0.setMethod("post");
      _jspx_th_aui_form_0.setName("fm");
      int _jspx_eval_aui_form_0 = _jspx_th_aui_form_0.doStartTag();
      if (_jspx_eval_aui_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_0.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_0.setName("currentURL");
        _jspx_th_aui_input_0.setType("hidden");
        _jspx_th_aui_input_0.setValue( currentURL );
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
        out.write("\t\t\t\t\t\t");

						String redirectURL = ddmFormDisplayContext.getRedirectURL();
						
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t");
if (
 Validator.isNull(redirectURL) ) {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_1.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_1.setName("redirect");
        _jspx_th_aui_input_1.setType("hidden");
        _jspx_th_aui_input_1.setValue( ParamUtil.getString(request, "redirect", currentURL) );
        int _jspx_eval_aui_input_1 = _jspx_th_aui_input_1.doStartTag();
        if (_jspx_th_aui_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_1);
          _jspx_th_aui_input_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_1);
        _jspx_th_aui_input_1.release();
        out.write("\n");
        out.write("\t\t\t\t\t\t");
}
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_2.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_2.setName("groupId");
        _jspx_th_aui_input_2.setType("hidden");
        _jspx_th_aui_input_2.setValue( formInstance.getGroupId() );
        int _jspx_eval_aui_input_2 = _jspx_th_aui_input_2.doStartTag();
        if (_jspx_th_aui_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_2);
          _jspx_th_aui_input_2.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_2);
        _jspx_th_aui_input_2.release();
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_3.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_3.setName("formInstanceId");
        _jspx_th_aui_input_3.setType("hidden");
        _jspx_th_aui_input_3.setValue( formInstance.getFormInstanceId() );
        int _jspx_eval_aui_input_3 = _jspx_th_aui_input_3.doStartTag();
        if (_jspx_th_aui_input_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_3);
          _jspx_th_aui_input_3.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_3);
        _jspx_th_aui_input_3.release();
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_4.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_4.setName("languageId");
        _jspx_th_aui_input_4.setType("hidden");
        _jspx_th_aui_input_4.setValue( languageId );
        int _jspx_eval_aui_input_4 = _jspx_th_aui_input_4.doStartTag();
        if (_jspx_th_aui_input_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_4);
          _jspx_th_aui_input_4.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_4);
        _jspx_th_aui_input_4.release();
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_5.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_5.setName("workflowAction");
        _jspx_th_aui_input_5.setType("hidden");
        _jspx_th_aui_input_5.setValue( WorkflowConstants.ACTION_PUBLISH );
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
        out.write("\t\t\t\t\t\t");
        //  liferay-ui:error
        com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
        _jspx_th_liferay$1ui_error_0.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_error_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_liferay$1ui_error_0.setException( CaptchaException.class );
        _jspx_th_liferay$1ui_error_0.setMessage("captcha-verification-failed");
        int _jspx_eval_liferay$1ui_error_0 = _jspx_th_liferay$1ui_error_0.doStartTag();
        if (_jspx_th_liferay$1ui_error_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_0);
          _jspx_th_liferay$1ui_error_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_0);
        _jspx_th_liferay$1ui_error_0.release();
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        //  liferay-ui:error
        com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
        _jspx_th_liferay$1ui_error_1.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_error_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_liferay$1ui_error_1.setException( CaptchaTextException.class );
        _jspx_th_liferay$1ui_error_1.setMessage("text-verification-failed");
        int _jspx_eval_liferay$1ui_error_1 = _jspx_th_liferay$1ui_error_1.doStartTag();
        if (_jspx_th_liferay$1ui_error_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_1);
          _jspx_th_liferay$1ui_error_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_1);
        _jspx_th_liferay$1ui_error_1.release();
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        //  liferay-ui:error
        com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
        _jspx_th_liferay$1ui_error_2.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_error_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_liferay$1ui_error_2.setException( DDMFormRenderingException.class );
        _jspx_th_liferay$1ui_error_2.setMessage("unable-to-render-the-selected-form");
        int _jspx_eval_liferay$1ui_error_2 = _jspx_th_liferay$1ui_error_2.doStartTag();
        if (_jspx_th_liferay$1ui_error_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_2);
          _jspx_th_liferay$1ui_error_2.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_2);
        _jspx_th_liferay$1ui_error_2.release();
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        //  liferay-ui:error
        com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
        _jspx_th_liferay$1ui_error_3.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_error_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_liferay$1ui_error_3.setException( DDMFormValuesValidationException.class );
        _jspx_th_liferay$1ui_error_3.setMessage("field-validation-failed");
        int _jspx_eval_liferay$1ui_error_3 = _jspx_th_liferay$1ui_error_3.doStartTag();
        if (_jspx_th_liferay$1ui_error_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_3);
          _jspx_th_liferay$1ui_error_3.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_3);
        _jspx_th_liferay$1ui_error_3.release();
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        //  liferay-ui:error
        com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
        _jspx_th_liferay$1ui_error_4.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_error_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_liferay$1ui_error_4.setException( DDMFormValuesValidationException.MustSetValidValue.class );
        int _jspx_eval_liferay$1ui_error_4 = _jspx_th_liferay$1ui_error_4.doStartTag();
        if (_jspx_eval_liferay$1ui_error_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          java.lang.Object errorException = null;
          if (_jspx_eval_liferay$1ui_error_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.pushBody();
            _jspx_th_liferay$1ui_error_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
            _jspx_th_liferay$1ui_error_4.doInitBody();
          }
          errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
          do {
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t");

							DDMFormValuesValidationException.MustSetValidValue msvv = (DDMFormValuesValidationException.MustSetValidValue)errorException;

							String fieldLabelValue = msvv.getFieldLabelValue(displayLocale);

							if (Validator.isNull(fieldLabelValue)) {
								fieldLabelValue = msvv.getFieldName();
							}
							
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t");
            //  liferay-ui:message
            com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
            _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
            _jspx_th_liferay$1ui_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_error_4);
            _jspx_th_liferay$1ui_message_1.setArguments( HtmlUtil.escape(fieldLabelValue) );
            _jspx_th_liferay$1ui_message_1.setKey("validation-failed-for-field-x");
            _jspx_th_liferay$1ui_message_1.setTranslateArguments( false );
            int _jspx_eval_liferay$1ui_message_1 = _jspx_th_liferay$1ui_message_1.doStartTag();
            if (_jspx_th_liferay$1ui_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_1);
              _jspx_th_liferay$1ui_message_1.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_1);
            _jspx_th_liferay$1ui_message_1.release();
            out.write("\n");
            out.write("\t\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_liferay$1ui_error_4.doAfterBody();
            errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
          if (_jspx_eval_liferay$1ui_error_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
            out = _jspx_page_context.popBody();
        }
        if (_jspx_th_liferay$1ui_error_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_4);
          _jspx_th_liferay$1ui_error_4.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_4);
        _jspx_th_liferay$1ui_error_4.release();
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        //  liferay-ui:error
        com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
        _jspx_th_liferay$1ui_error_5.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_error_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_liferay$1ui_error_5.setException( DDMFormValuesValidationException.RequiredValue.class );
        int _jspx_eval_liferay$1ui_error_5 = _jspx_th_liferay$1ui_error_5.doStartTag();
        if (_jspx_eval_liferay$1ui_error_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          java.lang.Object errorException = null;
          if (_jspx_eval_liferay$1ui_error_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.pushBody();
            _jspx_th_liferay$1ui_error_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
            _jspx_th_liferay$1ui_error_5.doInitBody();
          }
          errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
          do {
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t");

							DDMFormValuesValidationException.RequiredValue rv = (DDMFormValuesValidationException.RequiredValue)errorException;

							String fieldLabelValue = rv.getFieldLabelValue(displayLocale);

							if (Validator.isNull(fieldLabelValue)) {
								fieldLabelValue = rv.getFieldName();
							}
							
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t");
            //  liferay-ui:message
            com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
            _jspx_th_liferay$1ui_message_2.setPageContext(_jspx_page_context);
            _jspx_th_liferay$1ui_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_error_5);
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
            out.write("\t\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_liferay$1ui_error_5.doAfterBody();
            errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
          if (_jspx_eval_liferay$1ui_error_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
            out = _jspx_page_context.popBody();
        }
        if (_jspx_th_liferay$1ui_error_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_5);
          _jspx_th_liferay$1ui_error_5.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_5);
        _jspx_th_liferay$1ui_error_5.release();
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        //  liferay-ui:error
        com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
        _jspx_th_liferay$1ui_error_6.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_error_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_liferay$1ui_error_6.setException( NoSuchFormInstanceException.class );
        _jspx_th_liferay$1ui_error_6.setMessage("the-selected-form-no-longer-exists");
        int _jspx_eval_liferay$1ui_error_6 = _jspx_th_liferay$1ui_error_6.doStartTag();
        if (_jspx_th_liferay$1ui_error_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_6);
          _jspx_th_liferay$1ui_error_6.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_6);
        _jspx_th_liferay$1ui_error_6.release();
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        //  liferay-ui:error
        com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
        _jspx_th_liferay$1ui_error_7.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_error_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_liferay$1ui_error_7.setException( NoSuchStructureException.class );
        _jspx_th_liferay$1ui_error_7.setMessage("unable-to-retrieve-the-definition-of-the-selected-form");
        int _jspx_eval_liferay$1ui_error_7 = _jspx_th_liferay$1ui_error_7.doStartTag();
        if (_jspx_th_liferay$1ui_error_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_7);
          _jspx_th_liferay$1ui_error_7.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_7);
        _jspx_th_liferay$1ui_error_7.release();
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        //  liferay-ui:error
        com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
        _jspx_th_liferay$1ui_error_8.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_error_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_liferay$1ui_error_8.setException( NoSuchStructureLayoutException.class );
        _jspx_th_liferay$1ui_error_8.setMessage("unable-to-retrieve-the-layout-of-the-selected-form");
        int _jspx_eval_liferay$1ui_error_8 = _jspx_th_liferay$1ui_error_8.doStartTag();
        if (_jspx_th_liferay$1ui_error_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_8);
          _jspx_th_liferay$1ui_error_8.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_8);
        _jspx_th_liferay$1ui_error_8.release();
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        //  liferay-ui:error
        com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
        _jspx_th_liferay$1ui_error_9.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_error_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_liferay$1ui_error_9.setException( ObjectEntryValuesException.ExceedsIntegerSize.class );
        _jspx_th_liferay$1ui_error_9.setMessage("object-entry-value-exceeds-integer-field-allowed-size");
        int _jspx_eval_liferay$1ui_error_9 = _jspx_th_liferay$1ui_error_9.doStartTag();
        if (_jspx_th_liferay$1ui_error_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_9);
          _jspx_th_liferay$1ui_error_9.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_9);
        _jspx_th_liferay$1ui_error_9.release();
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        //  liferay-ui:error
        com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
        _jspx_th_liferay$1ui_error_10.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_error_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_liferay$1ui_error_10.setException( ObjectEntryValuesException.ExceedsLongMaxSize.class );
        _jspx_th_liferay$1ui_error_10.setMessage("object-entry-value-exceeds-maximum-long-field-allowed-size");
        int _jspx_eval_liferay$1ui_error_10 = _jspx_th_liferay$1ui_error_10.doStartTag();
        if (_jspx_th_liferay$1ui_error_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_10);
          _jspx_th_liferay$1ui_error_10.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_10);
        _jspx_th_liferay$1ui_error_10.release();
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        //  liferay-ui:error
        com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
        _jspx_th_liferay$1ui_error_11.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_error_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_liferay$1ui_error_11.setException( ObjectEntryValuesException.ExceedsLongMinSize.class );
        _jspx_th_liferay$1ui_error_11.setMessage("object-entry-value-falls-below-minimum-long-field-allowed-size");
        int _jspx_eval_liferay$1ui_error_11 = _jspx_th_liferay$1ui_error_11.doStartTag();
        if (_jspx_th_liferay$1ui_error_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_11);
          _jspx_th_liferay$1ui_error_11.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_11);
        _jspx_th_liferay$1ui_error_11.release();
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        //  liferay-ui:error
        com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_12 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
        _jspx_th_liferay$1ui_error_12.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_error_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_liferay$1ui_error_12.setException( ObjectEntryValuesException.ExceedsLongSize.class );
        _jspx_th_liferay$1ui_error_12.setMessage("object-entry-value-exceeds-long-field-allowed-size");
        int _jspx_eval_liferay$1ui_error_12 = _jspx_th_liferay$1ui_error_12.doStartTag();
        if (_jspx_th_liferay$1ui_error_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_12);
          _jspx_th_liferay$1ui_error_12.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_12);
        _jspx_th_liferay$1ui_error_12.release();
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        //  liferay-ui:error
        com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_13 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
        _jspx_th_liferay$1ui_error_13.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_error_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_liferay$1ui_error_13.setException( ObjectEntryValuesException.ExceedsTextMaxLength.class );
        int _jspx_eval_liferay$1ui_error_13 = _jspx_th_liferay$1ui_error_13.doStartTag();
        if (_jspx_eval_liferay$1ui_error_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          java.lang.Object errorException = null;
          if (_jspx_eval_liferay$1ui_error_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.pushBody();
            _jspx_th_liferay$1ui_error_13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
            _jspx_th_liferay$1ui_error_13.doInitBody();
          }
          errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
          do {
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t");

							ObjectEntryValuesException.ExceedsTextMaxLength etml = (ObjectEntryValuesException.ExceedsTextMaxLength)errorException;
							
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t");
            //  liferay-ui:message
            com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
            _jspx_th_liferay$1ui_message_3.setPageContext(_jspx_page_context);
            _jspx_th_liferay$1ui_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_error_13);
            _jspx_th_liferay$1ui_message_3.setArguments( new String[] {String.valueOf(etml.getMaxLength()), etml.getObjectFieldName()} );
            _jspx_th_liferay$1ui_message_3.setKey("the-entry-value-exceeds-the-maximum-length-of-x-characters-for-object-field-x");
            _jspx_th_liferay$1ui_message_3.setTranslateArguments( false );
            int _jspx_eval_liferay$1ui_message_3 = _jspx_th_liferay$1ui_message_3.doStartTag();
            if (_jspx_th_liferay$1ui_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_3);
              _jspx_th_liferay$1ui_message_3.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_3);
            _jspx_th_liferay$1ui_message_3.release();
            out.write("\n");
            out.write("\t\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_liferay$1ui_error_13.doAfterBody();
            errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
          if (_jspx_eval_liferay$1ui_error_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
            out = _jspx_page_context.popBody();
        }
        if (_jspx_th_liferay$1ui_error_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_13);
          _jspx_th_liferay$1ui_error_13.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_13);
        _jspx_th_liferay$1ui_error_13.release();
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        //  liferay-ui:error
        com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_14 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
        _jspx_th_liferay$1ui_error_14.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_error_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_liferay$1ui_error_14.setException( StorageException.class );
        _jspx_th_liferay$1ui_error_14.setMessage("there-was-an-error-when-accessing-the-data-storage");
        int _jspx_eval_liferay$1ui_error_14 = _jspx_th_liferay$1ui_error_14.doStartTag();
        if (_jspx_th_liferay$1ui_error_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_14);
          _jspx_th_liferay$1ui_error_14.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_14);
        _jspx_th_liferay$1ui_error_14.release();
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_liferay$1ui_error$1principal_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_form_0, _jspx_page_context))
          return;
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t");
if (
 formShared || preview ) {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        //  clay:container-fluid
        com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag _jspx_th_clay_container$1fluid_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag();
        _jspx_th_clay_container$1fluid_3.setPageContext(_jspx_page_context);
        _jspx_th_clay_container$1fluid_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        int _jspx_eval_clay_container$1fluid_3 = _jspx_th_clay_container$1fluid_3.doStartTag();
        if (_jspx_eval_clay_container$1fluid_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"locale-actions\">\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          //  liferay-ui:language
          com.liferay.taglib.ui.LanguageTag _jspx_th_liferay$1ui_language_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.LanguageTag.class) : new com.liferay.taglib.ui.LanguageTag();
          _jspx_th_liferay$1ui_language_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_language_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_3);
          _jspx_th_liferay$1ui_language_0.setFormAction( currentURL );
          _jspx_th_liferay$1ui_language_0.setLanguageId( languageId );
          _jspx_th_liferay$1ui_language_0.setLanguageIds( ddmFormDisplayContext.getAvailableLanguageIds() );
          int _jspx_eval_liferay$1ui_language_0 = _jspx_th_liferay$1ui_language_0.doStartTag();
          if (_jspx_th_liferay$1ui_language_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_language_0);
            _jspx_th_liferay$1ui_language_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_language_0);
          _jspx_th_liferay$1ui_language_0.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t");
        }
        if (_jspx_th_clay_container$1fluid_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_3);
          _jspx_th_clay_container$1fluid_3.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_3);
        _jspx_th_clay_container$1fluid_3.release();
        out.write("\n");
        out.write("\t\t\t\t\t\t");
}
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t");
if (
 !ddmFormDisplayContext.hasAddFormInstanceRecordPermission() ) {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t<div class=\"ddm-form-basic-info\">\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_clay_container$1fluid_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_form_0, _jspx_page_context))
          return;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t</div>\n");
        out.write("\t\t\t\t\t\t");
}
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t");
if (
 !ddmFormDisplayContext.hasValidStorageType(formInstance) ) {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t<div class=\"ddm-form-basic-info\">\n");
        out.write("\t\t\t\t\t\t\t\t");
        //  clay:container-fluid
        com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag _jspx_th_clay_container$1fluid_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag();
        _jspx_th_clay_container$1fluid_5.setPageContext(_jspx_page_context);
        _jspx_th_clay_container$1fluid_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        int _jspx_eval_clay_container$1fluid_5 = _jspx_th_clay_container$1fluid_5.doStartTag();
        if (_jspx_eval_clay_container$1fluid_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          //  clay:alert
          com.liferay.frontend.taglib.clay.servlet.taglib.AlertTag _jspx_th_clay_alert_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.AlertTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.AlertTag();
          _jspx_th_clay_alert_4.setPageContext(_jspx_page_context);
          _jspx_th_clay_alert_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_5);
          _jspx_th_clay_alert_4.setDisplayType("danger");
          _jspx_th_clay_alert_4.setMessage( LanguageUtil.format(request, "this-form-was-created-using-a-storage-type-x-that-is-not-available-for-this-liferay-dxp-installation.-install-x-to-make-it-available-for-editing", formInstance.getStorageType()) );
          int _jspx_eval_clay_alert_4 = _jspx_th_clay_alert_4.doStartTag();
          if (_jspx_th_clay_alert_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_alert_4);
            _jspx_th_clay_alert_4.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_alert_4);
          _jspx_th_clay_alert_4.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t");
        }
        if (_jspx_th_clay_container$1fluid_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_5);
          _jspx_th_clay_container$1fluid_5.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_5);
        _jspx_th_clay_container$1fluid_5.release();
        out.write("\n");
        out.write("\t\t\t\t\t\t\t</div>\n");
        out.write("\t\t\t\t\t\t");
}
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t<div class=\"ddm-form-upload-permission-message hide mt-4\">\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_clay_container$1fluid_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_form_0, _jspx_page_context))
          return;
        out.write("\n");
        out.write("\t\t\t\t\t\t</div>\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        //  clay:container-fluid
        com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag _jspx_th_clay_container$1fluid_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag();
        _jspx_th_clay_container$1fluid_7.setPageContext(_jspx_page_context);
        _jspx_th_clay_container$1fluid_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        int _jspx_eval_clay_container$1fluid_7 = _jspx_th_clay_container$1fluid_7.doStartTag();
        if (_jspx_eval_clay_container$1fluid_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
          //  react:component
          com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag _jspx_th_react_component_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag.class) : new com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag();
          _jspx_th_react_component_1.setPageContext(_jspx_page_context);
          _jspx_th_react_component_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_7);
          _jspx_th_react_component_1.setModule("admin/js/util/ShowPartialResultsAlert");
          _jspx_th_react_component_1.setProps(
									HashMapBuilder.<String, Object>put(
										"dismissible", true
									).put(
										"showPartialResultsToRespondents", ddmFormDisplayContext.isShowPartialResultsToRespondents()
									).build()
								);
          int _jspx_eval_react_component_1 = _jspx_th_react_component_1.doStartTag();
          if (_jspx_th_react_component_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_react_component_1);
            _jspx_th_react_component_1.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_react_component_1);
          _jspx_th_react_component_1.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t");
        }
        if (_jspx_th_clay_container$1fluid_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_7);
          _jspx_th_clay_container$1fluid_7.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_7);
        _jspx_th_clay_container$1fluid_7.release();
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        //  liferay-portlet:resourceURL
        com.liferay.taglib.portlet.ResourceURLTag _jspx_th_liferay$1portlet_resourceURL_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ResourceURLTag.class) : new com.liferay.taglib.portlet.ResourceURLTag();
        _jspx_th_liferay$1portlet_resourceURL_1.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1portlet_resourceURL_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_liferay$1portlet_resourceURL_1.setCopyCurrentRenderParameters( false );
        _jspx_th_liferay$1portlet_resourceURL_1.setId("/dynamic_data_mapping_form/get_form_report_data");
        _jspx_th_liferay$1portlet_resourceURL_1.setVar("formReportDataURL");
        int _jspx_eval_liferay$1portlet_resourceURL_1 = _jspx_th_liferay$1portlet_resourceURL_1.doStartTag();
        if (_jspx_eval_liferay$1portlet_resourceURL_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
          //  portlet:param
          com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
          _jspx_th_portlet_param_1.setPageContext(_jspx_page_context);
          _jspx_th_portlet_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1portlet_resourceURL_1);
          _jspx_th_portlet_param_1.setName("formInstanceId");
          _jspx_th_portlet_param_1.setValue( String.valueOf(formInstanceId) );
          int _jspx_eval_portlet_param_1 = _jspx_th_portlet_param_1.doStartTag();
          if (_jspx_th_portlet_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_1);
            _jspx_th_portlet_param_1.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_1);
          _jspx_th_portlet_param_1.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t");
        }
        if (_jspx_th_liferay$1portlet_resourceURL_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_resourceURL_1);
          _jspx_th_liferay$1portlet_resourceURL_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_resourceURL_1);
        _jspx_th_liferay$1portlet_resourceURL_1.release();
        formReportDataURL = (java.lang.String) _jspx_page_context.findAttribute("formReportDataURL");
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        //  liferay-portlet:resourceURL
        com.liferay.taglib.portlet.ResourceURLTag _jspx_th_liferay$1portlet_resourceURL_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ResourceURLTag.class) : new com.liferay.taglib.portlet.ResourceURLTag();
        _jspx_th_liferay$1portlet_resourceURL_2.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1portlet_resourceURL_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_liferay$1portlet_resourceURL_2.setCopyCurrentRenderParameters( false );
        _jspx_th_liferay$1portlet_resourceURL_2.setId("/dynamic_data_mapping_form/validate_csrf_token");
        _jspx_th_liferay$1portlet_resourceURL_2.setVar("validateCSRFTokenURL");
        int _jspx_eval_liferay$1portlet_resourceURL_2 = _jspx_th_liferay$1portlet_resourceURL_2.doStartTag();
        if (_jspx_th_liferay$1portlet_resourceURL_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_resourceURL_2);
          _jspx_th_liferay$1portlet_resourceURL_2.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_resourceURL_2);
        _jspx_th_liferay$1portlet_resourceURL_2.release();
        java.lang.String validateCSRFTokenURL = null;
        validateCSRFTokenURL = (java.lang.String) _jspx_page_context.findAttribute("validateCSRFTokenURL");
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        //  clay:container-fluid
        com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag _jspx_th_clay_container$1fluid_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag();
        _jspx_th_clay_container$1fluid_8.setPageContext(_jspx_page_context);
        _jspx_th_clay_container$1fluid_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_clay_container$1fluid_8.setCssClass("ddm-form-builder-app ddm-form-builder-app-not-ready");
        _jspx_th_clay_container$1fluid_8.setDynamicAttribute(null, "id",  ddmFormDisplayContext.getContainerId() );
        int _jspx_eval_clay_container$1fluid_8 = _jspx_th_clay_container$1fluid_8.doStartTag();
        if (_jspx_eval_clay_container$1fluid_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
          //  react:component
          com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag _jspx_th_react_component_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag.class) : new com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag();
          _jspx_th_react_component_2.setPageContext(_jspx_page_context);
          _jspx_th_react_component_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_8);
          _jspx_th_react_component_2.setModule("admin/js/FormView");
          _jspx_th_react_component_2.setProps(
									HashMapBuilder.<String, Object>put(
										"dataEngineModule", ddmFormDisplayContext.getDataEngineModule()
									).put(
										"description", StringUtil.trim(formInstance.getDescription(displayLocale))
									).put(
										"formReportDataURL", formReportDataURL.toString()
									).put(
										"title", formInstance.getName(displayLocale)
									).put(
										"validateCSRFTokenURL", validateCSRFTokenURL.toString()
									).putAll(
										ddmFormDisplayContext.getDDMFormContext()
									).build()
								);
          int _jspx_eval_react_component_2 = _jspx_th_react_component_2.doStartTag();
          if (_jspx_th_react_component_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_react_component_2);
            _jspx_th_react_component_2.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_react_component_2);
          _jspx_th_react_component_2.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t");
        }
        if (_jspx_th_clay_container$1fluid_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_8);
          _jspx_th_clay_container$1fluid_8.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_8);
        _jspx_th_clay_container$1fluid_8.release();
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_aui_input_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_form_0, _jspx_page_context))
          return;
        out.write("\n");
        out.write("\t\t\t\t\t");
      }
      if (_jspx_th_aui_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_form_0);
        _jspx_th_aui_form_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_form_0);
      _jspx_th_aui_form_0.release();
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t");
      //  aui:script
      com.liferay.taglib.aui.ScriptTag _jspx_th_aui_script_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ScriptTag.class) : new com.liferay.taglib.aui.ScriptTag();
      _jspx_th_aui_script_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_script_0.setParent(null);
      _jspx_th_aui_script_0.setUse("aui-base");
      int _jspx_eval_aui_script_0 = _jspx_th_aui_script_0.doStartTag();
      if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_aui_script_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_aui_script_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\t\t\t\t\tvar ");
          if (_jspx_meth_portlet_namespace_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("form;\n");
          out.write("\n");
          out.write("\t\t\t\t\tfunction ");
          if (_jspx_meth_portlet_namespace_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("clearInterval(intervalId) {\n");
          out.write("\t\t\t\t\t\tif (intervalId) {\n");
          out.write("\t\t\t\t\t\t\tclearInterval(intervalId);\n");
          out.write("\t\t\t\t\t\t}\n");
          out.write("\t\t\t\t\t}\n");
          out.write("\n");
          out.write("\t\t\t\t\tvar ");
          if (_jspx_meth_portlet_namespace_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("intervalId;\n");
          out.write("\n");
          out.write("\t\t\t\t\tfunction ");
          if (_jspx_meth_portlet_namespace_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("clearPortletHandlers(event) {\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_portlet_namespace_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("clearInterval(");
          if (_jspx_meth_portlet_namespace_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("intervalId);\n");
          out.write("\n");
          out.write("\t\t\t\t\t\tLiferay.detach('destroyPortlet', ");
          if (_jspx_meth_portlet_namespace_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("clearPortletHandlers);\n");
          out.write("\t\t\t\t\t}\n");
          out.write("\n");
          out.write("\t\t\t\t\tLiferay.on('destroyPortlet', ");
          if (_jspx_meth_portlet_namespace_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("clearPortletHandlers);\n");
          out.write("\n");
          out.write("\t\t\t\t\t");
if (
 formShared ) {
          out.write("\n");
          out.write("\t\t\t\t\t\tdocument.title =\n");
          out.write("\t\t\t\t\t\t\t'");
          out.print( HtmlUtil.escapeJS(formInstance.getName(displayLocale)) );
          out.write("';\n");
          out.write("\t\t\t\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\tfunction ");
          if (_jspx_meth_portlet_namespace_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("fireFormView() {\n");
          out.write("\t\t\t\t\t\tLiferay.fire('ddmFormView', {\n");
          out.write("\t\t\t\t\t\t\tformId: '");
          out.print( formInstanceId );
          out.write("',\n");
          out.write("\t\t\t\t\t\t\ttitle: '");
          out.print( HtmlUtil.escapeJS(formInstance.getName(displayLocale)) );
          out.write("',\n");
          out.write("\t\t\t\t\t\t});\n");
          out.write("\t\t\t\t\t}\n");
          out.write("\n");
          out.write("\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t");
if (
 ddmFormDisplayContext.isAutosaveEnabled() ) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
          //  liferay-portlet:resourceURL
          com.liferay.taglib.portlet.ResourceURLTag _jspx_th_liferay$1portlet_resourceURL_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ResourceURLTag.class) : new com.liferay.taglib.portlet.ResourceURLTag();
          _jspx_th_liferay$1portlet_resourceURL_3.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1portlet_resourceURL_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
          _jspx_th_liferay$1portlet_resourceURL_3.setCopyCurrentRenderParameters( false );
          _jspx_th_liferay$1portlet_resourceURL_3.setId("/dynamic_data_mapping_form/add_form_instance_record");
          _jspx_th_liferay$1portlet_resourceURL_3.setVar("autoSaveFormInstanceRecordURL");
          int _jspx_eval_liferay$1portlet_resourceURL_3 = _jspx_th_liferay$1portlet_resourceURL_3.doStartTag();
          if (_jspx_eval_liferay$1portlet_resourceURL_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t");
            //  portlet:param
            com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
            _jspx_th_portlet_param_2.setPageContext(_jspx_page_context);
            _jspx_th_portlet_param_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1portlet_resourceURL_3);
            _jspx_th_portlet_param_2.setName("autoSave");
            _jspx_th_portlet_param_2.setValue( Boolean.TRUE.toString() );
            int _jspx_eval_portlet_param_2 = _jspx_th_portlet_param_2.doStartTag();
            if (_jspx_th_portlet_param_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_2);
              _jspx_th_portlet_param_2.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_2);
            _jspx_th_portlet_param_2.release();
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t");
            //  portlet:param
            com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
            _jspx_th_portlet_param_3.setPageContext(_jspx_page_context);
            _jspx_th_portlet_param_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1portlet_resourceURL_3);
            _jspx_th_portlet_param_3.setName("languageId");
            _jspx_th_portlet_param_3.setValue( languageId );
            int _jspx_eval_portlet_param_3 = _jspx_th_portlet_param_3.doStartTag();
            if (_jspx_th_portlet_param_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_3);
              _jspx_th_portlet_param_3.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_3);
            _jspx_th_portlet_param_3.release();
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t");
            //  portlet:param
            com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
            _jspx_th_portlet_param_4.setPageContext(_jspx_page_context);
            _jspx_th_portlet_param_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1portlet_resourceURL_3);
            _jspx_th_portlet_param_4.setName("preview");
            _jspx_th_portlet_param_4.setValue( String.valueOf(preview) );
            int _jspx_eval_portlet_param_4 = _jspx_th_portlet_param_4.doStartTag();
            if (_jspx_th_portlet_param_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_4);
              _jspx_th_portlet_param_4.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_4);
            _jspx_th_portlet_param_4.release();
            out.write("\n");
            out.write("\t\t\t\t\t\t\t");
          }
          if (_jspx_th_liferay$1portlet_resourceURL_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_resourceURL_3);
            _jspx_th_liferay$1portlet_resourceURL_3.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_resourceURL_3);
          _jspx_th_liferay$1portlet_resourceURL_3.release();
          java.lang.String autoSaveFormInstanceRecordURL = null;
          autoSaveFormInstanceRecordURL = (java.lang.String) _jspx_page_context.findAttribute("autoSaveFormInstanceRecordURL");
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\tLiferay.on('sessionExpired', (event) => {\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_portlet_namespace_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("clearInterval(");
          if (_jspx_meth_portlet_namespace_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("intervalId);\n");
          out.write("\t\t\t\t\t\t\t});\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\tfunction ");
          if (_jspx_meth_portlet_namespace_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("autoSave() {\n");
          out.write("\t\t\t\t\t\t\t\tvar form = ");
          if (_jspx_meth_portlet_namespace_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("form;\n");
          out.write("\t\t\t\t\t\t\t\tvar isRendered = form.reactComponentRef && form.reactComponentRef.current;\n");
          out.write("\t\t\t\t\t\t\t\tvar data = new URLSearchParams({\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_portlet_namespace_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("formInstanceId: ");
          out.print( formInstanceId );
          out.write(",\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_portlet_namespace_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("serializedDDMFormValues: JSON.stringify(\n");
          out.write("\t\t\t\t\t\t\t\t\t\tisRendered ? form.reactComponentRef.current.toJSON() : {}\n");
          out.write("\t\t\t\t\t\t\t\t\t),\n");
          out.write("\t\t\t\t\t\t\t\t});\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\tLiferay.Util.fetch('");
          out.print( autoSaveFormInstanceRecordURL.toString() );
          out.write("', {\n");
          out.write("\t\t\t\t\t\t\t\t\tbody: data,\n");
          out.write("\t\t\t\t\t\t\t\t\tmethod: 'POST',\n");
          out.write("\t\t\t\t\t\t\t\t});\n");
          out.write("\t\t\t\t\t\t\t}\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\tfunction ");
          if (_jspx_meth_portlet_namespace_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("startAutoSave() {\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_portlet_namespace_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("clearInterval(");
          if (_jspx_meth_portlet_namespace_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("intervalId);\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\twindow.");
          if (_jspx_meth_portlet_namespace_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("intervalId = setInterval(\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_portlet_namespace_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("autoSave,\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          out.print( ddmFormDisplayContext.getAutosaveInterval() );
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t);\n");
          out.write("\t\t\t\t\t\t\t}\n");
          out.write("\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t");
}
else {
          out.write("\n");
          out.write("\t\t\t\t\t\t\tfunction ");
          if (_jspx_meth_portlet_namespace_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("startAutoExtendSession() {\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_portlet_namespace_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("clearInterval(");
          if (_jspx_meth_portlet_namespace_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("intervalId);\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\tvar tenSeconds = 10000;\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\tvar time = Liferay.Session.get('sessionLength') || tenSeconds;\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\twindow.");
          if (_jspx_meth_portlet_namespace_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("intervalId = setInterval(\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_portlet_namespace_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("extendSession,\n");
          out.write("\t\t\t\t\t\t\t\t\ttime / 2\n");
          out.write("\t\t\t\t\t\t\t\t);\n");
          out.write("\t\t\t\t\t\t\t}\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\tfunction ");
          if (_jspx_meth_portlet_namespace_25((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("extendSession() {\n");
          out.write("\t\t\t\t\t\t\t\tLiferay.Session.extend();\n");
          out.write("\t\t\t\t\t\t\t}\n");
          out.write("\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\tfunction ");
          if (_jspx_meth_portlet_namespace_26((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("enableForm() {\n");
          out.write("\t\t\t\t\t\tvar container = document.querySelector(\n");
          out.write("\t\t\t\t\t\t\t'#");
          out.print( ddmFormDisplayContext.getContainerId() );
          out.write("'\n");
          out.write("\t\t\t\t\t\t);\n");
          out.write("\n");
          out.write("\t\t\t\t\t\tcontainer.classList.remove('ddm-form-builder-app-not-ready');\n");
          out.write("\t\t\t\t\t}\n");
          out.write("\n");
          out.write("\t\t\t\t\tfunction ");
          if (_jspx_meth_portlet_namespace_27((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("initForm() {\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_portlet_namespace_28((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("enableForm();\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_portlet_namespace_29((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("fireFormView();\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
if (
 ddmFormDisplayContext.isAutosaveEnabled() ) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\tvar container = document.querySelector(\n");
          out.write("\t\t\t\t\t\t\t\t\t'#");
          out.print( ddmFormDisplayContext.getContainerId() );
          out.write("'\n");
          out.write("\t\t\t\t\t\t\t\t);\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\tcontainer.onclick = function (event) {\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_portlet_namespace_30((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("startAutoSave();\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\tcontainer.onclick = null;\n");
          out.write("\t\t\t\t\t\t\t\t\tcontainer.onkeypress = null;\n");
          out.write("\t\t\t\t\t\t\t\t};\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\tcontainer.onkeypress = function (event) {\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_portlet_namespace_31((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("startAutoSave();\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\tcontainer.onclick = null;\n");
          out.write("\t\t\t\t\t\t\t\t\tcontainer.onkeypress = null;\n");
          out.write("\t\t\t\t\t\t\t\t};\n");
          out.write("\t\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
}
else {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_portlet_namespace_32((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("startAutoExtendSession();\n");
          out.write("\t\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t");
}
          out.write("\n");
          out.write("\t\t\t\t\t}\n");
          out.write("\n");
          out.write("\t\t\t\t\t");
if (
 ddmFormDisplayContext.isRememberMe() ) {
          out.write("\n");
          out.write("\t\t\t\t\t\tvar rememberMe = true;\n");
          out.write("\t\t\t\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\twindow.");
          if (_jspx_meth_portlet_namespace_33((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("sessionIntervalId = setInterval(() => {\n");
          out.write("\t\t\t\t\t\tif (Liferay.Session || rememberMe) {\n");
          out.write("\t\t\t\t\t\t\tclearInterval(");
          if (_jspx_meth_portlet_namespace_34((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("sessionIntervalId);\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_portlet_namespace_35((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("form = Liferay.component(\n");
          out.write("\t\t\t\t\t\t\t\t'");
          out.print( ddmFormDisplayContext.getContainerId() );
          out.write("'\n");
          out.write("\t\t\t\t\t\t\t);\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\tif (");
          if (_jspx_meth_portlet_namespace_36((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("form) {\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_portlet_namespace_37((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("initForm();\n");
          out.write("\t\t\t\t\t\t\t}\n");
          out.write("\t\t\t\t\t\t\telse {\n");
          out.write("\t\t\t\t\t\t\t\tLiferay.componentReady(\n");
          out.write("\t\t\t\t\t\t\t\t\t'");
          out.print( ddmFormDisplayContext.getContainerId() );
          out.write("'\n");
          out.write("\t\t\t\t\t\t\t\t).then((component) => {\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_portlet_namespace_38((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("form = component;\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\tif (component) {\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_portlet_namespace_39((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("initForm();\n");
          out.write("\t\t\t\t\t\t\t\t\t}\n");
          out.write("\t\t\t\t\t\t\t\t});\n");
          out.write("\t\t\t\t\t\t\t}\n");
          out.write("\t\t\t\t\t\t}\n");
          out.write("\t\t\t\t\t}, 1000);\n");
          out.write("\t\t\t\t");
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
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_script_0);
      _jspx_th_aui_script_0.release();
      out.write("\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t");
}
else {
      out.write("\n");
      out.write("\t\t\t\t<div class=\"alert alert-warning\">\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_liferay$1ui_message_4(_jspx_page_context))
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
      out.write('\n');
      out.write('\n');
if (
 ddmFormDisplayContext.isShowConfigurationIcon() ) {
      out.write("\n");
      out.write("\t<div class=\"c-mt-3 icons-container\">\n");
      out.write("\t\t<div class=\"btn-group lfr-icon-actions\">\n");
      out.write("\t\t\t");
      //  liferay-ui:icon
      com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
      _jspx_th_liferay$1ui_icon_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_icon_0.setParent(null);
      _jspx_th_liferay$1ui_icon_0.setIcon("cog");
      _jspx_th_liferay$1ui_icon_0.setLabel( true );
      _jspx_th_liferay$1ui_icon_0.setMarkupView("lexicon");
      _jspx_th_liferay$1ui_icon_0.setMessage("select-form");
      _jspx_th_liferay$1ui_icon_0.setMethod("get");
      _jspx_th_liferay$1ui_icon_0.setOnClick( portletDisplay.getURLConfigurationJS() );
      _jspx_th_liferay$1ui_icon_0.setUrl( portletDisplay.getURLConfiguration() );
      int _jspx_eval_liferay$1ui_icon_0 = _jspx_th_liferay$1ui_icon_0.doStartTag();
      if (_jspx_th_liferay$1ui_icon_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_0);
        _jspx_th_liferay$1ui_icon_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_0);
      _jspx_th_liferay$1ui_icon_0.release();
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
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
    _jspx_th_liferay$1ui_message_0.setKey("select-an-existing-form-or-add-a-form-to-be-displayed-in-this-application");
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

  private boolean _jspx_meth_clay_container$1fluid_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:container-fluid
    com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag _jspx_th_clay_container$1fluid_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag();
    _jspx_th_clay_container$1fluid_0.setPageContext(_jspx_page_context);
    _jspx_th_clay_container$1fluid_0.setParent(null);
    int _jspx_eval_clay_container$1fluid_0 = _jspx_th_clay_container$1fluid_0.doStartTag();
    if (_jspx_eval_clay_container$1fluid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_clay_alert_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_container$1fluid_0, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("\t\t\t");
    }
    if (_jspx_th_clay_container$1fluid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_0);
      _jspx_th_clay_container$1fluid_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_0);
    _jspx_th_clay_container$1fluid_0.release();
    return false;
  }

  private boolean _jspx_meth_clay_alert_0(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_container$1fluid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:alert
    com.liferay.frontend.taglib.clay.servlet.taglib.AlertTag _jspx_th_clay_alert_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.AlertTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.AlertTag();
    _jspx_th_clay_alert_0.setPageContext(_jspx_page_context);
    _jspx_th_clay_alert_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_0);
    _jspx_th_clay_alert_0.setDisplayType("warning");
    _jspx_th_clay_alert_0.setMessage("this-form-not-available-or-it-was-not-published");
    int _jspx_eval_clay_alert_0 = _jspx_th_clay_alert_0.doStartTag();
    if (_jspx_th_clay_alert_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_alert_0);
      _jspx_th_clay_alert_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_alert_0);
    _jspx_th_clay_alert_0.release();
    return false;
  }

  private boolean _jspx_meth_clay_container$1fluid_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:container-fluid
    com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag _jspx_th_clay_container$1fluid_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag();
    _jspx_th_clay_container$1fluid_1.setPageContext(_jspx_page_context);
    _jspx_th_clay_container$1fluid_1.setParent(null);
    int _jspx_eval_clay_container$1fluid_1 = _jspx_th_clay_container$1fluid_1.doStartTag();
    if (_jspx_eval_clay_container$1fluid_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_clay_alert_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_container$1fluid_1, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("\t\t\t");
    }
    if (_jspx_th_clay_container$1fluid_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_1);
      _jspx_th_clay_container$1fluid_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_1);
    _jspx_th_clay_container$1fluid_1.release();
    return false;
  }

  private boolean _jspx_meth_clay_alert_1(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_container$1fluid_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:alert
    com.liferay.frontend.taglib.clay.servlet.taglib.AlertTag _jspx_th_clay_alert_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.AlertTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.AlertTag();
    _jspx_th_clay_alert_1.setPageContext(_jspx_page_context);
    _jspx_th_clay_alert_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_1);
    _jspx_th_clay_alert_1.setDisplayType("warning");
    _jspx_th_clay_alert_1.setMessage("you-do-not-have-the-permission-to-view-this-form");
    int _jspx_eval_clay_alert_1 = _jspx_th_clay_alert_1.doStartTag();
    if (_jspx_th_clay_alert_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_alert_1);
      _jspx_th_clay_alert_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_alert_1);
    _jspx_th_clay_alert_1.release();
    return false;
  }

  private boolean _jspx_meth_clay_container$1fluid_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:container-fluid
    com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag _jspx_th_clay_container$1fluid_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag();
    _jspx_th_clay_container$1fluid_2.setPageContext(_jspx_page_context);
    _jspx_th_clay_container$1fluid_2.setParent(null);
    int _jspx_eval_clay_container$1fluid_2 = _jspx_th_clay_container$1fluid_2.doStartTag();
    if (_jspx_eval_clay_container$1fluid_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_clay_alert_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_container$1fluid_2, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("\t\t\t");
    }
    if (_jspx_th_clay_container$1fluid_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_2);
      _jspx_th_clay_container$1fluid_2.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_2);
    _jspx_th_clay_container$1fluid_2.release();
    return false;
  }

  private boolean _jspx_meth_clay_alert_2(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_container$1fluid_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:alert
    com.liferay.frontend.taglib.clay.servlet.taglib.AlertTag _jspx_th_clay_alert_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.AlertTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.AlertTag();
    _jspx_th_clay_alert_2.setPageContext(_jspx_page_context);
    _jspx_th_clay_alert_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_2);
    _jspx_th_clay_alert_2.setDisplayType("warning");
    _jspx_th_clay_alert_2.setMessage("you-need-to-be-signed-in-to-view-this-form");
    int _jspx_eval_clay_alert_2 = _jspx_th_clay_alert_2.doStartTag();
    if (_jspx_th_clay_alert_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_alert_2);
      _jspx_th_clay_alert_2.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_alert_2);
    _jspx_th_clay_alert_2.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_error$1principal_0(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:error-principal
    com.liferay.taglib.ui.ErrorPrincipalTag _jspx_th_liferay$1ui_error$1principal_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorPrincipalTag.class) : new com.liferay.taglib.ui.ErrorPrincipalTag();
    _jspx_th_liferay$1ui_error$1principal_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_error$1principal_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
    int _jspx_eval_liferay$1ui_error$1principal_0 = _jspx_th_liferay$1ui_error$1principal_0.doStartTag();
    if (_jspx_th_liferay$1ui_error$1principal_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error$1principal_0);
      _jspx_th_liferay$1ui_error$1principal_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error$1principal_0);
    _jspx_th_liferay$1ui_error$1principal_0.release();
    return false;
  }

  private boolean _jspx_meth_clay_container$1fluid_4(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:container-fluid
    com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag _jspx_th_clay_container$1fluid_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag();
    _jspx_th_clay_container$1fluid_4.setPageContext(_jspx_page_context);
    _jspx_th_clay_container$1fluid_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
    int _jspx_eval_clay_container$1fluid_4 = _jspx_th_clay_container$1fluid_4.doStartTag();
    if (_jspx_eval_clay_container$1fluid_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_clay_alert_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_container$1fluid_4, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t");
    }
    if (_jspx_th_clay_container$1fluid_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_4);
      _jspx_th_clay_container$1fluid_4.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_4);
    _jspx_th_clay_container$1fluid_4.release();
    return false;
  }

  private boolean _jspx_meth_clay_alert_3(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_container$1fluid_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:alert
    com.liferay.frontend.taglib.clay.servlet.taglib.AlertTag _jspx_th_clay_alert_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.AlertTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.AlertTag();
    _jspx_th_clay_alert_3.setPageContext(_jspx_page_context);
    _jspx_th_clay_alert_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_4);
    _jspx_th_clay_alert_3.setDisplayType("warning");
    _jspx_th_clay_alert_3.setMessage("you-do-not-have-the-permission-to-submit-this-form");
    int _jspx_eval_clay_alert_3 = _jspx_th_clay_alert_3.doStartTag();
    if (_jspx_th_clay_alert_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_alert_3);
      _jspx_th_clay_alert_3.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_alert_3);
    _jspx_th_clay_alert_3.release();
    return false;
  }

  private boolean _jspx_meth_clay_container$1fluid_6(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:container-fluid
    com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag _jspx_th_clay_container$1fluid_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag();
    _jspx_th_clay_container$1fluid_6.setPageContext(_jspx_page_context);
    _jspx_th_clay_container$1fluid_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
    int _jspx_eval_clay_container$1fluid_6 = _jspx_th_clay_container$1fluid_6.doStartTag();
    if (_jspx_eval_clay_container$1fluid_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_clay_alert_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_container$1fluid_6, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");
    }
    if (_jspx_th_clay_container$1fluid_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_6);
      _jspx_th_clay_container$1fluid_6.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_6);
    _jspx_th_clay_container$1fluid_6.release();
    return false;
  }

  private boolean _jspx_meth_clay_alert_5(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_container$1fluid_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:alert
    com.liferay.frontend.taglib.clay.servlet.taglib.AlertTag _jspx_th_clay_alert_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.AlertTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.AlertTag();
    _jspx_th_clay_alert_5.setPageContext(_jspx_page_context);
    _jspx_th_clay_alert_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_6);
    _jspx_th_clay_alert_5.setDisplayType("warning");
    _jspx_th_clay_alert_5.setMessage("you-do-not-have-the-permission-to-access-the-upload-fields-on-this-form");
    int _jspx_eval_clay_alert_5 = _jspx_th_clay_alert_5.doStartTag();
    if (_jspx_th_clay_alert_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_alert_5);
      _jspx_th_clay_alert_5.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_alert_5);
    _jspx_th_clay_alert_5.release();
    return false;
  }

  private boolean _jspx_meth_aui_input_6(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:input
    com.liferay.taglib.aui.InputTag _jspx_th_aui_input_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
    _jspx_th_aui_input_6.setPageContext(_jspx_page_context);
    _jspx_th_aui_input_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
    _jspx_th_aui_input_6.setName("empty");
    _jspx_th_aui_input_6.setType("hidden");
    _jspx_th_aui_input_6.setValue(new String(""));
    int _jspx_eval_aui_input_6 = _jspx_th_aui_input_6.doStartTag();
    if (_jspx_th_aui_input_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_6);
      _jspx_th_aui_input_6.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_6);
    _jspx_th_aui_input_6.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_0(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_0.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
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

  private boolean _jspx_meth_portlet_namespace_1(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_1.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
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

  private boolean _jspx_meth_portlet_namespace_2(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_2.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
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

  private boolean _jspx_meth_portlet_namespace_4(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_4.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_4 = _jspx_th_portlet_namespace_4.doStartTag();
    if (_jspx_th_portlet_namespace_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_4);
      _jspx_th_portlet_namespace_4.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_4);
    _jspx_th_portlet_namespace_4.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_5(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_5.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_5 = _jspx_th_portlet_namespace_5.doStartTag();
    if (_jspx_th_portlet_namespace_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_5);
      _jspx_th_portlet_namespace_5.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_5);
    _jspx_th_portlet_namespace_5.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_6(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_6.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_6 = _jspx_th_portlet_namespace_6.doStartTag();
    if (_jspx_th_portlet_namespace_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_6);
      _jspx_th_portlet_namespace_6.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_6);
    _jspx_th_portlet_namespace_6.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_7(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_7.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_7 = _jspx_th_portlet_namespace_7.doStartTag();
    if (_jspx_th_portlet_namespace_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_7);
      _jspx_th_portlet_namespace_7.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_7);
    _jspx_th_portlet_namespace_7.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_8(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_8.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_8 = _jspx_th_portlet_namespace_8.doStartTag();
    if (_jspx_th_portlet_namespace_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_8);
      _jspx_th_portlet_namespace_8.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_8);
    _jspx_th_portlet_namespace_8.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_9(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_9.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_9 = _jspx_th_portlet_namespace_9.doStartTag();
    if (_jspx_th_portlet_namespace_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_9);
      _jspx_th_portlet_namespace_9.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_9);
    _jspx_th_portlet_namespace_9.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_10(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_10.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_10 = _jspx_th_portlet_namespace_10.doStartTag();
    if (_jspx_th_portlet_namespace_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_10);
      _jspx_th_portlet_namespace_10.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_10);
    _jspx_th_portlet_namespace_10.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_11(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_11.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_11 = _jspx_th_portlet_namespace_11.doStartTag();
    if (_jspx_th_portlet_namespace_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_11);
      _jspx_th_portlet_namespace_11.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_11);
    _jspx_th_portlet_namespace_11.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_12(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_12 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_12.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_12 = _jspx_th_portlet_namespace_12.doStartTag();
    if (_jspx_th_portlet_namespace_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_12);
      _jspx_th_portlet_namespace_12.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_12);
    _jspx_th_portlet_namespace_12.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_13(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_13 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_13.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_13 = _jspx_th_portlet_namespace_13.doStartTag();
    if (_jspx_th_portlet_namespace_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_13);
      _jspx_th_portlet_namespace_13.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_13);
    _jspx_th_portlet_namespace_13.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_14(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_14 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_14.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_14 = _jspx_th_portlet_namespace_14.doStartTag();
    if (_jspx_th_portlet_namespace_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_14);
      _jspx_th_portlet_namespace_14.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_14);
    _jspx_th_portlet_namespace_14.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_15(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_15 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_15.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_15 = _jspx_th_portlet_namespace_15.doStartTag();
    if (_jspx_th_portlet_namespace_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_15);
      _jspx_th_portlet_namespace_15.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_15);
    _jspx_th_portlet_namespace_15.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_16(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_16 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_16.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_16 = _jspx_th_portlet_namespace_16.doStartTag();
    if (_jspx_th_portlet_namespace_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_16);
      _jspx_th_portlet_namespace_16.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_16);
    _jspx_th_portlet_namespace_16.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_17(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_17 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_17.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_17 = _jspx_th_portlet_namespace_17.doStartTag();
    if (_jspx_th_portlet_namespace_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_17);
      _jspx_th_portlet_namespace_17.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_17);
    _jspx_th_portlet_namespace_17.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_18(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_18 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_18.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_18 = _jspx_th_portlet_namespace_18.doStartTag();
    if (_jspx_th_portlet_namespace_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_18);
      _jspx_th_portlet_namespace_18.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_18);
    _jspx_th_portlet_namespace_18.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_19(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_19 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_19.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_19 = _jspx_th_portlet_namespace_19.doStartTag();
    if (_jspx_th_portlet_namespace_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_19);
      _jspx_th_portlet_namespace_19.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_19);
    _jspx_th_portlet_namespace_19.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_20(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_20 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_20.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_20 = _jspx_th_portlet_namespace_20.doStartTag();
    if (_jspx_th_portlet_namespace_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_20);
      _jspx_th_portlet_namespace_20.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_20);
    _jspx_th_portlet_namespace_20.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_21(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_21 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_21.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_21 = _jspx_th_portlet_namespace_21.doStartTag();
    if (_jspx_th_portlet_namespace_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_21);
      _jspx_th_portlet_namespace_21.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_21);
    _jspx_th_portlet_namespace_21.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_22(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_22 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_22.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_22 = _jspx_th_portlet_namespace_22.doStartTag();
    if (_jspx_th_portlet_namespace_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_22);
      _jspx_th_portlet_namespace_22.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_22);
    _jspx_th_portlet_namespace_22.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_23(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_23 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_23.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_23 = _jspx_th_portlet_namespace_23.doStartTag();
    if (_jspx_th_portlet_namespace_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_23);
      _jspx_th_portlet_namespace_23.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_23);
    _jspx_th_portlet_namespace_23.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_24(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_24 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_24.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_24 = _jspx_th_portlet_namespace_24.doStartTag();
    if (_jspx_th_portlet_namespace_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_24);
      _jspx_th_portlet_namespace_24.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_24);
    _jspx_th_portlet_namespace_24.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_25(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_25 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_25.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_25 = _jspx_th_portlet_namespace_25.doStartTag();
    if (_jspx_th_portlet_namespace_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_25);
      _jspx_th_portlet_namespace_25.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_25);
    _jspx_th_portlet_namespace_25.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_26(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_26 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_26.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_26 = _jspx_th_portlet_namespace_26.doStartTag();
    if (_jspx_th_portlet_namespace_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_26);
      _jspx_th_portlet_namespace_26.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_26);
    _jspx_th_portlet_namespace_26.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_27(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_27 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_27.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_27 = _jspx_th_portlet_namespace_27.doStartTag();
    if (_jspx_th_portlet_namespace_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_27);
      _jspx_th_portlet_namespace_27.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_27);
    _jspx_th_portlet_namespace_27.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_28(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_28 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_28.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_28 = _jspx_th_portlet_namespace_28.doStartTag();
    if (_jspx_th_portlet_namespace_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_28);
      _jspx_th_portlet_namespace_28.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_28);
    _jspx_th_portlet_namespace_28.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_29(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_29 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_29.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_29 = _jspx_th_portlet_namespace_29.doStartTag();
    if (_jspx_th_portlet_namespace_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_29);
      _jspx_th_portlet_namespace_29.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_29);
    _jspx_th_portlet_namespace_29.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_30(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_30 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_30.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_30 = _jspx_th_portlet_namespace_30.doStartTag();
    if (_jspx_th_portlet_namespace_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_30);
      _jspx_th_portlet_namespace_30.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_30);
    _jspx_th_portlet_namespace_30.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_31(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_31 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_31.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_31 = _jspx_th_portlet_namespace_31.doStartTag();
    if (_jspx_th_portlet_namespace_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_31);
      _jspx_th_portlet_namespace_31.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_31);
    _jspx_th_portlet_namespace_31.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_32(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_32 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_32.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_32 = _jspx_th_portlet_namespace_32.doStartTag();
    if (_jspx_th_portlet_namespace_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_32);
      _jspx_th_portlet_namespace_32.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_32);
    _jspx_th_portlet_namespace_32.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_33(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_33 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_33.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_33 = _jspx_th_portlet_namespace_33.doStartTag();
    if (_jspx_th_portlet_namespace_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_33);
      _jspx_th_portlet_namespace_33.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_33);
    _jspx_th_portlet_namespace_33.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_34(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_34 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_34.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_34 = _jspx_th_portlet_namespace_34.doStartTag();
    if (_jspx_th_portlet_namespace_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_34);
      _jspx_th_portlet_namespace_34.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_34);
    _jspx_th_portlet_namespace_34.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_35(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_35 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_35.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_35 = _jspx_th_portlet_namespace_35.doStartTag();
    if (_jspx_th_portlet_namespace_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_35);
      _jspx_th_portlet_namespace_35.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_35);
    _jspx_th_portlet_namespace_35.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_36(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_36 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_36.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_36 = _jspx_th_portlet_namespace_36.doStartTag();
    if (_jspx_th_portlet_namespace_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_36);
      _jspx_th_portlet_namespace_36.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_36);
    _jspx_th_portlet_namespace_36.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_37(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_37 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_37.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_37 = _jspx_th_portlet_namespace_37.doStartTag();
    if (_jspx_th_portlet_namespace_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_37);
      _jspx_th_portlet_namespace_37.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_37);
    _jspx_th_portlet_namespace_37.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_38(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_38 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_38.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_38 = _jspx_th_portlet_namespace_38.doStartTag();
    if (_jspx_th_portlet_namespace_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_38);
      _jspx_th_portlet_namespace_38.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_38);
    _jspx_th_portlet_namespace_38.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_39(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_39 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_39.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_39 = _jspx_th_portlet_namespace_39.doStartTag();
    if (_jspx_th_portlet_namespace_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_39);
      _jspx_th_portlet_namespace_39.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_39);
    _jspx_th_portlet_namespace_39.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_4.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_4.setParent(null);
    _jspx_th_liferay$1ui_message_4.setKey("this-form-not-available-or-it-was-not-published");
    int _jspx_eval_liferay$1ui_message_4 = _jspx_th_liferay$1ui_message_4.doStartTag();
    if (_jspx_th_liferay$1ui_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_4);
      _jspx_th_liferay$1ui_message_4.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_4);
    _jspx_th_liferay$1ui_message_4.release();
    return false;
  }
}
