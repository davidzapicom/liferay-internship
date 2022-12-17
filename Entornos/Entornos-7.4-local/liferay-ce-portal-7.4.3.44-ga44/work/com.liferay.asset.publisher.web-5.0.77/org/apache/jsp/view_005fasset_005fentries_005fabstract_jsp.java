package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.asset.constants.AssetWebKeys;
import com.liferay.asset.display.page.constants.AssetDisplayPageConstants;
import com.liferay.asset.display.page.model.AssetDisplayPageEntry;
import com.liferay.asset.display.page.service.AssetDisplayPageEntryLocalServiceUtil;
import com.liferay.asset.kernel.AssetRendererFactoryRegistryUtil;
import com.liferay.asset.kernel.exception.DuplicateQueryRuleException;
import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.model.AssetRenderer;
import com.liferay.asset.kernel.model.AssetRendererFactory;
import com.liferay.asset.kernel.model.AssetVocabulary;
import com.liferay.asset.kernel.model.ClassType;
import com.liferay.asset.kernel.model.ClassTypeField;
import com.liferay.asset.kernel.model.ClassTypeReader;
import com.liferay.asset.kernel.service.AssetVocabularyLocalServiceUtil;
import com.liferay.asset.list.model.AssetListEntry;
import com.liferay.asset.publisher.constants.AssetPublisherConstants;
import com.liferay.asset.publisher.constants.AssetPublisherPortletKeys;
import com.liferay.asset.publisher.constants.AssetPublisherWebKeys;
import com.liferay.asset.publisher.util.AssetEntryResult;
import com.liferay.asset.publisher.util.AssetPublisherHelper;
import com.liferay.asset.publisher.web.internal.constants.AssetPublisherSelectionStyleConstants;
import com.liferay.asset.publisher.web.internal.display.context.AssetPublisherDisplayContext;
import com.liferay.asset.publisher.web.internal.display.context.AssetPublisherViewContentDisplayContext;
import com.liferay.asset.publisher.web.internal.display.context.ItemSelectorViewDisplayContext;
import com.liferay.asset.publisher.web.internal.display.context.SelectStructureFieldDisplayContext;
import com.liferay.asset.publisher.web.internal.helper.AssetPublisherWebHelper;
import com.liferay.asset.publisher.web.internal.servlet.taglib.util.AssetEntryActionDropdownItemsProvider;
import com.liferay.asset.publisher.web.internal.util.AssetRendererUtil;
import com.liferay.asset.util.AssetHelper;
import com.liferay.asset.util.AssetPublisherAddItemHolder;
import com.liferay.asset.util.comparator.AssetRendererFactoryTypeNameComparator;
import com.liferay.document.library.kernel.document.conversion.DocumentConversionUtil;
import com.liferay.dynamic.data.mapping.model.DDMStructure;
import com.liferay.frontend.taglib.clay.servlet.taglib.util.DropdownItem;
import com.liferay.info.list.provider.item.selector.criterion.InfoListProviderItemSelectorReturnType;
import com.liferay.item.selector.ItemSelector;
import com.liferay.item.selector.criteria.GroupItemSelectorReturnType;
import com.liferay.item.selector.criteria.InfoListItemSelectorReturnType;
import com.liferay.item.selector.criteria.group.criterion.GroupItemSelectorCriterion;
import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.dao.search.ResultRow;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.NoSuchGroupException;
import com.liferay.portal.kernel.exception.NoSuchModelException;
import com.liferay.portal.kernel.frontend.icons.FrontendIconsUtil;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.ClassName;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.portlet.PortletProvider;
import com.liferay.portal.kernel.portlet.PortletProviderUtil;
import com.liferay.portal.kernel.portlet.RequestBackedPortletURLFactoryUtil;
import com.liferay.portal.kernel.portlet.url.builder.PortletURLBuilder;
import com.liferay.portal.kernel.portletdisplaytemplate.PortletDisplayTemplateManager;
import com.liferay.portal.kernel.security.permission.ResourceActionsUtil;
import com.liferay.portal.kernel.service.ClassNameLocalServiceUtil;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.WorkflowDefinitionLinkLocalServiceUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.trash.TrashHandler;
import com.liferay.portal.kernel.trash.TrashHandlerRegistryUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.FastDateFormatFactoryUtil;
import com.liferay.portal.kernel.util.FriendlyURLNormalizerUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.HttpComponentsUtil;
import com.liferay.portal.kernel.util.KeyValuePair;
import com.liferay.portal.kernel.util.KeyValuePairComparator;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.TextFormatter;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.view.count.ViewCountManagerUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portlet.usersadmin.search.GroupSearch;
import com.liferay.rss.util.RSSUtil;
import com.liferay.taglib.aui.AUIUtil;
import java.io.Serializable;
import java.text.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.portlet.PortletMode;
import javax.portlet.PortletURL;

public final class view_005fasset_005fentries_005fabstract_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


private static final Log _log = LogFactoryUtil.getLog("com_liferay_asset_publisher_web.view_asset_entries_abstract_jsp");

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

AssetHelper assetHelper = (AssetHelper)request.getAttribute(AssetWebKeys.ASSET_HELPER);
AssetPublisherDisplayContext assetPublisherDisplayContext = (AssetPublisherDisplayContext)request.getAttribute(AssetPublisherWebKeys.ASSET_PUBLISHER_DISPLAY_CONTEXT);
AssetPublisherHelper assetPublisherHelper = (AssetPublisherHelper)request.getAttribute(AssetPublisherWebKeys.ASSET_PUBLISHER_HELPER);
AssetPublisherWebHelper assetPublisherWebHelper = (AssetPublisherWebHelper)request.getAttribute(AssetPublisherWebKeys.ASSET_PUBLISHER_WEB_HELPER);

