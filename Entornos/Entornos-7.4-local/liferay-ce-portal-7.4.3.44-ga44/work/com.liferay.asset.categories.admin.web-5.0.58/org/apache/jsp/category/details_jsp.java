package org.apache.jsp.category;

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

public final class details_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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

String redirect = ParamUtil.getString(request, "redirect", assetCategoriesDisplayContext.getEditCategoryRedirect());

long categoryId = ParamUtil.getLong(request, "categoryId");

AssetCategory category = AssetCategoryLocalServiceUtil.fetchCategory(categoryId);

long groupId = ParamUtil.getLong(request, "groupId", scopeGroupId);

long parentCategoryId = BeanParamUtil.getLong(category, request, "parentCategoryId");

long vocabularyId = ParamUtil.getLong(request, "vocabularyId");

portletDisplay.setShowBackIcon(true);
portletDisplay.setURLBack(redirect);

String title = LanguageUtil.get(request, "add-new-category");

if (category != null) {
	title = category.getTitle(locale);
}
else if (parentCategoryId > 0) {
	title = LanguageUtil.get(request, "add-new-subcategory");
}

renderResponse.setTitle(title);

      out.write('\n');
      out.write('\n');
      //  portlet:actionURL
      com.liferay.taglib.portlet.ActionURLTag _jspx_th_portlet_actionURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ActionURLTag.class) : new com.liferay.taglib.portlet.ActionURLTag();
      _jspx_th_portlet_actionURL_0.setPageContext(_jspx_page_context);
      _jspx_th_portlet_actionURL_0.setParent(null);
      _jspx_th_portlet_actionURL_0.setName("/asset_categories_admin/edit_asset_category");
      _jspx_th_portlet_actionURL_0.setVar("editCategoryURL");
      int _jspx_eval_portlet_actionURL_0 = _jspx_th_portlet_actionURL_0.doStartTag();
      if (_jspx_eval_portlet_actionURL_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write('\n');
        out.write('	');
        if (_jspx_meth_portlet_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_portlet_actionURL_0, _jspx_page_context))
          return;
        out.write('\n');
        out.write('	');
        //  portlet:param
        com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
        _jspx_th_portlet_param_1.setPageContext(_jspx_page_context);
        _jspx_th_portlet_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_0);
        _jspx_th_portlet_param_1.setName("groupId");
        _jspx_th_portlet_param_1.setValue( String.valueOf(groupId) );
        int _jspx_eval_portlet_param_1 = _jspx_th_portlet_param_1.doStartTag();
        if (_jspx_th_portlet_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_1);
          _jspx_th_portlet_param_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_1);
        _jspx_th_portlet_param_1.release();
        out.write('\n');
        out.write('	');
        //  portlet:param
        com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
        _jspx_th_portlet_param_2.setPageContext(_jspx_page_context);
        _jspx_th_portlet_param_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_0);
        _jspx_th_portlet_param_2.setName("vocabularyId");
        _jspx_th_portlet_param_2.setValue( String.valueOf(vocabularyId) );
        int _jspx_eval_portlet_param_2 = _jspx_th_portlet_param_2.doStartTag();
        if (_jspx_th_portlet_param_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_2);
          _jspx_th_portlet_param_2.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_2);
        _jspx_th_portlet_param_2.release();
        out.write('\n');
      }
      if (_jspx_th_portlet_actionURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_0);
        _jspx_th_portlet_actionURL_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_0);
      _jspx_th_portlet_actionURL_0.release();
      java.lang.String editCategoryURL = null;
      editCategoryURL = (java.lang.String) _jspx_page_context.findAttribute("editCategoryURL");
      out.write('\n');
      out.write('\n');
      //  liferay-frontend:edit-form
      com.liferay.frontend.taglib.servlet.taglib.EditFormTag _jspx_th_liferay$1frontend_edit$1form_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.EditFormTag.class) : new com.liferay.frontend.taglib.servlet.taglib.EditFormTag();
      _jspx_th_liferay$1frontend_edit$1form_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1frontend_edit$1form_0.setParent(null);
      _jspx_th_liferay$1frontend_edit$1form_0.setAction( editCategoryURL );
      _jspx_th_liferay$1frontend_edit$1form_0.setName("fm");
      int _jspx_eval_liferay$1frontend_edit$1form_0 = _jspx_th_liferay$1frontend_edit$1form_0.doStartTag();
      if (_jspx_eval_liferay$1frontend_edit$1form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write('\n');
        out.write('	');
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_0.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form_0);
        _jspx_th_aui_input_0.setName("redirect");
        _jspx_th_aui_input_0.setType("hidden");
        _jspx_th_aui_input_0.setValue( redirect );
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
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_1.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form_0);
        _jspx_th_aui_input_1.setName("categoryId");
        _jspx_th_aui_input_1.setType("hidden");
        _jspx_th_aui_input_1.setValue( categoryId );
        int _jspx_eval_aui_input_1 = _jspx_th_aui_input_1.doStartTag();
        if (_jspx_th_aui_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_1);
          _jspx_th_aui_input_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_1);
        _jspx_th_aui_input_1.release();
        out.write("\n");
        out.write("\n");
        out.write("\t");
        //  liferay-frontend:edit-form-body
        com.liferay.frontend.taglib.servlet.taglib.EditFormBodyTag _jspx_th_liferay$1frontend_edit$1form$1body_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.EditFormBodyTag.class) : new com.liferay.frontend.taglib.servlet.taglib.EditFormBodyTag();
        _jspx_th_liferay$1frontend_edit$1form$1body_0.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1frontend_edit$1form$1body_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form_0);
        int _jspx_eval_liferay$1frontend_edit$1form$1body_0 = _jspx_th_liferay$1frontend_edit$1form$1body_0.doStartTag();
        if (_jspx_eval_liferay$1frontend_edit$1form$1body_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
          _jspx_th_liferay$1ui_error_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_error_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form$1body_0);
          _jspx_th_liferay$1ui_error_0.setException( AssetCategoryLimitException.class );
          _jspx_th_liferay$1ui_error_0.setMessage("the-maximum-number-of-categories-for-the-vocabulary-has-been-exceeded");
          int _jspx_eval_liferay$1ui_error_0 = _jspx_th_liferay$1ui_error_0.doStartTag();
          if (_jspx_th_liferay$1ui_error_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_0);
            _jspx_th_liferay$1ui_error_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_0);
          _jspx_th_liferay$1ui_error_0.release();
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
          _jspx_th_liferay$1ui_error_1.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_error_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form$1body_0);
          _jspx_th_liferay$1ui_error_1.setException( AssetCategoryNameException.class );
          _jspx_th_liferay$1ui_error_1.setMessage("please-enter-a-valid-name");
          int _jspx_eval_liferay$1ui_error_1 = _jspx_th_liferay$1ui_error_1.doStartTag();
          if (_jspx_th_liferay$1ui_error_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_1);
            _jspx_th_liferay$1ui_error_1.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_1);
          _jspx_th_liferay$1ui_error_1.release();
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
          _jspx_th_liferay$1ui_error_2.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_error_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form$1body_0);
          _jspx_th_liferay$1ui_error_2.setException( DuplicateCategoryException.class );
          _jspx_th_liferay$1ui_error_2.setMessage("please-enter-a-unique-name");
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
          out.write("\t\t");
          //  aui:model-context
          com.liferay.taglib.aui.ModelContextTag _jspx_th_aui_model$1context_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ModelContextTag.class) : new com.liferay.taglib.aui.ModelContextTag();
          _jspx_th_aui_model$1context_0.setPageContext(_jspx_page_context);
          _jspx_th_aui_model$1context_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form$1body_0);
          _jspx_th_aui_model$1context_0.setBean( category );
          _jspx_th_aui_model$1context_0.setModel( AssetCategory.class );
          int _jspx_eval_aui_model$1context_0 = _jspx_th_aui_model$1context_0.doStartTag();
          if (_jspx_th_aui_model$1context_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_model$1context_0);
            _jspx_th_aui_model$1context_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_model$1context_0);
          _jspx_th_aui_model$1context_0.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  liferay-frontend:fieldset-group
          com.liferay.frontend.taglib.servlet.taglib.FieldsetGroupTag _jspx_th_liferay$1frontend_fieldset$1group_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.FieldsetGroupTag.class) : new com.liferay.frontend.taglib.servlet.taglib.FieldsetGroupTag();
          _jspx_th_liferay$1frontend_fieldset$1group_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1frontend_fieldset$1group_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form$1body_0);
          int _jspx_eval_liferay$1frontend_fieldset$1group_0 = _jspx_th_liferay$1frontend_fieldset$1group_0.doStartTag();
          if (_jspx_eval_liferay$1frontend_fieldset$1group_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t");
            //  liferay-frontend:fieldset
            com.liferay.frontend.taglib.servlet.taglib.FieldsetTag _jspx_th_liferay$1frontend_fieldset_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.FieldsetTag.class) : new com.liferay.frontend.taglib.servlet.taglib.FieldsetTag();
            _jspx_th_liferay$1frontend_fieldset_0.setPageContext(_jspx_page_context);
            _jspx_th_liferay$1frontend_fieldset_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset$1group_0);
            _jspx_th_liferay$1frontend_fieldset_0.setCollapsed( false );
            _jspx_th_liferay$1frontend_fieldset_0.setCollapsible( true );
            _jspx_th_liferay$1frontend_fieldset_0.setLabel("details");
            int _jspx_eval_liferay$1frontend_fieldset_0 = _jspx_th_liferay$1frontend_fieldset_0.doStartTag();
            if (_jspx_eval_liferay$1frontend_fieldset_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              out.write("\n");
              out.write("\t\t\t\t");
              //  aui:input
              com.liferay.taglib.aui.InputTag _jspx_th_aui_input_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
              _jspx_th_aui_input_2.setPageContext(_jspx_page_context);
              _jspx_th_aui_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
              _jspx_th_aui_input_2.setLabel("name");
              _jspx_th_aui_input_2.setLocalized( true );
              _jspx_th_aui_input_2.setName("title");
              _jspx_th_aui_input_2.setPlaceholder("name");
              _jspx_th_aui_input_2.setType("text");
              _jspx_th_aui_input_2.setValue( (category == null) ? StringPool.BLANK : assetCategoriesDisplayContext.getCategoryLocalizationXML(category) );
              int _jspx_eval_aui_input_2 = _jspx_th_aui_input_2.doStartTag();
              if (_jspx_eval_aui_input_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  aui:validator
                com.liferay.taglib.aui.ValidatorTagImpl _jspx_th_aui_validator_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ValidatorTagImpl.class) : new com.liferay.taglib.aui.ValidatorTagImpl();
                _jspx_th_aui_validator_0.setPageContext(_jspx_page_context);
                _jspx_th_aui_validator_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_input_2);
                _jspx_th_aui_validator_0.setName("maxLength");
                int _jspx_eval_aui_validator_0 = _jspx_th_aui_validator_0.doStartTag();
                if (_jspx_eval_aui_validator_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  if (_jspx_eval_aui_validator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                    out = _jspx_page_context.pushBody();
                    _jspx_th_aui_validator_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                    _jspx_th_aui_validator_0.doInitBody();
                  }
                  do {
                    out.print( ModelHintsUtil.getMaxLength(AssetCategory.class.getName(), "name") );
                    int evalDoAfterBody = _jspx_th_aui_validator_0.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                  if (_jspx_eval_aui_validator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                    out = _jspx_page_context.popBody();
                }
                if (_jspx_th_aui_validator_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_validator_0);
                  _jspx_th_aui_validator_0.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_validator_0);
                _jspx_th_aui_validator_0.release();
                out.write("\n");
                out.write("\t\t\t\t\t");
                if (_jspx_meth_aui_validator_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_input_2, _jspx_page_context))
                  return;
                out.write("\n");
                out.write("\t\t\t\t");
              }
              if (_jspx_th_aui_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_2);
                _jspx_th_aui_input_2.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_2);
              _jspx_th_aui_input_2.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t<div>\n");
              out.write("\t\t\t\t\t<label for=\"");
              if (_jspx_meth_portlet_namespace_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1frontend_fieldset_0, _jspx_page_context))
                return;
              out.write("description\">");
              if (_jspx_meth_liferay$1ui_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1frontend_fieldset_0, _jspx_page_context))
                return;
              out.write("</label>\n");
              out.write("\n");
              out.write("\t\t\t\t\t");
              //  liferay-ui:input-localized
              com.liferay.taglib.ui.InputLocalizedTag _jspx_th_liferay$1ui_input$1localized_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.InputLocalizedTag.class) : new com.liferay.taglib.ui.InputLocalizedTag();
              _jspx_th_liferay$1ui_input$1localized_0.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_input$1localized_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
              _jspx_th_liferay$1ui_input$1localized_0.setAvailableLocales( assetCategoriesDisplayContext.getAvailableLocales() );
              _jspx_th_liferay$1ui_input$1localized_0.setCssClass("form-control");
              _jspx_th_liferay$1ui_input$1localized_0.setDefaultLanguageId( assetCategoriesDisplayContext.getDefaultLanguageId(category) );
              _jspx_th_liferay$1ui_input$1localized_0.setEditorName("ckeditor");
              _jspx_th_liferay$1ui_input$1localized_0.setFormName("fm");
              _jspx_th_liferay$1ui_input$1localized_0.setName("description");
              _jspx_th_liferay$1ui_input$1localized_0.setSelectedLanguageId( assetCategoriesDisplayContext.getSelectedLanguageId(category) );
              _jspx_th_liferay$1ui_input$1localized_0.setType("editor");
              _jspx_th_liferay$1ui_input$1localized_0.setXml( (category == null) ? StringPool.BLANK : category.getDescription() );
              int _jspx_eval_liferay$1ui_input$1localized_0 = _jspx_th_liferay$1ui_input$1localized_0.doStartTag();
              if (_jspx_th_liferay$1ui_input$1localized_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_input$1localized_0);
                _jspx_th_liferay$1ui_input$1localized_0.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_input$1localized_0);
              _jspx_th_liferay$1ui_input$1localized_0.release();
              out.write("\n");
              out.write("\t\t\t\t</div>\n");
              out.write("\n");
              out.write("\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t\t");
