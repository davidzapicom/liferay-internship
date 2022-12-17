package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.frontend.editor.ckeditor.web.internal.constants.CKEditorConstants;
import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.editor.configuration.EditorOptions;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.servlet.PortalWebResourceConstants;
import com.liferay.portal.kernel.servlet.PortalWebResourcesUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.SessionClicks;
import com.liferay.portal.kernel.util.TextFormatter;
import com.liferay.portal.kernel.util.URLCodec;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.taglib.aui.AUIUtil;
import java.util.Map;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

public final class ckeditor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


public String marshallParams(Map<String, String> params) {
	if (params == null) {
		return StringPool.BLANK;
	}

	StringBundler sb = new StringBundler(4 * params.size());

	for (Map.Entry<String, String> configParam : params.entrySet()) {
		sb.append(StringPool.AMPERSAND);
		sb.append(configParam.getKey());
		sb.append(StringPool.EQUAL);
		sb.append(URLCodec.encodeURL(configParam.getValue()));
	}

	return sb.toString();
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(10);
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/META-INF/c.tld");
    _jspx_dependants.add("/META-INF/liferay-portlet_2_0.tld");
    _jspx_dependants.add("/META-INF/liferay-aui.tld");
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

PortletRequest portletRequest = (PortletRequest)request.getAttribute(JavaConstants.JAVAX_PORTLET_REQUEST);

PortletResponse portletResponse = (PortletResponse)request.getAttribute(JavaConstants.JAVAX_PORTLET_RESPONSE);

String namespace = AUIUtil.getNamespace(portletRequest, portletResponse);

if (Validator.isNull(namespace)) {
	namespace = AUIUtil.getNamespace(request);
}

      out.write('\n');
      out.write('\n');

String portletId = portletDisplay.getId();

boolean autoCreate = GetterUtil.getBoolean((String)request.getAttribute(CKEditorConstants.ATTRIBUTE_NAMESPACE + ":autoCreate"));
String contents = (String)request.getAttribute(CKEditorConstants.ATTRIBUTE_NAMESPACE + ":contents");
String cssClass = GetterUtil.getString((String)request.getAttribute(CKEditorConstants.ATTRIBUTE_NAMESPACE + ":cssClass"));
Map<String, Object> data = (Map<String, Object>)request.getAttribute(CKEditorConstants.ATTRIBUTE_NAMESPACE + ":data");
String editorName = (String)request.getAttribute(CKEditorConstants.ATTRIBUTE_NAMESPACE + ":editorName");
String initMethod = (String)request.getAttribute(CKEditorConstants.ATTRIBUTE_NAMESPACE + ":initMethod");
boolean inlineEdit = GetterUtil.getBoolean((String)request.getAttribute(CKEditorConstants.ATTRIBUTE_NAMESPACE + ":inlineEdit"));
String inlineEditSaveURL = GetterUtil.getString((String)request.getAttribute(CKEditorConstants.ATTRIBUTE_NAMESPACE + ":inlineEditSaveURL"));
String name = GetterUtil.getString((String)request.getAttribute(CKEditorConstants.ATTRIBUTE_NAMESPACE + ":name"));

String onBlurMethod = (String)request.getAttribute(CKEditorConstants.ATTRIBUTE_NAMESPACE + ":onBlurMethod");

if (Validator.isNotNull(onBlurMethod)) {
	onBlurMethod = namespace + onBlurMethod;
}

String onChangeMethod = (String)request.getAttribute(CKEditorConstants.ATTRIBUTE_NAMESPACE + ":onChangeMethod");

if (Validator.isNotNull(onChangeMethod)) {
	onChangeMethod = namespace + onChangeMethod;
}

String onFocusMethod = (String)request.getAttribute(CKEditorConstants.ATTRIBUTE_NAMESPACE + ":onFocusMethod");

if (Validator.isNotNull(onFocusMethod)) {
	onFocusMethod = namespace + onFocusMethod;
}

String onInitMethod = (String)request.getAttribute(CKEditorConstants.ATTRIBUTE_NAMESPACE + ":onInitMethod");

if (Validator.isNotNull(onInitMethod)) {
	onInitMethod = namespace + onInitMethod;
}

String placeholder = GetterUtil.getString((String)request.getAttribute(CKEditorConstants.ATTRIBUTE_NAMESPACE + ":placeholder"));
boolean required = GetterUtil.getBoolean((String)request.getAttribute(CKEditorConstants.ATTRIBUTE_NAMESPACE + ":required"));
boolean skipEditorLoading = GetterUtil.getBoolean((String)request.getAttribute(CKEditorConstants.ATTRIBUTE_NAMESPACE + ":skipEditorLoading"));
String toolbarSet = (String)request.getAttribute(CKEditorConstants.ATTRIBUTE_NAMESPACE + ":toolbarSet");

if (!inlineEdit) {
	name = namespace + name;
}

JSONObject editorConfigJSONObject = null;

if (data != null) {
	editorConfigJSONObject = (JSONObject)data.get("editorConfig");
}

EditorOptions editorOptions = null;

if (data != null) {
	editorOptions = (EditorOptions)data.get("editorOptions");
}

Map<String, Object> editorOptionsDynamicAttributes = null;

if (editorOptions != null) {
	editorOptionsDynamicAttributes = editorOptions.getDynamicAttributes();
}

      out.write('\n');
      out.write('\n');
if (
 !skipEditorLoading ) {
      out.write('\n');
      out.write('	');
      //  liferay-editor:resources
      com.liferay.frontend.editor.taglib.servlet.taglib.ResourcesTag _jspx_th_liferay$1editor_resources_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.editor.taglib.servlet.taglib.ResourcesTag.class) : new com.liferay.frontend.editor.taglib.servlet.taglib.ResourcesTag();
      _jspx_th_liferay$1editor_resources_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1editor_resources_0.setParent(null);
      _jspx_th_liferay$1editor_resources_0.setEditorName( editorName );
      _jspx_th_liferay$1editor_resources_0.setInlineEdit( inlineEdit );
      _jspx_th_liferay$1editor_resources_0.setInlineEditSaveURL( inlineEditSaveURL );
      int _jspx_eval_liferay$1editor_resources_0 = _jspx_th_liferay$1editor_resources_0.doStartTag();
      if (_jspx_th_liferay$1editor_resources_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1editor_resources_0);
        _jspx_th_liferay$1editor_resources_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1editor_resources_0);
      _jspx_th_liferay$1editor_resources_0.release();
      out.write('\n');
}
      out.write('\n');
      out.write('\n');

