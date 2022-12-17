package org.apache.jsp.discussion;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.frontend.icons.FrontendIconsUtil;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.model.*;
import com.liferay.portal.kernel.model.impl.*;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletURLUtil;
import com.liferay.portal.kernel.portlet.url.builder.PortletURLBuilder;
import com.liferay.portal.kernel.service.*;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.FastDateFormatFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.HttpComponentsUtil;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.PortletKeys;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.impl.*;
import com.liferay.portal.util.PropsValues;
import com.liferay.subscription.service.SubscriptionLocalServiceUtil;
import com.liferay.taglib.aui.AUIUtil;
import com.liferay.taglib.util.TagResourceBundleUtil;
import java.text.Format;
import java.util.Date;
import java.util.ResourceBundle;
import javax.portlet.PortletMode;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.PortletURL;
import com.liferay.comment.constants.CommentConstants;
import com.liferay.comment.taglib.internal.context.CommentDisplayContextProviderUtil;
import com.liferay.comment.taglib.internal.context.helper.DiscussionRequestHelper;
import com.liferay.comment.taglib.internal.context.helper.DiscussionTaglibHelper;
import com.liferay.portal.kernel.comment.CommentManagerUtil;
import com.liferay.portal.kernel.comment.Discussion;
import com.liferay.portal.kernel.comment.DiscussionComment;
import com.liferay.portal.kernel.comment.DiscussionCommentIterator;
import com.liferay.portal.kernel.comment.DiscussionPermission;
import com.liferay.portal.kernel.comment.WorkflowableComment;
import com.liferay.portal.kernel.comment.display.context.CommentSectionDisplayContext;
import com.liferay.portal.kernel.comment.display.context.CommentTreeDisplayContext;
import com.liferay.portal.kernel.security.auth.AuthTokenUtil;
import com.liferay.portal.kernel.service.ServiceContextFunction;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.staging.StagingGroupHelper;
import com.liferay.staging.StagingGroupHelperUtil;

public final class page_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(13);
    _jspx_dependants.add("/discussion/init.jsp");
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/META-INF/c.tld");
    _jspx_dependants.add("/META-INF/liferay-portlet_2_0.tld");
    _jspx_dependants.add("/META-INF/liferay-aui.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-clay.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-editor.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-frontend.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/ratings.tld");
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

pageContext.setAttribute("resourceBundle", resourceBundle);

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

String randomNamespace = StringUtil.randomId() + StringPool.UNDERLINE;

boolean skipEditorLoading = ParamUtil.getBoolean(request, "skipEditorLoading");

DiscussionRequestHelper discussionRequestHelper = new DiscussionRequestHelper(request);
DiscussionTaglibHelper discussionTaglibHelper = new DiscussionTaglibHelper(request);

DiscussionPermission discussionPermission = CommentManagerUtil.getDiscussionPermission(discussionRequestHelper.getPermissionChecker());

Discussion discussion = (Discussion)request.getAttribute("liferay-comment:discussion:discussion");

if (discussion == null) {
	discussion = CommentManagerUtil.getDiscussion(user.getUserId(), discussionRequestHelper.getScopeGroupId(), discussionTaglibHelper.getClassName(), discussionTaglibHelper.getClassPK(), new ServiceContextFunction(renderRequest));
}

DiscussionComment rootDiscussionComment = (discussion == null) ? null : discussion.getRootDiscussionComment();

CommentSectionDisplayContext commentSectionDisplayContext = CommentDisplayContextProviderUtil.getCommentSectionDisplayContext(request, response, discussionPermission, discussion);
StagingGroupHelper stagingGroupHelper = StagingGroupHelperUtil.getStagingGroupHelper();

      out.write("\n");
      out.write("\n");
      out.write("<section>\n");
      out.write("\t<div class=\"lfr-message-response\" id=\"");
      out.print( randomNamespace );
      out.write("discussionStatusMessages\"></div>\n");
      out.write("\n");
      out.write("\t");
