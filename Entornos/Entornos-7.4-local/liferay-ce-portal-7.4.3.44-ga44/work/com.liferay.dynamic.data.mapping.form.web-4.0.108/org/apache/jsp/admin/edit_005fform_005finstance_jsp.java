package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.dynamic.data.mapping.exception.FormInstanceNameException;
import com.liferay.dynamic.data.mapping.exception.FormInstanceSettingsRedirectURLException;
import com.liferay.dynamic.data.mapping.exception.FormInstanceSettingsStorageTypeException;
import com.liferay.dynamic.data.mapping.exception.StorageException;
import com.liferay.dynamic.data.mapping.exception.StructureDefinitionException;
import com.liferay.dynamic.data.mapping.exception.StructureLayoutException;
import com.liferay.dynamic.data.mapping.exception.StructureNameException;
import com.liferay.dynamic.data.mapping.form.field.type.constants.DDMFormFieldTypeConstants;
import com.liferay.dynamic.data.mapping.form.web.internal.FormInstanceFieldSettingsException;
import com.liferay.dynamic.data.mapping.form.web.internal.display.context.DDMFormAdminDisplayContext;
import com.liferay.dynamic.data.mapping.form.web.internal.display.context.DDMFormViewFormInstanceRecordsDisplayContext;
import com.liferay.dynamic.data.mapping.form.web.internal.display.context.helper.FieldSetPermissionCheckerHelper;
import com.liferay.dynamic.data.mapping.form.web.internal.display.context.helper.FormInstancePermissionCheckerHelper;
import com.liferay.dynamic.data.mapping.form.web.internal.display.context.util.DDMFormInstanceExpirationStatusUtil;
import com.liferay.dynamic.data.mapping.form.web.internal.search.DDMFormInstanceRowChecker;
import com.liferay.dynamic.data.mapping.model.DDMForm;
import com.liferay.dynamic.data.mapping.model.DDMFormField;
import com.liferay.dynamic.data.mapping.model.DDMFormInstance;
import com.liferay.dynamic.data.mapping.model.DDMFormInstanceRecord;
import com.liferay.dynamic.data.mapping.model.DDMFormInstanceRecordVersion;
import com.liferay.dynamic.data.mapping.model.DDMStructure;
import com.liferay.dynamic.data.mapping.storage.DDMFormFieldValue;
import com.liferay.dynamic.data.mapping.storage.DDMFormValues;
import com.liferay.dynamic.data.mapping.validator.DDMFormLayoutValidationException;
import com.liferay.dynamic.data.mapping.validator.DDMFormValidationException;
import com.liferay.dynamic.data.mapping.validator.DDMFormValuesValidationException;
import com.liferay.object.model.ObjectDefinition;
import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.bean.BeanParamUtil;
import com.liferay.portal.kernel.dao.search.EmptyOnClickRowChecker;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.frontend.icons.FrontendIconsUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.portlet.url.builder.PortletURLBuilder;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.taglib.search.DateSearchEntry;
import com.liferay.taglib.search.ResultRow;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import javax.portlet.PortletURL;

public final class edit_005fform_005finstance_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/admin/init.jsp");
    _jspx_dependants.add("/admin/init-ext.jsp");
    _jspx_dependants.add("/admin/exceptions.jspf");
    _jspx_dependants.add("/admin/error_model_listener_exception.jspf");
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

DDMFormAdminDisplayContext ddmFormAdminDisplayContext = (DDMFormAdminDisplayContext)request.getAttribute(WebKeys.PORTLET_DISPLAY_CONTEXT);

String dataProviderInstanceParameterSettingsURL = ddmFormAdminDisplayContext.getDataProviderInstanceParameterSettingsURL();
String dataProviderInstancesURL = ddmFormAdminDisplayContext.getDataProviderInstancesURL();
String displayStyle = ddmFormAdminDisplayContext.getDisplayStyle();
JSONObject functionsMetadataJSONObject = ddmFormAdminDisplayContext.getFunctionsMetadataJSONObject();
String functionsURL = ddmFormAdminDisplayContext.getFunctionsURL();
String rolesURL = ddmFormAdminDisplayContext.getRolesURL();
JSONArray ddmFormRulesJSONArray = ddmFormAdminDisplayContext.getDDMFormRulesJSONArray();
JSONObject formBuilderContextJSONObject = ddmFormAdminDisplayContext.getFormBuilderContextJSONObject();

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_aui_script_0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');

String redirect = ParamUtil.getString(request, "redirect");

DDMFormInstance formInstance = ddmFormAdminDisplayContext.getDDMFormInstance();

long formInstanceId = BeanParamUtil.getLong(formInstance, request, "formInstanceId");
long groupId = BeanParamUtil.getLong(formInstance, request, "groupId", scopeGroupId);
long ddmStructureId = BeanParamUtil.getLong(formInstance, request, "structureId");

boolean disableCopyButton = false;

if (!ddmFormAdminDisplayContext.isFormPublished()) {
	disableCopyButton = true;
}

portletDisplay.setShowBackIcon(true);
portletDisplay.setURLBack(redirect);

