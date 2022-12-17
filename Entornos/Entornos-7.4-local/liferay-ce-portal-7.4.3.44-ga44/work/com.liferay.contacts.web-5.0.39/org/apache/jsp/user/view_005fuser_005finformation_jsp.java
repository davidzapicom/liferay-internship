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

public final class view_005fuser_005finformation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/user/complete_your_profile.jspf");
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

Contact contact2 = user2.getContact();

boolean incompleteProfile = false;

List<AssetTag> assetTags = AssetTagLocalServiceUtil.getTags(User.class.getName(), user2.getUserId());

if (assetTags.isEmpty() || Validator.isNull(user2.getComments())) {
	incompleteProfile = true;
}

      out.write('\n');
      out.write('\n');
if (
 showComments && Validator.isNotNull(user2.getComments()) ) {
      out.write("\n");
      out.write("\t<div class=\"lfr-field-group lfr-user-comments section\" data-title=\"");
      out.print( LanguageUtil.get(request, "introduction") );
      out.write("\">\n");
      out.write("\n");
      out.write("\t\t");

		PortletURL editCommentsURL = PortletURLFactoryUtil.create(request, PortletKeys.MY_ACCOUNT, embeddedPersonalApplicationLayout, PortletRequest.RENDER_PHASE);
		
      out.write("\n");
      out.write("\n");
      out.write("\t\t");
      //  liferay-ui:icon
      com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
      _jspx_th_liferay$1ui_icon_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_icon_0.setParent(null);
      _jspx_th_liferay$1ui_icon_0.setIcon("pencil");
      _jspx_th_liferay$1ui_icon_0.setMarkupView("lexicon");
      _jspx_th_liferay$1ui_icon_0.setUrl( editCommentsURL.toString() );
      int _jspx_eval_liferay$1ui_icon_0 = _jspx_th_liferay$1ui_icon_0.doStartTag();
      if (_jspx_th_liferay$1ui_icon_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_0);
        _jspx_th_liferay$1ui_icon_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_0);
      _jspx_th_liferay$1ui_icon_0.release();
      out.write("\n");
      out.write("\n");
      out.write("\t\t<h3>");
      if (_jspx_meth_liferay$1ui_message_0(_jspx_page_context))
        return;
      out.write(":</h3>\n");
      out.write("\n");
      out.write("\t\t<ul class=\"property-list\">\n");
      out.write("\t\t\t<li>\n");
      out.write("\t\t\t\t<span class=\"property\">");
      out.print( HtmlUtil.replaceNewLine(user2.getComments()) );
      out.write("</span>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
}
      out.write('\n');
      out.write('\n');

List<Phone> phones = PhoneServiceUtil.getPhones(Contact.class.getName(), contact2.getContactId());

if (phones.isEmpty()) {
	incompleteProfile = true;
}

      out.write('\n');
      out.write('\n');
if (
 showPhones && !phones.isEmpty() ) {
      out.write("\n");
      out.write("\t<div class=\"lfr-field-group lfr-user-phones section\" data-title=\"");
      out.print( LanguageUtil.get(request, "phone-numbers") );
      out.write("\">\n");
      out.write("\n");
      out.write("\t\t");

		PortletURL editPhonesURL = PortletURLBuilder.create(
			PortletURLFactoryUtil.create(request, PortletKeys.MY_ACCOUNT, embeddedPersonalApplicationLayout, PortletRequest.RENDER_PHASE)
		).setParameter(
			"screenNavigationCategoryKey", "contact"
		).setParameter(
			"screenNavigationEntryKey", "contact-information"
		).buildPortletURL();
		
      out.write("\n");
      out.write("\n");
      out.write("\t\t");
      //  liferay-ui:icon
      com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
      _jspx_th_liferay$1ui_icon_1.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_icon_1.setParent(null);
      _jspx_th_liferay$1ui_icon_1.setIcon("pencil");
      _jspx_th_liferay$1ui_icon_1.setMarkupView("lexicon");
      _jspx_th_liferay$1ui_icon_1.setUrl( editPhonesURL.toString() );
      int _jspx_eval_liferay$1ui_icon_1 = _jspx_th_liferay$1ui_icon_1.doStartTag();
      if (_jspx_th_liferay$1ui_icon_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_1);
        _jspx_th_liferay$1ui_icon_1.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_1);
      _jspx_th_liferay$1ui_icon_1.release();
      out.write("\n");
      out.write("\n");
      out.write("\t\t<h3>");
      if (_jspx_meth_liferay$1ui_message_1(_jspx_page_context))
        return;
      out.write(":</h3>\n");
      out.write("\n");
      out.write("\t\t<ul class=\"property-list\">\n");
      out.write("\n");
      out.write("\t\t\t");

			for (Phone phone : phones) {
			
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<li class=\"");
      out.print( phone.isPrimary() ? "primary" : "" );
      out.write("\">\n");
      out.write("\t\t\t\t\t<span class=\"property-type\">");
      //  liferay-ui:message
      com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
      _jspx_th_liferay$1ui_message_2.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_message_2.setParent(null);
      _jspx_th_liferay$1ui_message_2.setKey( phone.getType().getName() );
      int _jspx_eval_liferay$1ui_message_2 = _jspx_th_liferay$1ui_message_2.doStartTag();
      if (_jspx_th_liferay$1ui_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
        _jspx_th_liferay$1ui_message_2.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
      _jspx_th_liferay$1ui_message_2.release();
      out.write("</span>\n");
      out.write("\t\t\t\t\t<span class=\"property\">");
      out.print( HtmlUtil.escape(phone.getNumber()) );
      out.write(' ');
      out.print( phone.getExtension() );
      out.write("</span>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t");

			}
			
      out.write("\n");
      out.write("\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
}
      out.write('\n');
      out.write('\n');

