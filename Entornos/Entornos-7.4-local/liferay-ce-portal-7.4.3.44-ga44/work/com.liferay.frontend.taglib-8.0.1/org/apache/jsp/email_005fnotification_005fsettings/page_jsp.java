package org.apache.jsp.email_005fnotification_005fsettings;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.dao.search.ResultRow;
import com.liferay.portal.kernel.dao.search.RowChecker;
import com.liferay.portal.kernel.frontend.icons.FrontendIconsUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.PortletURLUtil;
import com.liferay.portal.kernel.portlet.url.builder.PortletURLBuilder;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.taglib.aui.AUIUtil;
import com.liferay.taglib.util.TagResourceBundleUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.PortletURL;
import javax.servlet.ServletContext;

public final class page_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(11);
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/META-INF/c.tld");
    _jspx_dependants.add("/META-INF/liferay-portlet_2_0.tld");
    _jspx_dependants.add("/META-INF/liferay-aui.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-clay.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-editor.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-frontend.tld");
    _jspx_dependants.add("/META-INF/resources/react.tld");
    _jspx_dependants.add("/META-INF/liferay-theme.tld");
    _jspx_dependants.add("/META-INF/liferay-ui.tld");
    _jspx_dependants.add("/META-INF/liferay-util.tld");
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
      out.write("\n");
      out.write("\n");
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

PortletRequest portletRequest = (PortletRequest)request.getAttribute(JavaConstants.JAVAX_PORTLET_REQUEST);

PortletResponse portletResponse = (PortletResponse)request.getAttribute(JavaConstants.JAVAX_PORTLET_RESPONSE);

String namespace = AUIUtil.getNamespace(portletRequest, portletResponse);

if (Validator.isNull(namespace)) {
	namespace = AUIUtil.getNamespace(request);
}

String currentURL = null;

if ((portletRequest != null) && (portletResponse != null)) {
	PortletURL currentURLObj = PortletURLUtil.getCurrent(PortalUtil.getLiferayPortletRequest(portletRequest), PortalUtil.getLiferayPortletResponse(portletResponse));

	currentURL = currentURLObj.toString();
}
else {
	currentURL = PortalUtil.getCurrentURL(request);
}

ResourceBundle resourceBundle = TagResourceBundleUtil.getResourceBundle(request, locale);

      out.write('\n');
      out.write('\n');