renderResponse.setTitle((formInstance == null) ? LanguageUtil.get(request, "new-form") : LanguageUtil.get(request, "edit-form"));

      out.write('\n');
      out.write('\n');
      //  portlet:actionURL
      com.liferay.taglib.portlet.ActionURLTag _jspx_th_portlet_actionURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ActionURLTag.class) : new com.liferay.taglib.portlet.ActionURLTag();
      _jspx_th_portlet_actionURL_0.setPageContext(_jspx_page_context);
      _jspx_th_portlet_actionURL_0.setParent(null);
      _jspx_th_portlet_actionURL_0.setName("/dynamic_data_mapping_form/save_form_instance");
      _jspx_th_portlet_actionURL_0.setVar("saveFormInstanceURL");
      int _jspx_eval_portlet_actionURL_0 = _jspx_th_portlet_actionURL_0.doStartTag();
      if (_jspx_eval_portlet_actionURL_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write('\n');
        out.write('	');
        if (_jspx_meth_portlet_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_portlet_actionURL_0, _jspx_page_context))
          return;
        out.write('\n');
      }
      if (_jspx_th_portlet_actionURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_0);
        _jspx_th_portlet_actionURL_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_0);
      _jspx_th_portlet_actionURL_0.release();
      java.lang.String saveFormInstanceURL = null;
      saveFormInstanceURL = (java.lang.String) _jspx_page_context.findAttribute("saveFormInstanceURL");
      out.write('\n');
      out.write('\n');
      //  portlet:actionURL
      com.liferay.taglib.portlet.ActionURLTag _jspx_th_portlet_actionURL_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ActionURLTag.class) : new com.liferay.taglib.portlet.ActionURLTag();
      _jspx_th_portlet_actionURL_1.setPageContext(_jspx_page_context);
      _jspx_th_portlet_actionURL_1.setParent(null);
      _jspx_th_portlet_actionURL_1.setName("/dynamic_data_mapping_form/publish_form_instance");
      _jspx_th_portlet_actionURL_1.setVar("publishFormInstanceURL");
      int _jspx_eval_portlet_actionURL_1 = _jspx_th_portlet_actionURL_1.doStartTag();
      if (_jspx_eval_portlet_actionURL_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write('\n');
        out.write('	');
        if (_jspx_meth_portlet_param_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_portlet_actionURL_1, _jspx_page_context))
          return;
        out.write('\n');
      }
      if (_jspx_th_portlet_actionURL_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_1);
        _jspx_th_portlet_actionURL_1.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_1);
      _jspx_th_portlet_actionURL_1.release();
      java.lang.String publishFormInstanceURL = null;
      publishFormInstanceURL = (java.lang.String) _jspx_page_context.findAttribute("publishFormInstanceURL");
      out.write('\n');
      out.write('\n');
      //  liferay-portlet:resourceURL
      com.liferay.taglib.portlet.ResourceURLTag _jspx_th_liferay$1portlet_resourceURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ResourceURLTag.class) : new com.liferay.taglib.portlet.ResourceURLTag();
      _jspx_th_liferay$1portlet_resourceURL_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1portlet_resourceURL_0.setParent(null);
      _jspx_th_liferay$1portlet_resourceURL_0.setCopyCurrentRenderParameters( false );
      _jspx_th_liferay$1portlet_resourceURL_0.setId("/dynamic_data_mapping_form/save_form_instance");
      _jspx_th_liferay$1portlet_resourceURL_0.setVar("autoSaveFormInstanceURL");
      int _jspx_eval_liferay$1portlet_resourceURL_0 = _jspx_th_liferay$1portlet_resourceURL_0.doStartTag();
      if (_jspx_th_liferay$1portlet_resourceURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_resourceURL_0);
        _jspx_th_liferay$1portlet_resourceURL_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_resourceURL_0);
      _jspx_th_liferay$1portlet_resourceURL_0.release();
      java.lang.String autoSaveFormInstanceURL = null;
      autoSaveFormInstanceURL = (java.lang.String) _jspx_page_context.findAttribute("autoSaveFormInstanceURL");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"lfr-alert-container\">\n");
      out.write("\t");
      if (_jspx_meth_clay_container$1fluid_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"portlet-forms\" id=\"");
      if (_jspx_meth_portlet_namespace_1(_jspx_page_context))
        return;
      out.write("formContainer\">\n");
      out.write("\t<div class=\"forms-navigation-bar\">\n");
      out.write("\t\t");
      //  clay:navigation-bar
      com.liferay.frontend.taglib.clay.servlet.taglib.NavigationBarTag _jspx_th_clay_navigation$1bar_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.NavigationBarTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.NavigationBarTag();
      _jspx_th_clay_navigation$1bar_0.setPageContext(_jspx_page_context);
      _jspx_th_clay_navigation$1bar_0.setParent(null);
      _jspx_th_clay_navigation$1bar_0.setId("formsNavigationBar");
      _jspx_th_clay_navigation$1bar_0.setInverted( true );
      _jspx_th_clay_navigation$1bar_0.setNavigationItems( ddmFormAdminDisplayContext.getFormBuilderNavigationItems() );
      int _jspx_eval_clay_navigation$1bar_0 = _jspx_th_clay_navigation$1bar_0.doStartTag();
      if (_jspx_th_clay_navigation$1bar_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_navigation$1bar_0);
        _jspx_th_clay_navigation$1bar_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_navigation$1bar_0);
      _jspx_th_clay_navigation$1bar_0.release();
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<nav class=\"hide management-bar management-bar-light navbar navbar-expand-md toolbar-group-field\" id=\"");
      if (_jspx_meth_portlet_namespace_2(_jspx_page_context))
        return;
      out.write("managementToolbar\">\n");
      out.write("\t\t");
      //  clay:container-fluid
      com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag _jspx_th_clay_container$1fluid_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag();
      _jspx_th_clay_container$1fluid_1.setPageContext(_jspx_page_context);
      _jspx_th_clay_container$1fluid_1.setParent(null);
      _jspx_th_clay_container$1fluid_1.setCssClass("autosave-bar d-flex justify-content-between toolbar");
      int _jspx_eval_clay_container$1fluid_1 = _jspx_th_clay_container$1fluid_1.doStartTag();
      if (_jspx_eval_clay_container$1fluid_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t<div class=\"autosave-feedback-container navbar-form navbar-form-autofit navbar-overlay toolbar-group-content\">\n");
        out.write("\t\t\t\t<span class=\"autosave-feedback management-bar-text\" id=\"");
        if (_jspx_meth_portlet_namespace_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_container$1fluid_1, _jspx_page_context))
          return;
        out.write("autosaveMessage\"></span>\n");
        out.write("\t\t\t</div>\n");
        out.write("\n");
        out.write("\t\t\t<ul class=\"navbar-nav toolbar-group-field\">\n");
        out.write("\t\t\t\t<li class=\"nav-item pr-3\">\n");
        out.write("\t\t\t\t\t<button class=\"btn btn-monospaced btn-outline-borderless btn-outline-secondary btn-sm lfr-ddm-button lfr-ddm-settings-button\" title=\"");
        out.print( LanguageUtil.get(request, "settings") );
        out.write("\">\n");
        out.write("\t\t\t\t\t\t<svg class=\"lexicon-icon\">\n");
        out.write("\t\t\t\t\t\t\t<use xlink:href=\"");
        out.print( ddmFormAdminDisplayContext.getLexiconIconsPath() );
        out.write("cog\" />\n");
        out.write("\t\t\t\t\t\t</svg>\n");
        out.write("\t\t\t\t\t</button>\n");
        out.write("\t\t\t\t</li>\n");
        out.write("\t\t\t\t<li class=\"nav-item pr-2\">\n");
        out.write("\t\t\t\t\t");
        out.write("\n");
        out.write("\t\t\t\t\t\t");
