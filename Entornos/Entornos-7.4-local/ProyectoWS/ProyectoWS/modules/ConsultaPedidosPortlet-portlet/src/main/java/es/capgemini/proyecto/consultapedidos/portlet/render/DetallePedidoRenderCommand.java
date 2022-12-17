/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package es.capgemini.proyecto.consultapedidos.portlet.render;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import es.capgemini.proyecto.consultapedidos.portlet.constants.ConsultaPedidosPortletKeys;
import es.capgemini.proyecto.procesopedido.sb.model.Pedidos;
import es.capgemini.proyecto.procesopedido.sb.service.PedidosLocalService;

@Component(immediate = true, property = { "javax.portlet.name=" + ConsultaPedidosPortletKeys.CONSULTAPEDIDOS,
		"mvc.command.name=/pedido/detalle" }, service = MVCRenderCommand.class)
public class DetallePedidoRenderCommand implements MVCRenderCommand {
	private static final Log _log = LogFactoryUtil.getLog(DetallePedidoRenderCommand.class);

	@Reference
	private PedidosLocalService _pedidosService;

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {

		long id = ParamUtil.getLong(renderRequest, "id");
		_log.info("id pedido: " + id);

		Pedidos objPedido = null;
		try {
			objPedido = _pedidosService.getPedidos(id);
		} catch (PortalException e) {
			SessionErrors.add(renderRequest, "notFound");
			_log.error("no hay pedido");
		}

		renderRequest.setAttribute("objPedido", objPedido);

		return "/detalle.jsp";
	}
}