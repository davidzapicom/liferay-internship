package org.apache.jsp.document_005flibrary;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.asset.kernel.AssetRendererFactoryRegistryUtil;
import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.model.AssetRenderer;
import com.liferay.asset.kernel.model.AssetRendererFactory;
import com.liferay.asset.kernel.model.AssetVocabularyConstants;
import com.liferay.asset.kernel.service.AssetEntryLocalServiceUtil;
import com.liferay.asset.util.AssetHelper;
import com.liferay.document.library.constants.DLPortletKeys;
import com.liferay.document.library.display.context.DLDisplayContextProvider;
import com.liferay.document.library.display.context.DLEditFileEntryDisplayContext;
import com.liferay.document.library.display.context.DLFilePicker;
import com.liferay.document.library.display.context.DLViewFileEntryHistoryDisplayContext;
import com.liferay.document.library.display.context.DLViewFileVersionDisplayContext;
import com.liferay.document.library.display.context.IGViewFileVersionDisplayContext;
import com.liferay.document.library.kernel.antivirus.AntivirusScannerException;
import com.liferay.document.library.kernel.document.conversion.DocumentConversionUtil;
import com.liferay.document.library.kernel.exception.DuplicateFileEntryException;
import com.liferay.document.library.kernel.exception.DuplicateFileEntryTypeException;
import com.liferay.document.library.kernel.exception.DuplicateFolderNameException;
import com.liferay.document.library.kernel.exception.DuplicateRepositoryNameException;
import com.liferay.document.library.kernel.exception.FileEntryLockException;
import com.liferay.document.library.kernel.exception.FileExtensionException;
import com.liferay.document.library.kernel.exception.FileMimeTypeException;
import com.liferay.document.library.kernel.exception.FileNameException;
import com.liferay.document.library.kernel.exception.FileShortcutPermissionException;
import com.liferay.document.library.kernel.exception.FileSizeException;
import com.liferay.document.library.kernel.exception.FolderNameException;
import com.liferay.document.library.kernel.exception.InvalidFileVersionException;
import com.liferay.document.library.kernel.exception.NoSuchFileEntryException;
import com.liferay.document.library.kernel.exception.NoSuchFileException;
import com.liferay.document.library.kernel.exception.NoSuchFolderException;
import com.liferay.document.library.kernel.exception.NoSuchMetadataSetException;
import com.liferay.document.library.kernel.exception.RepositoryNameException;
import com.liferay.document.library.kernel.exception.RequiredFileEntryTypeException;
import com.liferay.document.library.kernel.exception.RequiredFileException;
import com.liferay.document.library.kernel.exception.SourceFileNameException;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFileEntryConstants;
import com.liferay.document.library.kernel.model.DLFileEntryMetadata;
import com.liferay.document.library.kernel.model.DLFileEntryType;
import com.liferay.document.library.kernel.model.DLFileEntryTypeConstants;
import com.liferay.document.library.kernel.model.DLFileShortcutConstants;
import com.liferay.document.library.kernel.model.DLFileVersion;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLAppServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryMetadataLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryTypeLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryTypeServiceUtil;
import com.liferay.document.library.kernel.util.AudioProcessorUtil;
import com.liferay.document.library.kernel.util.DLUtil;
import com.liferay.document.library.kernel.util.ImageProcessorUtil;
import com.liferay.document.library.kernel.util.PDFProcessorUtil;
import com.liferay.document.library.kernel.util.RawMetadataProcessor;
import com.liferay.document.library.kernel.util.VideoProcessorUtil;
import com.liferay.document.library.preview.exception.DLPreviewGenerationInProcessException;
import com.liferay.document.library.preview.exception.DLPreviewSizeException;
import com.liferay.document.library.util.DLURLHelperUtil;
import com.liferay.document.library.web.internal.constants.DLWebKeys;
import com.liferay.document.library.web.internal.dao.search.DLResultRowSplitter;
import com.liferay.document.library.web.internal.dao.search.IGResultRowSplitter;
import com.liferay.document.library.web.internal.display.context.DLAdminDisplayContext;
import com.liferay.document.library.web.internal.display.context.DLAdminManagementToolbarDisplayContext;
import com.liferay.document.library.web.internal.display.context.DLAdminNavigationDisplayContext;
import com.liferay.document.library.web.internal.display.context.DLEditDDMStructureDisplayContext;
import com.liferay.document.library.web.internal.display.context.DLSelectRestrictedFileEntryTypesDisplayContext;
import com.liferay.document.library.web.internal.display.context.DLViewFileEntryMetadataSetsDisplayContext;
import com.liferay.document.library.web.internal.display.context.DLViewFileEntryMetadataSetsManagementToolbarDisplayContext;
import com.liferay.document.library.web.internal.display.context.DLViewFileEntryTypesDisplayContext;
import com.liferay.document.library.web.internal.display.context.DLViewMoreMenuItemsDisplayContext;
import com.liferay.document.library.web.internal.display.context.IGDisplayContextProvider;
import com.liferay.document.library.web.internal.display.context.IGViewDisplayContext;
import com.liferay.document.library.web.internal.display.context.helper.DLPortletInstanceSettingsHelper;
import com.liferay.document.library.web.internal.display.context.helper.DLRequestHelper;
import com.liferay.document.library.web.internal.display.context.helper.IGRequestHelper;
import com.liferay.document.library.web.internal.exception.FileNameExtensionException;
import com.liferay.document.library.web.internal.helper.DLTrashHelper;
import com.liferay.document.library.web.internal.portlet.action.EditFileEntryMVCActionCommand;
import com.liferay.document.library.web.internal.search.EntriesChecker;
import com.liferay.document.library.web.internal.security.permission.resource.DDMStructurePermission;
import com.liferay.document.library.web.internal.security.permission.resource.DLFileEntryPermission;
import com.liferay.document.library.web.internal.security.permission.resource.DLFileEntryTypePermission;
import com.liferay.document.library.web.internal.security.permission.resource.DLFolderPermission;
import com.liferay.document.library.web.internal.settings.DLPortletInstanceSettings;
import com.liferay.document.library.web.internal.util.DLBreadcrumbUtil;
import com.liferay.document.library.web.internal.util.DLSubscriptionUtil;
import com.liferay.document.library.web.internal.util.DLWebComponentProvider;
import com.liferay.document.library.web.internal.util.IGUtil;
import com.liferay.dynamic.data.mapping.kernel.DDMStructure;
import com.liferay.dynamic.data.mapping.kernel.DDMStructureManager;
import com.liferay.dynamic.data.mapping.kernel.DDMStructureManagerUtil;
import com.liferay.dynamic.data.mapping.kernel.NoSuchStructureException;
import com.liferay.dynamic.data.mapping.kernel.StorageFieldRequiredException;
import com.liferay.dynamic.data.mapping.kernel.StructureDefinitionException;
import com.liferay.dynamic.data.mapping.kernel.StructureDuplicateElementException;
import com.liferay.dynamic.data.mapping.kernel.StructureNameException;
import com.liferay.dynamic.data.mapping.service.DDMStorageLinkLocalServiceUtil;
import com.liferay.dynamic.data.mapping.service.DDMStructureLocalServiceUtil;
import com.liferay.dynamic.data.mapping.storage.DDMFormValues;
import com.liferay.dynamic.data.mapping.storage.StorageType;
import com.liferay.frontend.taglib.clay.servlet.taglib.util.JSPDropdownItemList;
import com.liferay.frontend.taglib.clay.servlet.taglib.util.JSPNavigationItemList;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.configuration.persistence.listener.ConfigurationModelListenerException;
import com.liferay.portal.kernel.bean.BeanParamUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.InvalidRepositoryException;
import com.liferay.portal.kernel.exception.NoSuchRepositoryException;
import com.liferay.portal.kernel.frontend.icons.FrontendIconsUtil;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.language.UnicodeLanguageUtil;
import com.liferay.portal.kernel.lock.DuplicateLockException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Portlet;
import com.liferay.portal.kernel.model.Repository;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.portlet.PortletURLUtil;
import com.liferay.portal.kernel.portlet.url.builder.PortletURLBuilder;
import com.liferay.portal.kernel.repository.AuthenticationRepositoryException;
import com.liferay.portal.kernel.repository.RepositoryConfiguration;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.FileShortcut;
import com.liferay.portal.kernel.repository.model.FileVersion;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.PortletLocalServiceUtil;
import com.liferay.portal.kernel.service.PortletPreferencesLocalServiceUtil;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.servlet.taglib.ui.MenuItem;
import com.liferay.portal.kernel.servlet.taglib.ui.ToolbarItem;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.FileItem;
import com.liferay.portal.kernel.upload.LiferayFileItemException;
import com.liferay.portal.kernel.upload.UploadRequestSizeException;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.FastDateFormatFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.HttpComponentsUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.PortletKeys;
import com.liferay.portal.kernel.util.PrefsPropsUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.TempFileEntryUtil;
import com.liferay.portal.kernel.util.TextFormatter;
import com.liferay.portal.kernel.util.UnicodeFormatter;
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.webdav.WebDAVUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowDefinition;
import com.liferay.portal.repository.registry.RepositoryClassDefinition;
import com.liferay.portal.repository.registry.RepositoryClassDefinitionCatalogUtil;
import com.liferay.portal.util.PropsUtil;
import com.liferay.portal.util.PropsValues;
import com.liferay.portlet.documentlibrary.DLGroupServiceSettings;
import com.liferay.portlet.documentlibrary.constants.DLConstants;
import com.liferay.site.navigation.taglib.servlet.taglib.util.BreadcrumbEntriesUtil;
import com.liferay.taglib.search.ResultRow;
import com.liferay.taglib.servlet.PipingServletResponseFactory;
import com.liferay.trash.model.TrashEntry;
import java.text.DecimalFormatSymbols;
import java.text.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.portlet.PortletURL;
import javax.portlet.WindowState;
import com.liferay.bulk.selection.BulkSelectionRunner;
import com.liferay.digital.signature.constants.DigitalSignaturePortletKeys;
import com.liferay.document.library.configuration.DLConfiguration;
import com.liferay.document.library.exception.DLStorageQuotaExceededException;
import com.liferay.document.library.kernel.antivirus.AntivirusVirusFoundException;
import com.liferay.document.library.kernel.model.DLVersionNumberIncrease;
import com.liferay.document.library.kernel.util.DLValidatorUtil;
import com.liferay.document.library.web.internal.bulk.selection.BulkSelectionRunnerUtil;
import com.liferay.document.library.web.internal.display.context.DLAccessFromDesktopDisplayContext;
import com.liferay.document.library.web.internal.display.context.DLAdminDisplayContextProvider;
import com.liferay.document.library.web.internal.display.context.DLEditFileEntryTypeDataEngineDisplayContext;
import com.liferay.document.library.web.internal.display.context.DLEditFileShortcutDisplayContext;
import com.liferay.document.library.web.internal.display.context.DLEditFolderDisplayContext;
import com.liferay.document.library.web.internal.display.context.DLFileEntryAdditionalMetadataSetsDisplayContext;
import com.liferay.document.library.web.internal.display.context.DLFileEntryTypeDetailsDisplayContext;
import com.liferay.document.library.web.internal.display.context.DLInfoPanelDisplayContext;
import com.liferay.document.library.web.internal.display.context.DLSizeLimitConfigurationDisplayContext;
import com.liferay.document.library.web.internal.display.context.DLViewDisplayContext;
import com.liferay.document.library.web.internal.display.context.DLViewEntriesDisplayContext;
import com.liferay.document.library.web.internal.display.context.DLViewFileEntryDisplayContext;
import com.liferay.document.library.web.internal.display.context.FolderActionDisplayContext;
import com.liferay.document.library.web.internal.exception.FileEntryExpirationDateException;
import com.liferay.document.library.web.internal.exception.FileEntryReviewDateException;
import com.liferay.document.library.web.internal.search.DDMStructureRowChecker;
import com.liferay.document.library.web.internal.util.DDMStructureUtil;
import com.liferay.document.library.web.internal.util.DLAssetHelperUtil;
import com.liferay.document.library.web.internal.util.DataRecordValuesUtil;
import com.liferay.document.library.web.internal.util.RepositoryClassDefinitionUtil;
import com.liferay.dynamic.data.mapping.exception.RequiredStructureException;
import com.liferay.dynamic.data.mapping.util.DDMFormValuesToMapConverter;
import com.liferay.frontend.taglib.clay.servlet.taglib.util.DropdownItemList;
import com.liferay.item.selector.ItemSelector;
import com.liferay.item.selector.criteria.FolderItemSelectorReturnType;
import com.liferay.item.selector.criteria.folder.criterion.FolderItemSelectorCriterion;
import com.liferay.portal.kernel.lock.Lock;
import com.liferay.portal.kernel.module.configuration.ConfigurationProviderUtil;
import com.liferay.portal.kernel.portlet.RequestBackedPortletURLFactoryUtil;
import com.liferay.portal.kernel.repository.model.RepositoryEntry;
import com.liferay.portal.kernel.servlet.MultiSessionMessages;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.view.count.ViewCountManagerUtil;
import com.liferay.portal.util.RepositoryUtil;
import com.liferay.taglib.util.PortalIncludeUtil;
import java.util.Collections;