Format dateFormatDate = FastDateFormatFactoryUtil.getDate(locale, timeZone);

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');

long previewClassNameId = ParamUtil.getLong(request, "previewClassNameId");
long previewClassPK = ParamUtil.getLong(request, "previewClassPK");
int previewType = ParamUtil.getInteger(request, "previewType");

AssetEntryResult assetEntryResult = (AssetEntryResult)request.getAttribute("view.jsp-assetEntryResult");

      out.write('\n');
      out.write('\n');
if (
 Validator.isNotNull(assetEntryResult.getTitle()) ) {
      out.write("\n");
      out.write("\t<p class=\"asset-entries-group-label h3\">");
      out.print( HtmlUtil.escape(assetEntryResult.getTitle()) );
      out.write("</p>\n");
}
      out.write('\n');
      out.write('\n');

for (AssetEntry assetEntry : assetEntryResult.getAssetEntries()) {
	AssetRendererFactory<?> assetRendererFactory = AssetRendererFactoryRegistryUtil.getAssetRendererFactoryByClassNameId(assetEntry.getClassNameId());

	if (assetRendererFactory == null) {
		continue;
	}

	AssetRenderer<?> assetRenderer = null;

	try {
		if ((previewClassNameId == assetEntry.getClassNameId()) && (previewClassPK == assetEntry.getClassPK())) {
			assetRenderer = assetRendererFactory.getAssetRenderer(previewClassPK, previewType);
		}
		else {
			assetRenderer = assetRendererFactory.getAssetRenderer(assetEntry.getClassPK());
		}
	}
	catch (Exception e) {
		if (_log.isWarnEnabled()) {
			_log.warn(e);
		}
	}

	if ((assetRenderer == null) || (!assetRenderer.isDisplayable() && (previewClassPK <= 0))) {
		continue;
	}

	request.setAttribute("view.jsp-assetEntry", assetEntry);
	request.setAttribute("view.jsp-assetRenderer", assetRenderer);

	try {
		String title = assetRenderer.getTitle(LocaleUtil.fromLanguageId(LanguageUtil.getLanguageId(request)));
		String viewURL = assetPublisherHelper.getAssetViewURL(liferayPortletRequest, liferayPortletResponse, assetRenderer, assetEntry, assetPublisherDisplayContext.isAssetLinkBehaviorViewInPortlet());
		Map<String, Object> fragmentsEditorData = HashMapBuilder.<String, Object>put(
			"fragments-editor-item-id", PortalUtil.getClassNameId(assetRenderer.getClassName()) + "-" + assetRenderer.getClassPK()
		).put(
			"fragments-editor-item-type", "fragments-editor-mapped-item"
		).build();

      out.write("\n");
      out.write("\n");
      out.write("\t\t<div class=\"asset-abstract mb-5 ");
      out.print( assetPublisherWebHelper.isDefaultAssetPublisher(layout, portletDisplay.getId(), assetPublisherDisplayContext.getPortletResource()) ? "default-asset-publisher" : StringPool.BLANK );
      out.write(' ');
      out.print( ((previewClassNameId == assetEntry.getClassNameId()) && (previewClassPK == assetEntry.getClassPK())) ? "p-1 preview-asset-entry" : StringPool.BLANK );
      out.write('"');
      out.write(' ');
      out.print( AUIUtil.buildData(fragmentsEditorData) );
      out.write(">\n");
      out.write("\t\t\t<div class=\"align-items-center d-flex mb-2\">\n");
      out.write("\t\t\t\t<p class=\"component-title h4\">\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
if (
 assetPublisherDisplayContext.isShowContextLink() ) {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<a class=\"asset-title d-inline\" href=\"");
      out.print( viewURL );
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print( HtmlUtil.escape(title) );
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
}
else {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<span class=\"asset-title d-inline\">\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print( HtmlUtil.escape(title) );
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t\t");
      //  liferay-util:buffer
      com.liferay.taglib.util.BufferTag _jspx_th_liferay$1util_buffer_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.BufferTag.class) : new com.liferay.taglib.util.BufferTag();
      _jspx_th_liferay$1util_buffer_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1util_buffer_0.setParent(null);
      _jspx_th_liferay$1util_buffer_0.setVar("assetActions");
      int _jspx_eval_liferay$1util_buffer_0 = _jspx_th_liferay$1util_buffer_0.doStartTag();
      if (_jspx_eval_liferay$1util_buffer_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_liferay$1util_buffer_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_liferay$1util_buffer_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_liferay$1util_buffer_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\t\t\t\t\t");
          //  liferay-util:include
          com.liferay.taglib.util.IncludeTag _jspx_th_liferay$1util_include_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.IncludeTag.class) : new com.liferay.taglib.util.IncludeTag();
          _jspx_th_liferay$1util_include_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1util_include_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1util_buffer_0);
          _jspx_th_liferay$1util_include_0.setPage("/asset_actions.jsp");
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
          out.write("\t\t\t\t");
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
      java.lang.String assetActions = null;
      assetActions = (java.lang.String) _jspx_page_context.findAttribute("assetActions");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");
if (
 Validator.isNotNull(assetActions) ) {
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"d-inline-flex\">\n");
      out.write("\t\t\t\t\t\t");
      out.print( assetActions );
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<span class=\"asset-anchor lfr-asset-anchor\" id=\"");
      out.print( assetEntry.getEntryId() );
      out.write("\"></span>\n");
      out.write("\n");
      out.write("\t\t\t");
