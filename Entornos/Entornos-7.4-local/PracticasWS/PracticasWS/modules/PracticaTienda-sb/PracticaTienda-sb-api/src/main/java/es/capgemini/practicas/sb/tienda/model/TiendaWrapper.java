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

package es.capgemini.practicas.sb.tienda.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Tienda}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Tienda
 * @generated
 */
public class TiendaWrapper
	extends BaseModelWrapper<Tienda> implements ModelWrapper<Tienda>, Tienda {

	public TiendaWrapper(Tienda tienda) {
		super(tienda);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id", getId());
		attributes.put("nombre", getNombre());
		attributes.put("direccion", getDireccion());
		attributes.put("pais", getPais());
		attributes.put("provincia", getProvincia());
		attributes.put("ciudad", getCiudad());
		attributes.put("codipoPostal", getCodipoPostal());
		attributes.put("gerente", getGerente());

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

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
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

		String gerente = (String)attributes.get("gerente");

		if (gerente != null) {
			setGerente(gerente);
		}
	}

	@Override
	public Tienda cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the ciudad of this tienda.
	 *
	 * @return the ciudad of this tienda
	 */
	@Override
	public String getCiudad() {
		return model.getCiudad();
	}

	/**
	 * Returns the codipo postal of this tienda.
	 *
	 * @return the codipo postal of this tienda
	 */
	@Override
	public String getCodipoPostal() {
		return model.getCodipoPostal();
	}

	/**
	 * Returns the direccion of this tienda.
	 *
	 * @return the direccion of this tienda
	 */
	@Override
	public String getDireccion() {
		return model.getDireccion();
	}

	/**
	 * Returns the gerente of this tienda.
	 *
	 * @return the gerente of this tienda
	 */
	@Override
	public String getGerente() {
		return model.getGerente();
	}

	/**
	 * Returns the ID of this tienda.
	 *
	 * @return the ID of this tienda
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the nombre of this tienda.
	 *
	 * @return the nombre of this tienda
	 */
	@Override
	public String getNombre() {
		return model.getNombre();
	}

	/**
	 * Returns the pais of this tienda.
	 *
	 * @return the pais of this tienda
	 */
	@Override
	public String getPais() {
		return model.getPais();
	}

	/**
	 * Returns the primary key of this tienda.
	 *
	 * @return the primary key of this tienda
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the provincia of this tienda.
	 *
	 * @return the provincia of this tienda
	 */
	@Override
	public String getProvincia() {
		return model.getProvincia();
	}

	/**
	 * Returns the uuid of this tienda.
	 *
	 * @return the uuid of this tienda
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the ciudad of this tienda.
	 *
	 * @param ciudad the ciudad of this tienda
	 */
	@Override
	public void setCiudad(String ciudad) {
		model.setCiudad(ciudad);
	}

	/**
	 * Sets the codipo postal of this tienda.
	 *
	 * @param codipoPostal the codipo postal of this tienda
	 */
	@Override
	public void setCodipoPostal(String codipoPostal) {
		model.setCodipoPostal(codipoPostal);
	}

	/**
	 * Sets the direccion of this tienda.
	 *
	 * @param direccion the direccion of this tienda
	 */
	@Override
	public void setDireccion(String direccion) {
		model.setDireccion(direccion);
	}

	/**
	 * Sets the gerente of this tienda.
	 *
	 * @param gerente the gerente of this tienda
	 */
	@Override
	public void setGerente(String gerente) {
		model.setGerente(gerente);
	}

	/**
	 * Sets the ID of this tienda.
	 *
	 * @param id the ID of this tienda
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the nombre of this tienda.
	 *
	 * @param nombre the nombre of this tienda
	 */
	@Override
	public void setNombre(String nombre) {
		model.setNombre(nombre);
	}

	/**
	 * Sets the pais of this tienda.
	 *
	 * @param pais the pais of this tienda
	 */
	@Override
	public void setPais(String pais) {
		model.setPais(pais);
	}

	/**
	 * Sets the primary key of this tienda.
	 *
	 * @param primaryKey the primary key of this tienda
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the provincia of this tienda.
	 *
	 * @param provincia the provincia of this tienda
	 */
	@Override
	public void setProvincia(String provincia) {
		model.setProvincia(provincia);
	}

	/**
	 * Sets the uuid of this tienda.
	 *
	 * @param uuid the uuid of this tienda
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected TiendaWrapper wrap(Tienda tienda) {
		return new TiendaWrapper(tienda);
	}

}