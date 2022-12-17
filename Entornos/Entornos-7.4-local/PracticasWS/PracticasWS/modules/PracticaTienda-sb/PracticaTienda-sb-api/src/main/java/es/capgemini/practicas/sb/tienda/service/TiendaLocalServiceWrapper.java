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

package es.capgemini.practicas.sb.tienda.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TiendaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TiendaLocalService
 * @generated
 */
public class TiendaLocalServiceWrapper
	implements ServiceWrapper<TiendaLocalService>, TiendaLocalService {

	public TiendaLocalServiceWrapper() {
		this(null);
	}

	public TiendaLocalServiceWrapper(TiendaLocalService tiendaLocalService) {
		_tiendaLocalService = tiendaLocalService;
	}

	/**
	 * Adds the tienda to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TiendaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tienda the tienda
	 * @return the tienda that was added
	 */
	@Override
	public es.capgemini.practicas.sb.tienda.model.Tienda addTienda(
		es.capgemini.practicas.sb.tienda.model.Tienda tienda) {

		return _tiendaLocalService.addTienda(tienda);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tiendaLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new tienda with the primary key. Does not add the tienda to the database.
	 *
	 * @param id the primary key for the new tienda
	 * @return the new tienda
	 */
	@Override
	public es.capgemini.practicas.sb.tienda.model.Tienda createTienda(long id) {
		return _tiendaLocalService.createTienda(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tiendaLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the tienda with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TiendaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the tienda
	 * @return the tienda that was removed
	 * @throws PortalException if a tienda with the primary key could not be found
	 */
	@Override
	public es.capgemini.practicas.sb.tienda.model.Tienda deleteTienda(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tiendaLocalService.deleteTienda(id);
	}

	/**
	 * Deletes the tienda from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TiendaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tienda the tienda
	 * @return the tienda that was removed
	 */
	@Override
	public es.capgemini.practicas.sb.tienda.model.Tienda deleteTienda(
		es.capgemini.practicas.sb.tienda.model.Tienda tienda) {

		return _tiendaLocalService.deleteTienda(tienda);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tiendaLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tiendaLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tiendaLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _tiendaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>es.capgemini.practicas.sb.tienda.model.impl.TiendaModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _tiendaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>es.capgemini.practicas.sb.tienda.model.impl.TiendaModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _tiendaLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _tiendaLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _tiendaLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public es.capgemini.practicas.sb.tienda.model.Tienda fetchTienda(long id) {
		return _tiendaLocalService.fetchTienda(id);
	}

	@Override
	public java.util.List<es.capgemini.practicas.sb.tienda.model.Tienda>
		findByLoc(String pais, String provincia) {

		return _tiendaLocalService.findByLoc(pais, provincia);
	}

	@Override
	public java.util.List<es.capgemini.practicas.sb.tienda.model.Tienda>
		findByName(String nombre) {

		return _tiendaLocalService.findByName(nombre);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tiendaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tiendaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tiendaLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tiendaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the tienda with the primary key.
	 *
	 * @param id the primary key of the tienda
	 * @return the tienda
	 * @throws PortalException if a tienda with the primary key could not be found
	 */
	@Override
	public es.capgemini.practicas.sb.tienda.model.Tienda getTienda(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tiendaLocalService.getTienda(id);
	}

	/**
	 * Returns a range of all the tiendas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>es.capgemini.practicas.sb.tienda.model.impl.TiendaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tiendas
	 * @param end the upper bound of the range of tiendas (not inclusive)
	 * @return the range of tiendas
	 */
	@Override
	public java.util.List<es.capgemini.practicas.sb.tienda.model.Tienda>
		getTiendas(int start, int end) {

		return _tiendaLocalService.getTiendas(start, end);
	}

	/**
	 * Returns the number of tiendas.
	 *
	 * @return the number of tiendas
	 */
	@Override
	public int getTiendasCount() {
		return _tiendaLocalService.getTiendasCount();
	}

	/**
	 * Updates the tienda in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TiendaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tienda the tienda
	 * @return the tienda that was updated
	 */
	@Override
	public es.capgemini.practicas.sb.tienda.model.Tienda updateTienda(
		es.capgemini.practicas.sb.tienda.model.Tienda tienda) {

		return _tiendaLocalService.updateTienda(tienda);
	}

	@Override
	public TiendaLocalService getWrappedService() {
		return _tiendaLocalService;
	}

	@Override
	public void setWrappedService(TiendaLocalService tiendaLocalService) {
		_tiendaLocalService = tiendaLocalService;
	}

	private TiendaLocalService _tiendaLocalService;

}