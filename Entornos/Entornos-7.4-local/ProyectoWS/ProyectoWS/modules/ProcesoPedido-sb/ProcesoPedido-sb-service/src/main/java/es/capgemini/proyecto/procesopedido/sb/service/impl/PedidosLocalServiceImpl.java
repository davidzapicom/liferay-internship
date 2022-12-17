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

package es.capgemini.proyecto.procesopedido.sb.service.impl;

import com.liferay.portal.aop.AopService;

import java.util.List;

import org.osgi.service.component.annotations.Component;

import es.capgemini.proyecto.procesopedido.sb.model.Pedidos;
import es.capgemini.proyecto.procesopedido.sb.service.base.PedidosLocalServiceBaseImpl;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=es.capgemini.proyecto.procesopedido.sb.model.Pedidos", service = AopService.class)
public class PedidosLocalServiceImpl extends PedidosLocalServiceBaseImpl {

	public List<Pedidos> findByOrder(long idUsuario, long idProducto) {
		return this.pedidosPersistence.findByOrder(idUsuario, idProducto);
	}

	public List<Pedidos> findByUser(long idUsuario) {
		return this.pedidosPersistence.findByUser(idUsuario);
	}
}