public final class info_005fpanel_005ffile_005fentry_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/document_library/init.jsp");
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/init-ext.jsp");
    _jspx_dependants.add("/document_library/init-ext.jsp");
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

DLTrashHelper dlTrashHelper = (DLTrashHelper)request.getAttribute(DLWebKeys.DOCUMENT_LIBRARY_TRASH_HELPER);

DLWebComponentProvider dlWebComponentProvider = DLWebComponentProvider.getDLWebComponentProvider();

DLDisplayContextProvider dlDisplayContextProvider = dlWebComponentProvider.getDLDisplayContextProvider();
IGDisplayContextProvider igDisplayContextProvider = dlWebComponentProvider.getIGDisplayContextProvider();

Format dateFormatDate = FastDateFormatFactoryUtil.getDate(locale, timeZone);
Format dateFormatDateTime = FastDateFormatFactoryUtil.getDateTime(locale, timeZone);

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

DLConfiguration dlConfiguration = ConfigurationProviderUtil.getSystemConfiguration(DLConfiguration.class);
DLRequestHelper dlRequestHelper = new DLRequestHelper(request);

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');

FileEntry fileEntry = (FileEntry)request.getAttribute("info_panel.jsp-fileEntry");
FileVersion fileVersion = (FileVersion)request.getAttribute("info_panel.jsp-fileVersion");
boolean hideActions = GetterUtil.getBoolean(request.getAttribute("info_panel_file_entry.jsp-hideActions"));

DLPortletInstanceSettings dlPortletInstanceSettings = dlRequestHelper.getDLPortletInstanceSettings();
DLViewFileVersionDisplayContext dlViewFileVersionDisplayContext = dlDisplayContextProvider.getDLViewFileVersionDisplayContext(request, response, fileVersion);

long assetClassPK = DLAssetHelperUtil.getAssetClassPK(fileEntry, fileVersion);

      out.write("\n");
      out.write("\n");
      out.write("<div class=\"sidebar-header\">\n");
      out.write("\t");
      //  clay:content-row
      com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag _jspx_th_clay_content$1row_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag();
      _jspx_th_clay_content$1row_0.setPageContext(_jspx_page_context);
      _jspx_th_clay_content$1row_0.setParent(null);
      _jspx_th_clay_content$1row_0.setCssClass("sidebar-section");
      int _jspx_eval_clay_content$1row_0 = _jspx_th_clay_content$1row_0.doStartTag();
      if (_jspx_eval_clay_content$1row_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t");
        //  clay:content-col
        com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
        _jspx_th_clay_content$1col_0.setPageContext(_jspx_page_context);
        _jspx_th_clay_content$1col_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_0);
        _jspx_th_clay_content$1col_0.setExpand( true );
        int _jspx_eval_clay_content$1col_0 = _jspx_th_clay_content$1col_0.doStartTag();
        if (_jspx_eval_clay_content$1col_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t");
          //  clay:content-section
          com.liferay.frontend.taglib.clay.servlet.taglib.ContentSectionTag _jspx_th_clay_content$1section_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentSectionTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentSectionTag();
          _jspx_th_clay_content$1section_0.setPageContext(_jspx_page_context);
          _jspx_th_clay_content$1section_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_0);
          int _jspx_eval_clay_content$1section_0 = _jspx_th_clay_content$1section_0.doStartTag();
          if (_jspx_eval_clay_content$1section_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t\t<h1 class=\"component-title\">\n");
            out.write("\t\t\t\t\t");
            out.print( HtmlUtil.escape(fileVersion.getTitle()) );
            out.write("\n");
            out.write("\t\t\t\t</h1>\n");
            out.write("\n");
            out.write("\t\t\t\t");
if (
 !Objects.equals(fileVersion.getTitle(), fileVersion.getFileName()) ) {
            out.write("\n");
            out.write("\t\t\t\t\t<p class=\"component-subtitle\">\n");
            out.write("\t\t\t\t\t\t");
            out.print( HtmlUtil.escape(fileVersion.getFileName()) );
            out.write("\n");
            out.write("\t\t\t\t\t</p>\n");
            out.write("\t\t\t\t");
}
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t");
if (
 dlViewFileVersionDisplayContext.isVersionInfoVisible() ) {
            out.write("\n");
            out.write("\t\t\t\t\t");
            //  clay:label
            com.liferay.frontend.taglib.clay.servlet.taglib.LabelTag _jspx_th_clay_label_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.LabelTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.LabelTag();
            _jspx_th_clay_label_0.setPageContext(_jspx_page_context);
            _jspx_th_clay_label_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1section_0);
            _jspx_th_clay_label_0.setDisplayType("info");
            _jspx_th_clay_label_0.setLabel( LanguageUtil.get(request, "version") + StringPool.SPACE + fileVersion.getVersion() );
            int _jspx_eval_clay_label_0 = _jspx_th_clay_label_0.doStartTag();
            if (_jspx_th_clay_label_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_label_0);
              _jspx_th_clay_label_0.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_label_0);
            _jspx_th_clay_label_0.release();
            out.write("\n");
            out.write("\t\t\t\t");
}
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t");
            //  aui:model-context
            com.liferay.taglib.aui.ModelContextTag _jspx_th_aui_model$1context_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ModelContextTag.class) : new com.liferay.taglib.aui.ModelContextTag();
            _jspx_th_aui_model$1context_0.setPageContext(_jspx_page_context);
            _jspx_th_aui_model$1context_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1section_0);
            _jspx_th_aui_model$1context_0.setBean( fileVersion );
            _jspx_th_aui_model$1context_0.setModel( DLFileVersion.class );
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
            out.write("\t\t\t\t");
            //  aui:workflow-status
            com.liferay.taglib.aui.WorkflowStatusTag _jspx_th_aui_workflow$1status_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.WorkflowStatusTag.class) : new com.liferay.taglib.aui.WorkflowStatusTag();
            _jspx_th_aui_workflow$1status_0.setPageContext(_jspx_page_context);
            _jspx_th_aui_workflow$1status_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1section_0);
            _jspx_th_aui_workflow$1status_0.setModel( DLFileEntry.class );
            _jspx_th_aui_workflow$1status_0.setShowIcon( false );
            _jspx_th_aui_workflow$1status_0.setShowLabel( false );
            _jspx_th_aui_workflow$1status_0.setStatus( fileVersion.getStatus() );
            int _jspx_eval_aui_workflow$1status_0 = _jspx_th_aui_workflow$1status_0.doStartTag();
            if (_jspx_th_aui_workflow$1status_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_workflow$1status_0);
              _jspx_th_aui_workflow$1status_0.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_workflow$1status_0);
            _jspx_th_aui_workflow$1status_0.release();
            out.write("\n");
            out.write("\t\t\t");
          }
          if (_jspx_th_clay_content$1section_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1section_0);
            _jspx_th_clay_content$1section_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1section_0);
          _jspx_th_clay_content$1section_0.release();
          out.write("\n");
          out.write("\t\t");
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
        out.write("\t\t");

		DLPortletInstanceSettingsHelper dlPortletInstanceSettingsHelper = new DLPortletInstanceSettingsHelper(dlRequestHelper);
		
        out.write("\n");
        out.write("\n");
        out.write("\t\t");
