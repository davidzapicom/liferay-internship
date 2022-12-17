package es.capgemini.practicas.listadotiendas.portlet.portlet;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import es.capgemini.practicas.listadotiendas.portlet.constants.ListadoTiendasPortletKeys;
import es.capgemini.practicas.listadotiendas.portlet.render.DetalleTiendaRenderCommand;
import es.capgemini.practicas.sb.tienda.model.Tienda;
import es.capgemini.practicas.sb.tienda.service.TiendaLocalService;

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
		"com.liferay.portlet.css-class-wrapper=listado-tiendas-portlet",
		"javax.portlet.display-name=ListadoTiendas",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ListadoTiendasPortletKeys.LISTADOTIENDAS,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)

public class ListadoTiendasPortlet extends MVCPortlet {
	private static final Log _log = LogFactoryUtil.getLog(
			ListadoTiendasPortlet.class);
		
	@Reference 
	private TiendaLocalService _tiendaService;
	

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException  {
	    
//		int finLstTienda = _tiendaService.getTiendasCount();
		
		List<Tienda> lstTiendas = new ArrayList<Tienda>();
//		int finLstTienda = lstTiendas.size();
//		int finLstTienda = _tiendaService.getTiendasCount();
		lstTiendas = _tiendaService.getTiendas(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		_log.info("Tamaño lista: " +lstTiendas.size());
		_log.info(lstTiendas);
		
		if (lstTiendas.isEmpty()) {
			_log.info("No hay tiendas");
		} 
		
		renderRequest.setAttribute("listaTiendas", lstTiendas);
		super.render(renderRequest, renderResponse);
	}

}