if (
 (discussion != null) && discussion.isMaxCommentsLimitExceeded() ) {
      out.write("\n");
      out.write("\t\t<div class=\"alert alert-warning\">\n");
      out.write("\t\t\t");
      if (_jspx_meth_liferay$1ui_message_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t");
if (
 commentSectionDisplayContext.isDiscussionVisible() ) {
      out.write("\n");
      out.write("\t\t<div class=\"taglib-discussion\" id=\"");
      out.print( namespace );
      out.write("discussionContainer\">\n");
      out.write("\t\t\t");
      //  aui:form
      com.liferay.taglib.aui.FormTag _jspx_th_aui_form_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FormTag.class) : new com.liferay.taglib.aui.FormTag();
      _jspx_th_aui_form_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_form_0.setParent(null);
      _jspx_th_aui_form_0.setAction( discussionTaglibHelper.getFormAction() );
      _jspx_th_aui_form_0.setMethod("post");
      _jspx_th_aui_form_0.setName( discussionTaglibHelper.getFormName() );
      _jspx_th_aui_form_0.setPortletNamespace( namespace + randomNamespace );
      int _jspx_eval_aui_form_0 = _jspx_th_aui_form_0.doStartTag();
      if (_jspx_eval_aui_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t<input name=\"p_auth\" type=\"hidden\" value=\"");
        out.print( AuthTokenUtil.getToken(request) );
        out.write("\" />\n");
        out.write("\t\t\t\t<input name=\"namespace\" type=\"hidden\" value=\"");
        out.print( namespace + randomNamespace );
        out.write("\" />\n");
        out.write("\n");
        out.write("\t\t\t\t");

				String contentURL = PortalUtil.getCanonicalURL(discussionTaglibHelper.getRedirect(), themeDisplay, layout);

				contentURL = HttpComponentsUtil.removeParameter(contentURL, namespace + "skipEditorLoading");
				
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t<input name=\"contentURL\" type=\"hidden\" value=\"");
        out.print( contentURL );
        out.write("\" />\n");
        out.write("\n");
        out.write("\t\t\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_0.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_0.setName("randomNamespace");
        _jspx_th_aui_input_0.setType("hidden");
        _jspx_th_aui_input_0.setValue( randomNamespace );
        int _jspx_eval_aui_input_0 = _jspx_th_aui_input_0.doStartTag();
        if (_jspx_th_aui_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_0);
          _jspx_th_aui_input_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_0);
        _jspx_th_aui_input_0.release();
        out.write("\n");
        out.write("\t\t\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_1.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_1.setId( Constants.CMD );
        _jspx_th_aui_input_1.setName( Constants.CMD );
        _jspx_th_aui_input_1.setType("hidden");
        int _jspx_eval_aui_input_1 = _jspx_th_aui_input_1.doStartTag();
        if (_jspx_th_aui_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_1);
          _jspx_th_aui_input_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_1);
        _jspx_th_aui_input_1.release();
        out.write("\n");
        out.write("\t\t\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_2.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_2.setName("redirect");
        _jspx_th_aui_input_2.setType("hidden");
        _jspx_th_aui_input_2.setValue( discussionTaglibHelper.getRedirect() );
        int _jspx_eval_aui_input_2 = _jspx_th_aui_input_2.doStartTag();
        if (_jspx_th_aui_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_2);
          _jspx_th_aui_input_2.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_2);
        _jspx_th_aui_input_2.release();
        out.write("\n");
        out.write("\t\t\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_3.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_3.setName("assetEntryVisible");
        _jspx_th_aui_input_3.setType("hidden");
        _jspx_th_aui_input_3.setValue( discussionTaglibHelper.isAssetEntryVisible() );
        int _jspx_eval_aui_input_3 = _jspx_th_aui_input_3.doStartTag();
        if (_jspx_th_aui_input_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_3);
          _jspx_th_aui_input_3.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_3);
        _jspx_th_aui_input_3.release();
        out.write("\n");
        out.write("\t\t\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_4.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_4.setName("className");
        _jspx_th_aui_input_4.setType("hidden");
        _jspx_th_aui_input_4.setValue( discussionTaglibHelper.getClassName() );
        int _jspx_eval_aui_input_4 = _jspx_th_aui_input_4.doStartTag();
        if (_jspx_th_aui_input_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_4);
          _jspx_th_aui_input_4.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_4);
        _jspx_th_aui_input_4.release();
        out.write("\n");
        out.write("\t\t\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_5.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_5.setName("classPK");
        _jspx_th_aui_input_5.setType("hidden");
        _jspx_th_aui_input_5.setValue( discussionTaglibHelper.getClassPK() );
        int _jspx_eval_aui_input_5 = _jspx_th_aui_input_5.doStartTag();
        if (_jspx_th_aui_input_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_5);
          _jspx_th_aui_input_5.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_5);
        _jspx_th_aui_input_5.release();
        out.write("\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_aui_input_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_form_0, _jspx_page_context))
          return;
        out.write("\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_aui_input_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_form_0, _jspx_page_context))
          return;
        out.write("\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_aui_input_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_form_0, _jspx_page_context))
          return;
        out.write("\n");
        out.write("\t\t\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_9.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_9.setName("workflowAction");
        _jspx_th_aui_input_9.setType("hidden");
        _jspx_th_aui_input_9.setValue( String.valueOf(WorkflowConstants.ACTION_PUBLISH) );
        int _jspx_eval_aui_input_9 = _jspx_th_aui_input_9.doStartTag();
        if (_jspx_th_aui_input_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_9);
          _jspx_th_aui_input_9.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_9);
        _jspx_th_aui_input_9.release();
        out.write("\n");
        out.write("\t\t\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_10.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_10.setName("ajax");
        _jspx_th_aui_input_10.setType("hidden");
        _jspx_th_aui_input_10.setValue( true );
        int _jspx_eval_aui_input_10 = _jspx_th_aui_input_10.doStartTag();
        if (_jspx_th_aui_input_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_10);
          _jspx_th_aui_input_10.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_10);
        _jspx_th_aui_input_10.release();
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t");
if (
 commentSectionDisplayContext.isControlsVisible() ) {
        out.write("\n");
        out.write("\t\t\t\t\t");
        //  aui:fieldset
        com.liferay.taglib.aui.FieldsetTag _jspx_th_aui_fieldset_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FieldsetTag.class) : new com.liferay.taglib.aui.FieldsetTag();
        _jspx_th_aui_fieldset_0.setPageContext(_jspx_page_context);
        _jspx_th_aui_fieldset_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_fieldset_0.setCssClass("add-comment");
        _jspx_th_aui_fieldset_0.setId( randomNamespace + "messageScroll0" );
        int _jspx_eval_aui_fieldset_0 = _jspx_th_aui_fieldset_0.doStartTag();
        if (_jspx_eval_aui_fieldset_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t\t\t\t");
if (
 !discussion.isMaxCommentsLimitExceeded() ) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t<div id=\"");
          out.print( randomNamespace );
          out.write("messageScroll");
          out.print( rootDiscussionComment.getCommentId() );
          out.write("\">\n");
          out.write("\t\t\t\t\t\t\t\t");
          //  aui:input
          com.liferay.taglib.aui.InputTag _jspx_th_aui_input_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
          _jspx_th_aui_input_11.setPageContext(_jspx_page_context);
          _jspx_th_aui_input_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
          _jspx_th_aui_input_11.setName("commentId0");
          _jspx_th_aui_input_11.setType("hidden");
          _jspx_th_aui_input_11.setValue( rootDiscussionComment.getCommentId() );
          int _jspx_eval_aui_input_11 = _jspx_th_aui_input_11.doStartTag();
          if (_jspx_th_aui_input_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_11);
            _jspx_th_aui_input_11.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_11);
          _jspx_th_aui_input_11.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t");
          //  aui:input
          com.liferay.taglib.aui.InputTag _jspx_th_aui_input_12 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
          _jspx_th_aui_input_12.setPageContext(_jspx_page_context);
          _jspx_th_aui_input_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
          _jspx_th_aui_input_12.setName("parentCommentId0");
          _jspx_th_aui_input_12.setType("hidden");
          _jspx_th_aui_input_12.setValue( rootDiscussionComment.getCommentId() );
          int _jspx_eval_aui_input_12 = _jspx_th_aui_input_12.doStartTag();
          if (_jspx_th_aui_input_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_12);
            _jspx_th_aui_input_12.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_12);
          _jspx_th_aui_input_12.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t");

						Group siteGroup = themeDisplay.getSiteGroup();

						boolean canSubscribe = !stagingGroupHelper.isLocalStagingGroup(siteGroup) && !stagingGroupHelper.isRemoteStagingGroup(siteGroup) && themeDisplay.isSignedIn() && discussionPermission.hasSubscribePermission(company.getCompanyId(), siteGroup.getGroupId(), discussionTaglibHelper.getClassName(), discussionTaglibHelper.getClassPK());

						boolean subscribed = SubscriptionLocalServiceUtil.isSubscribed(company.getCompanyId(), user.getUserId(), discussionTaglibHelper.getSubscriptionClassName(), discussionTaglibHelper.getClassPK());

						String subscriptionOnClick = randomNamespace + "subscribeToComments(" + !subscribed + ");";
						
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t");
          //  clay:content-row
          com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag _jspx_th_clay_content$1row_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag();
          _jspx_th_clay_content$1row_0.setPageContext(_jspx_page_context);
          _jspx_th_clay_content$1row_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
          _jspx_th_clay_content$1row_0.setCssClass("mb-4");
          _jspx_th_clay_content$1row_0.setFloatElements("end");
          int _jspx_eval_clay_content$1row_0 = _jspx_th_clay_content$1row_0.doStartTag();
          if (_jspx_eval_clay_content$1row_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t");
            //  clay:content-col
            com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
            _jspx_th_clay_content$1col_0.setPageContext(_jspx_page_context);
            _jspx_th_clay_content$1col_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_0);
            _jspx_th_clay_content$1col_0.setContainerElement("span");
            _jspx_th_clay_content$1col_0.setCssClass("text-secondary text-uppercase");
            _jspx_th_clay_content$1col_0.setExpand( true );
            int _jspx_eval_clay_content$1col_0 = _jspx_th_clay_content$1col_0.doStartTag();
            if (_jspx_eval_clay_content$1col_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t<strong>");
              //  liferay-ui:message
              com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
              _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_0);
              _jspx_th_liferay$1ui_message_1.setArguments( discussion.getDiscussionCommentsCount() );
              _jspx_th_liferay$1ui_message_1.setKey( (discussion.getDiscussionCommentsCount() == 1) ? "x-comment" : "x-comments" );
              int _jspx_eval_liferay$1ui_message_1 = _jspx_th_liferay$1ui_message_1.doStartTag();
              if (_jspx_th_liferay$1ui_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_1);
                _jspx_th_liferay$1ui_message_1.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_1);
              _jspx_th_liferay$1ui_message_1.release();
              out.write("</strong>\n");
              out.write("\t\t\t\t\t\t\t");
            }
            if (_jspx_th_clay_content$1col_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_0);
              _jspx_th_clay_content$1col_0.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_0);
            _jspx_th_clay_content$1col_0.release();
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t");
            //  clay:content-col
            com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
            _jspx_th_clay_content$1col_1.setPageContext(_jspx_page_context);
            _jspx_th_clay_content$1col_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_0);
            int _jspx_eval_clay_content$1col_1 = _jspx_th_clay_content$1col_1.doStartTag();
            if (_jspx_eval_clay_content$1col_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t");
if (
 canSubscribe ) {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t");
if (
 subscribed ) {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t<button aria-label=\"");
              if (_jspx_meth_liferay$1ui_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_content$1col_1, _jspx_page_context))
                return;
              out.write("\" class=\"btn btn-outline-primary btn-sm\" onclick=\"");
              out.print( subscriptionOnClick );
              out.write("\" type=\"button\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_liferay$1ui_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_content$1col_1, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t</button>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t");
}
else {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t<button aria-label=\"");
              if (_jspx_meth_liferay$1ui_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_content$1col_1, _jspx_page_context))
                return;
              out.write("\" class=\"btn btn-outline-primary btn-sm\" onclick=\"");
              out.print( subscriptionOnClick );
              out.write("\" type=\"button\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_liferay$1ui_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_content$1col_1, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t</button>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t");
}
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t");
}
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
            }
            if (_jspx_th_clay_content$1col_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_1);
              _jspx_th_clay_content$1col_1.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_1);
            _jspx_th_clay_content$1col_1.release();
            out.write("\n");
            out.write("\t\t\t\t\t\t");
          }
          if (_jspx_th_clay_content$1row_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_0);
            _jspx_th_clay_content$1row_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_0);
          _jspx_th_clay_content$1row_0.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t");
