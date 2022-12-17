package org.apache.jsp;

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

public final class view_005fuser_jsp extends org.apache.jasper.runtime.HttpJspBase
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

long userId = ParamUtil.getLong(request, "userId");

User user2 = null;

if (userId > 0) {
	user2 = UserLocalServiceUtil.getUser(userId);
}
else {
	user2 = (User)request.getAttribute(ContactsWebKeys.CONTACTS_USER);
}

user2 = user2.toEscapedModel();

request.setAttribute("view_user.jsp-user", user2);

      out.write('\n');
      out.write('\n');
if (
 user2 != null ) {
      out.write("\n");
      out.write("\t<div class=\"contacts-profile ");
      out.print( (user.getUserId() == user2.getUserId()) ? "my-profile" : StringPool.BLANK );
      out.write("\" id=\"");
      if (_jspx_meth_portlet_namespace_0(_jspx_page_context))
        return;
      out.write("contactsProfile\">\n");
      out.write("\t\t");
if (
 (displayStyle == ContactsConstants.DISPLAY_STYLE_BASIC) || (displayStyle == ContactsConstants.DISPLAY_STYLE_FULL) ) {
      out.write("\n");
      out.write("\t\t\t");
      //  clay:row
      com.liferay.frontend.taglib.clay.servlet.taglib.RowTag _jspx_th_clay_row_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.RowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.RowTag();
      _jspx_th_clay_row_0.setPageContext(_jspx_page_context);
      _jspx_th_clay_row_0.setParent(null);
      int _jspx_eval_clay_row_0 = _jspx_th_clay_row_0.doStartTag();
      if (_jspx_eval_clay_row_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t");
        //  clay:col
        com.liferay.frontend.taglib.clay.servlet.taglib.ColTag _jspx_th_clay_col_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ColTag();
        _jspx_th_clay_col_0.setPageContext(_jspx_page_context);
        _jspx_th_clay_col_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_row_0);
        _jspx_th_clay_col_0.setCssClass("social-relations");
        int _jspx_eval_clay_col_0 = _jspx_th_clay_col_0.doStartTag();
        if (_jspx_eval_clay_col_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t");

					boolean connection = SocialRelationLocalServiceUtil.hasRelation(themeDisplay.getUserId(), user2.getUserId(), SocialRelationConstants.TYPE_BI_CONNECTION);
					boolean follower = SocialRelationLocalServiceUtil.hasRelation(user2.getUserId(), themeDisplay.getUserId(), SocialRelationConstants.TYPE_UNI_FOLLOWER);
					boolean following = SocialRelationLocalServiceUtil.hasRelation(themeDisplay.getUserId(), user2.getUserId(), SocialRelationConstants.TYPE_UNI_FOLLOWER);
					
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t");
if (
 connection || follower || following ) {
          out.write("\n");
          out.write("\t\t\t\t\t\t<div class=\"lfr-asset-metadata\">\n");
          out.write("\t\t\t\t\t\t\t");
if (
 connection ) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t<span class=\"lfr-asset-icon lfr-asset-connection");
          out.print( (following || follower) ? StringPool.BLANK : " last" );
          out.write("\">\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_icon_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_col_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_col_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</span>\n");
          out.write("\t\t\t\t\t\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
if (
 following ) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t<span class=\"lfr-asset-icon lfr-asset-following");
          out.print( follower ? StringPool.BLANK : " last" );
          out.write("\">\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_icon_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_col_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_col_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</span>\n");
          out.write("\t\t\t\t\t\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
if (
 follower ) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t<span class=\"last lfr-asset-follower lfr-asset-icon\">\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_icon_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_col_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_col_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</span>\n");
          out.write("\t\t\t\t\t\t\t");
}
          out.write("\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t");
          //  clay:row
          com.liferay.frontend.taglib.clay.servlet.taglib.RowTag _jspx_th_clay_row_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.RowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.RowTag();
          _jspx_th_clay_row_1.setPageContext(_jspx_page_context);
          _jspx_th_clay_row_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
          int _jspx_eval_clay_row_1 = _jspx_th_clay_row_1.doStartTag();
          if (_jspx_eval_clay_row_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t\t\t\t");
            //  clay:col
            com.liferay.frontend.taglib.clay.servlet.taglib.ColTag _jspx_th_clay_col_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ColTag();
            _jspx_th_clay_col_1.setPageContext(_jspx_page_context);
            _jspx_th_clay_col_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_row_1);
            _jspx_th_clay_col_1.setCssClass("contacts-action");
            int _jspx_eval_clay_col_1 = _jspx_th_clay_col_1.doStartTag();
            if (_jspx_eval_clay_col_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t");
if (
 portletId.equals(ContactsPortletKeys.CONTACTS_CENTER) || portletId.equals(ContactsPortletKeys.MEMBERS) ) {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t");

									boolean blocked = false;

									if (SocialRelationLocalServiceUtil.hasRelation(user2.getUserId(), themeDisplay.getUserId(), SocialRelationConstants.TYPE_UNI_ENEMY)) {
										blocked = true;
									}
									else if (SocialRelationLocalServiceUtil.hasRelation(themeDisplay.getUserId(), user2.getUserId(), SocialRelationConstants.TYPE_UNI_ENEMY)) {
										blocked = true;
									}

									boolean showConnectedRequestedIcon = !blocked && SocialRequestLocalServiceUtil.hasRequest(themeDisplay.getUserId(), User.class.getName(), themeDisplay.getUserId(), SocialRelationConstants.TYPE_BI_CONNECTION, user2.getUserId(), SocialRequestConstants.STATUS_PENDING);
									boolean showConnectedIcon = !blocked && SocialRelationLocalServiceUtil.hasRelation(themeDisplay.getUserId(), user2.getUserId(), SocialRelationConstants.TYPE_BI_CONNECTION);
									boolean showFollowingIcon = !blocked && SocialRelationLocalServiceUtil.hasRelation(themeDisplay.getUserId(), user2.getUserId(), SocialRelationConstants.TYPE_UNI_FOLLOWER);
									boolean showBlockIcon = SocialRelationLocalServiceUtil.hasRelation(themeDisplay.getUserId(), user2.getUserId(), SocialRelationConstants.TYPE_UNI_ENEMY);
									
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t");
              //  liferay-ui:icon
              com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
              _jspx_th_liferay$1ui_icon_3.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_icon_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_1);
              _jspx_th_liferay$1ui_icon_3.setCssClass( showConnectedRequestedIcon ? "action disabled" : "action disabled hide" );
              _jspx_th_liferay$1ui_icon_3.setImage("../aui/user");
              _jspx_th_liferay$1ui_icon_3.setLabel( true );
              _jspx_th_liferay$1ui_icon_3.setMessage("connection-requested");
              int _jspx_eval_liferay$1ui_icon_3 = _jspx_th_liferay$1ui_icon_3.doStartTag();
              if (_jspx_th_liferay$1ui_icon_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_3);
                _jspx_th_liferay$1ui_icon_3.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_3);
              _jspx_th_liferay$1ui_icon_3.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t");
              //  liferay-ui:icon
              com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
              _jspx_th_liferay$1ui_icon_4.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_icon_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_1);
              _jspx_th_liferay$1ui_icon_4.setCssClass( showConnectedIcon ? "action connected" : "action connected hide" );
              _jspx_th_liferay$1ui_icon_4.setImage("../aui/user");
              _jspx_th_liferay$1ui_icon_4.setLabel( true );
              _jspx_th_liferay$1ui_icon_4.setMessage("connected");
              int _jspx_eval_liferay$1ui_icon_4 = _jspx_th_liferay$1ui_icon_4.doStartTag();
              if (_jspx_th_liferay$1ui_icon_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_4);
                _jspx_th_liferay$1ui_icon_4.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_4);
              _jspx_th_liferay$1ui_icon_4.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t");
              //  liferay-ui:icon
              com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
              _jspx_th_liferay$1ui_icon_5.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_icon_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_1);
              _jspx_th_liferay$1ui_icon_5.setCssClass( showFollowingIcon ? "action following" : "action following hide" );
              _jspx_th_liferay$1ui_icon_5.setImage("../aui/user");
              _jspx_th_liferay$1ui_icon_5.setLabel( true );
              _jspx_th_liferay$1ui_icon_5.setMessage("following");
              int _jspx_eval_liferay$1ui_icon_5 = _jspx_th_liferay$1ui_icon_5.doStartTag();
              if (_jspx_th_liferay$1ui_icon_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_5);
                _jspx_th_liferay$1ui_icon_5.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_5);
              _jspx_th_liferay$1ui_icon_5.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t");
              //  liferay-ui:icon
              com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
              _jspx_th_liferay$1ui_icon_6.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_icon_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_1);
              _jspx_th_liferay$1ui_icon_6.setCssClass( showBlockIcon ? "action block" : "action block hide" );
              _jspx_th_liferay$1ui_icon_6.setImage("../aui/ban-circle");
              _jspx_th_liferay$1ui_icon_6.setLabel( true );
              _jspx_th_liferay$1ui_icon_6.setMessage("blocked");
              int _jspx_eval_liferay$1ui_icon_6 = _jspx_th_liferay$1ui_icon_6.doStartTag();
              if (_jspx_th_liferay$1ui_icon_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_6);
                _jspx_th_liferay$1ui_icon_6.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_6);
              _jspx_th_liferay$1ui_icon_6.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t");
}
else {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t");
              //  liferay-util:include
              com.liferay.taglib.util.IncludeTag _jspx_th_liferay$1util_include_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.IncludeTag.class) : new com.liferay.taglib.util.IncludeTag();
              _jspx_th_liferay$1util_include_0.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1util_include_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_1);
              _jspx_th_liferay$1util_include_0.setPage("/user/user_toolbar.jsp");
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
              out.write("\t\t\t\t\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
}
              out.write("\n");
              out.write("\t\t\t\t\t\t");
            }
            if (_jspx_th_clay_col_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_1);
              _jspx_th_clay_col_1.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_1);
            _jspx_th_clay_col_1.release();
            out.write("\n");
            out.write("\t\t\t\t\t");
          }
          if (_jspx_th_clay_row_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_row_1);
            _jspx_th_clay_row_1.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_row_1);
          _jspx_th_clay_row_1.release();
          out.write("\n");
          out.write("\t\t\t\t");
        }
        if (_jspx_th_clay_col_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_0);
          _jspx_th_clay_col_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_0);
        _jspx_th_clay_col_0.release();
        out.write("\n");
        out.write("\t\t\t");
      }
      if (_jspx_th_clay_row_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_row_0);
        _jspx_th_clay_row_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_row_0);
      _jspx_th_clay_row_0.release();
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"lfr-detail-info lfr-field-group\" data-title=\"");
      out.print( LanguageUtil.get(request, "details") );
      out.write("\">\n");
      out.write("\n");
      out.write("\t\t\t\t");

				PortletURL editDetailsURL = PortletURLFactoryUtil.create(request, PortletKeys.MY_ACCOUNT, embeddedPersonalApplicationLayout, PortletRequest.RENDER_PHASE);
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");
      //  liferay-ui:icon
      com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
      _jspx_th_liferay$1ui_icon_7.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_icon_7.setParent(null);
      _jspx_th_liferay$1ui_icon_7.setIcon("pencil");
      _jspx_th_liferay$1ui_icon_7.setMarkupView("lexicon");
      _jspx_th_liferay$1ui_icon_7.setUrl( editDetailsURL.toString() );
      int _jspx_eval_liferay$1ui_icon_7 = _jspx_th_liferay$1ui_icon_7.doStartTag();
      if (_jspx_th_liferay$1ui_icon_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_7);
        _jspx_th_liferay$1ui_icon_7.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_7);
      _jspx_th_liferay$1ui_icon_7.release();
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");
if (
 showIcon ) {
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"lfr-contact-thumb\">\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print( user2.getDisplayURL(themeDisplay) );
      out.write("\"><img alt=\"");
      out.print( HtmlUtil.escapeAttribute(user2.getFullName()) );
      out.write("\" src=\"");
      out.print( user2.getPortraitURL(themeDisplay) );
      out.write("\" /></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"");
      out.print( showIcon ? StringPool.BLANK : "no-icon" );
      out.write(" lfr-contact-info\">\n");
      out.write("\t\t\t\t\t<div class=\"lfr-contact-name\">\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print( user2.getDisplayURL(themeDisplay) );
      out.write('"');
      out.write('>');
      out.print( user2.getFullName() );
      out.write("</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"lfr-contact-job-title\">\n");
      out.write("\t\t\t\t\t\t");
      out.print( user2.getJobTitle() );
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"lfr-contact-extra\">\n");
      out.write("\t\t\t\t\t\t<a href=\"mailto:");
      out.print( user2.getEmailAddress() );
      out.write('"');
      out.write('>');
      out.print( user2.getEmailAddress() );
      out.write("</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"clear\"><!-- --></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t");
if (
 ((displayStyle == ContactsConstants.DISPLAY_STYLE_DETAIL) || (displayStyle == ContactsConstants.DISPLAY_STYLE_FULL) || ((themeDisplay.getUserId() == user2.getUserId()) && showCompleteYourProfile)) && UserPermissionUtil.contains(permissionChecker, user2.getUserId(), ActionKeys.VIEW) ) {
      out.write("\n");
      out.write("\t\t\t<div class=\"user-information\" id=\"");
      if (_jspx_meth_portlet_namespace_1(_jspx_page_context))
        return;
      out.write("userInformation\">\n");
      out.write("\t\t\t\t");
      //  clay:row
      com.liferay.frontend.taglib.clay.servlet.taglib.RowTag _jspx_th_clay_row_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.RowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.RowTag();
      _jspx_th_clay_row_2.setPageContext(_jspx_page_context);
      _jspx_th_clay_row_2.setParent(null);
      int _jspx_eval_clay_row_2 = _jspx_th_clay_row_2.doStartTag();
      if (_jspx_eval_clay_row_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t\t");
        //  clay:col
        com.liferay.frontend.taglib.clay.servlet.taglib.ColTag _jspx_th_clay_col_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ColTag();
        _jspx_th_clay_col_2.setPageContext(_jspx_page_context);
        _jspx_th_clay_col_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_row_2);
        int _jspx_eval_clay_col_2 = _jspx_th_clay_col_2.doStartTag();
        if (_jspx_eval_clay_col_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t\t\t\t");
if (
 showUsersInformation ) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
          //  clay:col
          com.liferay.frontend.taglib.clay.servlet.taglib.ColTag _jspx_th_clay_col_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ColTag();
          _jspx_th_clay_col_3.setPageContext(_jspx_page_context);
          _jspx_th_clay_col_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_2);
          _jspx_th_clay_col_3.setCssClass("user-information-column-1");
          _jspx_th_clay_col_3.setMd( showSites ? String.valueOf(9) : String.valueOf(12) );
          int _jspx_eval_clay_col_3 = _jspx_th_clay_col_3.doStartTag();
          if (_jspx_eval_clay_col_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t<div class=\"user-information-title\">\n");
            out.write("\t\t\t\t\t\t\t\t\t");
            if (_jspx_meth_liferay$1ui_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_col_3, _jspx_page_context))
              return;
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t</div>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t<div class=\"lfr-user-info-container\">\n");
            out.write("\t\t\t\t\t\t\t\t\t");
            //  liferay-util:include
            com.liferay.taglib.util.IncludeTag _jspx_th_liferay$1util_include_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.IncludeTag.class) : new com.liferay.taglib.util.IncludeTag();
            _jspx_th_liferay$1util_include_1.setPageContext(_jspx_page_context);
            _jspx_th_liferay$1util_include_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_3);
            _jspx_th_liferay$1util_include_1.setPage("/user/view_user_information.jsp");
            _jspx_th_liferay$1util_include_1.setServletContext( application );
            int _jspx_eval_liferay$1util_include_1 = _jspx_th_liferay$1util_include_1.doStartTag();
            if (_jspx_th_liferay$1util_include_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_include_1);
              _jspx_th_liferay$1util_include_1.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_include_1);
            _jspx_th_liferay$1util_include_1.release();
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t</div>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t");

								Map<String, String> extensions = ContactsExtensionsUtil.getExtensions();

								Set<String> servletContextNames = extensions.keySet();

								request.setAttribute("view_user.jsp-showCompleteYourProfile", String.valueOf(showCompleteYourProfile));

								for (String servletContextName : servletContextNames) {
									String extensionPath = extensions.get(servletContextName);

									ServletContext extensionServletContext = ServletContextPool.get(servletContextName);

									String title = extensionPath.substring(extensionPath.lastIndexOf(StringPool.SLASH) + 1, extensionPath.lastIndexOf(StringPool.PERIOD));

									title = StringUtil.replace(title, CharPool.UNDERLINE, CharPool.DASH);
								
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t<div class=\"user-information-title\">\n");
            out.write("\t\t\t\t\t\t\t\t\t\t");
            //  liferay-ui:message
            com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
            _jspx_th_liferay$1ui_message_4.setPageContext(_jspx_page_context);
            _jspx_th_liferay$1ui_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_3);
            _jspx_th_liferay$1ui_message_4.setKey( title );
            int _jspx_eval_liferay$1ui_message_4 = _jspx_th_liferay$1ui_message_4.doStartTag();
            if (_jspx_th_liferay$1ui_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_4);
              _jspx_th_liferay$1ui_message_4.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_4);
            _jspx_th_liferay$1ui_message_4.release();
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t</div>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t");
            //  liferay-util:include
            com.liferay.taglib.util.IncludeTag _jspx_th_liferay$1util_include_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.IncludeTag.class) : new com.liferay.taglib.util.IncludeTag();
            _jspx_th_liferay$1util_include_2.setPageContext(_jspx_page_context);
            _jspx_th_liferay$1util_include_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_3);
            _jspx_th_liferay$1util_include_2.setPage( extensionPath );
            _jspx_th_liferay$1util_include_2.setServletContext( extensionServletContext );
            int _jspx_eval_liferay$1util_include_2 = _jspx_th_liferay$1util_include_2.doStartTag();
            if (_jspx_th_liferay$1util_include_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_include_2);
              _jspx_th_liferay$1util_include_2.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_include_2);
            _jspx_th_liferay$1util_include_2.release();
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t");

								}
								
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t");
          }
          if (_jspx_th_clay_col_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_3);
            _jspx_th_clay_col_3.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_3);
          _jspx_th_clay_col_3.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t");
