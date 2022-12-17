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

package es.capgemini.proyecto.procesopedido.sb.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PedidosLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PedidosLocalService
 * @generated
 */
public class PedidosLocalServiceWrapper
	implements PedidosLocalService, ServiceWrapper<PedidosLocalService> {

	public PedidosLocalServiceWrapper() {
		this(null);
	}

	public PedidosLocalServiceWrapper(PedidosLocalService pedidosLocalService) {
		_pedidosLocalService = pedidosLocalService;
	}

	/**
	 * Adds the pedidos to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PedidosLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pedidos the pedidos
	 * @return the pedidos that was added
	 */
	@Override
	public es.capgemini.proyecto.procesopedido.sb.model.Pedidos addPedidos(
		es.capgemini.proyecto.procesopedido.sb.model.Pedidos pedidos) {

		return _pedidosLocalService.addPedidos(pedidos);
	}

	/**
	 * Creates a new pedidos with the primary key. Does not add the pedidos to the database.
	 *
	 * @param id the primary key for the new pedidos
	 * @return the new pedidos
	 */
	@Override
	public es.capgemini.proyecto.procesopedido.sb.model.Pedidos createPedidos(
		long id) {

		return _pedidosLocalService.createPedidos(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pedidosLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the pedidos with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PedidosLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the pedidos
	 * @return the pedidos that was removed
	 * @throws PortalException if a pedidos with the primary key could not be found
	 */
	@Override
	public es.capgemini.proyecto.procesopedido.sb.model.Pedidos deletePedidos(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pedidosLocalService.deletePedidos(id);
	}

	/**
	 * Deletes the pedidos from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PedidosLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pedidos the pedidos
	 * @return the pedidos that was removed
	 */
	@Override
	public es.capgemini.proyecto.procesopedido.sb.model.Pedidos deletePedidos(
		es.capgemini.proyecto.procesopedido.sb.model.Pedidos pedidos) {

		return _pedidosLocalService.deletePedidos(pedidos);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pedidosLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _pedidosLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _pedidosLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pedidosLocalService.dynamicQuery();
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

		return _pedidosLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>es.capgemini.proyecto.procesopedido.sb.model.impl.PedidosModelImpl</code>.
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

		return _pedidosLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>es.capgemini.proyecto.procesopedido.sb.model.impl.PedidosModelImpl</code>.
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

		return _pedidosLocalService.dynamicQuery(
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

		return _pedidosLocalService.dynamicQueryCount(dynamicQuery);
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

		return _pedidosLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public es.capgemini.proyecto.procesopedido.sb.model.Pedidos fetchPedidos(
		long id) {

		return _pedidosLocalService.fetchPedidos(id);
	}

	@Override
	public java.util.List<es.capgemini.proyecto.procesopedido.sb.model.Pedidos>
		findByOrder(long idUsuario, long idProducto) {

		return _pedidosLocalService.findByOrder(idUsuario, idProducto);
	}

	@Override
	public java.util.List<es.capgemini.proyecto.procesopedido.sb.model.Pedidos>
		findByUser(long idUsuario) {

		return _pedidosLocalService.findByUser(idUsuario);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _pedidosLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _pedidosLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pedidosLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * Returns the pedidos with the primary key.
	 *
	 * @param id the primary key of the pedidos
	 * @return the pedidos
	 * @throws PortalException if a pedidos with the primary key could not be found
	 */
	@Override
	public es.capgemini.proyecto.procesopedido.sb.model.Pedidos getPedidos(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pedidosLocalService.getPedidos(id);
	}

	/**
	 * Returns a range of all the pedidoses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>es.capgemini.proyecto.procesopedido.sb.model.impl.PedidosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pedidoses
	 * @param end the upper bound of the range of pedidoses (not inclusive)
	 * @return the range of pedidoses
	 */
	@Override
	public java.util.List<es.capgemini.proyecto.procesopedido.sb.model.Pedidos>
		getPedidoses(int start, int end) {

		return _pedidosLocalService.getPedidoses(start, end);
	}

	/**
	 * Returns the number of pedidoses.
	 *
	 * @return the number of pedidoses
	 */
	@Override
	public int getPedidosesCount() {
		return _pedidosLocalService.getPedidosesCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pedidosLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the pedidos in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PedidosLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pedidos the pedidos
	 * @return the pedidos that was updated
	 */
	@Override
	public es.capgemini.proyecto.procesopedido.sb.model.Pedidos updatePedidos(
		es.capgemini.proyecto.procesopedido.sb.model.Pedidos pedidos) {

		return _pedidosLocalService.updatePedidos(pedidos);
	}

	@Override
	public PedidosLocalService getWrappedService() {
		return _pedidosLocalService;
	}

	@Override
	public void setWrappedService(PedidosLocalService pedidosLocalService) {
		_pedidosLocalService = pedidosLocalService;
	}

	private PedidosLocalService _pedidosLocalService;

}