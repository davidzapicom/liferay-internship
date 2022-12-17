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
package es.capgemini.practicas.selecmunicipios.portlet.resources;

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

import es.capgemini.practicas.selecmunicipios.portlet.constants.SelecMunicipiosPortletKeys;

@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + SelecMunicipiosPortletKeys.SELECMUNICIPIOS,
		"mvc.command.name=/select/ciudad"
	},
	service = MVCResourceCommand.class
)
public class SelecCiudadResourceCommand implements MVCResourceCommand {

	private static final Log _log = LogFactoryUtil.getLog(
		SelecCiudadResourceCommand.class);

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		
		String idProvincia = ParamUtil.getString(resourceRequest, "provincia");
		_log.info(idProvincia);
		
		
		//	Ciudades Lugo-ES
	     JSONArray arrayLugo = JSONFactoryUtil.createJSONArray();
	     JSONObject objectFoz = JSONFactoryUtil.createJSONObject();      
	     objectFoz.put("option","Foz");      
	     objectFoz.put("value","Foz");
	     JSONObject objectCervantes = JSONFactoryUtil.createJSONObject();      
	     objectCervantes.put("option","Cervantes");      
	     objectCervantes.put("value","Cervantes");
	     JSONObject objectPol = JSONFactoryUtil.createJSONObject();      
	     objectPol.put("option","Pol");      
	     objectPol.put("value","Pol");
	     arrayLugo.put(objectFoz);
	     arrayLugo.put(objectCervantes);
	     arrayLugo.put(objectPol);
	     
	     //	 	Ciudades Asturias-ES
	     JSONArray arrayAsturias = JSONFactoryUtil.createJSONArray();
	     JSONObject objectOviedo = JSONFactoryUtil.createJSONObject();      
	     objectOviedo.put("option","Oviedo");      
	     objectOviedo.put("value","Oviedo");
	     JSONObject objectGijon = JSONFactoryUtil.createJSONObject();      
	     objectGijon.put("option","Gijon");      
	     objectGijon.put("value","Gijon");
	     JSONObject objectAviles = JSONFactoryUtil.createJSONObject();      
	     objectAviles.put("option","Aviles");      
	     objectAviles.put("value","Aviles");
	     arrayAsturias.put(objectOviedo);
	     arrayAsturias.put(objectGijon);
	     arrayAsturias.put(objectAviles);
	     
	     //	 	Ciudades Pais Vasco-ES
	     JSONArray arrayPaisVasco = JSONFactoryUtil.createJSONArray();
	     JSONObject objectBilbao = JSONFactoryUtil.createJSONObject();      
	     objectBilbao.put("option","Bilbao");      
	     objectBilbao.put("value","Bilbao");
	     JSONObject objectSanSebastian = JSONFactoryUtil.createJSONObject();      
	     objectSanSebastian.put("option","San Sebastian");      
	     objectSanSebastian.put("value","San Sebastian");
	     JSONObject objectGetxo = JSONFactoryUtil.createJSONObject();      
	     objectGetxo.put("option","Getxo");      
	     objectGetxo.put("value","Getxo");
	     arrayPaisVasco.put(objectBilbao);
	     arrayPaisVasco.put(objectSanSebastian);
	     arrayPaisVasco.put(objectGetxo);
	     
	     //	 	Ciudades Cantabria-ES
	     JSONArray arrayCantabria = JSONFactoryUtil.createJSONArray();
	     JSONObject objectSantander = JSONFactoryUtil.createJSONObject();      
	     objectSantander.put("option","Santander");      
	     objectSantander.put("value","Santander");
	     JSONObject objectTorrelavega = JSONFactoryUtil.createJSONObject();      
	     objectTorrelavega.put("option","Torrelavega");      
	     objectTorrelavega.put("value","Torrelavega");
	     JSONObject objectLuena = JSONFactoryUtil.createJSONObject();      
	     objectLuena.put("option","Luena");      
	     objectLuena.put("value","Luena");
	     arrayCantabria.put(objectSantander);
	     arrayCantabria.put(objectTorrelavega);
	     arrayCantabria.put(objectLuena);
	     

