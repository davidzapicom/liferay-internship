package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.fragment.constants.FragmentActionKeys;
import com.liferay.fragment.contributor.FragmentCollectionContributor;
import com.liferay.fragment.exception.DuplicateFragmentCollectionException;
import com.liferay.fragment.exception.DuplicateFragmentCollectionKeyException;
import com.liferay.fragment.exception.DuplicateFragmentEntryKeyException;
import com.liferay.fragment.exception.FragmentCollectionNameException;
import com.liferay.fragment.exception.InvalidFileException;
import com.liferay.fragment.exception.NoSuchEntryException;
import com.liferay.fragment.exception.RequiredFragmentEntryException;
import com.liferay.fragment.importer.FragmentsImporterResultEntry;
import com.liferay.fragment.model.FragmentCollection;
import com.liferay.fragment.model.FragmentComposition;
import com.liferay.fragment.model.FragmentEntry;
import com.liferay.fragment.renderer.FragmentRendererController;
import com.liferay.fragment.service.FragmentCollectionLocalServiceUtil;
import com.liferay.fragment.web.internal.constants.FragmentWebKeys;
import com.liferay.fragment.web.internal.display.context.ContributedFragmentManagementToolbarDisplayContext;
import com.liferay.fragment.web.internal.display.context.EditFragmentEntryDisplayContext;
import com.liferay.fragment.web.internal.display.context.FragmentCollectionResourcesDisplayContext;
import com.liferay.fragment.web.internal.display.context.FragmentCollectionResourcesManagementToolbarDisplayContext;
import com.liferay.fragment.web.internal.display.context.FragmentCollectionsDisplayContext;
import com.liferay.fragment.web.internal.display.context.FragmentCollectionsManagementToolbarDisplayContext;
import com.liferay.fragment.web.internal.display.context.FragmentDisplayContext;
import com.liferay.fragment.web.internal.display.context.FragmentEntryLinkDisplayContext;
import com.liferay.fragment.web.internal.display.context.FragmentEntryUsageManagementToolbarDisplayContext;
import com.liferay.fragment.web.internal.display.context.FragmentManagementToolbarDisplayContext;
import com.liferay.fragment.web.internal.display.context.FragmentManagementToolbarDisplayContextFactory;
import com.liferay.fragment.web.internal.display.context.GroupFragmentEntryLinkDisplayContext;
import com.liferay.fragment.web.internal.display.context.GroupFragmentEntryUsageManagementToolbarDisplayContext;
import com.liferay.fragment.web.internal.display.context.ImportDisplayContext;
import com.liferay.fragment.web.internal.display.context.RenderFragmentEntryDisplayContext;
import com.liferay.fragment.web.internal.display.context.SelectFragmentCollectionDisplayContext;
import com.liferay.fragment.web.internal.display.context.SelectFragmentCollectionManagementToolbarDisplayContext;
import com.liferay.fragment.web.internal.frontend.taglib.clay.servlet.taglib.ContributedFragmentCompositionVerticalCard;
import com.liferay.fragment.web.internal.frontend.taglib.clay.servlet.taglib.ContributedFragmentEntryVerticalCard;
import com.liferay.fragment.web.internal.frontend.taglib.clay.servlet.taglib.FragmentCollectionNavigationCard;
import com.liferay.fragment.web.internal.frontend.taglib.clay.servlet.taglib.FragmentCollectionResourceVerticalCard;
import com.liferay.fragment.web.internal.frontend.taglib.clay.servlet.taglib.FragmentEntryVerticalCardFactory;
import com.liferay.fragment.web.internal.security.permission.resource.FragmentPermission;
import com.liferay.fragment.web.internal.servlet.taglib.util.FragmentCollectionActionDropdownItemsProvider;
import com.liferay.frontend.taglib.servlet.taglib.util.EmptyResultMessageKeys;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.portlet.url.builder.PortletURLBuilder;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.taglib.search.ResultRow;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-frontend.tld");
    _jspx_dependants.add("/META-INF/resources/react.tld");
    _jspx_dependants.add("/META-INF/liferay-theme.tld");
    _jspx_dependants.add("/META-INF/liferay-ui.tld");
    _jspx_dependants.add("/META-INF/liferay-util.tld");
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

FragmentDisplayContext fragmentDisplayContext = new FragmentDisplayContext(request, renderRequest, renderResponse);

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');