if (
 assetCategoriesDisplayContext.isFlattenedNavigationAllowed() ) {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t");

						AssetCategory parentCategory = AssetCategoryLocalServiceUtil.fetchCategory(parentCategoryId);
						
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t");
              //  aui:field-wrapper
              com.liferay.taglib.aui.FieldWrapperTag _jspx_th_aui_field$1wrapper_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FieldWrapperTag.class) : new com.liferay.taglib.aui.FieldWrapperTag();
              _jspx_th_aui_field$1wrapper_0.setPageContext(_jspx_page_context);
              _jspx_th_aui_field$1wrapper_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
              _jspx_th_aui_field$1wrapper_0.setLabel("parent-category");
              int _jspx_eval_aui_field$1wrapper_0 = _jspx_th_aui_field$1wrapper_0.doStartTag();
              if (_jspx_eval_aui_field$1wrapper_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                out.write("\n");
                out.write("\t\t\t\t\t\t\t<div>\n");
                out.write("\t\t\t\t\t\t\t\t<div id=\"");
                if (_jspx_meth_portlet_namespace_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_field$1wrapper_0, _jspx_page_context))
                  return;
                out.write("parentCategoryContainer\">\n");
                out.write("\t\t\t\t\t\t\t\t\t<div class=\"field-content\">\n");
                out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\" id=\"namespace_assetCategoriesSelector_");
                out.print( vocabularyId );
                out.write("\">\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"input-group-item\">\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-control form-control-tag-group input-group\">\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"input-group-item\">\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
if (
 parentCategory != null ) {
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                //  clay:label
                com.liferay.frontend.taglib.clay.servlet.taglib.LabelTag _jspx_th_clay_label_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.LabelTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.LabelTag();
                _jspx_th_clay_label_0.setPageContext(_jspx_page_context);
                _jspx_th_clay_label_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_field$1wrapper_0);
                _jspx_th_clay_label_0.setDynamicAttribute(null, "dismissible",  true );
                _jspx_th_clay_label_0.setLabel( parentCategory.getTitle(locale) );
                int _jspx_eval_clay_label_0 = _jspx_th_clay_label_0.doStartTag();
                if (_jspx_th_clay_label_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_label_0);
                  _jspx_th_clay_label_0.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_label_0);
                _jspx_th_clay_label_0.release();
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"parentCategoryId\" type=\"hidden\" value=\"");
                out.print( parentCategoryId );
                out.write("\" />\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control-inset\" type=\"text\" value=\"\" />\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"input-group-item input-group-item-shrink\">\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-secondary\" type=\"button\">\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                if (_jspx_meth_liferay$1ui_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_field$1wrapper_0, _jspx_page_context))
                  return;
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</button>\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
                out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
                out.write("\t\t\t\t\t\t\t\t\t</div>\n");
                out.write("\t\t\t\t\t\t\t\t</div>\n");
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t");

								List<Map<String, Object>> selectedCategories = new ArrayList<>();

								if (parentCategory != null) {
									selectedCategories.add(
										HashMapBuilder.<String, Object>put(
											"label", parentCategory.getTitle(locale)
										).put(
											"value", parentCategory.getCategoryId()
										).build());
								}
								
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t");
                //  react:component
                com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag _jspx_th_react_component_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag.class) : new com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag();
                _jspx_th_react_component_0.setPageContext(_jspx_page_context);
                _jspx_th_react_component_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_field$1wrapper_0);
                _jspx_th_react_component_0.setModule("js/AssetCategoriesSelectorTag.es");
                _jspx_th_react_component_0.setProps(
										HashMapBuilder.<String, Object>put(
											"categoryIds", Collections.singletonList(parentCategoryId)
										).put(
											"groupIds", Collections.singletonList(scopeGroupId)
										).put(
											"namespace", liferayPortletResponse.getNamespace()
										).put(
											"portletURL", assetCategoriesDisplayContext.getCategorySelectorURL()
										).put(
											"selectedCategories", selectedCategories
										).put(
											"vocabularyIds", Collections.singletonList(vocabularyId)
										).build()
									);
                int _jspx_eval_react_component_0 = _jspx_th_react_component_0.doStartTag();
                if (_jspx_th_react_component_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_react_component_0);
                  _jspx_th_react_component_0.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_react_component_0);
                _jspx_th_react_component_0.release();
                out.write("\n");
                out.write("\t\t\t\t\t\t\t</div>\n");
                out.write("\t\t\t\t\t\t");
              }
              if (_jspx_th_aui_field$1wrapper_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_field$1wrapper_0);
                _jspx_th_aui_field$1wrapper_0.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_field$1wrapper_0);
              _jspx_th_aui_field$1wrapper_0.release();
              out.write("\n");
              out.write("\t\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t\t");
}
else {
              out.write("\n");
              out.write("\t\t\t\t\t\t");
              //  aui:input
              com.liferay.taglib.aui.InputTag _jspx_th_aui_input_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
              _jspx_th_aui_input_3.setPageContext(_jspx_page_context);
              _jspx_th_aui_input_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
              _jspx_th_aui_input_3.setName("parentCategoryId");
              _jspx_th_aui_input_3.setType("hidden");
              _jspx_th_aui_input_3.setValue( parentCategoryId );
              int _jspx_eval_aui_input_3 = _jspx_th_aui_input_3.doStartTag();
              if (_jspx_th_aui_input_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_3);
                _jspx_th_aui_input_3.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_3);
              _jspx_th_aui_input_3.release();
              out.write("\n");
              out.write("\t\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t");
}
              out.write("\n");
              out.write("\t\t\t");
            }
            if (_jspx_th_liferay$1frontend_fieldset_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_fieldset_0);
              _jspx_th_liferay$1frontend_fieldset_0.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_fieldset_0);
            _jspx_th_liferay$1frontend_fieldset_0.release();
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t");
if (
 assetCategoriesDisplayContext.isShowSelectAssetDisplayPage() ) {
            out.write("\n");
            out.write("\t\t\t\t");
            //  liferay-frontend:fieldset
            com.liferay.frontend.taglib.servlet.taglib.FieldsetTag _jspx_th_liferay$1frontend_fieldset_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.FieldsetTag.class) : new com.liferay.frontend.taglib.servlet.taglib.FieldsetTag();
            _jspx_th_liferay$1frontend_fieldset_1.setPageContext(_jspx_page_context);
            _jspx_th_liferay$1frontend_fieldset_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset$1group_0);
            _jspx_th_liferay$1frontend_fieldset_1.setCollapsed( true );
            _jspx_th_liferay$1frontend_fieldset_1.setCollapsible( true );
            _jspx_th_liferay$1frontend_fieldset_1.setLabel("display-page");
            int _jspx_eval_liferay$1frontend_fieldset_1 = _jspx_th_liferay$1frontend_fieldset_1.doStartTag();
            if (_jspx_eval_liferay$1frontend_fieldset_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              out.write("\n");
              out.write("\t\t\t\t\t");
              //  liferay-asset:select-asset-display-page
              com.liferay.asset.taglib.servlet.taglib.SelectAssetDisplayPageTag _jspx_th_liferay$1asset_select$1asset$1display$1page_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.asset.taglib.servlet.taglib.SelectAssetDisplayPageTag.class) : new com.liferay.asset.taglib.servlet.taglib.SelectAssetDisplayPageTag();
              _jspx_th_liferay$1asset_select$1asset$1display$1page_0.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1asset_select$1asset$1display$1page_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_1);
              _jspx_th_liferay$1asset_select$1asset$1display$1page_0.setClassNameId( PortalUtil.getClassNameId(AssetCategory.class) );
              _jspx_th_liferay$1asset_select$1asset$1display$1page_0.setClassPK( (category != null) ? category.getCategoryId() : 0 );
              _jspx_th_liferay$1asset_select$1asset$1display$1page_0.setClassTypeId( 0 );
              _jspx_th_liferay$1asset_select$1asset$1display$1page_0.setGroupId( scopeGroupId );
              _jspx_th_liferay$1asset_select$1asset$1display$1page_0.setParentClassPK( parentCategoryId );
              _jspx_th_liferay$1asset_select$1asset$1display$1page_0.setShowViewInContextLink( true );
              int _jspx_eval_liferay$1asset_select$1asset$1display$1page_0 = _jspx_th_liferay$1asset_select$1asset$1display$1page_0.doStartTag();
              if (_jspx_th_liferay$1asset_select$1asset$1display$1page_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1asset_select$1asset$1display$1page_0);
                _jspx_th_liferay$1asset_select$1asset$1display$1page_0.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1asset_select$1asset$1display$1page_0);
              _jspx_th_liferay$1asset_select$1asset$1display$1page_0.release();
              out.write("\n");
              out.write("\t\t\t\t");
            }
            if (_jspx_th_liferay$1frontend_fieldset_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_fieldset_1);
              _jspx_th_liferay$1frontend_fieldset_1.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_fieldset_1);
            _jspx_th_liferay$1frontend_fieldset_1.release();
            out.write("\n");
            out.write("\t\t\t");
}
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t");
if (
 (category == null) && !assetCategoriesDisplayContext.isItemSelector() ) {
            out.write("\n");
            out.write("\t\t\t\t");
            //  liferay-frontend:fieldset
            com.liferay.frontend.taglib.servlet.taglib.FieldsetTag _jspx_th_liferay$1frontend_fieldset_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.FieldsetTag.class) : new com.liferay.frontend.taglib.servlet.taglib.FieldsetTag();
            _jspx_th_liferay$1frontend_fieldset_2.setPageContext(_jspx_page_context);
            _jspx_th_liferay$1frontend_fieldset_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset$1group_0);
            _jspx_th_liferay$1frontend_fieldset_2.setCollapsed( true );
            _jspx_th_liferay$1frontend_fieldset_2.setCollapsible( true );
            _jspx_th_liferay$1frontend_fieldset_2.setLabel("permissions");
            int _jspx_eval_liferay$1frontend_fieldset_2 = _jspx_th_liferay$1frontend_fieldset_2.doStartTag();
            if (_jspx_eval_liferay$1frontend_fieldset_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              out.write("\n");
              out.write("\t\t\t\t\t");
              //  liferay-ui:input-permissions
              com.liferay.taglib.ui.InputPermissionsTag _jspx_th_liferay$1ui_input$1permissions_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.InputPermissionsTag.class) : new com.liferay.taglib.ui.InputPermissionsTag();
              _jspx_th_liferay$1ui_input$1permissions_0.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_input$1permissions_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_2);
              _jspx_th_liferay$1ui_input$1permissions_0.setModelName( AssetCategory.class.getName() );
              int _jspx_eval_liferay$1ui_input$1permissions_0 = _jspx_th_liferay$1ui_input$1permissions_0.doStartTag();
              if (_jspx_th_liferay$1ui_input$1permissions_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_input$1permissions_0);
                _jspx_th_liferay$1ui_input$1permissions_0.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_input$1permissions_0);
              _jspx_th_liferay$1ui_input$1permissions_0.release();
              out.write("\n");
              out.write("\t\t\t\t");
            }
            if (_jspx_th_liferay$1frontend_fieldset_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_fieldset_2);
              _jspx_th_liferay$1frontend_fieldset_2.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_fieldset_2);
            _jspx_th_liferay$1frontend_fieldset_2.release();
            out.write("\n");
            out.write("\t\t\t");
}
            out.write("\n");
            out.write("\t\t");
          }
          if (_jspx_th_liferay$1frontend_fieldset$1group_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_fieldset$1group_0);
            _jspx_th_liferay$1frontend_fieldset$1group_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_fieldset$1group_0);
          _jspx_th_liferay$1frontend_fieldset$1group_0.release();
          out.write('\n');
          out.write('	');
        }
        if (_jspx_th_liferay$1frontend_edit$1form$1body_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_edit$1form$1body_0);
          _jspx_th_liferay$1frontend_edit$1form$1body_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_edit$1form$1body_0);
        _jspx_th_liferay$1frontend_edit$1form$1body_0.release();
        out.write("\n");
        out.write("\n");
        out.write("\t");
        out.write("\n");
        out.write("\t\t");
