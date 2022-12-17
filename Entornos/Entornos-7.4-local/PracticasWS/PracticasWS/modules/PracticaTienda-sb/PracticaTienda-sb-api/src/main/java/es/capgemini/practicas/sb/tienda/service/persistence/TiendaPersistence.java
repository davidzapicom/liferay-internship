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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import es.capgemini.practicas.sb.tienda.exception.NoSuchTiendaException;
import es.capgemini.practicas.sb.tienda.model.Tienda;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tienda service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TiendaUtil
 * @generated
 */
@ProviderType
public interface TiendaPersistence extends BasePersistence<Tienda> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TiendaUtil} to access the tienda persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the tiendas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching tiendas
	 */
	public java.util.List<Tienda> findByUuid(String uuid);

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
	public java.util.List<Tienda> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Tienda> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tienda>
			orderByComparator);

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
	public java.util.List<Tienda> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tienda>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first tienda in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tienda
	 * @throws NoSuchTiendaException if a matching tienda could not be found
	 */
	public Tienda findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Tienda>
				orderByComparator)
		throws NoSuchTiendaException;

	/**
	 * Returns the first tienda in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tienda, or <code>null</code> if a matching tienda could not be found
	 */
	public Tienda fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Tienda>
			orderByComparator);

	/**
	 * Returns the last tienda in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tienda
	 * @throws NoSuchTiendaException if a matching tienda could not be found
	 */
	public Tienda findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Tienda>
				orderByComparator)
		throws NoSuchTiendaException;

	/**
	 * Returns the last tienda in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tienda, or <code>null</code> if a matching tienda could not be found
	 */
	public Tienda fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Tienda>
			orderByComparator);

	/**
	 * Returns the tiendas before and after the current tienda in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current tienda
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tienda
	 * @throws NoSuchTiendaException if a tienda with the primary key could not be found
	 */
	public Tienda[] findByUuid_PrevAndNext(
			long id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Tienda>
				orderByComparator)
		throws NoSuchTiendaException;

	/**
	 * Removes all the tiendas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of tiendas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching tiendas
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the tiendas where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @return the matching tiendas
	 */
	public java.util.List<Tienda> findByName(String nombre);

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
	public java.util.List<Tienda> findByName(String nombre, int start, int end);

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
	public java.util.List<Tienda> findByName(
		String nombre, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tienda>
			orderByComparator);

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
	public java.util.List<Tienda> findByName(
		String nombre, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tienda>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first tienda in the ordered set where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tienda
	 * @throws NoSuchTiendaException if a matching tienda could not be found
	 */
	public Tienda findByName_First(
			String nombre,
			com.liferay.portal.kernel.util.OrderByComparator<Tienda>
				orderByComparator)
		throws NoSuchTiendaException;

	/**
	 * Returns the first tienda in the ordered set where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tienda, or <code>null</code> if a matching tienda could not be found
	 */
	public Tienda fetchByName_First(
		String nombre,
		com.liferay.portal.kernel.util.OrderByComparator<Tienda>
			orderByComparator);

	/**
	 * Returns the last tienda in the ordered set where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tienda
	 * @throws NoSuchTiendaException if a matching tienda could not be found
	 */
	public Tienda findByName_Last(
			String nombre,
			com.liferay.portal.kernel.util.OrderByComparator<Tienda>
				orderByComparator)
		throws NoSuchTiendaException;

	/**
	 * Returns the last tienda in the ordered set where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tienda, or <code>null</code> if a matching tienda could not be found
	 */
	public Tienda fetchByName_Last(
		String nombre,
		com.liferay.portal.kernel.util.OrderByComparator<Tienda>
			orderByComparator);

	/**
	 * Returns the tiendas before and after the current tienda in the ordered set where nombre = &#63;.
	 *
	 * @param id the primary key of the current tienda
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tienda
	 * @throws NoSuchTiendaException if a tienda with the primary key could not be found
	 */
	public Tienda[] findByName_PrevAndNext(
			long id, String nombre,
			com.liferay.portal.kernel.util.OrderByComparator<Tienda>
				orderByComparator)
		throws NoSuchTiendaException;

	/**
	 * Removes all the tiendas where nombre = &#63; from the database.
	 *
	 * @param nombre the nombre
	 */
	public void removeByName(String nombre);

	/**
	 * Returns the number of tiendas where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @return the number of matching tiendas
	 */
	public int countByName(String nombre);

	/**
	 * Returns all the tiendas where pais = &#63; and provincia = &#63;.
	 *
	 * @param pais the pais
	 * @param provincia the provincia
	 * @return the matching tiendas
	 */
	public java.util.List<Tienda> findByLoc(String pais, String provincia);

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
	public java.util.List<Tienda> findByLoc(
		String pais, String provincia, int start, int end);

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
	public java.util.List<Tienda> findByLoc(
		String pais, String provincia, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tienda>
			orderByComparator);

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
	public java.util.List<Tienda> findByLoc(
		String pais, String provincia, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tienda>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first tienda in the ordered set where pais = &#63; and provincia = &#63;.
	 *
	 * @param pais the pais
	 * @param provincia the provincia
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tienda
	 * @throws NoSuchTiendaException if a matching tienda could not be found
	 */
	public Tienda findByLoc_First(
			String pais, String provincia,
			com.liferay.portal.kernel.util.OrderByComparator<Tienda>
				orderByComparator)
		throws NoSuchTiendaException;

	/**
	 * Returns the first tienda in the ordered set where pais = &#63; and provincia = &#63;.
	 *
	 * @param pais the pais
	 * @param provincia the provincia
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tienda, or <code>null</code> if a matching tienda could not be found
	 */
	public Tienda fetchByLoc_First(
		String pais, String provincia,
		com.liferay.portal.kernel.util.OrderByComparator<Tienda>
			orderByComparator);

	/**
	 * Returns the last tienda in the ordered set where pais = &#63; and provincia = &#63;.
	 *
	 * @param pais the pais
	 * @param provincia the provincia
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tienda
	 * @throws NoSuchTiendaException if a matching tienda could not be found
	 */
	public Tienda findByLoc_Last(
			String pais, String provincia,
			com.liferay.portal.kernel.util.OrderByComparator<Tienda>
				orderByComparator)
		throws NoSuchTiendaException;

	/**
	 * Returns the last tienda in the ordered set where pais = &#63; and provincia = &#63;.
	 *
	 * @param pais the pais
	 * @param provincia the provincia
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tienda, or <code>null</code> if a matching tienda could not be found
	 */
	public Tienda fetchByLoc_Last(
		String pais, String provincia,
		com.liferay.portal.kernel.util.OrderByComparator<Tienda>
			orderByComparator);

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
	public Tienda[] findByLoc_PrevAndNext(
			long id, String pais, String provincia,
			com.liferay.portal.kernel.util.OrderByComparator<Tienda>
				orderByComparator)
		throws NoSuchTiendaException;

	/**
	 * Removes all the tiendas where pais = &#63; and provincia = &#63; from the database.
	 *
	 * @param pais the pais
	 * @param provincia the provincia
	 */
	public void removeByLoc(String pais, String provincia);

	/**
	 * Returns the number of tiendas where pais = &#63; and provincia = &#63;.
	 *
	 * @param pais the pais
	 * @param provincia the provincia
	 * @return the number of matching tiendas
	 */
	public int countByLoc(String pais, String provincia);

	/**
	 * Caches the tienda in the entity cache if it is enabled.
	 *
	 * @param tienda the tienda
	 */
	public void cacheResult(Tienda tienda);

	/**
	 * Caches the tiendas in the entity cache if it is enabled.
	 *
	 * @param tiendas the tiendas
	 */
	public void cacheResult(java.util.List<Tienda> tiendas);

	/**
	 * Creates a new tienda with the primary key. Does not add the tienda to the database.
	 *
	 * @param id the primary key for the new tienda
	 * @return the new tienda
	 */
	public Tienda create(long id);

	/**
	 * Removes the tienda with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tienda
	 * @return the tienda that was removed
	 * @throws NoSuchTiendaException if a tienda with the primary key could not be found
	 */
	public Tienda remove(long id) throws NoSuchTiendaException;

	public Tienda updateImpl(Tienda tienda);

	/**
	 * Returns the tienda with the primary key or throws a <code>NoSuchTiendaException</code> if it could not be found.
	 *
	 * @param id the primary key of the tienda
	 * @return the tienda
	 * @throws NoSuchTiendaException if a tienda with the primary key could not be found
	 */
	public Tienda findByPrimaryKey(long id) throws NoSuchTiendaException;

	/**
	 * Returns the tienda with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tienda
	 * @return the tienda, or <code>null</code> if a tienda with the primary key could not be found
	 */
	public Tienda fetchByPrimaryKey(long id);

	/**
	 * Returns all the tiendas.
	 *
	 * @return the tiendas
	 */
	public java.util.List<Tienda> findAll();

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
	public java.util.List<Tienda> findAll(int start, int end);

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
	public java.util.List<Tienda> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tienda>
			orderByComparator);

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
	public java.util.List<Tienda> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tienda>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tiendas from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tiendas.
	 *
	 * @return the number of tiendas
	 */
	public int countAll();

}