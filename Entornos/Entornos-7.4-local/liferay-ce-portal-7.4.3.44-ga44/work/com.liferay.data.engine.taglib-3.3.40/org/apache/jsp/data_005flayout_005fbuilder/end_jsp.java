package org.apache.jsp.data_005flayout_005fbuilder;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.portal.json.JSONFactoryImpl;
import com.liferay.portal.kernel.servlet.taglib.aui.ScriptData;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.frontend.icons.FrontendIconsUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import com.liferay.data.engine.rest.resource.exception.DataDefinitionValidationException;
import com.liferay.data.engine.rest.resource.exception.DataLayoutValidationException;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringUtil;
import java.util.Map;

public final class end_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/data_layout_builder/init.jsp");
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/data_layout_builder/init-ext.jspf");
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
      out.write('\n');
      out.write('\n');

java.util.List<java.util.Map<java.lang.String, java.lang.Object>> additionalPanels = (java.util.List<java.util.Map<java.lang.String, java.lang.Object>>)request.getAttribute("liferay-data-engine:data-layout-builder:additionalPanels");
java.lang.String componentId = GetterUtil.getString((java.lang.String)request.getAttribute("liferay-data-engine:data-layout-builder:componentId"));
java.lang.String contentType = GetterUtil.getString((java.lang.String)request.getAttribute("liferay-data-engine:data-layout-builder:contentType"));
java.lang.Long dataDefinitionId = GetterUtil.getLong(String.valueOf(request.getAttribute("liferay-data-engine:data-layout-builder:dataDefinitionId")));
java.lang.Long dataLayoutId = GetterUtil.getLong(String.valueOf(request.getAttribute("liferay-data-engine:data-layout-builder:dataLayoutId")));
java.lang.String fieldSetContentType = GetterUtil.getString((java.lang.String)request.getAttribute("liferay-data-engine:data-layout-builder:fieldSetContentType"));
java.lang.Long groupId = GetterUtil.getLong(String.valueOf(request.getAttribute("liferay-data-engine:data-layout-builder:groupId")));
boolean localizable = GetterUtil.getBoolean(String.valueOf(request.getAttribute("liferay-data-engine:data-layout-builder:localizable")));
java.lang.String module = GetterUtil.getString((java.lang.String)request.getAttribute("liferay-data-engine:data-layout-builder:module"));
javax.servlet.ServletContext moduleServletContext = (javax.servlet.ServletContext)request.getAttribute("liferay-data-engine:data-layout-builder:moduleServletContext");
java.lang.String namespace = GetterUtil.getString((java.lang.String)request.getAttribute("liferay-data-engine:data-layout-builder:namespace"));
java.lang.Object scopes = (java.lang.Object)request.getAttribute("liferay-data-engine:data-layout-builder:scopes");
boolean searchableFieldsDisabled = GetterUtil.getBoolean(String.valueOf(request.getAttribute("liferay-data-engine:data-layout-builder:searchableFieldsDisabled")));
java.lang.String submitButtonId = GetterUtil.getString((java.lang.String)request.getAttribute("liferay-data-engine:data-layout-builder:submitButtonId"));
Map<String, Object> dynamicAttributes = (Map<String, Object>)request.getAttribute("liferay-data-engine:data-layout-builder:dynamicAttributes");

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

