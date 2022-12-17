package org.apache.jsp.product_005fpublisher.render.list.entry;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.asset.kernel.exception.DuplicateQueryRuleException;
import com.liferay.commerce.account.model.CommerceAccount;
import com.liferay.commerce.constants.CPDefinitionInventoryConstants;
import com.liferay.commerce.constants.CommerceWebKeys;
import com.liferay.commerce.context.CommerceContext;
import com.liferay.commerce.model.CommerceOrder;
import com.liferay.commerce.product.catalog.CPCatalogEntry;
import com.liferay.commerce.product.catalog.CPSku;
import com.liferay.commerce.product.constants.CPWebKeys;
import com.liferay.commerce.product.content.constants.CPContentWebKeys;
import com.liferay.commerce.product.content.render.CPContentRenderer;
import com.liferay.commerce.product.content.render.list.CPContentListRenderer;
import com.liferay.commerce.product.content.render.list.entry.CPContentListEntryRenderer;
import com.liferay.commerce.product.content.util.CPCompareContentHelper;
import com.liferay.commerce.product.content.util.CPContentHelper;
import com.liferay.commerce.product.content.util.CPMedia;
import com.liferay.commerce.product.content.web.internal.constants.CPCompareContentConstants;
import com.liferay.commerce.product.content.web.internal.constants.CPCompareContentMiniConstants;
import com.liferay.commerce.product.content.web.internal.constants.CPContentFDSNames;
import com.liferay.commerce.product.content.web.internal.constants.CPContentPortletConstants;
import com.liferay.commerce.product.content.web.internal.constants.CPPublisherConstants;
import com.liferay.commerce.product.content.web.internal.display.context.CPCompareContentDisplayContext;
import com.liferay.commerce.product.content.web.internal.display.context.CPCompareContentMiniDisplayContext;
import com.liferay.commerce.product.content.web.internal.display.context.CPContentConfigurationDisplayContext;
import com.liferay.commerce.product.content.web.internal.display.context.CPPublisherConfigurationDisplayContext;
import com.liferay.commerce.product.content.web.internal.display.context.CPPublisherDisplayContext;
import com.liferay.commerce.product.content.web.internal.portlet.CPCompareContentMiniPortlet;
import com.liferay.commerce.product.content.web.internal.portlet.CPCompareContentPortlet;
import com.liferay.commerce.product.content.web.internal.portlet.CPContentPortlet;
import com.liferay.commerce.product.content.web.internal.portlet.CPPublisherPortlet;
import com.liferay.commerce.product.data.source.CPDataSource;
import com.liferay.commerce.product.data.source.CPDataSourceResult;
import com.liferay.commerce.product.model.CPDefinitionSpecificationOptionValue;
import com.liferay.commerce.product.model.CPInstance;
import com.liferay.commerce.product.model.CPOptionCategory;
import com.liferay.commerce.product.model.CPSpecificationOption;
import com.liferay.commerce.product.type.CPType;
import com.liferay.commerce.product.type.grouped.constants.GroupedCPTypeWebKeys;
import com.liferay.commerce.product.type.grouped.util.GroupedCPTypeHelper;
import com.liferay.commerce.product.type.virtual.constants.VirtualCPTypeWebKeys;
import com.liferay.commerce.product.type.virtual.util.VirtualCPTypeHelper;
import com.liferay.commerce.util.CommerceUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.dao.search.ResultRow;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.frontend.icons.FrontendIconsUtil;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.FastDateFormatFactoryUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import java.text.Format;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.portlet.PortletURL;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
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

String languageId = LanguageUtil.getLanguageId(locale);

      out.write('\n');
      out.write('\n');

CPContentHelper cpContentHelper = (CPContentHelper)request.getAttribute(CPContentWebKeys.CP_CONTENT_HELPER);

CPCatalogEntry cpCatalogEntry = cpContentHelper.getCPCatalogEntry(request);

CPSku cpSku = cpContentHelper.getDefaultCPSku(cpCatalogEntry);

