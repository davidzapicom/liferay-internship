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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;PROYECTO_Pedidos&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Pedidos
 * @generated
 */
public class PedidosTable extends BaseTable<PedidosTable> {

	public static final PedidosTable INSTANCE = new PedidosTable();

	public final Column<PedidosTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PedidosTable, Long> id = createColumn(
		"id_", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<PedidosTable, Long> idUsuario = createColumn(
		"idUsuario", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PedidosTable, String> email = createColumn(
		"email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PedidosTable, String> nombre = createColumn(
		"nombre", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PedidosTable, String> via = createColumn(
		"via", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PedidosTable, String> direccion = createColumn(
		"direccion", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PedidosTable, String> pais = createColumn(
		"pais", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PedidosTable, String> provincia = createColumn(
		"provincia", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PedidosTable, String> ciudad = createColumn(
		"ciudad", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PedidosTable, String> codipoPostal = createColumn(
		"codipoPostal", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PedidosTable, Long> idProducto = createColumn(
		"idProducto", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PedidosTable, Double> precio = createColumn(
		"precio", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<PedidosTable, Integer> cantidad = createColumn(
		"cantidad", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);

	private PedidosTable() {
		super("PROYECTO_Pedidos", PedidosTable::new);
	}

}