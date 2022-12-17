/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package es.capgemini.proyecto.procesopedido.sb.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Pedidos}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Pedidos
 * @generated
 */
public class PedidosWrapper
	extends BaseModelWrapper<Pedidos>
	implements ModelWrapper<Pedidos>, Pedidos {

	public PedidosWrapper(Pedidos pedidos) {
		super(pedidos);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id", getId());
		attributes.put("idUsuario", getIdUsuario());
		attributes.put("email", getEmail());
		attributes.put("nombre", getNombre());
		attributes.put("via", getVia());
		attributes.put("direccion", getDireccion());
		attributes.put("pais", getPais());
		attributes.put("provincia", getProvincia());
		attributes.put("ciudad", getCiudad());
		attributes.put("codipoPostal", getCodipoPostal());
		attributes.put("idProducto", getIdProducto());
		attributes.put("precio", getPrecio());
		attributes.put("cantidad", getCantidad());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long idUsuario = (Long)attributes.get("idUsuario");

		if (idUsuario != null) {
			setIdUsuario(idUsuario);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}

		String via = (String)attributes.get("via");

		if (via != null) {
			setVia(via);
		}

		String direccion = (String)attributes.get("direccion");

		if (direccion != null) {
			setDireccion(direccion);
		}

		String pais = (String)attributes.get("pais");

		if (pais != null) {
			setPais(pais);
		}

		String provincia = (String)attributes.get("provincia");

		if (provincia != null) {
			setProvincia(provincia);
		}

		String ciudad = (String)attributes.get("ciudad");

		if (ciudad != null) {
			setCiudad(ciudad);
		}

		String codipoPostal = (String)attributes.get("codipoPostal");

		if (codipoPostal != null) {
			setCodipoPostal(codipoPostal);
		}

		Long idProducto = (Long)attributes.get("idProducto");

		if (idProducto != null) {
			setIdProducto(idProducto);
		}

		Double precio = (Double)attributes.get("precio");

		if (precio != null) {
			setPrecio(precio);
		}

		Integer cantidad = (Integer)attributes.get("cantidad");

		if (cantidad != null) {
			setCantidad(cantidad);
		}
	}

	@Override
	public Pedidos cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the cantidad of this pedidos.
	 *
	 * @return the cantidad of this pedidos
	 */
	@Override
	public int getCantidad() {
		return model.getCantidad();
	}

	/**
	 * Returns the ciudad of this pedidos.
	 *
	 * @return the ciudad of this pedidos
	 */
	@Override
	public String getCiudad() {
		return model.getCiudad();
	}

	/**
	 * Returns the codipo postal of this pedidos.
	 *
	 * @return the codipo postal of this pedidos
	 */
	@Override
	public String getCodipoPostal() {
		return model.getCodipoPostal();
	}

	/**
	 * Returns the direccion of this pedidos.
	 *
	 * @return the direccion of this pedidos
	 */
	@Override
	public String getDireccion() {
		return model.getDireccion();
	}

	/**
	 * Returns the email of this pedidos.
	 *
	 * @return the email of this pedidos
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the ID of this pedidos.
	 *
	 * @return the ID of this pedidos
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the id producto of this pedidos.
	 *
	 * @return the id producto of this pedidos
	 */
	@Override
	public long getIdProducto() {
		return model.getIdProducto();
	}

	/**
	 * Returns the id usuario of this pedidos.
	 *
	 * @return the id usuario of this pedidos
	 */
	@Override
	public long getIdUsuario() {
		return model.getIdUsuario();
	}

	/**
	 * Returns the nombre of this pedidos.
	 *
	 * @return the nombre of this pedidos
	 */
	@Override
	public String getNombre() {
		return model.getNombre();
	}

	/**
	 * Returns the pais of this pedidos.
	 *
	 * @return the pais of this pedidos
	 */
	@Override
	public String getPais() {
		return model.getPais();
	}

	/**
	 * Returns the precio of this pedidos.
	 *
	 * @return the precio of this pedidos
	 */
	@Override
	public double getPrecio() {
		return model.getPrecio();
	}

	/**
	 * Returns the primary key of this pedidos.
	 *
	 * @return the primary key of this pedidos
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the provincia of this pedidos.
	 *
	 * @return the provincia of this pedidos
	 */
	@Override
	public String getProvincia() {
		return model.getProvincia();
	}

	/**
	 * Returns the uuid of this pedidos.
	 *
	 * @return the uuid of this pedidos
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the via of this pedidos.
	 *
	 * @return the via of this pedidos
	 */
	@Override
	public String getVia() {
		return model.getVia();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the cantidad of this pedidos.
	 *
	 * @param cantidad the cantidad of this pedidos
	 */
	@Override
	public void setCantidad(int cantidad) {
		model.setCantidad(cantidad);
	}

	/**
	 * Sets the ciudad of this pedidos.
	 *
	 * @param ciudad the ciudad of this pedidos
	 */
	@Override
	public void setCiudad(String ciudad) {
		model.setCiudad(ciudad);
	}

	/**
	 * Sets the codipo postal of this pedidos.
	 *
	 * @param codipoPostal the codipo postal of this pedidos
	 */
	@Override
	public void setCodipoPostal(String codipoPostal) {
		model.setCodipoPostal(codipoPostal);
	}

	/**
	 * Sets the direccion of this pedidos.
	 *
	 * @param direccion the direccion of this pedidos
	 */
	@Override
	public void setDireccion(String direccion) {
		model.setDireccion(direccion);
	}

	/**
	 * Sets the email of this pedidos.
	 *
	 * @param email the email of this pedidos
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the ID of this pedidos.
	 *
	 * @param id the ID of this pedidos
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the id producto of this pedidos.
	 *
	 * @param idProducto the id producto of this pedidos
	 */
	@Override
	public void setIdProducto(long idProducto) {
		model.setIdProducto(idProducto);
	}

	/**
	 * Sets the id usuario of this pedidos.
	 *
	 * @param idUsuario the id usuario of this pedidos
	 */
	@Override
	public void setIdUsuario(long idUsuario) {
		model.setIdUsuario(idUsuario);
	}

	/**
	 * Sets the nombre of this pedidos.
	 *
	 * @param nombre the nombre of this pedidos
	 */
	@Override
	public void setNombre(String nombre) {
		model.setNombre(nombre);
	}

	/**
	 * Sets the pais of this pedidos.
	 *
	 * @param pais the pais of this pedidos
	 */
	@Override
	public void setPais(String pais) {
		model.setPais(pais);
	}

	/**
	 * Sets the precio of this pedidos.
	 *
	 * @param precio the precio of this pedidos
	 */
	@Override
	public void setPrecio(double precio) {
		model.setPrecio(precio);
	}

	/**
	 * Sets the primary key of this pedidos.
	 *
	 * @param primaryKey the primary key of this pedidos
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the provincia of this pedidos.
	 *
	 * @param provincia the provincia of this pedidos
	 */
	@Override
	public void setProvincia(String provincia) {
		model.setProvincia(provincia);
	}

	/**
	 * Sets the uuid of this pedidos.
	 *
	 * @param uuid the uuid of this pedidos
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the via of this pedidos.
	 *
	 * @param via the via of this pedidos
	 */
	@Override
	public void setVia(String via) {
		model.setVia(via);
	}

	@Override
	protected PedidosWrapper wrap(Pedidos pedidos) {
		return new PedidosWrapper(pedidos);
	}

}