if (
 !discussion.isMaxCommentsLimitExceeded() ) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_aui_input_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t");
if (
 commentSectionDisplayContext.isReplyButtonVisible() ) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"lfr-discussion-reply-container\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          //  clay:content-row
          com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag _jspx_th_clay_content$1row_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag();
          _jspx_th_clay_content$1row_1.setPageContext(_jspx_page_context);
          _jspx_th_clay_content$1row_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
          _jspx_th_clay_content$1row_1.setNoGutters("true");
          int _jspx_eval_clay_content$1row_1 = _jspx_th_clay_content$1row_1.doStartTag();
          if (_jspx_eval_clay_content$1row_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t");
            //  clay:content-col
            com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
            _jspx_th_clay_content$1col_2.setPageContext(_jspx_page_context);
            _jspx_th_clay_content$1col_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_1);
            _jspx_th_clay_content$1col_2.setCssClass("lfr-discussion-details");
            int _jspx_eval_clay_content$1col_2 = _jspx_th_clay_content$1col_2.doStartTag();
            if (_jspx_eval_clay_content$1col_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
              //  liferay-ui:user-portrait
              com.liferay.taglib.ui.UserPortraitTag _jspx_th_liferay$1ui_user$1portrait_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.UserPortraitTag.class) : new com.liferay.taglib.ui.UserPortraitTag();
              _jspx_th_liferay$1ui_user$1portrait_0.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_user$1portrait_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_2);
              _jspx_th_liferay$1ui_user$1portrait_0.setUser( user );
              int _jspx_eval_liferay$1ui_user$1portrait_0 = _jspx_th_liferay$1ui_user$1portrait_0.doStartTag();
              if (_jspx_th_liferay$1ui_user$1portrait_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_user$1portrait_0);
                _jspx_th_liferay$1ui_user$1portrait_0.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_user$1portrait_0);
              _jspx_th_liferay$1ui_user$1portrait_0.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t");
            }
            if (_jspx_th_clay_content$1col_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_2);
              _jspx_th_clay_content$1col_2.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_2);
            _jspx_th_clay_content$1col_2.release();
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t");
            //  clay:content-col
            com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
            _jspx_th_clay_content$1col_3.setPageContext(_jspx_page_context);
            _jspx_th_clay_content$1col_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_1);
            _jspx_th_clay_content$1col_3.setCssClass("lfr-discussion-editor");
            _jspx_th_clay_content$1col_3.setExpand( true );
            int _jspx_eval_clay_content$1col_3 = _jspx_th_clay_content$1col_3.doStartTag();
            if (_jspx_eval_clay_content$1col_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
              //  liferay-editor:editor
              com.liferay.frontend.editor.taglib.servlet.taglib.EditorTag _jspx_th_liferay$1editor_editor_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.editor.taglib.servlet.taglib.EditorTag.class) : new com.liferay.frontend.editor.taglib.servlet.taglib.EditorTag();
              _jspx_th_liferay$1editor_editor_0.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1editor_editor_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_3);
              _jspx_th_liferay$1editor_editor_0.setConfigKey("commentEditor");
              _jspx_th_liferay$1editor_editor_0.setContents("");
              _jspx_th_liferay$1editor_editor_0.setEditorName("ckeditor");
              _jspx_th_liferay$1editor_editor_0.setName("postReplyBody0");
              _jspx_th_liferay$1editor_editor_0.setOnChangeMethod("0ReplyOnChange");
              _jspx_th_liferay$1editor_editor_0.setPlaceholder("type-your-comment-here");
              _jspx_th_liferay$1editor_editor_0.setShowSource( false );
              _jspx_th_liferay$1editor_editor_0.setSkipEditorLoading( skipEditorLoading );
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
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_aui_input_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_content$1col_3, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
              //  aui:button-row
              com.liferay.taglib.aui.ButtonRowTag _jspx_th_aui_button$1row_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonRowTag.class) : new com.liferay.taglib.aui.ButtonRowTag();
              _jspx_th_aui_button$1row_0.setPageContext(_jspx_page_context);
              _jspx_th_aui_button$1row_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_3);
              int _jspx_eval_aui_button$1row_0 = _jspx_th_aui_button$1row_0.doStartTag();
              if (_jspx_eval_aui_button$1row_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
                //  aui:button
                com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
                _jspx_th_aui_button_0.setPageContext(_jspx_page_context);
                _jspx_th_aui_button_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_button$1row_0);
                _jspx_th_aui_button_0.setCssClass("btn-comment btn-sm");
                _jspx_th_aui_button_0.setDisabled( true );
                _jspx_th_aui_button_0.setId("postReplyButton0");
                _jspx_th_aui_button_0.setOnClick( randomNamespace + "postReply(0);" );
                _jspx_th_aui_button_0.setPrimary( true );
                _jspx_th_aui_button_0.setValue( themeDisplay.isSignedIn() ? "reply" : "reply-as" );
                int _jspx_eval_aui_button_0 = _jspx_th_aui_button_0.doStartTag();
                if (_jspx_th_aui_button_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_0);
                  _jspx_th_aui_button_0.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_0);
                _jspx_th_aui_button_0.release();
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
              }
              if (_jspx_th_aui_button$1row_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button$1row_0);
                _jspx_th_aui_button$1row_0.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button$1row_0);
              _jspx_th_aui_button$1row_0.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t");
            }
            if (_jspx_th_clay_content$1col_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_3);
              _jspx_th_clay_content$1col_3.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_3);
            _jspx_th_clay_content$1col_3.release();
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t");
          }
          if (_jspx_th_clay_content$1row_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_1);
            _jspx_th_clay_content$1row_1.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_1);
          _jspx_th_clay_content$1row_1.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t");
}
else {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
if (
 stagingGroupHelper.isLocalStagingGroup(siteGroup) || stagingGroupHelper.isRemoteStagingGroup(siteGroup) ) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"alert alert-info\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"alert-indicator\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<svg class=\"lexicon-icon lexicon-icon-info-circle\" focusable=\"false\" role=\"presentation\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<use xlink:href=\"");
          out.print( FrontendIconsUtil.getSpritemap(themeDisplay) );
          out.write("#info-circle\" />\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</svg>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</span>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong class=\"lead\">INFO:</strong>");
          if (_jspx_meth_liferay$1ui_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
}
else {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
          //  liferay-ui:icon
          com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
          _jspx_th_liferay$1ui_icon_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_icon_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
          _jspx_th_liferay$1ui_icon_0.setIcon("reply");
          _jspx_th_liferay$1ui_icon_0.setLabel( true );
          _jspx_th_liferay$1ui_icon_0.setMarkupView("lexicon");
          _jspx_th_liferay$1ui_icon_0.setMessage("please-sign-in-to-comment");
          _jspx_th_liferay$1ui_icon_0.setUrl( themeDisplay.getURLSignIn() );
          int _jspx_eval_liferay$1ui_icon_0 = _jspx_th_liferay$1ui_icon_0.doStartTag();
          if (_jspx_th_liferay$1ui_icon_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_0);
            _jspx_th_liferay$1ui_icon_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_0);
          _jspx_th_liferay$1ui_icon_0.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t");
}
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
}
          out.write("\n");
          out.write("\t\t\t\t\t\t");
}
          out.write("\n");
          out.write("\t\t\t\t\t");
        }
        if (_jspx_th_aui_fieldset_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset_0);
          _jspx_th_aui_fieldset_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset_0);
        _jspx_th_aui_fieldset_0.release();
        out.write("\n");
        out.write("\t\t\t\t");
}
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t");
if (
 commentSectionDisplayContext.isMessageThreadVisible() ) {
        out.write("\n");
        out.write("\t\t\t\t\t<a name=\"");
        out.print( randomNamespace );
        out.write("messages_top\"></a>\n");
        out.write("\n");
        out.write("\t\t\t\t\t<div>\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t");

						int index = 0;
						int rootIndexPage = 0;
						boolean moreCommentsPagination = false;

						DiscussionCommentIterator discussionCommentIterator = rootDiscussionComment.getThreadDiscussionCommentIterator();

						while (discussionCommentIterator.hasNext()) {
							index = GetterUtil.getInteger(request.getAttribute("liferay-comment:discussion:index"), 1);

							rootIndexPage = discussionCommentIterator.getIndexPage();

							if ((index + 1) > PropsValues.DISCUSSION_COMMENTS_DELTA_VALUE) {
								moreCommentsPagination = true;

								break;
							}

							request.setAttribute("liferay-comment:discussion:depth", 0);
							request.setAttribute("liferay-comment:discussion:discussion", discussion);
							request.setAttribute("liferay-comment:discussion:discussionComment", discussionCommentIterator.next());
							request.setAttribute("liferay-comment:discussion:randomNamespace", randomNamespace);
						
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        //  liferay-util:include
        com.liferay.taglib.util.IncludeTag _jspx_th_liferay$1util_include_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.IncludeTag.class) : new com.liferay.taglib.util.IncludeTag();
        _jspx_th_liferay$1util_include_0.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1util_include_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_liferay$1util_include_0.setPage("/discussion/view_message_thread.jsp");
        _jspx_th_liferay$1util_include_0.setServletContext( application );
        int _jspx_eval_liferay$1util_include_0 = _jspx_th_liferay$1util_include_0.doStartTag();
        if (_jspx_th_liferay$1util_include_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_include_0);
          _jspx_th_liferay$1util_include_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_include_0);
        _jspx_th_liferay$1util_include_0.release();
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t");

						}
						
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t");
if (
 moreCommentsPagination ) {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t<div class=\"lfr-discussion-more-comments\" id=\"");
        out.print( namespace );
        out.write("moreCommentsContainer\">\n");
        out.write("\t\t\t\t\t\t\t\t<button class=\"btn btn-secondary btn-sm\" id=\"");
        out.print( namespace );
        out.write("moreCommentsTrigger\" type=\"button\">");
        if (_jspx_meth_liferay$1ui_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_form_0, _jspx_page_context))
          return;
        out.write("</button>\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_15 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_15.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_15.setName("rootIndexPage");
        _jspx_th_aui_input_15.setType("hidden");
        _jspx_th_aui_input_15.setValue( String.valueOf(rootIndexPage) );
        int _jspx_eval_aui_input_15 = _jspx_th_aui_input_15.doStartTag();
        if (_jspx_th_aui_input_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_15);
          _jspx_th_aui_input_15.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_15);
        _jspx_th_aui_input_15.release();
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_16 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_16.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_16.setName("index");
        _jspx_th_aui_input_16.setType("hidden");
        _jspx_th_aui_input_16.setValue( String.valueOf(index) );
        int _jspx_eval_aui_input_16 = _jspx_th_aui_input_16.doStartTag();
        if (_jspx_th_aui_input_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_16);
          _jspx_th_aui_input_16.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_16);
        _jspx_th_aui_input_16.release();
        out.write("\n");
        out.write("\t\t\t\t\t\t\t</div>\n");
        out.write("\t\t\t\t\t\t");
}
        out.write("\n");
        out.write("\t\t\t\t\t</div>\n");
        out.write("\t\t\t\t");
}
        out.write("\n");
        out.write("\t\t\t");
      }
      if (_jspx_th_aui_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_form_0);
        _jspx_th_aui_form_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_form_0);
      _jspx_th_aui_form_0.release();
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t");

		PortletURL loginURL = PortletURLBuilder.create(
			PortletURLFactoryUtil.create(request, PortletKeys.FAST_LOGIN, PortletRequest.RENDER_PHASE)
		).setMVCRenderCommandName(
			"/login/login"
		).setParameter(
			"saveLastPath", false
		).setPortletMode(
			PortletMode.VIEW
		).setWindowState(
			LiferayWindowState.POP_UP
		).buildPortletURL();

		String editorURL = GetterUtil.getString(request.getAttribute("liferay-comment:discussion:editorURL"));

		editorURL = HttpComponentsUtil.addParameter(editorURL, "namespace", namespace);

		String paginationURL = HttpComponentsUtil.addParameter(discussionTaglibHelper.getPaginationURL(), "namespace", namespace);

		paginationURL = HttpComponentsUtil.addParameter(paginationURL, "skipEditorLoading", "true");
		
      out.write("\n");
      out.write("\n");
      out.write("\t\t");
      //  liferay-frontend:component
      com.liferay.frontend.taglib.servlet.taglib.ComponentTag _jspx_th_liferay$1frontend_component_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.ComponentTag.class) : new com.liferay.frontend.taglib.servlet.taglib.ComponentTag();
      _jspx_th_liferay$1frontend_component_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1frontend_component_0.setParent(null);
      _jspx_th_liferay$1frontend_component_0.setContext(
				HashMapBuilder.<String, Object>put(
					"constants",
					HashMapBuilder.<String, Object>put(
						"ACTION_SAVE_DRAFT", WorkflowConstants.ACTION_SAVE_DRAFT
					).put(
						"ADD", Constants.ADD
					).put(
						"DELETE", Constants.DELETE
					).put(
						"SUBSCRIBE_TO_COMMENTS", Constants.SUBSCRIBE_TO_COMMENTS
					).put(
						"UNSUBSCRIBE_FROM_COMMENTS", Constants.UNSUBSCRIBE_FROM_COMMENTS
					).put(
						"UPDATE", Constants.UPDATE
					).build()
				).put(
					"editorURL", editorURL
				).put(
					"formName", HtmlUtil.escapeJS(discussionTaglibHelper.getFormName())
				).put(
					"hideControls", discussionTaglibHelper.isHideControls()
				).put(
					"loginURL", loginURL.toString()
				).put(
					"messageId", ParamUtil.getString(request, "messageId")
				).put(
					"namespace", namespace
				).put(
					"paginationURL", paginationURL
				).put(
					"portletDisplayId", portletDisplay.getId()
				).put(
					"randomNamespace", randomNamespace
				).put(
					"ratingsEnabled", discussionTaglibHelper.isRatingsEnabled()
				).put(
					"subscriptionClassName", discussionTaglibHelper.getSubscriptionClassName()
				).put(
					"userId", discussionTaglibHelper.getUserId()
				).build()
			);
      _jspx_th_liferay$1frontend_component_0.setModule("discussion/js/Comments");
      int _jspx_eval_liferay$1frontend_component_0 = _jspx_th_liferay$1frontend_component_0.doStartTag();
      if (_jspx_th_liferay$1frontend_component_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_component_0);
        _jspx_th_liferay$1frontend_component_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_component_0);
      _jspx_th_liferay$1frontend_component_0.release();
      out.write('\n');
      out.write('	');
}
      out.write("\n");
      out.write("</section>");
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
    _jspx_th_liferay$1ui_message_0.setKey("maximum-number-of-comments-has-been-reached");
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

  private boolean _jspx_meth_aui_input_6(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:input
    com.liferay.taglib.aui.InputTag _jspx_th_aui_input_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
    _jspx_th_aui_input_6.setPageContext(_jspx_page_context);
    _jspx_th_aui_input_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
    _jspx_th_aui_input_6.setName("commentId");
    _jspx_th_aui_input_6.setType("hidden");
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

  private boolean _jspx_meth_aui_input_7(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:input
    com.liferay.taglib.aui.InputTag _jspx_th_aui_input_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
    _jspx_th_aui_input_7.setPageContext(_jspx_page_context);
    _jspx_th_aui_input_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
    _jspx_th_aui_input_7.setName("parentCommentId");
    _jspx_th_aui_input_7.setType("hidden");
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

  private boolean _jspx_meth_aui_input_8(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:input
    com.liferay.taglib.aui.InputTag _jspx_th_aui_input_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
    _jspx_th_aui_input_8.setPageContext(_jspx_page_context);
    _jspx_th_aui_input_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
    _jspx_th_aui_input_8.setName("body");
    _jspx_th_aui_input_8.setType("hidden");
    int _jspx_eval_aui_input_8 = _jspx_th_aui_input_8.doStartTag();
    if (_jspx_th_aui_input_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_8);
      _jspx_th_aui_input_8.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_8);
    _jspx_th_aui_input_8.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_content$1col_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_2.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_1);
    _jspx_th_liferay$1ui_message_2.setKey("unsubscribe-from-comments");
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

  private boolean _jspx_meth_liferay$1ui_message_3(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_content$1col_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_3.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_1);
    _jspx_th_liferay$1ui_message_3.setKey("unsubscribe");
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

  private boolean _jspx_meth_liferay$1ui_message_4(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_content$1col_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_4.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_1);
    _jspx_th_liferay$1ui_message_4.setKey("subscribe-to-comments");
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

  private boolean _jspx_meth_liferay$1ui_message_5(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_content$1col_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_5.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_1);
    _jspx_th_liferay$1ui_message_5.setKey("subscribe");
    int _jspx_eval_liferay$1ui_message_5 = _jspx_th_liferay$1ui_message_5.doStartTag();
    if (_jspx_th_liferay$1ui_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_5);
      _jspx_th_liferay$1ui_message_5.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_5);
    _jspx_th_liferay$1ui_message_5.release();
    return false;
  }

  private boolean _jspx_meth_aui_input_13(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:input
    com.liferay.taglib.aui.InputTag _jspx_th_aui_input_13 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
    _jspx_th_aui_input_13.setPageContext(_jspx_page_context);
    _jspx_th_aui_input_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
    _jspx_th_aui_input_13.setName("emailAddress");
    _jspx_th_aui_input_13.setType("hidden");
    int _jspx_eval_aui_input_13 = _jspx_th_aui_input_13.doStartTag();
    if (_jspx_th_aui_input_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_13);
      _jspx_th_aui_input_13.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_13);
    _jspx_th_aui_input_13.release();
    return false;
  }

  private boolean _jspx_meth_aui_input_14(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_content$1col_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:input
    com.liferay.taglib.aui.InputTag _jspx_th_aui_input_14 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
    _jspx_th_aui_input_14.setPageContext(_jspx_page_context);
    _jspx_th_aui_input_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_3);
    _jspx_th_aui_input_14.setName("postReplyBody0");
    _jspx_th_aui_input_14.setType("hidden");
    int _jspx_eval_aui_input_14 = _jspx_th_aui_input_14.doStartTag();
    if (_jspx_th_aui_input_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_14);
      _jspx_th_aui_input_14.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_14);
    _jspx_th_aui_input_14.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_6(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_6.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
    _jspx_th_liferay$1ui_message_6.setKey("comments-are-unavailable-in-staged-sites");
    int _jspx_eval_liferay$1ui_message_6 = _jspx_th_liferay$1ui_message_6.doStartTag();
    if (_jspx_th_liferay$1ui_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_6);
      _jspx_th_liferay$1ui_message_6.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_6);
    _jspx_th_liferay$1ui_message_6.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_7(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_7.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
    _jspx_th_liferay$1ui_message_7.setKey("more-comments");
    int _jspx_eval_liferay$1ui_message_7 = _jspx_th_liferay$1ui_message_7.doStartTag();
    if (_jspx_th_liferay$1ui_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_7);
      _jspx_th_liferay$1ui_message_7.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_7);
    _jspx_th_liferay$1ui_message_7.release();
    return false;
  }
}
