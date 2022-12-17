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
package es.capgemini.practicas.visualizacioncontenido.portlet.render;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import es.capgemini.practicas.visualizacioncontenido.portlet.constants.VisualizacionContenidoPortletKeys;

@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + VisualizacionContenidoPortletKeys.VISUALIZACIONCONTENIDO,
		"mvc.command.name=/create/detalle"
	},
	service = MVCRenderCommand.class
)
public class DetalleRenderCommand implements MVCRenderCommand {


	private static final Log _log = LogFactoryUtil.getLog(
		DetalleRenderCommand.class);


	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {

		String articuloId = ParamUtil.getString(renderRequest, "articuloId");
		renderRequest.setAttribute("articuloId", articuloId);
		
		String groupId = ParamUtil.getString(renderRequest, "groupId");
		renderRequest.setAttribute("groupId", groupId);

		return "/detalle.jsp";
	}
}