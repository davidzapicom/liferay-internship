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
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import es.capgemini.proyecto.pedidoform.portlet.constants.PedidoFormPortletKeys;

@Component(immediate = true, property = { "javax.portlet.name=" + PedidoFormPortletKeys.PEDIDOFORM,
		"mvc.command.name=/pedido/provincia" }, service = MVCResourceCommand.class)
public class SelectProvinciaResourceCommand implements MVCResourceCommand {

	private static final Log _log = LogFactoryUtil.getLog(SelectProvinciaResourceCommand.class);

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {

		String idPais = ParamUtil.getString(resourceRequest, "pais");
		_log.info(idPais);

		JSONArray arrayEspana = JSONFactoryUtil.createJSONArray();
		JSONObject objectLugo = JSONFactoryUtil.createJSONObject();
		objectLugo.put("option", "Lugo");
		objectLugo.put("value", "Lugo");
		arrayEspana.put(objectLugo);

		JSONObject objectAsturias = JSONFactoryUtil.createJSONObject();
		objectAsturias.put("option", "Asturias");
		objectAsturias.put("value", "Asturias");
		arrayEspana.put(objectAsturias);

		JSONObject objectPaisVasco = JSONFactoryUtil.createJSONObject();
		objectPaisVasco.put("option", "Pais Vasco");
		objectPaisVasco.put("value", "Pais Vasco");
		arrayEspana.put(objectPaisVasco);

		JSONObject objectCantabria = JSONFactoryUtil.createJSONObject();
		objectCantabria.put("option", "Cantabria");
		objectCantabria.put("value", "Cantabria");
		arrayEspana.put(objectCantabria);

		JSONArray arrayFrancia = JSONFactoryUtil.createJSONArray();
		JSONObject objectBerry = JSONFactoryUtil.createJSONObject();
		objectBerry.put("option", "Berry");
		objectBerry.put("value", "Berry");
		arrayFrancia.put(objectBerry);

		JSONObject objectLemosin = JSONFactoryUtil.createJSONObject();
		objectLemosin.put("option", "Lemosin");
		objectLemosin.put("value", "Lemosin");
		arrayFrancia.put(objectLemosin);

		JSONObject objectBearne = JSONFactoryUtil.createJSONObject();
		objectBearne.put("option", "Bearne");
		objectBearne.put("value", "Bearne");
		arrayFrancia.put(objectBearne);

		JSONObject objectNormandia = JSONFactoryUtil.createJSONObject();
		objectNormandia.put("option", "Normandia");
		objectNormandia.put("value", "Normandia");
		arrayFrancia.put(objectNormandia);

		try {
			PrintWriter writer = resourceResponse.getWriter();
			_log.info(idPais);
			if (idPais.equals("ES")) {
				writer.print(arrayEspana.toJSONString());
				_log.info(arrayEspana.toJSONString());
			} else if (idPais.equals("FR")) {
				writer.print(arrayFrancia.toJSONString());
				_log.info(arrayFrancia.toJSONString());
			}

			resourceResponse.setProperty(ResourceResponse.HTTP_STATUS_CODE, "200");
			writer.close();
		} catch (IOException e) {
			_log.error("onSuccess() :: Error al enviar la respuesta");
		}

		return true;
	}
}