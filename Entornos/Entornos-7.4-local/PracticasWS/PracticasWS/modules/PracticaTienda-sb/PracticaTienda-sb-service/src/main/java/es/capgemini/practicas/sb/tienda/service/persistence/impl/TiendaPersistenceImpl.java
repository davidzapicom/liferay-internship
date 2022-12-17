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

package es.capgemini.practicas.sb.tienda.service.persistence.impl;

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

import es.capgemini.practicas.sb.tienda.exception.NoSuchTiendaException;
import es.capgemini.practicas.sb.tienda.model.Tienda;
import es.capgemini.practicas.sb.tienda.model.TiendaTable;
import es.capgemini.practicas.sb.tienda.model.impl.TiendaImpl;
import es.capgemini.practicas.sb.tienda.model.impl.TiendaModelImpl;
import es.capgemini.practicas.sb.tienda.service.persistence.TiendaPersistence;
import es.capgemini.practicas.sb.tienda.service.persistence.TiendaUtil;
import es.capgemini.practicas.sb.tienda.service.persistence.impl.constants.PRACTICA_TiendaPersistenceConstants;

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
 * The persistence implementation for the tienda service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {TiendaPersistence.class, BasePersistence.class})
public class TiendaPersistenceImpl
	extends BasePersistenceImpl<Tienda> implements TiendaPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TiendaUtil</code> to access the tienda persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TiendaImpl.class.getName();

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
	 * Returns all the tiendas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching tiendas
	 */
	@Override
	public List<Tienda> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tiendas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TiendaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of tiendas
	 * @param end the upper bound of the range of tiendas (not inclusive)
	 * @return the range of matching tiendas
	 */
	@Override
	public List<Tienda> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tiendas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TiendaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of tiendas
	 * @param end the upper bound of the range of tiendas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tiendas
	 */
	@Override
	public List<Tienda> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Tienda> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tiendas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TiendaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of tiendas
	 * @param end the upper bound of the range of tiendas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tiendas
	 */
	@Override
	public List<Tienda> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Tienda> orderByComparator, boolean useFinderCache) {

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

		List<Tienda> list = null;

		if (useFinderCache) {
			list = (List<Tienda>)finderCache.getResult(finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (Tienda tienda : list) {
					if (!uuid.equals(tienda.getUuid())) {
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

			sb.append(_SQL_SELECT_TIENDA_WHERE);

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
				sb.append(TiendaModelImpl.ORDER_BY_JPQL);
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

				list = (List<Tienda>)QueryUtil.list(
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
	 * Returns the first tienda in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tienda
	 * @throws NoSuchTiendaException if a matching tienda could not be found
	 */
	@Override
	public Tienda findByUuid_First(
			String uuid, OrderByComparator<Tienda> orderByComparator)
		throws NoSuchTiendaException {

		Tienda tienda = fetchByUuid_First(uuid, orderByComparator);

		if (tienda != null) {
			return tienda;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchTiendaException(sb.toString());
	}

	/**
	 * Returns the first tienda in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tienda, or <code>null</code> if a matching tienda could not be found
	 */
	@Override
	public Tienda fetchByUuid_First(
		String uuid, OrderByComparator<Tienda> orderByComparator) {

		List<Tienda> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tienda in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tienda
	 * @throws NoSuchTiendaException if a matching tienda could not be found
	 */
	@Override
	public Tienda findByUuid_Last(
			String uuid, OrderByComparator<Tienda> orderByComparator)
		throws NoSuchTiendaException {

		Tienda tienda = fetchByUuid_Last(uuid, orderByComparator);

		if (tienda != null) {
			return tienda;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchTiendaException(sb.toString());
	}

	/**
	 * Returns the last tienda in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tienda, or <code>null</code> if a matching tienda could not be found
	 */
	@Override
	public Tienda fetchByUuid_Last(
		String uuid, OrderByComparator<Tienda> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Tienda> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tiendas before and after the current tienda in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current tienda
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tienda
	 * @throws NoSuchTiendaException if a tienda with the primary key could not be found
	 */
	@Override
	public Tienda[] findByUuid_PrevAndNext(
			long id, String uuid, OrderByComparator<Tienda> orderByComparator)
		throws NoSuchTiendaException {

		uuid = Objects.toString(uuid, "");

		Tienda tienda = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Tienda[] array = new TiendaImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, tienda, uuid, orderByComparator, true);

			array[1] = tienda;

			array[2] = getByUuid_PrevAndNext(
				session, tienda, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Tienda getByUuid_PrevAndNext(
		Session session, Tienda tienda, String uuid,
		OrderByComparator<Tienda> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_TIENDA_WHERE);

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
			sb.append(TiendaModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(tienda)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Tienda> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tiendas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Tienda tienda :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(tienda);
		}
	}

	/**
	 * Returns the number of tiendas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching tiendas
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TIENDA_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_2 = "tienda.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(tienda.uuid IS NULL OR tienda.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByName;
	private FinderPath _finderPathWithoutPaginationFindByName;
	private FinderPath _finderPathCountByName;

	/**
	 * Returns all the tiendas where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @return the matching tiendas
	 */
	@Override
	public List<Tienda> findByName(String nombre) {
		return findByName(nombre, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tiendas where nombre = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TiendaModelImpl</code>.
	 * </p>
	 *
	 * @param nombre the nombre
	 * @param start the lower bound of the range of tiendas
	 * @param end the upper bound of the range of tiendas (not inclusive)
	 * @return the range of matching tiendas
	 */
	@Override
	public List<Tienda> findByName(String nombre, int start, int end) {
		return findByName(nombre, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tiendas where nombre = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TiendaModelImpl</code>.
	 * </p>
	 *
	 * @param nombre the nombre
	 * @param start the lower bound of the range of tiendas
	 * @param end the upper bound of the range of tiendas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tiendas
	 */
	@Override
	public List<Tienda> findByName(
		String nombre, int start, int end,
		OrderByComparator<Tienda> orderByComparator) {

		return findByName(nombre, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tiendas where nombre = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TiendaModelImpl</code>.
	 * </p>
	 *
	 * @param nombre the nombre
	 * @param start the lower bound of the range of tiendas
	 * @param end the upper bound of the range of tiendas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tiendas
	 */
	@Override
	public List<Tienda> findByName(
		String nombre, int start, int end,
		OrderByComparator<Tienda> orderByComparator, boolean useFinderCache) {

		nombre = Objects.toString(nombre, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByName;
				finderArgs = new Object[] {nombre};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByName;
			finderArgs = new Object[] {nombre, start, end, orderByComparator};
		}

		List<Tienda> list = null;

		if (useFinderCache) {
			list = (List<Tienda>)finderCache.getResult(finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (Tienda tienda : list) {
					if (!nombre.equals(tienda.getNombre())) {
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

			sb.append(_SQL_SELECT_TIENDA_WHERE);

			boolean bindNombre = false;

			if (nombre.isEmpty()) {
				sb.append(_FINDER_COLUMN_NAME_NOMBRE_3);
			}
			else {
				bindNombre = true;

				sb.append(_FINDER_COLUMN_NAME_NOMBRE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(TiendaModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindNombre) {
					queryPos.add(nombre);
				}

				list = (List<Tienda>)QueryUtil.list(
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
	 * Returns the first tienda in the ordered set where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tienda
	 * @throws NoSuchTiendaException if a matching tienda could not be found
	 */
	@Override
	public Tienda findByName_First(
			String nombre, OrderByComparator<Tienda> orderByComparator)
		throws NoSuchTiendaException {

		Tienda tienda = fetchByName_First(nombre, orderByComparator);

		if (tienda != null) {
			return tienda;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("nombre=");
		sb.append(nombre);

		sb.append("}");

		throw new NoSuchTiendaException(sb.toString());
	}

	/**
	 * Returns the first tienda in the ordered set where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tienda, or <code>null</code> if a matching tienda could not be found
	 */
	@Override
	public Tienda fetchByName_First(
		String nombre, OrderByComparator<Tienda> orderByComparator) {

		List<Tienda> list = findByName(nombre, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tienda in the ordered set where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tienda
	 * @throws NoSuchTiendaException if a matching tienda could not be found
	 */
	@Override
	public Tienda findByName_Last(
			String nombre, OrderByComparator<Tienda> orderByComparator)
		throws NoSuchTiendaException {

		Tienda tienda = fetchByName_Last(nombre, orderByComparator);

		if (tienda != null) {
			return tienda;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("nombre=");
		sb.append(nombre);

		sb.append("}");

		throw new NoSuchTiendaException(sb.toString());
	}

	/**
	 * Returns the last tienda in the ordered set where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tienda, or <code>null</code> if a matching tienda could not be found
	 */
	@Override
	public Tienda fetchByName_Last(
		String nombre, OrderByComparator<Tienda> orderByComparator) {

		int count = countByName(nombre);

		if (count == 0) {
			return null;
		}

		List<Tienda> list = findByName(
			nombre, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tiendas before and after the current tienda in the ordered set where nombre = &#63;.
	 *
	 * @param id the primary key of the current tienda
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tienda
	 * @throws NoSuchTiendaException if a tienda with the primary key could not be found
	 */
	@Override
	public Tienda[] findByName_PrevAndNext(
			long id, String nombre, OrderByComparator<Tienda> orderByComparator)
		throws NoSuchTiendaException {

		nombre = Objects.toString(nombre, "");

		Tienda tienda = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Tienda[] array = new TiendaImpl[3];

			array[0] = getByName_PrevAndNext(
				session, tienda, nombre, orderByComparator, true);

			array[1] = tienda;

			array[2] = getByName_PrevAndNext(
				session, tienda, nombre, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Tienda getByName_PrevAndNext(
		Session session, Tienda tienda, String nombre,
		OrderByComparator<Tienda> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_TIENDA_WHERE);

		boolean bindNombre = false;

		if (nombre.isEmpty()) {
			sb.append(_FINDER_COLUMN_NAME_NOMBRE_3);
		}
		else {
			bindNombre = true;

			sb.append(_FINDER_COLUMN_NAME_NOMBRE_2);
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
			sb.append(TiendaModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindNombre) {
			queryPos.add(nombre);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(tienda)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Tienda> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tiendas where nombre = &#63; from the database.
	 *
	 * @param nombre the nombre
	 */
	@Override
	public void removeByName(String nombre) {
		for (Tienda tienda :
				findByName(
					nombre, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(tienda);
		}
	}

	/**
	 * Returns the number of tiendas where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @return the number of matching tiendas
	 */
	@Override
	public int countByName(String nombre) {
		nombre = Objects.toString(nombre, "");

		FinderPath finderPath = _finderPathCountByName;

		Object[] finderArgs = new Object[] {nombre};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TIENDA_WHERE);

			boolean bindNombre = false;

			if (nombre.isEmpty()) {
				sb.append(_FINDER_COLUMN_NAME_NOMBRE_3);
			}
			else {
				bindNombre = true;

				sb.append(_FINDER_COLUMN_NAME_NOMBRE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindNombre) {
					queryPos.add(nombre);
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

	private static final String _FINDER_COLUMN_NAME_NOMBRE_2 =
		"tienda.nombre = ?";

	private static final String _FINDER_COLUMN_NAME_NOMBRE_3 =
		"(tienda.nombre IS NULL OR tienda.nombre = '')";

	private FinderPath _finderPathWithPaginationFindByLoc;
	private FinderPath _finderPathWithoutPaginationFindByLoc;
	private FinderPath _finderPathCountByLoc;

	/**
	 * Returns all the tiendas where pais = &#63; and provincia = &#63;.
	 *
	 * @param pais the pais
	 * @param provincia the provincia
	 * @return the matching tiendas
	 */
	@Override
	public List<Tienda> findByLoc(String pais, String provincia) {
		return findByLoc(
			pais, provincia, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tiendas where pais = &#63; and provincia = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TiendaModelImpl</code>.
	 * </p>
	 *
	 * @param pais the pais
	 * @param provincia the provincia
	 * @param start the lower bound of the range of tiendas
	 * @param end the upper bound of the range of tiendas (not inclusive)
	 * @return the range of matching tiendas
	 */
	@Override
	public List<Tienda> findByLoc(
		String pais, String provincia, int start, int end) {

		return findByLoc(pais, provincia, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tiendas where pais = &#63; and provincia = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TiendaModelImpl</code>.
	 * </p>
	 *
	 * @param pais the pais
	 * @param provincia the provincia
	 * @param start the lower bound of the range of tiendas
	 * @param end the upper bound of the range of tiendas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tiendas
	 */
	@Override
	public List<Tienda> findByLoc(
		String pais, String provincia, int start, int end,
		OrderByComparator<Tienda> orderByComparator) {

		return findByLoc(pais, provincia, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tiendas where pais = &#63; and provincia = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TiendaModelImpl</code>.
	 * </p>
	 *
	 * @param pais the pais
	 * @param provincia the provincia
	 * @param start the lower bound of the range of tiendas
	 * @param end the upper bound of the range of tiendas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tiendas
	 */
	@Override
	public List<Tienda> findByLoc(
		String pais, String provincia, int start, int end,
		OrderByComparator<Tienda> orderByComparator, boolean useFinderCache) {

		pais = Objects.toString(pais, "");
		provincia = Objects.toString(provincia, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByLoc;
				finderArgs = new Object[] {pais, provincia};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByLoc;
			finderArgs = new Object[] {
				pais, provincia, start, end, orderByComparator
			};
		}

		List<Tienda> list = null;

		if (useFinderCache) {
			list = (List<Tienda>)finderCache.getResult(finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (Tienda tienda : list) {
					if (!pais.equals(tienda.getPais()) ||
						!provincia.equals(tienda.getProvincia())) {

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

			sb.append(_SQL_SELECT_TIENDA_WHERE);

			boolean bindPais = false;

			if (pais.isEmpty()) {
				sb.append(_FINDER_COLUMN_LOC_PAIS_3);
			}
			else {
				bindPais = true;

				sb.append(_FINDER_COLUMN_LOC_PAIS_2);
			}

			boolean bindProvincia = false;

			if (provincia.isEmpty()) {
				sb.append(_FINDER_COLUMN_LOC_PROVINCIA_3);
			}
			else {
				bindProvincia = true;

				sb.append(_FINDER_COLUMN_LOC_PROVINCIA_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(TiendaModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindPais) {
					queryPos.add(pais);
				}

				if (bindProvincia) {
					queryPos.add(provincia);
				}

				list = (List<Tienda>)QueryUtil.list(
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
	 * Returns the first tienda in the ordered set where pais = &#63; and provincia = &#63;.
	 *
	 * @param pais the pais
	 * @param provincia the provincia
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tienda
	 * @throws NoSuchTiendaException if a matching tienda could not be found
	 */
	@Override
	public Tienda findByLoc_First(
			String pais, String provincia,
			OrderByComparator<Tienda> orderByComparator)
		throws NoSuchTiendaException {

		Tienda tienda = fetchByLoc_First(pais, provincia, orderByComparator);

		if (tienda != null) {
			return tienda;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("pais=");
		sb.append(pais);

		sb.append(", provincia=");
		sb.append(provincia);

		sb.append("}");

		throw new NoSuchTiendaException(sb.toString());
	}

	/**
	 * Returns the first tienda in the ordered set where pais = &#63; and provincia = &#63;.
	 *
	 * @param pais the pais
	 * @param provincia the provincia
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tienda, or <code>null</code> if a matching tienda could not be found
	 */
	@Override
	public Tienda fetchByLoc_First(
		String pais, String provincia,
		OrderByComparator<Tienda> orderByComparator) {

		List<Tienda> list = findByLoc(pais, provincia, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tienda in the ordered set where pais = &#63; and provincia = &#63;.
	 *
	 * @param pais the pais
	 * @param provincia the provincia
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tienda
	 * @throws NoSuchTiendaException if a matching tienda could not be found
	 */
	@Override
	public Tienda findByLoc_Last(
			String pais, String provincia,
			OrderByComparator<Tienda> orderByComparator)
		throws NoSuchTiendaException {

		Tienda tienda = fetchByLoc_Last(pais, provincia, orderByComparator);

		if (tienda != null) {
			return tienda;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("pais=");
		sb.append(pais);

		sb.append(", provincia=");
		sb.append(provincia);

		sb.append("}");

		throw new NoSuchTiendaException(sb.toString());
	}

	/**
	 * Returns the last tienda in the ordered set where pais = &#63; and provincia = &#63;.
	 *
	 * @param pais the pais
	 * @param provincia the provincia
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tienda, or <code>null</code> if a matching tienda could not be found
	 */
	@Override
	public Tienda fetchByLoc_Last(
		String pais, String provincia,
		OrderByComparator<Tienda> orderByComparator) {

		int count = countByLoc(pais, provincia);

		if (count == 0) {
			return null;
		}

		List<Tienda> list = findByLoc(
			pais, provincia, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tiendas before and after the current tienda in the ordered set where pais = &#63; and provincia = &#63;.
	 *
	 * @param id the primary key of the current tienda
	 * @param pais the pais
	 * @param provincia the provincia
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tienda
	 * @throws NoSuchTiendaException if a tienda with the primary key could not be found
	 */
	@Override
	public Tienda[] findByLoc_PrevAndNext(
			long id, String pais, String provincia,
			OrderByComparator<Tienda> orderByComparator)
		throws NoSuchTiendaException {

		pais = Objects.toString(pais, "");
		provincia = Objects.toString(provincia, "");

		Tienda tienda = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Tienda[] array = new TiendaImpl[3];

			array[0] = getByLoc_PrevAndNext(
				session, tienda, pais, provincia, orderByComparator, true);

			array[1] = tienda;

			array[2] = getByLoc_PrevAndNext(
				session, tienda, pais, provincia, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Tienda getByLoc_PrevAndNext(
		Session session, Tienda tienda, String pais, String provincia,
		OrderByComparator<Tienda> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_TIENDA_WHERE);

		boolean bindPais = false;

		if (pais.isEmpty()) {
			sb.append(_FINDER_COLUMN_LOC_PAIS_3);
		}
		else {
			bindPais = true;

			sb.append(_FINDER_COLUMN_LOC_PAIS_2);
		}

		boolean bindProvincia = false;

		if (provincia.isEmpty()) {
			sb.append(_FINDER_COLUMN_LOC_PROVINCIA_3);
		}
		else {
			bindProvincia = true;

			sb.append(_FINDER_COLUMN_LOC_PROVINCIA_2);
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
			sb.append(TiendaModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindPais) {
			queryPos.add(pais);
		}

		if (bindProvincia) {
			queryPos.add(provincia);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(tienda)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Tienda> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tiendas where pais = &#63; and provincia = &#63; from the database.
	 *
	 * @param pais the pais
	 * @param provincia the provincia
	 */
	@Override
	public void removeByLoc(String pais, String provincia) {
		for (Tienda tienda :
				findByLoc(
					pais, provincia, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(tienda);
		}
	}

	/**
	 * Returns the number of tiendas where pais = &#63; and provincia = &#63;.
	 *
	 * @param pais the pais
	 * @param provincia the provincia
	 * @return the number of matching tiendas
	 */
	@Override
	public int countByLoc(String pais, String provincia) {
		pais = Objects.toString(pais, "");
		provincia = Objects.toString(provincia, "");

		FinderPath finderPath = _finderPathCountByLoc;

		Object[] finderArgs = new Object[] {pais, provincia};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_TIENDA_WHERE);

			boolean bindPais = false;

			if (pais.isEmpty()) {
				sb.append(_FINDER_COLUMN_LOC_PAIS_3);
			}
			else {
				bindPais = true;

				sb.append(_FINDER_COLUMN_LOC_PAIS_2);
			}

			boolean bindProvincia = false;

			if (provincia.isEmpty()) {
				sb.append(_FINDER_COLUMN_LOC_PROVINCIA_3);
			}
			else {
				bindProvincia = true;

				sb.append(_FINDER_COLUMN_LOC_PROVINCIA_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindPais) {
					queryPos.add(pais);
				}

				if (bindProvincia) {
					queryPos.add(provincia);
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

	private static final String _FINDER_COLUMN_LOC_PAIS_2 =
		"tienda.pais = ? AND ";

	private static final String _FINDER_COLUMN_LOC_PAIS_3 =
		"(tienda.pais IS NULL OR tienda.pais = '') AND ";

	private static final String _FINDER_COLUMN_LOC_PROVINCIA_2 =
		"tienda.provincia = ?";

	private static final String _FINDER_COLUMN_LOC_PROVINCIA_3 =
		"(tienda.provincia IS NULL OR tienda.provincia = '')";

	public TiendaPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");
		dbColumnNames.put("id", "id_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Tienda.class);

		setModelImplClass(TiendaImpl.class);
		setModelPKClass(long.class);

		setTable(TiendaTable.INSTANCE);
	}

	/**
	 * Caches the tienda in the entity cache if it is enabled.
	 *
	 * @param tienda the tienda
	 */
	@Override
	public void cacheResult(Tienda tienda) {
		entityCache.putResult(TiendaImpl.class, tienda.getPrimaryKey(), tienda);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tiendas in the entity cache if it is enabled.
	 *
	 * @param tiendas the tiendas
	 */
	@Override
	public void cacheResult(List<Tienda> tiendas) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tiendas.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Tienda tienda : tiendas) {
			if (entityCache.getResult(
					TiendaImpl.class, tienda.getPrimaryKey()) == null) {

				cacheResult(tienda);
			}
		}
	}

	/**
	 * Clears the cache for all tiendas.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TiendaImpl.class);

		finderCache.clearCache(TiendaImpl.class);
	}

	/**
	 * Clears the cache for the tienda.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Tienda tienda) {
		entityCache.removeResult(TiendaImpl.class, tienda);
	}

	@Override
	public void clearCache(List<Tienda> tiendas) {
		for (Tienda tienda : tiendas) {
			entityCache.removeResult(TiendaImpl.class, tienda);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TiendaImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(TiendaImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new tienda with the primary key. Does not add the tienda to the database.
	 *
	 * @param id the primary key for the new tienda
	 * @return the new tienda
	 */
	@Override
	public Tienda create(long id) {
		Tienda tienda = new TiendaImpl();

		tienda.setNew(true);
		tienda.setPrimaryKey(id);

		String uuid = _portalUUID.generate();

		tienda.setUuid(uuid);

		return tienda;
	}

	/**
	 * Removes the tienda with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tienda
	 * @return the tienda that was removed
	 * @throws NoSuchTiendaException if a tienda with the primary key could not be found
	 */
	@Override
	public Tienda remove(long id) throws NoSuchTiendaException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tienda with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tienda
	 * @return the tienda that was removed
	 * @throws NoSuchTiendaException if a tienda with the primary key could not be found
	 */
	@Override
	public Tienda remove(Serializable primaryKey) throws NoSuchTiendaException {
		Session session = null;

		try {
			session = openSession();

			Tienda tienda = (Tienda)session.get(TiendaImpl.class, primaryKey);

			if (tienda == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTiendaException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tienda);
		}
		catch (NoSuchTiendaException noSuchEntityException) {
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
	protected Tienda removeImpl(Tienda tienda) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tienda)) {
				tienda = (Tienda)session.get(
					TiendaImpl.class, tienda.getPrimaryKeyObj());
			}

			if (tienda != null) {
				session.delete(tienda);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tienda != null) {
			clearCache(tienda);
		}

		return tienda;
	}

	@Override
	public Tienda updateImpl(Tienda tienda) {
		boolean isNew = tienda.isNew();

		if (!(tienda instanceof TiendaModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(tienda.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(tienda);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tienda proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Tienda implementation " +
					tienda.getClass());
		}

		TiendaModelImpl tiendaModelImpl = (TiendaModelImpl)tienda;

		if (Validator.isNull(tienda.getUuid())) {
			String uuid = _portalUUID.generate();

			tienda.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tienda);
			}
			else {
				tienda = (Tienda)session.merge(tienda);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(TiendaImpl.class, tiendaModelImpl, false, true);

		if (isNew) {
			tienda.setNew(false);
		}

		tienda.resetOriginalValues();

		return tienda;
	}

	/**
	 * Returns the tienda with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tienda
	 * @return the tienda
	 * @throws NoSuchTiendaException if a tienda with the primary key could not be found
	 */
	@Override
	public Tienda findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTiendaException {

		Tienda tienda = fetchByPrimaryKey(primaryKey);

		if (tienda == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTiendaException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tienda;
	}

	/**
	 * Returns the tienda with the primary key or throws a <code>NoSuchTiendaException</code> if it could not be found.
	 *
	 * @param id the primary key of the tienda
	 * @return the tienda
	 * @throws NoSuchTiendaException if a tienda with the primary key could not be found
	 */
	@Override
	public Tienda findByPrimaryKey(long id) throws NoSuchTiendaException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tienda with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tienda
	 * @return the tienda, or <code>null</code> if a tienda with the primary key could not be found
	 */
	@Override
	public Tienda fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tiendas.
	 *
	 * @return the tiendas
	 */
	@Override
	public List<Tienda> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tiendas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TiendaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tiendas
	 * @param end the upper bound of the range of tiendas (not inclusive)
	 * @return the range of tiendas
	 */
	@Override
	public List<Tienda> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tiendas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TiendaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tiendas
	 * @param end the upper bound of the range of tiendas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tiendas
	 */
	@Override
	public List<Tienda> findAll(
		int start, int end, OrderByComparator<Tienda> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tiendas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TiendaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tiendas
	 * @param end the upper bound of the range of tiendas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tiendas
	 */
	@Override
	public List<Tienda> findAll(
		int start, int end, OrderByComparator<Tienda> orderByComparator,
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

		List<Tienda> list = null;

		if (useFinderCache) {
			list = (List<Tienda>)finderCache.getResult(finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TIENDA);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TIENDA;

				sql = sql.concat(TiendaModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Tienda>)QueryUtil.list(
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
	 * Removes all the tiendas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Tienda tienda : findAll()) {
			remove(tienda);
		}
	}

	/**
	 * Returns the number of tiendas.
	 *
	 * @return the number of tiendas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_TIENDA);

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
		return _SQL_SELECT_TIENDA;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TiendaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tienda persistence.
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

		_finderPathWithPaginationFindByName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"nombre"}, true);

		_finderPathWithoutPaginationFindByName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByName",
			new String[] {String.class.getName()}, new String[] {"nombre"},
			true);

		_finderPathCountByName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByName",
			new String[] {String.class.getName()}, new String[] {"nombre"},
			false);

		_finderPathWithPaginationFindByLoc = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLoc",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"pais", "provincia"}, true);

		_finderPathWithoutPaginationFindByLoc = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLoc",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"pais", "provincia"}, true);

		_finderPathCountByLoc = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLoc",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"pais", "provincia"}, false);

		_setTiendaUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setTiendaUtilPersistence(null);

		entityCache.removeCache(TiendaImpl.class.getName());
	}

	private void _setTiendaUtilPersistence(
		TiendaPersistence tiendaPersistence) {

		try {
			Field field = TiendaUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, tiendaPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = PRACTICA_TiendaPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = PRACTICA_TiendaPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = PRACTICA_TiendaPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_TIENDA =
		"SELECT tienda FROM Tienda tienda";

	private static final String _SQL_SELECT_TIENDA_WHERE =
		"SELECT tienda FROM Tienda tienda WHERE ";

	private static final String _SQL_COUNT_TIENDA =
		"SELECT COUNT(tienda) FROM Tienda tienda";

	private static final String _SQL_COUNT_TIENDA_WHERE =
		"SELECT COUNT(tienda) FROM Tienda tienda WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "tienda.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Tienda exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Tienda exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TiendaPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid", "id"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private PortalUUID _portalUUID;

	@Reference
	private TiendaModelArgumentsResolver _tiendaModelArgumentsResolver;

}