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

package es.capgemini.proyecto.procesopedido.sb.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import es.capgemini.proyecto.procesopedido.sb.model.Pedidos;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Pedidos in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PedidosCacheModel implements CacheModel<Pedidos>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PedidosCacheModel)) {
			return false;
		}

		PedidosCacheModel pedidosCacheModel = (PedidosCacheModel)object;

		if (id == pedidosCacheModel.id) {
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
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", id=");
		sb.append(id);
		sb.append(", idUsuario=");
		sb.append(idUsuario);
		sb.append(", email=");
		sb.append(email);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append(", via=");
		sb.append(via);
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
		sb.append(", idProducto=");
		sb.append(idProducto);
		sb.append(", precio=");
		sb.append(precio);
		sb.append(", cantidad=");
		sb.append(cantidad);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Pedidos toEntityModel() {
		PedidosImpl pedidosImpl = new PedidosImpl();

		if (uuid == null) {
			pedidosImpl.setUuid("");
		}
		else {
			pedidosImpl.setUuid(uuid);
		}

		pedidosImpl.setId(id);
		pedidosImpl.setIdUsuario(idUsuario);

		if (email == null) {
			pedidosImpl.setEmail("");
		}
		else {
			pedidosImpl.setEmail(email);
		}

		if (nombre == null) {
			pedidosImpl.setNombre("");
		}
		else {
			pedidosImpl.setNombre(nombre);
		}

		if (via == null) {
			pedidosImpl.setVia("");
		}
		else {
			pedidosImpl.setVia(via);
		}

		if (direccion == null) {
			pedidosImpl.setDireccion("");
		}
		else {
			pedidosImpl.setDireccion(direccion);
		}

		if (pais == null) {
			pedidosImpl.setPais("");
		}
		else {
			pedidosImpl.setPais(pais);
		}

		if (provincia == null) {
			pedidosImpl.setProvincia("");
		}
		else {
			pedidosImpl.setProvincia(provincia);
		}

		if (ciudad == null) {
			pedidosImpl.setCiudad("");
		}
		else {
			pedidosImpl.setCiudad(ciudad);
		}

		if (codipoPostal == null) {
			pedidosImpl.setCodipoPostal("");
		}
		else {
			pedidosImpl.setCodipoPostal(codipoPostal);
		}

		pedidosImpl.setIdProducto(idProducto);
		pedidosImpl.setPrecio(precio);
		pedidosImpl.setCantidad(cantidad);

		pedidosImpl.resetOriginalValues();

		return pedidosImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		id = objectInput.readLong();

		idUsuario = objectInput.readLong();
		email = objectInput.readUTF();
		nombre = objectInput.readUTF();
		via = objectInput.readUTF();
		direccion = objectInput.readUTF();
		pais = objectInput.readUTF();
		provincia = objectInput.readUTF();
		ciudad = objectInput.readUTF();
		codipoPostal = objectInput.readUTF();

		idProducto = objectInput.readLong();

		precio = objectInput.readDouble();

		cantidad = objectInput.readInt();
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

		objectOutput.writeLong(idUsuario);

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (nombre == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nombre);
		}

		if (via == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(via);
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

		objectOutput.writeLong(idProducto);

		objectOutput.writeDouble(precio);

		objectOutput.writeInt(cantidad);
	}

	public String uuid;
	public long id;
	public long idUsuario;
	public String email;
	public String nombre;
	public String via;
	public String direccion;
	public String pais;
	public String provincia;
	public String ciudad;
	public String codipoPostal;
	public long idProducto;
	public double precio;
	public int cantidad;

}