if (
 assetPublisherDisplayContext.isShowAuthor() || (assetPublisherDisplayContext.isShowCreateDate() && (assetEntry.getCreateDate() != null)) || (assetPublisherDisplayContext.isShowPublishDate() && (assetEntry.getPublishDate() != null)) || (assetPublisherDisplayContext.isShowExpirationDate() && (assetEntry.getExpirationDate() != null)) || (assetPublisherDisplayContext.isShowModifiedDate() && (assetEntry.getModifiedDate() != null)) || assetPublisherDisplayContext.isShowViewCount() ) {
      out.write("\n");
      out.write("\t\t\t\t");
      //  clay:content-row
      com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag _jspx_th_clay_content$1row_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag();
      _jspx_th_clay_content$1row_0.setPageContext(_jspx_page_context);
      _jspx_th_clay_content$1row_0.setParent(null);
      _jspx_th_clay_content$1row_0.setCssClass("mb-4 metadata-author");
      int _jspx_eval_clay_content$1row_0 = _jspx_th_clay_content$1row_0.doStartTag();
      if (_jspx_eval_clay_content$1row_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t\t");
if (
 assetPublisherDisplayContext.isShowAuthor() ) {
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        //  clay:content-col
        com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
        _jspx_th_clay_content$1col_0.setPageContext(_jspx_page_context);
        _jspx_th_clay_content$1col_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_0);
        _jspx_th_clay_content$1col_0.setCssClass("asset-avatar inline-item-before mr-3 pt-1");
        int _jspx_eval_clay_content$1col_0 = _jspx_th_clay_content$1col_0.doStartTag();
        if (_jspx_eval_clay_content$1col_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
          //  liferay-ui:user-portrait
          com.liferay.taglib.ui.UserPortraitTag _jspx_th_liferay$1ui_user$1portrait_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.UserPortraitTag.class) : new com.liferay.taglib.ui.UserPortraitTag();
          _jspx_th_liferay$1ui_user$1portrait_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_user$1portrait_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_0);
          _jspx_th_liferay$1ui_user$1portrait_0.setUserId( assetRenderer.getUserId() );
          int _jspx_eval_liferay$1ui_user$1portrait_0 = _jspx_th_liferay$1ui_user$1portrait_0.doStartTag();
          if (_jspx_th_liferay$1ui_user$1portrait_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_user$1portrait_0);
            _jspx_th_liferay$1ui_user$1portrait_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_user$1portrait_0);
          _jspx_th_liferay$1ui_user$1portrait_0.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t");
        }
        if (_jspx_th_clay_content$1col_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_0);
          _jspx_th_clay_content$1col_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_0);
        _jspx_th_clay_content$1col_0.release();
        out.write("\n");
        out.write("\t\t\t\t\t");
}
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t");
        //  clay:content-col
        com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
        _jspx_th_clay_content$1col_1.setPageContext(_jspx_page_context);
        _jspx_th_clay_content$1col_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_0);
        _jspx_th_clay_content$1col_1.setExpand( true );
        int _jspx_eval_clay_content$1col_1 = _jspx_th_clay_content$1col_1.doStartTag();
        if (_jspx_eval_clay_content$1col_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t\t\t\t");
if (
 assetPublisherDisplayContext.isShowAuthor() ) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t<div class=\"text-truncate-inline\">\n");
          out.write("\t\t\t\t\t\t\t\t<span class=\"text-truncate user-info\"><strong>");
          out.print( HtmlUtil.escape(AssetRendererUtil.getAssetRendererUserFullName(assetRenderer, request)) );
          out.write("</strong></span>\n");
          out.write("\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t");

						StringBundler sb = new StringBundler(13);

						if (assetPublisherDisplayContext.isShowCreateDate() && (assetEntry.getCreateDate() != null)) {
							sb.append(LanguageUtil.get(request, "created"));
							sb.append(StringPool.SPACE);
							sb.append(dateFormatDate.format(assetEntry.getCreateDate()));
							sb.append(" - ");
						}

						if (assetPublisherDisplayContext.isShowPublishDate() && (assetEntry.getPublishDate() != null)) {
							sb.append(LanguageUtil.get(request, "published"));
							sb.append(StringPool.SPACE);
							sb.append(dateFormatDate.format(assetEntry.getPublishDate()));
							sb.append(" - ");
						}

						if (assetPublisherDisplayContext.isShowExpirationDate() && (assetEntry.getExpirationDate() != null)) {
							sb.append(LanguageUtil.get(request, "expired"));
							sb.append(StringPool.SPACE);
							sb.append(dateFormatDate.format(assetEntry.getExpirationDate()));
							sb.append(" - ");
						}

						if (assetPublisherDisplayContext.isShowModifiedDate() && (assetEntry.getModifiedDate() != null)) {
							Date modifiedDate = assetEntry.getModifiedDate();

							String modifiedDateDescription = LanguageUtil.getTimeDescription(request, System.currentTimeMillis() - modifiedDate.getTime(), true);

							sb.append(LanguageUtil.format(request, "modified-x-ago", modifiedDateDescription));
						}
						else if (sb.index() > 1) {
							sb.setIndex(sb.index() - 1);
						}
						
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t<div class=\"asset-user-info text-secondary\">\n");
          out.write("\t\t\t\t\t\t\t<span class=\"date-info\">");
          out.print( sb.toString() );
          out.write("</span>\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t");
