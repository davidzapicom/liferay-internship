package org.apache.jsp.add_005fto_005fcart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.commerce.frontend.model.ProductSettingsModel;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONSerializer;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;

public final class page_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/add_to_cart/init.jsp");
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

String alignment = (String)request.getAttribute("liferay-commerce:add-to-cart:alignment");
String disabled = (String)request.getAttribute("liferay-commerce:add-to-cart:disabled");
String commerceAccountId = (String)request.getAttribute("liferay-commerce:add-to-cart:commerceAccountId");
String commerceChannelGroupId = (String)request.getAttribute("liferay-commerce:add-to-cart:commerceChannelGroupId");
String commerceChannelId = (String)request.getAttribute("liferay-commerce:add-to-cart:commerceChannelId");
String commerceCurrencyCode = (String)request.getAttribute("liferay-commerce:add-to-cart:commerceCurrencyCode");
String commerceOrderId = (String)request.getAttribute("liferay-commerce:add-to-cart:commerceOrderId");
String cpInstanceId = (String)request.getAttribute("liferay-commerce:add-to-cart:cpInstanceId");
String iconOnly = (String)request.getAttribute("liferay-commerce:add-to-cart:iconOnly");
String inCart = (String)request.getAttribute("liferay-commerce:add-to-cart:inCart");
String inline = (String)request.getAttribute("liferay-commerce:add-to-cart:inline");
String namespace = (String)request.getAttribute("liferay-commerce:add-to-cart:namespace");
ProductSettingsModel productSettingsModel = (ProductSettingsModel)request.getAttribute("liferay-commerce:add-to-cart:productSettingsModel");
String size = (String)request.getAttribute("liferay-commerce:add-to-cart:size");
String skuOptions = (String)request.getAttribute("liferay-commerce:add-to-cart:skuOptions");
String stockQuantity = (String)request.getAttribute("liferay-commerce:add-to-cart:stockQuantity");

String randomNamespace = PortalUtil.generateRandomKey(request, "taglib") + StringPool.UNDERLINE;

String addToCartId = randomNamespace + "add_to_cart";

      out.write('\n');
      out.write('\n');

String spaceDirection = GetterUtil.getBoolean(inline) ? "ml" : "mt";
String spacer = size.equals("sm") ? "1" : "3";

String buttonCssClasses = "btn btn-add-to-cart btn-" + size + " " + spaceDirection + "-" + spacer;

String selectorCssClasses = "form-control quantity-selector form-control-" + size;
String wrapperCssClasses = "add-to-cart-wrapper align-items-center d-flex";

if (GetterUtil.getBoolean(iconOnly)) {
	buttonCssClasses = buttonCssClasses.concat(" icon-only");
}

if (!GetterUtil.getBoolean(inline)) {
	wrapperCssClasses = wrapperCssClasses.concat(" flex-column");
}

if (alignment.equals("center")) {
	wrapperCssClasses = wrapperCssClasses.concat(" align-items-center");
}

if (alignment.equals("full-width")) {
	buttonCssClasses = buttonCssClasses.concat(" btn-block");
	wrapperCssClasses = wrapperCssClasses.concat(" align-items-center");
}

      out.write("\n");
      out.write("\n");
      out.write("<div class=\"add-to-cart mb-2\" id=\"");
      out.print( addToCartId );
      out.write("\">\n");
      out.write("\t<div class=\"");
      out.print( wrapperCssClasses );
      out.write("\">\n");
      out.write("\t\t<div class=\"");
      out.print( selectorCssClasses );
      out.write(" skeleton\"></div>\n");
      out.write("\n");
      out.write("\t\t<button class=\"");
      out.print( buttonCssClasses );
      out.write(" skeleton\">\n");
      out.write("\t\t\t");
      if (_jspx_meth_liferay$1ui_message_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t</button>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      //  aui:script
      com.liferay.taglib.aui.ScriptTag _jspx_th_aui_script_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ScriptTag.class) : new com.liferay.taglib.aui.ScriptTag();
      _jspx_th_aui_script_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_script_0.setParent(null);
      _jspx_th_aui_script_0.setRequire("commerce-frontend-js/components/add_to_cart/entry as AddToCart");
      int _jspx_eval_aui_script_0 = _jspx_th_aui_script_0.doStartTag();
      if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_aui_script_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_aui_script_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\tconst props = {\n");
          out.write("\t\taccountId: ");
          out.print( commerceAccountId );
          out.write(",\n");
          out.write("\t\tcartId: ");
          out.print( commerceOrderId );
          out.write(",\n");
          out.write("\t\tchannel: {\n");
          out.write("\t\t\tcurrencyCode: '");
          out.print( commerceCurrencyCode );
          out.write("',\n");
          out.write("\t\t\tgroupId: ");
          out.print( commerceChannelGroupId );
          out.write(",\n");
          out.write("\t\t\tid: ");
          out.print( commerceChannelId );
          out.write(",\n");
          out.write("\t\t},\n");
          out.write("\t\tcpInstance: {\n");
          out.write("\t\t\tinCart: ");
          out.print( inCart );
          out.write(",\n");
          out.write("\t\t\tskuId: ");
          out.print( cpInstanceId );
          out.write(",\n");
          out.write("\t\t\tskuOptions: ");
          out.print( skuOptions );
          out.write(" || [],\n");
          out.write("\t\t\tstockQuantity: ");
          out.print( stockQuantity );
          out.write(",\n");
          out.write("\t\t},\n");
          out.write("\t\tdisabled: ");
          out.print( disabled );
          out.write(",\n");
          out.write("\t\tsettings: {\n");
          out.write("\t\t\talignment: '");
          out.print( alignment );
          out.write("',\n");
          out.write("\t\t\ticonOnly: ");
          out.print( iconOnly );
          out.write(",\n");
          out.write("\t\t\tinline: ");
          out.print( inline );
          out.write(",\n");
          out.write("\t\t\tnamespace: '");
          out.print( namespace );
          out.write("',\n");
          out.write("\t\t\tsize: '");
          out.print( size );
          out.write("',\n");
          out.write("\t\t},\n");
          out.write("\t};\n");
          out.write("\n");
          out.write("\t");
if (
 productSettingsModel != null ) {
          out.write("\n");
          out.write("\n");
          out.write("\t\t");

		JSONSerializer jsonSerializer = JSONFactoryUtil.createJSONSerializer();
		
          out.write("\n");
          out.write("\n");
          out.write("\t\tconst productConfiguration = ");
          out.print( jsonSerializer.serializeDeep(productSettingsModel) );
          out.write(";\n");
          out.write("\n");
          out.write("\t\tprops.settings.productConfiguration = {\n");
          out.write("\t\t\tallowBackOrder: productConfiguration.backOrders,\n");
          out.write("\t\t\tallowedOrderQuantities: productConfiguration.allowedQuantities,\n");
          out.write("\t\t\tmaxOrderQuantity: productConfiguration.maxQuantity,\n");
          out.write("\t\t\tminOrderQuantity: productConfiguration.minQuantity,\n");
          out.write("\t\t\tmultipleOrderQuantity: productConfiguration.multipleQuantity,\n");
          out.write("\t\t};\n");
          out.write("\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\tAddToCart.default('");
          out.print( addToCartId );
          out.write("', '");
          out.print( addToCartId );
          out.write("', props);\n");
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

  private boolean _jspx_meth_liferay$1ui_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent(null);
    _jspx_th_liferay$1ui_message_0.setKey("add-to-cart");
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
}