String productDetailURL = cpContentHelper.getFriendlyURL(cpCatalogEntry, themeDisplay);

      out.write("\n");
      out.write("\n");
      out.write("<div class=\"cp-renderer\">\n");
      out.write("\t");
      if (_jspx_meth_liferay$1util_dynamic$1include_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t<div class=\"card d-flex flex-column product-card\">\n");
      out.write("\t\t<div class=\"card-item-first position-relative\">\n");
      out.write("\t\t\t<a href=\"");
      out.print( productDetailURL );
      out.write("\">\n");
      out.write("\t\t\t\t");
      //  liferay-adaptive-media:img
      com.liferay.adaptive.media.image.taglib.servlet.taglib.AMImageImgTag _jspx_th_liferay$1adaptive$1media_img_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.adaptive.media.image.taglib.servlet.taglib.AMImageImgTag.class) : new com.liferay.adaptive.media.image.taglib.servlet.taglib.AMImageImgTag();
      _jspx_th_liferay$1adaptive$1media_img_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1adaptive$1media_img_0.setParent(null);
      _jspx_th_liferay$1adaptive$1media_img_0.setDynamicAttribute(null, "class", new String("img-fluid product-card-picture"));
      _jspx_th_liferay$1adaptive$1media_img_0.setFileVersion( cpContentHelper.getCPDefinitionImageFileVersion(cpCatalogEntry.getCPDefinitionId(), request) );
      int _jspx_eval_liferay$1adaptive$1media_img_0 = _jspx_th_liferay$1adaptive$1media_img_0.doStartTag();
      if (_jspx_th_liferay$1adaptive$1media_img_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1adaptive$1media_img_0);
        _jspx_th_liferay$1adaptive$1media_img_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1adaptive$1media_img_0);
      _jspx_th_liferay$1adaptive$1media_img_0.release();
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"aspect-ratio-item-bottom-left\">\n");
      out.write("\t\t\t\t\t");
      //  commerce-ui:availability-label
      com.liferay.commerce.frontend.taglib.servlet.taglib.AvailabilityLabelTag _jspx_th_commerce$1ui_availability$1label_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.commerce.frontend.taglib.servlet.taglib.AvailabilityLabelTag.class) : new com.liferay.commerce.frontend.taglib.servlet.taglib.AvailabilityLabelTag();
      _jspx_th_commerce$1ui_availability$1label_0.setPageContext(_jspx_page_context);
      _jspx_th_commerce$1ui_availability$1label_0.setParent(null);
      _jspx_th_commerce$1ui_availability$1label_0.setCPCatalogEntry( cpCatalogEntry );
      int _jspx_eval_commerce$1ui_availability$1label_0 = _jspx_th_commerce$1ui_availability$1label_0.doStartTag();
      if (_jspx_th_commerce$1ui_availability$1label_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_commerce$1ui_availability$1label_0);
        _jspx_th_commerce$1ui_availability$1label_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_commerce$1ui_availability$1label_0);
      _jspx_th_commerce$1ui_availability$1label_0.release();
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"card-body d-flex flex-column justify-content-between py-2\">\n");
      out.write("\t\t\t<div class=\"cp-information\">\n");
      out.write("\t\t\t\t<p class=\"card-subtitle\" title=\"");
      out.print( (cpSku == null) ? StringPool.BLANK : cpSku.getSku() );
      out.write("\">\n");
      out.write("\t\t\t\t\t<span class=\"text-truncate-inline\">\n");
      out.write("\t\t\t\t\t\t<span class=\"text-truncate\">");
      out.print( (cpSku == null) ? StringPool.BLANK : cpSku.getSku() );
      out.write("</span>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t\t<p class=\"card-title\" title=\"");
      out.print( cpCatalogEntry.getName() );
      out.write("\">\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.print( productDetailURL );
      out.write("\">\n");
      out.write("\t\t\t\t\t\t<span class=\"text-truncate-inline\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"text-truncate\">");
      out.print( cpCatalogEntry.getName() );
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t\t<p class=\"card-text\">\n");
      out.write("\t\t\t\t\t<span class=\"text-truncate-inline\">\n");
      out.write("\t\t\t\t\t\t<span class=\"d-flex flex-row text-truncate\">\n");
      out.write("\t\t\t\t\t\t\t");
      //  commerce-ui:price
      com.liferay.commerce.frontend.taglib.servlet.taglib.PriceTag _jspx_th_commerce$1ui_price_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.commerce.frontend.taglib.servlet.taglib.PriceTag.class) : new com.liferay.commerce.frontend.taglib.servlet.taglib.PriceTag();
      _jspx_th_commerce$1ui_price_0.setPageContext(_jspx_page_context);
      _jspx_th_commerce$1ui_price_0.setParent(null);
      _jspx_th_commerce$1ui_price_0.setCompact( true );
      _jspx_th_commerce$1ui_price_0.setCPCatalogEntry( cpCatalogEntry );
      int _jspx_eval_commerce$1ui_price_0 = _jspx_th_commerce$1ui_price_0.doStartTag();
      if (_jspx_th_commerce$1ui_price_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_commerce$1ui_price_0);
        _jspx_th_commerce$1ui_price_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_commerce$1ui_price_0);
      _jspx_th_commerce$1ui_price_0.release();
      out.write("\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
if (
 (cpSku == null) || cpContentHelper.hasCPDefinitionOptionRels(cpCatalogEntry.getCPDefinitionId()) ) {
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"add-to-cart d-flex my-2 pt-5\" id=\"");
      out.print( PortalUtil.generateRandomKey(request, "taglib") + StringPool.UNDERLINE );
      out.write("add_to_cart\">\n");
      out.write("\t\t\t\t\t\t\t<a class=\"btn btn-block btn-secondary\" href=\"");
      out.print( productDetailURL );
      out.write("\" role=\"button\" style=\"margin-top: 0.35rem;\">\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_liferay$1ui_message_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
}
else {
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"mt-2\">\n");
      out.write("\t\t\t\t\t\t\t");
      //  commerce-ui:add-to-cart
      com.liferay.commerce.frontend.taglib.servlet.taglib.AddToCartTag _jspx_th_commerce$1ui_add$1to$1cart_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.commerce.frontend.taglib.servlet.taglib.AddToCartTag.class) : new com.liferay.commerce.frontend.taglib.servlet.taglib.AddToCartTag();
      _jspx_th_commerce$1ui_add$1to$1cart_0.setPageContext(_jspx_page_context);
      _jspx_th_commerce$1ui_add$1to$1cart_0.setParent(null);
      _jspx_th_commerce$1ui_add$1to$1cart_0.setAlignment("full-width");
      _jspx_th_commerce$1ui_add$1to$1cart_0.setCPCatalogEntry( cpCatalogEntry );
      _jspx_th_commerce$1ui_add$1to$1cart_0.setInline( false );
      _jspx_th_commerce$1ui_add$1to$1cart_0.setSize("md");
      _jspx_th_commerce$1ui_add$1to$1cart_0.setSkuOptions("[]");
      int _jspx_eval_commerce$1ui_add$1to$1cart_0 = _jspx_th_commerce$1ui_add$1to$1cart_0.doStartTag();
      if (_jspx_th_commerce$1ui_add$1to$1cart_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_commerce$1ui_add$1to$1cart_0);
        _jspx_th_commerce$1ui_add$1to$1cart_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_commerce$1ui_add$1to$1cart_0);
      _jspx_th_commerce$1ui_add$1to$1cart_0.release();
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"autofit-float autofit-row autofit-row-center compare-wishlist\">\n");
      out.write("\t\t\t\t\t<div class=\"autofit-col autofit-col-expand compare-checkbox\">\n");
      out.write("\t\t\t\t\t\t<div class=\"autofit-section\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"custom-checkbox custom-control custom-control-primary\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"custom-checkbox custom-control\">\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      //  commerce-ui:compare-checkbox
      com.liferay.commerce.frontend.taglib.servlet.taglib.CompareCheckboxTag _jspx_th_commerce$1ui_compare$1checkbox_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.commerce.frontend.taglib.servlet.taglib.CompareCheckboxTag.class) : new com.liferay.commerce.frontend.taglib.servlet.taglib.CompareCheckboxTag();
      _jspx_th_commerce$1ui_compare$1checkbox_0.setPageContext(_jspx_page_context);
      _jspx_th_commerce$1ui_compare$1checkbox_0.setParent(null);
      _jspx_th_commerce$1ui_compare$1checkbox_0.setCPCatalogEntry( cpCatalogEntry );
      _jspx_th_commerce$1ui_compare$1checkbox_0.setLabel( LanguageUtil.get(request, "compare") );
      int _jspx_eval_commerce$1ui_compare$1checkbox_0 = _jspx_th_commerce$1ui_compare$1checkbox_0.doStartTag();
      if (_jspx_th_commerce$1ui_compare$1checkbox_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_commerce$1ui_compare$1checkbox_0);
        _jspx_th_commerce$1ui_compare$1checkbox_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_commerce$1ui_compare$1checkbox_0);
      _jspx_th_commerce$1ui_compare$1checkbox_0.release();
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"autofit-col\">\n");
      out.write("\t\t\t\t\t\t<div class=\"autofit-section\">\n");
      out.write("\t\t\t\t\t\t\t");
      //  commerce-ui:add-to-wish-list
      com.liferay.commerce.frontend.taglib.servlet.taglib.AddToWishListTag _jspx_th_commerce$1ui_add$1to$1wish$1list_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.commerce.frontend.taglib.servlet.taglib.AddToWishListTag.class) : new com.liferay.commerce.frontend.taglib.servlet.taglib.AddToWishListTag();
      _jspx_th_commerce$1ui_add$1to$1wish$1list_0.setPageContext(_jspx_page_context);
      _jspx_th_commerce$1ui_add$1to$1wish$1list_0.setParent(null);
      _jspx_th_commerce$1ui_add$1to$1wish$1list_0.setCPCatalogEntry( cpCatalogEntry );
      int _jspx_eval_commerce$1ui_add$1to$1wish$1list_0 = _jspx_th_commerce$1ui_add$1to$1wish$1list_0.doStartTag();
      if (_jspx_th_commerce$1ui_add$1to$1wish$1list_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_commerce$1ui_add$1to$1wish$1list_0);
        _jspx_th_commerce$1ui_add$1to$1wish$1list_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_commerce$1ui_add$1to$1wish$1list_0);
      _jspx_th_commerce$1ui_add$1to$1wish$1list_0.release();
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t");
      if (_jspx_meth_liferay$1util_dynamic$1include_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</div>");
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

  private boolean _jspx_meth_liferay$1util_dynamic$1include_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-util:dynamic-include
    com.liferay.taglib.util.DynamicIncludeTag _jspx_th_liferay$1util_dynamic$1include_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.DynamicIncludeTag.class) : new com.liferay.taglib.util.DynamicIncludeTag();
    _jspx_th_liferay$1util_dynamic$1include_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1util_dynamic$1include_0.setParent(null);
    _jspx_th_liferay$1util_dynamic$1include_0.setKey("com.liferay.commerce.product.content.web#/add_to_cart#pre");
    int _jspx_eval_liferay$1util_dynamic$1include_0 = _jspx_th_liferay$1util_dynamic$1include_0.doStartTag();
    if (_jspx_th_liferay$1util_dynamic$1include_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_dynamic$1include_0);
      _jspx_th_liferay$1util_dynamic$1include_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_dynamic$1include_0);
    _jspx_th_liferay$1util_dynamic$1include_0.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent(null);
    _jspx_th_liferay$1ui_message_0.setKey("view-all-variants");
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

  private boolean _jspx_meth_liferay$1util_dynamic$1include_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-util:dynamic-include
    com.liferay.taglib.util.DynamicIncludeTag _jspx_th_liferay$1util_dynamic$1include_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.DynamicIncludeTag.class) : new com.liferay.taglib.util.DynamicIncludeTag();
    _jspx_th_liferay$1util_dynamic$1include_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1util_dynamic$1include_1.setParent(null);
    _jspx_th_liferay$1util_dynamic$1include_1.setKey("com.liferay.commerce.product.content.web#/add_to_cart#post");
    int _jspx_eval_liferay$1util_dynamic$1include_1 = _jspx_th_liferay$1util_dynamic$1include_1.doStartTag();
    if (_jspx_th_liferay$1util_dynamic$1include_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_dynamic$1include_1);
      _jspx_th_liferay$1util_dynamic$1include_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_dynamic$1include_1);
    _jspx_th_liferay$1util_dynamic$1include_1.release();
    return false;
  }
}
