package es.capgemini.proyecto.homepubig.portlet.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

import es.capgemini.proyecto.homepubig.portlet.constants.HomePubIGPortletKeys;

/**
 * @author dzapicom
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=WECANBS",
		"com.liferay.portlet.header-portlet-css=/css/main.css", "com.liferay.portlet.instanceable=true",
		"com.liferay.portlet.css-class-wrapper=home-publicador-ig-portlet", "javax.portlet.display-name=HomePubIG",
		"javax.portlet.init-param.template-path=/", "javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + HomePubIGPortletKeys.HOMEPUBIG, "javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class HomePubIGPortlet extends MVCPortlet {
}