String emailBody = (String)request.getAttribute("liferay-frontend:email-notification-settings:emailBody");
Map<String, String> emailDefinitionTerms = (Map<String, String>)request.getAttribute("liferay-frontend:email-notification-settings:emailDefinitionTerms");
String emailParam = (String)request.getAttribute("liferay-frontend:email-notification-settings:emailParam");
String emailSubject = (String)request.getAttribute("liferay-frontend:email-notification-settings:emailSubject");
String fieldPrefix = (String)request.getAttribute("liferay-frontend:email-notification-settings:fieldPrefix");
String fieldPrefixSeparator = (String)request.getAttribute("liferay-frontend:email-notification-settings:fieldPrefixSeparator");

      out.write('\n');
      out.write('\n');
      //  aui:fieldset
      com.liferay.taglib.aui.FieldsetTag _jspx_th_aui_fieldset_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FieldsetTag.class) : new com.liferay.taglib.aui.FieldsetTag();
      _jspx_th_aui_fieldset_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_fieldset_0.setParent(null);
      _jspx_th_aui_fieldset_0.setMarkupView("lexicon");
      int _jspx_eval_aui_fieldset_0 = _jspx_th_aui_fieldset_0.doStartTag();
      if (_jspx_eval_aui_fieldset_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write('\n');
        out.write('	');
if (
 GetterUtil.getBoolean(request.getAttribute("liferay-frontend:email-notification-settings:showEmailEnabled")) ) {
        out.write("\n");
        out.write("\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_0.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
        _jspx_th_aui_input_0.setLabel("enabled");
        _jspx_th_aui_input_0.setName( fieldPrefix + fieldPrefixSeparator + emailParam + "Enabled" + fieldPrefixSeparator );
        _jspx_th_aui_input_0.setType("checkbox");
        _jspx_th_aui_input_0.setValue( GetterUtil.getBoolean((String)request.getAttribute("liferay-frontend:email-notification-settings:emailEnabled")) );
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
}
        out.write("\n");
        out.write("\n");
        out.write("\t");
if (
 GetterUtil.getBoolean(request.getAttribute("liferay-frontend:email-notification-settings:showSubject")) ) {
        out.write("\n");
        out.write("\t\t");
        out.write("\n");
        out.write("\t\t\t");
if (
 Validator.isNotNull(emailSubject) && Validator.isXml(emailSubject) ) {
        out.write("\n");
        out.write("\t\t\t\t");
        //  aui:field-wrapper
        com.liferay.taglib.aui.FieldWrapperTag _jspx_th_aui_field$1wrapper_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FieldWrapperTag.class) : new com.liferay.taglib.aui.FieldWrapperTag();
        _jspx_th_aui_field$1wrapper_0.setPageContext(_jspx_page_context);
        _jspx_th_aui_field$1wrapper_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
        _jspx_th_aui_field$1wrapper_0.setLabel("subject");
        int _jspx_eval_aui_field$1wrapper_0 = _jspx_th_aui_field$1wrapper_0.doStartTag();
        if (_jspx_eval_aui_field$1wrapper_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t\t\t");
          //  liferay-ui:input-localized
          com.liferay.taglib.ui.InputLocalizedTag _jspx_th_liferay$1ui_input$1localized_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.InputLocalizedTag.class) : new com.liferay.taglib.ui.InputLocalizedTag();
          _jspx_th_liferay$1ui_input$1localized_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_input$1localized_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_field$1wrapper_0);
          _jspx_th_liferay$1ui_input$1localized_0.setFieldPrefix( fieldPrefix );
          _jspx_th_liferay$1ui_input$1localized_0.setFieldPrefixSeparator( fieldPrefixSeparator );
          _jspx_th_liferay$1ui_input$1localized_0.setName( emailParam + "Subject" );
          _jspx_th_liferay$1ui_input$1localized_0.setXml( emailSubject );
          int _jspx_eval_liferay$1ui_input$1localized_0 = _jspx_th_liferay$1ui_input$1localized_0.doStartTag();
          if (_jspx_th_liferay$1ui_input$1localized_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_input$1localized_0);
            _jspx_th_liferay$1ui_input$1localized_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_input$1localized_0);
          _jspx_th_liferay$1ui_input$1localized_0.release();
          out.write("\n");
          out.write("\t\t\t\t");
        }
        if (_jspx_th_aui_field$1wrapper_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_field$1wrapper_0);
          _jspx_th_aui_field$1wrapper_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_field$1wrapper_0);
        _jspx_th_aui_field$1wrapper_0.release();
        out.write("\n");
        out.write("\t\t\t");
        out.write("\n");
        out.write("\t\t\t");
}
else {
        out.write("\n");
        out.write("\t\t\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_1.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
        _jspx_th_aui_input_1.setCssClass("lfr-input-text-container");
        _jspx_th_aui_input_1.setLabel("subject");
        _jspx_th_aui_input_1.setName( fieldPrefix + fieldPrefixSeparator + emailParam + "Subject" + fieldPrefixSeparator );
        _jspx_th_aui_input_1.setValue( emailSubject );
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
        out.write("\n");
        out.write("\t\t");
}
        out.write('\n');
        out.write('	');
}
        out.write("\n");
        out.write("\n");
        out.write("\t");
        //  aui:field-wrapper
        com.liferay.taglib.aui.FieldWrapperTag _jspx_th_aui_field$1wrapper_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FieldWrapperTag.class) : new com.liferay.taglib.aui.FieldWrapperTag();
        _jspx_th_aui_field$1wrapper_1.setPageContext(_jspx_page_context);
        _jspx_th_aui_field$1wrapper_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
        _jspx_th_aui_field$1wrapper_1.setHelpMessage( (String)request.getAttribute("liferay-frontend:email-notification-settings:helpMessage") );
        _jspx_th_aui_field$1wrapper_1.setLabel( (String)request.getAttribute("liferay-frontend:email-notification-settings:bodyLabel") );
        int _jspx_eval_aui_field$1wrapper_1 = _jspx_th_aui_field$1wrapper_1.doStartTag();
        if (_jspx_eval_aui_field$1wrapper_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t");
          out.write("\n");
          out.write("\t\t\t");
if (
 Validator.isNotNull(emailBody) && Validator.isXml(emailBody) ) {
          out.write("\n");
          out.write("\t\t\t\t");
          //  liferay-ui:input-localized
          com.liferay.taglib.ui.InputLocalizedTag _jspx_th_liferay$1ui_input$1localized_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.InputLocalizedTag.class) : new com.liferay.taglib.ui.InputLocalizedTag();
          _jspx_th_liferay$1ui_input$1localized_1.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_input$1localized_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_field$1wrapper_1);
          _jspx_th_liferay$1ui_input$1localized_1.setEditorName( PropsUtil.get("editor.wysiwyg.portal-web.docroot.html.taglib.ui.email_notification_settings.jsp") );
          _jspx_th_liferay$1ui_input$1localized_1.setFieldPrefix( fieldPrefix );
          _jspx_th_liferay$1ui_input$1localized_1.setFieldPrefixSeparator( fieldPrefixSeparator );
          _jspx_th_liferay$1ui_input$1localized_1.setName( emailParam + "Body" );
          _jspx_th_liferay$1ui_input$1localized_1.setToolbarSet("email");
          _jspx_th_liferay$1ui_input$1localized_1.setType("editor");
          _jspx_th_liferay$1ui_input$1localized_1.setXml( emailBody );
          int _jspx_eval_liferay$1ui_input$1localized_1 = _jspx_th_liferay$1ui_input$1localized_1.doStartTag();
          if (_jspx_th_liferay$1ui_input$1localized_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_input$1localized_1);
            _jspx_th_liferay$1ui_input$1localized_1.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_input$1localized_1);
          _jspx_th_liferay$1ui_input$1localized_1.release();
          out.write("\n");
          out.write("\t\t\t");
          out.write("\n");
          out.write("\t\t\t");
}
else {
          out.write("\n");
          out.write("\t\t\t\t");
          //  liferay-editor:editor
          com.liferay.frontend.editor.taglib.servlet.taglib.EditorTag _jspx_th_liferay$1editor_editor_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.editor.taglib.servlet.taglib.EditorTag.class) : new com.liferay.frontend.editor.taglib.servlet.taglib.EditorTag();
          _jspx_th_liferay$1editor_editor_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1editor_editor_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_field$1wrapper_1);
          _jspx_th_liferay$1editor_editor_0.setContents( emailBody );
          _jspx_th_liferay$1editor_editor_0.setEditorName( PropsUtil.get("editor.wysiwyg.portal-web.docroot.html.taglib.ui.email_notification_settings.jsp") );
          _jspx_th_liferay$1editor_editor_0.setName( emailParam );
          int _jspx_eval_liferay$1editor_editor_0 = _jspx_th_liferay$1editor_editor_0.doStartTag();
          if (_jspx_th_liferay$1editor_editor_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1editor_editor_0);
            _jspx_th_liferay$1editor_editor_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1editor_editor_0);
          _jspx_th_liferay$1editor_editor_0.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t");
          //  aui:input
          com.liferay.taglib.aui.InputTag _jspx_th_aui_input_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
          _jspx_th_aui_input_2.setPageContext(_jspx_page_context);
          _jspx_th_aui_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_field$1wrapper_1);
          _jspx_th_aui_input_2.setName( fieldPrefix + fieldPrefixSeparator + emailParam + "Body" + fieldPrefixSeparator );
          _jspx_th_aui_input_2.setType("hidden");
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
          out.write("\n");
          out.write("\t\t");
}
          out.write('\n');
          out.write('	');
        }
        if (_jspx_th_aui_field$1wrapper_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_field$1wrapper_1);
          _jspx_th_aui_field$1wrapper_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_field$1wrapper_1);
        _jspx_th_aui_field$1wrapper_1.release();
        out.write('\n');
      }
      if (_jspx_th_aui_fieldset_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset_0);
        _jspx_th_aui_fieldset_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset_0);
      _jspx_th_aui_fieldset_0.release();
      out.write('\n');
      out.write('\n');
