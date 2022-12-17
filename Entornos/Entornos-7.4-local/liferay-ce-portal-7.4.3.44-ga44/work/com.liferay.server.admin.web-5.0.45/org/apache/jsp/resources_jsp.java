package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFileVersion;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.model.ExpandoColumnConstants;
import com.liferay.frontend.taglib.clay.servlet.taglib.util.CreationMenu;
import com.liferay.petra.string.CharPool;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.convert.ConvertProcess;
import com.liferay.portal.convert.ConvertProcessUtil;
import com.liferay.portal.convert.documentlibrary.FileSystemStoreRootDirException;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.image.ImageMagickUtil;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.model.*;
import com.liferay.portal.kernel.model.impl.*;
import com.liferay.portal.kernel.patcher.PatcherUtil;
import com.liferay.portal.kernel.portlet.PortletURLUtil;
import com.liferay.portal.kernel.portlet.url.builder.PortletURLBuilder;
import com.liferay.portal.kernel.scripting.ScriptingException;
import com.liferay.portal.kernel.scripting.ScriptingUtil;
import com.liferay.portal.kernel.service.*;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ReleaseInfo;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.TextFormatter;
import com.liferay.portal.kernel.util.Time;
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.log4j.Log4JUtil;
import com.liferay.portal.model.impl.*;
import com.liferay.portal.util.PrefsPropsUtil;
import com.liferay.portal.util.ShutdownUtil;
import com.liferay.server.admin.web.internal.constants.ImageMagickResourceLimitConstants;
import com.liferay.server.admin.web.internal.constants.ServerAdminNavigationEntryConstants;
import com.liferay.server.admin.web.internal.display.context.ServerDisplayContext;
import com.liferay.server.admin.web.internal.display.context.ViewPortalPropertiesDisplayContext;
import com.liferay.server.admin.web.internal.display.context.ViewSystemPropertiesDisplayContext;
import com.liferay.taglib.servlet.PipingServletResponseFactory;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.TreeMap;
import java.util.function.Function;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletURL;
import org.apache.logging.log4j.Level;

public final class resources_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


private static final String[] _ALL_PRIORITIES = {String.valueOf(Level.OFF), String.valueOf(Level.FATAL), String.valueOf(Level.ERROR), String.valueOf(Level.WARN), String.valueOf(Level.INFO), String.valueOf(Level.DEBUG), String.valueOf(Level.TRACE), String.valueOf(Level.ALL)};

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

String tabs1 = ParamUtil.getString(request, "tabs1", "resources");
String tabs2 = ParamUtil.getString(request, "tabs2");

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');

String[] installedPatches = PatcherUtil.getInstalledPatches();

Date modifiedDate = PortalUtil.getUptime();

long uptimeDiff = System.currentTimeMillis() - modifiedDate.getTime();

long days = uptimeDiff / Time.DAY;
long hours = (uptimeDiff / Time.HOUR) % 24;
long minutes = (uptimeDiff / Time.MINUTE) % 60;
long seconds = (uptimeDiff / Time.SECOND) % 60;

Runtime runtime = Runtime.getRuntime();

long totalMemory = runtime.totalMemory();

long usedMemory = totalMemory - runtime.freeMemory();

      out.write('\n');
      out.write('\n');
      //  aui:fieldset-group
      com.liferay.taglib.aui.FieldsetGroupTag _jspx_th_aui_fieldset$1group_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FieldsetGroupTag.class) : new com.liferay.taglib.aui.FieldsetGroupTag();
      _jspx_th_aui_fieldset$1group_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_fieldset$1group_0.setParent(null);
      _jspx_th_aui_fieldset$1group_0.setMarkupView("lexicon");
      int _jspx_eval_aui_fieldset$1group_0 = _jspx_th_aui_fieldset$1group_0.doStartTag();
      if (_jspx_eval_aui_fieldset$1group_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write('\n');
        out.write('	');
        //  aui:fieldset
        com.liferay.taglib.aui.FieldsetTag _jspx_th_aui_fieldset_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FieldsetTag.class) : new com.liferay.taglib.aui.FieldsetTag();
        _jspx_th_aui_fieldset_0.setPageContext(_jspx_page_context);
        _jspx_th_aui_fieldset_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset$1group_0);
        int _jspx_eval_aui_fieldset_0 = _jspx_th_aui_fieldset_0.doStartTag();
        if (_jspx_eval_aui_fieldset_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t<div class=\"alert alert-info\">\n");
          out.write("\t\t\t<strong>");
          if (_jspx_meth_liferay$1ui_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_0, _jspx_page_context))
            return;
          out.write("</strong>: ");
          out.print( ReleaseInfo.getReleaseInfo() );
          out.write("\n");
          out.write("\t\t\t");
if (
 (installedPatches != null) && (installedPatches.length > 0) ) {
          out.write("\n");
          out.write("\t\t\t\t<strong>");
          if (_jspx_meth_liferay$1ui_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_0, _jspx_page_context))
            return;
          out.write("</strong>: ");
          out.print( StringUtil.merge(installedPatches, StringPool.COMMA_AND_SPACE) );
          out.write("\n");
          out.write("\t\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t<strong>");
          if (_jspx_meth_liferay$1ui_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_0, _jspx_page_context))
            return;
          out.write("</strong>:\n");
          out.write("\n");
          out.write("\t\t\t");
