/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.thanhnhan.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link KhuVucLocalService}.
 *
 * @author ThanhNhan
 * @see KhuVucLocalService
 * @generated
 */
public class KhuVucLocalServiceWrapper implements KhuVucLocalService,
	ServiceWrapper<KhuVucLocalService> {
	public KhuVucLocalServiceWrapper(KhuVucLocalService khuVucLocalService) {
		_khuVucLocalService = khuVucLocalService;
	}

	/**
	* Adds the khu vuc to the database. Also notifies the appropriate model listeners.
	*
	* @param khuVuc the khu vuc
	* @return the khu vuc that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thanhnhan.model.KhuVuc addKhuVuc(
		com.thanhnhan.model.KhuVuc khuVuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _khuVucLocalService.addKhuVuc(khuVuc);
	}

	/**
	* Creates a new khu vuc with the primary key. Does not add the khu vuc to the database.
	*
	* @param id the primary key for the new khu vuc
	* @return the new khu vuc
	*/
	@Override
	public com.thanhnhan.model.KhuVuc createKhuVuc(long id) {
		return _khuVucLocalService.createKhuVuc(id);
	}

	/**
	* Deletes the khu vuc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the khu vuc
	* @return the khu vuc that was removed
	* @throws PortalException if a khu vuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thanhnhan.model.KhuVuc deleteKhuVuc(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _khuVucLocalService.deleteKhuVuc(id);
	}

	/**
	* Deletes the khu vuc from the database. Also notifies the appropriate model listeners.
	*
	* @param khuVuc the khu vuc
	* @return the khu vuc that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thanhnhan.model.KhuVuc deleteKhuVuc(
		com.thanhnhan.model.KhuVuc khuVuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _khuVucLocalService.deleteKhuVuc(khuVuc);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _khuVucLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _khuVucLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.KhuVucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _khuVucLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.KhuVucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _khuVucLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _khuVucLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _khuVucLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.thanhnhan.model.KhuVuc fetchKhuVuc(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _khuVucLocalService.fetchKhuVuc(id);
	}

	/**
	* Returns the khu vuc with the primary key.
	*
	* @param id the primary key of the khu vuc
	* @return the khu vuc
	* @throws PortalException if a khu vuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thanhnhan.model.KhuVuc getKhuVuc(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _khuVucLocalService.getKhuVuc(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _khuVucLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the khu vucs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.KhuVucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of khu vucs
	* @param end the upper bound of the range of khu vucs (not inclusive)
	* @return the range of khu vucs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.thanhnhan.model.KhuVuc> getKhuVucs(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _khuVucLocalService.getKhuVucs(start, end);
	}

	/**
	* Returns the number of khu vucs.
	*
	* @return the number of khu vucs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getKhuVucsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _khuVucLocalService.getKhuVucsCount();
	}

	/**
	* Updates the khu vuc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param khuVuc the khu vuc
	* @return the khu vuc that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thanhnhan.model.KhuVuc updateKhuVuc(
		com.thanhnhan.model.KhuVuc khuVuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _khuVucLocalService.updateKhuVuc(khuVuc);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _khuVucLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_khuVucLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _khuVucLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Delete Khu Vuc by Id
	*
	* @param kvId
	* @return
	* @throws SystemException
	* @throws PortalException
	* @author ThanhNhan
	*/
	@Override
	public com.thanhnhan.model.KhuVuc deleteKV(long kvId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _khuVucLocalService.deleteKV(kvId);
	}

	/**
	* Delete Khu Vuc by KhuVuc Object
	*
	* @param kv
	* @return
	* @throws SystemException
	* @throws PortalException
	* @author ThanhNhan
	*/
	@Override
	public com.thanhnhan.model.KhuVuc deleteKV(com.thanhnhan.model.KhuVuc kv)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _khuVucLocalService.deleteKV(kv);
	}

	/**
	* Get all KhuVuc
	*
	* @return
	* @throws SystemException
	* @author ThanhNHan
	*/
	@Override
	public java.util.List<com.thanhnhan.model.KhuVuc> getKVs()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _khuVucLocalService.getKVs();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public KhuVucLocalService getWrappedKhuVucLocalService() {
		return _khuVucLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedKhuVucLocalService(
		KhuVucLocalService khuVucLocalService) {
		_khuVucLocalService = khuVucLocalService;
	}

	@Override
	public KhuVucLocalService getWrappedService() {
		return _khuVucLocalService;
	}

	@Override
	public void setWrappedService(KhuVucLocalService khuVucLocalService) {
		_khuVucLocalService = khuVucLocalService;
	}

	private KhuVucLocalService _khuVucLocalService;
}