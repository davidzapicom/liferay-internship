package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.admin.kernel.util.PortalSearchApplicationType;
import com.liferay.asset.kernel.model.AssetTag;
import com.liferay.asset.kernel.service.AssetTagLocalServiceUtil;
import com.liferay.contacts.constants.ContactsConstants;
import com.liferay.contacts.constants.ContactsWebKeys;
import com.liferay.contacts.model.Entry;
import com.liferay.contacts.service.EntryLocalServiceUtil;
import com.liferay.contacts.util.ContactsExtensionsUtil;
import com.liferay.contacts.util.ContactsUtil;
import com.liferay.contacts.web.internal.constants.ContactsPortletKeys;
import com.liferay.petra.string.CharPool;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.language.UnicodeLanguageUtil;
import com.liferay.portal.kernel.model.Address;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.Contact;
import com.liferay.portal.kernel.model.EmailAddress;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.GroupConstants;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.model.ListType;
import com.liferay.portal.kernel.model.Phone;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.Website;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.portlet.PortletProvider;
import com.liferay.portal.kernel.portlet.PortletProviderUtil;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.portlet.url.builder.PortletURLBuilder;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.service.AddressServiceUtil;
import com.liferay.portal.kernel.service.EmailAddressServiceUtil;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.PhoneServiceUtil;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.service.WebsiteServiceUtil;
import com.liferay.portal.kernel.service.permission.UserPermissionUtil;
import com.liferay.portal.kernel.servlet.ServletContextPool;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.LinkedHashMapBuilder;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.PortletKeys;
import com.liferay.portal.kernel.util.PrefsParamUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.comparator.UserLastNameComparator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.product.navigation.personal.menu.util.PersonalApplicationURLUtil;
import com.liferay.social.kernel.model.SocialRelationConstants;
import com.liferay.social.kernel.model.SocialRequestConstants;
import com.liferay.social.kernel.service.SocialActivityLocalServiceUtil;
import com.liferay.social.kernel.service.SocialRelationLocalServiceUtil;
import com.liferay.social.kernel.service.SocialRequestLocalServiceUtil;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.WindowState;

public final class user_005ftoolbar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/init.jsp");
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

String currentURL = PortalUtil.getCurrentURL(request);

String portletResource = ParamUtil.getString(request, "portletResource");

int displayStyle = PrefsParamUtil.getInteger(portletPreferences, request, "displayStyle", ContactsConstants.DISPLAY_STYLE_FULL);

boolean showAdditionalEmailAddresses = PrefsParamUtil.getBoolean(portletPreferences, request, "showAdditionalEmailAddresses", true);
boolean showAddresses = PrefsParamUtil.getBoolean(portletPreferences, request, "showAddresses", true);
boolean showComments = PrefsParamUtil.getBoolean(portletPreferences, request, "showComments", true);
boolean showCompleteYourProfile = PrefsParamUtil.getBoolean(portletPreferences, request, "showCompleteYourProfile", false);
boolean showIcon = PrefsParamUtil.getBoolean(portletPreferences, request, "showIcon", true);
boolean showInstantMessenger = PrefsParamUtil.getBoolean(portletPreferences, request, "showInstantMessenger", true);
boolean showPhones = PrefsParamUtil.getBoolean(portletPreferences, request, "showPhones", true);
boolean showRecentActivity = PrefsParamUtil.getBoolean(portletPreferences, request, "showRecentActivity", false);

boolean showOnlySiteMembers = false;

String portletId = portletDisplay.getId();

if (portletId.equals(ContactsPortletKeys.MEMBERS)) {
	showOnlySiteMembers = true;
}

boolean showSites = PrefsParamUtil.getBoolean(portletPreferences, request, "showSites", false);
boolean showSMS = PrefsParamUtil.getBoolean(portletPreferences, request, "showSMS", true);
boolean showSocialNetwork = PrefsParamUtil.getBoolean(portletPreferences, request, "showSocialNetwork", true);
boolean showTags = PrefsParamUtil.getBoolean(portletPreferences, request, "showTags", false);
boolean showUsersInformation = PrefsParamUtil.getBoolean(portletPreferences, request, "showUsersInformation", true);
boolean showWebsites = PrefsParamUtil.getBoolean(portletPreferences, request, "showWebsites", true);

Group scopeGroup = themeDisplay.getScopeGroup();

Layout embeddedPersonalApplicationLayout = PersonalApplicationURLUtil.getOrAddEmbeddedPersonalApplicationLayout(themeDisplay.getDefaultUser(), scopeGroup, layout.isPrivateLayout());

      out.write('\n');
      out.write('\n');

User user2 = (User)request.getAttribute("view_user.jsp-user");

boolean viewRelationActions = true;

