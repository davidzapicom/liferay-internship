package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.asset.categories.admin.web.internal.constants.AssetCategoriesConstants;
import com.liferay.asset.categories.admin.web.internal.display.context.AssetCategoriesDisplayContext;
import com.liferay.asset.categories.admin.web.internal.display.context.AssetCategoriesManagementToolbarDisplayContext;
import com.liferay.asset.categories.admin.web.internal.display.context.AssetVocabulariesManagementToolbarDisplayContext;
import com.liferay.asset.categories.admin.web.internal.servlet.taglib.util.AssetCategoryActionDropdownItemsProvider;
import com.liferay.asset.categories.admin.web.internal.servlet.taglib.util.AssetVocabularyActionDropdownItemsProvider;
import com.liferay.asset.categories.admin.web.internal.util.AssetCategoryUtil;
import com.liferay.asset.category.property.exception.CategoryPropertyKeyException;
import com.liferay.asset.category.property.exception.CategoryPropertyValueException;
import com.liferay.asset.category.property.exception.DuplicateCategoryPropertyException;
import com.liferay.asset.category.property.model.AssetCategoryProperty;
import com.liferay.asset.category.property.service.AssetCategoryPropertyLocalServiceUtil;
import com.liferay.asset.category.property.service.AssetCategoryPropertyServiceUtil;
import com.liferay.asset.entry.rel.service.AssetEntryAssetCategoryRelLocalServiceUtil;
import com.liferay.asset.kernel.AssetRendererFactoryRegistryUtil;
import com.liferay.asset.kernel.NoSuchClassTypeException;
import com.liferay.asset.kernel.exception.AssetCategoryLimitException;
import com.liferay.asset.kernel.exception.AssetCategoryNameException;
import com.liferay.asset.kernel.exception.DuplicateCategoryException;
import com.liferay.asset.kernel.exception.DuplicateVocabularyException;
import com.liferay.asset.kernel.exception.NoSuchCategoryException;
import com.liferay.asset.kernel.exception.NoSuchVocabularyException;
import com.liferay.asset.kernel.exception.VocabularyNameException;
import com.liferay.asset.kernel.model.AssetCategory;
import com.liferay.asset.kernel.model.AssetCategoryConstants;
import com.liferay.asset.kernel.model.AssetRendererFactory;
import com.liferay.asset.kernel.model.AssetVocabulary;
import com.liferay.asset.kernel.model.AssetVocabularyConstants;
import com.liferay.asset.kernel.model.ClassType;
import com.liferay.asset.kernel.model.ClassTypeReader;
import com.liferay.asset.kernel.service.AssetCategoryLocalServiceUtil;
import com.liferay.asset.kernel.service.AssetVocabularyServiceUtil;
import com.liferay.frontend.taglib.servlet.taglib.util.EmptyResultMessageKeys;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.bean.BeanParamUtil;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.model.ModelHintsUtil;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.portlet.url.builder.PortletURLBuilder;
import com.liferay.portal.kernel.security.permission.ResourceActionsUtil;
import com.liferay.portal.kernel.servlet.MultiSessionMessages;
import com.liferay.portal.kernel.servlet.taglib.ui.BreadcrumbEntry;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portlet.asset.util.AssetVocabularySettingsHelper;
import com.liferay.site.navigation.taglib.servlet.taglib.util.BreadcrumbEntriesUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.portlet.PortletURL;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(15);
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/META-INF/c.tld");
    _jspx_dependants.add("/META-INF/liferay-portlet_2_0.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-asset.tld");
    _jspx_dependants.add("/META-INF/liferay-aui.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-clay.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-frontend.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-learn.tld");
    _jspx_dependants.add("/META-INF/liferay-portlet-ext.tld");
    _jspx_dependants.add("/META-INF/resources/react.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-site-navigation.tld");
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

