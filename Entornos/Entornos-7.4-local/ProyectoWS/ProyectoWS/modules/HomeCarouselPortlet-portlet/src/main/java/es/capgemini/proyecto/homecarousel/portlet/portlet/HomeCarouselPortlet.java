package es.capgemini.proyecto.homecarousel.portlet.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

import es.capgemini.proyecto.homecarousel.portlet.constants.HomeCarouselPortletKeys;

/**
 * @author dzapicom
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=WECANBS",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"com.liferay.portlet.css-class-wrapper=home-carousel-portlet",
		"javax.portlet.display-name=HomeCarousel",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + HomeCarouselPortletKeys.HOMECAROUSEL,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class HomeCarouselPortlet extends MVCPortlet {
}