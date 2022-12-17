package es.capgemini.proyecto.consultapedidos.portlet.portlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import es.capgemini.proyecto.consultapedidos.portlet.constants.ConsultaPedidosPortletKeys;
import es.capgemini.proyecto.procesopedido.sb.model.Pedidos;
import es.capgemini.proyecto.procesopedido.sb.service.PedidosLocalService;

/**
 * @author dzapicom
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=WECANBS",
		"com.liferay.portlet.header-portlet-css=/css/main.css", "com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=ConsultaPedidos", "javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ConsultaPedidosPortletKeys.CONSULTAPEDIDOS,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class ConsultaPedidosPortlet extends MVCPortlet {
	private static final Log _log = LogFactoryUtil.getLog(ConsultaPedidosPortlet.class);

	@Reference
	private PedidosLocalService _pedidosService;

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		ThemeDisplay td = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long userId = td.getUserId();

		List<Pedidos> lstPedidos = _pedidosService.findByUser(userId);

		_log.info("Tamaño lista: " + lstPedidos.size());
		_log.info(lstPedidos);

		if (lstPedidos.isEmpty()) {
			_log.info("No hay pedidos");
		}

		renderRequest.setAttribute("listaPedidos", lstPedidos);
		super.render(renderRequest, renderResponse);
	}
}