if (
 disableCopyButton ) {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t<button class=\"btn btn-secondary btn-sm disabled lfr-ddm-button lfr-ddm-share-url-button share-form-icon\" data-original-title=\"");
        if (_jspx_meth_liferay$1ui_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_container$1fluid_1, _jspx_page_context))
          return;
        out.write("\" id=\"");
        if (_jspx_meth_portlet_namespace_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_container$1fluid_1, _jspx_page_context))
          return;
        out.write("publishIcon\" title=\"");
        out.print( disableCopyButton ? LanguageUtil.get(request, "publish-the-form-to-get-its-shareable-link") : "" );
        out.write("\" type=\"button\">\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_liferay$1ui_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_container$1fluid_1, _jspx_page_context))
          return;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t</button>\n");
        out.write("\t\t\t\t\t\t");
        out.write("\n");
        out.write("\t\t\t\t\t\t");
}
else {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t<button class=\"btn btn-secondary btn-sm lfr-ddm-button lfr-ddm-share-url-button share-form-icon\" id=\"");
        if (_jspx_meth_portlet_namespace_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_container$1fluid_1, _jspx_page_context))
          return;
        out.write("publishIcon\" type=\"button\">\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_liferay$1ui_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_container$1fluid_1, _jspx_page_context))
          return;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t</button>\n");
        out.write("\t\t\t\t\t\t");
        out.write("\n");
        out.write("\t\t\t\t\t");
}
        out.write("\n");
        out.write("\t\t\t\t</li>\n");
        out.write("\t\t\t\t<li class=\"nav-item pr-2\">\n");
        out.write("\t\t\t\t\t<button class=\"btn btn-secondary btn-sm lfr-ddm-button lfr-ddm-preview-button\" title=\"");
        out.print( LanguageUtil.get(request, "a-form-draft-will-be-saved-before-the-preview") );
        out.write("\">\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_liferay$1ui_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_container$1fluid_1, _jspx_page_context))
          return;
        out.write("\n");
        out.write("\t\t\t\t\t</button>\n");
        out.write("\t\t\t\t</li>\n");
        out.write("\t\t\t\t<li class=\"nav-item pl-2 pr-2\">\n");
        out.write("\t\t\t\t\t<button class=\"btn btn-secondary btn-sm lfr-ddm-button lfr-ddm-save-button\">\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_liferay$1ui_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_container$1fluid_1, _jspx_page_context))
          return;
        out.write("\n");
        out.write("\t\t\t\t\t</button>\n");
        out.write("\t\t\t\t</li>\n");
        out.write("\t\t\t\t<li class=\"nav-item pr-2\">\n");
        out.write("\t\t\t\t\t<button class=\"btn ");
        out.print( ddmFormAdminDisplayContext.isFormPublished() ? "btn-secondary" : "btn-primary" );
        out.write(" btn-sm lfr-ddm-button lfr-ddm-publish-button\">\n");
        out.write("\t\t\t\t\t\t");
        out.print( ddmFormAdminDisplayContext.isFormPublished() ? LanguageUtil.get(request, "unpublish") : LanguageUtil.get(request, "publish") );
        out.write("\n");
        out.write("\t\t\t\t\t</button>\n");
        out.write("\t\t\t\t</li>\n");
        out.write("\t\t\t\t<li class=\"nav-item\">\n");
        out.write("\t\t\t\t\t<button class=\"btn btn-primary btn-sm lfr-ddm-add-field lfr-ddm-plus-button nav-btn nav-btn-monospaced\" id=\"addFieldButton\" title=\"");
        out.print( LanguageUtil.get(request, "add-elements") );
        out.write("\">\n");
        out.write("\t\t\t\t\t\t<svg class=\"lexicon-icon\">\n");
        out.write("\t\t\t\t\t\t\t<use xlink:href=\"");
        out.print( ddmFormAdminDisplayContext.getLexiconIconsPath() );
        out.write("plus\" />\n");
        out.write("\t\t\t\t\t\t</svg>\n");
        out.write("\t\t\t\t\t</button>\n");
        out.write("\t\t\t\t</li>\n");
        out.write("\t\t\t</ul>\n");
        out.write("\t\t");
      }
      if (_jspx_th_clay_container$1fluid_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_1);
        _jspx_th_clay_container$1fluid_1.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_1);
      _jspx_th_clay_container$1fluid_1.release();
      out.write("\n");
      out.write("\t</nav>\n");
      out.write("\n");
      out.write("\t");
      //  clay:container-fluid
      com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag _jspx_th_clay_container$1fluid_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag();
      _jspx_th_clay_container$1fluid_2.setPageContext(_jspx_page_context);
      _jspx_th_clay_container$1fluid_2.setParent(null);
      _jspx_th_clay_container$1fluid_2.setCssClass("ddm-translation-manager hide");
      int _jspx_eval_clay_container$1fluid_2 = _jspx_th_clay_container$1fluid_2.doStartTag();
      if (_jspx_eval_clay_container$1fluid_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t");
        //  liferay-frontend:translation-manager
        com.liferay.frontend.taglib.servlet.taglib.TranslationManagerTag _jspx_th_liferay$1frontend_translation$1manager_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.TranslationManagerTag.class) : new com.liferay.frontend.taglib.servlet.taglib.TranslationManagerTag();
        _jspx_th_liferay$1frontend_translation$1manager_0.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1frontend_translation$1manager_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_2);
        _jspx_th_liferay$1frontend_translation$1manager_0.setAvailableLocales( ddmFormAdminDisplayContext.getAvailableLocales() );
        _jspx_th_liferay$1frontend_translation$1manager_0.setChangeableDefaultLanguage( false );
        _jspx_th_liferay$1frontend_translation$1manager_0.setDefaultLanguageId( ddmFormAdminDisplayContext.getDefaultLanguageId() );
        _jspx_th_liferay$1frontend_translation$1manager_0.setId("translationManager");
        int _jspx_eval_liferay$1frontend_translation$1manager_0 = _jspx_th_liferay$1frontend_translation$1manager_0.doStartTag();
        if (_jspx_th_liferay$1frontend_translation$1manager_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_translation$1manager_0);
          _jspx_th_liferay$1frontend_translation$1manager_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_translation$1manager_0);
        _jspx_th_liferay$1frontend_translation$1manager_0.release();
        out.write('\n');
        out.write('	');
      }
      if (_jspx_th_clay_container$1fluid_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_2);
        _jspx_th_clay_container$1fluid_2.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_2);
      _jspx_th_clay_container$1fluid_2.release();
      out.write("\n");
      out.write("\n");
      out.write("\t");
      //  aui:form
      com.liferay.taglib.aui.FormTag _jspx_th_aui_form_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FormTag.class) : new com.liferay.taglib.aui.FormTag();
      _jspx_th_aui_form_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_form_0.setParent(null);
      _jspx_th_aui_form_0.setAction( saveFormInstanceURL );
      _jspx_th_aui_form_0.setCssClass("ddm-form-builder-form");
      _jspx_th_aui_form_0.setDynamicAttribute(null, "enctype", new String("multipart/form-data"));
      _jspx_th_aui_form_0.setMethod("post");
      _jspx_th_aui_form_0.setName("editForm");
      int _jspx_eval_aui_form_0 = _jspx_th_aui_form_0.doStartTag();
      if (_jspx_eval_aui_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_0.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_0.setName("redirect");
        _jspx_th_aui_input_0.setType("hidden");
        _jspx_th_aui_input_0.setValue( redirect );
        int _jspx_eval_aui_input_0 = _jspx_th_aui_input_0.doStartTag();
        if (_jspx_th_aui_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_0);
          _jspx_th_aui_input_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_0);
        _jspx_th_aui_input_0.release();
        out.write("\n");
        out.write("\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_1.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_1.setName("formInstanceId");
        _jspx_th_aui_input_1.setType("hidden");
        _jspx_th_aui_input_1.setValue( formInstanceId );
        int _jspx_eval_aui_input_1 = _jspx_th_aui_input_1.doStartTag();
        if (_jspx_th_aui_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_1);
          _jspx_th_aui_input_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_1);
        _jspx_th_aui_input_1.release();
        out.write("\n");
        out.write("\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_2.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_2.setName("groupId");
        _jspx_th_aui_input_2.setType("hidden");
        _jspx_th_aui_input_2.setValue( groupId );
        int _jspx_eval_aui_input_2 = _jspx_th_aui_input_2.doStartTag();
        if (_jspx_th_aui_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_2);
          _jspx_th_aui_input_2.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_2);
        _jspx_th_aui_input_2.release();
        out.write("\n");
        out.write("\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_3.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_3.setName("ddmStructureId");
        _jspx_th_aui_input_3.setType("hidden");
        _jspx_th_aui_input_3.setValue( ddmStructureId );
        int _jspx_eval_aui_input_3 = _jspx_th_aui_input_3.doStartTag();
        if (_jspx_th_aui_input_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_3);
          _jspx_th_aui_input_3.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_3);
        _jspx_th_aui_input_3.release();
        out.write("\n");
        out.write("\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_4.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_4.setName("name");
        _jspx_th_aui_input_4.setType("hidden");
        _jspx_th_aui_input_4.setValue( ddmFormAdminDisplayContext.getFormLocalizedNameJSONObject(formInstance) );
        int _jspx_eval_aui_input_4 = _jspx_th_aui_input_4.doStartTag();
        if (_jspx_th_aui_input_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_4);
          _jspx_th_aui_input_4.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_4);
        _jspx_th_aui_input_4.release();
        out.write("\n");
        out.write("\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_5.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_5.setName("description");
        _jspx_th_aui_input_5.setType("hidden");
        _jspx_th_aui_input_5.setValue( ddmFormAdminDisplayContext.getFormLocalizedDescriptionJSONObject() );
        int _jspx_eval_aui_input_5 = _jspx_th_aui_input_5.doStartTag();
        if (_jspx_th_aui_input_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_5);
          _jspx_th_aui_input_5.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_5);
        _jspx_th_aui_input_5.release();
        out.write("\n");
        out.write("\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_6.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_6.setName("serializedFormBuilderContext");
        _jspx_th_aui_input_6.setType("hidden");
        _jspx_th_aui_input_6.setValue( formBuilderContextJSONObject );
        int _jspx_eval_aui_input_6 = _jspx_th_aui_input_6.doStartTag();
        if (_jspx_th_aui_input_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_6);
          _jspx_th_aui_input_6.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_6);
        _jspx_th_aui_input_6.release();
        out.write("\n");
        out.write("\t\t");
        if (_jspx_meth_aui_input_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_form_0, _jspx_page_context))
          return;
        out.write("\n");
        out.write("\n");
        out.write("\t\t");
        out.write('\n');
        out.write('\n');
        //  clay:container-fluid
        com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag _jspx_th_clay_container$1fluid_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag();
        _jspx_th_clay_container$1fluid_3.setPageContext(_jspx_page_context);
        _jspx_th_clay_container$1fluid_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        int _jspx_eval_clay_container$1fluid_3 = _jspx_th_clay_container$1fluid_3.doStartTag();
        if (_jspx_eval_clay_container$1fluid_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t<div class=\"ddm-form-web__exception-container ddm-form-web__exception-container--sidebar-open\">\n");
          out.write("\t\t");
          out.write('\n');
          out.write('\n');
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
          _jspx_th_liferay$1ui_error_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_error_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_3);
          _jspx_th_liferay$1ui_error_0.setException( ModelListenerException.class );
          int _jspx_eval_liferay$1ui_error_0 = _jspx_th_liferay$1ui_error_0.doStartTag();
          if (_jspx_eval_liferay$1ui_error_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Object errorException = null;
            if (_jspx_eval_liferay$1ui_error_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_liferay$1ui_error_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_liferay$1ui_error_0.doInitBody();
            }
            errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
            do {
              out.write("\n");
              out.write("\n");
              out.write("\t");

	ModelListenerException modelListenerException = (ModelListenerException)errorException;

	String message = modelListenerException.getMessage();

	if (Validator.isNull(message)) {
		message = LanguageUtil.get(request, "an-unexpected-error-occurred");
	}
	
              out.write("\n");
              out.write("\n");
              out.write("\t");
              out.print( message );
              out.write('\n');
              int evalDoAfterBody = _jspx_th_liferay$1ui_error_0.doAfterBody();
              errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_liferay$1ui_error_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_liferay$1ui_error_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_0);
            _jspx_th_liferay$1ui_error_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_0);
          _jspx_th_liferay$1ui_error_0.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t<div>\n");
          out.write("\t\t\t");
          //  react:component
          com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag _jspx_th_react_component_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag.class) : new com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag();
          _jspx_th_react_component_0.setPageContext(_jspx_page_context);
          _jspx_th_react_component_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_3);
          _jspx_th_react_component_0.setModule("admin/js/util/ShowPartialResultsAlert");
          _jspx_th_react_component_0.setProps(
					HashMapBuilder.<String, Object>put(
						"showPartialResultsToRespondents", ddmFormAdminDisplayContext.isShowPartialResultsToRespondents(ddmFormAdminDisplayContext.getDDMFormInstance())
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
          out.write("\t\t</div>\n");
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
          _jspx_th_liferay$1ui_error_1.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_error_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_3);
          _jspx_th_liferay$1ui_error_1.setException( DDMFormLayoutValidationException.class );
          _jspx_th_liferay$1ui_error_1.setMessage("please-enter-a-valid-form-layout");
          int _jspx_eval_liferay$1ui_error_1 = _jspx_th_liferay$1ui_error_1.doStartTag();
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
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
          _jspx_th_liferay$1ui_error_2.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_error_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_3);
          _jspx_th_liferay$1ui_error_2.setException( DDMFormLayoutValidationException.MustNotDuplicateFieldName.class );
          int _jspx_eval_liferay$1ui_error_2 = _jspx_th_liferay$1ui_error_2.doStartTag();
          if (_jspx_eval_liferay$1ui_error_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Object errorException = null;
            if (_jspx_eval_liferay$1ui_error_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_liferay$1ui_error_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_liferay$1ui_error_2.doInitBody();
            }
            errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
            do {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");

			DDMFormLayoutValidationException.MustNotDuplicateFieldName mndfn = (DDMFormLayoutValidationException.MustNotDuplicateFieldName)errorException;
			
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");
              //  liferay-ui:message
              com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
              _jspx_th_liferay$1ui_message_5.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_error_2);
              _jspx_th_liferay$1ui_message_5.setArguments( HtmlUtil.escape(StringUtil.merge(mndfn.getDuplicatedFieldNames(), StringPool.COMMA_AND_SPACE)) );
              _jspx_th_liferay$1ui_message_5.setKey("the-definition-field-name-x-was-defined-more-than-once");
              _jspx_th_liferay$1ui_message_5.setTranslateArguments( false );
              int _jspx_eval_liferay$1ui_message_5 = _jspx_th_liferay$1ui_message_5.doStartTag();
              if (_jspx_th_liferay$1ui_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_5);
                _jspx_th_liferay$1ui_message_5.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_5);
              _jspx_th_liferay$1ui_message_5.release();
              out.write("\n");
              out.write("\t\t");
              int evalDoAfterBody = _jspx_th_liferay$1ui_error_2.doAfterBody();
              errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_liferay$1ui_error_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_liferay$1ui_error_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_2);
            _jspx_th_liferay$1ui_error_2.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_2);
          _jspx_th_liferay$1ui_error_2.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
          _jspx_th_liferay$1ui_error_3.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_error_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_3);
          _jspx_th_liferay$1ui_error_3.setException( DDMFormValidationException.class );
          _jspx_th_liferay$1ui_error_3.setMessage("please-enter-a-valid-form-definition");
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
          out.write("\t\t");
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
          _jspx_th_liferay$1ui_error_4.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_error_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_3);
          _jspx_th_liferay$1ui_error_4.setException( DDMFormValidationException.MustNotDuplicateFieldName.class );
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
              out.write("\t\t\t");

			DDMFormValidationException.MustNotDuplicateFieldName mndfn = (DDMFormValidationException.MustNotDuplicateFieldName)errorException;
			
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");
              //  liferay-ui:message
              com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
              _jspx_th_liferay$1ui_message_6.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_message_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_error_4);
              _jspx_th_liferay$1ui_message_6.setArguments( HtmlUtil.escape(mndfn.getFieldName()) );
              _jspx_th_liferay$1ui_message_6.setKey("the-definition-field-name-x-was-defined-more-than-once");
              _jspx_th_liferay$1ui_message_6.setTranslateArguments( false );
              int _jspx_eval_liferay$1ui_message_6 = _jspx_th_liferay$1ui_message_6.doStartTag();
              if (_jspx_th_liferay$1ui_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_6);
                _jspx_th_liferay$1ui_message_6.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_6);
              _jspx_th_liferay$1ui_message_6.release();
              out.write("\n");
              out.write("\t\t");
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
          out.write("\t\t");
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
          _jspx_th_liferay$1ui_error_5.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_error_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_3);
          _jspx_th_liferay$1ui_error_5.setException( DDMFormValidationException.MustSetFieldsForForm.class );
          _jspx_th_liferay$1ui_error_5.setMessage("please-add-at-least-one-field");
          int _jspx_eval_liferay$1ui_error_5 = _jspx_th_liferay$1ui_error_5.doStartTag();
          if (_jspx_th_liferay$1ui_error_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_5);
            _jspx_th_liferay$1ui_error_5.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_5);
          _jspx_th_liferay$1ui_error_5.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
          _jspx_th_liferay$1ui_error_6.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_error_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_3);
          _jspx_th_liferay$1ui_error_6.setException( DDMFormValidationException.MustSetOptionsForField.class );
          int _jspx_eval_liferay$1ui_error_6 = _jspx_th_liferay$1ui_error_6.doStartTag();
          if (_jspx_eval_liferay$1ui_error_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Object errorException = null;
            if (_jspx_eval_liferay$1ui_error_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_liferay$1ui_error_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_liferay$1ui_error_6.doInitBody();
            }
            errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
            do {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");

			DDMFormValidationException.MustSetOptionsForField msoff = (DDMFormValidationException.MustSetOptionsForField)errorException;
			
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");
              //  liferay-ui:message
              com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
              _jspx_th_liferay$1ui_message_7.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_message_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_error_6);
              _jspx_th_liferay$1ui_message_7.setArguments( HtmlUtil.escape(msoff.getFieldLabel()) );
              _jspx_th_liferay$1ui_message_7.setKey("at-least-one-option-should-be-set-for-field-x");
              _jspx_th_liferay$1ui_message_7.setTranslateArguments( false );
              int _jspx_eval_liferay$1ui_message_7 = _jspx_th_liferay$1ui_message_7.doStartTag();
              if (_jspx_th_liferay$1ui_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_7);
                _jspx_th_liferay$1ui_message_7.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_7);
              _jspx_th_liferay$1ui_message_7.release();
              out.write("\n");
              out.write("\t\t");
              int evalDoAfterBody = _jspx_th_liferay$1ui_error_6.doAfterBody();
              errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_liferay$1ui_error_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_liferay$1ui_error_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_6);
            _jspx_th_liferay$1ui_error_6.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_6);
          _jspx_th_liferay$1ui_error_6.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
          _jspx_th_liferay$1ui_error_7.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_error_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_3);
          _jspx_th_liferay$1ui_error_7.setException( DDMFormValidationException.MustSetValidCharactersForFieldName.class );
          int _jspx_eval_liferay$1ui_error_7 = _jspx_th_liferay$1ui_error_7.doStartTag();
          if (_jspx_eval_liferay$1ui_error_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Object errorException = null;
            if (_jspx_eval_liferay$1ui_error_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_liferay$1ui_error_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_liferay$1ui_error_7.doInitBody();
            }
            errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
            do {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");

			DDMFormValidationException.MustSetValidCharactersForFieldName msvcffn = (DDMFormValidationException.MustSetValidCharactersForFieldName)errorException;
			
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");
              //  liferay-ui:message
              com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
              _jspx_th_liferay$1ui_message_8.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_message_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_error_7);
              _jspx_th_liferay$1ui_message_8.setArguments( HtmlUtil.escape(msvcffn.getFieldName()) );
              _jspx_th_liferay$1ui_message_8.setKey("invalid-characters-were-defined-for-field-name-x");
              _jspx_th_liferay$1ui_message_8.setTranslateArguments( false );
              int _jspx_eval_liferay$1ui_message_8 = _jspx_th_liferay$1ui_message_8.doStartTag();
              if (_jspx_th_liferay$1ui_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_8);
                _jspx_th_liferay$1ui_message_8.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_8);
              _jspx_th_liferay$1ui_message_8.release();
              out.write("\n");
              out.write("\t\t");
              int evalDoAfterBody = _jspx_th_liferay$1ui_error_7.doAfterBody();
              errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_liferay$1ui_error_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_liferay$1ui_error_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_7);
            _jspx_th_liferay$1ui_error_7.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_7);
          _jspx_th_liferay$1ui_error_7.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
          _jspx_th_liferay$1ui_error_8.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_error_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_3);
          _jspx_th_liferay$1ui_error_8.setException( DDMFormValidationException.MustSetValidFormRuleExpression.class );
          _jspx_th_liferay$1ui_error_8.setMessage("there-are-invalid-rule-expressions");
          int _jspx_eval_liferay$1ui_error_8 = _jspx_th_liferay$1ui_error_8.doStartTag();
          if (_jspx_th_liferay$1ui_error_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_8);
            _jspx_th_liferay$1ui_error_8.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_8);
          _jspx_th_liferay$1ui_error_8.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
          _jspx_th_liferay$1ui_error_9.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_error_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_3);
          _jspx_th_liferay$1ui_error_9.setException( DDMFormValidationException.MustSetValidValidationExpression.class );
          int _jspx_eval_liferay$1ui_error_9 = _jspx_th_liferay$1ui_error_9.doStartTag();
          if (_jspx_eval_liferay$1ui_error_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Object errorException = null;
            if (_jspx_eval_liferay$1ui_error_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_liferay$1ui_error_9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_liferay$1ui_error_9.doInitBody();
            }
            errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
            do {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");

			DDMFormValidationException.MustSetValidValidationExpression msvve = (DDMFormValidationException.MustSetValidValidationExpression)errorException;
			
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");
              //  liferay-ui:message
              com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
              _jspx_th_liferay$1ui_message_9.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_message_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_error_9);
              _jspx_th_liferay$1ui_message_9.setArguments( new Object[] {StringBundler.concat("<b>", HtmlUtil.escape(msvve.getValidationExpressionArgument()), "</b>"), StringBundler.concat("<b>", HtmlUtil.escape(msvve.getFieldName()), "</b>")} );
              _jspx_th_liferay$1ui_message_9.setKey("the-validation-expression-x-set-for-field-x-is-invalid");
              _jspx_th_liferay$1ui_message_9.setTranslateArguments( false );
              int _jspx_eval_liferay$1ui_message_9 = _jspx_th_liferay$1ui_message_9.doStartTag();
              if (_jspx_th_liferay$1ui_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_9);
                _jspx_th_liferay$1ui_message_9.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_9);
              _jspx_th_liferay$1ui_message_9.release();
              out.write("\n");
              out.write("\t\t");
              int evalDoAfterBody = _jspx_th_liferay$1ui_error_9.doAfterBody();
              errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_liferay$1ui_error_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_liferay$1ui_error_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_9);
            _jspx_th_liferay$1ui_error_9.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_9);
          _jspx_th_liferay$1ui_error_9.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
          _jspx_th_liferay$1ui_error_10.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_error_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_3);
          _jspx_th_liferay$1ui_error_10.setException( DDMFormValidationException.MustSetValidVisibilityExpression.class );
          int _jspx_eval_liferay$1ui_error_10 = _jspx_th_liferay$1ui_error_10.doStartTag();
          if (_jspx_eval_liferay$1ui_error_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Object errorException = null;
            if (_jspx_eval_liferay$1ui_error_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_liferay$1ui_error_10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_liferay$1ui_error_10.doInitBody();
            }
            errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
            do {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");

			DDMFormValidationException.MustSetValidVisibilityExpression msvve = (DDMFormValidationException.MustSetValidVisibilityExpression)errorException;
			
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");
              //  liferay-ui:message
              com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
              _jspx_th_liferay$1ui_message_10.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_message_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_error_10);
              _jspx_th_liferay$1ui_message_10.setArguments( new Object[] {HtmlUtil.escape(msvve.getVisibilityExpression()), HtmlUtil.escape(msvve.getFieldName())} );
              _jspx_th_liferay$1ui_message_10.setKey("the-visibility-expression-x-set-for-field-x-is-invalid");
              _jspx_th_liferay$1ui_message_10.setTranslateArguments( false );
              int _jspx_eval_liferay$1ui_message_10 = _jspx_th_liferay$1ui_message_10.doStartTag();
              if (_jspx_th_liferay$1ui_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_10);
                _jspx_th_liferay$1ui_message_10.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_10);
              _jspx_th_liferay$1ui_message_10.release();
              out.write("\n");
              out.write("\t\t");
              int evalDoAfterBody = _jspx_th_liferay$1ui_error_10.doAfterBody();
              errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_liferay$1ui_error_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_liferay$1ui_error_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_10);
            _jspx_th_liferay$1ui_error_10.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_10);
          _jspx_th_liferay$1ui_error_10.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t");

		boolean showExpirationDateError = false;
		
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
          _jspx_th_liferay$1ui_error_11.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_error_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_3);
          _jspx_th_liferay$1ui_error_11.setException( DDMFormValuesValidationException.MustSetValidValue.class );
          int _jspx_eval_liferay$1ui_error_11 = _jspx_th_liferay$1ui_error_11.doStartTag();
          if (_jspx_eval_liferay$1ui_error_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Object errorException = null;
            if (_jspx_eval_liferay$1ui_error_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_liferay$1ui_error_11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_liferay$1ui_error_11.doInitBody();
            }
            errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
            do {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");

			DDMFormValuesValidationException.MustSetValidValue msvv = (DDMFormValuesValidationException.MustSetValidValue)errorException;

			String fieldLabelValue = msvv.getFieldLabelValue(themeDisplay.getLocale());

			if (Validator.isNull(fieldLabelValue)) {
				fieldLabelValue = msvv.getFieldName();
			}

			showExpirationDateError = Objects.equals(msvv.getFieldName(), "expirationDate");
			
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t");
if (
 showExpirationDateError ) {
              out.write("\n");
              out.write("\t\t\t\t\t");
              if (_jspx_meth_liferay$1ui_message_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_error_11, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t");
}
else {
              out.write("\n");
              out.write("\t\t\t\t\t");
              //  liferay-ui:message
              com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_12 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
              _jspx_th_liferay$1ui_message_12.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_message_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_error_11);
              _jspx_th_liferay$1ui_message_12.setArguments( HtmlUtil.escape(fieldLabelValue) );
              _jspx_th_liferay$1ui_message_12.setKey("validation-failed-for-field-x");
              _jspx_th_liferay$1ui_message_12.setTranslateArguments( false );
              int _jspx_eval_liferay$1ui_message_12 = _jspx_th_liferay$1ui_message_12.doStartTag();
              if (_jspx_th_liferay$1ui_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_12);
                _jspx_th_liferay$1ui_message_12.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_12);
              _jspx_th_liferay$1ui_message_12.release();
              out.write("\n");
              out.write("\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t");
}
              out.write("\n");
              out.write("\t\t");
              int evalDoAfterBody = _jspx_th_liferay$1ui_error_11.doAfterBody();
              errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_liferay$1ui_error_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_liferay$1ui_error_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_11);
            _jspx_th_liferay$1ui_error_11.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_11);
          _jspx_th_liferay$1ui_error_11.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_12 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
          _jspx_th_liferay$1ui_error_12.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_error_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_3);
          _jspx_th_liferay$1ui_error_12.setException( FormInstanceFieldSettingsException.MustSetValidValueForProperties.class );
          int _jspx_eval_liferay$1ui_error_12 = _jspx_th_liferay$1ui_error_12.doStartTag();
          if (_jspx_eval_liferay$1ui_error_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Object errorException = null;
            if (_jspx_eval_liferay$1ui_error_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_liferay$1ui_error_12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_liferay$1ui_error_12.doInitBody();
            }
            errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
            do {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");

			FormInstanceFieldSettingsException.MustSetValidValueForProperties msvvfp = (FormInstanceFieldSettingsException.MustSetValidValueForProperties)errorException;

			Map<String, Set<String>> fieldNamePropertiesMap = msvvfp.getFieldNamePropertiesMap();

			StringBundler sb = new StringBundler(fieldNamePropertiesMap.size());

			for (Entry<String, Set<String>> fieldNameProperties : fieldNamePropertiesMap.entrySet()) {
				Set<String> value = fieldNameProperties.getValue();

				sb.append(LanguageUtil.format(request, (value.size() == 1) ? "the-setting-x-set-for-field-x-is-invalid" : "the-settings-x-set-for-field-x-are-invalid", new Object[] {HtmlUtil.escape(StringUtil.merge(value, StringPool.COMMA_AND_SPACE)), HtmlUtil.escape(fieldNameProperties.getKey())}, false));

				sb.append(StringPool.SPACE);
			}

			sb.setIndex(sb.index() - 1);
			
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");
              out.print( sb.toString() );
              out.write("\n");
              out.write("\t\t");
              int evalDoAfterBody = _jspx_th_liferay$1ui_error_12.doAfterBody();
              errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_liferay$1ui_error_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_liferay$1ui_error_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_12);
            _jspx_th_liferay$1ui_error_12.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_12);
          _jspx_th_liferay$1ui_error_12.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_13 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
          _jspx_th_liferay$1ui_error_13.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_error_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_3);
          _jspx_th_liferay$1ui_error_13.setException( FormInstanceNameException.class );
          _jspx_th_liferay$1ui_error_13.setMessage("please-enter-a-valid-form-name");
          int _jspx_eval_liferay$1ui_error_13 = _jspx_th_liferay$1ui_error_13.doStartTag();
          if (_jspx_th_liferay$1ui_error_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_13);
            _jspx_th_liferay$1ui_error_13.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_13);
          _jspx_th_liferay$1ui_error_13.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_14 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
          _jspx_th_liferay$1ui_error_14.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_error_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_3);
          _jspx_th_liferay$1ui_error_14.setException( FormInstanceSettingsRedirectURLException.class );
          int _jspx_eval_liferay$1ui_error_14 = _jspx_th_liferay$1ui_error_14.doStartTag();
          if (_jspx_eval_liferay$1ui_error_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Object errorException = null;
            if (_jspx_eval_liferay$1ui_error_14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_liferay$1ui_error_14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_liferay$1ui_error_14.doInitBody();
            }
            errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
            do {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");

			FormInstanceSettingsRedirectURLException formInstanceSettingsRedirectURLException = (FormInstanceSettingsRedirectURLException)errorException;
			
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");
              out.print( formInstanceSettingsRedirectURLException.getMessage() );
              out.write("\n");
              out.write("\t\t");
              int evalDoAfterBody = _jspx_th_liferay$1ui_error_14.doAfterBody();
              errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_liferay$1ui_error_14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_liferay$1ui_error_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_14);
            _jspx_th_liferay$1ui_error_14.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_14);
          _jspx_th_liferay$1ui_error_14.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_15 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
          _jspx_th_liferay$1ui_error_15.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_error_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_3);
          _jspx_th_liferay$1ui_error_15.setException( FormInstanceSettingsStorageTypeException.class );
          int _jspx_eval_liferay$1ui_error_15 = _jspx_th_liferay$1ui_error_15.doStartTag();
          if (_jspx_eval_liferay$1ui_error_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Object errorException = null;
            if (_jspx_eval_liferay$1ui_error_15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_liferay$1ui_error_15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_liferay$1ui_error_15.doInitBody();
            }
            errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
            do {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");

			FormInstanceSettingsStorageTypeException formInstanceSettingsStorageTypeException = (FormInstanceSettingsStorageTypeException)errorException;
			
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");
              out.print( formInstanceSettingsStorageTypeException.getMessage() );
              out.write("\n");
              out.write("\t\t");
              int evalDoAfterBody = _jspx_th_liferay$1ui_error_15.doAfterBody();
              errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_liferay$1ui_error_15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_liferay$1ui_error_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_15);
            _jspx_th_liferay$1ui_error_15.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_15);
          _jspx_th_liferay$1ui_error_15.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_16 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
          _jspx_th_liferay$1ui_error_16.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_error_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_3);
          _jspx_th_liferay$1ui_error_16.setException( StorageException.class );
          _jspx_th_liferay$1ui_error_16.setMessage("please-enter-a-valid-form-settings");
          int _jspx_eval_liferay$1ui_error_16 = _jspx_th_liferay$1ui_error_16.doStartTag();
          if (_jspx_th_liferay$1ui_error_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_16);
            _jspx_th_liferay$1ui_error_16.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_16);
          _jspx_th_liferay$1ui_error_16.release();
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_17 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
          _jspx_th_liferay$1ui_error_17.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_error_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_3);
          _jspx_th_liferay$1ui_error_17.setException( StructureDefinitionException.class );
          _jspx_th_liferay$1ui_error_17.setMessage("please-enter-a-valid-form-definition");
          int _jspx_eval_liferay$1ui_error_17 = _jspx_th_liferay$1ui_error_17.doStartTag();
          if (_jspx_th_liferay$1ui_error_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_17);
            _jspx_th_liferay$1ui_error_17.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_17);
          _jspx_th_liferay$1ui_error_17.release();
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_18 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
          _jspx_th_liferay$1ui_error_18.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_error_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_3);
          _jspx_th_liferay$1ui_error_18.setException( StructureLayoutException.class );
          _jspx_th_liferay$1ui_error_18.setMessage("please-enter-a-valid-form-layout");
          int _jspx_eval_liferay$1ui_error_18 = _jspx_th_liferay$1ui_error_18.doStartTag();
          if (_jspx_th_liferay$1ui_error_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_18);
            _jspx_th_liferay$1ui_error_18.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_18);
          _jspx_th_liferay$1ui_error_18.release();
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_19 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
          _jspx_th_liferay$1ui_error_19.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_error_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_3);
          _jspx_th_liferay$1ui_error_19.setException( StructureNameException.class );
          _jspx_th_liferay$1ui_error_19.setMessage("please-enter-a-valid-form-name");
          int _jspx_eval_liferay$1ui_error_19 = _jspx_th_liferay$1ui_error_19.doStartTag();
          if (_jspx_th_liferay$1ui_error_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_19);
            _jspx_th_liferay$1ui_error_19.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_19);
          _jspx_th_liferay$1ui_error_19.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
