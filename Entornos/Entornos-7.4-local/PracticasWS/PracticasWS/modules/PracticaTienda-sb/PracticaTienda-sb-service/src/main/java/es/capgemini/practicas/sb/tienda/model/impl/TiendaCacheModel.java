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

package es.capgemini.practicas.sb.tienda.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import es.capgemini.practicas.sb.tienda.model.Tienda;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Tienda in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TiendaCacheModel implements CacheModel<Tienda>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TiendaCacheModel)) {
			return false;
		}

		TiendaCacheModel tiendaCacheModel = (TiendaCacheModel)object;

		if (id == tiendaCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", id=");
		sb.append(id);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append(", direccion=");
		sb.append(direccion);
		sb.append(", pais=");
		sb.append(pais);
		sb.append(", provincia=");
		sb.append(provincia);
		sb.append(", ciudad=");
		sb.append(ciudad);
		sb.append(", codipoPostal=");
		sb.append(codipoPostal);
		sb.append(", gerente=");
		sb.append(gerente);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Tienda toEntityModel() {
		TiendaImpl tiendaImpl = new TiendaImpl();

		if (uuid == null) {
			tiendaImpl.setUuid("");
		}
		else {
			tiendaImpl.setUuid(uuid);
		}

		tiendaImpl.setId(id);

		if (nombre == null) {
			tiendaImpl.setNombre("");
		}
		else {
			tiendaImpl.setNombre(nombre);
		}

		if (direccion == null) {
			tiendaImpl.setDireccion("");
		}
		else {
			tiendaImpl.setDireccion(direccion);
		}

		if (pais == null) {
			tiendaImpl.setPais("");
		}
		else {
			tiendaImpl.setPais(pais);
		}

		if (provincia == null) {
			tiendaImpl.setProvincia("");
		}
		else {
			tiendaImpl.setProvincia(provincia);
		}

		if (ciudad == null) {
			tiendaImpl.setCiudad("");
		}
		else {
			tiendaImpl.setCiudad(ciudad);
		}

		if (codipoPostal == null) {
			tiendaImpl.setCodipoPostal("");
		}
		else {
			tiendaImpl.setCodipoPostal(codipoPostal);
		}

		if (gerente == null) {
			tiendaImpl.setGerente("");
		}
		else {
			tiendaImpl.setGerente(gerente);
		}

		tiendaImpl.resetOriginalValues();

		return tiendaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		id = objectInput.readLong();
		nombre = objectInput.readUTF();
		direccion = objectInput.readUTF();
		pais = objectInput.readUTF();
		provincia = objectInput.readUTF();
		ciudad = objectInput.readUTF();
		codipoPostal = objectInput.readUTF();
		gerente = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(id);

		if (nombre == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nombre);
		}

		if (direccion == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(direccion);
		}

		if (pais == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pais);
		}

		if (provincia == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(provincia);
		}

		if (ciudad == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ciudad);
		}

		if (codipoPostal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(codipoPostal);
		}

		if (gerente == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(gerente);
		}
	}

	public String uuid;
	public long id;
	public String nombre;
	public String direccion;
	public String pais;
	public String provincia;
	public String ciudad;
	public String codipoPostal;
	public String gerente;

}