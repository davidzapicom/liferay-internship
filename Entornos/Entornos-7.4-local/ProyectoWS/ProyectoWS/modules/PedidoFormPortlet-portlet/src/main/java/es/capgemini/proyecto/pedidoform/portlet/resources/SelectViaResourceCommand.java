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
package es.capgemini.proyecto.pedidoform.portlet.resources;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import es.capgemini.proyecto.pedidoform.portlet.constants.PedidoFormPortletKeys;

@Component(immediate = true, property = { "javax.portlet.name=" + PedidoFormPortletKeys.PEDIDOFORM,
		"mvc.command.name=/pedido/via" }, service = MVCResourceCommand.class)
public class SelectViaResourceCommand implements MVCResourceCommand {

	private static final Log _log = LogFactoryUtil.getLog(SelectViaResourceCommand.class);

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("LLAMA VIAS");

		JSONArray arrayVias = JSONFactoryUtil.createJSONArray();
		JSONObject objectCalle = JSONFactoryUtil.createJSONObject();
		objectCalle.put("value", "Calle");
		objectCalle.put("option", "Calle");
		arrayVias.put(objectCalle);

		JSONObject objectBulevar = JSONFactoryUtil.createJSONObject();
		objectBulevar.put("value", "Bulevar");
		objectBulevar.put("option", "Bulevar");
		arrayVias.put(objectBulevar);

		JSONObject objectCallejon = JSONFactoryUtil.createJSONObject();
		objectCallejon.put("value", "Callejón");
		objectCallejon.put("option", "Callejón");
		arrayVias.put(objectCallejon);

		JSONObject objectCamino = JSONFactoryUtil.createJSONObject();
		objectCamino.put("value", "Camino");
		objectCamino.put("option", "Camino");
		arrayVias.put(objectCamino);

		JSONObject objectCarretera = JSONFactoryUtil.createJSONObject();
		objectCarretera.put("value", "Carretera");
		objectCarretera.put("option", "Carretera");
		arrayVias.put(objectCarretera);

		JSONObject objectPlaza = JSONFactoryUtil.createJSONObject();
		objectPlaza.put("value", "Plaza");
		objectPlaza.put("option", "Plaza");
		arrayVias.put(objectPlaza);

		JSONObject objectTravesia = JSONFactoryUtil.createJSONObject();
		objectTravesia.put("value", "Travesía");
		objectTravesia.put("option", "Travesía");
		arrayVias.put(objectTravesia);

		JSONObject objectUrbanizacion = JSONFactoryUtil.createJSONObject();
		objectUrbanizacion.put("value", "Urbanización");
		objectUrbanizacion.put("option", "Urbanización");
		arrayVias.put(objectUrbanizacion);

		_log.info("devuelvo vias");
		try {
			PrintWriter writer = resourceResponse.getWriter();
			writer.print(arrayVias.toJSONString());
			resourceResponse.setProperty(ResourceResponse.HTTP_STATUS_CODE, "200");
			writer.close();
		} catch (IOException e) {
			_log.error("onSuccess() :: Error al enviar la respuesta");
		}
		return true;
	}

}