if (
 !hideActions && dlPortletInstanceSettingsHelper.isShowActions() ) {
        out.write("\n");
        out.write("\t\t\t");
        //  clay:content-col
        com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
        _jspx_th_clay_content$1col_1.setPageContext(_jspx_page_context);
        _jspx_th_clay_content$1col_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_0);
        int _jspx_eval_clay_content$1col_1 = _jspx_th_clay_content$1col_1.doStartTag();
        if (_jspx_eval_clay_content$1col_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t\t<ul class=\"autofit-padded-no-gutters autofit-row\">\n");
          out.write("\t\t\t\t\t<li class=\"autofit-col\">\n");
          out.write("\t\t\t\t\t\t");
          //  liferay-util:include
          com.liferay.taglib.util.IncludeTag _jspx_th_liferay$1util_include_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.IncludeTag.class) : new com.liferay.taglib.util.IncludeTag();
          _jspx_th_liferay$1util_include_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1util_include_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_1);
          _jspx_th_liferay$1util_include_0.setPage("/document_library/file_entry_action.jsp");
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
          out.write("\t\t\t\t\t</li>\n");
          out.write("\t\t\t\t</ul>\n");
          out.write("\t\t\t");
        }
        if (_jspx_th_clay_content$1col_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_1);
          _jspx_th_clay_content$1col_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_1);
        _jspx_th_clay_content$1col_1.release();
        out.write("\n");
        out.write("\t\t");
}
        out.write('\n');
        out.write('	');
      }
      if (_jspx_th_clay_content$1row_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_0);
        _jspx_th_clay_content$1row_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_0);
      _jspx_th_clay_content$1row_0.release();
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"sidebar-body\">\n");
      out.write("\n");
      out.write("\t");

	String tabsNames = "details";

	if (dlViewFileVersionDisplayContext.isVersionInfoVisible()) {
		tabsNames += ",versions";
	}
	
      out.write("\n");
      out.write("\n");
      out.write("\t");
      //  liferay-ui:tabs
      com.liferay.taglib.ui.TabsTag _jspx_th_liferay$1ui_tabs_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.TabsTag.class) : new com.liferay.taglib.ui.TabsTag();
      _jspx_th_liferay$1ui_tabs_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_tabs_0.setParent(null);
      _jspx_th_liferay$1ui_tabs_0.setCssClass("navbar-no-collapse");
      _jspx_th_liferay$1ui_tabs_0.setNames( tabsNames );
      _jspx_th_liferay$1ui_tabs_0.setParam( "tabs_" + fileEntry.getFileEntryId() );
      _jspx_th_liferay$1ui_tabs_0.setRefresh( false );
      int _jspx_eval_liferay$1ui_tabs_0 = _jspx_th_liferay$1ui_tabs_0.doStartTag();
      if (_jspx_eval_liferay$1ui_tabs_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t");
        //  liferay-ui:section
        com.liferay.taglib.ui.SectionTag _jspx_th_liferay$1ui_section_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SectionTag.class) : new com.liferay.taglib.ui.SectionTag();
        _jspx_th_liferay$1ui_section_0.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_section_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_tabs_0);
        int _jspx_eval_liferay$1ui_section_0 = _jspx_th_liferay$1ui_section_0.doStartTag();
        if (_jspx_eval_liferay$1ui_section_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          java.lang.String sectionParam = null;
          java.lang.String sectionName = null;
          java.lang.Boolean sectionSelected = null;
          java.lang.String sectionScroll = null;
          java.lang.String sectionRedirectParams = null;
          sectionParam = (java.lang.String) _jspx_page_context.findAttribute("sectionParam");
          sectionName = (java.lang.String) _jspx_page_context.findAttribute("sectionName");
          sectionSelected = (java.lang.Boolean) _jspx_page_context.findAttribute("sectionSelected");
          sectionScroll = (java.lang.String) _jspx_page_context.findAttribute("sectionScroll");
          sectionRedirectParams = (java.lang.String) _jspx_page_context.findAttribute("sectionRedirectParams");
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t");

			String thumbnailSrc = DLURLHelperUtil.getThumbnailSrc(fileEntry, fileVersion, themeDisplay);
			
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t");
if (
 Validator.isNotNull(thumbnailSrc) ) {
          out.write("\n");
          out.write("\t\t\t\t<div class=\"aspect-ratio aspect-ratio-16-to-9 sidebar-panel thumbnail\">\n");
          out.write("\t\t\t\t\t<img alt=\"");
          //  liferay-ui:message
          com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
          _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
          _jspx_th_liferay$1ui_message_0.setEscapeAttribute( true );
          _jspx_th_liferay$1ui_message_0.setKey("thumbnail");
          int _jspx_eval_liferay$1ui_message_0 = _jspx_th_liferay$1ui_message_0.doStartTag();
          if (_jspx_th_liferay$1ui_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
            _jspx_th_liferay$1ui_message_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
          _jspx_th_liferay$1ui_message_0.release();
          out.write("\" class=\"aspect-ratio-item-center-middle aspect-ratio-item-fluid\" src=\"");
          out.print( DLURLHelperUtil.getThumbnailSrc(fileEntry, fileVersion, themeDisplay) );
          out.write("\" />\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\t\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t");
          //  liferay-dynamic-section:dynamic-section
          com.liferay.frontend.taglib.dynamic.section.servlet.taglib.DynamicSectionTag _jspx_th_liferay$1dynamic$1section_dynamic$1section_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.dynamic.section.servlet.taglib.DynamicSectionTag.class) : new com.liferay.frontend.taglib.dynamic.section.servlet.taglib.DynamicSectionTag();
          _jspx_th_liferay$1dynamic$1section_dynamic$1section_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1dynamic$1section_dynamic$1section_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
          _jspx_th_liferay$1dynamic$1section_dynamic$1section_0.setName("com.liferay.document.library.web#/document_library/info_panel_file_entry.jsp#fileEntryOwner");
          int _jspx_eval_liferay$1dynamic$1section_dynamic$1section_0 = _jspx_th_liferay$1dynamic$1section_dynamic$1section_0.doStartTag();
          if (_jspx_eval_liferay$1dynamic$1section_dynamic$1section_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_liferay$1dynamic$1section_dynamic$1section_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_liferay$1dynamic$1section_dynamic$1section_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_liferay$1dynamic$1section_dynamic$1section_0.doInitBody();
            }
            do {
              out.write("\n");
              out.write("\t\t\t\t");
              //  clay:content-row
              com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag _jspx_th_clay_content$1row_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag();
              _jspx_th_clay_content$1row_1.setPageContext(_jspx_page_context);
              _jspx_th_clay_content$1row_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1dynamic$1section_dynamic$1section_0);
              _jspx_th_clay_content$1row_1.setCssClass("sidebar-section widget-metadata");
              _jspx_th_clay_content$1row_1.setNoGutters("true");
              int _jspx_eval_clay_content$1row_1 = _jspx_th_clay_content$1row_1.doStartTag();
              if (_jspx_eval_clay_content$1row_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t");

					User owner = UserLocalServiceUtil.fetchUser(fileEntry.getUserId());
					
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  clay:content-col
                com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
                _jspx_th_clay_content$1col_2.setPageContext(_jspx_page_context);
                _jspx_th_clay_content$1col_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_1);
                int _jspx_eval_clay_content$1col_2 = _jspx_th_clay_content$1col_2.doStartTag();
                if (_jspx_eval_clay_content$1col_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t");
                  //  liferay-ui:user-portrait
                  com.liferay.taglib.ui.UserPortraitTag _jspx_th_liferay$1ui_user$1portrait_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.UserPortraitTag.class) : new com.liferay.taglib.ui.UserPortraitTag();
                  _jspx_th_liferay$1ui_user$1portrait_0.setPageContext(_jspx_page_context);
                  _jspx_th_liferay$1ui_user$1portrait_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_2);
                  _jspx_th_liferay$1ui_user$1portrait_0.setUser( owner );
                  int _jspx_eval_liferay$1ui_user$1portrait_0 = _jspx_th_liferay$1ui_user$1portrait_0.doStartTag();
                  if (_jspx_th_liferay$1ui_user$1portrait_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_user$1portrait_0);
                    _jspx_th_liferay$1ui_user$1portrait_0.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_user$1portrait_0);
                  _jspx_th_liferay$1ui_user$1portrait_0.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t");
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
                out.write("\t\t\t\t\t");
                //  clay:content-col
                com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
                _jspx_th_clay_content$1col_3.setPageContext(_jspx_page_context);
                _jspx_th_clay_content$1col_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_1);
                _jspx_th_clay_content$1col_3.setExpand( true );
                int _jspx_eval_clay_content$1col_3 = _jspx_th_clay_content$1col_3.doStartTag();
                if (_jspx_eval_clay_content$1col_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t<div class=\"component-title username\">\n");
                  out.write("\t\t\t\t\t\t\t");
if (
 owner != null ) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t<a href=\"");
                  out.print( owner.isDefaultUser() ? StringPool.BLANK : owner.getDisplayURL(themeDisplay) );
                  out.write('"');
                  out.write('>');
                  out.print( HtmlUtil.escape(owner.getFullName()) );
                  out.write("</a>\n");
                  out.write("\t\t\t\t\t\t\t");
}
                  out.write("\n");
                  out.write("\t\t\t\t\t\t</div>\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t<div class=\"component-subtitle\">\n");
                  out.write("\t\t\t\t\t\t\t");
                  if (_jspx_meth_liferay$1ui_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_content$1col_3, _jspx_page_context))
                    return;
                  out.write("\n");
                  out.write("\t\t\t\t\t\t</div>\n");
                  out.write("\t\t\t\t\t");
                }
                if (_jspx_th_clay_content$1col_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_3);
                  _jspx_th_clay_content$1col_3.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_3);
                _jspx_th_clay_content$1col_3.release();
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
              int evalDoAfterBody = _jspx_th_liferay$1dynamic$1section_dynamic$1section_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_liferay$1dynamic$1section_dynamic$1section_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_liferay$1dynamic$1section_dynamic$1section_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1dynamic$1section_dynamic$1section_0);
            _jspx_th_liferay$1dynamic$1section_dynamic$1section_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1dynamic$1section_dynamic$1section_0);
          _jspx_th_liferay$1dynamic$1section_dynamic$1section_0.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t");
