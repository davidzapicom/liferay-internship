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
package es.capgemini.proyecto.pedidoform.portlet.render;

import com.liferay.journal.model.JournalArticle;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import es.capgemini.proyecto.pedidoform.portlet.constants.PedidoFormPortletKeys;
import es.capgemini.proyecto.procesopedido.sb.model.Pedidos;
import es.capgemini.proyecto.procesopedido.sb.service.PedidosLocalService;

@Component(immediate = true, property = { "javax.portlet.name=" + PedidoFormPortletKeys.PEDIDOFORM,
		"mvc.command.name=/pedido/detalle" }, service = MVCRenderCommand.class)
public class PedidoFormRenderCommand implements MVCRenderCommand {

	private static final Log _log = LogFactoryUtil.getLog(PedidoFormRenderCommand.class);

	@Reference
	private PedidosLocalService _pedidosService;

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		ThemeDisplay td = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long userId = td.getUserId();

		JournalArticle ja = (JournalArticle) renderRequest.getAttribute("INFO_ITEM");
		String idProduct = ja.getArticleId();
		long idProducto = Long.parseLong(idProduct);

		List<Pedidos> lstPedido = _pedidosService.findByOrder(userId, idProducto);

		renderRequest.setAttribute("listaPedido", lstPedido);

		_log.info("Id: " + userId);

//		Pedidos pedido = _pedidosService.getPedidos(id);
//		pedido.getId();
//		renderRequest.setAttribute("name", name);
		return "/detalle.jsp";
	}
}