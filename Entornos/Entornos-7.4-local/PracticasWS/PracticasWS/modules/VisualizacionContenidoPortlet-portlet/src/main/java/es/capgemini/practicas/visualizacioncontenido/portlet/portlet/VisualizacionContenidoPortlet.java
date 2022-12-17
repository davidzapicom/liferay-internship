package es.capgemini.practicas.visualizacioncontenido.portlet.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

import es.capgemini.practicas.visualizacioncontenido.portlet.constants.VisualizacionContenidoPortletKeys;

/**
 * @author dzapicom
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=PRACTICAS",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"com.liferay.portlet.css-class-wrapper=visualizacion-contenido-portlet",
		"javax.portlet.display-name=VisualizacionContenido",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + VisualizacionContenidoPortletKeys.VISUALIZACIONCONTENIDO,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)

public class VisualizacionContenidoPortlet extends MVCPortlet {
}