if (
 dlViewFileVersionDisplayContext.isDownloadLinkVisible() || dlViewFileVersionDisplayContext.isSharingLinkVisible() ) {
          out.write("\n");
          out.write("\t\t\t\t<div class=\"sidebar-section\">\n");
          out.write("\t\t\t\t\t<div class=\"btn-group\">\n");
          out.write("\t\t\t\t\t\t");
if (
 dlViewFileVersionDisplayContext.isDownloadLinkVisible() ) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t");
if (
 PropsValues.DL_FILE_ENTRY_CONVERSIONS_ENABLED && DocumentConversionUtil.isEnabled() ) {
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t");

									String[] conversions = DocumentConversionUtil.getConversions(fileVersion.getExtension());
									
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
if (
 conversions.length > 0 ) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"btn-group-item\" data-analytics-file-entry-id=\"");
          out.print( String.valueOf(fileEntry.getFileEntryId()) );
          out.write("\" data-analytics-file-entry-title=\"");
          out.print( String.valueOf(fileEntry.getTitle()) );
          out.write("\" data-analytics-file-entry-version=\"");
          out.print( String.valueOf(fileEntry.getVersion()) );
          out.write("\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          //  clay:dropdown-menu
          com.liferay.frontend.taglib.clay.servlet.taglib.DropdownMenuTag _jspx_th_clay_dropdown$1menu_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.DropdownMenuTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.DropdownMenuTag();
          _jspx_th_clay_dropdown$1menu_0.setPageContext(_jspx_page_context);
          _jspx_th_clay_dropdown$1menu_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
          _jspx_th_clay_dropdown$1menu_0.setDropdownItems(
														new JSPDropdownItemList(pageContext) {
															{
																ThemeDisplay themeDisplay = (ThemeDisplay)httpServletRequest.getAttribute(WebKeys.THEME_DISPLAY);

																Map<String, Object> data = HashMapBuilder.<String, Object>put(
																	"analytics-file-entry-id", String.valueOf(fileEntry.getFileEntryId())
																).put(
																	"analytics-file-entry-title", String.valueOf(fileEntry.getTitle())
																).put(
																	"analytics-file-entry-version", String.valueOf(fileEntry.getVersion())
																).build();

																add(
																	dropdownItem -> {
																		dropdownItem.setData(data);
																		dropdownItem.setHref(DLURLHelperUtil.getDownloadURL(fileEntry, fileVersion, themeDisplay, StringPool.BLANK, false, true));
																		dropdownItem.setLabel(LanguageUtil.get(httpServletRequest, "this-version"));
																		dropdownItem.setSeparator(true);
																	});

																addGroup(
																	dropdownGroupItem -> {
																		dropdownGroupItem.setDropdownItems(
																			new DropdownItemList() {
																				{
																					for (String conversion : conversions) {
																						add(
																							dropdownItem -> {
																								dropdownItem.setData(data);
																								dropdownItem.setHref(DLURLHelperUtil.getDownloadURL(fileEntry, fileVersion, themeDisplay, "&targetExtension=" + conversion));
																								dropdownItem.setLabel(StringUtil.toUpperCase(conversion));
																							});
																					}
																				}
																			});
																		dropdownGroupItem.setLabel(LanguageUtil.get(httpServletRequest, "convert-to"));
																	});
															}
														}
													);
          _jspx_th_clay_dropdown$1menu_0.setLabel("download");
          _jspx_th_clay_dropdown$1menu_0.setSmall( true );
          int _jspx_eval_clay_dropdown$1menu_0 = _jspx_th_clay_dropdown$1menu_0.doStartTag();
          if (_jspx_th_clay_dropdown$1menu_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_dropdown$1menu_0);
            _jspx_th_clay_dropdown$1menu_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_dropdown$1menu_0);
          _jspx_th_clay_dropdown$1menu_0.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
}
else {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"btn-group-item\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          //  clay:link
          com.liferay.frontend.taglib.clay.servlet.taglib.LinkTag _jspx_th_clay_link_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.LinkTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.LinkTag();
          _jspx_th_clay_link_0.setPageContext(_jspx_page_context);
          _jspx_th_clay_link_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
          _jspx_th_clay_link_0.setDynamicAttribute(null, "data-analytics-file-entry-id",  fileEntry.getFileEntryId() );
          _jspx_th_clay_link_0.setDynamicAttribute(null, "data-analytics-file-entry-title",  fileEntry.getTitle() );
          _jspx_th_clay_link_0.setDynamicAttribute(null, "data-analytics-file-entry-version",  fileEntry.getVersion() );
          _jspx_th_clay_link_0.setDisplayType("primary");
          _jspx_th_clay_link_0.setHref( DLURLHelperUtil.getDownloadURL(fileEntry, fileVersion, themeDisplay, StringPool.BLANK, false, true) );
          _jspx_th_clay_link_0.setLabel("download");
          _jspx_th_clay_link_0.setSmall( true );
          _jspx_th_clay_link_0.setDynamicAttribute(null, "title",  LanguageUtil.format(resourceBundle, "file-size-x", LanguageUtil.formatStorageSize(fileVersion.getSize(), locale), false) );
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
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t");
}
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t");
}
else {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"btn-group-item\" data-analytics-file-entry-id=\"");
          out.print( String.valueOf(fileEntry.getFileEntryId()) );
          out.write("\" data-analytics-file-entry-title=\"");
          out.print( String.valueOf(fileEntry.getTitle()) );
          out.write("\" data-analytics-file-entry-version=\"");
          out.print( String.valueOf(fileEntry.getVersion()) );
          out.write("\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          //  clay:link
          com.liferay.frontend.taglib.clay.servlet.taglib.LinkTag _jspx_th_clay_link_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.LinkTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.LinkTag();
          _jspx_th_clay_link_1.setPageContext(_jspx_page_context);
          _jspx_th_clay_link_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
          _jspx_th_clay_link_1.setDisplayType("primary");
          _jspx_th_clay_link_1.setHref( DLURLHelperUtil.getDownloadURL(fileEntry, fileVersion, themeDisplay, StringPool.BLANK, false, true) );
          _jspx_th_clay_link_1.setLabel("download");
          _jspx_th_clay_link_1.setSmall( true );
          _jspx_th_clay_link_1.setDynamicAttribute(null, "title",  LanguageUtil.format(resourceBundle, "file-size-x", LanguageUtil.formatStorageSize(fileVersion.getSize(), locale), false) );
          _jspx_th_clay_link_1.setType("button");
          int _jspx_eval_clay_link_1 = _jspx_th_clay_link_1.doStartTag();
          if (_jspx_th_clay_link_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_link_1);
            _jspx_th_clay_link_1.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_link_1);
          _jspx_th_clay_link_1.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
}
          out.write("\n");
          out.write("\t\t\t\t\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t");
if (
 dlViewFileVersionDisplayContext.isSharingLinkVisible() ) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t<div class=\"btn-group-item\">\n");
          out.write("\t\t\t\t\t\t\t\t");
          //  liferay-sharing:button
          com.liferay.sharing.taglib.servlet.taglib.SharingButtonTag _jspx_th_liferay$1sharing_button_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.sharing.taglib.servlet.taglib.SharingButtonTag.class) : new com.liferay.sharing.taglib.servlet.taglib.SharingButtonTag();
          _jspx_th_liferay$1sharing_button_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1sharing_button_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
          _jspx_th_liferay$1sharing_button_0.setClassName( DLFileEntryConstants.getClassName() );
          _jspx_th_liferay$1sharing_button_0.setClassPK( fileEntry.getFileEntryId() );
          int _jspx_eval_liferay$1sharing_button_0 = _jspx_th_liferay$1sharing_button_0.doStartTag();
          if (_jspx_th_liferay$1sharing_button_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1sharing_button_0);
            _jspx_th_liferay$1sharing_button_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1sharing_button_0);
          _jspx_th_liferay$1sharing_button_0.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t");
}
          out.write("\n");
          out.write("\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\n");
          out.write("\t\t\t\t<div class=\"sidebar-section\">\n");
          out.write("\n");
          out.write("\t\t\t\t\t");

					DLViewFileEntryDisplayContext dlViewFileEntryDisplayContext = (DLViewFileEntryDisplayContext)request.getAttribute(DLViewFileEntryDisplayContext.class.getName());

					boolean latestVersion = false;

					if (dlViewFileEntryDisplayContext != null) {
						latestVersion = fileVersion.equals(dlViewFileEntryDisplayContext.getFileVersion());
					}
					else {
						latestVersion = fileVersion.equals(fileEntry.getLatestFileVersion());
					}

					String urlLabel = null;

					if (latestVersion) {
						urlLabel = LanguageUtil.get(resourceBundle, "latest-version-url");
					}
					else {
						urlLabel = LanguageUtil.format(request, "version-x-url", fileVersion.getVersion());
					}

					String urlInputId = liferayPortletResponse.getNamespace() + "urlInput";
					
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t<div class=\"form-group\">\n");
          out.write("\t\t\t\t\t\t<label for=\"");
          out.print( urlInputId );
          out.write('"');
          out.write('>');
          out.print( urlLabel );
          out.write("</label>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t<div class=\"input-group input-group-sm\">\n");
          out.write("\t\t\t\t\t\t\t<div class=\"input-group-item input-group-prepend\">\n");
          out.write("\t\t\t\t\t\t\t\t<input class=\"form-control\" id=\"");
          out.print( urlInputId );
          out.write("\" readonly value=\"");
          out.print( DLURLHelperUtil.getPreviewURL(fileEntry, fileVersion, themeDisplay, StringPool.BLANK, !latestVersion, true) );
          out.write("\" />\n");
          out.write("\t\t\t\t\t\t\t</div>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t<span class=\"input-group-append input-group-item input-group-item-shrink\">\n");
          out.write("\t\t\t\t\t\t\t\t");
          //  clay:button
          com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag _jspx_th_clay_button_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag();
          _jspx_th_clay_button_0.setPageContext(_jspx_page_context);
          _jspx_th_clay_button_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
          _jspx_th_clay_button_0.setCssClass("dm-infopanel-copy-clipboard lfr-portal-tooltip");
          _jspx_th_clay_button_0.setDynamicAttribute(null, "data-clipboard-target",  "#" + urlInputId );
          _jspx_th_clay_button_0.setDisplayType("secondary");
          _jspx_th_clay_button_0.setIcon("paste");
          _jspx_th_clay_button_0.setDynamicAttribute(null, "title", new String("copy-link"));
          int _jspx_eval_clay_button_0 = _jspx_th_clay_button_0.doStartTag();
          if (_jspx_th_clay_button_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_0);
            _jspx_th_clay_button_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_0);
          _jspx_th_clay_button_0.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t\t</span>\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t</div>\n");
          out.write("\n");
          out.write("\t\t\t\t\t");