if (
 showSites || showTags ) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
          //  clay:col
          com.liferay.frontend.taglib.clay.servlet.taglib.ColTag _jspx_th_clay_col_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ColTag();
          _jspx_th_clay_col_4.setPageContext(_jspx_page_context);
          _jspx_th_clay_col_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_2);
          _jspx_th_clay_col_4.setCssClass("user-information-column-2");
          _jspx_th_clay_col_4.setMd( showUsersInformation ? String.valueOf(3) : String.valueOf(12) );
          int _jspx_eval_clay_col_4 = _jspx_th_clay_col_4.doStartTag();
          if (_jspx_eval_clay_col_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t");
if (
 showSites ) {
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t");

									LinkedHashMap<String, Object> groupParams = LinkedHashMapBuilder.<String, Object>put(
										"site", Boolean.TRUE
									).build();

									if (scopeGroup.isUser()) {
										groupParams.put("usersGroups", Long.valueOf(scopeGroup.getClassPK()));
									}
									else {
										groupParams.put("usersGroups", Long.valueOf(themeDisplay.getUserId()));
									}

									groupParams.put("active", Boolean.TRUE);

									if (scopeGroup.isUser() && (themeDisplay.getUserId() != scopeGroup.getClassPK())) {
										List<Integer> types = new ArrayList<Integer>();

										types.add(GroupConstants.TYPE_SITE_OPEN);
										types.add(GroupConstants.TYPE_SITE_RESTRICTED);

										groupParams.put("types", types);
									}

									List<Group> results = GroupLocalServiceUtil.search(company.getCompanyId(), null, null, groupParams, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
									
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t<div class=\"user-sites-title\">\n");
            out.write("\t\t\t\t\t\t\t\t\t\t");
            if (_jspx_meth_liferay$1ui_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_col_4, _jspx_page_context))
              return;
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t</div>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t<ul class=\"user-sites\">\n");
            out.write("\t\t\t\t\t\t\t\t\t\t");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t");