List<FragmentCollection> fragmentCollections = (List<FragmentCollection>)request.getAttribute(FragmentWebKeys.FRAGMENT_COLLECTIONS);
Map<String, List<FragmentCollection>> inheritedFragmentCollections = (Map<String, List<FragmentCollection>>)request.getAttribute(FragmentWebKeys.INHERITED_FRAGMENT_COLLECTIONS);
List<FragmentCollection> systemFragmentCollections = (List<FragmentCollection>)request.getAttribute(FragmentWebKeys.SYSTEM_FRAGMENT_COLLECTIONS);

List<FragmentCollectionContributor> fragmentCollectionContributors = fragmentDisplayContext.getFragmentCollectionContributors(locale);

      out.write('\n');
      out.write('\n');
      //  clay:container-fluid
      com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag _jspx_th_clay_container$1fluid_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag();
      _jspx_th_clay_container$1fluid_0.setPageContext(_jspx_page_context);
      _jspx_th_clay_container$1fluid_0.setParent(null);
      _jspx_th_clay_container$1fluid_0.setCssClass("container-view");
      int _jspx_eval_clay_container$1fluid_0 = _jspx_th_clay_container$1fluid_0.doStartTag();
      if (_jspx_eval_clay_container$1fluid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write('\n');
        out.write('	');
        //  clay:row
        com.liferay.frontend.taglib.clay.servlet.taglib.RowTag _jspx_th_clay_row_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.RowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.RowTag();
        _jspx_th_clay_row_0.setPageContext(_jspx_page_context);
        _jspx_th_clay_row_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_0);
        int _jspx_eval_clay_row_0 = _jspx_th_clay_row_0.doStartTag();
        if (_jspx_eval_clay_row_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t");
          //  clay:col
          com.liferay.frontend.taglib.clay.servlet.taglib.ColTag _jspx_th_clay_col_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ColTag();
          _jspx_th_clay_col_0.setPageContext(_jspx_page_context);
          _jspx_th_clay_col_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_row_0);
          _jspx_th_clay_col_0.setLg("3");
          int _jspx_eval_clay_col_0 = _jspx_th_clay_col_0.doStartTag();
          if (_jspx_eval_clay_col_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t<nav class=\"menubar menubar-transparent menubar-vertical-expand-lg\">\n");
            out.write("\t\t\t\t<ul class=\"nav nav-nested\">\n");
            out.write("\t\t\t\t\t<li class=\"nav-item\">\n");
            out.write("\t\t\t\t\t\t");
            //  portlet:renderURL
            com.liferay.taglib.portlet.RenderURLTag _jspx_th_portlet_renderURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.RenderURLTag.class) : new com.liferay.taglib.portlet.RenderURLTag();
            _jspx_th_portlet_renderURL_0.setPageContext(_jspx_page_context);
            _jspx_th_portlet_renderURL_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
            _jspx_th_portlet_renderURL_0.setVar("editFragmentCollectionURL");
            int _jspx_eval_portlet_renderURL_0 = _jspx_th_portlet_renderURL_0.doStartTag();
            if (_jspx_eval_portlet_renderURL_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              if (_jspx_meth_portlet_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_portlet_renderURL_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  portlet:param
              com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
              _jspx_th_portlet_param_1.setPageContext(_jspx_page_context);
              _jspx_th_portlet_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_renderURL_0);
              _jspx_th_portlet_param_1.setName("redirect");
              _jspx_th_portlet_param_1.setValue( currentURL );
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
            if (_jspx_th_portlet_renderURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_renderURL_0);
              _jspx_th_portlet_renderURL_0.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_renderURL_0);
            _jspx_th_portlet_renderURL_0.release();
            java.lang.String editFragmentCollectionURL = null;
            editFragmentCollectionURL = (java.lang.String) _jspx_page_context.findAttribute("editFragmentCollectionURL");
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t");
if (
 ListUtil.isNotEmpty(fragmentCollections) || ListUtil.isNotEmpty(fragmentCollectionContributors) || MapUtil.isNotEmpty(inheritedFragmentCollections) ) {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t");
            //  clay:content-row
            com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag _jspx_th_clay_content$1row_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag();
            _jspx_th_clay_content$1row_0.setPageContext(_jspx_page_context);
            _jspx_th_clay_content$1row_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
            _jspx_th_clay_content$1row_0.setCssClass("mb-4");
            _jspx_th_clay_content$1row_0.setVerticalAlign("center");
            int _jspx_eval_clay_content$1row_0 = _jspx_th_clay_content$1row_0.doStartTag();
            if (_jspx_eval_clay_content$1row_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t");
              //  clay:content-col
              com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
              _jspx_th_clay_content$1col_0.setPageContext(_jspx_page_context);
              _jspx_th_clay_content$1col_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_0);
              _jspx_th_clay_content$1col_0.setExpand( true );
              int _jspx_eval_clay_content$1col_0 = _jspx_th_clay_content$1col_0.doStartTag();
              if (_jspx_eval_clay_content$1col_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t<strong class=\"text-uppercase\">\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t");
                if (_jspx_meth_liferay$1ui_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_content$1col_0, _jspx_page_context))
                  return;
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t</strong>\n");
                out.write("\t\t\t\t\t\t\t\t\t");
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
              out.write("\t\t\t\t\t\t\t\t\t");
              //  clay:content-col
              com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
              _jspx_th_clay_content$1col_1.setPageContext(_jspx_page_context);
              _jspx_th_clay_content$1col_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_0);
              int _jspx_eval_clay_content$1col_1 = _jspx_th_clay_content$1col_1.doStartTag();
              if (_jspx_eval_clay_content$1col_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"navbar-nav\">\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t<li>\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
if (
 FragmentPermission.contains(permissionChecker, scopeGroupId, FragmentActionKeys.MANAGE_FRAGMENT_ENTRIES) ) {
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
                //  clay:link
                com.liferay.frontend.taglib.clay.servlet.taglib.LinkTag _jspx_th_clay_link_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.LinkTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.LinkTag();
                _jspx_th_clay_link_0.setPageContext(_jspx_page_context);
                _jspx_th_clay_link_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_1);
                _jspx_th_clay_link_0.setBorderless( true );
                _jspx_th_clay_link_0.setCssClass("component-action");
                _jspx_th_clay_link_0.setHref( editFragmentCollectionURL );
                _jspx_th_clay_link_0.setIcon("plus");
                _jspx_th_clay_link_0.setType("button");
                int _jspx_eval_clay_link_0 = _jspx_th_clay_link_0.doStartTag();
                if (_jspx_th_clay_link_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_link_0);
                  _jspx_th_clay_link_0.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_link_0);
                _jspx_th_clay_link_0.release();
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
}
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t</li>\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t<li>\n");
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t");

												Map<String, Object> fragmentCollectionsViewContext = fragmentDisplayContext.getFragmentCollectionsViewContext();
												
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                //  clay:dropdown-actions
                com.liferay.frontend.taglib.clay.servlet.taglib.DropdownActionsTag _jspx_th_clay_dropdown$1actions_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.DropdownActionsTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.DropdownActionsTag();
                _jspx_th_clay_dropdown$1actions_0.setPageContext(_jspx_page_context);
                _jspx_th_clay_dropdown$1actions_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_1);
                _jspx_th_clay_dropdown$1actions_0.setAdditionalProps(
														HashMapBuilder.<String, Object>put(
															"deleteFragmentCollectionURL", fragmentCollectionsViewContext.get("deleteFragmentCollectionURL")
														).put(
															"exportFragmentCollectionsURL", fragmentCollectionsViewContext.get("exportFragmentCollectionsURL")
														).put(
															"viewDeleteFragmentCollectionsURL", fragmentCollectionsViewContext.get("viewDeleteFragmentCollectionsURL")
														).put(
															"viewExportFragmentCollectionsURL", fragmentCollectionsViewContext.get("viewExportFragmentCollectionsURL")
														).put(
															"viewImportURL", fragmentCollectionsViewContext.get("viewImportURL")
														).build()
													);
                _jspx_th_clay_dropdown$1actions_0.setDropdownItems( fragmentDisplayContext.getCollectionsDropdownItems() );
                _jspx_th_clay_dropdown$1actions_0.setPropsTransformer("js/FragmentCollectionViewDefaultPropsTransformer");
                int _jspx_eval_clay_dropdown$1actions_0 = _jspx_th_clay_dropdown$1actions_0.doStartTag();
                if (_jspx_th_clay_dropdown$1actions_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_dropdown$1actions_0);
                  _jspx_th_clay_dropdown$1actions_0.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_dropdown$1actions_0);
                _jspx_th_clay_dropdown$1actions_0.release();
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t</li>\n");
                out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
                out.write("\t\t\t\t\t\t\t\t\t");
              }
              if (_jspx_th_clay_content$1col_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_1);
                _jspx_th_clay_content$1col_1.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_1);
              _jspx_th_clay_content$1col_1.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t");
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
            out.write("\t\t\t\t\t\t\t\t<ul class=\"mb-2 nav nav-stacked\">\n");
            out.write("\t\t\t\t\t\t\t\t\t");