if (SocialRelationLocalServiceUtil.hasRelation(user2.getUserId(), themeDisplay.getUserId(), SocialRelationConstants.TYPE_UNI_ENEMY)) {
	viewRelationActions = false;
}
else if (SocialRelationLocalServiceUtil.hasRelation(themeDisplay.getUserId(), user2.getUserId(), SocialRelationConstants.TYPE_UNI_ENEMY)) {
	viewRelationActions = false;
}

      out.write('\n');
      out.write('\n');
if (
 viewRelationActions ) {
      out.write('\n');
      out.write('	');
      out.write("\n");
      out.write("\t\t");
if (
 SocialRelationLocalServiceUtil.hasRelation(themeDisplay.getUserId(), user2.getUserId(), SocialRelationConstants.TYPE_BI_CONNECTION) ) {
      out.write("\n");
      out.write("\t\t\t");
      //  portlet:actionURL
      com.liferay.taglib.portlet.ActionURLTag _jspx_th_portlet_actionURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ActionURLTag.class) : new com.liferay.taglib.portlet.ActionURLTag();
      _jspx_th_portlet_actionURL_0.setPageContext(_jspx_page_context);
      _jspx_th_portlet_actionURL_0.setParent(null);
      _jspx_th_portlet_actionURL_0.setName("deleteSocialRelation");
      _jspx_th_portlet_actionURL_0.setVar("removeConnectionURL");
      int _jspx_eval_portlet_actionURL_0 = _jspx_th_portlet_actionURL_0.doStartTag();
      if (_jspx_eval_portlet_actionURL_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t");
        //  portlet:param
        com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
        _jspx_th_portlet_param_0.setPageContext(_jspx_page_context);
        _jspx_th_portlet_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_0);
        _jspx_th_portlet_param_0.setName("redirect");
        _jspx_th_portlet_param_0.setValue( currentURL );
        int _jspx_eval_portlet_param_0 = _jspx_th_portlet_param_0.doStartTag();
        if (_jspx_th_portlet_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_0);
          _jspx_th_portlet_param_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_0);
        _jspx_th_portlet_param_0.release();
        out.write("\n");
        out.write("\t\t\t\t");
        //  portlet:param
        com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
        _jspx_th_portlet_param_1.setPageContext(_jspx_page_context);
        _jspx_th_portlet_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_0);
        _jspx_th_portlet_param_1.setName("userId");
        _jspx_th_portlet_param_1.setValue( String.valueOf(user2.getUserId()) );
        int _jspx_eval_portlet_param_1 = _jspx_th_portlet_param_1.doStartTag();
        if (_jspx_th_portlet_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_1);
          _jspx_th_portlet_param_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_1);
        _jspx_th_portlet_param_1.release();
        out.write("\n");
        out.write("\t\t\t\t");
        //  portlet:param
        com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
        _jspx_th_portlet_param_2.setPageContext(_jspx_page_context);
        _jspx_th_portlet_param_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_0);
        _jspx_th_portlet_param_2.setName("type");
        _jspx_th_portlet_param_2.setValue( String.valueOf(SocialRelationConstants.TYPE_BI_CONNECTION) );
        int _jspx_eval_portlet_param_2 = _jspx_th_portlet_param_2.doStartTag();
        if (_jspx_th_portlet_param_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_2);
          _jspx_th_portlet_param_2.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_2);
        _jspx_th_portlet_param_2.release();
        out.write("\n");
        out.write("\t\t\t");
      }
      if (_jspx_th_portlet_actionURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_0);
        _jspx_th_portlet_actionURL_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_0);
      _jspx_th_portlet_actionURL_0.release();
      java.lang.String removeConnectionURL = null;
      removeConnectionURL = (java.lang.String) _jspx_page_context.findAttribute("removeConnectionURL");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
      //  liferay-ui:icon
      com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
      _jspx_th_liferay$1ui_icon_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_icon_0.setParent(null);
      _jspx_th_liferay$1ui_icon_0.setCssClass("action remove-connection");
      _jspx_th_liferay$1ui_icon_0.setImage("../aui/minus-sign");
      _jspx_th_liferay$1ui_icon_0.setLabel( true );
      _jspx_th_liferay$1ui_icon_0.setMessage("disconnect");
      _jspx_th_liferay$1ui_icon_0.setMethod("get");
      _jspx_th_liferay$1ui_icon_0.setUrl( removeConnectionURL );
      int _jspx_eval_liferay$1ui_icon_0 = _jspx_th_liferay$1ui_icon_0.doStartTag();
      if (_jspx_th_liferay$1ui_icon_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_0);
        _jspx_th_liferay$1ui_icon_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_0);
      _jspx_th_liferay$1ui_icon_0.release();
      out.write("\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t");
}
else if (
 SocialRequestLocalServiceUtil.hasRequest(themeDisplay.getUserId(), User.class.getName(), themeDisplay.getUserId(), SocialRelationConstants.TYPE_BI_CONNECTION, user2.getUserId(), SocialRequestConstants.STATUS_PENDING) ) {
      out.write("\n");
      out.write("\t\t\t");
      //  liferay-ui:icon
      com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
      _jspx_th_liferay$1ui_icon_1.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_icon_1.setParent(null);
      _jspx_th_liferay$1ui_icon_1.setCssClass("disabled");
      _jspx_th_liferay$1ui_icon_1.setImage("../aui/user");
      _jspx_th_liferay$1ui_icon_1.setLabel( true );
      _jspx_th_liferay$1ui_icon_1.setMessage("connection-requested");
      int _jspx_eval_liferay$1ui_icon_1 = _jspx_th_liferay$1ui_icon_1.doStartTag();
      if (_jspx_th_liferay$1ui_icon_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_1);
        _jspx_th_liferay$1ui_icon_1.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_1);
      _jspx_th_liferay$1ui_icon_1.release();
      out.write("\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t");
}
else if (
 SocialRelationLocalServiceUtil.isRelatable(themeDisplay.getUserId(), user2.getUserId(), SocialRelationConstants.TYPE_BI_CONNECTION) ) {
      out.write("\n");
      out.write("\t\t\t");
      //  portlet:actionURL
      com.liferay.taglib.portlet.ActionURLTag _jspx_th_portlet_actionURL_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ActionURLTag.class) : new com.liferay.taglib.portlet.ActionURLTag();
      _jspx_th_portlet_actionURL_1.setPageContext(_jspx_page_context);
      _jspx_th_portlet_actionURL_1.setParent(null);
      _jspx_th_portlet_actionURL_1.setName("requestSocialRelation");
      _jspx_th_portlet_actionURL_1.setVar("addConnectionURL");
      int _jspx_eval_portlet_actionURL_1 = _jspx_th_portlet_actionURL_1.doStartTag();
      if (_jspx_eval_portlet_actionURL_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t");
        //  portlet:param
        com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
        _jspx_th_portlet_param_3.setPageContext(_jspx_page_context);
        _jspx_th_portlet_param_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_1);
        _jspx_th_portlet_param_3.setName("redirect");
        _jspx_th_portlet_param_3.setValue( currentURL );
        int _jspx_eval_portlet_param_3 = _jspx_th_portlet_param_3.doStartTag();
        if (_jspx_th_portlet_param_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_3);
          _jspx_th_portlet_param_3.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_3);
        _jspx_th_portlet_param_3.release();
        out.write("\n");
        out.write("\t\t\t\t");
        //  portlet:param
        com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
        _jspx_th_portlet_param_4.setPageContext(_jspx_page_context);
        _jspx_th_portlet_param_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_1);
        _jspx_th_portlet_param_4.setName("userId");
        _jspx_th_portlet_param_4.setValue( String.valueOf(user2.getUserId()) );
        int _jspx_eval_portlet_param_4 = _jspx_th_portlet_param_4.doStartTag();
        if (_jspx_th_portlet_param_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_4);
          _jspx_th_portlet_param_4.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_4);
        _jspx_th_portlet_param_4.release();
        out.write("\n");
        out.write("\t\t\t\t");
        //  portlet:param
        com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
        _jspx_th_portlet_param_5.setPageContext(_jspx_page_context);
        _jspx_th_portlet_param_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_1);
        _jspx_th_portlet_param_5.setName("type");
        _jspx_th_portlet_param_5.setValue( String.valueOf(SocialRelationConstants.TYPE_BI_CONNECTION) );
        int _jspx_eval_portlet_param_5 = _jspx_th_portlet_param_5.doStartTag();
        if (_jspx_th_portlet_param_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_5);
          _jspx_th_portlet_param_5.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_5);
        _jspx_th_portlet_param_5.release();
        out.write("\n");
        out.write("\t\t\t");
      }
      if (_jspx_th_portlet_actionURL_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_1);
        _jspx_th_portlet_actionURL_1.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_1);
      _jspx_th_portlet_actionURL_1.release();
      java.lang.String addConnectionURL = null;
      addConnectionURL = (java.lang.String) _jspx_page_context.findAttribute("addConnectionURL");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
      //  liferay-ui:icon
      com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
      _jspx_th_liferay$1ui_icon_2.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_icon_2.setParent(null);
      _jspx_th_liferay$1ui_icon_2.setCssClass("action add-connection");
      _jspx_th_liferay$1ui_icon_2.setImage("../aui/plus-sign");
      _jspx_th_liferay$1ui_icon_2.setLabel( true );
      _jspx_th_liferay$1ui_icon_2.setMessage("connect");
      _jspx_th_liferay$1ui_icon_2.setMethod("get");
      _jspx_th_liferay$1ui_icon_2.setUrl( addConnectionURL );
      int _jspx_eval_liferay$1ui_icon_2 = _jspx_th_liferay$1ui_icon_2.doStartTag();
      if (_jspx_th_liferay$1ui_icon_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_2);
        _jspx_th_liferay$1ui_icon_2.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_2);
      _jspx_th_liferay$1ui_icon_2.release();
      out.write("\n");
      out.write("\t\t");
      out.write('\n');
      out.write('	');
}
      out.write("\n");
      out.write("\n");
      out.write("\t");
      out.write("\n");
      out.write("\t\t");