String textareaName = HtmlUtil.escapeAttribute(name);

String modules = "aui-node-base";

if (inlineEdit && Validator.isNotNull(inlineEditSaveURL)) {
	textareaName = textareaName + "_original";

	modules += ",inline-editor-ckeditor";
}

      out.write('\n');
      out.write('\n');
      //  liferay-util:buffer
      com.liferay.taglib.util.BufferTag _jspx_th_liferay$1util_buffer_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.BufferTag.class) : new com.liferay.taglib.util.BufferTag();
      _jspx_th_liferay$1util_buffer_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1util_buffer_0.setParent(null);
      _jspx_th_liferay$1util_buffer_0.setVar("editor");
      int _jspx_eval_liferay$1util_buffer_0 = _jspx_th_liferay$1util_buffer_0.doStartTag();
      if (_jspx_eval_liferay$1util_buffer_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_liferay$1util_buffer_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_liferay$1util_buffer_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_liferay$1util_buffer_0.doInitBody();
        }
        do {
          out.write('\n');
          out.write('	');
if (
 Validator.isNotNull(placeholder) ) {
          out.write("\n");
          out.write("\t\t<label class=\"control-label\" for=\"");
          out.print( HtmlUtil.escapeAttribute(name) );
          out.write("\">\n");
          out.write("\t\t\t");
          //  liferay-ui:message
          com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
          _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1util_buffer_0);
          _jspx_th_liferay$1ui_message_0.setKey( placeholder );
          int _jspx_eval_liferay$1ui_message_0 = _jspx_th_liferay$1ui_message_0.doStartTag();
          if (_jspx_th_liferay$1ui_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
            _jspx_th_liferay$1ui_message_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
          _jspx_th_liferay$1ui_message_0.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t");
if (
 required ) {
          out.write("\n");
          out.write("\t\t\t\t<span class=\"text-warning\">*</span>\n");
          out.write("\t\t\t");
}
          out.write("\n");
          out.write("\t\t</label>\n");
          out.write("\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t<textarea id=\"");
          out.print( textareaName );
          out.write("\" name=\"");
          out.print( textareaName );
          out.write("\" style=\"display: none;\"></textarea>\n");
          int evalDoAfterBody = _jspx_th_liferay$1util_buffer_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_liferay$1util_buffer_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_liferay$1util_buffer_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_buffer_0);
        _jspx_th_liferay$1util_buffer_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_buffer_0);
      _jspx_th_liferay$1util_buffer_0.release();
      java.lang.String editor = null;
      editor = (java.lang.String) _jspx_page_context.findAttribute("editor");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"");
      out.print( HtmlUtil.escapeAttribute(cssClass) );
      out.write("\" id=\"");
      out.print( HtmlUtil.escapeAttribute(name) );
      out.write("Container\">\n");
      out.write("\t");