if (
 !showExpirationDateError && DDMFormInstanceExpirationStatusUtil.isFormExpired(ddmFormAdminDisplayContext.getDDMFormInstance(), timeZone) ) {
          out.write("\n");
          out.write("\t\t\t");
          //  clay:alert
          com.liferay.frontend.taglib.clay.servlet.taglib.AlertTag _jspx_th_clay_alert_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.AlertTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.AlertTag();
          _jspx_th_clay_alert_0.setPageContext(_jspx_page_context);
          _jspx_th_clay_alert_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_3);
          _jspx_th_clay_alert_0.setDismissible( true );
          _jspx_th_clay_alert_0.setDisplayType("warning");
          _jspx_th_clay_alert_0.setMessage("the-form-is-expired-and-is-no-longer-available-for-editing-or-submitting-new-answers");
          int _jspx_eval_clay_alert_0 = _jspx_th_clay_alert_0.doStartTag();
          if (_jspx_th_clay_alert_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_alert_0);
            _jspx_th_clay_alert_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_alert_0);
          _jspx_th_clay_alert_0.release();
          out.write("\n");
          out.write("\t\t");
}
          out.write("\n");
          out.write("\t</div>\n");
        }
        if (_jspx_th_clay_container$1fluid_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_3);
          _jspx_th_clay_container$1fluid_3.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_3);
        _jspx_th_clay_container$1fluid_3.release();
        out.write("\n");
        out.write("\t\t");
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
          out.write("\t\t\t");
          //  portlet:param
          com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
          _jspx_th_portlet_param_2.setPageContext(_jspx_page_context);
          _jspx_th_portlet_param_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1portlet_resourceURL_1);
          _jspx_th_portlet_param_2.setName("formInstanceId");
          _jspx_th_portlet_param_2.setValue( String.valueOf(formInstanceId) );
          int _jspx_eval_portlet_param_2 = _jspx_th_portlet_param_2.doStartTag();
          if (_jspx_th_portlet_param_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_2);
            _jspx_th_portlet_param_2.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_2);
          _jspx_th_portlet_param_2.release();
          out.write("\n");
          out.write("\t\t");
        }
        if (_jspx_th_liferay$1portlet_resourceURL_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_resourceURL_1);
          _jspx_th_liferay$1portlet_resourceURL_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_resourceURL_1);
        _jspx_th_liferay$1portlet_resourceURL_1.release();
        java.lang.String formReportDataURL = null;
        formReportDataURL = (java.lang.String) _jspx_page_context.findAttribute("formReportDataURL");
        out.write("\n");
        out.write("\n");
        out.write("\t\t<div id=\"");
        if (_jspx_meth_portlet_namespace_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_form_0, _jspx_page_context))
          return;
        out.write("-container\">\n");
        out.write("\t\t\t");
        //  react:component
        com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag _jspx_th_react_component_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag.class) : new com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag();
        _jspx_th_react_component_1.setPageContext(_jspx_page_context);
        _jspx_th_react_component_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_react_component_1.setModule("admin/js/App.es");
        _jspx_th_react_component_1.setProps(
					HashMapBuilder.<String, Object>put(
						"autocompleteUserURL", ddmFormAdminDisplayContext.getAutocompleteUserURL()
					).put(
						"autosaveInterval", ddmFormAdminDisplayContext.getAutosaveInterval()
					).put(
						"autosaveURL", autoSaveFormInstanceURL.toString()
					).put(
						"availableLanguageIds", ddmFormAdminDisplayContext.getAvailableLanguageIdsJSONArray()
					).put(
						"context", formBuilderContextJSONObject
					).put(
						"dataEngineModule", ddmFormAdminDisplayContext.getDataEngineModule()
					).put(
						"dataProviderInstanceParameterSettingsURL", dataProviderInstanceParameterSettingsURL
					).put(
						"dataProviderInstancesURL", dataProviderInstancesURL
					).put(
						"defaultLanguageId", ddmFormAdminDisplayContext.getDefaultLanguageId()
					).put(
						"elementSets", ddmFormAdminDisplayContext.getFieldSetsJSONArray()
					).put(
						"fieldSetDefinitionURL", ddmFormAdminDisplayContext.getFieldSetDefinitionURL()
					).put(
						"fieldTypes", ddmFormAdminDisplayContext.getDDMFormFieldTypesJSONArray()
					).put(
						"formInstanceId", formInstanceId
					).put(
						"formReportDataURL", formReportDataURL.toString()
					).put(
						"formSettingsContext", ddmFormAdminDisplayContext.getDDMFormSettingsContext(pageContext)
					).put(
						"functionsMetadata", functionsMetadataJSONObject
					).put(
						"functionsURL", functionsURL
					).put(
						"groupId", groupId
					).put(
						"localizedDescription", ddmFormAdminDisplayContext.getFormLocalizedDescriptionJSONObject()
					).put(
						"localizedName", ddmFormAdminDisplayContext.getFormLocalizedNameJSONObject(formInstance)
					).put(
						"mainRequire", ddmFormAdminDisplayContext.getMainRequire()
					).put(
						"portletNamespace", liferayPortletResponse.getNamespace()
					).put(
						"published", ddmFormAdminDisplayContext.isFormPublished()
					).put(
						"publishFormInstanceURL", publishFormInstanceURL.toString()
					).put(
						"rolesURL", rolesURL
					).put(
						"rules", ddmFormRulesJSONArray
					).put(
						"saved", formInstance != null
					).put(
						"sharedFormURL", ddmFormAdminDisplayContext.getSharedFormURL()
					).put(
						"shareFormInstanceURL", ddmFormAdminDisplayContext.getShareFormInstanceURL(formInstance)
					).put(
						"showPublishAlert", ddmFormAdminDisplayContext.isShowPublishAlert()
					).put(
						"spritemap", FrontendIconsUtil.getSpritemap(themeDisplay)
					).put(
						"view", "formBuilder"
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
        out.write("\t\t</div>\n");
        out.write("\t");
      }
      if (_jspx_th_aui_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_form_0);
        _jspx_th_aui_form_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_form_0);
      _jspx_th_aui_form_0.release();
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      //  aui:script
      com.liferay.taglib.aui.ScriptTag _jspx_th_aui_script_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ScriptTag.class) : new com.liferay.taglib.aui.ScriptTag();
      _jspx_th_aui_script_1.setPageContext(_jspx_page_context);
      _jspx_th_aui_script_1.setParent(null);
      int _jspx_eval_aui_script_1 = _jspx_th_aui_script_1.doStartTag();
      if (_jspx_eval_aui_script_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_aui_script_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_aui_script_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_aui_script_1.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\tvar clearPortletHandlers = function (event) {\n");
          out.write("\t\tif (event.portletId === '");
          out.print( portletDisplay.getRootPortletId() );
          out.write("') {\n");
          out.write("\t\t\tvar translationManager = Liferay.component(\n");
          out.write("\t\t\t\t'");
          if (_jspx_meth_portlet_namespace_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_1, _jspx_page_context))
            return;
          out.write("translationManager'\n");
          out.write("\t\t\t);\n");
          out.write("\n");
          out.write("\t\t\tLiferay.destroyComponents((component) => {\n");
          out.write("\t\t\t\tvar destroy = false;\n");
          out.write("\n");
          out.write("\t\t\t\tif (component === translationManager) {\n");
          out.write("\t\t\t\t\tdestroy = true;\n");
          out.write("\t\t\t\t}\n");
          out.write("\n");
          out.write("\t\t\t\treturn destroy;\n");
          out.write("\t\t\t});\n");
          out.write("\n");
          out.write("\t\t\tLiferay.detach('destroyPortlet', clearPortletHandlers);\n");
          out.write("\t\t}\n");
          out.write("\t};\n");
          out.write("\n");
          out.write("\tLiferay.on('destroyPortlet', clearPortletHandlers);\n");
          int evalDoAfterBody = _jspx_th_aui_script_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_aui_script_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_aui_script_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_script_1);
        _jspx_th_aui_script_1.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_script_1);
      _jspx_th_aui_script_1.release();
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

  private boolean _jspx_meth_aui_script_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:script
    com.liferay.taglib.aui.ScriptTag _jspx_th_aui_script_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ScriptTag.class) : new com.liferay.taglib.aui.ScriptTag();
    _jspx_th_aui_script_0.setPageContext(_jspx_page_context);
    _jspx_th_aui_script_0.setParent(null);
    int _jspx_eval_aui_script_0 = _jspx_th_aui_script_0.doStartTag();
    if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_aui_script_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_aui_script_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\tLiferay.namespace('Forms').portletNamespace = '");
        if (_jspx_meth_portlet_namespace_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
          return true;
        out.write("';\n");
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

  private boolean _jspx_meth_portlet_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_portlet_actionURL_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:param
    com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
    _jspx_th_portlet_param_0.setPageContext(_jspx_page_context);
    _jspx_th_portlet_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_0);
    _jspx_th_portlet_param_0.setName("mvcRenderCommandName");
    _jspx_th_portlet_param_0.setValue("/admin/edit_form_instance");
    int _jspx_eval_portlet_param_0 = _jspx_th_portlet_param_0.doStartTag();
    if (_jspx_th_portlet_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_0);
      _jspx_th_portlet_param_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_0);
    _jspx_th_portlet_param_0.release();
    return false;
  }

  private boolean _jspx_meth_portlet_param_1(javax.servlet.jsp.tagext.JspTag _jspx_th_portlet_actionURL_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:param
    com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
    _jspx_th_portlet_param_1.setPageContext(_jspx_page_context);
    _jspx_th_portlet_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_1);
    _jspx_th_portlet_param_1.setName("mvcRenderCommandName");
    _jspx_th_portlet_param_1.setValue("/admin/edit_form_instance");
    int _jspx_eval_portlet_param_1 = _jspx_th_portlet_param_1.doStartTag();
    if (_jspx_th_portlet_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_1);
      _jspx_th_portlet_param_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_1);
    _jspx_th_portlet_param_1.release();
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
    _jspx_th_clay_container$1fluid_0.setCssClass("lfr-alert-wrapper");
    int _jspx_eval_clay_container$1fluid_0 = _jspx_th_clay_container$1fluid_0.doStartTag();
    if (_jspx_th_clay_container$1fluid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_0);
      _jspx_th_clay_container$1fluid_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_0);
    _jspx_th_clay_container$1fluid_0.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_1.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_1.setParent(null);
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

  private boolean _jspx_meth_portlet_namespace_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_2.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_2.setParent(null);
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

  private boolean _jspx_meth_portlet_namespace_3(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_container$1fluid_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_3.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_1);
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

  private boolean _jspx_meth_liferay$1ui_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_container$1fluid_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_1);
    _jspx_th_liferay$1ui_message_0.setKey("share");
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

  private boolean _jspx_meth_portlet_namespace_4(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_container$1fluid_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_4.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_1);
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

  private boolean _jspx_meth_liferay$1ui_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_container$1fluid_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_1);
    _jspx_th_liferay$1ui_message_1.setKey("share");
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

  private boolean _jspx_meth_portlet_namespace_5(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_container$1fluid_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_5.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_1);
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

  private boolean _jspx_meth_liferay$1ui_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_container$1fluid_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_2.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_1);
    _jspx_th_liferay$1ui_message_2.setKey("share");
    int _jspx_eval_liferay$1ui_message_2 = _jspx_th_liferay$1ui_message_2.doStartTag();
    if (_jspx_th_liferay$1ui_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
      _jspx_th_liferay$1ui_message_2.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
    _jspx_th_liferay$1ui_message_2.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_3(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_container$1fluid_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_3.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_1);
    _jspx_th_liferay$1ui_message_3.setKey("preview");
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

  private boolean _jspx_meth_liferay$1ui_message_4(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_container$1fluid_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_4.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_1);
    _jspx_th_liferay$1ui_message_4.setKey("save");
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

  private boolean _jspx_meth_aui_input_7(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:input
    com.liferay.taglib.aui.InputTag _jspx_th_aui_input_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
    _jspx_th_aui_input_7.setPageContext(_jspx_page_context);
    _jspx_th_aui_input_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
    _jspx_th_aui_input_7.setName("serializedSettingsContext");
    _jspx_th_aui_input_7.setType("hidden");
    _jspx_th_aui_input_7.setValue(new String(""));
    int _jspx_eval_aui_input_7 = _jspx_th_aui_input_7.doStartTag();
    if (_jspx_th_aui_input_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_7);
      _jspx_th_aui_input_7.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_7);
    _jspx_th_aui_input_7.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_11(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_error_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_11.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_error_11);
    _jspx_th_liferay$1ui_message_11.setKey("please-enter-a-valid-expiration-date-only-future-dates-are-accepted");
    int _jspx_eval_liferay$1ui_message_11 = _jspx_th_liferay$1ui_message_11.doStartTag();
    if (_jspx_th_liferay$1ui_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_11);
      _jspx_th_liferay$1ui_message_11.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_11);
    _jspx_th_liferay$1ui_message_11.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_6(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_6.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
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

  private boolean _jspx_meth_portlet_namespace_7(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_7.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_1);
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
}