if (
 ListUtil.isNotEmpty(fragmentCollectionContributors) || ListUtil.isNotEmpty(systemFragmentCollections) ) {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"text-truncate\">\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t");
            if (_jspx_meth_liferay$1ui_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_col_0, _jspx_page_context))
              return;
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t</span>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t");

										for (FragmentCollectionContributor fragmentCollectionContributor : fragmentCollectionContributors) {
										
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"nav-item\">\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"d-flex nav-link ");
            out.print( Objects.equals(fragmentCollectionContributor.getFragmentCollectionKey(), fragmentDisplayContext.getFragmentCollectionKey()) ? "active" : StringPool.BLANK );
            out.write("\"\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\thref=\"");
            out.print(
														PortletURLBuilder.createRenderURL(
															renderResponse
														).setParameter(
															"fragmentCollectionKey", fragmentCollectionContributor.getFragmentCollectionKey()
														).buildString()
													);
            out.write("\"\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"text-truncate\">");
            out.print( HtmlUtil.escape(fragmentCollectionContributor.getName(locale)) );
            out.write("</span>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
            if (_jspx_meth_liferay$1ui_icon_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_col_0, _jspx_page_context))
              return;
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t</li>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t");

										}

										for (FragmentCollection fragmentCollection : systemFragmentCollections) {
										
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"nav-item\">\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"d-flex nav-link ");
            out.print( (fragmentCollection.getFragmentCollectionId() == fragmentDisplayContext.getFragmentCollectionId()) ? "active" : StringPool.BLANK );
            out.write("\"\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\thref=\"");
            out.print(
														PortletURLBuilder.createRenderURL(
															renderResponse
														).setParameter(
															"fragmentCollectionId", fragmentCollection.getFragmentCollectionId()
														).buildString()
													);
            out.write("\"\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"text-truncate\">");
            out.print( HtmlUtil.escape(fragmentCollection.getName()) );
            out.write("</span>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
if (
 fragmentDisplayContext.isLocked(fragmentCollection) ) {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
            if (_jspx_meth_liferay$1ui_icon_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_col_0, _jspx_page_context))
              return;
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t</li>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t");

										}
										
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t");
}
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t</ul>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t<ul class=\"mb-2 nav nav-stacked\">\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t");

									for (Map.Entry<String, List<FragmentCollection>> entry : inheritedFragmentCollections.entrySet()) {
									
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"text-truncate\">");
            out.print( entry.getKey() );
            out.write("</span>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t");

										for (FragmentCollection fragmentCollection : entry.getValue()) {
										
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"nav-item\">\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"d-flex nav-link ");
            out.print( (fragmentCollection.getFragmentCollectionId() == fragmentDisplayContext.getFragmentCollectionId()) ? "active" : StringPool.BLANK );
            out.write("\"\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\thref=\"");
            out.print(
														PortletURLBuilder.createRenderURL(
															renderResponse
														).setParameter(
															"fragmentCollectionId", fragmentCollection.getFragmentCollectionId()
														).buildString()
													);
            out.write("\"\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"text-truncate\">");
            out.print( HtmlUtil.escape(fragmentCollection.getName()) );
            out.write("</span>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
            if (_jspx_meth_liferay$1ui_icon_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_col_0, _jspx_page_context))
              return;
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t</li>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t");

										}
									}
									
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t</ul>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t<ul class=\"mb-2 nav nav-stacked\">\n");
            out.write("\t\t\t\t\t\t\t\t\t");