if (
 days > 0 ) {
          out.write("\n");
          out.write("\t\t\t\t");
          out.print( days );
          out.write(' ');
          //  liferay-ui:message
          com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
          _jspx_th_liferay$1ui_message_3.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
          _jspx_th_liferay$1ui_message_3.setKey( (days > 1) ? "days" : "day" );
          int _jspx_eval_liferay$1ui_message_3 = _jspx_th_liferay$1ui_message_3.doStartTag();
          if (_jspx_th_liferay$1ui_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_3);
            _jspx_th_liferay$1ui_message_3.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_3);
          _jspx_th_liferay$1ui_message_3.release();
          out.write(",\n");
          out.write("\t\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t");

			NumberFormat timeNumberFormat = NumberFormat.getInstance();

			timeNumberFormat.setMaximumIntegerDigits(2);
			timeNumberFormat.setMinimumIntegerDigits(2);
			
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t");
          out.print( timeNumberFormat.format(hours) );
          out.write(':');
          out.print( timeNumberFormat.format(minutes) );
          out.write(':');
          out.print( timeNumberFormat.format(seconds) );
          out.write("\n");
          out.write("\t\t</div>\n");
          out.write("\n");
          out.write("\t\t<div class=\"meter-wrapper text-center\">\n");
          out.write("\t\t\t");
          //  portlet:resourceURL
          com.liferay.taglib.portlet.ResourceURLTag _jspx_th_portlet_resourceURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ResourceURLTag.class) : new com.liferay.taglib.portlet.ResourceURLTag();
          _jspx_th_portlet_resourceURL_0.setPageContext(_jspx_page_context);
          _jspx_th_portlet_resourceURL_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
          _jspx_th_portlet_resourceURL_0.setId("/server_admin/view_chart");
          _jspx_th_portlet_resourceURL_0.setVar("totalMemoryChartURL");
          int _jspx_eval_portlet_resourceURL_0 = _jspx_th_portlet_resourceURL_0.doStartTag();
          if (_jspx_eval_portlet_resourceURL_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t\t");
            if (_jspx_meth_portlet_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_portlet_resourceURL_0, _jspx_page_context))
              return;
            out.write("\n");
            out.write("\t\t\t\t");
            //  portlet:param
            com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
            _jspx_th_portlet_param_1.setPageContext(_jspx_page_context);
            _jspx_th_portlet_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_resourceURL_0);
            _jspx_th_portlet_param_1.setName("totalMemory");
            _jspx_th_portlet_param_1.setValue( String.valueOf(totalMemory) );
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
            _jspx_th_portlet_param_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_resourceURL_0);
            _jspx_th_portlet_param_2.setName("usedMemory");
            _jspx_th_portlet_param_2.setValue( String.valueOf(usedMemory) );
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
          if (_jspx_th_portlet_resourceURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_resourceURL_0);
            _jspx_th_portlet_resourceURL_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_resourceURL_0);
          _jspx_th_portlet_resourceURL_0.release();
          java.lang.String totalMemoryChartURL = null;
          totalMemoryChartURL = (java.lang.String) _jspx_page_context.findAttribute("totalMemoryChartURL");
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t<img alt=\"");
          //  liferay-ui:message
          com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
          _jspx_th_liferay$1ui_message_4.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
          _jspx_th_liferay$1ui_message_4.setEscapeAttribute( true );
          _jspx_th_liferay$1ui_message_4.setKey("memory-used-vs-total-memory");
          int _jspx_eval_liferay$1ui_message_4 = _jspx_th_liferay$1ui_message_4.doStartTag();
          if (_jspx_th_liferay$1ui_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_4);
            _jspx_th_liferay$1ui_message_4.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_4);
          _jspx_th_liferay$1ui_message_4.release();
          out.write("\" src=\"");
          out.print( totalMemoryChartURL );
          out.write("\" />\n");
          out.write("\n");
          out.write("\t\t\t");
          //  portlet:resourceURL
          com.liferay.taglib.portlet.ResourceURLTag _jspx_th_portlet_resourceURL_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ResourceURLTag.class) : new com.liferay.taglib.portlet.ResourceURLTag();
          _jspx_th_portlet_resourceURL_1.setPageContext(_jspx_page_context);
          _jspx_th_portlet_resourceURL_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
          _jspx_th_portlet_resourceURL_1.setId("/server_admin/view_chart");
          _jspx_th_portlet_resourceURL_1.setVar("maxMemoryChartURL");
          int _jspx_eval_portlet_resourceURL_1 = _jspx_th_portlet_resourceURL_1.doStartTag();
          if (_jspx_eval_portlet_resourceURL_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t\t");
            if (_jspx_meth_portlet_param_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_portlet_resourceURL_1, _jspx_page_context))
              return;
            out.write("\n");
            out.write("\t\t\t\t");
            //  portlet:param
            com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
            _jspx_th_portlet_param_4.setPageContext(_jspx_page_context);
            _jspx_th_portlet_param_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_resourceURL_1);
            _jspx_th_portlet_param_4.setName("maxMemory");
            _jspx_th_portlet_param_4.setValue( String.valueOf(runtime.maxMemory()) );
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
            _jspx_th_portlet_param_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_resourceURL_1);
            _jspx_th_portlet_param_5.setName("usedMemory");
            _jspx_th_portlet_param_5.setValue( String.valueOf(usedMemory) );
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
          if (_jspx_th_portlet_resourceURL_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_resourceURL_1);
            _jspx_th_portlet_resourceURL_1.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_resourceURL_1);
          _jspx_th_portlet_resourceURL_1.release();
          java.lang.String maxMemoryChartURL = null;
          maxMemoryChartURL = (java.lang.String) _jspx_page_context.findAttribute("maxMemoryChartURL");
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t<img alt=\"");
          //  liferay-ui:message
          com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
          _jspx_th_liferay$1ui_message_5.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
          _jspx_th_liferay$1ui_message_5.setEscapeAttribute( true );
          _jspx_th_liferay$1ui_message_5.setKey("memory-used-vs-max-memory");
          int _jspx_eval_liferay$1ui_message_5 = _jspx_th_liferay$1ui_message_5.doStartTag();
          if (_jspx_th_liferay$1ui_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_5);
            _jspx_th_liferay$1ui_message_5.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_5);
          _jspx_th_liferay$1ui_message_5.release();
          out.write("\" src=\"");
          out.print( maxMemoryChartURL );
          out.write("\" />\n");
          out.write("\t\t</div>\n");
          out.write("\n");
          out.write("\t\t<br />\n");
          out.write("\n");
          out.write("\t\t");

		NumberFormat basicNumberFormat = NumberFormat.getInstance(locale);
		
          out.write("\n");
          out.write("\n");
          out.write("\t\t<table class=\"lfr-table memory-status-table\">\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t<span class=\"font-weight-semi-bold\">");
          if (_jspx_meth_liferay$1ui_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_0, _jspx_page_context))
            return;
          out.write("</span>\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t<span class=\"text-muted\">");
          out.print( basicNumberFormat.format(usedMemory) );
          out.write(' ');
          if (_jspx_meth_liferay$1ui_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_0, _jspx_page_context))
            return;
          out.write("</span>\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t<span class=\"font-weight-semi-bold\">");
          if (_jspx_meth_liferay$1ui_message_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_0, _jspx_page_context))
            return;
          out.write("</span>\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t<span class=\"text-muted\">");
          out.print( basicNumberFormat.format(runtime.totalMemory()) );
          out.write(' ');
          if (_jspx_meth_liferay$1ui_message_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_0, _jspx_page_context))
            return;
          out.write("</span>\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t<span class=\"font-weight-semi-bold\">");
          if (_jspx_meth_liferay$1ui_message_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_0, _jspx_page_context))
            return;
          out.write("</span>\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t<span class=\"text-muted\">");
          out.print( basicNumberFormat.format(runtime.maxMemory()) );
          out.write(' ');
          if (_jspx_meth_liferay$1ui_message_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_0, _jspx_page_context))
            return;
          out.write("</span>\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t</table>\n");
          out.write("\t");
        }
        if (_jspx_th_aui_fieldset_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset_0);
          _jspx_th_aui_fieldset_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset_0);
        _jspx_th_aui_fieldset_0.release();
        out.write("\n");
        out.write("\n");
        out.write("\t");
        //  aui:fieldset
        com.liferay.taglib.aui.FieldsetTag _jspx_th_aui_fieldset_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FieldsetTag.class) : new com.liferay.taglib.aui.FieldsetTag();
        _jspx_th_aui_fieldset_1.setPageContext(_jspx_page_context);
        _jspx_th_aui_fieldset_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset$1group_0);
        _jspx_th_aui_fieldset_1.setCollapsed( false );
        _jspx_th_aui_fieldset_1.setCollapsible( true );
        _jspx_th_aui_fieldset_1.setLabel("system-actions");
        int _jspx_eval_aui_fieldset_1 = _jspx_th_aui_fieldset_1.doStartTag();
        if (_jspx_eval_aui_fieldset_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t<ul class=\"list-group system-action-group\">\n");
          out.write("\t\t\t<li class=\"list-group-item list-group-item-flex\">\n");
          out.write("\t\t\t\t<div class=\"autofit-col autofit-col-expand\">\n");
          out.write("\t\t\t\t\t<p class=\"list-group-title text-truncate\">\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_1, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t</p>\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\n");
          out.write("\t\t\t\t<div class=\"autofit-col\">\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_aui_button_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_1, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\t\t\t</li>\n");
          out.write("\t\t\t<li class=\"list-group-item list-group-item-flex\">\n");
          out.write("\t\t\t\t<div class=\"autofit-col autofit-col-expand\">\n");
          out.write("\t\t\t\t\t<p class=\"list-group-title text-truncate\">\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_1, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t</p>\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\n");
          out.write("\t\t\t\t<div class=\"autofit-col\">\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_aui_button_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_1, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\t\t\t</li>\n");
          out.write("\t\t</ul>\n");
          out.write("\t");
        }
        if (_jspx_th_aui_fieldset_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset_1);
          _jspx_th_aui_fieldset_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset_1);
        _jspx_th_aui_fieldset_1.release();
        out.write("\n");
        out.write("\n");
        out.write("\t");
        //  aui:fieldset
        com.liferay.taglib.aui.FieldsetTag _jspx_th_aui_fieldset_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FieldsetTag.class) : new com.liferay.taglib.aui.FieldsetTag();
        _jspx_th_aui_fieldset_2.setPageContext(_jspx_page_context);
        _jspx_th_aui_fieldset_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset$1group_0);
        _jspx_th_aui_fieldset_2.setCollapsed( false );
        _jspx_th_aui_fieldset_2.setCollapsible( true );
        _jspx_th_aui_fieldset_2.setLabel("cache-actions");
        int _jspx_eval_aui_fieldset_2 = _jspx_th_aui_fieldset_2.doStartTag();
        if (_jspx_eval_aui_fieldset_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t<ul class=\"list-group system-action-group\">\n");
          out.write("\t\t\t<li class=\"list-group-item list-group-item-flex\">\n");
          out.write("\t\t\t\t<div class=\"autofit-col autofit-col-expand\">\n");
          out.write("\t\t\t\t\t<p class=\"list-group-title text-truncate\">\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_2, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t</p>\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\n");
          out.write("\t\t\t\t<div class=\"autofit-col\">\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_aui_button_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_2, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\t\t\t</li>\n");
          out.write("\t\t\t<li class=\"list-group-item list-group-item-flex\">\n");
          out.write("\t\t\t\t<div class=\"autofit-col autofit-col-expand\">\n");
          out.write("\t\t\t\t\t<p class=\"list-group-title text-truncate\">\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_2, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t</p>\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\n");
          out.write("\t\t\t\t<div class=\"autofit-col\">\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_aui_button_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_2, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\t\t\t</li>\n");
          out.write("\t\t\t<li class=\"list-group-item list-group-item-flex\">\n");
          out.write("\t\t\t\t<div class=\"autofit-col autofit-col-expand\">\n");
          out.write("\t\t\t\t\t<p class=\"list-group-title text-truncate\">\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_2, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t</p>\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\n");
          out.write("\t\t\t\t<div class=\"autofit-col\">\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_aui_button_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_2, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\t\t\t</li>\n");
          out.write("\t\t\t<li class=\"list-group-item list-group-item-flex\">\n");
          out.write("\t\t\t\t<div class=\"autofit-col autofit-col-expand\">\n");
          out.write("\t\t\t\t\t<p class=\"list-group-title text-truncate\">\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_2, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t</p>\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\n");
          out.write("\t\t\t\t<div class=\"autofit-col\">\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_aui_button_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_2, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\t\t\t</li>\n");
          out.write("\t\t</ul>\n");
          out.write("\t");
        }
        if (_jspx_th_aui_fieldset_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset_2);
          _jspx_th_aui_fieldset_2.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset_2);
        _jspx_th_aui_fieldset_2.release();
        out.write("\n");
        out.write("\n");
        out.write("\t");
        //  aui:fieldset
        com.liferay.taglib.aui.FieldsetTag _jspx_th_aui_fieldset_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FieldsetTag.class) : new com.liferay.taglib.aui.FieldsetTag();
        _jspx_th_aui_fieldset_3.setPageContext(_jspx_page_context);
        _jspx_th_aui_fieldset_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset$1group_0);
        _jspx_th_aui_fieldset_3.setCollapsed( false );
        _jspx_th_aui_fieldset_3.setCollapsible( true );
        _jspx_th_aui_fieldset_3.setLabel("verification-actions");
        int _jspx_eval_aui_fieldset_3 = _jspx_th_aui_fieldset_3.doStartTag();
        if (_jspx_eval_aui_fieldset_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t<ul class=\"list-group system-action-group\">\n");
          out.write("\t\t\t<li class=\"list-group-item list-group-item-flex\">\n");
          out.write("\t\t\t\t<div class=\"autofit-col autofit-col-expand\">\n");
          out.write("\t\t\t\t\t<p class=\"list-group-title text-truncate\">\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_3, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t</p>\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\n");
          out.write("\t\t\t\t<div class=\"autofit-col\">\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_aui_button_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_3, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\t\t\t</li>\n");
          out.write("\t\t\t<li class=\"list-group-item list-group-item-flex\">\n");
          out.write("\t\t\t\t<div class=\"autofit-col autofit-col-expand\">\n");
          out.write("\t\t\t\t\t<p class=\"list-group-title text-truncate\">\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_3, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t</p>\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\n");
          out.write("\t\t\t\t<div class=\"autofit-col\">\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_aui_button_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_3, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\t\t\t</li>\n");
          out.write("\t\t</ul>\n");
          out.write("\t");
        }
        if (_jspx_th_aui_fieldset_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset_3);
          _jspx_th_aui_fieldset_3.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset_3);
        _jspx_th_aui_fieldset_3.release();
        out.write("\n");
        out.write("\n");
        out.write("\t");
        //  aui:fieldset
        com.liferay.taglib.aui.FieldsetTag _jspx_th_aui_fieldset_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FieldsetTag.class) : new com.liferay.taglib.aui.FieldsetTag();
        _jspx_th_aui_fieldset_4.setPageContext(_jspx_page_context);
        _jspx_th_aui_fieldset_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset$1group_0);
        _jspx_th_aui_fieldset_4.setCollapsed( false );
        _jspx_th_aui_fieldset_4.setCollapsible( true );
        _jspx_th_aui_fieldset_4.setLabel("clean-up-actions");
        int _jspx_eval_aui_fieldset_4 = _jspx_th_aui_fieldset_4.doStartTag();
        if (_jspx_eval_aui_fieldset_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t<ul class=\"list-group system-action-group\">\n");
          out.write("\t\t\t<li class=\"list-group-item list-group-item-flex\">\n");
          out.write("\t\t\t\t<div class=\"autofit-col autofit-col-expand\">\n");
          out.write("\t\t\t\t\t<p class=\"list-group-title text-truncate\">\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_4, _jspx_page_context))
            return;
          out.write(' ');
          if (_jspx_meth_liferay$1ui_icon$1help_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_4, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t</p>\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\n");
          out.write("\t\t\t\t<div class=\"autofit-col\">\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_aui_button_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_4, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\t\t\t</li>\n");
          out.write("\t\t\t<li class=\"list-group-item list-group-item-flex\">\n");
          out.write("\t\t\t\t<div class=\"autofit-col autofit-col-expand\">\n");
          out.write("\t\t\t\t\t<p class=\"list-group-title text-truncate\">\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_4, _jspx_page_context))
            return;
          out.write(' ');
          if (_jspx_meth_liferay$1ui_icon$1help_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_4, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t</p>\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\n");
          out.write("\t\t\t\t<div class=\"autofit-col\">\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_aui_button_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_4, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\t\t\t</li>\n");
          out.write("\t\t\t<li class=\"list-group-item list-group-item-flex\">\n");
          out.write("\t\t\t\t<div class=\"autofit-col autofit-col-expand\">\n");
          out.write("\t\t\t\t\t<p class=\"list-group-title text-truncate\">\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_4, _jspx_page_context))
            return;
          out.write(' ');
          if (_jspx_meth_liferay$1ui_icon$1help_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_4, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t</p>\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\n");
          out.write("\t\t\t\t<div class=\"autofit-col\">\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_aui_button_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_4, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\t\t\t</li>\n");
          out.write("\t\t\t<li class=\"list-group-item list-group-item-flex\">\n");
          out.write("\t\t\t\t<div class=\"autofit-col autofit-col-expand\">\n");
          out.write("\t\t\t\t\t<p class=\"list-group-title text-truncate\">\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_4, _jspx_page_context))
            return;
          out.write(' ');
          if (_jspx_meth_liferay$1ui_icon$1help_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_4, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t</p>\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\n");
          out.write("\t\t\t\t<div class=\"autofit-col\">\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_aui_button_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_4, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\t\t\t</li>\n");
          out.write("\t\t</ul>\n");
          out.write("\t");
        }
        if (_jspx_th_aui_fieldset_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset_4);
          _jspx_th_aui_fieldset_4.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset_4);
        _jspx_th_aui_fieldset_4.release();
        out.write('\n');
      }
      if (_jspx_th_aui_fieldset$1group_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset$1group_0);
        _jspx_th_aui_fieldset$1group_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset$1group_0);
      _jspx_th_aui_fieldset$1group_0.release();
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

  private boolean _jspx_meth_liferay$1ui_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
    _jspx_th_liferay$1ui_message_0.setKey("info");
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

  private boolean _jspx_meth_liferay$1ui_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
    _jspx_th_liferay$1ui_message_1.setKey("patch");
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

  private boolean _jspx_meth_liferay$1ui_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_2.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
    _jspx_th_liferay$1ui_message_2.setKey("uptime");
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

  private boolean _jspx_meth_portlet_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_portlet_resourceURL_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:param
    com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
    _jspx_th_portlet_param_0.setPageContext(_jspx_page_context);
    _jspx_th_portlet_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_resourceURL_0);
    _jspx_th_portlet_param_0.setName("type");
    _jspx_th_portlet_param_0.setValue("total");
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

  private boolean _jspx_meth_portlet_param_3(javax.servlet.jsp.tagext.JspTag _jspx_th_portlet_resourceURL_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:param
    com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
    _jspx_th_portlet_param_3.setPageContext(_jspx_page_context);
    _jspx_th_portlet_param_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_resourceURL_1);
    _jspx_th_portlet_param_3.setName("type");
    _jspx_th_portlet_param_3.setValue("max");
    int _jspx_eval_portlet_param_3 = _jspx_th_portlet_param_3.doStartTag();
    if (_jspx_th_portlet_param_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_3);
      _jspx_th_portlet_param_3.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_3);
    _jspx_th_portlet_param_3.release();
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
    _jspx_th_liferay$1ui_message_6.setKey("used-memory");
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

  private boolean _jspx_meth_liferay$1ui_message_7(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_7.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
    _jspx_th_liferay$1ui_message_7.setKey("bytes");
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

  private boolean _jspx_meth_liferay$1ui_message_8(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_8.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
    _jspx_th_liferay$1ui_message_8.setKey("total-memory");
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

  private boolean _jspx_meth_liferay$1ui_message_9(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_9.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
    _jspx_th_liferay$1ui_message_9.setKey("bytes");
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

  private boolean _jspx_meth_liferay$1ui_message_10(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_10.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
    _jspx_th_liferay$1ui_message_10.setKey("maximum-memory");
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

  private boolean _jspx_meth_liferay$1ui_message_11(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_11.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
    _jspx_th_liferay$1ui_message_11.setKey("bytes");
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

  private boolean _jspx_meth_liferay$1ui_message_12(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_12 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_12.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_1);
    _jspx_th_liferay$1ui_message_12.setKey("run-the-garbage-collector-to-free-up-memory");
    int _jspx_eval_liferay$1ui_message_12 = _jspx_th_liferay$1ui_message_12.doStartTag();
    if (_jspx_th_liferay$1ui_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_12);
      _jspx_th_liferay$1ui_message_12.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_12);
    _jspx_th_liferay$1ui_message_12.release();
    return false;
  }

  private boolean _jspx_meth_aui_button_0(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:button
    com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
    _jspx_th_aui_button_0.setPageContext(_jspx_page_context);
    _jspx_th_aui_button_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_1);
    _jspx_th_aui_button_0.setCssClass("save-server-button");
    _jspx_th_aui_button_0.setDynamicAttribute(null, "data-cmd", new String("gc"));
    _jspx_th_aui_button_0.setValue("execute");
    int _jspx_eval_aui_button_0 = _jspx_th_aui_button_0.doStartTag();
    if (_jspx_th_aui_button_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_0);
      _jspx_th_aui_button_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_0);
    _jspx_th_aui_button_0.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_13(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_13 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_13.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_1);
    _jspx_th_liferay$1ui_message_13.setKey("generate-thread-dump");
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

  private boolean _jspx_meth_aui_button_1(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:button
    com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
    _jspx_th_aui_button_1.setPageContext(_jspx_page_context);
    _jspx_th_aui_button_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_1);
    _jspx_th_aui_button_1.setCssClass("save-server-button");
    _jspx_th_aui_button_1.setDynamicAttribute(null, "data-cmd", new String("threadDump"));
    _jspx_th_aui_button_1.setValue("execute");
    int _jspx_eval_aui_button_1 = _jspx_th_aui_button_1.doStartTag();
    if (_jspx_th_aui_button_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_1);
      _jspx_th_aui_button_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_1);
    _jspx_th_aui_button_1.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_14(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_14 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_14.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_2);
    _jspx_th_liferay$1ui_message_14.setKey("clear-content-cached-by-this-vm");
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

  private boolean _jspx_meth_aui_button_2(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:button
    com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
    _jspx_th_aui_button_2.setPageContext(_jspx_page_context);
    _jspx_th_aui_button_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_2);
    _jspx_th_aui_button_2.setCssClass("save-server-button");
    _jspx_th_aui_button_2.setDynamicAttribute(null, "data-cmd", new String("cacheSingle"));
    _jspx_th_aui_button_2.setValue("execute");
    int _jspx_eval_aui_button_2 = _jspx_th_aui_button_2.doStartTag();
    if (_jspx_th_aui_button_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_2);
      _jspx_th_aui_button_2.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_2);
    _jspx_th_aui_button_2.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_15(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_15 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_15.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_2);
    _jspx_th_liferay$1ui_message_15.setKey("clear-content-cached-across-the-cluster");
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

  private boolean _jspx_meth_aui_button_3(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:button
    com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
    _jspx_th_aui_button_3.setPageContext(_jspx_page_context);
    _jspx_th_aui_button_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_2);
    _jspx_th_aui_button_3.setCssClass("save-server-button");
    _jspx_th_aui_button_3.setDynamicAttribute(null, "data-cmd", new String("cacheMulti"));
    _jspx_th_aui_button_3.setValue("execute");
    int _jspx_eval_aui_button_3 = _jspx_th_aui_button_3.doStartTag();
    if (_jspx_th_aui_button_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_3);
      _jspx_th_aui_button_3.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_3);
    _jspx_th_aui_button_3.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_16(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_16 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_16.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_2);
    _jspx_th_liferay$1ui_message_16.setKey("clear-the-database-cache");
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

  private boolean _jspx_meth_aui_button_4(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:button
    com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
    _jspx_th_aui_button_4.setPageContext(_jspx_page_context);
    _jspx_th_aui_button_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_2);
    _jspx_th_aui_button_4.setCssClass("save-server-button");
    _jspx_th_aui_button_4.setDynamicAttribute(null, "data-cmd", new String("cacheDb"));
    _jspx_th_aui_button_4.setValue("execute");
    int _jspx_eval_aui_button_4 = _jspx_th_aui_button_4.doStartTag();
    if (_jspx_th_aui_button_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_4);
      _jspx_th_aui_button_4.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_4);
    _jspx_th_aui_button_4.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_17(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_17 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_17.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_2);
    _jspx_th_liferay$1ui_message_17.setKey("clear-the-direct-servlet-cache");
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

  private boolean _jspx_meth_aui_button_5(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:button
    com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
    _jspx_th_aui_button_5.setPageContext(_jspx_page_context);
    _jspx_th_aui_button_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_2);
    _jspx_th_aui_button_5.setCssClass("save-server-button");
    _jspx_th_aui_button_5.setDynamicAttribute(null, "data-cmd", new String("cacheServlet"));
    _jspx_th_aui_button_5.setValue("execute");
    int _jspx_eval_aui_button_5 = _jspx_th_aui_button_5.doStartTag();
    if (_jspx_th_aui_button_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_5);
      _jspx_th_aui_button_5.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_5);
    _jspx_th_aui_button_5.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_18(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_18 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_18.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_3);
    _jspx_th_liferay$1ui_message_18.setKey("verify-database-tables-of-all-plugins");
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

  private boolean _jspx_meth_aui_button_6(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:button
    com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
    _jspx_th_aui_button_6.setPageContext(_jspx_page_context);
    _jspx_th_aui_button_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_3);
    _jspx_th_aui_button_6.setCssClass("save-server-button");
    _jspx_th_aui_button_6.setDynamicAttribute(null, "data-cmd", new String("verifyPluginTables"));
    _jspx_th_aui_button_6.setValue("execute");
    int _jspx_eval_aui_button_6 = _jspx_th_aui_button_6.doStartTag();
    if (_jspx_th_aui_button_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_6);
      _jspx_th_aui_button_6.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_6);
    _jspx_th_aui_button_6.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_19(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_19 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_19.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_3);
    _jspx_th_liferay$1ui_message_19.setKey("verify-membership-policies");
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

  private boolean _jspx_meth_aui_button_7(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:button
    com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
    _jspx_th_aui_button_7.setPageContext(_jspx_page_context);
    _jspx_th_aui_button_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_3);
    _jspx_th_aui_button_7.setCssClass("save-server-button");
    _jspx_th_aui_button_7.setDynamicAttribute(null, "data-cmd", new String("verifyMembershipPolicies"));
    _jspx_th_aui_button_7.setValue("execute");
    int _jspx_eval_aui_button_7 = _jspx_th_aui_button_7.doStartTag();
    if (_jspx_th_aui_button_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_7);
      _jspx_th_aui_button_7.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_7);
    _jspx_th_aui_button_7.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_20(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_20 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_20.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_4);
    _jspx_th_liferay$1ui_message_20.setKey("reset-preview-and-thumbnail-files-for-documents-and-media");
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

  private boolean _jspx_meth_liferay$1ui_icon$1help_0(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:icon-help
    com.liferay.taglib.ui.IconHelpTag _jspx_th_liferay$1ui_icon$1help_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconHelpTag.class) : new com.liferay.taglib.ui.IconHelpTag();
    _jspx_th_liferay$1ui_icon$1help_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_icon$1help_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_4);
    _jspx_th_liferay$1ui_icon$1help_0.setMessage("reset-preview-and-thumbnail-files-for-documents-and-media-help");
    int _jspx_eval_liferay$1ui_icon$1help_0 = _jspx_th_liferay$1ui_icon$1help_0.doStartTag();
    if (_jspx_th_liferay$1ui_icon$1help_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon$1help_0);
      _jspx_th_liferay$1ui_icon$1help_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon$1help_0);
    _jspx_th_liferay$1ui_icon$1help_0.release();
    return false;
  }

  private boolean _jspx_meth_aui_button_8(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:button
    com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
    _jspx_th_aui_button_8.setPageContext(_jspx_page_context);
    _jspx_th_aui_button_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_4);
    _jspx_th_aui_button_8.setCssClass("save-server-button");
    _jspx_th_aui_button_8.setDynamicAttribute(null, "data-cmd", new String("dlPreviews"));
    _jspx_th_aui_button_8.setValue("execute");
    int _jspx_eval_aui_button_8 = _jspx_th_aui_button_8.doStartTag();
    if (_jspx_th_aui_button_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_8);
      _jspx_th_aui_button_8.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_8);
    _jspx_th_aui_button_8.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_21(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_21 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_21.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_4);
    _jspx_th_liferay$1ui_message_21.setKey("clean-up-permissions");
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

  private boolean _jspx_meth_liferay$1ui_icon$1help_1(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:icon-help
    com.liferay.taglib.ui.IconHelpTag _jspx_th_liferay$1ui_icon$1help_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconHelpTag.class) : new com.liferay.taglib.ui.IconHelpTag();
    _jspx_th_liferay$1ui_icon$1help_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_icon$1help_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_4);
    _jspx_th_liferay$1ui_icon$1help_1.setMessage("clean-up-permissions-help");
    int _jspx_eval_liferay$1ui_icon$1help_1 = _jspx_th_liferay$1ui_icon$1help_1.doStartTag();
    if (_jspx_th_liferay$1ui_icon$1help_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon$1help_1);
      _jspx_th_liferay$1ui_icon$1help_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon$1help_1);
    _jspx_th_liferay$1ui_icon$1help_1.release();
    return false;
  }

  private boolean _jspx_meth_aui_button_9(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:button
    com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
    _jspx_th_aui_button_9.setPageContext(_jspx_page_context);
    _jspx_th_aui_button_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_4);
    _jspx_th_aui_button_9.setCssClass("save-server-button");
    _jspx_th_aui_button_9.setDynamicAttribute(null, "data-cmd", new String("cleanUpAddToPagePermissions"));
    _jspx_th_aui_button_9.setValue("execute");
    int _jspx_eval_aui_button_9 = _jspx_th_aui_button_9.doStartTag();
    if (_jspx_th_aui_button_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_9);
      _jspx_th_aui_button_9.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_9);
    _jspx_th_aui_button_9.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_22(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_22 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_22.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_4);
    _jspx_th_liferay$1ui_message_22.setKey("clean-up-orphaned-page-revision-portlet-preferences");
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

  private boolean _jspx_meth_liferay$1ui_icon$1help_2(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:icon-help
    com.liferay.taglib.ui.IconHelpTag _jspx_th_liferay$1ui_icon$1help_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconHelpTag.class) : new com.liferay.taglib.ui.IconHelpTag();
    _jspx_th_liferay$1ui_icon$1help_2.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_icon$1help_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_4);
    _jspx_th_liferay$1ui_icon$1help_2.setMessage("clean-up-orphaned-page-revision-portlet-preferences-help");
    int _jspx_eval_liferay$1ui_icon$1help_2 = _jspx_th_liferay$1ui_icon$1help_2.doStartTag();
    if (_jspx_th_liferay$1ui_icon$1help_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon$1help_2);
      _jspx_th_liferay$1ui_icon$1help_2.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon$1help_2);
    _jspx_th_liferay$1ui_icon$1help_2.release();
    return false;
  }

  private boolean _jspx_meth_aui_button_10(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:button
    com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
    _jspx_th_aui_button_10.setPageContext(_jspx_page_context);
    _jspx_th_aui_button_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_4);
    _jspx_th_aui_button_10.setCssClass("save-server-button");
    _jspx_th_aui_button_10.setDynamicAttribute(null, "data-cmd", new String("cleanUpLayoutRevisionPortletPreferences"));
    _jspx_th_aui_button_10.setValue("execute");
    int _jspx_eval_aui_button_10 = _jspx_th_aui_button_10.doStartTag();
    if (_jspx_th_aui_button_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_10);
      _jspx_th_aui_button_10.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_10);
    _jspx_th_aui_button_10.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_23(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_23 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_23.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_4);
    _jspx_th_liferay$1ui_message_23.setKey("clean-up-orphaned-theme-portlet-preferences");
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

  private boolean _jspx_meth_liferay$1ui_icon$1help_3(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:icon-help
    com.liferay.taglib.ui.IconHelpTag _jspx_th_liferay$1ui_icon$1help_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconHelpTag.class) : new com.liferay.taglib.ui.IconHelpTag();
    _jspx_th_liferay$1ui_icon$1help_3.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_icon$1help_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_4);
    _jspx_th_liferay$1ui_icon$1help_3.setMessage("clean-up-orphaned-theme-portlet-preferences-help");
    int _jspx_eval_liferay$1ui_icon$1help_3 = _jspx_th_liferay$1ui_icon$1help_3.doStartTag();
    if (_jspx_th_liferay$1ui_icon$1help_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon$1help_3);
      _jspx_th_liferay$1ui_icon$1help_3.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon$1help_3);
    _jspx_th_liferay$1ui_icon$1help_3.release();
    return false;
  }

  private boolean _jspx_meth_aui_button_11(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:button
    com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
    _jspx_th_aui_button_11.setPageContext(_jspx_page_context);
    _jspx_th_aui_button_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_4);
    _jspx_th_aui_button_11.setCssClass("save-server-button");
    _jspx_th_aui_button_11.setDynamicAttribute(null, "data-cmd", new String("cleanUpOrphanedPortletPreferences"));
    _jspx_th_aui_button_11.setValue("execute");
    int _jspx_eval_aui_button_11 = _jspx_th_aui_button_11.doStartTag();
    if (_jspx_th_aui_button_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_11);
      _jspx_th_aui_button_11.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_11);
    _jspx_th_aui_button_11.release();
    return false;
  }
}
