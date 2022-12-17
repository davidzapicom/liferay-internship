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

package es.capgemini.proyecto.procesopedido.sb.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUID;

import es.capgemini.proyecto.procesopedido.sb.exception.NoSuchPedidosException;
import es.capgemini.proyecto.procesopedido.sb.model.Pedidos;
import es.capgemini.proyecto.procesopedido.sb.model.PedidosTable;
import es.capgemini.proyecto.procesopedido.sb.model.impl.PedidosImpl;
import es.capgemini.proyecto.procesopedido.sb.model.impl.PedidosModelImpl;
import es.capgemini.proyecto.procesopedido.sb.service.persistence.PedidosPersistence;
import es.capgemini.proyecto.procesopedido.sb.service.persistence.PedidosUtil;
import es.capgemini.proyecto.procesopedido.sb.service.persistence.impl.constants.PROYECTO_PedidosPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the pedidos service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {PedidosPersistence.class, BasePersistence.class})
public class PedidosPersistenceImpl
	extends BasePersistenceImpl<Pedidos> implements PedidosPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PedidosUtil</code> to access the pedidos persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PedidosImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the pedidoses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching pedidoses
	 */
	@Override
	public List<Pedidos> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Pedidos> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Pedidos> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Pedidos> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Pedidos> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Pedidos> orderByComparator, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<Pedidos> list = null;

		if (useFinderCache) {
			list = (List<Pedidos>)finderCache.getResult(finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (Pedidos pedidos : list) {
					if (!uuid.equals(pedidos.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_PEDIDOS_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PedidosModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<Pedidos>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first pedidos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pedidos
	 * @throws NoSuchPedidosException if a matching pedidos could not be found
	 */
	@Override
	public Pedidos findByUuid_First(
			String uuid, OrderByComparator<Pedidos> orderByComparator)
		throws NoSuchPedidosException {

		Pedidos pedidos = fetchByUuid_First(uuid, orderByComparator);

		if (pedidos != null) {
			return pedidos;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchPedidosException(sb.toString());
	}

	/**
	 * Returns the first pedidos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pedidos, or <code>null</code> if a matching pedidos could not be found
	 */
	@Override
	public Pedidos fetchByUuid_First(
		String uuid, OrderByComparator<Pedidos> orderByComparator) {

		List<Pedidos> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last pedidos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pedidos
	 * @throws NoSuchPedidosException if a matching pedidos could not be found
	 */
	@Override
	public Pedidos findByUuid_Last(
			String uuid, OrderByComparator<Pedidos> orderByComparator)
		throws NoSuchPedidosException {

		Pedidos pedidos = fetchByUuid_Last(uuid, orderByComparator);

		if (pedidos != null) {
			return pedidos;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchPedidosException(sb.toString());
	}

	/**
	 * Returns the last pedidos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pedidos, or <code>null</code> if a matching pedidos could not be found
	 */
	@Override
	public Pedidos fetchByUuid_Last(
		String uuid, OrderByComparator<Pedidos> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Pedidos> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Pedidos[] findByUuid_PrevAndNext(
			long id, String uuid, OrderByComparator<Pedidos> orderByComparator)
		throws NoSuchPedidosException {

		uuid = Objects.toString(uuid, "");

		Pedidos pedidos = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Pedidos[] array = new PedidosImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, pedidos, uuid, orderByComparator, true);

			array[1] = pedidos;

			array[2] = getByUuid_PrevAndNext(
				session, pedidos, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Pedidos getByUuid_PrevAndNext(
		Session session, Pedidos pedidos, String uuid,
		OrderByComparator<Pedidos> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_PEDIDOS_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(PedidosModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(pedidos)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Pedidos> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pedidoses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Pedidos pedidos :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(pedidos);
		}
	}

	/**
	 * Returns the number of pedidoses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching pedidoses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PEDIDOS_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 = "pedidos.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(pedidos.uuid IS NULL OR pedidos.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByOrder;
	private FinderPath _finderPathWithoutPaginationFindByOrder;
	private FinderPath _finderPathCountByOrder;

	/**
	 * Returns all the pedidoses where idUsuario = &#63; and idProducto = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @param idProducto the id producto
	 * @return the matching pedidoses
	 */
	@Override
	public List<Pedidos> findByOrder(long idUsuario, long idProducto) {
		return findByOrder(
			idUsuario, idProducto, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Pedidos> findByOrder(
		long idUsuario, long idProducto, int start, int end) {

		return findByOrder(idUsuario, idProducto, start, end, null);
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
	@Override
	public List<Pedidos> findByOrder(
		long idUsuario, long idProducto, int start, int end,
		OrderByComparator<Pedidos> orderByComparator) {

		return findByOrder(
			idUsuario, idProducto, start, end, orderByComparator, true);
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
	@Override
	public List<Pedidos> findByOrder(
		long idUsuario, long idProducto, int start, int end,
		OrderByComparator<Pedidos> orderByComparator, boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByOrder;
				finderArgs = new Object[] {idUsuario, idProducto};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByOrder;
			finderArgs = new Object[] {
				idUsuario, idProducto, start, end, orderByComparator
			};
		}

		List<Pedidos> list = null;

		if (useFinderCache) {
			list = (List<Pedidos>)finderCache.getResult(finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (Pedidos pedidos : list) {
					if ((idUsuario != pedidos.getIdUsuario()) ||
						(idProducto != pedidos.getIdProducto())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_PEDIDOS_WHERE);

			sb.append(_FINDER_COLUMN_ORDER_IDUSUARIO_2);

			sb.append(_FINDER_COLUMN_ORDER_IDPRODUCTO_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PedidosModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(idUsuario);

				queryPos.add(idProducto);

				list = (List<Pedidos>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Pedidos findByOrder_First(
			long idUsuario, long idProducto,
			OrderByComparator<Pedidos> orderByComparator)
		throws NoSuchPedidosException {

		Pedidos pedidos = fetchByOrder_First(
			idUsuario, idProducto, orderByComparator);

		if (pedidos != null) {
			return pedidos;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("idUsuario=");
		sb.append(idUsuario);

		sb.append(", idProducto=");
		sb.append(idProducto);

		sb.append("}");

		throw new NoSuchPedidosException(sb.toString());
	}

	/**
	 * Returns the first pedidos in the ordered set where idUsuario = &#63; and idProducto = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @param idProducto the id producto
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pedidos, or <code>null</code> if a matching pedidos could not be found
	 */
	@Override
	public Pedidos fetchByOrder_First(
		long idUsuario, long idProducto,
		OrderByComparator<Pedidos> orderByComparator) {

		List<Pedidos> list = findByOrder(
			idUsuario, idProducto, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Pedidos findByOrder_Last(
			long idUsuario, long idProducto,
			OrderByComparator<Pedidos> orderByComparator)
		throws NoSuchPedidosException {

		Pedidos pedidos = fetchByOrder_Last(
			idUsuario, idProducto, orderByComparator);

		if (pedidos != null) {
			return pedidos;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("idUsuario=");
		sb.append(idUsuario);

		sb.append(", idProducto=");
		sb.append(idProducto);

		sb.append("}");

		throw new NoSuchPedidosException(sb.toString());
	}

	/**
	 * Returns the last pedidos in the ordered set where idUsuario = &#63; and idProducto = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @param idProducto the id producto
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pedidos, or <code>null</code> if a matching pedidos could not be found
	 */
	@Override
	public Pedidos fetchByOrder_Last(
		long idUsuario, long idProducto,
		OrderByComparator<Pedidos> orderByComparator) {

		int count = countByOrder(idUsuario, idProducto);

		if (count == 0) {
			return null;
		}

		List<Pedidos> list = findByOrder(
			idUsuario, idProducto, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Pedidos[] findByOrder_PrevAndNext(
			long id, long idUsuario, long idProducto,
			OrderByComparator<Pedidos> orderByComparator)
		throws NoSuchPedidosException {

		Pedidos pedidos = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Pedidos[] array = new PedidosImpl[3];

			array[0] = getByOrder_PrevAndNext(
				session, pedidos, idUsuario, idProducto, orderByComparator,
				true);

			array[1] = pedidos;

			array[2] = getByOrder_PrevAndNext(
				session, pedidos, idUsuario, idProducto, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Pedidos getByOrder_PrevAndNext(
		Session session, Pedidos pedidos, long idUsuario, long idProducto,
		OrderByComparator<Pedidos> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_PEDIDOS_WHERE);

		sb.append(_FINDER_COLUMN_ORDER_IDUSUARIO_2);

		sb.append(_FINDER_COLUMN_ORDER_IDPRODUCTO_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(PedidosModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(idUsuario);

		queryPos.add(idProducto);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(pedidos)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Pedidos> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pedidoses where idUsuario = &#63; and idProducto = &#63; from the database.
	 *
	 * @param idUsuario the id usuario
	 * @param idProducto the id producto
	 */
	@Override
	public void removeByOrder(long idUsuario, long idProducto) {
		for (Pedidos pedidos :
				findByOrder(
					idUsuario, idProducto, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(pedidos);
		}
	}

	/**
	 * Returns the number of pedidoses where idUsuario = &#63; and idProducto = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @param idProducto the id producto
	 * @return the number of matching pedidoses
	 */
	@Override
	public int countByOrder(long idUsuario, long idProducto) {
		FinderPath finderPath = _finderPathCountByOrder;

		Object[] finderArgs = new Object[] {idUsuario, idProducto};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_PEDIDOS_WHERE);

			sb.append(_FINDER_COLUMN_ORDER_IDUSUARIO_2);

			sb.append(_FINDER_COLUMN_ORDER_IDPRODUCTO_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(idUsuario);

				queryPos.add(idProducto);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_ORDER_IDUSUARIO_2 =
		"pedidos.idUsuario = ? AND ";

	private static final String _FINDER_COLUMN_ORDER_IDPRODUCTO_2 =
		"pedidos.idProducto = ?";

	private FinderPath _finderPathWithPaginationFindByUser;
	private FinderPath _finderPathWithoutPaginationFindByUser;
	private FinderPath _finderPathCountByUser;

	/**
	 * Returns all the pedidoses where idUsuario = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @return the matching pedidoses
	 */
	@Override
	public List<Pedidos> findByUser(long idUsuario) {
		return findByUser(
			idUsuario, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Pedidos> findByUser(long idUsuario, int start, int end) {
		return findByUser(idUsuario, start, end, null);
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
	@Override
	public List<Pedidos> findByUser(
		long idUsuario, int start, int end,
		OrderByComparator<Pedidos> orderByComparator) {

		return findByUser(idUsuario, start, end, orderByComparator, true);
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
	@Override
	public List<Pedidos> findByUser(
		long idUsuario, int start, int end,
		OrderByComparator<Pedidos> orderByComparator, boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUser;
				finderArgs = new Object[] {idUsuario};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUser;
			finderArgs = new Object[] {
				idUsuario, start, end, orderByComparator
			};
		}

		List<Pedidos> list = null;

		if (useFinderCache) {
			list = (List<Pedidos>)finderCache.getResult(finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (Pedidos pedidos : list) {
					if (idUsuario != pedidos.getIdUsuario()) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_PEDIDOS_WHERE);

			sb.append(_FINDER_COLUMN_USER_IDUSUARIO_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PedidosModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(idUsuario);

				list = (List<Pedidos>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first pedidos in the ordered set where idUsuario = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pedidos
	 * @throws NoSuchPedidosException if a matching pedidos could not be found
	 */
	@Override
	public Pedidos findByUser_First(
			long idUsuario, OrderByComparator<Pedidos> orderByComparator)
		throws NoSuchPedidosException {

		Pedidos pedidos = fetchByUser_First(idUsuario, orderByComparator);

		if (pedidos != null) {
			return pedidos;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("idUsuario=");
		sb.append(idUsuario);

		sb.append("}");

		throw new NoSuchPedidosException(sb.toString());
	}

	/**
	 * Returns the first pedidos in the ordered set where idUsuario = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pedidos, or <code>null</code> if a matching pedidos could not be found
	 */
	@Override
	public Pedidos fetchByUser_First(
		long idUsuario, OrderByComparator<Pedidos> orderByComparator) {

		List<Pedidos> list = findByUser(idUsuario, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last pedidos in the ordered set where idUsuario = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pedidos
	 * @throws NoSuchPedidosException if a matching pedidos could not be found
	 */
	@Override
	public Pedidos findByUser_Last(
			long idUsuario, OrderByComparator<Pedidos> orderByComparator)
		throws NoSuchPedidosException {

		Pedidos pedidos = fetchByUser_Last(idUsuario, orderByComparator);

		if (pedidos != null) {
			return pedidos;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("idUsuario=");
		sb.append(idUsuario);

		sb.append("}");

		throw new NoSuchPedidosException(sb.toString());
	}

	/**
	 * Returns the last pedidos in the ordered set where idUsuario = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pedidos, or <code>null</code> if a matching pedidos could not be found
	 */
	@Override
	public Pedidos fetchByUser_Last(
		long idUsuario, OrderByComparator<Pedidos> orderByComparator) {

		int count = countByUser(idUsuario);

		if (count == 0) {
			return null;
		}

		List<Pedidos> list = findByUser(
			idUsuario, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Pedidos[] findByUser_PrevAndNext(
			long id, long idUsuario,
			OrderByComparator<Pedidos> orderByComparator)
		throws NoSuchPedidosException {

		Pedidos pedidos = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Pedidos[] array = new PedidosImpl[3];

			array[0] = getByUser_PrevAndNext(
				session, pedidos, idUsuario, orderByComparator, true);

			array[1] = pedidos;

			array[2] = getByUser_PrevAndNext(
				session, pedidos, idUsuario, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Pedidos getByUser_PrevAndNext(
		Session session, Pedidos pedidos, long idUsuario,
		OrderByComparator<Pedidos> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_PEDIDOS_WHERE);

		sb.append(_FINDER_COLUMN_USER_IDUSUARIO_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(PedidosModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(idUsuario);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(pedidos)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Pedidos> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pedidoses where idUsuario = &#63; from the database.
	 *
	 * @param idUsuario the id usuario
	 */
	@Override
	public void removeByUser(long idUsuario) {
		for (Pedidos pedidos :
				findByUser(
					idUsuario, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(pedidos);
		}
	}

	/**
	 * Returns the number of pedidoses where idUsuario = &#63;.
	 *
	 * @param idUsuario the id usuario
	 * @return the number of matching pedidoses
	 */
	@Override
	public int countByUser(long idUsuario) {
		FinderPath finderPath = _finderPathCountByUser;

		Object[] finderArgs = new Object[] {idUsuario};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PEDIDOS_WHERE);

			sb.append(_FINDER_COLUMN_USER_IDUSUARIO_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(idUsuario);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_USER_IDUSUARIO_2 =
		"pedidos.idUsuario = ?";

	public PedidosPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");
		dbColumnNames.put("id", "id_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Pedidos.class);

		setModelImplClass(PedidosImpl.class);
		setModelPKClass(long.class);

		setTable(PedidosTable.INSTANCE);
	}

	/**
	 * Caches the pedidos in the entity cache if it is enabled.
	 *
	 * @param pedidos the pedidos
	 */
	@Override
	public void cacheResult(Pedidos pedidos) {
		entityCache.putResult(
			PedidosImpl.class, pedidos.getPrimaryKey(), pedidos);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the pedidoses in the entity cache if it is enabled.
	 *
	 * @param pedidoses the pedidoses
	 */
	@Override
	public void cacheResult(List<Pedidos> pedidoses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (pedidoses.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Pedidos pedidos : pedidoses) {
			if (entityCache.getResult(
					PedidosImpl.class, pedidos.getPrimaryKey()) == null) {

				cacheResult(pedidos);
			}
		}
	}

	/**
	 * Clears the cache for all pedidoses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PedidosImpl.class);

		finderCache.clearCache(PedidosImpl.class);
	}

	/**
	 * Clears the cache for the pedidos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Pedidos pedidos) {
		entityCache.removeResult(PedidosImpl.class, pedidos);
	}

	@Override
	public void clearCache(List<Pedidos> pedidoses) {
		for (Pedidos pedidos : pedidoses) {
			entityCache.removeResult(PedidosImpl.class, pedidos);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(PedidosImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(PedidosImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new pedidos with the primary key. Does not add the pedidos to the database.
	 *
	 * @param id the primary key for the new pedidos
	 * @return the new pedidos
	 */
	@Override
	public Pedidos create(long id) {
		Pedidos pedidos = new PedidosImpl();

		pedidos.setNew(true);
		pedidos.setPrimaryKey(id);

		String uuid = _portalUUID.generate();

		pedidos.setUuid(uuid);

		return pedidos;
	}

	/**
	 * Removes the pedidos with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the pedidos
	 * @return the pedidos that was removed
	 * @throws NoSuchPedidosException if a pedidos with the primary key could not be found
	 */
	@Override
	public Pedidos remove(long id) throws NoSuchPedidosException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the pedidos with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the pedidos
	 * @return the pedidos that was removed
	 * @throws NoSuchPedidosException if a pedidos with the primary key could not be found
	 */
	@Override
	public Pedidos remove(Serializable primaryKey)
		throws NoSuchPedidosException {

		Session session = null;

		try {
			session = openSession();

			Pedidos pedidos = (Pedidos)session.get(
				PedidosImpl.class, primaryKey);

			if (pedidos == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPedidosException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(pedidos);
		}
		catch (NoSuchPedidosException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Pedidos removeImpl(Pedidos pedidos) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pedidos)) {
				pedidos = (Pedidos)session.get(
					PedidosImpl.class, pedidos.getPrimaryKeyObj());
			}

			if (pedidos != null) {
				session.delete(pedidos);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (pedidos != null) {
			clearCache(pedidos);
		}

		return pedidos;
	}

	@Override
	public Pedidos updateImpl(Pedidos pedidos) {
		boolean isNew = pedidos.isNew();

		if (!(pedidos instanceof PedidosModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(pedidos.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(pedidos);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in pedidos proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Pedidos implementation " +
					pedidos.getClass());
		}

		PedidosModelImpl pedidosModelImpl = (PedidosModelImpl)pedidos;

		if (Validator.isNull(pedidos.getUuid())) {
			String uuid = _portalUUID.generate();

			pedidos.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(pedidos);
			}
			else {
				pedidos = (Pedidos)session.merge(pedidos);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(PedidosImpl.class, pedidosModelImpl, false, true);

		if (isNew) {
			pedidos.setNew(false);
		}

		pedidos.resetOriginalValues();

		return pedidos;
	}

	/**
	 * Returns the pedidos with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the pedidos
	 * @return the pedidos
	 * @throws NoSuchPedidosException if a pedidos with the primary key could not be found
	 */
	@Override
	public Pedidos findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPedidosException {

		Pedidos pedidos = fetchByPrimaryKey(primaryKey);

		if (pedidos == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPedidosException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return pedidos;
	}

	/**
	 * Returns the pedidos with the primary key or throws a <code>NoSuchPedidosException</code> if it could not be found.
	 *
	 * @param id the primary key of the pedidos
	 * @return the pedidos
	 * @throws NoSuchPedidosException if a pedidos with the primary key could not be found
	 */
	@Override
	public Pedidos findByPrimaryKey(long id) throws NoSuchPedidosException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the pedidos with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the pedidos
	 * @return the pedidos, or <code>null</code> if a pedidos with the primary key could not be found
	 */
	@Override
	public Pedidos fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the pedidoses.
	 *
	 * @return the pedidoses
	 */
	@Override
	public List<Pedidos> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Pedidos> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Pedidos> findAll(
		int start, int end, OrderByComparator<Pedidos> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Pedidos> findAll(
		int start, int end, OrderByComparator<Pedidos> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Pedidos> list = null;

		if (useFinderCache) {
			list = (List<Pedidos>)finderCache.getResult(finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PEDIDOS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PEDIDOS;

				sql = sql.concat(PedidosModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Pedidos>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the pedidoses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Pedidos pedidos : findAll()) {
			remove(pedidos);
		}
	}

	/**
	 * Returns the number of pedidoses.
	 *
	 * @return the number of pedidoses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_PEDIDOS);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "id_";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PEDIDOS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PedidosModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the pedidos persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathWithPaginationFindByOrder = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByOrder",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"idUsuario", "idProducto"}, true);

		_finderPathWithoutPaginationFindByOrder = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByOrder",
			new String[] {Long.class.getName(), Long.class.getName()},
			new String[] {"idUsuario", "idProducto"}, true);

		_finderPathCountByOrder = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByOrder",
			new String[] {Long.class.getName(), Long.class.getName()},
			new String[] {"idUsuario", "idProducto"}, false);

		_finderPathWithPaginationFindByUser = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUser",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"idUsuario"}, true);

		_finderPathWithoutPaginationFindByUser = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUser",
			new String[] {Long.class.getName()}, new String[] {"idUsuario"},
			true);

		_finderPathCountByUser = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUser",
			new String[] {Long.class.getName()}, new String[] {"idUsuario"},
			false);

		_setPedidosUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setPedidosUtilPersistence(null);

		entityCache.removeCache(PedidosImpl.class.getName());
	}

	private void _setPedidosUtilPersistence(
		PedidosPersistence pedidosPersistence) {

		try {
			Field field = PedidosUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, pedidosPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = PROYECTO_PedidosPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = PROYECTO_PedidosPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = PROYECTO_PedidosPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PEDIDOS =
		"SELECT pedidos FROM Pedidos pedidos";

	private static final String _SQL_SELECT_PEDIDOS_WHERE =
		"SELECT pedidos FROM Pedidos pedidos WHERE ";

	private static final String _SQL_COUNT_PEDIDOS =
		"SELECT COUNT(pedidos) FROM Pedidos pedidos";

	private static final String _SQL_COUNT_PEDIDOS_WHERE =
		"SELECT COUNT(pedidos) FROM Pedidos pedidos WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "pedidos.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Pedidos exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Pedidos exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PedidosPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid", "id"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private PortalUUID _portalUUID;

	@Reference
	private PedidosModelArgumentsResolver _pedidosModelArgumentsResolver;

}