if (
 ListUtil.isNotEmpty(fragmentCollections) ) {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"text-truncate\">");
            out.print( HtmlUtil.escape(fragmentDisplayContext.getGroupName(scopeGroupId)) );
            out.write("</span>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t");

										for (FragmentCollection fragmentCollection : fragmentCollections) {
										
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"nav-item\">\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"d-flex nav-link ");
            out.print( (fragmentCollection.getFragmentCollectionId() == fragmentDisplayContext.getFragmentCollectionId()) ? "active" : StringPool.BLANK );
            out.write("\"\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\thref=\"");
            out.print(
														PortletURLBuilder.createRenderURL(
															renderResponse
														).setParameter(
															"fragmentCollectionId", fragmentCollection.getFragmentCollectionId()
														).buildString()
													);
            out.write("\"\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"text-truncate\">");
            out.print( HtmlUtil.escape(fragmentCollection.getName()) );
            out.write("</span>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
if (
 fragmentDisplayContext.isLocked(fragmentCollection) ) {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
            if (_jspx_meth_liferay$1ui_icon_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_col_0, _jspx_page_context))
              return;
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t</li>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t");

										}
										
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t");
}
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t</ul>\n");
            out.write("\t\t\t\t\t\t\t");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t");
}
else {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t<p class=\"text-uppercase\">\n");
            out.write("\t\t\t\t\t\t\t\t\t<strong>");
            if (_jspx_meth_liferay$1ui_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_col_0, _jspx_page_context))
              return;
            out.write("</strong>\n");
            out.write("\t\t\t\t\t\t\t\t</p>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t");
            //  liferay-frontend:empty-result-message
            com.liferay.frontend.taglib.servlet.taglib.EmptyResultMessageTag _jspx_th_liferay$1frontend_empty$1result$1message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.EmptyResultMessageTag.class) : new com.liferay.frontend.taglib.servlet.taglib.EmptyResultMessageTag();
            _jspx_th_liferay$1frontend_empty$1result$1message_0.setPageContext(_jspx_page_context);
            _jspx_th_liferay$1frontend_empty$1result$1message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
            _jspx_th_liferay$1frontend_empty$1result$1message_0.setActionDropdownItems( FragmentPermission.contains(permissionChecker, scopeGroupId, FragmentActionKeys.MANAGE_FRAGMENT_ENTRIES) ? fragmentDisplayContext.getActionDropdownItems() : null );
            _jspx_th_liferay$1frontend_empty$1result$1message_0.setAdditionalProps( fragmentDisplayContext.getFragmentCollectionsViewContext() );
            _jspx_th_liferay$1frontend_empty$1result$1message_0.setAnimationType( EmptyResultMessageKeys.AnimationType.NONE );
            _jspx_th_liferay$1frontend_empty$1result$1message_0.setButtonPropsTransformer("js/FragmentCollectionViewButtonPropsTransformer");
            _jspx_th_liferay$1frontend_empty$1result$1message_0.setDescription( LanguageUtil.get(request, "fragment-sets-are-needed-to-create-fragments") );
            _jspx_th_liferay$1frontend_empty$1result$1message_0.setElementType( LanguageUtil.get(request, "fragment-sets") );
            _jspx_th_liferay$1frontend_empty$1result$1message_0.setPropsTransformer("js/FragmentCollectionViewDefaultPropsTransformer");
            _jspx_th_liferay$1frontend_empty$1result$1message_0.setPropsTransformerServletContext( application );
            int _jspx_eval_liferay$1frontend_empty$1result$1message_0 = _jspx_th_liferay$1frontend_empty$1result$1message_0.doStartTag();
            if (_jspx_th_liferay$1frontend_empty$1result$1message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_empty$1result$1message_0);
              _jspx_th_liferay$1frontend_empty$1result$1message_0.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_empty$1result$1message_0);
            _jspx_th_liferay$1frontend_empty$1result$1message_0.release();
            out.write("\n");
            out.write("\t\t\t\t\t\t\t");
            out.write("\n");
            out.write("\t\t\t\t\t\t");
}
            out.write("\n");
            out.write("\t\t\t\t\t</li>\n");
            out.write("\t\t\t\t</ul>\n");
            out.write("\t\t\t</nav>\n");
            out.write("\t\t");
          }
          if (_jspx_th_clay_col_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_0);
            _jspx_th_clay_col_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_0);
          _jspx_th_clay_col_0.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  clay:col
          com.liferay.frontend.taglib.clay.servlet.taglib.ColTag _jspx_th_clay_col_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ColTag();
          _jspx_th_clay_col_1.setPageContext(_jspx_page_context);
          _jspx_th_clay_col_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_row_0);
          _jspx_th_clay_col_1.setLg("9");
          int _jspx_eval_clay_col_1 = _jspx_th_clay_col_1.doStartTag();
          if (_jspx_eval_clay_col_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t");
if (
 (fragmentDisplayContext.getFragmentCollection() != null) || (fragmentDisplayContext.getFragmentCollectionContributor() != null) ) {
            out.write("\n");
            out.write("\t\t\t\t");
            //  clay:sheet
            com.liferay.frontend.taglib.clay.servlet.taglib.SheetTag _jspx_th_clay_sheet_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.SheetTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.SheetTag();
            _jspx_th_clay_sheet_0.setPageContext(_jspx_page_context);
            _jspx_th_clay_sheet_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_1);
            _jspx_th_clay_sheet_0.setSize("full");
            int _jspx_eval_clay_sheet_0 = _jspx_th_clay_sheet_0.doStartTag();
            if (_jspx_eval_clay_sheet_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              out.write("\n");
              out.write("\t\t\t\t\t<h2 class=\"sheet-title\">\n");
              out.write("\t\t\t\t\t\t");
              //  clay:content-row
              com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag _jspx_th_clay_content$1row_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag();
              _jspx_th_clay_content$1row_1.setPageContext(_jspx_page_context);
              _jspx_th_clay_content$1row_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet_0);
              _jspx_th_clay_content$1row_1.setVerticalAlign("center");
              int _jspx_eval_clay_content$1row_1 = _jspx_th_clay_content$1row_1.doStartTag();
              if (_jspx_eval_clay_content$1row_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                out.write("\n");
                out.write("\t\t\t\t\t\t\t");
                //  clay:content-col
                com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
                _jspx_th_clay_content$1col_2.setPageContext(_jspx_page_context);
                _jspx_th_clay_content$1col_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_1);
                int _jspx_eval_clay_content$1col_2 = _jspx_th_clay_content$1col_2.doStartTag();
                if (_jspx_eval_clay_content$1col_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  out.print( fragmentDisplayContext.getFragmentCollectionName() );
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t");
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
                out.write("\t\t\t\t\t\t\t");
if (
 fragmentDisplayContext.showFragmentCollectionActions() ) {
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t");
                //  clay:content-col
                com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
                _jspx_th_clay_content$1col_3.setPageContext(_jspx_page_context);
                _jspx_th_clay_content$1col_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_1);
                _jspx_th_clay_content$1col_3.setCssClass("inline-item-after");
                int _jspx_eval_clay_content$1col_3 = _jspx_th_clay_content$1col_3.doStartTag();
                if (_jspx_eval_clay_content$1col_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t");

									FragmentCollectionActionDropdownItemsProvider fragmentCollectionActionDropdownItemsProvider = new FragmentCollectionActionDropdownItemsProvider(fragmentDisplayContext, request, renderResponse);
									
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t");
                  //  clay:dropdown-actions
                  com.liferay.frontend.taglib.clay.servlet.taglib.DropdownActionsTag _jspx_th_clay_dropdown$1actions_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.DropdownActionsTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.DropdownActionsTag();
                  _jspx_th_clay_dropdown$1actions_1.setPageContext(_jspx_page_context);
                  _jspx_th_clay_dropdown$1actions_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_3);
                  _jspx_th_clay_dropdown$1actions_1.setDropdownItems( fragmentCollectionActionDropdownItemsProvider.getActionDropdownItems() );
                  _jspx_th_clay_dropdown$1actions_1.setPropsTransformer("js/FragmentCollectionDropdownPropsTransformer");
                  int _jspx_eval_clay_dropdown$1actions_1 = _jspx_th_clay_dropdown$1actions_1.doStartTag();
                  if (_jspx_th_clay_dropdown$1actions_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_dropdown$1actions_1);
                    _jspx_th_clay_dropdown$1actions_1.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_dropdown$1actions_1);
                  _jspx_th_clay_dropdown$1actions_1.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t");
                }
                if (_jspx_th_clay_content$1col_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_3);
                  _jspx_th_clay_content$1col_3.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_3);
                _jspx_th_clay_content$1col_3.release();
                out.write("\n");
                out.write("\t\t\t\t\t\t\t");
}
                out.write("\n");
                out.write("\t\t\t\t\t\t");
              }
              if (_jspx_th_clay_content$1row_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_1);
                _jspx_th_clay_content$1row_1.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_1);
              _jspx_th_clay_content$1row_1.release();
              out.write("\n");
              out.write("\t\t\t\t\t</h2>\n");
              out.write("\n");
              out.write("\t\t\t\t\t");
              //  clay:sheet-section
              com.liferay.frontend.taglib.clay.servlet.taglib.SheetSectionTag _jspx_th_clay_sheet$1section_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.SheetSectionTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.SheetSectionTag();
              _jspx_th_clay_sheet$1section_0.setPageContext(_jspx_page_context);
              _jspx_th_clay_sheet$1section_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet_0);
              int _jspx_eval_clay_sheet$1section_0 = _jspx_th_clay_sheet$1section_0.doStartTag();
              if (_jspx_eval_clay_sheet$1section_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                out.write("\n");
                out.write("\t\t\t\t\t\t");
if (
 !ListUtil.isEmpty(fragmentDisplayContext.getNavigationItems()) ) {
                out.write("\n");
                out.write("\t\t\t\t\t\t\t");
                //  clay:navigation-bar
                com.liferay.frontend.taglib.clay.servlet.taglib.NavigationBarTag _jspx_th_clay_navigation$1bar_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.NavigationBarTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.NavigationBarTag();
                _jspx_th_clay_navigation$1bar_0.setPageContext(_jspx_page_context);
                _jspx_th_clay_navigation$1bar_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
                _jspx_th_clay_navigation$1bar_0.setNavigationItems( fragmentDisplayContext.getNavigationItems() );
                int _jspx_eval_clay_navigation$1bar_0 = _jspx_th_clay_navigation$1bar_0.doStartTag();
                if (_jspx_th_clay_navigation$1bar_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_navigation$1bar_0);
                  _jspx_th_clay_navigation$1bar_0.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_navigation$1bar_0);
                _jspx_th_clay_navigation$1bar_0.release();
                out.write("\n");
                out.write("\t\t\t\t\t\t");
}
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t\t");
                out.write("\n");
                out.write("\t\t\t\t\t\t\t");
