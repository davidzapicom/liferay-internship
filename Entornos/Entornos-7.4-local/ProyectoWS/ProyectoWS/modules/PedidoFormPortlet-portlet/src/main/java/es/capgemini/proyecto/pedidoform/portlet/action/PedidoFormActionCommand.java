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
package es.capgemini.proyecto.pedidoform.portlet.action;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.journal.model.JournalArticle;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import es.capgemini.proyecto.pedidoform.portlet.constants.PedidoFormPortletKeys;
import es.capgemini.proyecto.procesopedido.sb.model.Pedidos;
import es.capgemini.proyecto.procesopedido.sb.service.PedidosLocalService;

@Component(immediate = true, property = { "javax.portlet.name=" + PedidoFormPortletKeys.PEDIDOFORM,
		"mvc.command.name=/pedido/tramitar" }, service = MVCActionCommand.class)
public class PedidoFormActionCommand implements MVCActionCommand {
	private static final Log _log = LogFactoryUtil.getLog(PedidoFormActionCommand.class);

	@Reference
	private PedidosLocalService _pedidosService;

	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
		_log.info("Llama");

		long idUsuario = ParamUtil.getLong(actionRequest, "idUsuario");
		actionRequest.setAttribute("idUsuario", idUsuario);
		_log.info(idUsuario);

		ThemeDisplay td = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		JournalArticle ja = (JournalArticle) actionRequest.getAttribute("INFO_ITEM");
		String idProduct = ja.getArticleId();
		long idProducto = Long.parseLong(idProduct);
		_log.info(idProducto);

		String stockStr = ParamUtil.getString(actionRequest, "stock");
		_log.info(stockStr);

		int stock = Integer.parseInt(stockStr);
		actionRequest.setAttribute("stock", stock);

		String precioStr = ParamUtil.getString(actionRequest, "precio");
		_log.info(precioStr);

		double precio = Double.parseDouble(precioStr);
		actionRequest.setAttribute("precio", precio);

		String name = ParamUtil.getString(actionRequest, "name", "");
		actionRequest.setAttribute("name", name);
		_log.info(name);

		String email = ParamUtil.getString(actionRequest, "email", "");
		actionRequest.setAttribute("email", email);
		_log.info(email);

		String selectVia = ParamUtil.getString(actionRequest, "selectVia", "");
		actionRequest.setAttribute("selectVia", selectVia);
		_log.info(selectVia);

		String address = ParamUtil.getString(actionRequest, "address", "");
		actionRequest.setAttribute("address", address);
		_log.info(address);

		String codigoPostal = ParamUtil.getString(actionRequest, "codigoPostal", "");
		actionRequest.setAttribute("codigoPostal", codigoPostal);
		_log.info(codigoPostal);

		String selectPaises = ParamUtil.getString(actionRequest, "selectPaises", "");
		actionRequest.setAttribute("selectPaises", selectPaises);
		_log.info(selectPaises);

		String selectProvincias = ParamUtil.getString(actionRequest, "selectProvincias", "");
		actionRequest.setAttribute("selectProvincias", selectProvincias);
		_log.info(selectProvincias);

		String selectCiudades = ParamUtil.getString(actionRequest, "selectCiudades", "");
		actionRequest.setAttribute("selectCiudades", selectCiudades);
		_log.info(selectCiudades);

		int amount = ParamUtil.getInteger(actionRequest, "amount", 1);
		actionRequest.setAttribute("amount", amount);
		_log.info(amount);
		// Fin recojo variables

		List<Pedidos> lstPedidos = _pedidosService.findByOrder(idUsuario, idProducto);

		if (lstPedidos.isEmpty()) {
			_log.info("pedido correcto");
			// Creamos Id
			long newId = CounterLocalServiceUtil.increment(Pedidos.class.getName());
			Pedidos pedido = _pedidosService.createPedidos(newId);

			// Añado los valores a cada campo a través de los sets
			pedido.setIdUsuario(idUsuario);
			pedido.setEmail(email);
			pedido.setNombre(name);
			pedido.setVia(selectVia);
			pedido.setDireccion(address);
			pedido.setPais(selectPaises);
			pedido.setProvincia(selectProvincias);
			pedido.setCiudad(selectCiudades);
			pedido.setCodipoPostal(codigoPostal);
			pedido.setIdProducto(idProducto);
			pedido.setPrecio(precio);
			pedido.setCantidad(amount);

			// Añadir a base de datos
			_pedidosService.addPedidos(pedido);
			SessionMessages.add(actionRequest, "pedidoRealizado");

//			actionResponse.setRenderParameter("idTest", String.valueOf(newId));

			redirectRenderCommand(actionRequest, actionResponse, "/pedido/detalle", newId);
		} else {
			_log.error("hay pedido");

			// Mensaje de aviso de que ya hay un pedido realizado con ese id usuario y id de
			// producto.
			SessionErrors.add(actionRequest, "pedidoError");
		}

		return true;
	}

	private void redirectRenderCommand(ActionRequest request, ActionResponse response, String command, long newId) {

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		PortletURL renderUrl = PortletURLFactoryUtil.create(request, themeDisplay.getPortletDisplay().getId(),
				themeDisplay.getPlid(), PortletRequest.RENDER_PHASE);
		renderUrl.setParameter("mvcRenderCommandName", command);
		renderUrl.setParameter(response.getNamespace() + "id", String.valueOf(newId));
		_log.info("entra en el redirect: " + renderUrl.toString());
		_log.info("idUsuario: " + String.valueOf(newId));
		try {
			response.sendRedirect(renderUrl.toString());
		} catch (IOException e) {
			_log.error("redirectRenderCommand error. " + e.toString());
		}
	}
}