List<EmailAddress> emailAddresses = EmailAddressServiceUtil.getEmailAddresses(Contact.class.getName(), contact2.getContactId());

if (emailAddresses.isEmpty()) {
	incompleteProfile = true;
}

      out.write('\n');
      out.write('\n');
if (
 showAdditionalEmailAddresses && !emailAddresses.isEmpty() ) {
      out.write("\n");
      out.write("\t<div class=\"lfr-field-group lfr-user-email-addresses section\" data-title=\"");
      out.print( LanguageUtil.get(request, "additional-email-addresses") );
      out.write("\">\n");
      out.write("\n");
      out.write("\t\t");

		PortletURL editAdditionalEmailAddressesURL = PortletURLBuilder.create(
			PortletURLFactoryUtil.create(request, PortletKeys.MY_ACCOUNT, embeddedPersonalApplicationLayout, PortletRequest.RENDER_PHASE)
		).setParameter(
			"screenNavigationCategoryKey", "contact"
		).setParameter(
			"screenNavigationEntryKey", "contact-information"
		).buildPortletURL();
		
      out.write("\n");
      out.write("\n");
      out.write("\t\t");
      //  liferay-ui:icon
      com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
      _jspx_th_liferay$1ui_icon_2.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_icon_2.setParent(null);
      _jspx_th_liferay$1ui_icon_2.setIcon("pencil");
      _jspx_th_liferay$1ui_icon_2.setMarkupView("lexicon");
      _jspx_th_liferay$1ui_icon_2.setUrl( editAdditionalEmailAddressesURL.toString() );
      int _jspx_eval_liferay$1ui_icon_2 = _jspx_th_liferay$1ui_icon_2.doStartTag();
      if (_jspx_th_liferay$1ui_icon_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_2);
        _jspx_th_liferay$1ui_icon_2.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_2);
      _jspx_th_liferay$1ui_icon_2.release();
      out.write("\n");
      out.write("\n");
      out.write("\t\t<h3>");
      if (_jspx_meth_liferay$1ui_message_3(_jspx_page_context))
        return;
      out.write(":</h3>\n");
      out.write("\n");
      out.write("\t\t<ul class=\"property-list\">\n");
      out.write("\n");
      out.write("\t\t\t");

			for (int i = 0; i < emailAddresses.size(); i++) {
				EmailAddress emailAddress = emailAddresses.get(i);
			
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<li class=\"");
      out.print( emailAddress.isPrimary() ? "primary" : "" );
      out.write("\">\n");
      out.write("\t\t\t\t\t<span class=\"property-type\">");
      //  liferay-ui:message
      com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
      _jspx_th_liferay$1ui_message_4.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_message_4.setParent(null);
      _jspx_th_liferay$1ui_message_4.setKey( emailAddress.getType().getName() );
      int _jspx_eval_liferay$1ui_message_4 = _jspx_th_liferay$1ui_message_4.doStartTag();
      if (_jspx_th_liferay$1ui_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_4);
        _jspx_th_liferay$1ui_message_4.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_4);
      _jspx_th_liferay$1ui_message_4.release();
      out.write("</span>\n");
      out.write("\t\t\t\t\t<span class=\"property\"><a href=\"mailto:");
      out.print( emailAddress.getAddress() );
      out.write('"');
      out.write('>');
      out.print( emailAddress.getAddress() );
      out.write("</a></span>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t");

			}
			
      out.write("\n");
      out.write("\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
}
      out.write('\n');
      out.write('\n');

String jabberSn = contact2.getJabberSn();
String skypeSn = contact2.getSkypeSn();

if (Validator.isNull(jabberSn) && Validator.isNull(skypeSn)) {
	incompleteProfile = true;
}

      out.write('\n');
      out.write('\n');
