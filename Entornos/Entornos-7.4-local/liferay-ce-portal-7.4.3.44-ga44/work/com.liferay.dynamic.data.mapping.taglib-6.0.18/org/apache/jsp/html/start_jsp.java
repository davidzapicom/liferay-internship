package org.apache.jsp.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.portal.kernel.portlet.url.builder.PortletURLBuilder;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.model.Group;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.portlet.PortletRequest;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.dynamic.data.mapping.model.DDMForm;
import com.liferay.dynamic.data.mapping.render.DDMFormFieldRenderingContext;
import com.liferay.dynamic.data.mapping.render.DDMFormRendererUtil;
import com.liferay.dynamic.data.mapping.storage.DDMFormValues;
import com.liferay.dynamic.data.mapping.storage.Fields;
import com.liferay.dynamic.data.mapping.util.DDMUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.util.PortalUtil;

public final class start_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


private static Object _deserialize(Object obj) {
	if (obj != null) {
		String json = JSONFactoryUtil.looseSerialize(obj);

		json = StringUtil.unquote(json);

		return JSONFactoryUtil.looseDeserialize(json);
	}

	return null;
}

private static ArrayList<Object> _toArrayList(Object obj) {
	return (ArrayList<Object>)_deserialize(obj);
}

private static HashMap<String, Object> _toHashMap(Object obj) {
	return (HashMap<String, Object>)_deserialize(obj);
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(11);
    _jspx_dependants.add("/html/init.jsp");
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/META-INF/liferay-util.tld");
    _jspx_dependants.add("/init-ext.jspf");
    _jspx_dependants.add("/META-INF/c.tld");
    _jspx_dependants.add("/META-INF/liferay-portlet_2_0.tld");
    _jspx_dependants.add("/META-INF/liferay-aui.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-clay.tld");
    _jspx_dependants.add("/META-INF/liferay-theme.tld");
    _jspx_dependants.add("/META-INF/liferay-ui.tld");
    _jspx_dependants.add("/html/init-ext.jspf");
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
      out.write('\n');
      out.write('\n');

boolean checkRequired = GetterUtil.getBoolean(String.valueOf(request.getAttribute("liferay-ddm:html:checkRequired")), true);
long classNameId = GetterUtil.getLong(String.valueOf(request.getAttribute("liferay-ddm:html:classNameId")));
long classPK = GetterUtil.getLong(String.valueOf(request.getAttribute("liferay-ddm:html:classPK")));
com.liferay.dynamic.data.mapping.storage.DDMFormValues ddmFormValues = (com.liferay.dynamic.data.mapping.storage.DDMFormValues)request.getAttribute("liferay-ddm:html:ddmFormValues");
java.util.Locale defaultEditLocale = (java.util.Locale)request.getAttribute("liferay-ddm:html:defaultEditLocale");
java.util.Locale defaultLocale = (java.util.Locale)request.getAttribute("liferay-ddm:html:defaultLocale");
java.lang.String documentLibrarySelectorURL = GetterUtil.getString((java.lang.String)request.getAttribute("liferay-ddm:html:documentLibrarySelectorURL"));
java.lang.String fieldsNamespace = GetterUtil.getString((java.lang.String)request.getAttribute("liferay-ddm:html:fieldsNamespace"));
long groupId = GetterUtil.getLong(String.valueOf(request.getAttribute("liferay-ddm:html:groupId")));
boolean ignoreRequestValue = GetterUtil.getBoolean(String.valueOf(request.getAttribute("liferay-ddm:html:ignoreRequestValue")));
java.lang.String imageSelectorURL = GetterUtil.getString((java.lang.String)request.getAttribute("liferay-ddm:html:imageSelectorURL"));
boolean localizable = GetterUtil.getBoolean(String.valueOf(request.getAttribute("liferay-ddm:html:localizable")), true);
boolean readOnly = GetterUtil.getBoolean(String.valueOf(request.getAttribute("liferay-ddm:html:readOnly")));
boolean repeatable = GetterUtil.getBoolean(String.valueOf(request.getAttribute("liferay-ddm:html:repeatable")), true);
java.util.Locale requestedLocale = (java.util.Locale)request.getAttribute("liferay-ddm:html:requestedLocale");
boolean showEmptyFieldLabel = GetterUtil.getBoolean(String.valueOf(request.getAttribute("liferay-ddm:html:showEmptyFieldLabel")), true);
boolean showLanguageSelector = GetterUtil.getBoolean(String.valueOf(request.getAttribute("liferay-ddm:html:showLanguageSelector")), true);
boolean synchronousFormSubmission = GetterUtil.getBoolean(String.valueOf(request.getAttribute("liferay-ddm:html:synchronousFormSubmission")), true);
Map<String, Object> dynamicAttributes = (Map<String, Object>)request.getAttribute("liferay-ddm:html:dynamicAttributes");

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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

DDMForm ddmForm = (DDMForm)request.getAttribute("liferay-ddm:html:ddmForm");
String ddmFormValuesInputName = (String)request.getAttribute("liferay-ddm:html:ddmFormValuesInputName");
Fields fields = (Fields)request.getAttribute("liferay-ddm:html:fields");
String mode = (String)request.getAttribute("liferay-ddm:html:mode");

String randomNamespace = PortalUtil.generateRandomKey(request, "taglib_ddm_init-ext");

if (requestedLocale == null) {
	requestedLocale = locale;
}

String hideCssClass = "";

if (!localizable || readOnly) {
	hideCssClass = "hide";
}

      out.write('\n');
      out.write('\n');
      if (_jspx_meth_liferay$1util_dynamic$1include_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"lfr-ddm-container\" id=\"");
      out.print( randomNamespace );
      out.write("\">\n");
      out.write("\t");
if (
 ddmForm != null ) {
      out.write("\n");
      out.write("\t\t<div class=\"input-group-item input-group-item-shrink input-localized-content ");
      out.print( hideCssClass );
      out.write("\" role=\"menu\" style=\"justify-content: flex-end;\">\n");
      out.write("\n");
      out.write("\t\t\t");

			String defaultLanguageId = null;

			if (defaultEditLocale == null) {
				defaultLanguageId = LocaleUtil.toLanguageId(ddmForm.getDefaultLocale());
			}
			else {
				defaultLanguageId = LocaleUtil.toLanguageId(defaultEditLocale);
			}

			String normalizedDefaultLanguageId = StringUtil.replace(defaultLanguageId, '_', '-');
			
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
      //  liferay-ui:icon-menu
      com.liferay.taglib.ui.IconMenuTag _jspx_th_liferay$1ui_icon$1menu_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconMenuTag.class) : new com.liferay.taglib.ui.IconMenuTag();
      _jspx_th_liferay$1ui_icon$1menu_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_icon$1menu_0.setParent(null);
      _jspx_th_liferay$1ui_icon$1menu_0.setDirection("left-side");
      _jspx_th_liferay$1ui_icon$1menu_0.setIcon( StringUtil.toLowerCase(normalizedDefaultLanguageId) );
      _jspx_th_liferay$1ui_icon$1menu_0.setId( fieldsNamespace + "Menu" );
      _jspx_th_liferay$1ui_icon$1menu_0.setMarkupView("lexicon");
      _jspx_th_liferay$1ui_icon$1menu_0.setMessage( StringPool.BLANK );
      _jspx_th_liferay$1ui_icon$1menu_0.setShowWhenSingleIcon( true );
      _jspx_th_liferay$1ui_icon$1menu_0.setTriggerCssClass("input-localized-trigger");
      _jspx_th_liferay$1ui_icon$1menu_0.setTriggerLabel( normalizedDefaultLanguageId );
      _jspx_th_liferay$1ui_icon$1menu_0.setTriggerType("button");
      int _jspx_eval_liferay$1ui_icon$1menu_0 = _jspx_th_liferay$1ui_icon$1menu_0.doStartTag();
      if (_jspx_eval_liferay$1ui_icon$1menu_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_liferay$1ui_icon$1menu_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_liferay$1ui_icon$1menu_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_liferay$1ui_icon$1menu_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\t\t\t\t<div id=\"");
          if (_jspx_meth_portlet_namespace_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_icon$1menu_0, _jspx_page_context))
            return;
          out.print( fieldsNamespace );
          out.write("PaletteBoundingBox\">\n");
          out.write("\t\t\t\t\t<div class=\"input-localized-palette-container palette-container\" id=\"");
          if (_jspx_meth_portlet_namespace_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_icon$1menu_0, _jspx_page_context))
            return;
          out.print( fieldsNamespace );
          out.write("PaletteContentBox\">\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t");

						LinkedHashSet<String> uniqueLanguageIds = new LinkedHashSet<String>();

						uniqueLanguageIds.add(defaultLanguageId);

						Set<Locale> availableLocales = null;

						if (defaultEditLocale == null) {
							availableLocales = ddmForm.getAvailableLocales();
						}
						else {
							availableLocales = LanguageUtil.getAvailableLocales(groupId);
						}

						for (Locale availableLocale : availableLocales) {
							String curLanguageId = LocaleUtil.toLanguageId(availableLocale);

							uniqueLanguageIds.add(curLanguageId);
						}

						int index = 0;

						for (String curLanguageId : uniqueLanguageIds) {
							String linkCssClass = "dropdown-item palette-item";

							Locale curLocale = LocaleUtil.fromLanguageId(curLanguageId);
						
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
if (
 showLanguageSelector ) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t");
          //  liferay-ui:icon
          com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
          _jspx_th_liferay$1ui_icon_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_icon_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_icon$1menu_0);
          _jspx_th_liferay$1ui_icon_0.setAlt( HtmlUtil.escapeAttribute(curLocale.getDisplayName(LocaleUtil.fromLanguageId(LanguageUtil.getLanguageId(request)))) + " " + LanguageUtil.get(LocaleUtil.getDefault(), "translation") );
          _jspx_th_liferay$1ui_icon_0.setData(
										HashMapBuilder.<String, Object>put(
											"index", index++
										).put(
											"languageid", curLanguageId
										).put(
											"value", curLanguageId
										).build()
									);
          _jspx_th_liferay$1ui_icon_0.setIcon( StringUtil.toLowerCase(StringUtil.replace(curLanguageId, '_', '-')) );
          _jspx_th_liferay$1ui_icon_0.setIconCssClass("inline-item inline-item-before");
          _jspx_th_liferay$1ui_icon_0.setLinkCssClass( linkCssClass );
          _jspx_th_liferay$1ui_icon_0.setMarkupView("lexicon");
          _jspx_th_liferay$1ui_icon_0.setMessage( StringUtil.replace(curLanguageId, '_', '-') );
          _jspx_th_liferay$1ui_icon_0.setOnClick("event.preventDefault(); fireLocaleChanged(event);");
          _jspx_th_liferay$1ui_icon_0.setUrl("javascript:void(0);");
          int _jspx_eval_liferay$1ui_icon_0 = _jspx_th_liferay$1ui_icon_0.doStartTag();
          if (_jspx_eval_liferay$1ui_icon_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t");
          }
          if (_jspx_th_liferay$1ui_icon_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_0);
            _jspx_th_liferay$1ui_icon_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_0);
          _jspx_th_liferay$1ui_icon_0.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t");

						}
						
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_liferay$1ui_icon$1menu_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_liferay$1ui_icon$1menu_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_liferay$1ui_icon$1menu_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon$1menu_0);
        _jspx_th_liferay$1ui_icon$1menu_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon$1menu_0);
      _jspx_th_liferay$1ui_icon$1menu_0.release();
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t");

		request.setAttribute("checkRequired", checkRequired);

		DDMFormFieldRenderingContext ddmFormFieldRenderingContext = new DDMFormFieldRenderingContext();

		ddmFormFieldRenderingContext.setFields(fields);
		ddmFormFieldRenderingContext.setHttpServletRequest(request);
		ddmFormFieldRenderingContext.setHttpServletResponse(response);
		ddmFormFieldRenderingContext.setLocale(requestedLocale);
		ddmFormFieldRenderingContext.setMode(mode);
		ddmFormFieldRenderingContext.setNamespace(fieldsNamespace);
		ddmFormFieldRenderingContext.setPortletNamespace(liferayPortletResponse.getNamespace());
		ddmFormFieldRenderingContext.setReadOnly(readOnly);
		ddmFormFieldRenderingContext.setShowEmptyFieldLabel(showEmptyFieldLabel);
		
      out.write("\n");
      out.write("\n");
      out.write("\t\t");
      out.print( DDMFormRendererUtil.render(ddmForm, ddmFormFieldRenderingContext) );
      out.write("\n");
      out.write("\n");
      out.write("\t\t");
      //  aui:input
      com.liferay.taglib.aui.InputTag _jspx_th_aui_input_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
      _jspx_th_aui_input_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_input_0.setParent(null);
      _jspx_th_aui_input_0.setName( HtmlUtil.getAUICompatibleId(ddmFormValuesInputName) );
      _jspx_th_aui_input_0.setType("hidden");
      int _jspx_eval_aui_input_0 = _jspx_th_aui_input_0.doStartTag();
      if (_jspx_th_aui_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_0);
        _jspx_th_aui_input_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_0);
      _jspx_th_aui_input_0.release();
      out.write("\n");
      out.write("\n");
      out.write("\t\t");
      //  aui:script
      com.liferay.taglib.aui.ScriptTag _jspx_th_aui_script_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ScriptTag.class) : new com.liferay.taglib.aui.ScriptTag();
      _jspx_th_aui_script_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_script_0.setParent(null);
      _jspx_th_aui_script_0.setUse("aui-base,liferay-ddm-form");
      int _jspx_eval_aui_script_0 = _jspx_th_aui_script_0.doStartTag();
      if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_aui_script_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_aui_script_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\t\t\tvar Lang = A.Lang;\n");
          out.write("\n");
          out.write("\t\t\tvar ddmFormDefinition = ");
          out.print( DDMUtil.getDDMFormJSONString(ddmForm) );
          out.write(";\n");
          out.write("\n");
          out.write("\t\t\t");

			if (defaultLocale != null) {
			
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\tddmFormDefinition.defaultLanguageId =\n");
          out.write("\t\t\t\t\t'");
          out.print( LocaleUtil.toLanguageId(defaultLocale) );
          out.write("';\n");
          out.write("\n");
          out.write("\t\t\t");

			}

			Group group = themeDisplay.getScopeGroup();
			
          out.write("\n");
          out.write("\n");
          out.write("\t\t\tvar liferayDDMForm = Liferay.component(\n");
          out.write("\t\t\t\t'");
          if (_jspx_meth_portlet_namespace_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.print( HtmlUtil.escapeJS(fieldsNamespace) );
          out.write("ddmForm',\n");
          out.write("\t\t\t\tnew Liferay.DDM.Form({\n");
          out.write("\t\t\t\t\tcontainer: '#");
          out.print( randomNamespace );
          out.write("',\n");
          out.write("\t\t\t\t\tddmFormValuesInput:\n");
          out.write("\t\t\t\t\t\t'#");
          if (_jspx_meth_portlet_namespace_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.print( HtmlUtil.getAUICompatibleId(ddmFormValuesInputName) );
          out.write("',\n");
          out.write("\t\t\t\t\tdefaultEditLocale:\n");
          out.write("\t\t\t\t\t\t'");
          out.print( (defaultEditLocale == null) ? StringPool.BLANK : HtmlUtil.escapeJS(defaultEditLocale.toString()) );
          out.write("',\n");
          out.write("\t\t\t\t\tdocumentLibrarySelectorURL: '");
          out.print( documentLibrarySelectorURL );
          out.write("',\n");
          out.write("\t\t\t\t\tdefinition: ddmFormDefinition,\n");
          out.write("\t\t\t\t\tdoAsGroupId: ");
          out.print( scopeGroupId );
          out.write(",\n");
          out.write("\t\t\t\t\tfieldsNamespace: '");
          out.print( HtmlUtil.escapeJS(fieldsNamespace) );
          out.write("',\n");
          out.write("\t\t\t\t\timageSelectorURL: '");
          out.print( imageSelectorURL );
          out.write("',\n");
          out.write("\t\t\t\t\tisPrivateLayoutsEnabled: ");
          out.print( group.isPrivateLayoutsEnabled() );
          out.write(",\n");
          out.write("\t\t\t\t\tmode: '");
          out.print( HtmlUtil.escapeJS(mode) );
          out.write("',\n");
          out.write("\t\t\t\t\tp_l_id: ");
          out.print( themeDisplay.getPlid() );
          out.write(",\n");
          out.write("\t\t\t\t\tportletNamespace: '");
          if (_jspx_meth_portlet_namespace_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("',\n");
          out.write("\t\t\t\t\trepeatable: ");
          out.print( repeatable );
          out.write(",\n");
          out.write("\t\t\t\t\trequestedLocale:\n");
          out.write("\t\t\t\t\t\t'");
          out.print( (requestedLocale == null) ? StringPool.BLANK : HtmlUtil.escapeJS(requestedLocale.toString()) );
          out.write("',\n");
          out.write("\t\t\t\t\tsynchronousFormSubmission: ");
          out.print( synchronousFormSubmission );
          out.write(",\n");
          out.write("\n");
          out.write("\t\t\t\t\t");
if (
 ddmFormValues != null ) {
          out.write("\n");
          out.write("\t\t\t\t\t\tvalues: ");
          out.print( DDMUtil.getDDMFormValuesJSONString(ddmFormValues) );
          out.write(",\n");
          out.write("\t\t\t\t\t");
}
          out.write("\n");
          out.write("\t\t\t\t})\n");
          out.write("\t\t\t);\n");
          out.write("\n");
          out.write("\t\t\tvar onLocaleChange = function (event) {\n");
          out.write("\t\t\t\tvar languageId = event.item.getAttribute('data-value');\n");
          out.write("\n");
          out.write("\t\t\t\tlanguageId = languageId.replace('_', '-');\n");
          out.write("\n");
          out.write("\t\t\t\tvar triggerContent = Lang.sub(\n");
          out.write("\t\t\t\t\t'<span class=\"inline-item\">{flag}</span><span class=\"btn-section\">{languageId}</span>',\n");
          out.write("\t\t\t\t\t{\n");
          out.write("\t\t\t\t\t\tflag: Liferay.Util.getLexiconIconTpl(languageId.toLowerCase()),\n");
          out.write("\t\t\t\t\t\tlanguageId: languageId,\n");
          out.write("\t\t\t\t\t}\n");
          out.write("\t\t\t\t);\n");
          out.write("\n");
          out.write("\t\t\t\tvar trigger = A.one('#");
          if (_jspx_meth_portlet_namespace_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.print( fieldsNamespace );
          out.write("Menu');\n");
          out.write("\n");
          out.write("\t\t\t\ttrigger.setHTML(triggerContent);\n");
          out.write("\t\t\t};\n");
          out.write("\n");
          out.write("\t\t\tLiferay.on('inputLocalized:localeChanged', onLocaleChange);\n");
          out.write("\n");
          out.write("\t\t\twindow.fireLocaleChanged = function (event) {\n");
          out.write("\t\t\t\tLiferay.fire('inputLocalized:localeChanged', {\n");
          out.write("\t\t\t\t\titem: event.currentTarget,\n");
          out.write("\t\t\t\t});\n");
          out.write("\t\t\t};\n");
          out.write("\n");
          out.write("\t\t\tvar onDestroyPortlet = function (event) {\n");
          out.write("\t\t\t\tif (event.portletId === '");
          out.print( portletDisplay.getId() );
          out.write("') {\n");
          out.write("\t\t\t\t\tliferayDDMForm.destroy();\n");
          out.write("\n");
          out.write("\t\t\t\t\tLiferay.detach('inputLocalized:localeChanged', onLocaleChange);\n");
          out.write("\t\t\t\t\tLiferay.detach('destroyPortlet', onDestroyPortlet);\n");
          out.write("\t\t\t\t}\n");
          out.write("\t\t\t};\n");
          out.write("\n");
          out.write("\t\t\tLiferay.on('destroyPortlet', onDestroyPortlet);\n");
          out.write("\t\t");
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
      out.write('\n');
      out.write('	');
}
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_liferay$1util_dynamic$1include_1(_jspx_page_context))
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

  private boolean _jspx_meth_liferay$1util_dynamic$1include_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-util:dynamic-include
    com.liferay.taglib.util.DynamicIncludeTag _jspx_th_liferay$1util_dynamic$1include_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.DynamicIncludeTag.class) : new com.liferay.taglib.util.DynamicIncludeTag();
    _jspx_th_liferay$1util_dynamic$1include_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1util_dynamic$1include_0.setParent(null);
    _jspx_th_liferay$1util_dynamic$1include_0.setKey("com.liferay.dynamic.data.mapping.taglib#/html/start.jsp#pre");
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

  private boolean _jspx_meth_portlet_namespace_0(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_icon$1menu_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_0.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_icon$1menu_0);
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

  private boolean _jspx_meth_portlet_namespace_1(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_icon$1menu_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_1.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_icon$1menu_0);
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

  private boolean _jspx_meth_portlet_namespace_5(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_5.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_5 = _jspx_th_portlet_namespace_5.doStartTag();
    if (_jspx_th_portlet_namespace_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_5);
      _jspx_th_portlet_namespace_5.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_5);
    _jspx_th_portlet_namespace_5.release();
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
    _jspx_th_liferay$1util_dynamic$1include_1.setKey("com.liferay.dynamic.data.mapping.taglib#/html/start.jsp#post");
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