if (
 (emailDefinitionTerms != null) && !emailDefinitionTerms.isEmpty() ) {
      out.write('\n');
      out.write('	');
      //  aui:fieldset
      com.liferay.taglib.aui.FieldsetTag _jspx_th_aui_fieldset_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FieldsetTag.class) : new com.liferay.taglib.aui.FieldsetTag();
      _jspx_th_aui_fieldset_1.setPageContext(_jspx_page_context);
      _jspx_th_aui_fieldset_1.setParent(null);
      _jspx_th_aui_fieldset_1.setCollapsed( true );
      _jspx_th_aui_fieldset_1.setCollapsible( true );
      _jspx_th_aui_fieldset_1.setLabel("definition-of-terms");
      _jspx_th_aui_fieldset_1.setMarkupView("lexicon");
      int _jspx_eval_aui_fieldset_1 = _jspx_th_aui_fieldset_1.doStartTag();
      if (_jspx_eval_aui_fieldset_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t<dl>\n");
        out.write("\n");
        out.write("\t\t\t");

			for (Map.Entry<String, String> entry : emailDefinitionTerms.entrySet()) {
			
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t<dt>\n");
        out.write("\t\t\t\t\t");
        out.print( entry.getKey() );
        out.write("\n");
        out.write("\t\t\t\t</dt>\n");
        out.write("\t\t\t\t<dd>\n");
        out.write("\t\t\t\t\t");
        out.print( entry.getValue() );
        out.write("\n");
        out.write("\t\t\t\t</dd>\n");
        out.write("\n");
        out.write("\t\t\t");

			}
			
        out.write("\n");
        out.write("\n");
        out.write("\t\t</dl>\n");
        out.write("\t");
      }
      if (_jspx_th_aui_fieldset_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset_1);
        _jspx_th_aui_fieldset_1.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset_1);
      _jspx_th_aui_fieldset_1.release();
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
}
