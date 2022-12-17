package es.cagemini.practicas.tiendas.rest.application;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;

import es.capgemini.practicas.sb.tienda.model.Tienda;
import es.capgemini.practicas.sb.tienda.service.TiendaLocalService;

/**
 * @author dzapicom
 */
@Component(property = { JaxrsWhiteboardConstants.JAX_RS_APPLICATION_BASE + "=/practicas",
		JaxrsWhiteboardConstants.JAX_RS_NAME + "=PRACTICAS.Rest" }, service = Application.class)
public class TiendasRestApplication extends Application {
	private static final Log _log = LogFactoryUtil.getLog(TiendasRestApplication.class);

	@Reference
	private TiendaLocalService _tiendaService;

	public Set<Object> getSingletons() {
		return Collections.<Object>singleton(this);
	}

	@GET
	@Produces("text/plain")
	public String working() {
		return "Servicio de tiendas!";
	}

	@GET
	@Path("/morning")
	@Produces("text/plain")
	public String hello() {
		return "Good morning!";
	}

	
	@GET
	@Path("/tiendas")
	@Consumes("application/long;charset=utf-8")
	@Produces("application/json;charset=utf-8")
	public Response findOfTiendas() throws PortalException {
		JSONObject response = JSONFactoryUtil.createJSONObject();
		JSONObject objectTiendas = JSONFactoryUtil.createJSONObject();
		
		try {
			List<Tienda> lstTiendas = new ArrayList<Tienda>();
			lstTiendas =  _tiendaService.getTiendas(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
			_log.info(lstTiendas);
			
			response.put("status", 200);
			response.put("message", "La lista de las tiendas se ha obtenido correctamente.");
			response.put("lista tiendas", lstTiendas);
			return Response.status(200).entity(response.toJSONString()).build();
		} catch (Exception e) {
			_log.error("Error: " +e.toString());
			response.put("status", 404);
			response.put("message", "La lista de las tiendas no se ha podido obtener. " +e.toString());
			return Response.status(404).entity(response.toJSONString()).build();
		}
	}
	
	
	@GET
	@Path("/tiendas/{idTienda}")
	@Consumes("application/long;charset=utf-8")
	@Produces("application/json;charset=utf-8")
	public Response findOfTienda(@PathParam("idTienda") long idTienda) throws PortalException {
		JSONObject response = JSONFactoryUtil.createJSONObject();
		JSONObject objectTienda = JSONFactoryUtil.createJSONObject();
		
		_log.info(idTienda);
		
		try {
			Tienda objTienda = null;
			objTienda = _tiendaService.getTienda(idTienda);
			String nombre = objTienda.getNombre();
			String gerente = objTienda.getGerente();
			String direccion = objTienda.getDireccion();
			String cp = objTienda.getCodipoPostal();
			String ciudad = objTienda.getCiudad();
			String provincia = objTienda.getProvincia();
			String pais = objTienda.getPais();

			objectTienda.put("ID Tienda", idTienda);
			objectTienda.put("Nombre tienda", nombre);
			objectTienda.put("Nombre gerente", gerente);
			objectTienda.put("Dirección", direccion);
			objectTienda.put("Codigo postal", cp);
			objectTienda.put("Ciudad", ciudad);
			objectTienda.put("Provincia", provincia);
			objectTienda.put("Pais", pais);
			
			_log.info(objectTienda);
			
			response.put("status", 200);
			response.put("message", "La tienda se ha obtenido correctamente.");
			response.put("objeto tienda", objectTienda);
			return Response.status(200).entity(response.toJSONString()).build();
		} catch (Exception e) {
			_log.error("Error: " +e.toString());
			response.put("status", 404);
			response.put("message", "La tienda no se ha encontrado. "  +e.toString());
			return Response.status(404).entity(response.toJSONString()).build();
		}
	}
	
	
	@POST
	@Path("/tiendas")
	@Consumes("application/json;charset=utf-8")
	@Produces("application/json;charset=utf-8")
	public Response setOfTienda(@Context HttpServletRequest request, String dataJson) throws PortalException {
		JSONObject response = JSONFactoryUtil.createJSONObject();
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject(dataJson);
		_log.info(jsonObject);
		
		try {			
			String nombre = jsonObject.getString("Nombre tienda");
			String gerente = jsonObject.getString("Nombre gerente");
			String direccion = jsonObject.getString("Dirección");
			String cp = jsonObject.getString("Codigo postal");
			String ciudad = jsonObject.getString("Ciudad");
			String provincia = jsonObject.getString("Provincia");
			String pais = jsonObject.getString("Pais");

			//lista del find para buscar si hay una tienda existente
			List<Tienda> lstTienda = _tiendaService.findByName(nombre);
			
			if (lstTienda.isEmpty()) {
				// Creamos Id
				long newId = CounterLocalServiceUtil.increment(Tienda.class.getName());
				Tienda tiendaNueva = _tiendaService.createTienda(newId);
				
				//Asignamos valores			
				tiendaNueva.setNombre(nombre);
				tiendaNueva.setGerente(gerente);
				tiendaNueva.setDireccion(direccion);
				tiendaNueva.setCodipoPostal(cp);
				tiendaNueva.setCiudad(ciudad);
				tiendaNueva.setProvincia(provincia);
				tiendaNueva.setPais(pais);
				
				_log.info(tiendaNueva);
				
				_tiendaService.addTienda(tiendaNueva);
				
				response.put("status", 200);
				response.put("message", "La tienda se ha creado correctamente.");
				response.put("objeto tienda", tiendaNueva);
				return Response.status(200).entity(response.toJSONString()).build();
			} else {
				response.put("status", 400);
				response.put("message", "Ya hay una tienda dada de alta con ese nombre.");
				return Response.status(400).entity(response.toJSONString()).build();
			}
		} catch (Exception e) {
			_log.error("Error: " +e.toString());
			response.put("status", 500);
			response.put("message", "La tienda no se ha podido crear. " +e.toString());
			return Response.status(500).entity(response.toJSONString()).build();
		}
	}
	
	
	@DELETE
	@Path("/tiendas/{idTienda}")
	@Consumes("application/long;charset=utf-8")
	@Produces("application/json;charset=utf-8")
	public Response deleteOfTienda(@PathParam("idTienda") long idTienda) throws PortalException {
		JSONObject response = JSONFactoryUtil.createJSONObject();
		
		_log.info(idTienda);
		
		try {
			_tiendaService.deleteTienda(idTienda);
			response.put("status", 200);
			response.put("message", "La tienda se ha eliminado correctamente.");
			return Response.status(200).entity(response.toJSONString()).build();
		} catch (Exception e) {
			_log.error("Error: " +e.toString());
			response.put("status", 404);
			response.put("message", "La tienda no se ha encontrado. " +e.toString());
			return Response.status(404).entity(response.toJSONString()).build();
		}
		
	}
}