package es.capgemini.practicas.selecmunicipios.portlet.portlet;

import es.capgemini.practicas.selecmunicipios.portlet.constants.SelecMunicipiosPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author dzapicom
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=PRACTICAS",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
	    "com.liferay.portlet.header-portlet-js=/js/main.js",
		"com.liferay.portlet.instanceable=true",
		"com.liferay.portlet.css-class-wrapper=mi-primer-portlet portlet-practicas",
		"javax.portlet.display-name=SelecMunicipios",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + SelecMunicipiosPortletKeys.SELECMUNICIPIOS,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class SelecMunicipiosPortlet extends MVCPortlet {
}