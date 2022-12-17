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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;PRACTICA_Tienda&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Tienda
 * @generated
 */
public class TiendaTable extends BaseTable<TiendaTable> {

	public static final TiendaTable INSTANCE = new TiendaTable();

	public final Column<TiendaTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TiendaTable, Long> id = createColumn(
		"id_", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<TiendaTable, String> nombre = createColumn(
		"nombre", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TiendaTable, String> direccion = createColumn(
		"direccion", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TiendaTable, String> pais = createColumn(
		"pais", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TiendaTable, String> provincia = createColumn(
		"provincia", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TiendaTable, String> ciudad = createColumn(
		"ciudad", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TiendaTable, String> codipoPostal = createColumn(
		"codipoPostal", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TiendaTable, String> gerente = createColumn(
		"gerente", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private TiendaTable() {
		super("PRACTICA_Tienda", TiendaTable::new);
	}

}