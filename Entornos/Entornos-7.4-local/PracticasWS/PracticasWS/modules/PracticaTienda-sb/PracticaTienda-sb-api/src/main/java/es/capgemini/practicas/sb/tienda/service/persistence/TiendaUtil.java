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

package es.capgemini.practicas.sb.tienda.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import es.capgemini.practicas.sb.tienda.model.Tienda;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tienda service. This utility wraps <code>es.capgemini.practicas.sb.tienda.service.persistence.impl.TiendaPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TiendaPersistence
 * @generated
 */
public class TiendaUtil {

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
	public static void clearCache(Tienda tienda) {
		getPersistence().clearCache(tienda);
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
	public static Map<Serializable, Tienda> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Tienda> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Tienda> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Tienda> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Tienda> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Tienda update(Tienda tienda) {
		return getPersistence().update(tienda);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Tienda update(Tienda tienda, ServiceContext serviceContext) {
		return getPersistence().update(tienda, serviceContext);
	}

	/**
	 * Returns all the tiendas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching tiendas
	 */
	public static List<Tienda> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
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
	public static List<Tienda> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
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
	public static List<Tienda> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Tienda> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
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
	public static List<Tienda> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Tienda> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first tienda in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tienda
	 * @throws NoSuchTiendaException if a matching tienda could not be found
	 */
	public static Tienda findByUuid_First(
			String uuid, OrderByComparator<Tienda> orderByComparator)
		throws es.capgemini.practicas.sb.tienda.exception.
			NoSuchTiendaException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first tienda in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tienda, or <code>null</code> if a matching tienda could not be found
	 */
	public static Tienda fetchByUuid_First(
		String uuid, OrderByComparator<Tienda> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last tienda in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tienda
	 * @throws NoSuchTiendaException if a matching tienda could not be found
	 */
	public static Tienda findByUuid_Last(
			String uuid, OrderByComparator<Tienda> orderByComparator)
		throws es.capgemini.practicas.sb.tienda.exception.
			NoSuchTiendaException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last tienda in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tienda, or <code>null</code> if a matching tienda could not be found
	 */
	public static Tienda fetchByUuid_Last(
		String uuid, OrderByComparator<Tienda> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
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
	public static Tienda[] findByUuid_PrevAndNext(
			long id, String uuid, OrderByComparator<Tienda> orderByComparator)
		throws es.capgemini.practicas.sb.tienda.exception.
			NoSuchTiendaException {

		return getPersistence().findByUuid_PrevAndNext(
			id, uuid, orderByComparator);
	}

	/**
	 * Removes all the tiendas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of tiendas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching tiendas
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the tiendas where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @return the matching tiendas
	 */
	public static List<Tienda> findByName(String nombre) {
		return getPersistence().findByName(nombre);
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
	public static List<Tienda> findByName(String nombre, int start, int end) {
		return getPersistence().findByName(nombre, start, end);
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
	public static List<Tienda> findByName(
		String nombre, int start, int end,
		OrderByComparator<Tienda> orderByComparator) {

		return getPersistence().findByName(
			nombre, start, end, orderByComparator);
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
	public static List<Tienda> findByName(
		String nombre, int start, int end,
		OrderByComparator<Tienda> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByName(
			nombre, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first tienda in the ordered set where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tienda
	 * @throws NoSuchTiendaException if a matching tienda could not be found
	 */
	public static Tienda findByName_First(
			String nombre, OrderByComparator<Tienda> orderByComparator)
		throws es.capgemini.practicas.sb.tienda.exception.
			NoSuchTiendaException {

		return getPersistence().findByName_First(nombre, orderByComparator);
	}

	/**
	 * Returns the first tienda in the ordered set where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tienda, or <code>null</code> if a matching tienda could not be found
	 */
	public static Tienda fetchByName_First(
		String nombre, OrderByComparator<Tienda> orderByComparator) {

		return getPersistence().fetchByName_First(nombre, orderByComparator);
	}

	/**
	 * Returns the last tienda in the ordered set where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tienda
	 * @throws NoSuchTiendaException if a matching tienda could not be found
	 */
	public static Tienda findByName_Last(
			String nombre, OrderByComparator<Tienda> orderByComparator)
		throws es.capgemini.practicas.sb.tienda.exception.
			NoSuchTiendaException {

		return getPersistence().findByName_Last(nombre, orderByComparator);
	}

	/**
	 * Returns the last tienda in the ordered set where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tienda, or <code>null</code> if a matching tienda could not be found
	 */
	public static Tienda fetchByName_Last(
		String nombre, OrderByComparator<Tienda> orderByComparator) {

		return getPersistence().fetchByName_Last(nombre, orderByComparator);
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
	public static Tienda[] findByName_PrevAndNext(
			long id, String nombre, OrderByComparator<Tienda> orderByComparator)
		throws es.capgemini.practicas.sb.tienda.exception.
			NoSuchTiendaException {

		return getPersistence().findByName_PrevAndNext(
			id, nombre, orderByComparator);
	}

	/**
	 * Removes all the tiendas where nombre = &#63; from the database.
	 *
	 * @param nombre the nombre
	 */
	public static void removeByName(String nombre) {
		getPersistence().removeByName(nombre);
	}

	/**
	 * Returns the number of tiendas where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @return the number of matching tiendas
	 */
	public static int countByName(String nombre) {
		return getPersistence().countByName(nombre);
	}

	/**
	 * Returns all the tiendas where pais = &#63; and provincia = &#63;.
	 *
	 * @param pais the pais
	 * @param provincia the provincia
	 * @return the matching tiendas
	 */
	public static List<Tienda> findByLoc(String pais, String provincia) {
		return getPersistence().findByLoc(pais, provincia);
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
	public static List<Tienda> findByLoc(
		String pais, String provincia, int start, int end) {

		return getPersistence().findByLoc(pais, provincia, start, end);
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
	public static List<Tienda> findByLoc(
		String pais, String provincia, int start, int end,
		OrderByComparator<Tienda> orderByComparator) {

		return getPersistence().findByLoc(
			pais, provincia, start, end, orderByComparator);
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
	public static List<Tienda> findByLoc(
		String pais, String provincia, int start, int end,
		OrderByComparator<Tienda> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByLoc(
			pais, provincia, start, end, orderByComparator, useFinderCache);
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
	public static Tienda findByLoc_First(
			String pais, String provincia,
			OrderByComparator<Tienda> orderByComparator)
		throws es.capgemini.practicas.sb.tienda.exception.
			NoSuchTiendaException {

		return getPersistence().findByLoc_First(
			pais, provincia, orderByComparator);
	}

	/**
	 * Returns the first tienda in the ordered set where pais = &#63; and provincia = &#63;.
	 *
	 * @param pais the pais
	 * @param provincia the provincia
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tienda, or <code>null</code> if a matching tienda could not be found
	 */
	public static Tienda fetchByLoc_First(
		String pais, String provincia,
		OrderByComparator<Tienda> orderByComparator) {

		return getPersistence().fetchByLoc_First(
			pais, provincia, orderByComparator);
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
	public static Tienda findByLoc_Last(
			String pais, String provincia,
			OrderByComparator<Tienda> orderByComparator)
		throws es.capgemini.practicas.sb.tienda.exception.
			NoSuchTiendaException {

		return getPersistence().findByLoc_Last(
			pais, provincia, orderByComparator);
	}

	/**
	 * Returns the last tienda in the ordered set where pais = &#63; and provincia = &#63;.
	 *
	 * @param pais the pais
	 * @param provincia the provincia
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tienda, or <code>null</code> if a matching tienda could not be found
	 */
	public static Tienda fetchByLoc_Last(
		String pais, String provincia,
		OrderByComparator<Tienda> orderByComparator) {

		return getPersistence().fetchByLoc_Last(
			pais, provincia, orderByComparator);
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
	public static Tienda[] findByLoc_PrevAndNext(
			long id, String pais, String provincia,
			OrderByComparator<Tienda> orderByComparator)
		throws es.capgemini.practicas.sb.tienda.exception.
			NoSuchTiendaException {

		return getPersistence().findByLoc_PrevAndNext(
			id, pais, provincia, orderByComparator);
	}

	/**
	 * Removes all the tiendas where pais = &#63; and provincia = &#63; from the database.
	 *
	 * @param pais the pais
	 * @param provincia the provincia
	 */
	public static void removeByLoc(String pais, String provincia) {
		getPersistence().removeByLoc(pais, provincia);
	}

	/**
	 * Returns the number of tiendas where pais = &#63; and provincia = &#63;.
	 *
	 * @param pais the pais
	 * @param provincia the provincia
	 * @return the number of matching tiendas
	 */
	public static int countByLoc(String pais, String provincia) {
		return getPersistence().countByLoc(pais, provincia);
	}

	/**
	 * Caches the tienda in the entity cache if it is enabled.
	 *
	 * @param tienda the tienda
	 */
	public static void cacheResult(Tienda tienda) {
		getPersistence().cacheResult(tienda);
	}

	/**
	 * Caches the tiendas in the entity cache if it is enabled.
	 *
	 * @param tiendas the tiendas
	 */
	public static void cacheResult(List<Tienda> tiendas) {
		getPersistence().cacheResult(tiendas);
	}

	/**
	 * Creates a new tienda with the primary key. Does not add the tienda to the database.
	 *
	 * @param id the primary key for the new tienda
	 * @return the new tienda
	 */
	public static Tienda create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the tienda with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tienda
	 * @return the tienda that was removed
	 * @throws NoSuchTiendaException if a tienda with the primary key could not be found
	 */
	public static Tienda remove(long id)
		throws es.capgemini.practicas.sb.tienda.exception.
			NoSuchTiendaException {

		return getPersistence().remove(id);
	}

	public static Tienda updateImpl(Tienda tienda) {
		return getPersistence().updateImpl(tienda);
	}

	/**
	 * Returns the tienda with the primary key or throws a <code>NoSuchTiendaException</code> if it could not be found.
	 *
	 * @param id the primary key of the tienda
	 * @return the tienda
	 * @throws NoSuchTiendaException if a tienda with the primary key could not be found
	 */
	public static Tienda findByPrimaryKey(long id)
		throws es.capgemini.practicas.sb.tienda.exception.
			NoSuchTiendaException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the tienda with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tienda
	 * @return the tienda, or <code>null</code> if a tienda with the primary key could not be found
	 */
	public static Tienda fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the tiendas.
	 *
	 * @return the tiendas
	 */
	public static List<Tienda> findAll() {
		return getPersistence().findAll();
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
	public static List<Tienda> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<Tienda> findAll(
		int start, int end, OrderByComparator<Tienda> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<Tienda> findAll(
		int start, int end, OrderByComparator<Tienda> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tiendas from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tiendas.
	 *
	 * @return the number of tiendas
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TiendaPersistence getPersistence() {
		return _persistence;
	}

	private static volatile TiendaPersistence _persistence;

}