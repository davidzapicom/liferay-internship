package es.capgemini.practicas.tiendas.portlet.portlet;

import es.capgemini.practicas.tiendas.portlet.constants.TiendasPortletKeys;

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
		"com.liferay.portlet.css-class-wrapper=form-tiendas-portlet",
		"javax.portlet.display-name=Tiendas",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + TiendasPortletKeys.TIENDAS,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class TiendasPortlet extends MVCPortlet {
}