if (
 !results.isEmpty() ) {
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t");

												for (Group curGroup : results) {
												
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"user-information-sites\"><a href=\"");
            out.print( curGroup.getDisplayURL(themeDisplay, !curGroup.hasPublicLayouts()) );
            out.write('"');
            out.write('>');
            out.print( HtmlUtil.escape(curGroup.getDescriptiveName(locale)) );
            out.write("</a></li>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t");

												}
												
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t");
}
else {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"empty\">\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
            //  liferay-ui:message
            com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
            _jspx_th_liferay$1ui_message_6.setPageContext(_jspx_page_context);
            _jspx_th_liferay$1ui_message_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_4);
            _jspx_th_liferay$1ui_message_6.setArguments( HtmlUtil.escape(PortalUtil.getUserName(user2.getUserId(), scopeGroup.getDescriptiveName(locale))) );
            _jspx_th_liferay$1ui_message_6.setKey("x-does-not-belong-to-any-sites");
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
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t");
}
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
            out.write("\t\t\t\t\t\t\t\t");
}
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t");
if (
 showTags ) {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t<div class=\"user-tags-title\">\n");
            out.write("\t\t\t\t\t\t\t\t\t\t");
            if (_jspx_meth_liferay$1ui_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_col_4, _jspx_page_context))
              return;
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t</div>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t");

									List<AssetTag> assetTags = AssetTagLocalServiceUtil.getTags(User.class.getName(), user2.getUserId());
									
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t");
if (
 !assetTags.isEmpty() ) {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"lfr-field-group user-tags-wrapper\" data-title=\"");
            out.print( LanguageUtil.get(request, "tags") );
            out.write("\">\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t");

												PortletURL editCategorizationURL = PortletURLFactoryUtil.create(request, PortletKeys.MY_ACCOUNT, embeddedPersonalApplicationLayout, PortletRequest.RENDER_PHASE);
												
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
            //  liferay-ui:icon
            com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
            _jspx_th_liferay$1ui_icon_8.setPageContext(_jspx_page_context);
            _jspx_th_liferay$1ui_icon_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_4);
            _jspx_th_liferay$1ui_icon_8.setIcon("pencil");
            _jspx_th_liferay$1ui_icon_8.setMarkupView("lexicon");
            _jspx_th_liferay$1ui_icon_8.setUrl( editCategorizationURL.toString() );
            int _jspx_eval_liferay$1ui_icon_8 = _jspx_th_liferay$1ui_icon_8.doStartTag();
            if (_jspx_th_liferay$1ui_icon_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_8);
              _jspx_th_liferay$1ui_icon_8.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_8);
            _jspx_th_liferay$1ui_icon_8.release();
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t<ul class=\"user-tags\">\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");

													StringBuilder sb = new StringBuilder();

													String searchPortletId = PortletProviderUtil.getPortletId(PortalSearchApplicationType.Search.CLASS_NAME, PortletProvider.Action.VIEW);

													for (AssetTag assetTag : assetTags) {
														PortletURL searchURL = PortletURLBuilder.createRenderURL(
															liferayPortletResponse, searchPortletId
														).setMVCPath(
															"/search.jsp"
														).setKeywords(
															assetTag.getName()
														).setParameter(
															"groupId", "0"
														).setWindowState(
															WindowState.MAXIMIZED
														).buildPortletURL();

														sb.append("<li><a href=\"");
														sb.append(searchURL);
														sb.append("\">");
														sb.append(assetTag.getName());
														sb.append("</a></li>");
													}
													
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
            out.print( sb.toString() );
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t");
}
else {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t");
            //  liferay-ui:message
            com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
            _jspx_th_liferay$1ui_message_8.setPageContext(_jspx_page_context);
            _jspx_th_liferay$1ui_message_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_4);
            _jspx_th_liferay$1ui_message_8.setArguments( HtmlUtil.escape(PortalUtil.getUserName(user2.getUserId(), scopeGroup.getDescriptiveName(locale))) );
            _jspx_th_liferay$1ui_message_8.setKey("x-does-not-have-any-tags");
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
          if (_jspx_th_clay_col_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_4);
            _jspx_th_clay_col_4.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_4);
          _jspx_th_clay_col_4.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t");
}
          out.write("\n");
          out.write("\t\t\t\t\t");
        }
        if (_jspx_th_clay_col_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_2);
          _jspx_th_clay_col_2.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_2);
        _jspx_th_clay_col_2.release();
        out.write("\n");
        out.write("\t\t\t\t");
      }
      if (_jspx_th_clay_row_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_row_2);
        _jspx_th_clay_row_2.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_row_2);
      _jspx_th_clay_row_2.release();
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t");
if (
 showRecentActivity && UserPermissionUtil.contains(permissionChecker, user2.getUserId(), ActionKeys.VIEW) ) {
      out.write("\n");
      out.write("\t\t\t\t<div class=\"user-information-title\">\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_liferay$1ui_message_9(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t");
      //  liferay-social-activities:social-activities
      com.liferay.social.activities.taglib.servlet.taglib.SocialActivitiesTag _jspx_th_liferay$1social$1activities_social$1activities_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.social.activities.taglib.servlet.taglib.SocialActivitiesTag.class) : new com.liferay.social.activities.taglib.servlet.taglib.SocialActivitiesTag();
      _jspx_th_liferay$1social$1activities_social$1activities_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1social$1activities_social$1activities_0.setParent(null);
      _jspx_th_liferay$1social$1activities_social$1activities_0.setActivities( SocialActivityLocalServiceUtil.getUserActivities(user2.getUserId(), 0, 10) );
      _jspx_th_liferay$1social$1activities_social$1activities_0.setFeedEnabled( false );
      int _jspx_eval_liferay$1social$1activities_social$1activities_0 = _jspx_th_liferay$1social$1activities_social$1activities_0.doStartTag();
      if (_jspx_th_liferay$1social$1activities_social$1activities_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1social$1activities_social$1activities_0);
        _jspx_th_liferay$1social$1activities_social$1activities_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1social$1activities_social$1activities_0);
      _jspx_th_liferay$1social$1activities_social$1activities_0.release();
      out.write("\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\t\t");
}
      out.write("\n");
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

  private boolean _jspx_meth_portlet_namespace_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_0.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_0.setParent(null);
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

  private boolean _jspx_meth_liferay$1ui_icon_0(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_col_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:icon
    com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
    _jspx_th_liferay$1ui_icon_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_icon_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
    _jspx_th_liferay$1ui_icon_0.setIcon("user");
    _jspx_th_liferay$1ui_icon_0.setMarkupView("lexicon");
    int _jspx_eval_liferay$1ui_icon_0 = _jspx_th_liferay$1ui_icon_0.doStartTag();
    if (_jspx_th_liferay$1ui_icon_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_0);
      _jspx_th_liferay$1ui_icon_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_0);
    _jspx_th_liferay$1ui_icon_0.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_col_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
    _jspx_th_liferay$1ui_message_0.setKey("connection");
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

  private boolean _jspx_meth_liferay$1ui_icon_1(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_col_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:icon
    com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
    _jspx_th_liferay$1ui_icon_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_icon_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
    _jspx_th_liferay$1ui_icon_1.setIcon("user");
    _jspx_th_liferay$1ui_icon_1.setMarkupView("lexicon");
    int _jspx_eval_liferay$1ui_icon_1 = _jspx_th_liferay$1ui_icon_1.doStartTag();
    if (_jspx_th_liferay$1ui_icon_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_1);
      _jspx_th_liferay$1ui_icon_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_1);
    _jspx_th_liferay$1ui_icon_1.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_col_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
    _jspx_th_liferay$1ui_message_1.setKey("following");
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

  private boolean _jspx_meth_liferay$1ui_icon_2(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_col_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:icon
    com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
    _jspx_th_liferay$1ui_icon_2.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_icon_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
    _jspx_th_liferay$1ui_icon_2.setIcon("user");
    _jspx_th_liferay$1ui_icon_2.setMarkupView("lexicon");
    int _jspx_eval_liferay$1ui_icon_2 = _jspx_th_liferay$1ui_icon_2.doStartTag();
    if (_jspx_th_liferay$1ui_icon_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_2);
      _jspx_th_liferay$1ui_icon_2.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_2);
    _jspx_th_liferay$1ui_icon_2.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_col_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_2.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
    _jspx_th_liferay$1ui_message_2.setKey("follower");
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

  private boolean _jspx_meth_liferay$1ui_message_3(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_col_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_3.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_3);
    _jspx_th_liferay$1ui_message_3.setKey("about");
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

  private boolean _jspx_meth_liferay$1ui_message_5(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_col_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_5.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_4);
    _jspx_th_liferay$1ui_message_5.setKey("sites");
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

  private boolean _jspx_meth_liferay$1ui_message_7(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_col_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_7.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_4);
    _jspx_th_liferay$1ui_message_7.setKey("tags");
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

  private boolean _jspx_meth_liferay$1ui_message_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_9.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_9.setParent(null);
    _jspx_th_liferay$1ui_message_9.setKey("recent-activity");
    int _jspx_eval_liferay$1ui_message_9 = _jspx_th_liferay$1ui_message_9.doStartTag();
    if (_jspx_th_liferay$1ui_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_9);
      _jspx_th_liferay$1ui_message_9.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_9);
    _jspx_th_liferay$1ui_message_9.release();
    return false;
  }
}
