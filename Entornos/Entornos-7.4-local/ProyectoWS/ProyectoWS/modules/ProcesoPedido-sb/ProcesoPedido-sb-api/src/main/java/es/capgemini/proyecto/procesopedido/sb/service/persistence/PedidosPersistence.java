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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import es.capgemini.proyecto.procesopedido.sb.exception.NoSuchPedidosException;
import es.capgemini.proyecto.procesopedido.sb.model.Pedidos;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the pedidos service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PedidosUtil
 * @generated
 */
@ProviderType
public interface PedidosPersistence extends BasePersistence<Pedidos> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PedidosUtil} to access the pedidos persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the pedidoses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching pedidoses
	 */
	public java.util.List<Pedidos> findByUuid(String uuid);

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
	public java.util.List<Pedidos> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Pedidos> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Pedidos>
			orderByComparator);

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
	public java.util.List<Pedidos> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Pedidos>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first pedidos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pedidos
	 * @throws NoSuchPedidosException if a matching pedidos could not be found
	 */
	public Pedidos findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Pedidos>
				orderByComparator)
		throws NoSuchPedidosException;

	/**
	 * Returns the first pedidos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pedidos, or <code>null</code> if a matching pedidos could not be found
	 */
	public Pedidos fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Pedidos>
			orderByComparator);

	/**
	 * Returns the last pedidos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pedidos
	 * @throws NoSuchPedidosException if a matching pedidos could not be found
	 */
	public Pedidos findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Pedidos>
				orderByComparator)
		throws NoSuchPedidosException;

	/**
	 * Returns the last pedidos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pedidos, or <code>null</code> if a matching pedidos could not be found
	 */
	public Pedidos fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Pedidos>
			orderByComparator);

	/**
	 * Returns the pedidoses before and after the current pedidos in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current pedidos
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pedidos
	 * @throws NoSuchPedidosException if a pedidos with the primary key could not be found
	 */
	public Pedidos[] findByUuid_PrevAndNext(
			long id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Pedidos>
				orderByComparator)
		throws NoSuchPedidosException;

	/**
	 * Removes all the pedidoses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of pedidoses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching pedidoses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the pedidoses where idUsuario = &#63; and idProducto = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @param idProducto the id producto
	 * @return the matching pedidoses
	 */
	public java.util.List<Pedidos> findByOrder(long idUsuario, long idProducto);

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
	public java.util.List<Pedidos> findByOrder(
		long idUsuario, long idProducto, int start, int end);

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
	public java.util.List<Pedidos> findByOrder(
		long idUsuario, long idProducto, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Pedidos>
			orderByComparator);

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
	public java.util.List<Pedidos> findByOrder(
		long idUsuario, long idProducto, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Pedidos>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first pedidos in the ordered set where idUsuario = &#63; and idProducto = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @param idProducto the id producto
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pedidos
	 * @throws NoSuchPedidosException if a matching pedidos could not be found
	 */
	public Pedidos findByOrder_First(
			long idUsuario, long idProducto,
			com.liferay.portal.kernel.util.OrderByComparator<Pedidos>
				orderByComparator)
		throws NoSuchPedidosException;

	/**
	 * Returns the first pedidos in the ordered set where idUsuario = &#63; and idProducto = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @param idProducto the id producto
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pedidos, or <code>null</code> if a matching pedidos could not be found
	 */
	public Pedidos fetchByOrder_First(
		long idUsuario, long idProducto,
		com.liferay.portal.kernel.util.OrderByComparator<Pedidos>
			orderByComparator);

	/**
	 * Returns the last pedidos in the ordered set where idUsuario = &#63; and idProducto = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @param idProducto the id producto
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pedidos
	 * @throws NoSuchPedidosException if a matching pedidos could not be found
	 */
	public Pedidos findByOrder_Last(
			long idUsuario, long idProducto,
			com.liferay.portal.kernel.util.OrderByComparator<Pedidos>
				orderByComparator)
		throws NoSuchPedidosException;

	/**
	 * Returns the last pedidos in the ordered set where idUsuario = &#63; and idProducto = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @param idProducto the id producto
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pedidos, or <code>null</code> if a matching pedidos could not be found
	 */
	public Pedidos fetchByOrder_Last(
		long idUsuario, long idProducto,
		com.liferay.portal.kernel.util.OrderByComparator<Pedidos>
			orderByComparator);

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
	public Pedidos[] findByOrder_PrevAndNext(
			long id, long idUsuario, long idProducto,
			com.liferay.portal.kernel.util.OrderByComparator<Pedidos>
				orderByComparator)
		throws NoSuchPedidosException;

	/**
	 * Removes all the pedidoses where idUsuario = &#63; and idProducto = &#63; from the database.
	 *
	 * @param idUsuario the id usuario
	 * @param idProducto the id producto
	 */
	public void removeByOrder(long idUsuario, long idProducto);

	/**
	 * Returns the number of pedidoses where idUsuario = &#63; and idProducto = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @param idProducto the id producto
	 * @return the number of matching pedidoses
	 */
	public int countByOrder(long idUsuario, long idProducto);

	/**
	 * Returns all the pedidoses where idUsuario = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @return the matching pedidoses
	 */
	public java.util.List<Pedidos> findByUser(long idUsuario);

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
	public java.util.List<Pedidos> findByUser(
		long idUsuario, int start, int end);

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
	public java.util.List<Pedidos> findByUser(
		long idUsuario, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Pedidos>
			orderByComparator);

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
	public java.util.List<Pedidos> findByUser(
		long idUsuario, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Pedidos>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first pedidos in the ordered set where idUsuario = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pedidos
	 * @throws NoSuchPedidosException if a matching pedidos could not be found
	 */
	public Pedidos findByUser_First(
			long idUsuario,
			com.liferay.portal.kernel.util.OrderByComparator<Pedidos>
				orderByComparator)
		throws NoSuchPedidosException;

	/**
	 * Returns the first pedidos in the ordered set where idUsuario = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pedidos, or <code>null</code> if a matching pedidos could not be found
	 */
	public Pedidos fetchByUser_First(
		long idUsuario,
		com.liferay.portal.kernel.util.OrderByComparator<Pedidos>
			orderByComparator);

	/**
	 * Returns the last pedidos in the ordered set where idUsuario = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pedidos
	 * @throws NoSuchPedidosException if a matching pedidos could not be found
	 */
	public Pedidos findByUser_Last(
			long idUsuario,
			com.liferay.portal.kernel.util.OrderByComparator<Pedidos>
				orderByComparator)
		throws NoSuchPedidosException;

	/**
	 * Returns the last pedidos in the ordered set where idUsuario = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pedidos, or <code>null</code> if a matching pedidos could not be found
	 */
	public Pedidos fetchByUser_Last(
		long idUsuario,
		com.liferay.portal.kernel.util.OrderByComparator<Pedidos>
			orderByComparator);

	/**
	 * Returns the pedidoses before and after the current pedidos in the ordered set where idUsuario = &#63;.
	 *
	 * @param id the primary key of the current pedidos
	 * @param idUsuario the id usuario
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pedidos
	 * @throws NoSuchPedidosException if a pedidos with the primary key could not be found
	 */
	public Pedidos[] findByUser_PrevAndNext(
			long id, long idUsuario,
			com.liferay.portal.kernel.util.OrderByComparator<Pedidos>
				orderByComparator)
		throws NoSuchPedidosException;

	/**
	 * Removes all the pedidoses where idUsuario = &#63; from the database.
	 *
	 * @param idUsuario the id usuario
	 */
	public void removeByUser(long idUsuario);

	/**
	 * Returns the number of pedidoses where idUsuario = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @return the number of matching pedidoses
	 */
	public int countByUser(long idUsuario);

	/**
	 * Caches the pedidos in the entity cache if it is enabled.
	 *
	 * @param pedidos the pedidos
	 */
	public void cacheResult(Pedidos pedidos);

	/**
	 * Caches the pedidoses in the entity cache if it is enabled.
	 *
	 * @param pedidoses the pedidoses
	 */
	public void cacheResult(java.util.List<Pedidos> pedidoses);

	/**
	 * Creates a new pedidos with the primary key. Does not add the pedidos to the database.
	 *
	 * @param id the primary key for the new pedidos
	 * @return the new pedidos
	 */
	public Pedidos create(long id);

	/**
	 * Removes the pedidos with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the pedidos
	 * @return the pedidos that was removed
	 * @throws NoSuchPedidosException if a pedidos with the primary key could not be found
	 */
	public Pedidos remove(long id) throws NoSuchPedidosException;

	public Pedidos updateImpl(Pedidos pedidos);

	/**
	 * Returns the pedidos with the primary key or throws a <code>NoSuchPedidosException</code> if it could not be found.
	 *
	 * @param id the primary key of the pedidos
	 * @return the pedidos
	 * @throws NoSuchPedidosException if a pedidos with the primary key could not be found
	 */
	public Pedidos findByPrimaryKey(long id) throws NoSuchPedidosException;

	/**
	 * Returns the pedidos with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the pedidos
	 * @return the pedidos, or <code>null</code> if a pedidos with the primary key could not be found
	 */
	public Pedidos fetchByPrimaryKey(long id);

	/**
	 * Returns all the pedidoses.
	 *
	 * @return the pedidoses
	 */
	public java.util.List<Pedidos> findAll();

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
	public java.util.List<Pedidos> findAll(int start, int end);

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
	public java.util.List<Pedidos> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Pedidos>
			orderByComparator);

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
	public java.util.List<Pedidos> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Pedidos>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the pedidoses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of pedidoses.
	 *
	 * @return the number of pedidoses
	 */
	public int countAll();

}