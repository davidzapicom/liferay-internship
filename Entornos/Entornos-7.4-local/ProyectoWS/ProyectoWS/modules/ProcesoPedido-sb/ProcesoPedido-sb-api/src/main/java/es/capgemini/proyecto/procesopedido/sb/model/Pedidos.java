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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the Pedidos service. Represents a row in the &quot;PROYECTO_Pedidos&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see PedidosModel
 * @generated
 */
@ImplementationClassName(
	"es.capgemini.proyecto.procesopedido.sb.model.impl.PedidosImpl"
)
@ProviderType
public interface Pedidos extends PedidosModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>es.capgemini.proyecto.procesopedido.sb.model.impl.PedidosImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Pedidos, Long> ID_ACCESSOR =
		new Accessor<Pedidos, Long>() {

			@Override
			public Long get(Pedidos pedidos) {
				return pedidos.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Pedidos> getTypeClass() {
				return Pedidos.class;
			}

		};

}