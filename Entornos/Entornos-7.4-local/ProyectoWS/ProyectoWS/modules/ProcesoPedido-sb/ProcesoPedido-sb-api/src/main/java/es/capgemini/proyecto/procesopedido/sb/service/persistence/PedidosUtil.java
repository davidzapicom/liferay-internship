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

package es.capgemini.proyecto.procesopedido.sb.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import es.capgemini.proyecto.procesopedido.sb.model.Pedidos;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the pedidos service. This utility wraps <code>es.capgemini.proyecto.procesopedido.sb.service.persistence.impl.PedidosPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PedidosPersistence
 * @generated
 */
public class PedidosUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Pedidos pedidos) {
		getPersistence().clearCache(pedidos);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Pedidos> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Pedidos> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Pedidos> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Pedidos> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Pedidos> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Pedidos update(Pedidos pedidos) {
		return getPersistence().update(pedidos);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Pedidos update(
		Pedidos pedidos, ServiceContext serviceContext) {

		return getPersistence().update(pedidos, serviceContext);
	}

	/**
	 * Returns all the pedidoses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching pedidoses
	 */
	public static List<Pedidos> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the pedidoses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PedidosModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of pedidoses
	 * @param end the upper bound of the range of pedidoses (not inclusive)
	 * @return the range of matching pedidoses
	 */
	public static List<Pedidos> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the pedidoses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PedidosModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of pedidoses
	 * @param end the upper bound of the range of pedidoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pedidoses
	 */
	public static List<Pedidos> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Pedidos> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pedidoses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PedidosModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of pedidoses
	 * @param end the upper bound of the range of pedidoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pedidoses
	 */
	public static List<Pedidos> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Pedidos> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first pedidos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pedidos
	 * @throws NoSuchPedidosException if a matching pedidos could not be found
	 */
	public static Pedidos findByUuid_First(
			String uuid, OrderByComparator<Pedidos> orderByComparator)
		throws es.capgemini.proyecto.procesopedido.sb.exception.
			NoSuchPedidosException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first pedidos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pedidos, or <code>null</code> if a matching pedidos could not be found
	 */
	public static Pedidos fetchByUuid_First(
		String uuid, OrderByComparator<Pedidos> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last pedidos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pedidos
	 * @throws NoSuchPedidosException if a matching pedidos could not be found
	 */
	public static Pedidos findByUuid_Last(
			String uuid, OrderByComparator<Pedidos> orderByComparator)
		throws es.capgemini.proyecto.procesopedido.sb.exception.
			NoSuchPedidosException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last pedidos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pedidos, or <code>null</code> if a matching pedidos could not be found
	 */
	public static Pedidos fetchByUuid_Last(
		String uuid, OrderByComparator<Pedidos> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the pedidoses before and after the current pedidos in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current pedidos
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pedidos
	 * @throws NoSuchPedidosException if a pedidos with the primary key could not be found
	 */
	public static Pedidos[] findByUuid_PrevAndNext(
			long id, String uuid, OrderByComparator<Pedidos> orderByComparator)
		throws es.capgemini.proyecto.procesopedido.sb.exception.
			NoSuchPedidosException {

		return getPersistence().findByUuid_PrevAndNext(
			id, uuid, orderByComparator);
	}

	/**
	 * Removes all the pedidoses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of pedidoses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching pedidoses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the pedidoses where idUsuario = &#63; and idProducto = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @param idProducto the id producto
	 * @return the matching pedidoses
	 */
	public static List<Pedidos> findByOrder(long idUsuario, long idProducto) {
		return getPersistence().findByOrder(idUsuario, idProducto);
	}

	/**
	 * Returns a range of all the pedidoses where idUsuario = &#63; and idProducto = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PedidosModelImpl</code>.
	 * </p>
	 *
	 * @param idUsuario the id usuario
	 * @param idProducto the id producto
	 * @param start the lower bound of the range of pedidoses
	 * @param end the upper bound of the range of pedidoses (not inclusive)
	 * @return the range of matching pedidoses
	 */
	public static List<Pedidos> findByOrder(
		long idUsuario, long idProducto, int start, int end) {

		return getPersistence().findByOrder(idUsuario, idProducto, start, end);
	}

	/**
	 * Returns an ordered range of all the pedidoses where idUsuario = &#63; and idProducto = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PedidosModelImpl</code>.
	 * </p>
	 *
	 * @param idUsuario the id usuario
	 * @param idProducto the id producto
	 * @param start the lower bound of the range of pedidoses
	 * @param end the upper bound of the range of pedidoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pedidoses
	 */
	public static List<Pedidos> findByOrder(
		long idUsuario, long idProducto, int start, int end,
		OrderByComparator<Pedidos> orderByComparator) {

		return getPersistence().findByOrder(
			idUsuario, idProducto, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pedidoses where idUsuario = &#63; and idProducto = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PedidosModelImpl</code>.
	 * </p>
	 *
	 * @param idUsuario the id usuario
	 * @param idProducto the id producto
	 * @param start the lower bound of the range of pedidoses
	 * @param end the upper bound of the range of pedidoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pedidoses
	 */
	public static List<Pedidos> findByOrder(
		long idUsuario, long idProducto, int start, int end,
		OrderByComparator<Pedidos> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByOrder(
			idUsuario, idProducto, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first pedidos in the ordered set where idUsuario = &#63; and idProducto = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @param idProducto the id producto
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pedidos
	 * @throws NoSuchPedidosException if a matching pedidos could not be found
	 */
	public static Pedidos findByOrder_First(
			long idUsuario, long idProducto,
			OrderByComparator<Pedidos> orderByComparator)
		throws es.capgemini.proyecto.procesopedido.sb.exception.
			NoSuchPedidosException {

		return getPersistence().findByOrder_First(
			idUsuario, idProducto, orderByComparator);
	}

	/**
	 * Returns the first pedidos in the ordered set where idUsuario = &#63; and idProducto = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @param idProducto the id producto
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pedidos, or <code>null</code> if a matching pedidos could not be found
	 */
	public static Pedidos fetchByOrder_First(
		long idUsuario, long idProducto,
		OrderByComparator<Pedidos> orderByComparator) {

		return getPersistence().fetchByOrder_First(
			idUsuario, idProducto, orderByComparator);
	}

	/**
	 * Returns the last pedidos in the ordered set where idUsuario = &#63; and idProducto = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @param idProducto the id producto
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pedidos
	 * @throws NoSuchPedidosException if a matching pedidos could not be found
	 */
	public static Pedidos findByOrder_Last(
			long idUsuario, long idProducto,
			OrderByComparator<Pedidos> orderByComparator)
		throws es.capgemini.proyecto.procesopedido.sb.exception.
			NoSuchPedidosException {

		return getPersistence().findByOrder_Last(
			idUsuario, idProducto, orderByComparator);
	}

	/**
	 * Returns the last pedidos in the ordered set where idUsuario = &#63; and idProducto = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @param idProducto the id producto
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pedidos, or <code>null</code> if a matching pedidos could not be found
	 */
	public static Pedidos fetchByOrder_Last(
		long idUsuario, long idProducto,
		OrderByComparator<Pedidos> orderByComparator) {

		return getPersistence().fetchByOrder_Last(
			idUsuario, idProducto, orderByComparator);
	}

	/**
	 * Returns the pedidoses before and after the current pedidos in the ordered set where idUsuario = &#63; and idProducto = &#63;.
	 *
	 * @param id the primary key of the current pedidos
	 * @param idUsuario the id usuario
	 * @param idProducto the id producto
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pedidos
	 * @throws NoSuchPedidosException if a pedidos with the primary key could not be found
	 */
	public static Pedidos[] findByOrder_PrevAndNext(
			long id, long idUsuario, long idProducto,
			OrderByComparator<Pedidos> orderByComparator)
		throws es.capgemini.proyecto.procesopedido.sb.exception.
			NoSuchPedidosException {

		return getPersistence().findByOrder_PrevAndNext(
			id, idUsuario, idProducto, orderByComparator);
	}

	/**
	 * Removes all the pedidoses where idUsuario = &#63; and idProducto = &#63; from the database.
	 *
	 * @param idUsuario the id usuario
	 * @param idProducto the id producto
	 */
	public static void removeByOrder(long idUsuario, long idProducto) {
		getPersistence().removeByOrder(idUsuario, idProducto);
	}

	/**
	 * Returns the number of pedidoses where idUsuario = &#63; and idProducto = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @param idProducto the id producto
	 * @return the number of matching pedidoses
	 */
	public static int countByOrder(long idUsuario, long idProducto) {
		return getPersistence().countByOrder(idUsuario, idProducto);
	}

	/**
	 * Returns all the pedidoses where idUsuario = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @return the matching pedidoses
	 */
	public static List<Pedidos> findByUser(long idUsuario) {
		return getPersistence().findByUser(idUsuario);
	}

	/**
	 * Returns a range of all the pedidoses where idUsuario = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PedidosModelImpl</code>.
	 * </p>
	 *
	 * @param idUsuario the id usuario
	 * @param start the lower bound of the range of pedidoses
	 * @param end the upper bound of the range of pedidoses (not inclusive)
	 * @return the range of matching pedidoses
	 */
	public static List<Pedidos> findByUser(long idUsuario, int start, int end) {
		return getPersistence().findByUser(idUsuario, start, end);
	}

	/**
	 * Returns an ordered range of all the pedidoses where idUsuario = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PedidosModelImpl</code>.
	 * </p>
	 *
	 * @param idUsuario the id usuario
	 * @param start the lower bound of the range of pedidoses
	 * @param end the upper bound of the range of pedidoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pedidoses
	 */
	public static List<Pedidos> findByUser(
		long idUsuario, int start, int end,
		OrderByComparator<Pedidos> orderByComparator) {

		return getPersistence().findByUser(
			idUsuario, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pedidoses where idUsuario = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PedidosModelImpl</code>.
	 * </p>
	 *
	 * @param idUsuario the id usuario
	 * @param start the lower bound of the range of pedidoses
	 * @param end the upper bound of the range of pedidoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pedidoses
	 */
	public static List<Pedidos> findByUser(
		long idUsuario, int start, int end,
		OrderByComparator<Pedidos> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUser(
			idUsuario, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first pedidos in the ordered set where idUsuario = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pedidos
	 * @throws NoSuchPedidosException if a matching pedidos could not be found
	 */
	public static Pedidos findByUser_First(
			long idUsuario, OrderByComparator<Pedidos> orderByComparator)
		throws es.capgemini.proyecto.procesopedido.sb.exception.
			NoSuchPedidosException {

		return getPersistence().findByUser_First(idUsuario, orderByComparator);
	}

	/**
	 * Returns the first pedidos in the ordered set where idUsuario = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pedidos, or <code>null</code> if a matching pedidos could not be found
	 */
	public static Pedidos fetchByUser_First(
		long idUsuario, OrderByComparator<Pedidos> orderByComparator) {

		return getPersistence().fetchByUser_First(idUsuario, orderByComparator);
	}

	/**
	 * Returns the last pedidos in the ordered set where idUsuario = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pedidos
	 * @throws NoSuchPedidosException if a matching pedidos could not be found
	 */
	public static Pedidos findByUser_Last(
			long idUsuario, OrderByComparator<Pedidos> orderByComparator)
		throws es.capgemini.proyecto.procesopedido.sb.exception.
			NoSuchPedidosException {

		return getPersistence().findByUser_Last(idUsuario, orderByComparator);
	}

	/**
	 * Returns the last pedidos in the ordered set where idUsuario = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pedidos, or <code>null</code> if a matching pedidos could not be found
	 */
	public static Pedidos fetchByUser_Last(
		long idUsuario, OrderByComparator<Pedidos> orderByComparator) {

		return getPersistence().fetchByUser_Last(idUsuario, orderByComparator);
	}

	/**
	 * Returns the pedidoses before and after the current pedidos in the ordered set where idUsuario = &#63;.
	 *
	 * @param id the primary key of the current pedidos
	 * @param idUsuario the id usuario
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pedidos
	 * @throws NoSuchPedidosException if a pedidos with the primary key could not be found
	 */
	public static Pedidos[] findByUser_PrevAndNext(
			long id, long idUsuario,
			OrderByComparator<Pedidos> orderByComparator)
		throws es.capgemini.proyecto.procesopedido.sb.exception.
			NoSuchPedidosException {

		return getPersistence().findByUser_PrevAndNext(
			id, idUsuario, orderByComparator);
	}

	/**
	 * Removes all the pedidoses where idUsuario = &#63; from the database.
	 *
	 * @param idUsuario the id usuario
	 */
	public static void removeByUser(long idUsuario) {
		getPersistence().removeByUser(idUsuario);
	}

	/**
	 * Returns the number of pedidoses where idUsuario = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @return the number of matching pedidoses
	 */
	public static int countByUser(long idUsuario) {
		return getPersistence().countByUser(idUsuario);
	}

	/**
	 * Caches the pedidos in the entity cache if it is enabled.
	 *
	 * @param pedidos the pedidos
	 */
	public static void cacheResult(Pedidos pedidos) {
		getPersistence().cacheResult(pedidos);
	}

	/**
	 * Caches the pedidoses in the entity cache if it is enabled.
	 *
	 * @param pedidoses the pedidoses
	 */
	public static void cacheResult(List<Pedidos> pedidoses) {
		getPersistence().cacheResult(pedidoses);
	}

	/**
	 * Creates a new pedidos with the primary key. Does not add the pedidos to the database.
	 *
	 * @param id the primary key for the new pedidos
	 * @return the new pedidos
	 */
	public static Pedidos create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the pedidos with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the pedidos
	 * @return the pedidos that was removed
	 * @throws NoSuchPedidosException if a pedidos with the primary key could not be found
	 */
	public static Pedidos remove(long id)
		throws es.capgemini.proyecto.procesopedido.sb.exception.
			NoSuchPedidosException {

		return getPersistence().remove(id);
	}

	public static Pedidos updateImpl(Pedidos pedidos) {
		return getPersistence().updateImpl(pedidos);
	}

	/**
	 * Returns the pedidos with the primary key or throws a <code>NoSuchPedidosException</code> if it could not be found.
	 *
	 * @param id the primary key of the pedidos
	 * @return the pedidos
	 * @throws NoSuchPedidosException if a pedidos with the primary key could not be found
	 */
	public static Pedidos findByPrimaryKey(long id)
		throws es.capgemini.proyecto.procesopedido.sb.exception.
			NoSuchPedidosException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the pedidos with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the pedidos
	 * @return the pedidos, or <code>null</code> if a pedidos with the primary key could not be found
	 */
	public static Pedidos fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the pedidoses.
	 *
	 * @return the pedidoses
	 */
	public static List<Pedidos> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the pedidoses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PedidosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pedidoses
	 * @param end the upper bound of the range of pedidoses (not inclusive)
	 * @return the range of pedidoses
	 */
	public static List<Pedidos> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the pedidoses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PedidosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pedidoses
	 * @param end the upper bound of the range of pedidoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pedidoses
	 */
	public static List<Pedidos> findAll(
		int start, int end, OrderByComparator<Pedidos> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pedidoses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PedidosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pedidoses
	 * @param end the upper bound of the range of pedidoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pedidoses
	 */
	public static List<Pedidos> findAll(
		int start, int end, OrderByComparator<Pedidos> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the pedidoses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of pedidoses.
	 *
	 * @return the number of pedidoses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PedidosPersistence getPersistence() {
		return _persistence;
	}

	private static volatile PedidosPersistence _persistence;

}