if (
 autoCreate ) {
      out.write("\n");
      out.write("\t\t");
      out.print( editor );
      out.write('\n');
      out.write('	');
}
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tCKEDITOR.ADDITIONAL_RESOURCE_PARAMS = {\n");
      out.write("\t\tlanguageId: themeDisplay.getLanguageId(),\n");
      out.write("\t};\n");
      out.write("\n");
      out.write("\tCKEDITOR.disableAutoInline = true;\n");
      out.write("\n");
      out.write("\tCKEDITOR.dtd.$removeEmpty.i = 0;\n");
      out.write("\tCKEDITOR.dtd.$removeEmpty.span = 0;\n");
      out.write("</script>\n");
      out.write("\n");

name = HtmlUtil.escapeJS(name);

      out.write('\n');
      out.write('\n');
      //  aui:script
      com.liferay.taglib.aui.ScriptTag _jspx_th_aui_script_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ScriptTag.class) : new com.liferay.taglib.aui.ScriptTag();
      _jspx_th_aui_script_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_script_0.setParent(null);
      _jspx_th_aui_script_0.setUse( modules );
      int _jspx_eval_aui_script_0 = _jspx_th_aui_script_0.doStartTag();
      if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_aui_script_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_aui_script_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\tvar UA = A.UA;\n");
          out.write("\n");
          out.write("\tvar windowNode = A.getWin();\n");
          out.write("\n");
          out.write("\tvar instanceDataReady = false;\n");
          out.write("\tvar instancePendingData = null;\n");
          out.write("\n");
          out.write("\tvar getInitialContent = function () {\n");
          out.write("\t\tvar data;\n");
          out.write("\n");
          out.write("\t\tif (window['");
          out.print( HtmlUtil.escapeJS(namespace + initMethod) );
          out.write("']) {\n");
          out.write("\t\t\tdata = ");
          out.print( HtmlUtil.escapeJS(namespace + initMethod) );
          out.write("();\n");
          out.write("\t\t}\n");
          out.write("\t\telse {\n");
          out.write("\t\t\tdata =\n");
          out.write("\t\t\t\t'");
          out.print( (contents != null) ? HtmlUtil.escapeJS(contents) : StringPool.BLANK );
          out.write("';\n");
          out.write("\t\t}\n");
          out.write("\n");
          out.write("\t\treturn data;\n");
          out.write("\t};\n");
          out.write("\n");
          out.write("\tvar onLocaleChangedHandler = function (event) {\n");
          out.write("\t\tvar contentsLanguage = event.item.getAttribute('data-value');\n");
          out.write("\t\tvar contentsLanguageDir = Liferay.Language.direction[contentsLanguage];\n");
          out.write("\n");
          out.write("\t\tvar nativeEditor = window['");
          out.print( name );
          out.write("'].getNativeEditor();\n");
          out.write("\n");
          out.write("\t\tnativeEditor.config.contentsLanguage = contentsLanguage;\n");
          out.write("\t\tnativeEditor.config.contentsLangDirection = contentsLanguageDir;\n");
          out.write("\t};\n");
          out.write("\n");
          out.write("\tvar preventImageDragoverHandler = windowNode.on('dragover', (event) => {\n");
          out.write("\t\tvar validDropTarget = event.target.getDOMNode().isContentEditable;\n");
          out.write("\n");
          out.write("\t\tif (!validDropTarget) {\n");
          out.write("\t\t\tevent.preventDefault();\n");
          out.write("\t\t}\n");
          out.write("\t});\n");
          out.write("\n");
          out.write("\tvar preventImageDropHandler = windowNode.on('drop', (event) => {\n");
          out.write("\t\tvar validDropTarget = event.target.getDOMNode().isContentEditable;\n");
          out.write("\n");
          out.write("\t\tif (!validDropTarget) {\n");
          out.write("\t\t\tevent.preventDefault();\n");
          out.write("\t\t\tevent.stopImmediatePropagation();\n");
          out.write("\t\t}\n");
          out.write("\t});\n");
          out.write("\n");
          out.write("\tvar eventHandles = [\n");
          out.write("\t\tLiferay.on('inputLocalized:localeChanged', onLocaleChangedHandler),\n");
          out.write("\t\tpreventImageDragoverHandler,\n");
          out.write("\t\tpreventImageDropHandler,\n");
          out.write("\t];\n");
          out.write("\n");
          out.write("\twindow['");
          out.print( name );
          out.write("'] = {\n");
          out.write("\t\tcreate: function () {\n");
          out.write("\t\t\tif (!window['");
          out.print( name );
          out.write("'].instanceReady) {\n");
          out.write("\t\t\t\tcreateEditor();\n");
          out.write("\t\t\t}\n");
          out.write("\t\t},\n");
          out.write("\n");
          out.write("\t\tdestroy: function () {\n");
          out.write("\t\t\twindow['");
          out.print( name );
          out.write("'].dispose();\n");
          out.write("\n");
          out.write("\t\t\twindow['");
          out.print( name );
          out.write("'] = null;\n");
          out.write("\n");
          out.write("\t\t\tLiferay.namespace('EDITORS').ckeditor.removeInstance();\n");
          out.write("\t\t},\n");
          out.write("\n");
          out.write("\t\tdispose: function () {\n");
          out.write("\t\t\tvar editor = CKEDITOR.instances['");
          out.print( name );
          out.write("'];\n");
          out.write("\n");
          out.write("\t\t\tif (editor) {\n");
          out.write("\t\t\t\teditor.destroy();\n");
          out.write("\n");
          out.write("\t\t\t\twindow['");
          out.print( name );
          out.write("'].instanceReady = false;\n");
          out.write("\t\t\t}\n");
          out.write("\n");
          out.write("\t\t\tnew A.EventHandle(eventHandles).detach();\n");
          out.write("\n");
          out.write("\t\t\tvar editorEl = document.getElementById('");
          out.print( name );
          out.write("');\n");
          out.write("\n");
          out.write("\t\t\tif (editorEl) {\n");
          out.write("\t\t\t\teditorEl.parentNode.removeChild(editorEl);\n");
          out.write("\t\t\t}\n");
          out.write("\t\t},\n");
          out.write("\n");
          out.write("\t\tfocus: function () {\n");
          out.write("\t\t\tCKEDITOR.instances['");
          out.print( name );
          out.write("'].focus();\n");
          out.write("\t\t},\n");
          out.write("\n");
          out.write("\t\tgetCkData: function () {\n");
          out.write("\t\t\tvar data;\n");
          out.write("\n");
          out.write("\t\t\tif (!window['");
          out.print( name );
          out.write("'].instanceReady) {\n");
          out.write("\t\t\t\tdata = getInitialContent();\n");
          out.write("\t\t\t}\n");
          out.write("\t\t\telse {\n");
          out.write("\t\t\t\tdata = CKEDITOR.instances['");
          out.print( name );
          out.write("'].getData();\n");
          out.write("\n");
          out.write("\t\t\t\tif (CKEDITOR.env.gecko && CKEDITOR.tools.trim(data) == '<br />') {\n");
          out.write("\t\t\t\t\tdata = '';\n");
          out.write("\t\t\t\t}\n");
          out.write("\t\t\t}\n");
          out.write("\n");
          out.write("\t\t\treturn data;\n");
          out.write("\t\t},\n");
          out.write("\n");
          out.write("\t\tgetHTML: function () {\n");
          out.write("\t\t\treturn window['");
          out.print( name );
          out.write("'].getCkData();\n");
          out.write("\t\t},\n");
          out.write("\n");
          out.write("\t\tgetNativeEditor: function () {\n");
          out.write("\t\t\treturn CKEDITOR.instances['");
          out.print( name );
          out.write("'];\n");
          out.write("\t\t},\n");
          out.write("\n");
          out.write("\t\tgetText: function () {\n");
          out.write("\t\t\tvar data;\n");
          out.write("\n");
          out.write("\t\t\tif (!window['");
          out.print( name );
          out.write("'].instanceReady) {\n");
          out.write("\t\t\t\tdata = getInitialContent();\n");
          out.write("\t\t\t}\n");
          out.write("\t\t\telse {\n");
          out.write("\t\t\t\tvar editor = CKEDITOR.instances['");
          out.print( name );
          out.write("'];\n");
          out.write("\n");
          out.write("\t\t\t\tdata = editor.editable().getText();\n");
          out.write("\t\t\t}\n");
          out.write("\n");
          out.write("\t\t\treturn data;\n");
          out.write("\t\t},\n");
          out.write("\n");
          out.write("\t\tinstanceReady: false,\n");
          out.write("\n");
          out.write("\t\t");