if (
 SocialRelationLocalServiceUtil.hasRelation(themeDisplay.getUserId(), user2.getUserId(), SocialRelationConstants.TYPE_UNI_FOLLOWER) ) {
      out.write("\n");
      out.write("\t\t\t");
      //  portlet:actionURL
      com.liferay.taglib.portlet.ActionURLTag _jspx_th_portlet_actionURL_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ActionURLTag.class) : new com.liferay.taglib.portlet.ActionURLTag();
      _jspx_th_portlet_actionURL_2.setPageContext(_jspx_page_context);
      _jspx_th_portlet_actionURL_2.setParent(null);
      _jspx_th_portlet_actionURL_2.setName("deleteSocialRelation");
      _jspx_th_portlet_actionURL_2.setVar("unfollowURL");
      int _jspx_eval_portlet_actionURL_2 = _jspx_th_portlet_actionURL_2.doStartTag();
      if (_jspx_eval_portlet_actionURL_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t");
        //  portlet:param
        com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
        _jspx_th_portlet_param_6.setPageContext(_jspx_page_context);
        _jspx_th_portlet_param_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_2);
        _jspx_th_portlet_param_6.setName("redirect");
        _jspx_th_portlet_param_6.setValue( currentURL );
        int _jspx_eval_portlet_param_6 = _jspx_th_portlet_param_6.doStartTag();
        if (_jspx_th_portlet_param_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_6);
          _jspx_th_portlet_param_6.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_6);
        _jspx_th_portlet_param_6.release();
        out.write("\n");
        out.write("\t\t\t\t");
        //  portlet:param
        com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
        _jspx_th_portlet_param_7.setPageContext(_jspx_page_context);
        _jspx_th_portlet_param_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_2);
        _jspx_th_portlet_param_7.setName("userId");
        _jspx_th_portlet_param_7.setValue( String.valueOf(user2.getUserId()) );
        int _jspx_eval_portlet_param_7 = _jspx_th_portlet_param_7.doStartTag();
        if (_jspx_th_portlet_param_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_7);
          _jspx_th_portlet_param_7.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_7);
        _jspx_th_portlet_param_7.release();
        out.write("\n");
        out.write("\t\t\t\t");
        //  portlet:param
        com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
        _jspx_th_portlet_param_8.setPageContext(_jspx_page_context);
        _jspx_th_portlet_param_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_2);
        _jspx_th_portlet_param_8.setName("type");
        _jspx_th_portlet_param_8.setValue( String.valueOf(SocialRelationConstants.TYPE_UNI_FOLLOWER) );
        int _jspx_eval_portlet_param_8 = _jspx_th_portlet_param_8.doStartTag();
        if (_jspx_th_portlet_param_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_8);
          _jspx_th_portlet_param_8.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_8);
        _jspx_th_portlet_param_8.release();
        out.write("\n");
        out.write("\t\t\t");
      }
      if (_jspx_th_portlet_actionURL_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_2);
        _jspx_th_portlet_actionURL_2.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_2);
      _jspx_th_portlet_actionURL_2.release();
      java.lang.String unfollowURL = null;
      unfollowURL = (java.lang.String) _jspx_page_context.findAttribute("unfollowURL");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
      //  liferay-ui:icon
      com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
      _jspx_th_liferay$1ui_icon_3.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_icon_3.setParent(null);
      _jspx_th_liferay$1ui_icon_3.setCssClass("action unfollow");
      _jspx_th_liferay$1ui_icon_3.setImage("../aui/minus-sign");
      _jspx_th_liferay$1ui_icon_3.setLabel( true );
      _jspx_th_liferay$1ui_icon_3.setMessage("unfollow");
      _jspx_th_liferay$1ui_icon_3.setMethod("get");
      _jspx_th_liferay$1ui_icon_3.setUrl( unfollowURL );
      int _jspx_eval_liferay$1ui_icon_3 = _jspx_th_liferay$1ui_icon_3.doStartTag();
      if (_jspx_th_liferay$1ui_icon_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_3);
        _jspx_th_liferay$1ui_icon_3.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_3);
      _jspx_th_liferay$1ui_icon_3.release();
      out.write("\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t");
}
else if (
 SocialRelationLocalServiceUtil.isRelatable(themeDisplay.getUserId(), user2.getUserId(), SocialRelationConstants.TYPE_UNI_FOLLOWER) ) {
      out.write("\n");
      out.write("\t\t\t");
      //  portlet:actionURL
      com.liferay.taglib.portlet.ActionURLTag _jspx_th_portlet_actionURL_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ActionURLTag.class) : new com.liferay.taglib.portlet.ActionURLTag();
      _jspx_th_portlet_actionURL_3.setPageContext(_jspx_page_context);
      _jspx_th_portlet_actionURL_3.setParent(null);
      _jspx_th_portlet_actionURL_3.setName("addSocialRelation");
      _jspx_th_portlet_actionURL_3.setVar("followURL");
      int _jspx_eval_portlet_actionURL_3 = _jspx_th_portlet_actionURL_3.doStartTag();
      if (_jspx_eval_portlet_actionURL_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t");
        //  portlet:param
        com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
        _jspx_th_portlet_param_9.setPageContext(_jspx_page_context);
        _jspx_th_portlet_param_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_3);
        _jspx_th_portlet_param_9.setName("redirect");
        _jspx_th_portlet_param_9.setValue( currentURL );
        int _jspx_eval_portlet_param_9 = _jspx_th_portlet_param_9.doStartTag();
        if (_jspx_th_portlet_param_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_9);
          _jspx_th_portlet_param_9.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_9);
        _jspx_th_portlet_param_9.release();
        out.write("\n");
        out.write("\t\t\t\t");
        //  portlet:param
        com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
        _jspx_th_portlet_param_10.setPageContext(_jspx_page_context);
        _jspx_th_portlet_param_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_3);
        _jspx_th_portlet_param_10.setName("userId");
        _jspx_th_portlet_param_10.setValue( String.valueOf(user2.getUserId()) );
        int _jspx_eval_portlet_param_10 = _jspx_th_portlet_param_10.doStartTag();
        if (_jspx_th_portlet_param_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_10);
          _jspx_th_portlet_param_10.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_10);
        _jspx_th_portlet_param_10.release();
        out.write("\n");
        out.write("\t\t\t\t");
        //  portlet:param
        com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
        _jspx_th_portlet_param_11.setPageContext(_jspx_page_context);
        _jspx_th_portlet_param_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_3);
        _jspx_th_portlet_param_11.setName("type");
        _jspx_th_portlet_param_11.setValue( String.valueOf(SocialRelationConstants.TYPE_UNI_FOLLOWER) );
        int _jspx_eval_portlet_param_11 = _jspx_th_portlet_param_11.doStartTag();
        if (_jspx_th_portlet_param_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_11);
          _jspx_th_portlet_param_11.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_11);
        _jspx_th_portlet_param_11.release();
        out.write("\n");
        out.write("\t\t\t");
      }
      if (_jspx_th_portlet_actionURL_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_3);
        _jspx_th_portlet_actionURL_3.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_3);
      _jspx_th_portlet_actionURL_3.release();
      java.lang.String followURL = null;
      followURL = (java.lang.String) _jspx_page_context.findAttribute("followURL");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
      //  liferay-ui:icon
      com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
      _jspx_th_liferay$1ui_icon_4.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_icon_4.setParent(null);
      _jspx_th_liferay$1ui_icon_4.setCssClass("action follow");
      _jspx_th_liferay$1ui_icon_4.setImage("../aui/plus-sign");
      _jspx_th_liferay$1ui_icon_4.setLabel( true );
      _jspx_th_liferay$1ui_icon_4.setMessage("follow");
      _jspx_th_liferay$1ui_icon_4.setMethod("get");
      _jspx_th_liferay$1ui_icon_4.setUrl( followURL );
      int _jspx_eval_liferay$1ui_icon_4 = _jspx_th_liferay$1ui_icon_4.doStartTag();
      if (_jspx_th_liferay$1ui_icon_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_4);
        _jspx_th_liferay$1ui_icon_4.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_4);
      _jspx_th_liferay$1ui_icon_4.release();
      out.write("\n");
      out.write("\t\t");
      out.write('\n');
      out.write('	');
}
      out.write('\n');
}
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('	');
if (
 SocialRelationLocalServiceUtil.hasRelation(themeDisplay.getUserId(), user2.getUserId(), SocialRelationConstants.TYPE_UNI_ENEMY) ) {
      out.write("\n");
      out.write("\t\t");
      //  portlet:actionURL
      com.liferay.taglib.portlet.ActionURLTag _jspx_th_portlet_actionURL_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ActionURLTag.class) : new com.liferay.taglib.portlet.ActionURLTag();
      _jspx_th_portlet_actionURL_4.setPageContext(_jspx_page_context);
      _jspx_th_portlet_actionURL_4.setParent(null);
      _jspx_th_portlet_actionURL_4.setName("deleteSocialRelation");
      _jspx_th_portlet_actionURL_4.setVar("unblockURL");
      int _jspx_eval_portlet_actionURL_4 = _jspx_th_portlet_actionURL_4.doStartTag();
      if (_jspx_eval_portlet_actionURL_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t");
        //  portlet:param
        com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_12 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
        _jspx_th_portlet_param_12.setPageContext(_jspx_page_context);
        _jspx_th_portlet_param_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_4);
        _jspx_th_portlet_param_12.setName("redirect");
        _jspx_th_portlet_param_12.setValue( currentURL );
        int _jspx_eval_portlet_param_12 = _jspx_th_portlet_param_12.doStartTag();
        if (_jspx_th_portlet_param_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_12);
          _jspx_th_portlet_param_12.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_12);
        _jspx_th_portlet_param_12.release();
        out.write("\n");
        out.write("\t\t\t");
        //  portlet:param
        com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_13 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
        _jspx_th_portlet_param_13.setPageContext(_jspx_page_context);
        _jspx_th_portlet_param_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_4);
        _jspx_th_portlet_param_13.setName("userId");
        _jspx_th_portlet_param_13.setValue( String.valueOf(user2.getUserId()) );
        int _jspx_eval_portlet_param_13 = _jspx_th_portlet_param_13.doStartTag();
        if (_jspx_th_portlet_param_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_13);
          _jspx_th_portlet_param_13.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_13);
        _jspx_th_portlet_param_13.release();
        out.write("\n");
        out.write("\t\t\t");
        //  portlet:param
        com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_14 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
        _jspx_th_portlet_param_14.setPageContext(_jspx_page_context);
        _jspx_th_portlet_param_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_4);
        _jspx_th_portlet_param_14.setName("type");
        _jspx_th_portlet_param_14.setValue( String.valueOf(SocialRelationConstants.TYPE_UNI_ENEMY) );
        int _jspx_eval_portlet_param_14 = _jspx_th_portlet_param_14.doStartTag();
        if (_jspx_th_portlet_param_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_14);
          _jspx_th_portlet_param_14.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_14);
        _jspx_th_portlet_param_14.release();
        out.write("\n");
        out.write("\t\t");
      }
      if (_jspx_th_portlet_actionURL_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_4);
        _jspx_th_portlet_actionURL_4.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_4);
      _jspx_th_portlet_actionURL_4.release();
      java.lang.String unblockURL = null;
      unblockURL = (java.lang.String) _jspx_page_context.findAttribute("unblockURL");
      out.write("\n");
      out.write("\n");
      out.write("\t\t");
      //  liferay-ui:icon
      com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
      _jspx_th_liferay$1ui_icon_5.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_icon_5.setParent(null);
      _jspx_th_liferay$1ui_icon_5.setCssClass("action unblock");
      _jspx_th_liferay$1ui_icon_5.setImage("../aui/ok");
      _jspx_th_liferay$1ui_icon_5.setLabel( true );
      _jspx_th_liferay$1ui_icon_5.setMessage("unblock");
      _jspx_th_liferay$1ui_icon_5.setMethod("get");
      _jspx_th_liferay$1ui_icon_5.setUrl( unblockURL );
      int _jspx_eval_liferay$1ui_icon_5 = _jspx_th_liferay$1ui_icon_5.doStartTag();
      if (_jspx_th_liferay$1ui_icon_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_5);
        _jspx_th_liferay$1ui_icon_5.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_5);
      _jspx_th_liferay$1ui_icon_5.release();
      out.write('\n');
      out.write('	');
      out.write('\n');
      out.write('	');
}
else if (
 SocialRelationLocalServiceUtil.isRelatable(themeDisplay.getUserId(), user2.getUserId(), SocialRelationConstants.TYPE_UNI_ENEMY) ) {
      out.write("\n");
      out.write("\t\t");
      //  portlet:actionURL
      com.liferay.taglib.portlet.ActionURLTag _jspx_th_portlet_actionURL_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ActionURLTag.class) : new com.liferay.taglib.portlet.ActionURLTag();
      _jspx_th_portlet_actionURL_5.setPageContext(_jspx_page_context);
      _jspx_th_portlet_actionURL_5.setParent(null);
      _jspx_th_portlet_actionURL_5.setName("addSocialRelation");
      _jspx_th_portlet_actionURL_5.setVar("blockURL");
      int _jspx_eval_portlet_actionURL_5 = _jspx_th_portlet_actionURL_5.doStartTag();
      if (_jspx_eval_portlet_actionURL_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t");
        //  portlet:param
        com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_15 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
        _jspx_th_portlet_param_15.setPageContext(_jspx_page_context);
        _jspx_th_portlet_param_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_5);
        _jspx_th_portlet_param_15.setName("redirect");
        _jspx_th_portlet_param_15.setValue( currentURL );
        int _jspx_eval_portlet_param_15 = _jspx_th_portlet_param_15.doStartTag();
        if (_jspx_th_portlet_param_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_15);
          _jspx_th_portlet_param_15.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_15);
        _jspx_th_portlet_param_15.release();
        out.write("\n");
        out.write("\t\t\t");
        //  portlet:param
        com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_16 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
        _jspx_th_portlet_param_16.setPageContext(_jspx_page_context);
        _jspx_th_portlet_param_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_5);
        _jspx_th_portlet_param_16.setName("userId");
        _jspx_th_portlet_param_16.setValue( String.valueOf(user2.getUserId()) );
        int _jspx_eval_portlet_param_16 = _jspx_th_portlet_param_16.doStartTag();
        if (_jspx_th_portlet_param_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_16);
          _jspx_th_portlet_param_16.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_16);
        _jspx_th_portlet_param_16.release();
        out.write("\n");
        out.write("\t\t\t");
        //  portlet:param
        com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_17 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
        _jspx_th_portlet_param_17.setPageContext(_jspx_page_context);
        _jspx_th_portlet_param_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_5);
        _jspx_th_portlet_param_17.setName("type");
        _jspx_th_portlet_param_17.setValue( String.valueOf(SocialRelationConstants.TYPE_UNI_ENEMY) );
        int _jspx_eval_portlet_param_17 = _jspx_th_portlet_param_17.doStartTag();
        if (_jspx_th_portlet_param_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_17);
          _jspx_th_portlet_param_17.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_17);
        _jspx_th_portlet_param_17.release();
        out.write("\n");
        out.write("\t\t");
      }
      if (_jspx_th_portlet_actionURL_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_5);
        _jspx_th_portlet_actionURL_5.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_5);
      _jspx_th_portlet_actionURL_5.release();
      java.lang.String blockURL = null;
      blockURL = (java.lang.String) _jspx_page_context.findAttribute("blockURL");
      out.write("\n");
      out.write("\n");
      out.write("\t\t");
      //  liferay-ui:icon
      com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
      _jspx_th_liferay$1ui_icon_6.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_icon_6.setParent(null);
      _jspx_th_liferay$1ui_icon_6.setCssClass("action block");
      _jspx_th_liferay$1ui_icon_6.setImage("../aui/ban-circle");
      _jspx_th_liferay$1ui_icon_6.setLabel( true );
      _jspx_th_liferay$1ui_icon_6.setMessage("block");
      _jspx_th_liferay$1ui_icon_6.setMethod("get");
      _jspx_th_liferay$1ui_icon_6.setUrl( blockURL );
      int _jspx_eval_liferay$1ui_icon_6 = _jspx_th_liferay$1ui_icon_6.doStartTag();
      if (_jspx_th_liferay$1ui_icon_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_6);
        _jspx_th_liferay$1ui_icon_6.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_6);
      _jspx_th_liferay$1ui_icon_6.release();
      out.write('\n');
      out.write('	');
      out.write('\n');
}
      out.write('\n');
      out.write('\n');
      //  portlet:resourceURL
      com.liferay.taglib.portlet.ResourceURLTag _jspx_th_portlet_resourceURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ResourceURLTag.class) : new com.liferay.taglib.portlet.ResourceURLTag();
      _jspx_th_portlet_resourceURL_0.setPageContext(_jspx_page_context);
      _jspx_th_portlet_resourceURL_0.setParent(null);
      _jspx_th_portlet_resourceURL_0.setId("exportVCard");
      _jspx_th_portlet_resourceURL_0.setVar("exportURL");
      int _jspx_eval_portlet_resourceURL_0 = _jspx_th_portlet_resourceURL_0.doStartTag();
      if (_jspx_eval_portlet_resourceURL_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write('\n');
        out.write('	');
        //  portlet:param
        com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_18 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
        _jspx_th_portlet_param_18.setPageContext(_jspx_page_context);
        _jspx_th_portlet_param_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_resourceURL_0);
        _jspx_th_portlet_param_18.setName("userId");
        _jspx_th_portlet_param_18.setValue( String.valueOf(user2.getUserId()) );
        int _jspx_eval_portlet_param_18 = _jspx_th_portlet_param_18.doStartTag();
        if (_jspx_th_portlet_param_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_18);
          _jspx_th_portlet_param_18.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_18);
        _jspx_th_portlet_param_18.release();
        out.write('\n');
      }
      if (_jspx_th_portlet_resourceURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_resourceURL_0);
        _jspx_th_portlet_resourceURL_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_resourceURL_0);
      _jspx_th_portlet_resourceURL_0.release();
      java.lang.String exportURL = null;
      exportURL = (java.lang.String) _jspx_page_context.findAttribute("exportURL");
      out.write('\n');
      out.write('\n');
      //  liferay-ui:icon
      com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
      _jspx_th_liferay$1ui_icon_7.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_icon_7.setParent(null);
      _jspx_th_liferay$1ui_icon_7.setImage("../aui/save");
      _jspx_th_liferay$1ui_icon_7.setLabel( true );
      _jspx_th_liferay$1ui_icon_7.setMessage("vcard");
      _jspx_th_liferay$1ui_icon_7.setUrl( exportURL );
      int _jspx_eval_liferay$1ui_icon_7 = _jspx_th_liferay$1ui_icon_7.doStartTag();
      if (_jspx_th_liferay$1ui_icon_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_7);
        _jspx_th_liferay$1ui_icon_7.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_7);
      _jspx_th_liferay$1ui_icon_7.release();
      out.write('\n');
      out.write('\n');
      //  aui:script
      com.liferay.taglib.aui.ScriptTag _jspx_th_aui_script_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ScriptTag.class) : new com.liferay.taglib.aui.ScriptTag();
      _jspx_th_aui_script_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_script_0.setParent(null);
      _jspx_th_aui_script_0.setUse("aui-base,aui-io-plugin-deprecated");
      int _jspx_eval_aui_script_0 = _jspx_th_aui_script_0.doStartTag();
      if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_aui_script_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_aui_script_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\tvar contactAction = A.one('.contacts-portlet .contacts-action');\n");
          out.write("\n");
          out.write("\tif (contactAction) {\n");
          out.write("\t\tcontactAction.delegate(\n");
          out.write("\t\t\t'click',\n");
          out.write("\t\t\t(event) => {\n");
          out.write("\t\t\t\tevent.preventDefault();\n");
          out.write("\n");
          out.write("\t\t\t\tLiferay.Util.fetch(event.currentTarget.getAttribute('href'))\n");
          out.write("\t\t\t\t\t.then((response) => {\n");
          out.write("\t\t\t\t\t\treturn response.text();\n");
          out.write("\t\t\t\t\t})\n");
          out.write("\t\t\t\t\t.then((data) => {\n");
          out.write("\t\t\t\t\t\tvar contactProfile = A.one(\n");
          out.write("\t\t\t\t\t\t\t'.contacts-portlet .contacts-container'\n");
          out.write("\t\t\t\t\t\t);\n");
          out.write("\n");
          out.write("\t\t\t\t\t\tif (!contactProfile.io) {\n");
          out.write("\t\t\t\t\t\t\tcontactProfile.plug(A.Plugin.IO, {\n");
          out.write("\t\t\t\t\t\t\t\tautoLoad: false,\n");
          out.write("\t\t\t\t\t\t\t});\n");
          out.write("\t\t\t\t\t\t}\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t");
          //  liferay-portlet:renderURL
          com.liferay.taglib.portlet.RenderURLTag _jspx_th_liferay$1portlet_renderURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.RenderURLTag.class) : new com.liferay.taglib.portlet.RenderURLTag();
          _jspx_th_liferay$1portlet_renderURL_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1portlet_renderURL_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
          _jspx_th_liferay$1portlet_renderURL_0.setVar("viewSummaryURL");
          _jspx_th_liferay$1portlet_renderURL_0.setWindowState( LiferayWindowState.EXCLUSIVE.toString() );
          int _jspx_eval_liferay$1portlet_renderURL_0 = _jspx_th_liferay$1portlet_renderURL_0.doStartTag();
          if (_jspx_eval_liferay$1portlet_renderURL_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t");
            if (_jspx_meth_portlet_param_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1portlet_renderURL_0, _jspx_page_context))
              return;
            out.write("\n");
            out.write("\t\t\t\t\t\t\t");
            //  portlet:param
            com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_20 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
            _jspx_th_portlet_param_20.setPageContext(_jspx_page_context);
            _jspx_th_portlet_param_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1portlet_renderURL_0);
            _jspx_th_portlet_param_20.setName("userId");
            _jspx_th_portlet_param_20.setValue( String.valueOf(user2.getUserId()) );
            int _jspx_eval_portlet_param_20 = _jspx_th_portlet_param_20.doStartTag();
            if (_jspx_th_portlet_param_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_20);
              _jspx_th_portlet_param_20.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_20);
            _jspx_th_portlet_param_20.release();
            out.write("\n");
            out.write("\t\t\t\t\t\t");
          }
          if (_jspx_th_liferay$1portlet_renderURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_renderURL_0);
            _jspx_th_liferay$1portlet_renderURL_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_renderURL_0);
          _jspx_th_liferay$1portlet_renderURL_0.release();
          java.lang.String viewSummaryURL = null;
          viewSummaryURL = (java.lang.String) _jspx_page_context.findAttribute("viewSummaryURL");
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\tcontactProfile.io.set('uri', '");
          out.print( viewSummaryURL );
          out.write("');\n");
          out.write("\t\t\t\t\t\tcontactProfile.io.start();\n");
          out.write("\t\t\t\t\t});\n");
          out.write("\t\t\t},\n");
          out.write("\t\t\t'.action a'\n");
          out.write("\t\t);\n");
          out.write("\t}\n");
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

  private boolean _jspx_meth_portlet_param_19(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1portlet_renderURL_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:param
    com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_19 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
    _jspx_th_portlet_param_19.setPageContext(_jspx_page_context);
    _jspx_th_portlet_param_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1portlet_renderURL_0);
    _jspx_th_portlet_param_19.setName("mvcPath");
    _jspx_th_portlet_param_19.setValue("/view_user.jsp");
    int _jspx_eval_portlet_param_19 = _jspx_th_portlet_param_19.doStartTag();
    if (_jspx_th_portlet_param_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_19);
      _jspx_th_portlet_param_19.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_19);
    _jspx_th_portlet_param_19.release();
    return false;
  }
}