AssetCategoriesDisplayContext assetCategoriesDisplayContext = new AssetCategoriesDisplayContext(request, renderRequest, renderResponse);

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      //  liferay-ui:error
      com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
      _jspx_th_liferay$1ui_error_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_error_0.setParent(null);
      _jspx_th_liferay$1ui_error_0.setException( DuplicateCategoryException.class );
      _jspx_th_liferay$1ui_error_0.setMessage("there-is-another-category-with-the-same-name-and-the-same-parent");
      int _jspx_eval_liferay$1ui_error_0 = _jspx_th_liferay$1ui_error_0.doStartTag();
      if (_jspx_th_liferay$1ui_error_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_0);
        _jspx_th_liferay$1ui_error_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_0);
      _jspx_th_liferay$1ui_error_0.release();
      out.write('\n');
      out.write('\n');
      //  liferay-ui:success
      com.liferay.taglib.ui.SuccessTag _jspx_th_liferay$1ui_success_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SuccessTag.class) : new com.liferay.taglib.ui.SuccessTag();
      _jspx_th_liferay$1ui_success_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_success_0.setParent(null);
      _jspx_th_liferay$1ui_success_0.setKey("categoryAdded");
      _jspx_th_liferay$1ui_success_0.setMessage( GetterUtil.getString(MultiSessionMessages.get(renderRequest, "categoryAdded")) );
      int _jspx_eval_liferay$1ui_success_0 = _jspx_th_liferay$1ui_success_0.doStartTag();
      if (_jspx_th_liferay$1ui_success_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_success_0);
        _jspx_th_liferay$1ui_success_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_success_0);
      _jspx_th_liferay$1ui_success_0.release();
      out.write('\n');
      //  liferay-ui:success
      com.liferay.taglib.ui.SuccessTag _jspx_th_liferay$1ui_success_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SuccessTag.class) : new com.liferay.taglib.ui.SuccessTag();
      _jspx_th_liferay$1ui_success_1.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_success_1.setParent(null);
      _jspx_th_liferay$1ui_success_1.setKey("categoryUpdated");
      _jspx_th_liferay$1ui_success_1.setMessage( GetterUtil.getString(MultiSessionMessages.get(renderRequest, "categoryUpdated")) );
      int _jspx_eval_liferay$1ui_success_1 = _jspx_th_liferay$1ui_success_1.doStartTag();
      if (_jspx_th_liferay$1ui_success_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_success_1);
        _jspx_th_liferay$1ui_success_1.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_success_1);
      _jspx_th_liferay$1ui_success_1.release();
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
        //  liferay-site-navigation:breadcrumb
        com.liferay.site.navigation.taglib.servlet.taglib.BreadcrumbTag _jspx_th_liferay$1site$1navigation_breadcrumb_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.site.navigation.taglib.servlet.taglib.BreadcrumbTag.class) : new com.liferay.site.navigation.taglib.servlet.taglib.BreadcrumbTag();
        _jspx_th_liferay$1site$1navigation_breadcrumb_0.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1site$1navigation_breadcrumb_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_0);
        _jspx_th_liferay$1site$1navigation_breadcrumb_0.setBreadcrumbEntries( BreadcrumbEntriesUtil.getBreadcrumbEntries(request, true, false, false, true, true) );
        int _jspx_eval_liferay$1site$1navigation_breadcrumb_0 = _jspx_th_liferay$1site$1navigation_breadcrumb_0.doStartTag();
        if (_jspx_th_liferay$1site$1navigation_breadcrumb_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1site$1navigation_breadcrumb_0);
          _jspx_th_liferay$1site$1navigation_breadcrumb_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1site$1navigation_breadcrumb_0);
        _jspx_th_liferay$1site$1navigation_breadcrumb_0.release();
        out.write("\n");
        out.write("\n");
        out.write("\t");
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
            out.write("\n");
            out.write("\t\t\t\t\t\t\t");