if (
 portletDisplay.isWebDAVEnabled() && fileEntry.isSupportsSocial() && latestVersion ) {
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t");

						String webDavURLInputId = liferayPortletResponse.getNamespace() + "webDavURLInput";
						
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
          out.write("\t\t\t\t\t\t\t<label for=\"");
          out.print( webDavURLInputId );
          out.write("\">\n");
          out.write("\t\t\t\t\t\t\t\t");
          //  liferay-ui:message
          com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
          _jspx_th_liferay$1ui_message_2.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
          _jspx_th_liferay$1ui_message_2.setKey( TextFormatter.format("webDavURL", TextFormatter.K) );
          int _jspx_eval_liferay$1ui_message_2 = _jspx_th_liferay$1ui_message_2.doStartTag();
          if (_jspx_th_liferay$1ui_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
            _jspx_th_liferay$1ui_message_2.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
          _jspx_th_liferay$1ui_message_2.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t");
          //  liferay-ui:icon-help
          com.liferay.taglib.ui.IconHelpTag _jspx_th_liferay$1ui_icon$1help_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconHelpTag.class) : new com.liferay.taglib.ui.IconHelpTag();
          _jspx_th_liferay$1ui_icon$1help_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_icon$1help_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
          _jspx_th_liferay$1ui_icon$1help_0.setMessage( LanguageUtil.get(request, "webdav-help") );
          int _jspx_eval_liferay$1ui_icon$1help_0 = _jspx_th_liferay$1ui_icon$1help_0.doStartTag();
          if (_jspx_th_liferay$1ui_icon$1help_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon$1help_0);
            _jspx_th_liferay$1ui_icon$1help_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon$1help_0);
          _jspx_th_liferay$1ui_icon$1help_0.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t\t</label>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t<div class=\"input-group input-group-sm\">\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"input-group-item input-group-prepend\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<input class=\"form-control\" id=\"");
          out.print( webDavURLInputId );
          out.write("\" readonly value=\"");
          out.print( DLURLHelperUtil.getWebDavURL(themeDisplay, fileEntry.getFolder(), fileEntry) );
          out.write("\" />\n");
          out.write("\t\t\t\t\t\t\t\t</div>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t<span class=\"input-group-append input-group-item input-group-item-shrink\">\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          //  clay:button
          com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag _jspx_th_clay_button_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag();
          _jspx_th_clay_button_1.setPageContext(_jspx_page_context);
          _jspx_th_clay_button_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
          _jspx_th_clay_button_1.setCssClass("dm-infopanel-copy-clipboard lfr-portal-tooltip");
          _jspx_th_clay_button_1.setDynamicAttribute(null, "data-clipboard-target",  "#" + webDavURLInputId );
          _jspx_th_clay_button_1.setDisplayType("secondary");
          _jspx_th_clay_button_1.setIcon("paste");
          _jspx_th_clay_button_1.setDynamicAttribute(null, "title", new String("copy-link"));
          int _jspx_eval_clay_button_1 = _jspx_th_clay_button_1.doStartTag();
          if (_jspx_th_clay_button_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_1);
            _jspx_th_clay_button_1.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_1);
          _jspx_th_clay_button_1.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</span>\n");
          out.write("\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t");
}
          out.write("\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\t\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t<dl class=\"sidebar-dl sidebar-section\">\n");
          out.write("\t\t\t\t");
if (
 fileVersion.getModel() instanceof DLFileVersion ) {
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t");

					DLFileVersion dlFileVersion = (DLFileVersion)fileVersion.getModel();

					DLFileEntryType dlFileEntryType = dlFileVersion.getDLFileEntryType();
					
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t<dt class=\"sidebar-dt\">\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_section_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t</dt>\n");
          out.write("\t\t\t\t\t<dd class=\"sidebar-dd\">\n");
          out.write("\t\t\t\t\t\t");
          out.print( HtmlUtil.escape(dlFileEntryType.getName(locale)) );
          out.write("\n");
          out.write("\t\t\t\t\t</dd>\n");
          out.write("\t\t\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t");
if (
 Validator.isNotNull(fileVersion.getExtension()) ) {
          out.write("\n");
          out.write("\t\t\t\t\t<dt class=\"sidebar-dt\">\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_section_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t</dt>\n");
          out.write("\t\t\t\t\t<dd class=\"sidebar-dd\">\n");
          out.write("\t\t\t\t\t\t");
          out.print( HtmlUtil.escape(fileVersion.getExtension()) );
          out.write("\n");
          out.write("\t\t\t\t\t</dd>\n");
          out.write("\t\t\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t<dt class=\"sidebar-dt\">\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_section_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t</dt>\n");
          out.write("\t\t\t\t<dd class=\"sidebar-dd\">\n");
          out.write("\t\t\t\t\t");
          out.print( HtmlUtil.escape(LanguageUtil.formatStorageSize(fileVersion.getSize(), locale)) );
          out.write("\n");
          out.write("\t\t\t\t</dd>\n");
          out.write("\t\t\t\t<dt class=\"sidebar-dt\">\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_section_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t</dt>\n");
          out.write("\t\t\t\t<dd class=\"sidebar-dd\">\n");
          out.write("\t\t\t\t\t");
          //  liferay-ui:message
          com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
          _jspx_th_liferay$1ui_message_7.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_message_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
          _jspx_th_liferay$1ui_message_7.setArguments( new Object[] {dateFormatDateTime.format(fileVersion.getModifiedDate()), HtmlUtil.escape(fileVersion.getStatusByUserName())} );
          _jspx_th_liferay$1ui_message_7.setKey("x-by-x");
          _jspx_th_liferay$1ui_message_7.setTranslateArguments( false );
          int _jspx_eval_liferay$1ui_message_7 = _jspx_th_liferay$1ui_message_7.doStartTag();
          if (_jspx_th_liferay$1ui_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_7);
            _jspx_th_liferay$1ui_message_7.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_7);
          _jspx_th_liferay$1ui_message_7.release();
          out.write("\n");
          out.write("\t\t\t\t</dd>\n");
          out.write("\t\t\t\t<dt class=\"sidebar-dt\">\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_section_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t</dt>\n");
          out.write("\t\t\t\t<dd class=\"sidebar-dd\">\n");
          out.write("\t\t\t\t\t");
          //  liferay-ui:message
          com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
          _jspx_th_liferay$1ui_message_9.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_message_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
          _jspx_th_liferay$1ui_message_9.setArguments( new Object[] {dateFormatDateTime.format(fileEntry.getCreateDate()), HtmlUtil.escape(fileEntry.getUserName())} );
          _jspx_th_liferay$1ui_message_9.setKey("x-by-x");
          _jspx_th_liferay$1ui_message_9.setTranslateArguments( false );
          int _jspx_eval_liferay$1ui_message_9 = _jspx_th_liferay$1ui_message_9.doStartTag();
          if (_jspx_th_liferay$1ui_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_9);
            _jspx_th_liferay$1ui_message_9.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_9);
          _jspx_th_liferay$1ui_message_9.release();
          out.write("\n");
          out.write("\t\t\t\t</dd>\n");
          out.write("\t\t\t\t<dt class=\"sidebar-dt\">\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_section_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t</dt>\n");
          out.write("\t\t\t\t<dd class=\"sidebar-dd\">\n");
          out.write("\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t");
if (
 fileVersion.getExpirationDate() != null ) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
          //  liferay-ui:message
          com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
          _jspx_th_liferay$1ui_message_11.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_message_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
          _jspx_th_liferay$1ui_message_11.setArguments( new Object[] {dateFormatDateTime.format(fileVersion.getExpirationDate()), HtmlUtil.escape(fileVersion.getUserName())} );
          _jspx_th_liferay$1ui_message_11.setKey("x-by-x");
          _jspx_th_liferay$1ui_message_11.setTranslateArguments( false );
          int _jspx_eval_liferay$1ui_message_11 = _jspx_th_liferay$1ui_message_11.doStartTag();
          if (_jspx_th_liferay$1ui_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_11);
            _jspx_th_liferay$1ui_message_11.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_11);
          _jspx_th_liferay$1ui_message_11.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t");
}
else {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_section_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t");
}
          out.write("\n");
          out.write("\t\t\t\t</dd>\n");
          out.write("\t\t\t\t<dt class=\"sidebar-dt\">\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_section_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t</dt>\n");
          out.write("\t\t\t\t<dd class=\"sidebar-dd\">\n");
          out.write("\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t");