String[] availableLanguageIds = (String[])request.getAttribute("liferay-data-engine:data-layout-builder:availableLanguageIds");
JSONObject configJSONObject = (JSONObject)request.getAttribute("liferay-data-engine:data-layout-builder:config");
JSONObject contentTypeConfigJSONObject = (JSONObject)request.getAttribute("liferay-data-engine:data-layout-builder:contentTypeConfig");
JSONObject dataLayoutJSONObject = (JSONObject)request.getAttribute("liferay-data-engine:data-layout-builder:dataLayout");
String defaultLanguageId = (String)request.getAttribute("liferay-data-engine:data-layout-builder:defaultLanguageId");
JSONArray fieldTypesJSONArray = (JSONArray)request.getAttribute("liferay-data-engine:data-layout-builder:fieldTypes");
String fieldTypesModules = (String)request.getAttribute("liferay-data-engine:data-layout-builder:fieldTypesModules");
java.util.Map<String, Object> sidebarPanels = (java.util.Map<String, Object>)request.getAttribute("liferay-data-engine:data-layout-builder:sidebarPanels");

      out.write('\n');
      out.write('\n');
      //  portlet:renderURL
      com.liferay.taglib.portlet.RenderURLTag _jspx_th_portlet_renderURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.RenderURLTag.class) : new com.liferay.taglib.portlet.RenderURLTag();
      _jspx_th_portlet_renderURL_0.setPageContext(_jspx_page_context);
      _jspx_th_portlet_renderURL_0.setParent(null);
      _jspx_th_portlet_renderURL_0.setVar("basePortletURL");
      int _jspx_eval_portlet_renderURL_0 = _jspx_th_portlet_renderURL_0.doStartTag();
      if (_jspx_th_portlet_renderURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_renderURL_0);
        _jspx_th_portlet_renderURL_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_renderURL_0);
      _jspx_th_portlet_renderURL_0.release();
      java.lang.String basePortletURL = null;
      basePortletURL = (java.lang.String) _jspx_page_context.findAttribute("basePortletURL");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"data-engine-form-builder-messages\">\n");
      out.write("\t");
      //  liferay-ui:error
      com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
      _jspx_th_liferay$1ui_error_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_error_0.setParent(null);
      _jspx_th_liferay$1ui_error_0.setException( DataDefinitionValidationException.class );
      _jspx_th_liferay$1ui_error_0.setMessage("please-enter-a-valid-form-definition");
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
      out.write("\t");
      //  liferay-ui:error
      com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
      _jspx_th_liferay$1ui_error_1.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_error_1.setParent(null);
      _jspx_th_liferay$1ui_error_1.setException( DataDefinitionValidationException.MustNotDuplicateFieldName.class );
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
          out.write("\t\t");

		DataDefinitionValidationException.MustNotDuplicateFieldName mndfn = (DataDefinitionValidationException.MustNotDuplicateFieldName)errorException;
		
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:message
          com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
          _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_error_1);
          _jspx_th_liferay$1ui_message_0.setArguments( HtmlUtil.escape(StringUtil.merge(mndfn.getDuplicatedFieldNames(), StringPool.COMMA_AND_SPACE)) );
          _jspx_th_liferay$1ui_message_0.setKey("the-definition-field-name-x-was-defined-more-than-once");
          _jspx_th_liferay$1ui_message_0.setTranslateArguments( false );
          int _jspx_eval_liferay$1ui_message_0 = _jspx_th_liferay$1ui_message_0.doStartTag();
          if (_jspx_th_liferay$1ui_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
            _jspx_th_liferay$1ui_message_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
          _jspx_th_liferay$1ui_message_0.release();
          out.write('\n');
          out.write('	');
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
      out.write("\t");
      //  liferay-ui:error
      com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
      _jspx_th_liferay$1ui_error_2.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_error_2.setParent(null);
      _jspx_th_liferay$1ui_error_2.setException( DataDefinitionValidationException.MustSetFields.class );
      _jspx_th_liferay$1ui_error_2.setMessage("at-least-one-field-must-be-added");
      int _jspx_eval_liferay$1ui_error_2 = _jspx_th_liferay$1ui_error_2.doStartTag();
      if (_jspx_th_liferay$1ui_error_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_2);
        _jspx_th_liferay$1ui_error_2.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_2);
      _jspx_th_liferay$1ui_error_2.release();
      out.write("\n");
      out.write("\n");
      out.write("\t");
      //  liferay-ui:error
      com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
      _jspx_th_liferay$1ui_error_3.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_error_3.setParent(null);
      _jspx_th_liferay$1ui_error_3.setException( DataDefinitionValidationException.MustSetOptionsForField.class );
      int _jspx_eval_liferay$1ui_error_3 = _jspx_th_liferay$1ui_error_3.doStartTag();
      if (_jspx_eval_liferay$1ui_error_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object errorException = null;
        if (_jspx_eval_liferay$1ui_error_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_liferay$1ui_error_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_liferay$1ui_error_3.doInitBody();
        }
        errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
        do {
          out.write("\n");
          out.write("\n");
          out.write("\t\t");

		DataDefinitionValidationException.MustSetOptionsForField msoff = (DataDefinitionValidationException.MustSetOptionsForField)errorException;
		
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:message
          com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
          _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_error_3);
          _jspx_th_liferay$1ui_message_1.setArguments( HtmlUtil.escape(msoff.getFieldLabel()) );
          _jspx_th_liferay$1ui_message_1.setKey("at-least-one-option-should-be-set-for-field-x");
          _jspx_th_liferay$1ui_message_1.setTranslateArguments( false );
          int _jspx_eval_liferay$1ui_message_1 = _jspx_th_liferay$1ui_message_1.doStartTag();
          if (_jspx_th_liferay$1ui_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_1);
            _jspx_th_liferay$1ui_message_1.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_1);
          _jspx_th_liferay$1ui_message_1.release();
          out.write('\n');
          out.write('	');
          int evalDoAfterBody = _jspx_th_liferay$1ui_error_3.doAfterBody();
          errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_liferay$1ui_error_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_liferay$1ui_error_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_3);
        _jspx_th_liferay$1ui_error_3.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_3);
      _jspx_th_liferay$1ui_error_3.release();
      out.write("\n");
      out.write("\n");
      out.write("\t");
      //  liferay-ui:error
      com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
      _jspx_th_liferay$1ui_error_4.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_error_4.setParent(null);
      _jspx_th_liferay$1ui_error_4.setException( DataDefinitionValidationException.MustSetValidCharactersForFieldName.class );
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
          out.write("\t\t");

		DataDefinitionValidationException.MustSetValidCharactersForFieldName msvcffn = (DataDefinitionValidationException.MustSetValidCharactersForFieldName)errorException;
		
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:message
          com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
          _jspx_th_liferay$1ui_message_2.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_error_4);
          _jspx_th_liferay$1ui_message_2.setArguments( HtmlUtil.escape(msvcffn.getFieldName()) );
          _jspx_th_liferay$1ui_message_2.setKey("invalid-characters-were-defined-for-field-name-x");
          _jspx_th_liferay$1ui_message_2.setTranslateArguments( false );
          int _jspx_eval_liferay$1ui_message_2 = _jspx_th_liferay$1ui_message_2.doStartTag();
          if (_jspx_th_liferay$1ui_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
            _jspx_th_liferay$1ui_message_2.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
          _jspx_th_liferay$1ui_message_2.release();
          out.write('\n');
          out.write('	');
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
      out.write("\t");
      //  liferay-ui:error
      com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
      _jspx_th_liferay$1ui_error_5.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_error_5.setParent(null);
      _jspx_th_liferay$1ui_error_5.setException( DataDefinitionValidationException.MustSetValidName.class );
      _jspx_th_liferay$1ui_error_5.setMessage("please-enter-a-valid-name");
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
      out.write("\t");
      //  liferay-ui:error
      com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
      _jspx_th_liferay$1ui_error_6.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_error_6.setParent(null);
      _jspx_th_liferay$1ui_error_6.setException( DataLayoutValidationException.class );
      _jspx_th_liferay$1ui_error_6.setMessage("please-enter-a-valid-form-layout");
      int _jspx_eval_liferay$1ui_error_6 = _jspx_th_liferay$1ui_error_6.doStartTag();
      if (_jspx_th_liferay$1ui_error_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_6);
        _jspx_th_liferay$1ui_error_6.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_6);
      _jspx_th_liferay$1ui_error_6.release();
      out.write("\n");
      out.write("\n");
      out.write("\t");
      //  liferay-ui:error
      com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
      _jspx_th_liferay$1ui_error_7.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_error_7.setParent(null);
      _jspx_th_liferay$1ui_error_7.setException( DataLayoutValidationException.MustNotDuplicateFieldName.class );
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
          out.write("\t\t");

		DataLayoutValidationException.MustNotDuplicateFieldName mndfn = (DataLayoutValidationException.MustNotDuplicateFieldName)errorException;
		
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:message
          com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
          _jspx_th_liferay$1ui_message_3.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_error_7);
          _jspx_th_liferay$1ui_message_3.setArguments( HtmlUtil.escape(StringUtil.merge(mndfn.getDuplicatedFieldNames(), StringPool.COMMA_AND_SPACE)) );
          _jspx_th_liferay$1ui_message_3.setKey("the-definition-field-name-x-was-defined-more-than-once");
          _jspx_th_liferay$1ui_message_3.setTranslateArguments( false );
          int _jspx_eval_liferay$1ui_message_3 = _jspx_th_liferay$1ui_message_3.doStartTag();
          if (_jspx_th_liferay$1ui_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_3);
            _jspx_th_liferay$1ui_message_3.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_3);
          _jspx_th_liferay$1ui_message_3.release();
          out.write('\n');
          out.write('	');
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
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"");
      out.print( componentId );
      out.write("container\">\n");
      out.write("\t");
      //  react:component
      com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag _jspx_th_react_component_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag.class) : new com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag();
      _jspx_th_react_component_0.setPageContext(_jspx_page_context);
      _jspx_th_react_component_0.setParent(null);
      _jspx_th_react_component_0.setModule( module );
      _jspx_th_react_component_0.setProps(
			HashMapBuilder.<String, Object>put(
				"availableLanguageIds", availableLanguageIds
			).put(
				"config", configJSONObject
			).put(
				"contentType", contentType
			).put(
				"contentTypeConfig", contentTypeConfigJSONObject
			).put(
				"context", dataLayoutJSONObject
			).put(
				"dataDefinitionId", dataDefinitionId
			).put(
				"dataLayoutBuilderElementId", liferayPortletResponse.getNamespace() + "-data-layout-builder"
			).put(
				"dataLayoutBuilderId", componentId
			).put(
				"dataLayoutId", dataLayoutId
			).put(
				"defaultLanguageId", defaultLanguageId
			).put(
				"fieldSetContentType", fieldSetContentType
			).put(
				"fieldTypes", fieldTypesJSONArray
			).put(
				"fieldTypesModules", fieldTypesModules
			).put(
				"groupId", groupId
			).put(
				"localizable", localizable
			).put(
				"sidebarPanels", sidebarPanels
			).put(
				"spritemap", FrontendIconsUtil.getSpritemap(themeDisplay)
			).put(
				"submitButtonId", submitButtonId
			).build()
		);
      _jspx_th_react_component_0.setServletContext( moduleServletContext );
      int _jspx_eval_react_component_0 = _jspx_th_react_component_0.doStartTag();
      if (_jspx_th_react_component_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_react_component_0);
        _jspx_th_react_component_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_react_component_0);
      _jspx_th_react_component_0.release();
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