	     //		Ciudades Berry-FR
	     JSONArray arrayBerry = JSONFactoryUtil.createJSONArray();
	     JSONObject objectBourges = JSONFactoryUtil.createJSONObject();      
	     objectBourges.put("option","Bourges");      
	     objectBourges.put("value","Bourges");
	     JSONObject objectSancerre = JSONFactoryUtil.createJSONObject();      
	     objectSancerre.put("option","Sancerre");      
	     objectSancerre.put("value","Sancerre");
	     JSONObject objectVierzon = JSONFactoryUtil.createJSONObject();      
	     objectVierzon.put("option","Vierzon");      
	     objectVierzon.put("value","Vierzon");
	     arrayBerry.put(objectBourges);
	     arrayBerry.put(objectSancerre);
	     arrayBerry.put(objectVierzon);
	     
	     
	     //		Ciudades Lemosin-FR
	     JSONArray arrayLemosin = JSONFactoryUtil.createJSONArray();
	     JSONObject objectLimoges = JSONFactoryUtil.createJSONObject();      
	     objectLimoges.put("option","Limoges");      
	     objectLimoges.put("value","Limoges");
	     JSONObject objectCuremonte = JSONFactoryUtil.createJSONObject();      
	     objectCuremonte.put("option","Curemonte");      
	     objectCuremonte.put("value","Curemonte");
	     JSONObject objectTurenne = JSONFactoryUtil.createJSONObject();      
	     objectTurenne.put("option","Turenne");      
	     objectTurenne.put("value","Turenne");
	     arrayLemosin.put(objectLimoges);
	     arrayLemosin.put(objectCuremonte);
	     arrayLemosin.put(objectTurenne);
	     
	     
	     //		Ciudades Bearne-FR
	     JSONArray arrayBearne = JSONFactoryUtil.createJSONArray();
	     JSONObject objectNavarrenx = JSONFactoryUtil.createJSONObject();      
	     objectNavarrenx.put("option","Navarrenx");      
	     objectNavarrenx.put("value","Navarrenx");
	     JSONObject objectOrthez = JSONFactoryUtil.createJSONObject();      
	     objectOrthez.put("option","Orthez");      
	     objectOrthez.put("value","Orthez");
	     JSONObject objectNay = JSONFactoryUtil.createJSONObject();      
	     objectNay.put("option","Nay");      
	     objectNay.put("value","Nay");
	     arrayBearne.put(objectNavarrenx);
	     arrayBearne.put(objectOrthez);
	     arrayBearne.put(objectNay);
	     
	     
	     //		Ciudades Normandia-FR
	     JSONArray arrayNormandia = JSONFactoryUtil.createJSONArray();
	     JSONObject objectCaen = JSONFactoryUtil.createJSONObject();      
	     objectCaen.put("option","Caen");      
	     objectCaen.put("value","Caen");
	     JSONObject objectBayeux = JSONFactoryUtil.createJSONObject();      
	     objectBayeux.put("option","Bayeux");      
	     objectBayeux.put("value","Bayeux");
	     JSONObject objectRuan = JSONFactoryUtil.createJSONObject();      
	     objectRuan.put("option","Ruan");      
	     objectRuan.put("value","Ruan");
	     arrayNormandia.put(objectCaen);
	     arrayNormandia.put(objectBayeux);
	     arrayNormandia.put(objectRuan);
	   
	  
	  try {
          PrintWriter writer = resourceResponse.getWriter();
          _log.info(idProvincia);
          
          
          switch (idProvincia) {
          case "Lugo":
	        	  writer.print(arrayLugo.toJSONString());
	 	    	 _log.info(arrayLugo.toJSONString());
        	    break;
        	  case "Asturias":
        		 writer.print(arrayAsturias.toJSONString());
      	    	 _log.info(arrayAsturias.toJSONString());
        	    break;
        	  case "Pais Vasco":
        		 writer.print(arrayPaisVasco.toJSONString());
    	    	 _log.info(arrayPaisVasco.toJSONString());
        	    break;
        	  case "Cantabria":
        		  writer.print(arrayCantabria.toJSONString());
      	    	 _log.info(arrayCantabria.toJSONString());
        	    break;
        	  case "Berry":
        		  writer.print(arrayBerry.toJSONString());
      	    	 _log.info(arrayBerry.toJSONString());
          	    break;
        	  case "Lemosin":
  	        	writer.print(arrayLemosin.toJSONString());
  	      	     _log.info(arrayLemosin.toJSONString());
              	break;
        	  case "Tolosa":
        		  writer.print(arrayBearne.toJSONString());
      	    	 _log.info(arrayBearne.toJSONString());
          	    break;
        	  case "Normandia":
	        	writer.print(arrayNormandia.toJSONString());
	      	    _log.info(arrayNormandia.toJSONString());
            	break;
        	  default:
        		  writer.print(arrayLugo.toJSONString());
          }
          
          resourceResponse.setProperty(ResourceResponse.HTTP_STATUS_CODE, "200");
          writer.close();
      } catch (IOException e) {
          _log.error("onSuccess() :: Error al enviar la respuesta");
      }
      
      return true;
	}
}