if (
 fileVersion.getReviewDate() != null ) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
          //  liferay-ui:message
          com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_14 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
          _jspx_th_liferay$1ui_message_14.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_message_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
          _jspx_th_liferay$1ui_message_14.setArguments( new Object[] {dateFormatDateTime.format(fileVersion.getReviewDate()), HtmlUtil.escape(fileEntry.getUserName())} );
          _jspx_th_liferay$1ui_message_14.setKey("x-by-x");
          _jspx_th_liferay$1ui_message_14.setTranslateArguments( false );
          int _jspx_eval_liferay$1ui_message_14 = _jspx_th_liferay$1ui_message_14.doStartTag();
          if (_jspx_th_liferay$1ui_message_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_14);
            _jspx_th_liferay$1ui_message_14.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_14);
          _jspx_th_liferay$1ui_message_14.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t");
}
else {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_section_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t");
}
          out.write("\n");
          out.write("\t\t\t\t</dd>\n");
          out.write("\n");
          out.write("\t\t\t\t");

				request.setAttribute("info_panel_location.jsp-parentFolder", fileEntry.getFolder());
				
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t");
          //  liferay-util:include
          com.liferay.taglib.util.IncludeTag _jspx_th_liferay$1util_include_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.IncludeTag.class) : new com.liferay.taglib.util.IncludeTag();
          _jspx_th_liferay$1util_include_1.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1util_include_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
          _jspx_th_liferay$1util_include_1.setPage("/document_library/info_panel_location.jsp");
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
          out.write("\n");
          out.write("\t\t\t\t");
          //  liferay-asset:asset-tags-available
          com.liferay.asset.taglib.servlet.taglib.AssetTagsAvailableTag _jspx_th_liferay$1asset_asset$1tags$1available_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.asset.taglib.servlet.taglib.AssetTagsAvailableTag.class) : new com.liferay.asset.taglib.servlet.taglib.AssetTagsAvailableTag();
          _jspx_th_liferay$1asset_asset$1tags$1available_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1asset_asset$1tags$1available_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
          _jspx_th_liferay$1asset_asset$1tags$1available_0.setClassName( DLFileEntryConstants.getClassName() );
          _jspx_th_liferay$1asset_asset$1tags$1available_0.setClassPK( assetClassPK );
          int _jspx_eval_liferay$1asset_asset$1tags$1available_0 = _jspx_th_liferay$1asset_asset$1tags$1available_0.doStartTag();
          if (_jspx_eval_liferay$1asset_asset$1tags$1available_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t\t\t<dt class=\"sidebar-dt\">\n");
            out.write("\t\t\t\t\t\t");
            if (_jspx_meth_liferay$1ui_message_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1asset_asset$1tags$1available_0, _jspx_page_context))
              return;
            out.write("\n");
            out.write("\t\t\t\t\t</dt>\n");
            out.write("\t\t\t\t\t<dd class=\"sidebar-dd\">\n");
            out.write("\t\t\t\t\t\t");
            //  liferay-asset:asset-tags-summary
            com.liferay.asset.taglib.servlet.taglib.AssetTagsSummaryTag _jspx_th_liferay$1asset_asset$1tags$1summary_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.asset.taglib.servlet.taglib.AssetTagsSummaryTag.class) : new com.liferay.asset.taglib.servlet.taglib.AssetTagsSummaryTag();
            _jspx_th_liferay$1asset_asset$1tags$1summary_0.setPageContext(_jspx_page_context);
            _jspx_th_liferay$1asset_asset$1tags$1summary_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1asset_asset$1tags$1available_0);
            _jspx_th_liferay$1asset_asset$1tags$1summary_0.setClassName( DLFileEntryConstants.getClassName() );
            _jspx_th_liferay$1asset_asset$1tags$1summary_0.setClassPK( assetClassPK );
            int _jspx_eval_liferay$1asset_asset$1tags$1summary_0 = _jspx_th_liferay$1asset_asset$1tags$1summary_0.doStartTag();
            if (_jspx_th_liferay$1asset_asset$1tags$1summary_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1asset_asset$1tags$1summary_0);
              _jspx_th_liferay$1asset_asset$1tags$1summary_0.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1asset_asset$1tags$1summary_0);
            _jspx_th_liferay$1asset_asset$1tags$1summary_0.release();
            out.write("\n");
            out.write("\t\t\t\t\t</dd>\n");
            out.write("\t\t\t\t");
          }
          if (_jspx_th_liferay$1asset_asset$1tags$1available_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1asset_asset$1tags$1available_0);
            _jspx_th_liferay$1asset_asset$1tags$1available_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1asset_asset$1tags$1available_0);
          _jspx_th_liferay$1asset_asset$1tags$1available_0.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t");
if (
 dlPortletInstanceSettings.isEnableRatings() && fileEntry.isSupportsSocial() ) {
          out.write("\n");
          out.write("\t\t\t\t\t<dt class=\"sidebar-dt\">\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_section_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t</dt>\n");
          out.write("\t\t\t\t\t<dd class=\"sidebar-dd\">\n");
          out.write("\t\t\t\t\t\t");
          //  liferay-ratings:ratings
          com.liferay.ratings.taglib.servlet.taglib.RatingsTag _jspx_th_liferay$1ratings_ratings_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.ratings.taglib.servlet.taglib.RatingsTag.class) : new com.liferay.ratings.taglib.servlet.taglib.RatingsTag();
          _jspx_th_liferay$1ratings_ratings_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ratings_ratings_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
          _jspx_th_liferay$1ratings_ratings_0.setClassName( DLFileEntryConstants.getClassName() );
          _jspx_th_liferay$1ratings_ratings_0.setClassPK( fileEntry.getFileEntryId() );
          _jspx_th_liferay$1ratings_ratings_0.setInTrash( fileEntry.isInTrash() );
          int _jspx_eval_liferay$1ratings_ratings_0 = _jspx_th_liferay$1ratings_ratings_0.doStartTag();
          if (_jspx_th_liferay$1ratings_ratings_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ratings_ratings_0);
            _jspx_th_liferay$1ratings_ratings_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ratings_ratings_0);
          _jspx_th_liferay$1ratings_ratings_0.release();
          out.write("\n");
          out.write("\t\t\t\t\t</dd>\n");
          out.write("\t\t\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t");