if (
 MapUtil.isNotEmpty(assetCategoriesDisplayContext.getInheritedVocabularies()) || ListUtil.isNotEmpty(assetCategoriesDisplayContext.getVocabularies()) ) {
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
 assetCategoriesDisplayContext.hasAddVocabularyPermission() ) {
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");

													PortletURL editVocabularyURL = assetCategoriesDisplayContext.getEditVocabularyURL();
													
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
                //  clay:link
                com.liferay.frontend.taglib.clay.servlet.taglib.LinkTag _jspx_th_clay_link_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.LinkTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.LinkTag();
                _jspx_th_clay_link_0.setPageContext(_jspx_page_context);
                _jspx_th_clay_link_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_1);
                _jspx_th_clay_link_0.setBorderless( true );
                _jspx_th_clay_link_0.setCssClass("component-action");
                _jspx_th_clay_link_0.setHref( editVocabularyURL.toString() );
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
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                //  liferay-portlet:actionURL
                com.liferay.taglib.portlet.ActionURLTag _jspx_th_liferay$1portlet_actionURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ActionURLTag.class) : new com.liferay.taglib.portlet.ActionURLTag();
                _jspx_th_liferay$1portlet_actionURL_0.setPageContext(_jspx_page_context);
                _jspx_th_liferay$1portlet_actionURL_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_1);
                _jspx_th_liferay$1portlet_actionURL_0.setCopyCurrentRenderParameters( false );
                _jspx_th_liferay$1portlet_actionURL_0.setName("/asset_categories_admin/delete_asset_vocabulary");
                _jspx_th_liferay$1portlet_actionURL_0.setVar("deleteVocabulariesURL");
                int _jspx_eval_liferay$1portlet_actionURL_0 = _jspx_th_liferay$1portlet_actionURL_0.doStartTag();
                if (_jspx_eval_liferay$1portlet_actionURL_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  //  portlet:param
                  com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
                  _jspx_th_portlet_param_0.setPageContext(_jspx_page_context);
                  _jspx_th_portlet_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1portlet_actionURL_0);
                  _jspx_th_portlet_param_0.setName("redirect");
                  _jspx_th_portlet_param_0.setValue( assetCategoriesDisplayContext.getDefaultRedirect() );
                  int _jspx_eval_portlet_param_0 = _jspx_th_portlet_param_0.doStartTag();
                  if (_jspx_th_portlet_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_0);
                    _jspx_th_portlet_param_0.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_0);
                  _jspx_th_portlet_param_0.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                }
                if (_jspx_th_liferay$1portlet_actionURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_actionURL_0);
                  _jspx_th_liferay$1portlet_actionURL_0.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_actionURL_0);
                _jspx_th_liferay$1portlet_actionURL_0.release();
                java.lang.String deleteVocabulariesURL = null;
                deleteVocabulariesURL = (java.lang.String) _jspx_page_context.findAttribute("deleteVocabulariesURL");
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                //  portlet:renderURL
                com.liferay.taglib.portlet.RenderURLTag _jspx_th_portlet_renderURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.RenderURLTag.class) : new com.liferay.taglib.portlet.RenderURLTag();
                _jspx_th_portlet_renderURL_0.setPageContext(_jspx_page_context);
                _jspx_th_portlet_renderURL_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_1);
                _jspx_th_portlet_renderURL_0.setVar("viewVocabulariesURL");
                _jspx_th_portlet_renderURL_0.setWindowState( LiferayWindowState.POP_UP.toString() );
                int _jspx_eval_portlet_renderURL_0 = _jspx_th_portlet_renderURL_0.doStartTag();
                if (_jspx_eval_portlet_renderURL_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_portlet_param_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_portlet_renderURL_0, _jspx_page_context))
                    return;
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                }
                if (_jspx_th_portlet_renderURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_renderURL_0);
                  _jspx_th_portlet_renderURL_0.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_renderURL_0);
                _jspx_th_portlet_renderURL_0.release();
                java.lang.String viewVocabulariesURL = null;
                viewVocabulariesURL = (java.lang.String) _jspx_page_context.findAttribute("viewVocabulariesURL");
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                //  clay:dropdown-actions
                com.liferay.frontend.taglib.clay.servlet.taglib.DropdownActionsTag _jspx_th_clay_dropdown$1actions_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.DropdownActionsTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.DropdownActionsTag();
                _jspx_th_clay_dropdown$1actions_0.setPageContext(_jspx_page_context);
                _jspx_th_clay_dropdown$1actions_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_1);
                _jspx_th_clay_dropdown$1actions_0.setAdditionalProps(
														HashMapBuilder.<String, Object>put(
															"deleteVocabulariesURL", deleteVocabulariesURL.toString()
														).put(
															"viewVocabulariesURL", viewVocabulariesURL.toString()
														).build()
													);
                _jspx_th_clay_dropdown$1actions_0.setDropdownItems( assetCategoriesDisplayContext.getVocabulariesDropdownItems() );
                _jspx_th_clay_dropdown$1actions_0.setPropsTransformer("js/ActionsComponentPropsTransformer");
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
            out.write("\t\t\t\t\t\t\t\t");