if (
 assetPublisherDisplayContext.isShowViewCount() ) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t<div class=\"asset-view-count-info text-secondary\">\n");
          out.write("\t\t\t\t\t\t\t\t<span class=\"view-count-info\">");
          out.print( assetEntry.getViewCount() );
          out.write(' ');
          //  liferay-ui:message
          com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
          _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_1);
          _jspx_th_liferay$1ui_message_0.setKey( (assetEntry.getViewCount() == 1) ? "view" : "views" );
          int _jspx_eval_liferay$1ui_message_0 = _jspx_th_liferay$1ui_message_0.doStartTag();
          if (_jspx_th_liferay$1ui_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
            _jspx_th_liferay$1ui_message_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
          _jspx_th_liferay$1ui_message_0.release();
          out.write("</span>\n");
          out.write("\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t");
}
          out.write("\n");
          out.write("\t\t\t\t\t");
        }
        if (_jspx_th_clay_content$1col_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_1);
          _jspx_th_clay_content$1col_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_1);
        _jspx_th_clay_content$1col_1.release();
        out.write("\n");
        out.write("\t\t\t\t");
      }
      if (_jspx_th_clay_content$1row_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_0);
        _jspx_th_clay_content$1row_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_0);
      _jspx_th_clay_content$1row_0.release();
      out.write("\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"asset-content mb-3\">\n");
      out.write("\t\t\t\t");
      //  liferay-asset:asset-display
      com.liferay.asset.taglib.servlet.taglib.AssetDisplayTag _jspx_th_liferay$1asset_asset$1display_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.asset.taglib.servlet.taglib.AssetDisplayTag.class) : new com.liferay.asset.taglib.servlet.taglib.AssetDisplayTag();
      _jspx_th_liferay$1asset_asset$1display_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1asset_asset$1display_0.setParent(null);
      _jspx_th_liferay$1asset_asset$1display_0.setAbstractLength( assetPublisherDisplayContext.getAbstractLength() );
      _jspx_th_liferay$1asset_asset$1display_0.setAssetEntry( assetEntry );
      _jspx_th_liferay$1asset_asset$1display_0.setAssetRenderer( assetRenderer );
      _jspx_th_liferay$1asset_asset$1display_0.setAssetRendererFactory( assetRendererFactory );
      _jspx_th_liferay$1asset_asset$1display_0.setTemplate( AssetRenderer.TEMPLATE_ABSTRACT );
      _jspx_th_liferay$1asset_asset$1display_0.setViewURL( viewURL );
      int _jspx_eval_liferay$1asset_asset$1display_0 = _jspx_th_liferay$1asset_asset$1display_0.doStartTag();
      if (_jspx_th_liferay$1asset_asset$1display_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1asset_asset$1display_0);
        _jspx_th_liferay$1asset_asset$1display_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1asset_asset$1display_0);
      _jspx_th_liferay$1asset_asset$1display_0.release();
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t");
if (
 assetPublisherDisplayContext.isShowCategories() ) {
      out.write("\n");
      out.write("\t\t\t\t<div class=\"asset-categories mb-3\">\n");
      out.write("\t\t\t\t\t");
      //  liferay-asset:asset-categories-summary
      com.liferay.asset.taglib.servlet.taglib.AssetCategoriesSummaryTag _jspx_th_liferay$1asset_asset$1categories$1summary_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.asset.taglib.servlet.taglib.AssetCategoriesSummaryTag.class) : new com.liferay.asset.taglib.servlet.taglib.AssetCategoriesSummaryTag();
      _jspx_th_liferay$1asset_asset$1categories$1summary_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1asset_asset$1categories$1summary_0.setParent(null);
      _jspx_th_liferay$1asset_asset$1categories$1summary_0.setClassName( assetEntry.getClassName() );
      _jspx_th_liferay$1asset_asset$1categories$1summary_0.setClassPK( assetEntry.getClassPK() );
      _jspx_th_liferay$1asset_asset$1categories$1summary_0.setDisplayStyle("simple-category");
      _jspx_th_liferay$1asset_asset$1categories$1summary_0.setPortletURL( renderResponse.createRenderURL() );
      int _jspx_eval_liferay$1asset_asset$1categories$1summary_0 = _jspx_th_liferay$1asset_asset$1categories$1summary_0.doStartTag();
      if (_jspx_th_liferay$1asset_asset$1categories$1summary_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1asset_asset$1categories$1summary_0);
        _jspx_th_liferay$1asset_asset$1categories$1summary_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1asset_asset$1categories$1summary_0);
      _jspx_th_liferay$1asset_asset$1categories$1summary_0.release();
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
if (
 assetPublisherDisplayContext.isShowTags() ) {
      out.write("\n");
      out.write("\t\t\t\t<div class=\"asset-tags mb-3\">\n");
      out.write("\t\t\t\t\t");
      //  liferay-asset:asset-tags-summary
      com.liferay.asset.taglib.servlet.taglib.AssetTagsSummaryTag _jspx_th_liferay$1asset_asset$1tags$1summary_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.asset.taglib.servlet.taglib.AssetTagsSummaryTag.class) : new com.liferay.asset.taglib.servlet.taglib.AssetTagsSummaryTag();
      _jspx_th_liferay$1asset_asset$1tags$1summary_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1asset_asset$1tags$1summary_0.setParent(null);
      _jspx_th_liferay$1asset_asset$1tags$1summary_0.setClassName( assetEntry.getClassName() );
      _jspx_th_liferay$1asset_asset$1tags$1summary_0.setClassPK( assetEntry.getClassPK() );
      _jspx_th_liferay$1asset_asset$1tags$1summary_0.setPortletURL( renderResponse.createRenderURL() );
      int _jspx_eval_liferay$1asset_asset$1tags$1summary_0 = _jspx_th_liferay$1asset_asset$1tags$1summary_0.doStartTag();
      if (_jspx_th_liferay$1asset_asset$1tags$1summary_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1asset_asset$1tags$1summary_0);
        _jspx_th_liferay$1asset_asset$1tags$1summary_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1asset_asset$1tags$1summary_0);
      _jspx_th_liferay$1asset_asset$1tags$1summary_0.release();
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
if (
 assetPublisherDisplayContext.isShowPriority() ) {
      out.write("\n");
      out.write("\t\t\t\t<div class=\"asset-priority mb-4 text-secondary\">\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_liferay$1ui_message_1(_jspx_page_context))
        return;
      out.write(':');
      out.write(' ');
      out.print( assetEntry.getPriority() );
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
if (
 assetPublisherDisplayContext.isEnableRelatedAssets() ) {
      out.write("\n");
      out.write("\t\t\t\t<div class=\"asset-links mb-4\">\n");
      out.write("\t\t\t\t\t");
      //  liferay-asset:asset-links
      com.liferay.asset.taglib.servlet.taglib.AssetLinksTag _jspx_th_liferay$1asset_asset$1links_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.asset.taglib.servlet.taglib.AssetLinksTag.class) : new com.liferay.asset.taglib.servlet.taglib.AssetLinksTag();
      _jspx_th_liferay$1asset_asset$1links_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1asset_asset$1links_0.setParent(null);
      _jspx_th_liferay$1asset_asset$1links_0.setAssetEntryId( assetEntry.getEntryId() );
      _jspx_th_liferay$1asset_asset$1links_0.setPortletURL(
							PortletURLBuilder.createRenderURL(
								renderResponse
							).setMVCPath(
								"/view_content.jsp"
							).buildPortletURL()
						);
      _jspx_th_liferay$1asset_asset$1links_0.setViewInContext( assetPublisherDisplayContext.isAssetLinkBehaviorViewInPortlet() );
      int _jspx_eval_liferay$1asset_asset$1links_0 = _jspx_th_liferay$1asset_asset$1links_0.doStartTag();
      if (_jspx_th_liferay$1asset_asset$1links_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1asset_asset$1links_0);
        _jspx_th_liferay$1asset_asset$1links_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1asset_asset$1links_0);
      _jspx_th_liferay$1asset_asset$1links_0.release();
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
if (
 (assetPublisherDisplayContext.isEnableRatings() && assetRenderer.isRatable()) || assetPublisherDisplayContext.isEnableFlags() || assetPublisherDisplayContext.isEnablePrint() || Validator.isNotNull(assetPublisherDisplayContext.getSocialBookmarksTypes()) ) {
      out.write("\n");
      out.write("\t\t\t\t<hr class=\"separator\" />\n");
      out.write("\n");
      out.write("\t\t\t\t");
      //  clay:content-row
      com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag _jspx_th_clay_content$1row_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag();
      _jspx_th_clay_content$1row_1.setPageContext(_jspx_page_context);
      _jspx_th_clay_content$1row_1.setParent(null);
      _jspx_th_clay_content$1row_1.setCssClass("asset-details");
      _jspx_th_clay_content$1row_1.setFloatElements("");
      _jspx_th_clay_content$1row_1.setVerticalAlign("center");
      int _jspx_eval_clay_content$1row_1 = _jspx_th_clay_content$1row_1.doStartTag();
      if (_jspx_eval_clay_content$1row_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t\t");
if (
 assetPublisherDisplayContext.isEnableRatings() && assetRenderer.isRatable() ) {
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        //  clay:content-col
        com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
        _jspx_th_clay_content$1col_2.setPageContext(_jspx_page_context);
        _jspx_th_clay_content$1col_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_1);
        _jspx_th_clay_content$1col_2.setCssClass("asset-ratings mr-3");
        int _jspx_eval_clay_content$1col_2 = _jspx_th_clay_content$1col_2.doStartTag();
        if (_jspx_eval_clay_content$1col_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
          //  liferay-ratings:ratings
          com.liferay.ratings.taglib.servlet.taglib.RatingsTag _jspx_th_liferay$1ratings_ratings_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.ratings.taglib.servlet.taglib.RatingsTag.class) : new com.liferay.ratings.taglib.servlet.taglib.RatingsTag();
          _jspx_th_liferay$1ratings_ratings_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ratings_ratings_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_2);
          _jspx_th_liferay$1ratings_ratings_0.setClassName( assetEntry.getClassName() );
          _jspx_th_liferay$1ratings_ratings_0.setClassPK( assetEntry.getClassPK() );
          int _jspx_eval_liferay$1ratings_ratings_0 = _jspx_th_liferay$1ratings_ratings_0.doStartTag();
          if (_jspx_th_liferay$1ratings_ratings_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ratings_ratings_0);
            _jspx_th_liferay$1ratings_ratings_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ratings_ratings_0);
          _jspx_th_liferay$1ratings_ratings_0.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t");
        }
        if (_jspx_th_clay_content$1col_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_2);
          _jspx_th_clay_content$1col_2.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_2);
        _jspx_th_clay_content$1col_2.release();
        out.write("\n");
        out.write("\t\t\t\t\t");
}
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t");
if (
 assetPublisherDisplayContext.isEnableFlags() ) {
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        //  clay:content-col
        com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
        _jspx_th_clay_content$1col_3.setPageContext(_jspx_page_context);
        _jspx_th_clay_content$1col_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_1);
        _jspx_th_clay_content$1col_3.setCssClass("asset-flag mr-3");
        int _jspx_eval_clay_content$1col_3 = _jspx_th_clay_content$1col_3.doStartTag();
        if (_jspx_eval_clay_content$1col_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");

							TrashHandler trashHandler = TrashHandlerRegistryUtil.getTrashHandler(assetRenderer.getClassName());

							boolean inTrash = trashHandler.isInTrash(assetEntry.getClassPK());
							
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
          //  liferay-flags:flags
          com.liferay.flags.taglib.servlet.taglib.react.FlagsTag _jspx_th_liferay$1flags_flags_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.flags.taglib.servlet.taglib.react.FlagsTag.class) : new com.liferay.flags.taglib.servlet.taglib.react.FlagsTag();
          _jspx_th_liferay$1flags_flags_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1flags_flags_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_3);
          _jspx_th_liferay$1flags_flags_0.setClassName( assetEntry.getClassName() );
          _jspx_th_liferay$1flags_flags_0.setClassPK( assetEntry.getClassPK() );
          _jspx_th_liferay$1flags_flags_0.setContentTitle( title );
          _jspx_th_liferay$1flags_flags_0.setEnabled( !inTrash );
          _jspx_th_liferay$1flags_flags_0.setLabel( false );
          _jspx_th_liferay$1flags_flags_0.setMessage( inTrash ? "flags-are-disabled-because-this-entry-is-in-the-recycle-bin" : null );
          _jspx_th_liferay$1flags_flags_0.setReportedUserId( assetRenderer.getUserId() );
          int _jspx_eval_liferay$1flags_flags_0 = _jspx_th_liferay$1flags_flags_0.doStartTag();
          if (_jspx_th_liferay$1flags_flags_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1flags_flags_0);
            _jspx_th_liferay$1flags_flags_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1flags_flags_0);
          _jspx_th_liferay$1flags_flags_0.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t");
        }
        if (_jspx_th_clay_content$1col_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_3);
          _jspx_th_clay_content$1col_3.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_3);
        _jspx_th_clay_content$1col_3.release();
        out.write("\n");
        out.write("\t\t\t\t\t");
}
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t");
if (
 assetPublisherDisplayContext.isEnablePrint() ) {
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        //  clay:content-col
        com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
        _jspx_th_clay_content$1col_4.setPageContext(_jspx_page_context);
        _jspx_th_clay_content$1col_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_1);
        _jspx_th_clay_content$1col_4.setCssClass("component-subtitle mr-3 print-action");
        int _jspx_eval_clay_content$1col_4 = _jspx_th_clay_content$1col_4.doStartTag();
        if (_jspx_eval_clay_content$1col_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");

							PortletURL printAssetURL = PortletURLBuilder.createRenderURL(
								renderResponse
							).setMVCPath(
								"/view_content.jsp"
							).setParameter(
								"assetEntryId", assetEntry.getEntryId()
							).setParameter(
								"languageId", LanguageUtil.getLanguageId(request)
							).setParameter(
								"type", assetRendererFactory.getType()
							).setParameter(
								"viewMode", Constants.PRINT
							).setWindowState(
								LiferayWindowState.POP_UP
							).buildPortletURL();

							String id = assetEntry.getEntryId() + StringUtil.randomId();
							
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
          //  liferay-ui:icon
          com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
          _jspx_th_liferay$1ui_icon_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_icon_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_4);
          _jspx_th_liferay$1ui_icon_0.setIcon("print");
          _jspx_th_liferay$1ui_icon_0.setLinkCssClass("btn btn-monospaced btn-outline-borderless btn-outline-secondary btn-sm");
          _jspx_th_liferay$1ui_icon_0.setMarkupView("lexicon");
          _jspx_th_liferay$1ui_icon_0.setMessage( LanguageUtil.format(request, "print-x-x", new Object[] {"hide-accessible", HtmlUtil.escape(title)}, false) );
          _jspx_th_liferay$1ui_icon_0.setUrl( "javascript:" + liferayPortletResponse.getNamespace() + "printPage_" + id + "();" );
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
          out.write("\t\t\t\t\t\t\t");
          //  aui:script
          com.liferay.taglib.aui.ScriptTag _jspx_th_aui_script_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ScriptTag.class) : new com.liferay.taglib.aui.ScriptTag();
          _jspx_th_aui_script_0.setPageContext(_jspx_page_context);
          _jspx_th_aui_script_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_4);
          int _jspx_eval_aui_script_0 = _jspx_th_aui_script_0.doStartTag();
          if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_aui_script_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_aui_script_0.doInitBody();
            }
            do {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\tfunction ");
              if (_jspx_meth_portlet_namespace_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
                return;
              out.write("printPage_");
              out.print( id );
              out.write("() {\n");
              out.write("\t\t\t\t\t\t\t\t\twindow.open(\n");
              out.write("\t\t\t\t\t\t\t\t\t\t'");
              out.print( printAssetURL );
              out.write("',\n");
              out.write("\t\t\t\t\t\t\t\t\t\t'',\n");
              out.write("\t\t\t\t\t\t\t\t\t\t'directories=0,height=480,left=80,location=1,menubar=1,resizable=1,scrollbars=yes,status=0,toolbar=0,top=180,width=640'\n");
              out.write("\t\t\t\t\t\t\t\t\t);\n");
              out.write("\t\t\t\t\t\t\t\t}\n");
              out.write("\t\t\t\t\t\t\t");
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
          out.write("\n");
          out.write("\t\t\t\t\t\t");
        }
        if (_jspx_th_clay_content$1col_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_4);
          _jspx_th_clay_content$1col_4.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_4);
        _jspx_th_clay_content$1col_4.release();
        out.write("\n");
        out.write("\t\t\t\t\t");
}
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t");
        //  clay:content-col
        com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
        _jspx_th_clay_content$1col_5.setPageContext(_jspx_page_context);
        _jspx_th_clay_content$1col_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_1);
        int _jspx_eval_clay_content$1col_5 = _jspx_th_clay_content$1col_5.doStartTag();
        if (_jspx_eval_clay_content$1col_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t\t\t\t");
          //  liferay-social-bookmarks:bookmarks
          com.liferay.social.bookmarks.taglib.servlet.taglib.SocialBookmarksTag _jspx_th_liferay$1social$1bookmarks_bookmarks_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.social.bookmarks.taglib.servlet.taglib.SocialBookmarksTag.class) : new com.liferay.social.bookmarks.taglib.servlet.taglib.SocialBookmarksTag();
          _jspx_th_liferay$1social$1bookmarks_bookmarks_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1social$1bookmarks_bookmarks_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_5);
          _jspx_th_liferay$1social$1bookmarks_bookmarks_0.setClassName( assetEntry.getClassName() );
          _jspx_th_liferay$1social$1bookmarks_bookmarks_0.setClassPK( assetEntry.getClassPK() );
          _jspx_th_liferay$1social$1bookmarks_bookmarks_0.setDisplayStyle( assetPublisherDisplayContext.getSocialBookmarksDisplayStyle() );
          _jspx_th_liferay$1social$1bookmarks_bookmarks_0.setTarget("_blank");
          _jspx_th_liferay$1social$1bookmarks_bookmarks_0.setTitle( title );
          _jspx_th_liferay$1social$1bookmarks_bookmarks_0.setTypes( assetPublisherDisplayContext.getSocialBookmarksTypes() );
          _jspx_th_liferay$1social$1bookmarks_bookmarks_0.setUrl( assetPublisherHelper.getAssetSocialURL(liferayPortletRequest, liferayPortletResponse, assetEntry) );
          int _jspx_eval_liferay$1social$1bookmarks_bookmarks_0 = _jspx_th_liferay$1social$1bookmarks_bookmarks_0.doStartTag();
          if (_jspx_th_liferay$1social$1bookmarks_bookmarks_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1social$1bookmarks_bookmarks_0);
            _jspx_th_liferay$1social$1bookmarks_bookmarks_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1social$1bookmarks_bookmarks_0);
          _jspx_th_liferay$1social$1bookmarks_bookmarks_0.release();
          out.write("\n");
          out.write("\t\t\t\t\t");
        }
        if (_jspx_th_clay_content$1col_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_5);
          _jspx_th_clay_content$1col_5.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_5);
        _jspx_th_clay_content$1col_5.release();
        out.write("\n");
        out.write("\t\t\t\t");
      }
      if (_jspx_th_clay_content$1row_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_1);
        _jspx_th_clay_content$1row_1.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_1);
      _jspx_th_clay_content$1row_1.release();
      out.write("\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
if (
 (assetPublisherDisplayContext.isShowAvailableLocales() && assetRenderer.isLocalizable()) || (assetPublisherDisplayContext.isEnableConversions() && assetRenderer.isConvertible()) ) {
      out.write("\n");
      out.write("\t\t\t\t<hr class=\"separator\" />\n");
      out.write("\n");
      out.write("\t\t\t\t");
      //  clay:content-row
      com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag _jspx_th_clay_content$1row_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag();
      _jspx_th_clay_content$1row_2.setPageContext(_jspx_page_context);
      _jspx_th_clay_content$1row_2.setParent(null);
      _jspx_th_clay_content$1row_2.setCssClass("asset-details");
      _jspx_th_clay_content$1row_2.setFloatElements("");
      _jspx_th_clay_content$1row_2.setVerticalAlign("center");
      int _jspx_eval_clay_content$1row_2 = _jspx_th_clay_content$1row_2.doStartTag();
      if (_jspx_eval_clay_content$1row_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t\t");
if (
 assetPublisherDisplayContext.isShowAvailableLocales() && assetRenderer.isLocalizable() ) {
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t");

						String languageId = LanguageUtil.getLanguageId(request);

						String[] availableLanguageIds = assetRenderer.getAvailableLanguageIds();

						if (ArrayUtil.isNotEmpty(availableLanguageIds) && !ArrayUtil.contains(availableLanguageIds, languageId)) {
							languageId = assetRenderer.getDefaultLanguageId();
						}
						
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t");
if (
 availableLanguageIds.length > 1 ) {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        //  clay:content-col
        com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
        _jspx_th_clay_content$1col_6.setPageContext(_jspx_page_context);
        _jspx_th_clay_content$1col_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_2);
        _jspx_th_clay_content$1col_6.setCssClass("locale-actions mr-3");
        int _jspx_eval_clay_content$1col_6 = _jspx_th_clay_content$1col_6.doStartTag();
        if (_jspx_eval_clay_content$1col_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t");
          //  liferay-ui:language
          com.liferay.taglib.ui.LanguageTag _jspx_th_liferay$1ui_language_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.LanguageTag.class) : new com.liferay.taglib.ui.LanguageTag();
          _jspx_th_liferay$1ui_language_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_language_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_6);
          _jspx_th_liferay$1ui_language_0.setFormAction( currentURL );
          _jspx_th_liferay$1ui_language_0.setLanguageId( languageId );
          _jspx_th_liferay$1ui_language_0.setLanguageIds( availableLanguageIds );
          int _jspx_eval_liferay$1ui_language_0 = _jspx_th_liferay$1ui_language_0.doStartTag();
          if (_jspx_th_liferay$1ui_language_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_language_0);
            _jspx_th_liferay$1ui_language_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_language_0);
          _jspx_th_liferay$1ui_language_0.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
        }
        if (_jspx_th_clay_content$1col_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_6);
          _jspx_th_clay_content$1col_6.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_6);
        _jspx_th_clay_content$1col_6.release();
        out.write("\n");
        out.write("\t\t\t\t\t\t");
}
        out.write("\n");
        out.write("\t\t\t\t\t");
}
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t");
if (
 assetPublisherDisplayContext.isEnableConversions() && assetRenderer.isConvertible() ) {
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t");

						PortletURL exportAssetURL = PortletURLBuilder.create(
							assetRenderer.getURLExport(liferayPortletRequest, liferayPortletResponse)
						).setPortletResource(
							portletDisplay.getId()
						).setParameter(
							"plid", themeDisplay.getPlid()
						).setWindowState(
							LiferayWindowState.EXCLUSIVE
						).buildPortletURL();

						for (String extension : assetPublisherDisplayContext.getExtensions(assetRenderer)) {
							exportAssetURL.setParameter("targetExtension", extension);

							Map<String, Object> data = HashMapBuilder.<String, Object>put(
								"resource-href", exportAssetURL.toString()
							).build();
						
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        //  clay:content-col
        com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
        _jspx_th_clay_content$1col_7.setPageContext(_jspx_page_context);
        _jspx_th_clay_content$1col_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_2);
        _jspx_th_clay_content$1col_7.setCssClass("export-action");
        int _jspx_eval_clay_content$1col_7 = _jspx_th_clay_content$1col_7.doStartTag();
        if (_jspx_eval_clay_content$1col_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t");
          //  aui:a
          com.liferay.taglib.aui.ATag _jspx_th_aui_a_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ATag.class) : new com.liferay.taglib.aui.ATag();
          _jspx_th_aui_a_0.setPageContext(_jspx_page_context);
          _jspx_th_aui_a_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_7);
          _jspx_th_aui_a_0.setCssClass("btn btn-outline-borderless btn-outline-secondary btn-sm");
          _jspx_th_aui_a_0.setData( data );
          _jspx_th_aui_a_0.setHref( exportAssetURL.toString() );
          _jspx_th_aui_a_0.setLabel( LanguageUtil.format(request, "x-convert-x-to-x", new Object[] {"hide-accessible", title, StringUtil.toUpperCase(HtmlUtil.escape(extension))}, false) );
          int _jspx_eval_aui_a_0 = _jspx_th_aui_a_0.doStartTag();
          if (_jspx_th_aui_a_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_0);
            _jspx_th_aui_a_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_0);
          _jspx_th_aui_a_0.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
        }
        if (_jspx_th_clay_content$1col_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_7);
          _jspx_th_clay_content$1col_7.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_7);
        _jspx_th_clay_content$1col_7.release();
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t");

						}
						
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t");
}
        out.write("\n");
        out.write("\t\t\t\t");
      }
      if (_jspx_th_clay_content$1row_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_2);
        _jspx_th_clay_content$1row_2.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_2);
      _jspx_th_clay_content$1row_2.release();
      out.write("\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
if (
 assetPublisherDisplayContext.isEnableComments() && assetRenderer.isCommentable() ) {
      out.write("\n");
      out.write("\t\t\t\t");
      //  clay:col
      com.liferay.frontend.taglib.clay.servlet.taglib.ColTag _jspx_th_clay_col_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ColTag();
      _jspx_th_clay_col_0.setPageContext(_jspx_page_context);
      _jspx_th_clay_col_0.setParent(null);
      _jspx_th_clay_col_0.setCssClass("mt-4");
      _jspx_th_clay_col_0.setMd("12");
      int _jspx_eval_clay_col_0 = _jspx_th_clay_col_0.doStartTag();
      if (_jspx_eval_clay_col_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t\t");
        //  liferay-comment:discussion
        com.liferay.comment.taglib.servlet.taglib.DiscussionTag _jspx_th_liferay$1comment_discussion_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.comment.taglib.servlet.taglib.DiscussionTag.class) : new com.liferay.comment.taglib.servlet.taglib.DiscussionTag();
        _jspx_th_liferay$1comment_discussion_0.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1comment_discussion_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
        _jspx_th_liferay$1comment_discussion_0.setClassName( assetEntry.getClassName() );
        _jspx_th_liferay$1comment_discussion_0.setClassPK( assetEntry.getClassPK() );
        _jspx_th_liferay$1comment_discussion_0.setFormName( "fm" + assetEntry.getClassPK() );
        _jspx_th_liferay$1comment_discussion_0.setRatingsEnabled( assetPublisherDisplayContext.isEnableCommentRatings() );
        _jspx_th_liferay$1comment_discussion_0.setRedirect( currentURL );
        _jspx_th_liferay$1comment_discussion_0.setUserId( assetRenderer.getUserId() );
        int _jspx_eval_liferay$1comment_discussion_0 = _jspx_th_liferay$1comment_discussion_0.doStartTag();
        if (_jspx_th_liferay$1comment_discussion_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1comment_discussion_0);
          _jspx_th_liferay$1comment_discussion_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1comment_discussion_0);
        _jspx_th_liferay$1comment_discussion_0.release();
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
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");

	}
	catch (Exception e) {
		_log.error(e.getMessage());
	}
}

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

  private boolean _jspx_meth_liferay$1ui_message_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent(null);
    _jspx_th_liferay$1ui_message_1.setKey("priority");
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