if (
 Validator.isNotNull(onBlurMethod) ) {
          out.write("\n");
          out.write("\t\t\tonBlurCallback: function () {\n");
          out.write("\t\t\t\twindow['");
          out.print( HtmlUtil.escapeJS(onBlurMethod) );
          out.write("'](\n");
          out.write("\t\t\t\t\tCKEDITOR.instances['");
          out.print( name );
          out.write("']\n");
          out.write("\t\t\t\t);\n");
          out.write("\t\t\t},\n");
          out.write("\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
if (
 Validator.isNotNull(onFocusMethod) ) {
          out.write("\n");
          out.write("\t\t\tonFocusCallback: function () {\n");
          out.write("\t\t\t\twindow['");
          out.print( HtmlUtil.escapeJS(onFocusMethod) );
          out.write("'](\n");
          out.write("\t\t\t\t\tCKEDITOR.instances['");
          out.print( name );
          out.write("']\n");
          out.write("\t\t\t\t);\n");
          out.write("\t\t\t},\n");
          out.write("\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\tsetHTML: function (value) {\n");
          out.write("\t\t\tvar ckEditorInstance = CKEDITOR.instances['");
          out.print( name );
          out.write("'];\n");
          out.write("\n");
          out.write("\t\t\tvar win = window['");
          out.print( name );
          out.write("'];\n");
          out.write("\n");
          out.write("\t\t\tvar setHTML = function (data) {\n");
          out.write("\t\t\t\tif (instanceDataReady) {\n");
          out.write("\t\t\t\t\tckEditorInstance.setData(data);\n");
          out.write("\t\t\t\t}\n");
          out.write("\t\t\t\telse {\n");
          out.write("\t\t\t\t\tinstancePendingData = data;\n");
          out.write("\t\t\t\t}\n");
          out.write("\n");
          out.write("\t\t\t\twin._setStyles();\n");
          out.write("\t\t\t};\n");
          out.write("\n");
          out.write("\t\t\tif (win.instanceReady) {\n");
          out.write("\t\t\t\tsetHTML(value);\n");
          out.write("\t\t\t}\n");
          out.write("\t\t\telse {\n");
          out.write("\t\t\t\tinstancePendingData = value;\n");
          out.write("\t\t\t}\n");
          out.write("\t\t},\n");
          out.write("\t};\n");
          out.write("\n");
          out.write("\tvar addAUIClass = function (iframe) {\n");
          out.write("\t\tif (iframe) {\n");
          out.write("\t\t\tvar iframeWin = iframe.getDOM().contentWindow;\n");
          out.write("\n");
          out.write("\t\t\tif (iframeWin) {\n");
          out.write("\t\t\t\tvar iframeDoc = iframeWin.document.documentElement;\n");
          out.write("\n");
          out.write("\t\t\t\tA.one(iframeDoc).addClass('aui');\n");
          out.write("\t\t\t}\n");
          out.write("\t\t}\n");
          out.write("\t};\n");
          out.write("\n");
          out.write("\twindow['");
          out.print( name );
          out.write("']._setStyles = function () {\n");
          out.write("\t\tvar ckEditor = A.one('#cke_");
          out.print( name );
          out.write("');\n");
          out.write("\n");
          out.write("\t\tif (ckEditor) {\n");
          out.write("\t\t\tvar iframe = ckEditor.one('iframe');\n");
          out.write("\n");
          out.write("\t\t\taddAUIClass(iframe);\n");
          out.write("\n");
          out.write("\t\t\tvar ckePanelDelegate = Liferay.Data['");
          out.print( name );
          out.write("Handle'];\n");
          out.write("\n");
          out.write("\t\t\tif (!ckePanelDelegate) {\n");
          out.write("\t\t\t\tckePanelDelegate = ckEditor.delegate(\n");
          out.write("\t\t\t\t\t'click',\n");
          out.write("\t\t\t\t\t(event) => {\n");
          out.write("\t\t\t\t\t\tvar panelFrame = A.one('.cke_combopanel .cke_panel_frame');\n");
          out.write("\n");
          out.write("\t\t\t\t\t\taddAUIClass(panelFrame);\n");
          out.write("\n");
          out.write("\t\t\t\t\t\tckePanelDelegate.detach();\n");
          out.write("\n");
          out.write("\t\t\t\t\t\tLiferay.Data['");
          out.print( name );
          out.write("Handle'] = null;\n");
          out.write("\t\t\t\t\t},\n");
          out.write("\t\t\t\t\t'.cke_combo'\n");
          out.write("\t\t\t\t);\n");
          out.write("\n");
          out.write("\t\t\t\tLiferay.Data['");
          out.print( name );
          out.write("Handle'] = ckePanelDelegate;\n");
          out.write("\t\t\t}\n");
          out.write("\t\t}\n");
          out.write("\t};\n");
          out.write("\n");
          out.write("\tLiferay.fire('editorAPIReady', {\n");
          out.write("\t\teditor: window['");
          out.print( name );
          out.write("'],\n");
          out.write("\t\teditorName: '");
          out.print( name );
          out.write("',\n");
          out.write("\t});\n");
          out.write("\n");
          out.write("\t");
if (
 inlineEdit && Validator.isNotNull(inlineEditSaveURL) ) {
          out.write("\n");
          out.write("\t\tvar inlineEditor;\n");
          out.write("\n");
          out.write("\t\tLiferay.on('toggleControls', (event) => {\n");
          out.write("\t\t\tif (event.src === 'ui') {\n");
          out.write("\t\t\t\tvar ckEditor = CKEDITOR.instances['");
          out.print( name );
          out.write("'];\n");
          out.write("\n");
          out.write("\t\t\t\tif (event.enabled && !ckEditor) {\n");
          out.write("\t\t\t\t\tcreateEditor();\n");
          out.write("\t\t\t\t}\n");
          out.write("\t\t\t\telse if (ckEditor) {\n");
          out.write("\t\t\t\t\tinlineEditor.destroy();\n");
          out.write("\t\t\t\t\tckEditor.destroy();\n");
          out.write("\n");
          out.write("\t\t\t\t\tvar editorNode = A.one('#");
          out.print( name );
          out.write("');\n");
          out.write("\n");
          out.write("\t\t\t\t\tif (editorNode) {\n");
          out.write("\t\t\t\t\t\teditorNode.removeAttribute('contenteditable');\n");
          out.write("\t\t\t\t\t\teditorNode.removeClass('lfr-editable');\n");
          out.write("\t\t\t\t\t}\n");
          out.write("\t\t\t\t}\n");
          out.write("\t\t\t}\n");
          out.write("\t\t});\n");
          out.write("\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\tvar ckEditorContent;\n");
          out.write("\tvar currentToolbarSet;\n");
          out.write("\n");
          out.write("\tvar initialToolbarSet =\n");
          out.write("\t\t'");
          out.print( TextFormatter.format(HtmlUtil.escapeJS(toolbarSet), TextFormatter.M) );
          out.write("';\n");
          out.write("\n");
          out.write("\tfunction getToolbarSet(toolbarSet) {\n");
          out.write("\t\tvar Util = Liferay.Util;\n");
          out.write("\n");
          out.write("\t\tif (Util.isPhone()) {\n");
          out.write("\t\t\ttoolbarSet = 'phone';\n");
          out.write("\t\t}\n");
          out.write("\t\telse if (Util.isTablet()) {\n");
          out.write("\t\t\ttoolbarSet = 'tablet';\n");
          out.write("\t\t}\n");
          out.write("\n");
          out.write("\t\treturn toolbarSet;\n");
          out.write("\t}\n");
          out.write("\n");
          out.write("\tvar afterVal = function () {\n");
          out.write("\t\treturn new A.Do.AlterReturn(\n");
          out.write("\t\t\t'Return editor content',\n");
          out.write("\t\t\twindow['");
          out.print( name );
          out.write("'].getHTML()\n");
          out.write("\t\t);\n");
          out.write("\t};\n");
          out.write("\n");
          out.write("\tvar createEditor = function () {\n");
          out.write("\t\tvar editorNode = A.one('#");
          out.print( name );
          out.write("');\n");
          out.write("\n");
          out.write("\t\tif (!editorNode) {\n");
          out.write("\t\t\tvar editorContainer = A.one('#");
          out.print( name );
          out.write("Container');\n");
          out.write("\n");
          out.write("\t\t\teditorContainer.setHTML('');\n");
          out.write("\n");
          out.write("\t\t\teditorNode = A.Node.create('");
          out.print( HtmlUtil.escapeJS(editor) );
          out.write("');\n");
          out.write("\n");
          out.write("\t\t\teditorContainer.appendChild(editorNode);\n");
          out.write("\t\t}\n");
          out.write("\n");
          out.write("\t\tif (editorNode) {\n");
          out.write("\t\t\teditorNode.attr('contenteditable', true);\n");
          out.write("\t\t\teditorNode.addClass('lfr-editable');\n");
          out.write("\n");
          out.write("\t\t\teventHandles.push(A.Do.after(afterVal, editorNode, 'val', this));\n");
          out.write("\t\t}\n");
          out.write("\n");
          out.write("\t\tfunction initData() {\n");
          out.write("\t\t\tif (!ckEditorContent) {\n");
          out.write("\t\t\t\tckEditorContent = getInitialContent();\n");
          out.write("\t\t\t}\n");
          out.write("\n");
          out.write("\t\t\tckEditor.setData(ckEditorContent, () => {\n");
          out.write("\t\t\t\tckEditor.resetDirty();\n");
          out.write("\n");
          out.write("\t\t\t\tckEditorContent = '';\n");
          out.write("\t\t\t});\n");
          out.write("\n");
          out.write("\t\t\twindow['");
          out.print( name );
          out.write("']._setStyles();\n");
          out.write("\n");
          out.write("\t\t\t");
if (
 Validator.isNotNull(onInitMethod) ) {
          out.write("\n");
          out.write("\t\t\t\twindow['");
          out.print( HtmlUtil.escapeJS(onInitMethod) );
          out.write("']();\n");
          out.write("\t\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t\tLiferay.component('");
          out.print( name );
          out.write("', window['");
          out.print( name );
          out.write("'], {\n");
          out.write("\t\t\t\tportletId: '");
          out.print( portletId );
          out.write("',\n");
          out.write("\t\t\t});\n");
          out.write("\t\t}\n");
          out.write("\n");
          out.write("\t\tcurrentToolbarSet = getToolbarSet(initialToolbarSet);\n");
          out.write("\n");
          out.write("\t\tvar defaultConfig = {\n");
          out.write("\t\t\tfilebrowserBrowseUrl: '',\n");
          out.write("\t\t\tfilebrowserFlashBrowseUrl: '',\n");
          out.write("\t\t\tfilebrowserImageBrowseLinkUrl: '',\n");
          out.write("\t\t\tfilebrowserImageBrowseUrl: '',\n");
          out.write("\t\t\tfilebrowserUploadUrl: null,\n");
          out.write("\t\t\ttoolbar: currentToolbarSet,\n");
          out.write("\t\t};\n");
          out.write("\n");
          out.write("\t\tvar editorConfig = ");
          out.print( Validator.isNotNull(editorConfigJSONObject) ? editorConfigJSONObject : "{}" );
          out.write(";\n");
          out.write("\n");
          out.write("\t\tvar config = A.merge(defaultConfig, editorConfig);\n");
          out.write("\n");
          out.write("\t\tCKEDITOR.");
          out.print( inlineEdit ? "inline" : "replace" );
          out.write('(');
          out.write('\'');
          out.print( name );
          out.write("', config);\n");
          out.write("\n");
          out.write("\t\tLiferay.on('");
          out.print( name );
          out.write("selectItem', (event) => {\n");
          out.write("\t\t\tCKEDITOR.tools.callFunction(event.ckeditorfuncnum, event.value);\n");
          out.write("\t\t});\n");
          out.write("\n");
          out.write("\t\tvar ckEditor = CKEDITOR.instances['");
          out.print( name );
          out.write("'];\n");
          out.write("\n");
          out.write("\t\t");
          //  liferay-util:dynamic-include
          com.liferay.taglib.util.DynamicIncludeTag _jspx_th_liferay$1util_dynamic$1include_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.DynamicIncludeTag.class) : new com.liferay.taglib.util.DynamicIncludeTag();
          _jspx_th_liferay$1util_dynamic$1include_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1util_dynamic$1include_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
          _jspx_th_liferay$1util_dynamic$1include_0.setKey( "com.liferay.frontend.editor.ckeditor.web#" + editorName + "#onEditorCreate" );
          int _jspx_eval_liferay$1util_dynamic$1include_0 = _jspx_th_liferay$1util_dynamic$1include_0.doStartTag();
          if (_jspx_th_liferay$1util_dynamic$1include_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_dynamic$1include_0);
            _jspx_th_liferay$1util_dynamic$1include_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_dynamic$1include_0);
          _jspx_th_liferay$1util_dynamic$1include_0.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\tLiferay.namespace('EDITORS').ckeditor.addInstance();\n");
          out.write("\n");
          out.write("\t\t");
if (
 inlineEdit && Validator.isNotNull(inlineEditSaveURL) ) {
          out.write("\n");
          out.write("\t\t\tinlineEditor = new Liferay.CKEditorInline({\n");
          out.write("\t\t\t\teditor: ckEditor,\n");
          out.write("\t\t\t\teditorName: '");
          out.print( name );
          out.write("',\n");
          out.write("\t\t\t\tnamespace: '");
          if (_jspx_meth_portlet_namespace_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("',\n");
          out.write("\t\t\t\tsaveURL: '");
          out.print( inlineEditSaveURL );
          out.write("',\n");
          out.write("\t\t\t});\n");
          out.write("\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\tvar customDataProcessorLoaded = false;\n");
          out.write("\n");
          out.write("\t\t");

		boolean useCustomDataProcessor = (editorOptionsDynamicAttributes != null) && GetterUtil.getBoolean(editorOptionsDynamicAttributes.get("useCustomDataProcessor"));
		
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
if (
 useCustomDataProcessor ) {
          out.write("\n");
          out.write("\t\t\tckEditor.on('customDataProcessorLoaded', () => {\n");
          out.write("\t\t\t\tcustomDataProcessorLoaded = true;\n");
          out.write("\n");
          out.write("\t\t\t\tif (instanceReady) {\n");
          out.write("\t\t\t\t\tinitData();\n");
          out.write("\t\t\t\t}\n");
          out.write("\n");
          out.write("\t\t\t\t// LPS-118801\n");
          out.write("\n");
          out.write("\t\t\t\tvar editorPath =\n");
          out.write("\t\t\t\t\t'");
          out.print( HtmlUtil.escapeJS(PortalWebResourcesUtil.getContextPath(PortalWebResourceConstants.RESOURCE_TYPE_EDITOR_CKEDITOR)) );
          out.write("';\n");
          out.write("\n");
          out.write("\t\t\t\tdocument\n");
          out.write("\t\t\t\t\t.querySelectorAll(\n");
          out.write("\t\t\t\t\t\t'link[href*=\"' +\n");
          out.write("\t\t\t\t\t\t\teditorPath +\n");
          out.write("\t\t\t\t\t\t\t'\"],script[src*=\"' +\n");
          out.write("\t\t\t\t\t\t\teditorPath +\n");
          out.write("\t\t\t\t\t\t\t'\"]'\n");
          out.write("\t\t\t\t\t)\n");
          out.write("\t\t\t\t\t.forEach((tag) => {\n");
          out.write("\t\t\t\t\t\ttag.setAttribute('data-senna-track', 'temporary');\n");
          out.write("\t\t\t\t\t});\n");
          out.write("\t\t\t});\n");
          out.write("\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\tvar instanceReady = false;\n");
          out.write("\n");
          out.write("\t\tckEditor.on('instanceReady', () => {\n");
          out.write("\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t");
if (
 useCustomDataProcessor ) {
          out.write("\n");
          out.write("\t\t\t\t\tinstanceReady = true;\n");
          out.write("\n");
          out.write("\t\t\t\t\tif (customDataProcessorLoaded) {\n");
          out.write("\t\t\t\t\t\tinitData();\n");
          out.write("\t\t\t\t\t}\n");
          out.write("\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t");
}
else {
          out.write("\n");
          out.write("\t\t\t\t\tinitData();\n");
          out.write("\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t\twindow['");
          out.print( name );
          out.write("'].instanceReady = true;\n");
          out.write("\n");
          out.write("\t\t\t");
if (
 Validator.isNotNull(onBlurMethod) ) {
          out.write("\n");
          out.write("\t\t\t\tCKEDITOR.instances['");
          out.print( name );
          out.write("'].on(\n");
          out.write("\t\t\t\t\t'blur',\n");
          out.write("\t\t\t\t\twindow['");
          out.print( name );
          out.write("'].onBlurCallback\n");
          out.write("\t\t\t\t);\n");
          out.write("\t\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t");
if (
 Validator.isNotNull(onFocusMethod) ) {
          out.write("\n");
          out.write("\t\t\t\tCKEDITOR.instances['");
          out.print( name );
          out.write("'].on(\n");
          out.write("\t\t\t\t\t'focus',\n");
          out.write("\t\t\t\t\twindow['");
          out.print( name );
          out.write("'].onFocusCallback\n");
          out.write("\t\t\t\t);\n");
          out.write("\t\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t");
if (
 !(inlineEdit && Validator.isNotNull(inlineEditSaveURL)) ) {
          out.write("\n");
          out.write("\t\t\t\tvar initialEditor = CKEDITOR.instances['");
          out.print( name );
          out.write("'].id;\n");
          out.write("\n");
          out.write("\t\t\t\teventHandles.push(\n");
          out.write("\t\t\t\t\tA.getWin().on(\n");
          out.write("\t\t\t\t\t\t'resize',\n");
          out.write("\t\t\t\t\t\tA.debounce(() => {\n");
          out.write("\t\t\t\t\t\t\tif (currentToolbarSet != getToolbarSet(initialToolbarSet)) {\n");
          out.write("\t\t\t\t\t\t\t\tvar ckeditorInstance =\n");
          out.write("\t\t\t\t\t\t\t\t\tCKEDITOR.instances['");
          out.print( name );
          out.write("'];\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\tif (ckeditorInstance) {\n");
          out.write("\t\t\t\t\t\t\t\t\tvar currentEditor = ckeditorInstance.id;\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\tif (currentEditor === initialEditor) {\n");
          out.write("\t\t\t\t\t\t\t\t\t\tvar currentDialog = CKEDITOR.dialog.getCurrent();\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\tif (currentDialog) {\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tcurrentDialog.hide();\n");
          out.write("\t\t\t\t\t\t\t\t\t\t}\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\tckEditorContent = ckeditorInstance.getData();\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\twindow['");
          out.print( name );
          out.write("'].dispose();\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\twindow['");
          out.print( name );
          out.write("'].create();\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\twindow['");
          out.print( name );
          out.write("'].setHTML(ckEditorContent);\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\tinitialEditor =\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tCKEDITOR.instances['");
          out.print( name );
          out.write("'].id;\n");
          out.write("\t\t\t\t\t\t\t\t\t}\n");
          out.write("\t\t\t\t\t\t\t\t}\n");
          out.write("\t\t\t\t\t\t\t}\n");
          out.write("\t\t\t\t\t\t}, 250)\n");
          out.write("\t\t\t\t\t)\n");
          out.write("\t\t\t\t);\n");
          out.write("\t\t\t");
}
          out.write("\n");
          out.write("\t\t});\n");
          out.write("\n");
          out.write("\t\t");
if (
 Validator.isNotNull(onChangeMethod) ) {
          out.write("\n");
          out.write("\t\t\tckEditor.on('change', (event) => {\n");
          out.write("\t\t\t\twindow['");
          out.print( HtmlUtil.escapeJS(onChangeMethod) );
          out.write("'](\n");
          out.write("\t\t\t\t\twindow['");
          out.print( name );
          out.write("'].getHTML()\n");
          out.write("\t\t\t\t);\n");
          out.write("\t\t\t});\n");
          out.write("\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\tckEditor.on('dataReady', (event) => {\n");
          out.write("\t\t\tif (instancePendingData !== null) {\n");
          out.write("\t\t\t\tvar pendingData = instancePendingData;\n");
          out.write("\n");
          out.write("\t\t\t\tinstancePendingData = null;\n");
          out.write("\n");
          out.write("\t\t\t\tckEditor.setData(pendingData);\n");
          out.write("\t\t\t}\n");
          out.write("\t\t\telse {\n");
          out.write("\t\t\t\tinstanceDataReady = true;\n");
          out.write("\t\t\t}\n");
          out.write("\n");
          out.write("\t\t\twindow['");
          out.print( name );
          out.write("']._setStyles();\n");
          out.write("\t\t});\n");
          out.write("\n");
          out.write("\t\tckEditor.on('drop', function (event) {\n");
          out.write("\t\t\tvar data = event.data.dataTransfer.getData('text/html');\n");
          out.write("\n");
          out.write("\t\t\tif (data) {\n");
          out.write("\t\t\t\tvar fragment = CKEDITOR.htmlParser.fragment.fromHtml(data);\n");
          out.write("\n");
          out.write("\t\t\t\tvar element = fragment.children[0];\n");
          out.write("\n");
          out.write("\t\t\t\tif (element.hasClass('cke_widget_image')) {\n");
          out.write("\t\t\t\t\telement = element.children[0];\n");
          out.write("\t\t\t\t}\n");
          out.write("\n");
          out.write("\t\t\t\tif (this.pasteFilter && element.name) {\n");
          out.write("\t\t\t\t\treturn this.pasteFilter.check(element.name);\n");
          out.write("\t\t\t\t}\n");
          out.write("\t\t\t}\n");
          out.write("\t\t});\n");
          out.write("\n");
          out.write("\t\tckEditor.on('setData', (event) => {\n");
          out.write("\t\t\tinstanceDataReady = false;\n");
          out.write("\t\t});\n");
          out.write("\n");
          out.write("\t\tif (UA.edge && parseInt(UA.edge, 10) >= 14) {\n");
          out.write("\t\t\tvar resetActiveElementValidation = function (activeElement) {\n");
          out.write("\t\t\t\tactiveElement = A.one(activeElement);\n");
          out.write("\n");
          out.write("\t\t\t\tvar activeElementAncestor = activeElement.ancestor();\n");
          out.write("\n");
          out.write("\t\t\t\tif (\n");
          out.write("\t\t\t\t\tactiveElementAncestor.hasClass('has-error') ||\n");
          out.write("\t\t\t\t\tactiveElementAncestor.hasClass('has-success')\n");
          out.write("\t\t\t\t) {\n");
          out.write("\t\t\t\t\tactiveElementAncestor.removeClass('has-error');\n");
          out.write("\t\t\t\t\tactiveElementAncestor.removeClass('has-success');\n");
          out.write("\n");
          out.write("\t\t\t\t\tvar formValidatorStack = activeElementAncestor.one(\n");
          out.write("\t\t\t\t\t\t'.form-validator-stack'\n");
          out.write("\t\t\t\t\t);\n");
          out.write("\n");
          out.write("\t\t\t\t\tif (formValidatorStack) {\n");
          out.write("\t\t\t\t\t\tformValidatorStack.remove();\n");
          out.write("\t\t\t\t\t}\n");
          out.write("\t\t\t\t}\n");
          out.write("\t\t\t};\n");
          out.write("\n");
          out.write("\t\t\tvar onBlur = function (activeElement) {\n");
          out.write("\t\t\t\tresetActiveElementValidation(activeElement);\n");
          out.write("\n");
          out.write("\t\t\t\tsetTimeout(() => {\n");
          out.write("\t\t\t\t\tif (activeElement) {\n");
          out.write("\t\t\t\t\t\tckEditor.focusManager.blur(true);\n");
          out.write("\t\t\t\t\t\tactiveElement.focus();\n");
          out.write("\t\t\t\t\t}\n");
          out.write("\t\t\t\t}, 0);\n");
          out.write("\t\t\t};\n");
          out.write("\n");
          out.write("\t\t\tckEditor.on('instanceReady', () => {\n");
          out.write("\t\t\t\tvar editorWrapper = A.one('#cke_");
          out.print( name );
          out.write("');\n");
          out.write("\n");
          out.write("\t\t\t\tif (editorWrapper) {\n");
          out.write("\t\t\t\t\teditorWrapper.once('mouseenter', function (event) {\n");
          out.write("\t\t\t\t\t\tckEditor.once(\n");
          out.write("\t\t\t\t\t\t\t'focus',\n");
          out.write("\t\t\t\t\t\t\tonBlur.bind(this, document.activeElement)\n");
          out.write("\t\t\t\t\t\t);\n");
          out.write("\t\t\t\t\t\tckEditor.focus();\n");
          out.write("\t\t\t\t\t});\n");
          out.write("\t\t\t\t}\n");
          out.write("\t\t\t});\n");
          out.write("\t\t}\n");
          out.write("\t};\n");
          out.write("\n");
          out.write("\t");

	String toogleControlsStatus = GetterUtil.getString(SessionClicks.get(request, "com.liferay.frontend.js.web_toggleControls", "visible"));
	
          out.write("\n");
          out.write("\n");
          out.write("\t");
if (
 autoCreate && ((inlineEdit && toogleControlsStatus.equals("visible")) || !inlineEdit) ) {
          out.write("\n");
          out.write("\t\tcreateEditor();\n");
          out.write("\t");
}
          out.write('\n');
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
      out.write('\n');
      out.write('\n');
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
}
