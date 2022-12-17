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
package es.capgemini.practicas.portlet.action;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import es.capgemini.practicas.sb.tienda.model.Tienda;
import es.capgemini.practicas.sb.tienda.service.TiendaLocalService;
import es.capgemini.practicas.tiendas.portlet.constants.TiendasPortletKeys;

@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + TiendasPortletKeys.TIENDAS,
		"mvc.command.name=/tienda/insertar"
	},
	service = MVCActionCommand.class
)
public class TiendasAltaActionCommand implements MVCActionCommand {
	@Reference 
	private TiendaLocalService _tiendaService;
	
	@Override
	public boolean processAction(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws PortletException {
		_log.info("Llama");

		// Recojo variables
		String name = ParamUtil.getString(actionRequest, "name","");
		actionRequest.setAttribute("name", name);
		_log.info(name);
		
		String managerName = ParamUtil.getString(actionRequest, "managerName","");
		actionRequest.setAttribute("managerName", managerName);
		_log.info(managerName);
		
		String address = ParamUtil.getString(actionRequest, "address","");
		actionRequest.setAttribute("address", address);
		_log.info(address);
		
		String codigoPostal = ParamUtil.getString(actionRequest, "codigoPostal","");
		actionRequest.setAttribute("codigoPostal", codigoPostal);
		_log.info(codigoPostal);
		
		String selectPaises = ParamUtil.getString(actionRequest, "selectPaises","");
		actionRequest.setAttribute("selectPaises", selectPaises);
		_log.info(selectPaises);
		
		String selectProvincias = ParamUtil.getString(actionRequest, "selectProvincias","");
		actionRequest.setAttribute("selectProvincias", selectProvincias);
		_log.info(selectProvincias);
		
		String selectCiudades = ParamUtil.getString(actionRequest, "selectCiudades","");
		actionRequest.setAttribute("selectCiudades", selectCiudades);
		_log.info(selectCiudades);
		// Fin recojo variables
		
		List<Tienda> lstTienda = _tiendaService.findByName(name);
		
		if (lstTienda.isEmpty()) {
			// Creamos Id
			long newId = CounterLocalServiceUtil.increment(Tienda.class.getName());
			Tienda tienda = _tiendaService.createTienda(newId);
			
			// Añado los valores a cada campo a través de los sets
			tienda.setNombre(name);
			tienda.setGerente(managerName);
			tienda.setDireccion(address);
			tienda.setCodipoPostal(codigoPostal);
			tienda.setPais(selectPaises);
			tienda.setProvincia(selectProvincias);
			tienda.setCiudad(selectCiudades);
			
			// Añadir a base de datos
			_tiendaService.addTienda(tienda);
			SessionMessages.add(actionRequest, "tablaCreada");
			
		} else {
			Tienda tiendaExistente = lstTienda.get(0);			
			
			//  Añado los valores a cada campo a través de los sets
			tiendaExistente.setNombre(name);
			tiendaExistente.setGerente(managerName);
			tiendaExistente.setDireccion(address);
			tiendaExistente.setCodipoPostal(codigoPostal);
			tiendaExistente.setPais(selectPaises);
			tiendaExistente.setProvincia(selectProvincias);
			tiendaExistente.setCiudad(selectCiudades);
					
			// Actualizo la tienda en la base de datos
			_tiendaService.updateTienda(tiendaExistente);
			SessionMessages.add(actionRequest, "tablaActualizada");
		}
		
		return true;
	}

	private static final Log _log = LogFactoryUtil.getLog(
		TiendasAltaActionCommand.class);
}