if (
 showInstantMessenger && (Validator.isNotNull(jabberSn) || Validator.isNotNull(skypeSn)) ) {
      out.write("\n");
      out.write("\t<div class=\"lfr-field-group section\" data-title=\"");
      out.print( LanguageUtil.get(request, "instant-messenger") );
      out.write("\">\n");
      out.write("\t\t");
      //  liferay-ui:icon
      com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
      _jspx_th_liferay$1ui_icon_3.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_icon_3.setParent(null);
      _jspx_th_liferay$1ui_icon_3.setIcon("pencil");
      _jspx_th_liferay$1ui_icon_3.setMarkupView("lexicon");
      _jspx_th_liferay$1ui_icon_3.setUrl(
				PortletURLBuilder.create(
					PortletURLFactoryUtil.create(request, PortletKeys.MY_ACCOUNT, embeddedPersonalApplicationLayout, PortletRequest.RENDER_PHASE)
				).setParameter(
					"screenNavigationCategoryKey", "contact"
				).setParameter(
					"screenNavigationEntryKey", "contact-information"
				).buildString()
			);
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
      out.write("\t\t<h3>");
      if (_jspx_meth_liferay$1ui_message_5(_jspx_page_context))
        return;
      out.write(":</h3>\n");
      out.write("\n");
      out.write("\t\t<ul class=\"property-list\">\n");
      out.write("\t\t\t");
if (
 Validator.isNotNull(jabberSn) ) {
      out.write("\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<span class=\"property-type\">");
      if (_jspx_meth_liferay$1ui_message_6(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<span class=\"property\">");
      out.print( HtmlUtil.escape(jabberSn) );
      out.write("</span>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
if (
 Validator.isNotNull(skypeSn) ) {
      out.write("\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<span class=\"property-type\">");
      if (_jspx_meth_liferay$1ui_message_7(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<span class=\"property\">");
      out.print( HtmlUtil.escape(skypeSn) );
      out.write("</span>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
}
      out.write('\n');
      out.write('\n');

List<Address> addresses = AddressServiceUtil.getAddresses(Contact.class.getName(), contact2.getContactId());

if (addresses.isEmpty()) {
	incompleteProfile = true;
}

      out.write('\n');
      out.write('\n');
if (
 showAddresses && !addresses.isEmpty() ) {
      out.write("\n");
      out.write("\t<div class=\"lfr-field-group lfr-user-addresses section\" data-title=\"");
      out.print( LanguageUtil.get(request, "addresses") );
      out.write("\">\n");
      out.write("\n");
      out.write("\t\t");

		PortletURL editAddressesURL = PortletURLBuilder.create(
			PortletURLFactoryUtil.create(request, PortletKeys.MY_ACCOUNT, embeddedPersonalApplicationLayout, PortletRequest.RENDER_PHASE)
		).setParameter(
			"screenNavigationCategoryKey", "contact"
		).buildPortletURL();
		
      out.write("\n");
      out.write("\n");
      out.write("\t\t");
      //  liferay-ui:icon
      com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
      _jspx_th_liferay$1ui_icon_4.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_icon_4.setParent(null);
      _jspx_th_liferay$1ui_icon_4.setIcon("pencil");
      _jspx_th_liferay$1ui_icon_4.setMarkupView("lexicon");
      _jspx_th_liferay$1ui_icon_4.setUrl( editAddressesURL.toString() );
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
      out.write("\t\t<h3>");
      if (_jspx_meth_liferay$1ui_message_8(_jspx_page_context))
        return;
      out.write(":</h3>\n");
      out.write("\n");
      out.write("\t\t<ul class=\"property-list\">\n");
      out.write("\n");
      out.write("\t\t\t");

			for (Address address : addresses) {
				ListType listType = address.getListType();
			
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<li class=\"");
      out.print( address.isPrimary() ? "primary" : "" );
      out.write("\">\n");
      out.write("\t\t\t\t\t<span class=\"property-type\">");
      //  liferay-ui:message
      com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
      _jspx_th_liferay$1ui_message_9.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_message_9.setParent(null);
      _jspx_th_liferay$1ui_message_9.setKey( listType.getName() );
      int _jspx_eval_liferay$1ui_message_9 = _jspx_th_liferay$1ui_message_9.doStartTag();
      if (_jspx_th_liferay$1ui_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_9);
        _jspx_th_liferay$1ui_message_9.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_9);
      _jspx_th_liferay$1ui_message_9.release();
      out.write("</span><br />\n");
      out.write("\n");
      out.write("\t\t\t\t\t");
      //  liferay-text-localizer:address-display
      com.liferay.text.localizer.taglib.servlet.taglib.AddressDisplayTag _jspx_th_liferay$1text$1localizer_address$1display_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.text.localizer.taglib.servlet.taglib.AddressDisplayTag.class) : new com.liferay.text.localizer.taglib.servlet.taglib.AddressDisplayTag();
      _jspx_th_liferay$1text$1localizer_address$1display_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1text$1localizer_address$1display_0.setParent(null);
      _jspx_th_liferay$1text$1localizer_address$1display_0.setAddress( address );
      int _jspx_eval_liferay$1text$1localizer_address$1display_0 = _jspx_th_liferay$1text$1localizer_address$1display_0.doStartTag();
      if (_jspx_th_liferay$1text$1localizer_address$1display_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1text$1localizer_address$1display_0);
        _jspx_th_liferay$1text$1localizer_address$1display_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1text$1localizer_address$1display_0);
      _jspx_th_liferay$1text$1localizer_address$1display_0.release();
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t");
if (
 address.isMailing() ) {
      out.write('(');
      if (_jspx_meth_liferay$1ui_message_10(_jspx_page_context))
        return;
      out.write(')');
}
      out.write("\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t");

			}
			
      out.write("\n");
      out.write("\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
}
      out.write('\n');
      out.write('\n');

List<Website> websites = WebsiteServiceUtil.getWebsites(Contact.class.getName(), contact2.getContactId());

if (websites.isEmpty()) {
	incompleteProfile = true;
}

      out.write('\n');
      out.write('\n');
if (
 showWebsites && !websites.isEmpty() ) {
      out.write("\n");
      out.write("\t<div class=\"lfr-field-group lfr-user-websites section\" data-title=\"");
      out.print( LanguageUtil.get(request, "websites") );
      out.write("\">\n");
      out.write("\n");
      out.write("\t\t");

		PortletURL editWebsitesURL = PortletURLBuilder.create(
			PortletURLFactoryUtil.create(request, PortletKeys.MY_ACCOUNT, embeddedPersonalApplicationLayout, PortletRequest.RENDER_PHASE)
		).setParameter(
			"screenNavigationCategoryKey", "contact"
		).setParameter(
			"screenNavigationEntryKey", "contact-information"
		).buildPortletURL();
		
      out.write("\n");
      out.write("\n");
      out.write("\t\t");
      //  liferay-ui:icon
      com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
      _jspx_th_liferay$1ui_icon_5.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_icon_5.setParent(null);
      _jspx_th_liferay$1ui_icon_5.setIcon("pencil");
      _jspx_th_liferay$1ui_icon_5.setMarkupView("lexicon");
      _jspx_th_liferay$1ui_icon_5.setUrl( editWebsitesURL.toString() );
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
      out.write("\t\t<h3>");
      if (_jspx_meth_liferay$1ui_message_11(_jspx_page_context))
        return;
      out.write(":</h3>\n");
      out.write("\n");
      out.write("\t\t<ul class=\"property-list\">\n");
      out.write("\n");
      out.write("\t\t\t");

			for (Website website : websites) {
				website = website.toEscapedModel();
			
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<li class=\"");
      out.print( website.isPrimary() ? "primary" : "" );
      out.write("\">\n");
      out.write("\t\t\t\t\t<span class=\"property-type\">");
      //  liferay-ui:message
      com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_12 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
      _jspx_th_liferay$1ui_message_12.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_message_12.setParent(null);
      _jspx_th_liferay$1ui_message_12.setKey( website.getType().getName() );
      int _jspx_eval_liferay$1ui_message_12 = _jspx_th_liferay$1ui_message_12.doStartTag();
      if (_jspx_th_liferay$1ui_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_12);
        _jspx_th_liferay$1ui_message_12.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_12);
      _jspx_th_liferay$1ui_message_12.release();
      out.write("</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<span class=\"property\"><a href=\"");
      out.print( website.getUrl() );
      out.write('"');
      out.write('>');
      out.print( website.getUrl() );
      out.write("</a></span>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t");

			}
			
      out.write("\n");
      out.write("\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
}
      out.write('\n');
      out.write('\n');

String facebook = contact2.getFacebookSn();
String twitter = contact2.getTwitterSn();

if (Validator.isNull(facebook) && Validator.isNull(twitter)) {
	incompleteProfile = true;
}

      out.write('\n');
      out.write('\n');
if (
 showSocialNetwork && (Validator.isNotNull(facebook) || Validator.isNotNull(twitter)) ) {
      out.write("\n");
      out.write("\t<div class=\"lfr-field-group lfr-user-social-network section\" data-title=\"");
      out.print( LanguageUtil.get(request, "social-network") );
      out.write("\">\n");
      out.write("\n");
      out.write("\t\t");

		PortletURL editSocialNetworkURL = PortletURLBuilder.create(
			PortletURLFactoryUtil.create(request, PortletKeys.MY_ACCOUNT, embeddedPersonalApplicationLayout, PortletRequest.RENDER_PHASE)
		).setParameter(
			"screenNavigationCategoryKey", "contact"
		).setParameter(
			"screenNavigationEntryKey", "contact-information"
		).buildPortletURL();
		
      out.write("\n");
      out.write("\n");
      out.write("\t\t");
      //  liferay-ui:icon
      com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
      _jspx_th_liferay$1ui_icon_6.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_icon_6.setParent(null);
      _jspx_th_liferay$1ui_icon_6.setIcon("pencil");
      _jspx_th_liferay$1ui_icon_6.setMarkupView("lexicon");
      _jspx_th_liferay$1ui_icon_6.setUrl( editSocialNetworkURL.toString() );
      int _jspx_eval_liferay$1ui_icon_6 = _jspx_th_liferay$1ui_icon_6.doStartTag();
      if (_jspx_th_liferay$1ui_icon_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_6);
        _jspx_th_liferay$1ui_icon_6.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_6);
      _jspx_th_liferay$1ui_icon_6.release();
      out.write("\n");
      out.write("\n");
      out.write("\t\t<h3>");
      if (_jspx_meth_liferay$1ui_message_13(_jspx_page_context))
        return;
      out.write(":</h3>\n");
      out.write("\n");
      out.write("\t\t<ul class=\"property-list\">\n");
      out.write("\t\t\t");
if (
 Validator.isNotNull(facebook) ) {
      out.write("\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<span class=\"property-type\">");
      if (_jspx_meth_liferay$1ui_message_14(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<span class=\"property\">");
      out.print( HtmlUtil.escape(facebook) );
      out.write("</span>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
if (
 Validator.isNotNull(twitter) ) {
      out.write("\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<span class=\"property-type\">");
      if (_jspx_meth_liferay$1ui_message_15(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<span class=\"property\">");
      out.print( HtmlUtil.escape(twitter) );
      out.write("</span>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
}
      out.write('\n');
      out.write('\n');

if (Validator.isNull(contact2.getSmsSn())) {
	incompleteProfile = true;
}

      out.write('\n');
      out.write('\n');
if (
 showSMS && Validator.isNotNull(contact2.getSmsSn()) ) {
      out.write("\n");
      out.write("\t<div class=\"lfr-field-group lfr-user-sms section\" data-title=\"");
      out.print( LanguageUtil.get(request, "sms") );
      out.write("\">\n");
      out.write("\n");
      out.write("\t\t");

		PortletURL editSmsURL = PortletURLBuilder.create(
			PortletURLFactoryUtil.create(request, PortletKeys.MY_ACCOUNT, embeddedPersonalApplicationLayout, PortletRequest.RENDER_PHASE)
		).setParameter(
			"screenNavigationCategoryKey", "contact"
		).setParameter(
			"screenNavigationEntryKey", "contact-information"
		).buildPortletURL();
		
      out.write("\n");
      out.write("\n");
      out.write("\t\t");
      //  liferay-ui:icon
      com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
      _jspx_th_liferay$1ui_icon_7.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_icon_7.setParent(null);
      _jspx_th_liferay$1ui_icon_7.setIcon("pencil");
      _jspx_th_liferay$1ui_icon_7.setMarkupView("lexicon");
      _jspx_th_liferay$1ui_icon_7.setUrl( editSmsURL.toString() );
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
      out.write("\t\t<h3>");
      if (_jspx_meth_liferay$1ui_message_16(_jspx_page_context))
        return;
      out.write(":</h3>\n");
      out.write("\n");
      out.write("\t\t<ul class=\"property-list\">\n");
      out.write("\t\t\t<li class=\"property\">\n");
      out.write("\t\t\t\t");
      out.print( HtmlUtil.escape(contact2.getSmsSn()) );
      out.write("\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
}
      out.write('\n');
      out.write('\n');
if (
 incompleteProfile && showCompleteYourProfile && (themeDisplay.getUserId() == user2.getUserId()) ) {
      out.write('\n');
      out.write('	');
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"profile-actions\">\n");
      out.write("\t<p class=\"alert alert-info portlet-msg\">");
      if (_jspx_meth_liferay$1ui_message_17(_jspx_page_context))
        return;
      out.write("</p>\n");
      out.write("\n");
      out.write("\t<div class=\"field-actions-toolbar\">\n");
      out.write("\t\t<ul class=\"settings-actions\">\n");
      out.write("\t\t\t");
if (
 Validator.isNull(user2.getComments()) ) {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");

				PortletURL editCommentsURL = PortletURLFactoryUtil.create(request, PortletKeys.MY_ACCOUNT, embeddedPersonalApplicationLayout, PortletRequest.RENDER_PHASE);
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"");
      out.print( editCommentsURL.toString() );
      out.write("\">\n");
      out.write("\t\t\t\t\t<li class=\"action-field component lfr-token settings-field\" data-title=\"");
      out.print( LanguageUtil.get(request, "introduction") );
      out.write("\">\n");
      out.write("\t\t\t\t\t\t<div class=\"settings-field-content\">\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_liferay$1ui_icon_8(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<span class=\"settings-label\">");
      if (_jspx_meth_liferay$1ui_message_18(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
if (
 assetTags.isEmpty() ) {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");

				PortletURL editCategorizationURL = PortletURLFactoryUtil.create(request, PortletKeys.MY_ACCOUNT, embeddedPersonalApplicationLayout, PortletRequest.RENDER_PHASE);
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"");
      out.print( editCategorizationURL.toString() );
      out.write("\">\n");
      out.write("\t\t\t\t\t<li class=\"action-field component lfr-token settings-field\" data-title=\"");
      out.print( LanguageUtil.get(request, "tags") );
      out.write("\">\n");
      out.write("\t\t\t\t\t\t<div class=\"settings-field-content\">\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_liferay$1ui_icon_9(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<span class=\"settings-label\">");
      if (_jspx_meth_liferay$1ui_message_19(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
if (
 phones.isEmpty() ) {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");

				PortletURL editPhonesURL = PortletURLBuilder.create(
					PortletURLFactoryUtil.create(request, PortletKeys.MY_ACCOUNT, embeddedPersonalApplicationLayout, PortletRequest.RENDER_PHASE)
				).setParameter(
					"screenNavigationCategoryKey", "contact"
				).setParameter(
					"screenNavigationEntryKey", "contact-information"
				).buildPortletURL();
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"");
      out.print( editPhonesURL.toString() );
      out.write("\">\n");
      out.write("\t\t\t\t\t<li class=\"action-field component lfr-token settings-field\" data-title=\"");
      out.print( LanguageUtil.get(request, "phone-numbers") );
      out.write("\">\n");
      out.write("\t\t\t\t\t\t<div class=\"settings-field-content\">\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_liferay$1ui_icon_10(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<span class=\"settings-label\">");
      if (_jspx_meth_liferay$1ui_message_20(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
if (
 emailAddresses.isEmpty() ) {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");

				PortletURL editAdditionalEmailAddressesURL = PortletURLBuilder.create(
					PortletURLFactoryUtil.create(request, PortletKeys.MY_ACCOUNT, embeddedPersonalApplicationLayout, PortletRequest.RENDER_PHASE)
				).setParameter(
					"screenNavigationCategoryKey", "contact"
				).setParameter(
					"screenNavigationEntryKey", "contact-information"
				).buildPortletURL();
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"");
      out.print( editAdditionalEmailAddressesURL.toString() );
      out.write("\">\n");
      out.write("\t\t\t\t\t<li class=\"action-field component lfr-token settings-field\" data-title=\"");
      out.print( LanguageUtil.get(request, "additional-email-addresses") );
      out.write("\">\n");
      out.write("\t\t\t\t\t\t<div class=\"settings-field-content\">\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_liferay$1ui_icon_11(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<span class=\"settings-label\">");
      if (_jspx_meth_liferay$1ui_message_21(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
if (
 addresses.isEmpty() ) {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");

				PortletURL editAddressesURL = PortletURLBuilder.create(
					PortletURLFactoryUtil.create(request, PortletKeys.MY_ACCOUNT, embeddedPersonalApplicationLayout, PortletRequest.RENDER_PHASE)
				).setParameter(
					"screenNavigationCategoryKey", "contact"
				).buildPortletURL();
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"");
      out.print( editAddressesURL.toString() );
      out.write("\">\n");
      out.write("\t\t\t\t\t<li class=\"action-field component lfr-token settings-field\" data-title=\"");
      out.print( LanguageUtil.get(request, "addresses") );
      out.write("\">\n");
      out.write("\t\t\t\t\t\t<div class=\"settings-field-content\">\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_liferay$1ui_icon_12(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<span class=\"settings-label\">");
      if (_jspx_meth_liferay$1ui_message_22(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
if (
 websites.isEmpty() ) {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");

				PortletURL editWebsitesURL = PortletURLBuilder.create(
					PortletURLFactoryUtil.create(request, PortletKeys.MY_ACCOUNT, embeddedPersonalApplicationLayout, PortletRequest.RENDER_PHASE)
				).setParameter(
					"screenNavigationCategoryKey", "contact"
				).setParameter(
					"screenNavigationEntryKey", "contact-information"
				).buildPortletURL();
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"");
      out.print( editWebsitesURL.toString() );
      out.write("\">\n");
      out.write("\t\t\t\t\t<li class=\"action-field component lfr-token settings-field\" data-title=\"");
      out.print( LanguageUtil.get(request, "websites") );
      out.write("\">\n");
      out.write("\t\t\t\t\t\t<div class=\"settings-field-content\">\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_liferay$1ui_icon_13(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<span class=\"settings-label\">");
      if (_jspx_meth_liferay$1ui_message_23(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
if (
 Validator.isNull(facebook) && Validator.isNull(twitter) ) {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");

				PortletURL editSocialNetworkURL = PortletURLBuilder.create(
					PortletURLFactoryUtil.create(request, PortletKeys.MY_ACCOUNT, embeddedPersonalApplicationLayout, PortletRequest.RENDER_PHASE)
				).setParameter(
					"screenNavigationCategoryKey", "contact"
				).setParameter(
					"screenNavigationEntryKey", "contact-information"
				).buildPortletURL();
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"");
      out.print( editSocialNetworkURL.toString() );
      out.write("\">\n");
      out.write("\t\t\t\t\t<li class=\"action-field component lfr-token settings-field\" data-title=\"");
      out.print( LanguageUtil.get(request, "social-network") );
      out.write("\">\n");
      out.write("\t\t\t\t\t\t<div class=\"settings-field-content\">\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_liferay$1ui_icon_14(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<span class=\"settings-label\">");
      if (_jspx_meth_liferay$1ui_message_24(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
if (
 Validator.isNull(contact2.getSmsSn()) ) {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");

				PortletURL editSmsURL = PortletURLBuilder.create(
					PortletURLFactoryUtil.create(request, PortletKeys.MY_ACCOUNT, embeddedPersonalApplicationLayout, PortletRequest.RENDER_PHASE)
				).setParameter(
					"screenNavigationCategoryKey", "contact"
				).setParameter(
					"screenNavigationEntryKey", "contact-information"
				).buildPortletURL();
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"");
      out.print( editSmsURL.toString() );
      out.write("\">\n");
      out.write("\t\t\t\t\t<li class=\"action-field component lfr-token settings-field\" data-title=\"");
      out.print( LanguageUtil.get(request, "sms") );
      out.write("\">\n");
      out.write("\t\t\t\t\t\t<div class=\"settings-field-content\">\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_liferay$1ui_icon_15(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<span class=\"settings-label\">");
      if (_jspx_meth_liferay$1ui_message_25(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("</div>");
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

  private boolean _jspx_meth_liferay$1ui_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent(null);
    _jspx_th_liferay$1ui_message_0.setKey("introduction");
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

  private boolean _jspx_meth_liferay$1ui_message_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent(null);
    _jspx_th_liferay$1ui_message_1.setKey("phones");
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

  private boolean _jspx_meth_liferay$1ui_message_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_3.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_3.setParent(null);
    _jspx_th_liferay$1ui_message_3.setKey("additional-email-addresses");
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

  private boolean _jspx_meth_liferay$1ui_message_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_5.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_5.setParent(null);
    _jspx_th_liferay$1ui_message_5.setKey("instant-messenger");
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

  private boolean _jspx_meth_liferay$1ui_message_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_6.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_6.setParent(null);
    _jspx_th_liferay$1ui_message_6.setKey("jabber");
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

  private boolean _jspx_meth_liferay$1ui_message_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_7.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_7.setParent(null);
    _jspx_th_liferay$1ui_message_7.setKey("skype");
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

  private boolean _jspx_meth_liferay$1ui_message_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_8.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_8.setParent(null);
    _jspx_th_liferay$1ui_message_8.setKey("addresses");
    int _jspx_eval_liferay$1ui_message_8 = _jspx_th_liferay$1ui_message_8.doStartTag();
    if (_jspx_th_liferay$1ui_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_8);
      _jspx_th_liferay$1ui_message_8.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_8);
    _jspx_th_liferay$1ui_message_8.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_10.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_10.setParent(null);
    _jspx_th_liferay$1ui_message_10.setKey("mailing");
    int _jspx_eval_liferay$1ui_message_10 = _jspx_th_liferay$1ui_message_10.doStartTag();
    if (_jspx_th_liferay$1ui_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_10);
      _jspx_th_liferay$1ui_message_10.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_10);
    _jspx_th_liferay$1ui_message_10.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_11.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_11.setParent(null);
    _jspx_th_liferay$1ui_message_11.setKey("websites");
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

  private boolean _jspx_meth_liferay$1ui_message_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_13 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_13.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_13.setParent(null);
    _jspx_th_liferay$1ui_message_13.setKey("social-network");
    int _jspx_eval_liferay$1ui_message_13 = _jspx_th_liferay$1ui_message_13.doStartTag();
    if (_jspx_th_liferay$1ui_message_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_13);
      _jspx_th_liferay$1ui_message_13.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_13);
    _jspx_th_liferay$1ui_message_13.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_14 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_14.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_14.setParent(null);
    _jspx_th_liferay$1ui_message_14.setKey("facebook");
    int _jspx_eval_liferay$1ui_message_14 = _jspx_th_liferay$1ui_message_14.doStartTag();
    if (_jspx_th_liferay$1ui_message_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_14);
      _jspx_th_liferay$1ui_message_14.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_14);
    _jspx_th_liferay$1ui_message_14.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_15 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_15.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_15.setParent(null);
    _jspx_th_liferay$1ui_message_15.setKey("twitter");
    int _jspx_eval_liferay$1ui_message_15 = _jspx_th_liferay$1ui_message_15.doStartTag();
    if (_jspx_th_liferay$1ui_message_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_15);
      _jspx_th_liferay$1ui_message_15.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_15);
    _jspx_th_liferay$1ui_message_15.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_16 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_16.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_16.setParent(null);
    _jspx_th_liferay$1ui_message_16.setKey("sms");
    int _jspx_eval_liferay$1ui_message_16 = _jspx_th_liferay$1ui_message_16.doStartTag();
    if (_jspx_th_liferay$1ui_message_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_16);
      _jspx_th_liferay$1ui_message_16.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_16);
    _jspx_th_liferay$1ui_message_16.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_17 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_17.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_17.setParent(null);
    _jspx_th_liferay$1ui_message_17.setKey("to-complete-your-profile-please-add");
    int _jspx_eval_liferay$1ui_message_17 = _jspx_th_liferay$1ui_message_17.doStartTag();
    if (_jspx_th_liferay$1ui_message_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_17);
      _jspx_th_liferay$1ui_message_17.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_17);
    _jspx_th_liferay$1ui_message_17.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_icon_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:icon
    com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
    _jspx_th_liferay$1ui_icon_8.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_icon_8.setParent(null);
    _jspx_th_liferay$1ui_icon_8.setIcon("plus");
    _jspx_th_liferay$1ui_icon_8.setMarkupView("lexicon");
    int _jspx_eval_liferay$1ui_icon_8 = _jspx_th_liferay$1ui_icon_8.doStartTag();
    if (_jspx_th_liferay$1ui_icon_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_8);
      _jspx_th_liferay$1ui_icon_8.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_8);
    _jspx_th_liferay$1ui_icon_8.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_18 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_18.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_18.setParent(null);
    _jspx_th_liferay$1ui_message_18.setKey("introduction");
    int _jspx_eval_liferay$1ui_message_18 = _jspx_th_liferay$1ui_message_18.doStartTag();
    if (_jspx_th_liferay$1ui_message_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_18);
      _jspx_th_liferay$1ui_message_18.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_18);
    _jspx_th_liferay$1ui_message_18.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_icon_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:icon
    com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
    _jspx_th_liferay$1ui_icon_9.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_icon_9.setParent(null);
    _jspx_th_liferay$1ui_icon_9.setIcon("plus");
    _jspx_th_liferay$1ui_icon_9.setMarkupView("lexicon");
    int _jspx_eval_liferay$1ui_icon_9 = _jspx_th_liferay$1ui_icon_9.doStartTag();
    if (_jspx_th_liferay$1ui_icon_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_9);
      _jspx_th_liferay$1ui_icon_9.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_9);
    _jspx_th_liferay$1ui_icon_9.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_19 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_19.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_19.setParent(null);
    _jspx_th_liferay$1ui_message_19.setKey("tags");
    int _jspx_eval_liferay$1ui_message_19 = _jspx_th_liferay$1ui_message_19.doStartTag();
    if (_jspx_th_liferay$1ui_message_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_19);
      _jspx_th_liferay$1ui_message_19.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_19);
    _jspx_th_liferay$1ui_message_19.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_icon_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:icon
    com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
    _jspx_th_liferay$1ui_icon_10.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_icon_10.setParent(null);
    _jspx_th_liferay$1ui_icon_10.setIcon("plus");
    _jspx_th_liferay$1ui_icon_10.setMarkupView("lexicon");
    int _jspx_eval_liferay$1ui_icon_10 = _jspx_th_liferay$1ui_icon_10.doStartTag();
    if (_jspx_th_liferay$1ui_icon_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_10);
      _jspx_th_liferay$1ui_icon_10.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_10);
    _jspx_th_liferay$1ui_icon_10.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_20 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_20.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_20.setParent(null);
    _jspx_th_liferay$1ui_message_20.setKey("phones");
    int _jspx_eval_liferay$1ui_message_20 = _jspx_th_liferay$1ui_message_20.doStartTag();
    if (_jspx_th_liferay$1ui_message_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_20);
      _jspx_th_liferay$1ui_message_20.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_20);
    _jspx_th_liferay$1ui_message_20.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_icon_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:icon
    com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
    _jspx_th_liferay$1ui_icon_11.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_icon_11.setParent(null);
    _jspx_th_liferay$1ui_icon_11.setIcon("plus");
    _jspx_th_liferay$1ui_icon_11.setMarkupView("lexicon");
    int _jspx_eval_liferay$1ui_icon_11 = _jspx_th_liferay$1ui_icon_11.doStartTag();
    if (_jspx_th_liferay$1ui_icon_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_11);
      _jspx_th_liferay$1ui_icon_11.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_11);
    _jspx_th_liferay$1ui_icon_11.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_21 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_21.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_21.setParent(null);
    _jspx_th_liferay$1ui_message_21.setKey("email-address");
    int _jspx_eval_liferay$1ui_message_21 = _jspx_th_liferay$1ui_message_21.doStartTag();
    if (_jspx_th_liferay$1ui_message_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_21);
      _jspx_th_liferay$1ui_message_21.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_21);
    _jspx_th_liferay$1ui_message_21.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_icon_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:icon
    com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_12 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
    _jspx_th_liferay$1ui_icon_12.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_icon_12.setParent(null);
    _jspx_th_liferay$1ui_icon_12.setIcon("plus");
    _jspx_th_liferay$1ui_icon_12.setMarkupView("lexicon");
    int _jspx_eval_liferay$1ui_icon_12 = _jspx_th_liferay$1ui_icon_12.doStartTag();
    if (_jspx_th_liferay$1ui_icon_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_12);
      _jspx_th_liferay$1ui_icon_12.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_12);
    _jspx_th_liferay$1ui_icon_12.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_22 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_22.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_22.setParent(null);
    _jspx_th_liferay$1ui_message_22.setKey("addresses");
    int _jspx_eval_liferay$1ui_message_22 = _jspx_th_liferay$1ui_message_22.doStartTag();
    if (_jspx_th_liferay$1ui_message_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_22);
      _jspx_th_liferay$1ui_message_22.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_22);
    _jspx_th_liferay$1ui_message_22.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_icon_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:icon
    com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_13 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
    _jspx_th_liferay$1ui_icon_13.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_icon_13.setParent(null);
    _jspx_th_liferay$1ui_icon_13.setIcon("plus");
    _jspx_th_liferay$1ui_icon_13.setMarkupView("lexicon");
    int _jspx_eval_liferay$1ui_icon_13 = _jspx_th_liferay$1ui_icon_13.doStartTag();
    if (_jspx_th_liferay$1ui_icon_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_13);
      _jspx_th_liferay$1ui_icon_13.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_13);
    _jspx_th_liferay$1ui_icon_13.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_23(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_23 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_23.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_23.setParent(null);
    _jspx_th_liferay$1ui_message_23.setKey("websites");
    int _jspx_eval_liferay$1ui_message_23 = _jspx_th_liferay$1ui_message_23.doStartTag();
    if (_jspx_th_liferay$1ui_message_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_23);
      _jspx_th_liferay$1ui_message_23.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_23);
    _jspx_th_liferay$1ui_message_23.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_icon_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:icon
    com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_14 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
    _jspx_th_liferay$1ui_icon_14.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_icon_14.setParent(null);
    _jspx_th_liferay$1ui_icon_14.setIcon("plus");
    _jspx_th_liferay$1ui_icon_14.setMarkupView("lexicon");
    int _jspx_eval_liferay$1ui_icon_14 = _jspx_th_liferay$1ui_icon_14.doStartTag();
    if (_jspx_th_liferay$1ui_icon_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_14);
      _jspx_th_liferay$1ui_icon_14.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_14);
    _jspx_th_liferay$1ui_icon_14.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_24(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_24 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_24.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_24.setParent(null);
    _jspx_th_liferay$1ui_message_24.setKey("social-network");
    int _jspx_eval_liferay$1ui_message_24 = _jspx_th_liferay$1ui_message_24.doStartTag();
    if (_jspx_th_liferay$1ui_message_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_24);
      _jspx_th_liferay$1ui_message_24.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_24);
    _jspx_th_liferay$1ui_message_24.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_icon_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:icon
    com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_15 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
    _jspx_th_liferay$1ui_icon_15.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_icon_15.setParent(null);
    _jspx_th_liferay$1ui_icon_15.setIcon("pencil");
    _jspx_th_liferay$1ui_icon_15.setMarkupView("lexicon");
    int _jspx_eval_liferay$1ui_icon_15 = _jspx_th_liferay$1ui_icon_15.doStartTag();
    if (_jspx_th_liferay$1ui_icon_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_15);
      _jspx_th_liferay$1ui_icon_15.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_15);
    _jspx_th_liferay$1ui_icon_15.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_25(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_25 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_25.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_25.setParent(null);
    _jspx_th_liferay$1ui_message_25.setKey("sms");
    int _jspx_eval_liferay$1ui_message_25 = _jspx_th_liferay$1ui_message_25.doStartTag();
    if (_jspx_th_liferay$1ui_message_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_25);
      _jspx_th_liferay$1ui_message_25.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_25);
    _jspx_th_liferay$1ui_message_25.release();
    return false;
  }
}
