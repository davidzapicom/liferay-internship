package es.capgemini.practicas.portlet.portlet;

import es.capgemini.practicas.portlet.constants.MiPrimerVideoPortletKeys;

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
		"com.liferay.portlet.instanceable=true",
		"com.liferay.portlet.css-class-wrapper=mi-primer-portlet portlet-practicas",
		"javax.portlet.display-name=Video de bienvenida",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + MiPrimerVideoPortletKeys.MIPRIMERVIDEO,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class MiPrimerVideoPortlet extends MVCPortlet {
}