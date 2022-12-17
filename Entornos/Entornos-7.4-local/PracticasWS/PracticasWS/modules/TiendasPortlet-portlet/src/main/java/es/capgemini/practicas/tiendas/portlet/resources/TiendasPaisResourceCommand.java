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
package es.capgemini.practicas.tiendas.portlet.resources;

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

import es.capgemini.practicas.tiendas.portlet.constants.TiendasPortletKeys;

@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + TiendasPortletKeys.TIENDAS,
		"mvc.command.name=/tienda/pais"
	},
	service = MVCResourceCommand.class
)
public class TiendasPaisResourceCommand implements MVCResourceCommand {
	@Override
    public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
            throws PortletException {
        _log.info("LLAME A LA RESOURCE");
        
        JSONArray arrayPaises = JSONFactoryUtil.createJSONArray();
        JSONObject objectSpain = JSONFactoryUtil.createJSONObject();
        objectSpain.put("value", "ES");
        objectSpain.put("option", "España");
        arrayPaises.put(objectSpain);
        JSONObject objectSuiza = JSONFactoryUtil.createJSONObject();
        objectSuiza.put("value", "FR");
        objectSuiza.put("option", "Francia");
        arrayPaises.put(objectSuiza);
        _log.info("Array paises   "+arrayPaises.toJSONString());
        
   

//        JSONObject
//        jSONArrayObject


       _log.info("devuelvo paises");
       try {
            PrintWriter writer = resourceResponse.getWriter();
            writer.print(arrayPaises.toJSONString());
            resourceResponse.setProperty(ResourceResponse.HTTP_STATUS_CODE, "200");
            writer.close();
        } catch (IOException e) {
            _log.error("onSuccess() :: Error al enviar la respuesta");
        }
        
        return true;
    }
    
    private static final Log _log = LogFactoryUtil.getLog(
    		TiendasPaisResourceCommand.class);
}