if (
 MapUtil.isNotEmpty(assetCategoriesDisplayContext.getInheritedVocabularies()) ) {
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t");

									Map<String, List<AssetVocabulary>> inheritedVocabularies = assetCategoriesDisplayContext.getInheritedVocabularies();

									for (Map.Entry<String, List<AssetVocabulary>> entry : inheritedVocabularies.entrySet()) {
									
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"mb-2 nav nav-stacked\">\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"text-truncate\">");
            out.print( entry.getKey() );
            out.write("</span>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t");

											for (AssetVocabulary vocabulary : entry.getValue()) {
											
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"nav-item\">\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"d-flex nav-link ");
            out.print( (assetCategoriesDisplayContext.getVocabularyId() == vocabulary.getVocabularyId()) ? "active" : StringPool.BLANK );
            out.write("\"\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\thref=\"");
            out.print(
															PortletURLBuilder.createRenderURL(
																renderResponse
															).setMVCPath(
																"/view.jsp"
															).setParameter(
																"vocabularyId", vocabulary.getVocabularyId()
															).buildString()
														);
            out.write("\"\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"text-truncate\">");
            out.print( HtmlUtil.escape(vocabulary.getTitle(locale)) );
            out.write("</span>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
            if (_jspx_meth_liferay$1ui_icon_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_col_0, _jspx_page_context))
              return;
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
if (
 vocabulary.getVisibilityType() == AssetVocabularyConstants.VISIBILITY_TYPE_INTERNAL ) {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
            if (_jspx_meth_liferay$1ui_icon_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_col_0, _jspx_page_context))
              return;
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t");

											}
											
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t");

									}
									
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t");
}
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t");
if (
 ListUtil.isNotEmpty(assetCategoriesDisplayContext.getVocabularies()) ) {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t<ul class=\"mb-2 nav nav-stacked\">\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"text-truncate\">");
            out.print( HtmlUtil.escape(assetCategoriesDisplayContext.getGroupName()) );
            out.write("</span>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t");

										for (AssetVocabulary vocabulary : assetCategoriesDisplayContext.getVocabularies()) {
										
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"nav-item\">\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"d-flex nav-link ");
            out.print( (assetCategoriesDisplayContext.getVocabularyId() == vocabulary.getVocabularyId()) ? "active" : StringPool.BLANK );
            out.write("\"\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\thref=\"");
            out.print(
														PortletURLBuilder.createRenderURL(
															renderResponse
														).setMVCPath(
															"/view.jsp"
														).setParameter(
															"vocabularyId", vocabulary.getVocabularyId()
														).buildString()
													);
            out.write("\"\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"text-truncate\">");
            out.print( HtmlUtil.escape(vocabulary.getTitle(locale)) );
            out.write("</span>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
if (
 vocabulary.getVisibilityType() == AssetVocabularyConstants.VISIBILITY_TYPE_INTERNAL ) {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
            if (_jspx_meth_liferay$1ui_icon_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_col_0, _jspx_page_context))
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
            out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
            out.write("\t\t\t\t\t\t\t\t");
}
            out.write("\n");
            out.write("\t\t\t\t\t\t\t");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t");
}
else {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t<p class=\"text-uppercase\">\n");
            out.write("\t\t\t\t\t\t\t\t\t<strong>");
            if (_jspx_meth_liferay$1ui_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_col_0, _jspx_page_context))
              return;
            out.write("</strong>\n");
            out.write("\t\t\t\t\t\t\t\t</p>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t");
            //  liferay-frontend:empty-result-message
            com.liferay.frontend.taglib.servlet.taglib.EmptyResultMessageTag _jspx_th_liferay$1frontend_empty$1result$1message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.EmptyResultMessageTag.class) : new com.liferay.frontend.taglib.servlet.taglib.EmptyResultMessageTag();
            _jspx_th_liferay$1frontend_empty$1result$1message_0.setPageContext(_jspx_page_context);
            _jspx_th_liferay$1frontend_empty$1result$1message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
            _jspx_th_liferay$1frontend_empty$1result$1message_0.setActionDropdownItems( assetCategoriesDisplayContext.getVocabularyActionDropdownItems() );
            _jspx_th_liferay$1frontend_empty$1result$1message_0.setAnimationType( EmptyResultMessageKeys.AnimationType.NONE );
            _jspx_th_liferay$1frontend_empty$1result$1message_0.setComponentId( liferayPortletResponse.getNamespace() + "emptyResultMessageComponent" );
            _jspx_th_liferay$1frontend_empty$1result$1message_0.setDescription( LanguageUtil.get(request, "vocabularies-are-needed-to-create-categories") );
            _jspx_th_liferay$1frontend_empty$1result$1message_0.setElementType( LanguageUtil.get(request, "vocabularies") );
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
            out.write("\n");
            out.write("\t\t\t");

			AssetVocabulary vocabulary = assetCategoriesDisplayContext.getVocabulary();
			
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t");
if (
 vocabulary != null ) {
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
                  out.print( HtmlUtil.escape(vocabulary.getTitle(locale)) );
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
                //  clay:content-col
                com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
                _jspx_th_clay_content$1col_3.setPageContext(_jspx_page_context);
                _jspx_th_clay_content$1col_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_1);
                _jspx_th_clay_content$1col_3.setCssClass("inline-item-after justify-content-end");
                int _jspx_eval_clay_content$1col_3 = _jspx_th_clay_content$1col_3.doStartTag();
                if (_jspx_eval_clay_content$1col_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t");

								AssetVocabularyActionDropdownItemsProvider assetVocabularyActionDropdownItemsProvider = new AssetVocabularyActionDropdownItemsProvider(request, renderResponse);
								
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  clay:dropdown-actions
                  com.liferay.frontend.taglib.clay.servlet.taglib.DropdownActionsTag _jspx_th_clay_dropdown$1actions_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.DropdownActionsTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.DropdownActionsTag();
                  _jspx_th_clay_dropdown$1actions_1.setPageContext(_jspx_page_context);
                  _jspx_th_clay_dropdown$1actions_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_3);
                  _jspx_th_clay_dropdown$1actions_1.setCssClass("component-action");
                  _jspx_th_clay_dropdown$1actions_1.setDropdownItems( assetVocabularyActionDropdownItemsProvider.getActionDropdownItems(vocabulary) );
                  _jspx_th_clay_dropdown$1actions_1.setPropsTransformer("js/VocabularyActionDropdownPropsTransformer");
                  int _jspx_eval_clay_dropdown$1actions_1 = _jspx_th_clay_dropdown$1actions_1.doStartTag();
                  if (_jspx_th_clay_dropdown$1actions_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_dropdown$1actions_1);
                    _jspx_th_clay_dropdown$1actions_1.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_dropdown$1actions_1);
                  _jspx_th_clay_dropdown$1actions_1.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t");
                }
                if (_jspx_th_clay_content$1col_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_3);
                  _jspx_th_clay_content$1col_3.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_3);
                _jspx_th_clay_content$1col_3.release();
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
              out.write("\t\t\t\t\t<div class=\"mb-5\">\n");
              out.write("\t\t\t\t\t\t<div class=\"mb-2\">\n");
              out.write("\t\t\t\t\t\t\t<span class=\"mr-1\">");
              if (_jspx_meth_liferay$1ui_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_sheet_0, _jspx_page_context))
                return;
              out.write(":</span>\n");
              out.write("\t\t\t\t\t\t\t<span class=\"text-secondary\">");
              out.print( assetCategoriesDisplayContext.getAssetType(vocabulary) );
              out.write("</span>\n");
              out.write("\t\t\t\t\t\t</div>\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t");

						String description = vocabulary.getDescription(locale);
						
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t");
if (
 Validator.isNotNull(description) ) {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t<div class=\"mb-2\">\n");
              out.write("\t\t\t\t\t\t\t\t<span class=\"mr-1\">");
              if (_jspx_meth_liferay$1ui_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_sheet_0, _jspx_page_context))
                return;
              out.write(":</span>\n");
              out.write("\t\t\t\t\t\t\t\t<span class=\"text-break text-secondary\">");
              out.print( description );
              out.write("</span>\n");
              out.write("\t\t\t\t\t\t\t</div>\n");
              out.write("\t\t\t\t\t\t");
}
              out.write("\n");
              out.write("\t\t\t\t\t</div>\n");
              out.write("\n");
              out.write("\t\t\t\t\t<p class=\"mb-5 text-secondary\">\n");
              out.write("\t\t\t\t\t\t<span class=\"mr-2\">\n");
              out.write("\t\t\t\t\t\t\t");
              //  liferay-ui:message
              com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
              _jspx_th_liferay$1ui_message_4.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet_0);
              _jspx_th_liferay$1ui_message_4.setArguments( assetCategoriesDisplayContext.getMaximumNumberOfCategoriesPerVocabulary() );
              _jspx_th_liferay$1ui_message_4.setKey("the-maximum-number-of-categories-per-vocabulary-is-x");
              int _jspx_eval_liferay$1ui_message_4 = _jspx_th_liferay$1ui_message_4.doStartTag();
              if (_jspx_th_liferay$1ui_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_4);
                _jspx_th_liferay$1ui_message_4.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_4);
              _jspx_th_liferay$1ui_message_4.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t</span>\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t");
              if (_jspx_meth_liferay$1learn_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_sheet_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t</p>\n");
              out.write("\n");
              out.write("\t\t\t\t\t");
if (
 assetCategoriesDisplayContext.isAssetCategoriesLimitExceeded() ) {
              out.write("\n");
              out.write("\t\t\t\t\t\t<div class=\"alert alert-warning\">\n");
              out.write("\t\t\t\t\t\t\t<span class=\"alert-indicator\">\n");
              out.write("\t\t\t\t\t\t\t\t");
              if (_jspx_meth_aui_icon_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_sheet_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t</span>\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  liferay-ui:message
              com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
              _jspx_th_liferay$1ui_message_5.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet_0);
              _jspx_th_liferay$1ui_message_5.setArguments( assetCategoriesDisplayContext.getMaximumNumberOfCategoriesPerVocabulary() );
              _jspx_th_liferay$1ui_message_5.setKey("you-have-reached-the-limit-of-x-categories-for-this-vocabulary");
              int _jspx_eval_liferay$1ui_message_5 = _jspx_th_liferay$1ui_message_5.doStartTag();
              if (_jspx_th_liferay$1ui_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_5);
                _jspx_th_liferay$1ui_message_5.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_5);
              _jspx_th_liferay$1ui_message_5.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t</div>\n");
              out.write("\t\t\t\t\t");
}
              out.write("\n");
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
                //  liferay-util:include
                com.liferay.taglib.util.IncludeTag _jspx_th_liferay$1util_include_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.IncludeTag.class) : new com.liferay.taglib.util.IncludeTag();
                _jspx_th_liferay$1util_include_0.setPageContext(_jspx_page_context);
                _jspx_th_liferay$1util_include_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet$1section_0);
                _jspx_th_liferay$1util_include_0.setPage("/view_asset_categories.jsp");
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

  private boolean _jspx_meth_liferay$1ui_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_content$1col_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_0);
    _jspx_th_liferay$1ui_message_0.setKey("vocabularies");
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

  private boolean _jspx_meth_portlet_param_1(javax.servlet.jsp.tagext.JspTag _jspx_th_portlet_renderURL_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:param
    com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
    _jspx_th_portlet_param_1.setPageContext(_jspx_page_context);
    _jspx_th_portlet_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_renderURL_0);
    _jspx_th_portlet_param_1.setName("mvcPath");
    _jspx_th_portlet_param_1.setValue("/view_asset_vocabularies.jsp");
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
    _jspx_th_liferay$1ui_icon_0.setMessage("this-vocabulary-can-only-be-edited-from-the-global-site");
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
    _jspx_th_liferay$1ui_icon_1.setIcon("low-vision");
    _jspx_th_liferay$1ui_icon_1.setIconCssClass("ml-1 text-muted");
    _jspx_th_liferay$1ui_icon_1.setMarkupView("lexicon");
    _jspx_th_liferay$1ui_icon_1.setMessage("for-internal-use-only");
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
    _jspx_th_liferay$1ui_icon_2.setIcon("low-vision");
    _jspx_th_liferay$1ui_icon_2.setIconCssClass("ml-1 text-muted");
    _jspx_th_liferay$1ui_icon_2.setMarkupView("lexicon");
    _jspx_th_liferay$1ui_icon_2.setMessage("for-internal-use-only");
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

  private boolean _jspx_meth_liferay$1ui_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_col_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
    _jspx_th_liferay$1ui_message_1.setKey("vocabularies");
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

  private boolean _jspx_meth_liferay$1ui_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_sheet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_2.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet_0);
    _jspx_th_liferay$1ui_message_2.setKey("asset-types");
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

  private boolean _jspx_meth_liferay$1ui_message_3(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_sheet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_3.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet_0);
    _jspx_th_liferay$1ui_message_3.setKey("description");
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

  private boolean _jspx_meth_liferay$1learn_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_sheet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-learn:message
    com.liferay.learn.taglib.servlet.taglib.MessageTag _jspx_th_liferay$1learn_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.learn.taglib.servlet.taglib.MessageTag.class) : new com.liferay.learn.taglib.servlet.taglib.MessageTag();
    _jspx_th_liferay$1learn_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1learn_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet_0);
    _jspx_th_liferay$1learn_message_0.setKey("general");
    _jspx_th_liferay$1learn_message_0.setResource("asset-taglib");
    int _jspx_eval_liferay$1learn_message_0 = _jspx_th_liferay$1learn_message_0.doStartTag();
    if (_jspx_th_liferay$1learn_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1learn_message_0);
      _jspx_th_liferay$1learn_message_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1learn_message_0);
    _jspx_th_liferay$1learn_message_0.release();
    return false;
  }

  private boolean _jspx_meth_aui_icon_0(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_sheet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:icon
    com.liferay.taglib.aui.IconTag _jspx_th_aui_icon_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.IconTag.class) : new com.liferay.taglib.aui.IconTag();
    _jspx_th_aui_icon_0.setPageContext(_jspx_page_context);
    _jspx_th_aui_icon_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet_0);
    _jspx_th_aui_icon_0.setImage("warning");
    _jspx_th_aui_icon_0.setMarkupView("lexicon");
    int _jspx_eval_aui_icon_0 = _jspx_th_aui_icon_0.doStartTag();
    if (_jspx_th_aui_icon_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_icon_0);
      _jspx_th_aui_icon_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_icon_0);
    _jspx_th_aui_icon_0.release();
    return false;
  }
}
