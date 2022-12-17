package org.apache.jsp.asset_005fcategories_005fsummary;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.asset.kernel.model.AssetCategory;
import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.model.AssetVocabulary;
import com.liferay.asset.kernel.service.AssetCategoryServiceUtil;
import com.liferay.asset.kernel.service.AssetEntryLocalServiceUtil;
import com.liferay.asset.kernel.service.AssetVocabularyServiceUtil;
import com.liferay.depot.util.SiteConnectedGroupGroupProviderUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.ListUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.portlet.PortletURL;

public final class page_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


private String _buildCategoryPath(AssetCategory category, ThemeDisplay themeDisplay) throws PortalException, SystemException {
	List<AssetCategory> ancestorCategories = category.getAncestors();

	if (ancestorCategories.isEmpty()) {
		return HtmlUtil.escape(category.getTitle(themeDisplay.getLocale()));
	}

	Collections.reverse(ancestorCategories);

	StringBundler sb = new StringBundler(ancestorCategories.size() * 2 + 1);

	for (AssetCategory ancestorCategory : ancestorCategories) {
		sb.append(HtmlUtil.escape(ancestorCategory.getTitle(themeDisplay.getLocale())));
		sb.append(" &raquo; ");
	}

	sb.append(HtmlUtil.escape(category.getTitle(themeDisplay.getLocale())));

	return sb.toString();
}

private List<AssetCategory> _filterCategories(List<AssetCategory> categories, AssetVocabulary vocabulary, int[] visibleTypes) {
	List<AssetCategory> filteredCategories = new ArrayList<AssetCategory>();

	for (AssetCategory category : categories) {
		if ((category.getVocabularyId() == vocabulary.getVocabularyId()) && ArrayUtil.contains(visibleTypes, vocabulary.getVisibilityType())) {
			filteredCategories.add(category);
		}
	}

	return filteredCategories;
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/asset_categories_summary/init.jsp");
    _jspx_dependants.add("/META-INF/c.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-clay.tld");
    _jspx_dependants.add("/META-INF/liferay-theme.tld");
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

String className = (String)request.getAttribute("liferay-asset:asset-categories-summary:className");
long classPK = GetterUtil.getLong((String)request.getAttribute("liferay-asset:asset-categories-summary:classPK"));
String displayStyle = GetterUtil.getString((String)request.getAttribute("liferay-asset:asset-categories-summary:displayStyle"), "default");
String paramName = GetterUtil.getString((String)request.getAttribute("liferay-asset:asset-categories-summary:paramName"), "categoryId");
PortletURL portletURL = (PortletURL)request.getAttribute("liferay-asset:asset-categories-summary:portletURL");
int[] visibleTypes = (int[])request.getAttribute("liferay-asset:asset-categories-summary:visibleTypes");

List<AssetCategory> categories = (List<AssetCategory>)request.getAttribute("liferay-asset:asset-categories-summary:assetCategories");

if (ListUtil.isEmpty(categories)) {
	categories = AssetCategoryServiceUtil.getCategories(className, classPK);
}

AssetEntry assetEntry = AssetEntryLocalServiceUtil.fetchEntry(className, classPK);

List<AssetVocabulary> vocabularies = AssetVocabularyServiceUtil.getGroupVocabularies(SiteConnectedGroupGroupProviderUtil.getCurrentAndAncestorSiteAndDepotGroupIds((assetEntry != null) ? assetEntry.getGroupId() : scopeGroupId));

for (AssetVocabulary vocabulary : vocabularies) {
	List<AssetCategory> curCategories = _filterCategories(categories, vocabulary, visibleTypes);

      out.write("\n");
      out.write("\n");
      out.write("\t");
if (
 !curCategories.isEmpty() ) {
      out.write("\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t\t");
if (
 displayStyle.equals("simple-category") ) {
      out.write("\n");
      out.write("\t\t\t\t<span class=\"taglib-asset-categories-summary\">\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
if (
 portletURL != null ) {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");

							for (AssetCategory category : curCategories) {
								portletURL.setParameter(paramName, String.valueOf(category.getCategoryId()));
							
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"label label-dark label-lg text-uppercase\" href=\"");
      out.print( HtmlUtil.escape(portletURL.toString()) );
      out.write('"');
      out.write('>');
      out.print( HtmlUtil.escape(category.getTitle(themeDisplay.getLocale())) );
      out.write("</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");

							}
							
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
}
else {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");

							for (AssetCategory category : curCategories) {
							
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t");
      //  clay:label
      com.liferay.frontend.taglib.clay.servlet.taglib.LabelTag _jspx_th_clay_label_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.LabelTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.LabelTag();
      _jspx_th_clay_label_0.setPageContext(_jspx_page_context);
      _jspx_th_clay_label_0.setParent(null);
      _jspx_th_clay_label_0.setDisplayType("dark");
      _jspx_th_clay_label_0.setLabel( HtmlUtil.escape(category.getTitle(themeDisplay.getLocale())) );
      _jspx_th_clay_label_0.setLarge( true );
      _jspx_th_clay_label_0.setTranslated( false );
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
      out.write("\t\t\t\t\t\t\t");

							}
							
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t");
}
else {
      out.write("\n");
      out.write("\t\t\t\t<span class=\"taglib-asset-categories-summary\">\n");
      out.write("\t\t\t\t\t");
      out.print( HtmlUtil.escape(vocabulary.getUnambiguousTitle(vocabularies, themeDisplay.getSiteGroupId(), themeDisplay.getLocale())) );
      out.write(":\n");
      out.write("\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
if (
 portletURL != null ) {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");

							for (AssetCategory category : curCategories) {
								portletURL.setParameter(paramName, String.valueOf(category.getCategoryId()));
							
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"asset-category mb-1 mr-1 pr-2 text-uppercase\" href=\"");
      out.print( HtmlUtil.escape(portletURL.toString()) );
      out.write('"');
      out.write('>');
      out.print( _buildCategoryPath(category, themeDisplay) );
      out.write("</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");

							}
							
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
}
else {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");

							for (AssetCategory category : curCategories) {
							
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"asset-category mb-1 mr-1 pr-2 text-uppercase\">\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.print( _buildCategoryPath(category, themeDisplay) );
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");

							}
							
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t");
}
      out.write('\n');
      out.write('	');
}
      out.write('\n');
      out.write('\n');

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
}