if (
 Validator.isNotNull(fileEntry.getDescription()) ) {
          out.write("\n");
          out.write("\t\t\t\t\t<dt class=\"sidebar-dt\">\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_section_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t</dt>\n");
          out.write("\t\t\t\t\t<dd class=\"sidebar-dd\">\n");
          out.write("\t\t\t\t\t\t");
          out.print( HtmlUtil.replaceNewLine(HtmlUtil.escape(fileVersion.getDescription())) );
          out.write("\n");
          out.write("\t\t\t\t\t</dd>\n");
          out.write("\t\t\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t");
          //  liferay-asset:asset-categories-available
          com.liferay.asset.taglib.servlet.taglib.AssetCategoriesAvailableTag _jspx_th_liferay$1asset_asset$1categories$1available_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.asset.taglib.servlet.taglib.AssetCategoriesAvailableTag.class) : new com.liferay.asset.taglib.servlet.taglib.AssetCategoriesAvailableTag();
          _jspx_th_liferay$1asset_asset$1categories$1available_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1asset_asset$1categories$1available_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
          _jspx_th_liferay$1asset_asset$1categories$1available_0.setClassName( DLFileEntryConstants.getClassName() );
          _jspx_th_liferay$1asset_asset$1categories$1available_0.setClassPK( assetClassPK );
          int _jspx_eval_liferay$1asset_asset$1categories$1available_0 = _jspx_th_liferay$1asset_asset$1categories$1available_0.doStartTag();
          if (_jspx_eval_liferay$1asset_asset$1categories$1available_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t\t\t<dt class=\"sidebar-dt\">\n");
            out.write("\t\t\t\t\t\t");
            if (_jspx_meth_liferay$1ui_message_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1asset_asset$1categories$1available_0, _jspx_page_context))
              return;
            out.write("\n");
            out.write("\t\t\t\t\t</dt>\n");
            out.write("\t\t\t\t\t<dd class=\"sidebar-dd\">\n");
            out.write("\t\t\t\t\t\t");
            //  liferay-asset:asset-categories-summary
            com.liferay.asset.taglib.servlet.taglib.AssetCategoriesSummaryTag _jspx_th_liferay$1asset_asset$1categories$1summary_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.asset.taglib.servlet.taglib.AssetCategoriesSummaryTag.class) : new com.liferay.asset.taglib.servlet.taglib.AssetCategoriesSummaryTag();
            _jspx_th_liferay$1asset_asset$1categories$1summary_0.setPageContext(_jspx_page_context);
            _jspx_th_liferay$1asset_asset$1categories$1summary_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1asset_asset$1categories$1available_0);
            _jspx_th_liferay$1asset_asset$1categories$1summary_0.setClassName( DLFileEntryConstants.getClassName() );
            _jspx_th_liferay$1asset_asset$1categories$1summary_0.setClassPK( assetClassPK );
            _jspx_th_liferay$1asset_asset$1categories$1summary_0.setDisplayStyle("simple-category");
            int _jspx_eval_liferay$1asset_asset$1categories$1summary_0 = _jspx_th_liferay$1asset_asset$1categories$1summary_0.doStartTag();
            if (_jspx_th_liferay$1asset_asset$1categories$1summary_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1asset_asset$1categories$1summary_0);
              _jspx_th_liferay$1asset_asset$1categories$1summary_0.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1asset_asset$1categories$1summary_0);
            _jspx_th_liferay$1asset_asset$1categories$1summary_0.release();
            out.write("\n");
            out.write("\t\t\t\t\t</dd>\n");
            out.write("\t\t\t\t");
          }
          if (_jspx_th_liferay$1asset_asset$1categories$1available_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1asset_asset$1categories$1available_0);
            _jspx_th_liferay$1asset_asset$1categories$1available_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1asset_asset$1categories$1available_0);
          _jspx_th_liferay$1asset_asset$1categories$1available_0.release();
          out.write("\n");
          out.write("\t\t\t</dl>\n");
          out.write("\n");
          out.write("\t\t\t");

			AssetEntry layoutAssetEntry = AssetEntryLocalServiceUtil.fetchEntry(DLFileEntryConstants.getClassName(), assetClassPK);
			
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t");
if (
 (layoutAssetEntry != null) && dlPortletInstanceSettings.isEnableRelatedAssets() && fileEntry.isSupportsSocial() ) {
          out.write("\n");
          out.write("\t\t\t\t");
          //  liferay-asset:asset-links
          com.liferay.asset.taglib.servlet.taglib.AssetLinksTag _jspx_th_liferay$1asset_asset$1links_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.asset.taglib.servlet.taglib.AssetLinksTag.class) : new com.liferay.asset.taglib.servlet.taglib.AssetLinksTag();
          _jspx_th_liferay$1asset_asset$1links_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1asset_asset$1links_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
          _jspx_th_liferay$1asset_asset$1links_0.setAssetEntryId( layoutAssetEntry.getEntryId() );
          int _jspx_eval_liferay$1asset_asset$1links_0 = _jspx_th_liferay$1asset_asset$1links_0.doStartTag();
          if (_jspx_th_liferay$1asset_asset$1links_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1asset_asset$1links_0);
            _jspx_th_liferay$1asset_asset$1links_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1asset_asset$1links_0);
          _jspx_th_liferay$1asset_asset$1links_0.release();
          out.write("\n");
          out.write("\t\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t");
          //  liferay-ui:panel-container
          com.liferay.taglib.ui.PanelContainerTag _jspx_th_liferay$1ui_panel$1container_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.PanelContainerTag.class) : new com.liferay.taglib.ui.PanelContainerTag();
          _jspx_th_liferay$1ui_panel$1container_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_panel$1container_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
          _jspx_th_liferay$1ui_panel$1container_0.setCssClass("metadata-panel-container panel-group-flush panel-group-sm");
          _jspx_th_liferay$1ui_panel$1container_0.setExtended( true );
          _jspx_th_liferay$1ui_panel$1container_0.setMarkupView("lexicon");
          _jspx_th_liferay$1ui_panel$1container_0.setPersistState( true );
          int _jspx_eval_liferay$1ui_panel$1container_0 = _jspx_th_liferay$1ui_panel$1container_0.doStartTag();
          if (_jspx_eval_liferay$1ui_panel$1container_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_liferay$1ui_panel$1container_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_liferay$1ui_panel$1container_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_liferay$1ui_panel$1container_0.doInitBody();
            }
            do {
              out.write("\n");
              out.write("\t\t\t\t");
if (
 dlViewFileVersionDisplayContext.getDDMStructuresCount() > 0 ) {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t");

					try {
						for (DDMStructure ddmStructure : dlViewFileVersionDisplayContext.getDDMStructures()) {
							DDMFormValues ddmFormValues = null;

							try {
								ddmFormValues = dlViewFileVersionDisplayContext.getDDMFormValues(ddmStructure);
							}
							catch (Exception e) {
							}
					
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
if (
 ddmFormValues != null ) {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t");
              //  liferay-ui:panel
              com.liferay.taglib.ui.PanelTag _jspx_th_liferay$1ui_panel_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.PanelTag.class) : new com.liferay.taglib.ui.PanelTag();
              _jspx_th_liferay$1ui_panel_0.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_panel_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_panel$1container_0);
              _jspx_th_liferay$1ui_panel_0.setCollapsible( true );
              _jspx_th_liferay$1ui_panel_0.setCssClass("metadata");
              _jspx_th_liferay$1ui_panel_0.setDefaultState("closed");
              _jspx_th_liferay$1ui_panel_0.setExtended( true );
              _jspx_th_liferay$1ui_panel_0.setId( "documentLibraryMetadataPanel_" + fileEntry.getFileEntryId() );
              _jspx_th_liferay$1ui_panel_0.setMarkupView("lexicon");
              _jspx_th_liferay$1ui_panel_0.setPersistState( true );
              _jspx_th_liferay$1ui_panel_0.setTitle( HtmlUtil.escape(ddmStructure.getName(locale)) );
              int _jspx_eval_liferay$1ui_panel_0 = _jspx_th_liferay$1ui_panel_0.doStartTag();
              if (_jspx_eval_liferay$1ui_panel_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t");
                //  liferay-data-engine:data-layout-renderer
                com.liferay.data.engine.taglib.servlet.taglib.DataLayoutRendererTag _jspx_th_liferay$1data$1engine_data$1layout$1renderer_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.data.engine.taglib.servlet.taglib.DataLayoutRendererTag.class) : new com.liferay.data.engine.taglib.servlet.taglib.DataLayoutRendererTag();
                _jspx_th_liferay$1data$1engine_data$1layout$1renderer_0.setPageContext(_jspx_page_context);
                _jspx_th_liferay$1data$1engine_data$1layout$1renderer_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_panel_0);
                _jspx_th_liferay$1data$1engine_data$1layout$1renderer_0.setContainerId( liferayPortletResponse.getNamespace() + "dataEngineLayoutRenderer" + ddmStructure.getStructureId() );
                _jspx_th_liferay$1data$1engine_data$1layout$1renderer_0.setDataDefinitionId( ddmStructure.getStructureId() );
                _jspx_th_liferay$1data$1engine_data$1layout$1renderer_0.setDataRecordValues( DataRecordValuesUtil.getDataRecordValues(ddmFormValues, ddmStructure) );
                _jspx_th_liferay$1data$1engine_data$1layout$1renderer_0.setNamespace( liferayPortletResponse.getNamespace() + ddmStructure.getStructureId() + StringPool.UNDERLINE );
                _jspx_th_liferay$1data$1engine_data$1layout$1renderer_0.setReadOnly( true );
                int _jspx_eval_liferay$1data$1engine_data$1layout$1renderer_0 = _jspx_th_liferay$1data$1engine_data$1layout$1renderer_0.doStartTag();
                if (_jspx_th_liferay$1data$1engine_data$1layout$1renderer_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1data$1engine_data$1layout$1renderer_0);
                  _jspx_th_liferay$1data$1engine_data$1layout$1renderer_0.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1data$1engine_data$1layout$1renderer_0);
                _jspx_th_liferay$1data$1engine_data$1layout$1renderer_0.release();
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t");
              }
              if (_jspx_th_liferay$1ui_panel_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_panel_0);
                _jspx_th_liferay$1ui_panel_0.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_panel_0);
              _jspx_th_liferay$1ui_panel_0.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
}
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t");

						}
					}
					catch (Exception e) {
					}
					
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t");
}
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t");
              //  liferay-expando:custom-attributes-available
              com.liferay.expando.taglib.servlet.taglib.CustomAttributesAvailableTag _jspx_th_liferay$1expando_custom$1attributes$1available_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.expando.taglib.servlet.taglib.CustomAttributesAvailableTag.class) : new com.liferay.expando.taglib.servlet.taglib.CustomAttributesAvailableTag();
              _jspx_th_liferay$1expando_custom$1attributes$1available_0.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1expando_custom$1attributes$1available_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_panel$1container_0);
              _jspx_th_liferay$1expando_custom$1attributes$1available_0.setClassName( DLFileEntryConstants.getClassName() );
              _jspx_th_liferay$1expando_custom$1attributes$1available_0.setClassPK( fileVersion.getFileVersionId() );
              _jspx_th_liferay$1expando_custom$1attributes$1available_0.setEditable( false );
              int _jspx_eval_liferay$1expando_custom$1attributes$1available_0 = _jspx_th_liferay$1expando_custom$1attributes$1available_0.doStartTag();
              if (_jspx_eval_liferay$1expando_custom$1attributes$1available_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  liferay-ui:panel
                com.liferay.taglib.ui.PanelTag _jspx_th_liferay$1ui_panel_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.PanelTag.class) : new com.liferay.taglib.ui.PanelTag();
                _jspx_th_liferay$1ui_panel_1.setPageContext(_jspx_page_context);
                _jspx_th_liferay$1ui_panel_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1expando_custom$1attributes$1available_0);
                _jspx_th_liferay$1ui_panel_1.setCollapsible( true );
                _jspx_th_liferay$1ui_panel_1.setCssClass("lfr-custom-fields");
                _jspx_th_liferay$1ui_panel_1.setDefaultState("closed");
                _jspx_th_liferay$1ui_panel_1.setId("documentLibraryCustomFieldsPanel");
                _jspx_th_liferay$1ui_panel_1.setMarkupView("lexicon");
                _jspx_th_liferay$1ui_panel_1.setPersistState( true );
                _jspx_th_liferay$1ui_panel_1.setTitle("custom-fields");
                int _jspx_eval_liferay$1ui_panel_1 = _jspx_th_liferay$1ui_panel_1.doStartTag();
                if (_jspx_eval_liferay$1ui_panel_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t");
                  //  liferay-expando:custom-attribute-list
                  com.liferay.expando.taglib.servlet.taglib.CustomAttributeListTag _jspx_th_liferay$1expando_custom$1attribute$1list_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.expando.taglib.servlet.taglib.CustomAttributeListTag.class) : new com.liferay.expando.taglib.servlet.taglib.CustomAttributeListTag();
                  _jspx_th_liferay$1expando_custom$1attribute$1list_0.setPageContext(_jspx_page_context);
                  _jspx_th_liferay$1expando_custom$1attribute$1list_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_panel_1);
                  _jspx_th_liferay$1expando_custom$1attribute$1list_0.setClassName( DLFileEntryConstants.getClassName() );
                  _jspx_th_liferay$1expando_custom$1attribute$1list_0.setClassPK( fileVersion.getFileVersionId() );
                  _jspx_th_liferay$1expando_custom$1attribute$1list_0.setEditable( false );
                  _jspx_th_liferay$1expando_custom$1attribute$1list_0.setLabel( true );
                  int _jspx_eval_liferay$1expando_custom$1attribute$1list_0 = _jspx_th_liferay$1expando_custom$1attribute$1list_0.doStartTag();
                  if (_jspx_th_liferay$1expando_custom$1attribute$1list_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1expando_custom$1attribute$1list_0);
                    _jspx_th_liferay$1expando_custom$1attribute$1list_0.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1expando_custom$1attribute$1list_0);
                  _jspx_th_liferay$1expando_custom$1attribute$1list_0.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t");
                }
                if (_jspx_th_liferay$1ui_panel_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_panel_1);
                  _jspx_th_liferay$1ui_panel_1.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_panel_1);
                _jspx_th_liferay$1ui_panel_1.release();
                out.write("\n");
                out.write("\t\t\t\t");
              }
              if (_jspx_th_liferay$1expando_custom$1attributes$1available_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1expando_custom$1attributes$1available_0);
                _jspx_th_liferay$1expando_custom$1attributes$1available_0.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1expando_custom$1attributes$1available_0);
              _jspx_th_liferay$1expando_custom$1attributes$1available_0.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t");

				try {
					List<DDMStructure> ddmStructures = DDMStructureManagerUtil.getClassStructures(company.getCompanyId(), PortalUtil.getClassNameId(RawMetadataProcessor.class), DDMStructureManager.STRUCTURE_COMPARATOR_STRUCTURE_KEY);

					for (DDMStructure ddmStructure : ddmStructures) {
						DDMFormValues ddmFormValues = null;

						DLFileEntryMetadata fileEntryMetadata = DLFileEntryMetadataLocalServiceUtil.fetchFileEntryMetadata(ddmStructure.getStructureId(), fileVersion.getFileVersionId());

						if (fileEntryMetadata != null) {
							ddmFormValues = dlViewFileVersionDisplayContext.getDDMFormValues(fileEntryMetadata.getDDMStorageId());
						}
				
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t");
if (
 ddmFormValues != null ) {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  liferay-ui:panel
              com.liferay.taglib.ui.PanelTag _jspx_th_liferay$1ui_panel_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.PanelTag.class) : new com.liferay.taglib.ui.PanelTag();
              _jspx_th_liferay$1ui_panel_2.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_panel_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_panel$1container_0);
              _jspx_th_liferay$1ui_panel_2.setCollapsible( true );
              _jspx_th_liferay$1ui_panel_2.setCssClass("lfr-asset-metadata panel-unstyled");
              _jspx_th_liferay$1ui_panel_2.setDefaultState("closed");
              _jspx_th_liferay$1ui_panel_2.setId( "documentLibraryMetadataPanel_" + fileEntry.getFileEntryId() );
              _jspx_th_liferay$1ui_panel_2.setMarkupView("lexicon");
              _jspx_th_liferay$1ui_panel_2.setPersistState( true );
              _jspx_th_liferay$1ui_panel_2.setTitle( "metadata." + ddmStructure.getStructureKey() );
              int _jspx_eval_liferay$1ui_panel_2 = _jspx_th_liferay$1ui_panel_2.doStartTag();
              if (_jspx_eval_liferay$1ui_panel_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t");
                //  liferay-ddm:html
                com.liferay.dynamic.data.mapping.taglib.servlet.taglib.HTMLTag _jspx_th_liferay$1ddm_html_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.dynamic.data.mapping.taglib.servlet.taglib.HTMLTag.class) : new com.liferay.dynamic.data.mapping.taglib.servlet.taglib.HTMLTag();
                _jspx_th_liferay$1ddm_html_0.setPageContext(_jspx_page_context);
                _jspx_th_liferay$1ddm_html_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_panel_2);
                _jspx_th_liferay$1ddm_html_0.setClassNameId( PortalUtil.getClassNameId(com.liferay.dynamic.data.mapping.model.DDMStructure.class) );
                _jspx_th_liferay$1ddm_html_0.setClassPK( ddmStructure.getPrimaryKey() );
                _jspx_th_liferay$1ddm_html_0.setDdmFormValues( ddmFormValues );
                _jspx_th_liferay$1ddm_html_0.setFieldsNamespace( String.valueOf(ddmStructure.getPrimaryKey()) );
                _jspx_th_liferay$1ddm_html_0.setGroupId( fileVersion.getGroupId() );
                _jspx_th_liferay$1ddm_html_0.setReadOnly( true );
                _jspx_th_liferay$1ddm_html_0.setRequestedLocale( ddmFormValues.getDefaultLocale() );
                _jspx_th_liferay$1ddm_html_0.setShowEmptyFieldLabel( false );
                int _jspx_eval_liferay$1ddm_html_0 = _jspx_th_liferay$1ddm_html_0.doStartTag();
                if (_jspx_th_liferay$1ddm_html_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ddm_html_0);
                  _jspx_th_liferay$1ddm_html_0.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ddm_html_0);
                _jspx_th_liferay$1ddm_html_0.release();
                out.write("\n");
                out.write("\t\t\t\t\t\t\t");
              }
              if (_jspx_th_liferay$1ui_panel_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_panel_2);
                _jspx_th_liferay$1ui_panel_2.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_panel_2);
              _jspx_th_liferay$1ui_panel_2.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t");
}
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t");

					}
				}
				catch (Exception e) {
				}
				
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");
              int evalDoAfterBody = _jspx_th_liferay$1ui_panel$1container_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_liferay$1ui_panel$1container_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_liferay$1ui_panel$1container_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_panel$1container_0);
            _jspx_th_liferay$1ui_panel$1container_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_panel$1container_0);
          _jspx_th_liferay$1ui_panel$1container_0.release();
          out.write("\n");
          out.write("\t\t");
        }
        if (_jspx_th_liferay$1ui_section_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_section_0);
          _jspx_th_liferay$1ui_section_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_section_0);
        _jspx_th_liferay$1ui_section_0.release();
        out.write("\n");
        out.write("\n");
        out.write("\t\t");
