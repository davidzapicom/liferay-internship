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
package es.capgemini.practicas.listadotiendas.portlet.render;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import es.capgemini.practicas.listadotiendas.portlet.constants.ListadoTiendasPortletKeys;
import es.capgemini.practicas.sb.tienda.model.Tienda;
import es.capgemini.practicas.sb.tienda.service.TiendaLocalService;

@Component(immediate = true, property = { "javax.portlet.name=" + ListadoTiendasPortletKeys.LISTADOTIENDAS,
		"mvc.command.name=/tienda/detalle" }, service = MVCRenderCommand.class)
public class DetalleTiendaRenderCommand implements MVCRenderCommand {
	private static final Log _log = LogFactoryUtil.getLog(DetalleTiendaRenderCommand.class);

	@Reference
	private TiendaLocalService _tiendaService;

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {

		long id = ParamUtil.getLong(renderRequest, "id");
		_log.info("id tienda: " + id);

//		List<Tienda> objTienda = new ArrayList<Tienda>();
		Tienda objTienda = null;
		try {
			objTienda = _tiendaService.getTienda(id);
		} catch (PortalException e) {
			SessionErrors.add(renderRequest, "notFound");
			_log.info("no hay tiendas");
		}

		renderRequest.setAttribute("objTienda", objTienda);

		// service
		// mandar view con set attribute

		return "/detalle.jsp";
	}
}