if (
 !assetCategoriesDisplayContext.isItemSelector() ) {
        out.write("\n");
        out.write("\t\t\t");
        //  liferay-frontend:edit-form-footer
        com.liferay.frontend.taglib.servlet.taglib.EditFormFooterTag _jspx_th_liferay$1frontend_edit$1form$1footer_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.EditFormFooterTag.class) : new com.liferay.frontend.taglib.servlet.taglib.EditFormFooterTag();
        _jspx_th_liferay$1frontend_edit$1form$1footer_0.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1frontend_edit$1form$1footer_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form_0);
        int _jspx_eval_liferay$1frontend_edit$1form$1footer_0 = _jspx_th_liferay$1frontend_edit$1form$1footer_0.doStartTag();
        if (_jspx_eval_liferay$1frontend_edit$1form$1footer_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t\t");
          //  aui:button
          com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
          _jspx_th_aui_button_0.setPageContext(_jspx_page_context);
          _jspx_th_aui_button_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form$1footer_0);
          _jspx_th_aui_button_0.setDisabled( assetCategoriesDisplayContext.isSaveButtonDisabled() );
          _jspx_th_aui_button_0.setType("submit");
          int _jspx_eval_aui_button_0 = _jspx_th_aui_button_0.doStartTag();
          if (_jspx_th_aui_button_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_0);
            _jspx_th_aui_button_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_0);
          _jspx_th_aui_button_0.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t");
          //  aui:button
          com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
          _jspx_th_aui_button_1.setPageContext(_jspx_page_context);
          _jspx_th_aui_button_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form$1footer_0);
          _jspx_th_aui_button_1.setDisabled( assetCategoriesDisplayContext.isSaveAndAddNewButtonDisabled() );
          _jspx_th_aui_button_1.setOnClick( liferayPortletResponse.getNamespace() + "saveAndAddNew();" );
          _jspx_th_aui_button_1.setValue("save-and-add-a-new-one");
          int _jspx_eval_aui_button_1 = _jspx_th_aui_button_1.doStartTag();
          if (_jspx_th_aui_button_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_1);
            _jspx_th_aui_button_1.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_1);
          _jspx_th_aui_button_1.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t");
          //  aui:button
          com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
          _jspx_th_aui_button_2.setPageContext(_jspx_page_context);
          _jspx_th_aui_button_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form$1footer_0);
          _jspx_th_aui_button_2.setHref( redirect );
          _jspx_th_aui_button_2.setType("cancel");
          int _jspx_eval_aui_button_2 = _jspx_th_aui_button_2.doStartTag();
          if (_jspx_th_aui_button_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_2);
            _jspx_th_aui_button_2.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_2);
          _jspx_th_aui_button_2.release();
          out.write("\n");
          out.write("\t\t\t");
        }
        if (_jspx_th_liferay$1frontend_edit$1form$1footer_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_edit$1form$1footer_0);
          _jspx_th_liferay$1frontend_edit$1form$1footer_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_edit$1form$1footer_0);
        _jspx_th_liferay$1frontend_edit$1form$1footer_0.release();
        out.write("\n");
        out.write("\t\t");
        out.write("\n");
        out.write("\t\t");
}
else {
        out.write("\n");
        out.write("\t\t\t");
        //  liferay-frontend:component
        com.liferay.frontend.taglib.servlet.taglib.ComponentTag _jspx_th_liferay$1frontend_component_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.ComponentTag.class) : new com.liferay.frontend.taglib.servlet.taglib.ComponentTag();
        _jspx_th_liferay$1frontend_component_0.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1frontend_component_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_edit$1form_0);
        _jspx_th_liferay$1frontend_component_0.setContext(
					HashMapBuilder.<String, Object>put(
						"currentURL", currentURL
					).put(
						"redirect", redirect
					).build()
				);
        _jspx_th_liferay$1frontend_component_0.setModule("js/ItemSelectorAddCategory");
        _jspx_th_liferay$1frontend_component_0.setServletContext( application );
        int _jspx_eval_liferay$1frontend_component_0 = _jspx_th_liferay$1frontend_component_0.doStartTag();
        if (_jspx_th_liferay$1frontend_component_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_component_0);
          _jspx_th_liferay$1frontend_component_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_component_0);
        _jspx_th_liferay$1frontend_component_0.release();
        out.write("\n");
        out.write("\t\t");
        out.write('\n');
        out.write('	');
}
        out.write('\n');
      }
      if (_jspx_th_liferay$1frontend_edit$1form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_edit$1form_0);
        _jspx_th_liferay$1frontend_edit$1form_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_edit$1form_0);
      _jspx_th_liferay$1frontend_edit$1form_0.release();
      out.write('\n');
      out.write('\n');
      //  aui:script
      com.liferay.taglib.aui.ScriptTag _jspx_th_aui_script_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ScriptTag.class) : new com.liferay.taglib.aui.ScriptTag();
      _jspx_th_aui_script_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_script_0.setParent(null);
      int _jspx_eval_aui_script_0 = _jspx_th_aui_script_0.doStartTag();
      if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_aui_script_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_aui_script_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\tfunction ");
          if (_jspx_meth_portlet_namespace_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("saveAndAddNew() {\n");
          out.write("\t\tdocument.querySelector('#");
          if (_jspx_meth_portlet_namespace_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("redirect').value =\n");
          out.write("\t\t\t'");
          out.print( assetCategoriesDisplayContext.getAddCategoryRedirect() );
          out.write("';\n");
          out.write("\n");
          out.write("\t\tsubmitForm(document.querySelector('#");
          if (_jspx_meth_portlet_namespace_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("fm'));\n");
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

  private boolean _jspx_meth_portlet_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_portlet_actionURL_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:param
    com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
    _jspx_th_portlet_param_0.setPageContext(_jspx_page_context);
    _jspx_th_portlet_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_0);
    _jspx_th_portlet_param_0.setName("mvcPath");
    _jspx_th_portlet_param_0.setValue("/edit_asset_category.jsp");
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

  private boolean _jspx_meth_aui_validator_1(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_input_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:validator
    com.liferay.taglib.aui.ValidatorTagImpl _jspx_th_aui_validator_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ValidatorTagImpl.class) : new com.liferay.taglib.aui.ValidatorTagImpl();
    _jspx_th_aui_validator_1.setPageContext(_jspx_page_context);
    _jspx_th_aui_validator_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_input_2);
    _jspx_th_aui_validator_1.setName("required");
    int _jspx_eval_aui_validator_1 = _jspx_th_aui_validator_1.doStartTag();
    if (_jspx_th_aui_validator_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_validator_1);
      _jspx_th_aui_validator_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_validator_1);
    _jspx_th_aui_validator_1.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_0(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1frontend_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_0.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
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

  private boolean _jspx_meth_liferay$1ui_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1frontend_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_fieldset_0);
    _jspx_th_liferay$1ui_message_0.setKey("description");
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

  private boolean _jspx_meth_portlet_namespace_1(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_field$1wrapper_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_1.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_field$1wrapper_0);
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

  private boolean _jspx_meth_liferay$1ui_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_field$1wrapper_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_field$1wrapper_0);
    _jspx_th_liferay$1ui_message_1.setKey("select");
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

  private boolean _jspx_meth_portlet_namespace_2(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_2.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_2 = _jspx_th_portlet_namespace_2.doStartTag();
    if (_jspx_th_portlet_namespace_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_2);
      _jspx_th_portlet_namespace_2.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_2);
    _jspx_th_portlet_namespace_2.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_3(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_3.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_3 = _jspx_th_portlet_namespace_3.doStartTag();
    if (_jspx_th_portlet_namespace_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_3);
      _jspx_th_portlet_namespace_3.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_3);
    _jspx_th_portlet_namespace_3.release();
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_4(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_4.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_4 = _jspx_th_portlet_namespace_4.doStartTag();
    if (_jspx_th_portlet_namespace_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_4);
      _jspx_th_portlet_namespace_4.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_4);
    _jspx_th_portlet_namespace_4.release();
    return false;
  }
}