if (
 dlViewFileVersionDisplayContext.isVersionInfoVisible() ) {
        out.write("\n");
        out.write("\t\t\t");
        //  liferay-ui:section
        com.liferay.taglib.ui.SectionTag _jspx_th_liferay$1ui_section_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SectionTag.class) : new com.liferay.taglib.ui.SectionTag();
        _jspx_th_liferay$1ui_section_1.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_section_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_tabs_0);
        int _jspx_eval_liferay$1ui_section_1 = _jspx_th_liferay$1ui_section_1.doStartTag();
        if (_jspx_eval_liferay$1ui_section_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          java.lang.String sectionParam = null;
          java.lang.String sectionName = null;
          java.lang.Boolean sectionSelected = null;
          java.lang.String sectionScroll = null;
          java.lang.String sectionRedirectParams = null;
          sectionParam = (java.lang.String) _jspx_page_context.findAttribute("sectionParam");
          sectionName = (java.lang.String) _jspx_page_context.findAttribute("sectionName");
          sectionSelected = (java.lang.Boolean) _jspx_page_context.findAttribute("sectionSelected");
          sectionScroll = (java.lang.String) _jspx_page_context.findAttribute("sectionScroll");
          sectionRedirectParams = (java.lang.String) _jspx_page_context.findAttribute("sectionRedirectParams");
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t");

				request.setAttribute("info_panel.jsp-fileEntry", fileEntry);
				
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t");
          //  liferay-util:include
          com.liferay.taglib.util.IncludeTag _jspx_th_liferay$1util_include_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.IncludeTag.class) : new com.liferay.taglib.util.IncludeTag();
          _jspx_th_liferay$1util_include_2.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1util_include_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_1);
          _jspx_th_liferay$1util_include_2.setPage("/document_library/file_entry_history.jsp");
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
          out.write("\t\t\t");
        }
        if (_jspx_th_liferay$1ui_section_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_section_1);
          _jspx_th_liferay$1ui_section_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_section_1);
        _jspx_th_liferay$1ui_section_1.release();
        out.write("\n");
        out.write("\t\t");
}
        out.write('\n');
        out.write('	');
      }
      if (_jspx_th_liferay$1ui_tabs_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_tabs_0);
        _jspx_th_liferay$1ui_tabs_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_tabs_0);
      _jspx_th_liferay$1ui_tabs_0.release();
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      if (_jspx_meth_liferay$1frontend_component_0(_jspx_page_context))
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

  private boolean _jspx_meth_liferay$1ui_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_content$1col_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_3);
    _jspx_th_liferay$1ui_message_1.setKey("owner");
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

  private boolean _jspx_meth_liferay$1ui_message_3(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_section_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_3.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
    _jspx_th_liferay$1ui_message_3.setKey("document-type");
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

  private boolean _jspx_meth_liferay$1ui_message_4(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_section_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_4.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
    _jspx_th_liferay$1ui_message_4.setKey("extension");
    int _jspx_eval_liferay$1ui_message_4 = _jspx_th_liferay$1ui_message_4.doStartTag();
    if (_jspx_th_liferay$1ui_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_4);
      _jspx_th_liferay$1ui_message_4.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_4);
    _jspx_th_liferay$1ui_message_4.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_5(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_section_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_5.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
    _jspx_th_liferay$1ui_message_5.setKey("size");
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

  private boolean _jspx_meth_liferay$1ui_message_6(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_section_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_6.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
    _jspx_th_liferay$1ui_message_6.setKey("modified");
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

  private boolean _jspx_meth_liferay$1ui_message_8(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_section_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_8.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
    _jspx_th_liferay$1ui_message_8.setKey("created");
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

  private boolean _jspx_meth_liferay$1ui_message_10(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_section_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_10.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
    _jspx_th_liferay$1ui_message_10.setKey("expiration-date");
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

  private boolean _jspx_meth_liferay$1ui_message_12(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_section_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_12 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_12.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
    _jspx_th_liferay$1ui_message_12.setKey("never-expire");
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

  private boolean _jspx_meth_liferay$1ui_message_13(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_section_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_13 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_13.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
    _jspx_th_liferay$1ui_message_13.setKey("review-date");
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

  private boolean _jspx_meth_liferay$1ui_message_15(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_section_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_15 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_15.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
    _jspx_th_liferay$1ui_message_15.setKey("never-review");
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

  private boolean _jspx_meth_liferay$1ui_message_16(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1asset_asset$1tags$1available_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_16 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_16.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1asset_asset$1tags$1available_0);
    _jspx_th_liferay$1ui_message_16.setKey("tags");
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

  private boolean _jspx_meth_liferay$1ui_message_17(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_section_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_17 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_17.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
    _jspx_th_liferay$1ui_message_17.setKey("ratings");
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

  private boolean _jspx_meth_liferay$1ui_message_18(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_section_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_18 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_18.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_section_0);
    _jspx_th_liferay$1ui_message_18.setKey("description");
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

  private boolean _jspx_meth_liferay$1ui_message_19(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1asset_asset$1categories$1available_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_19 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_19.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1asset_asset$1categories$1available_0);
    _jspx_th_liferay$1ui_message_19.setKey("categories");
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

  private boolean _jspx_meth_liferay$1frontend_component_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-frontend:component
    com.liferay.frontend.taglib.servlet.taglib.ComponentTag _jspx_th_liferay$1frontend_component_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.ComponentTag.class) : new com.liferay.frontend.taglib.servlet.taglib.ComponentTag();
    _jspx_th_liferay$1frontend_component_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1frontend_component_0.setParent(null);
    _jspx_th_liferay$1frontend_component_0.setModule("document_library/js/InfoPanel.es");
    int _jspx_eval_liferay$1frontend_component_0 = _jspx_th_liferay$1frontend_component_0.doStartTag();
    if (_jspx_th_liferay$1frontend_component_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_component_0);
      _jspx_th_liferay$1frontend_component_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_component_0);
    _jspx_th_liferay$1frontend_component_0.release();
    return false;
  }
}