if (
 fragmentDisplayContext.isSelectedFragmentCollectionContributor() ) {
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t");
                //  liferay-util:include
                com.liferay.taglib.util.IncludeTag _jspx_th_liferay$1util_include_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.IncludeTag.class) : new com.liferay.taglib.util.IncludeTag();
                _jspx_th_liferay$1util_include_0.setPageContext(_jspx_page_context);
                _jspx_th_liferay$1util_include_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
                _jspx_th_liferay$1util_include_0.setPage("/view_contributed_fragment_entries.jsp");
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
                out.write("\t\t\t\t\t\t\t");
                out.write("\n");
                out.write("\t\t\t\t\t\t\t");
}
else {
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t");
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t");
if (
 fragmentDisplayContext.isViewResources() ) {
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t");
                //  liferay-util:include
                com.liferay.taglib.util.IncludeTag _jspx_th_liferay$1util_include_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.IncludeTag.class) : new com.liferay.taglib.util.IncludeTag();
                _jspx_th_liferay$1util_include_1.setPageContext(_jspx_page_context);
                _jspx_th_liferay$1util_include_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
                _jspx_th_liferay$1util_include_1.setPage("/view_resources.jsp");
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
                out.write("\t\t\t\t\t\t\t\t\t");
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t");
}
else {
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t");
                //  liferay-util:include
                com.liferay.taglib.util.IncludeTag _jspx_th_liferay$1util_include_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.IncludeTag.class) : new com.liferay.taglib.util.IncludeTag();
                _jspx_th_liferay$1util_include_2.setPageContext(_jspx_page_context);
                _jspx_th_liferay$1util_include_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
                _jspx_th_liferay$1util_include_2.setPage("/view_fragment_entries.jsp");
                _jspx_th_liferay$1util_include_2.setServletContext( application );
                int _jspx_eval_liferay$1util_include_2 = _jspx_th_liferay$1util_include_2.doStartTag();
                if (_jspx_th_liferay$1util_include_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_include_2);
                  _jspx_th_liferay$1util_include_2.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_include_2);
                _jspx_th_liferay$1util_include_2.release();
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t");
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t");
}
                out.write("\n");
                out.write("\t\t\t\t\t\t\t");
                out.write("\n");
                out.write("\t\t\t\t\t\t");
}
                out.write("\n");
                out.write("\t\t\t\t\t");
              }
              if (_jspx_th_clay_sheet$1section_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sheet$1section_0);
                _jspx_th_clay_sheet$1section_0.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sheet$1section_0);
              _jspx_th_clay_sheet$1section_0.release();
              out.write("\n");
              out.write("\t\t\t\t");
            }
            if (_jspx_th_clay_sheet_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sheet_0);
              _jspx_th_clay_sheet_0.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sheet_0);
            _jspx_th_clay_sheet_0.release();
            out.write("\n");
            out.write("\t\t\t");
}
            out.write("\n");
            out.write("\t\t");
          }
          if (_jspx_th_clay_col_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_1);
            _jspx_th_clay_col_1.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_1);
          _jspx_th_clay_col_1.release();
          out.write('\n');
          out.write('	');
        }
        if (_jspx_th_clay_row_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_row_0);
          _jspx_th_clay_row_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_row_0);
        _jspx_th_clay_row_0.release();
        out.write('\n');
      }
      if (_jspx_th_clay_container$1fluid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_0);
        _jspx_th_clay_container$1fluid_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_0);
      _jspx_th_clay_container$1fluid_0.release();
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_aui_form_0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_portlet_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_portlet_renderURL_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:param
    com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
    _jspx_th_portlet_param_0.setPageContext(_jspx_page_context);
    _jspx_th_portlet_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_renderURL_0);
    _jspx_th_portlet_param_0.setName("mvcRenderCommandName");
    _jspx_th_portlet_param_0.setValue("/fragment/edit_fragment_collection");
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

  private boolean _jspx_meth_liferay$1ui_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_content$1col_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_0);
    _jspx_th_liferay$1ui_message_0.setKey("fragment-sets");
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

  private boolean _jspx_meth_liferay$1ui_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_col_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
    _jspx_th_liferay$1ui_message_1.setKey("default");
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

  private boolean _jspx_meth_liferay$1ui_icon_0(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_col_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:icon
    com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
    _jspx_th_liferay$1ui_icon_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_icon_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
    _jspx_th_liferay$1ui_icon_0.setIcon("lock");
    _jspx_th_liferay$1ui_icon_0.setIconCssClass("ml-1 text-muted");
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

  private boolean _jspx_meth_liferay$1ui_icon_1(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_col_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:icon
    com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
    _jspx_th_liferay$1ui_icon_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_icon_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
    _jspx_th_liferay$1ui_icon_1.setIcon("lock");
    _jspx_th_liferay$1ui_icon_1.setIconCssClass("ml-1 text-muted");
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

  private boolean _jspx_meth_liferay$1ui_icon_2(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_col_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:icon
    com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
    _jspx_th_liferay$1ui_icon_2.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_icon_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
    _jspx_th_liferay$1ui_icon_2.setIcon("lock");
    _jspx_th_liferay$1ui_icon_2.setIconCssClass("ml-1 text-muted");
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

  private boolean _jspx_meth_liferay$1ui_icon_3(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_col_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:icon
    com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
    _jspx_th_liferay$1ui_icon_3.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_icon_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
    _jspx_th_liferay$1ui_icon_3.setIcon("lock");
    _jspx_th_liferay$1ui_icon_3.setIconCssClass("ml-1 text-muted");
    _jspx_th_liferay$1ui_icon_3.setMarkupView("lexicon");
    int _jspx_eval_liferay$1ui_icon_3 = _jspx_th_liferay$1ui_icon_3.doStartTag();
    if (_jspx_th_liferay$1ui_icon_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_3);
      _jspx_th_liferay$1ui_icon_3.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_3);
    _jspx_th_liferay$1ui_icon_3.release();
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
    _jspx_th_liferay$1ui_message_2.setKey("fragment-sets");
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

  private boolean _jspx_meth_aui_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:form
    com.liferay.taglib.aui.FormTag _jspx_th_aui_form_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FormTag.class) : new com.liferay.taglib.aui.FormTag();
    _jspx_th_aui_form_0.setPageContext(_jspx_page_context);
    _jspx_th_aui_form_0.setParent(null);
    _jspx_th_aui_form_0.setCssClass("hide");
    _jspx_th_aui_form_0.setName("fm");
    int _jspx_eval_aui_form_0 = _jspx_th_aui_form_0.doStartTag();
    if (_jspx_eval_aui_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write('\n');
    }
    if (_jspx_th_aui_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_form_0);
      _jspx_th_aui_form_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_form_0);
    _jspx_th_aui_form_0.release();
    return false;
  }
}
