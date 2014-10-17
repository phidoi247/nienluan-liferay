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
 * Provides a wrapper for {@link LoaiSPLocalService}.
 *
 * @author ThanhNhan
 * @see LoaiSPLocalService
 * @generated
 */
public class LoaiSPLocalServiceWrapper implements LoaiSPLocalService,
	ServiceWrapper<LoaiSPLocalService> {
	public LoaiSPLocalServiceWrapper(LoaiSPLocalService loaiSPLocalService) {
		_loaiSPLocalService = loaiSPLocalService;
	}

	/**
	* Adds the loai s p to the database. Also notifies the appropriate model listeners.
	*
	* @param loaiSP the loai s p
	* @return the loai s p that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thanhnhan.model.LoaiSP addLoaiSP(
		com.thanhnhan.model.LoaiSP loaiSP)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiSPLocalService.addLoaiSP(loaiSP);
	}

	/**
	* Creates a new loai s p with the primary key. Does not add the loai s p to the database.
	*
	* @param loaiSPId the primary key for the new loai s p
	* @return the new loai s p
	*/
	@Override
	public com.thanhnhan.model.LoaiSP createLoaiSP(long loaiSPId) {
		return _loaiSPLocalService.createLoaiSP(loaiSPId);
	}

	/**
	* Deletes the loai s p with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param loaiSPId the primary key of the loai s p
	* @return the loai s p that was removed
	* @throws PortalException if a loai s p with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thanhnhan.model.LoaiSP deleteLoaiSP(long loaiSPId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _loaiSPLocalService.deleteLoaiSP(loaiSPId);
	}

	/**
	* Deletes the loai s p from the database. Also notifies the appropriate model listeners.
	*
	* @param loaiSP the loai s p
	* @return the loai s p that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thanhnhan.model.LoaiSP deleteLoaiSP(
		com.thanhnhan.model.LoaiSP loaiSP)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiSPLocalService.deleteLoaiSP(loaiSP);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _loaiSPLocalService.dynamicQuery();
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
		return _loaiSPLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.LoaiSPModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _loaiSPLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.LoaiSPModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _loaiSPLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _loaiSPLocalService.dynamicQueryCount(dynamicQuery);
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
		return _loaiSPLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.thanhnhan.model.LoaiSP fetchLoaiSP(long loaiSPId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiSPLocalService.fetchLoaiSP(loaiSPId);
	}

	/**
	* Returns the loai s p with the primary key.
	*
	* @param loaiSPId the primary key of the loai s p
	* @return the loai s p
	* @throws PortalException if a loai s p with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thanhnhan.model.LoaiSP getLoaiSP(long loaiSPId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _loaiSPLocalService.getLoaiSP(loaiSPId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _loaiSPLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the loai s ps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.LoaiSPModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of loai s ps
	* @param end the upper bound of the range of loai s ps (not inclusive)
	* @return the range of loai s ps
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.thanhnhan.model.LoaiSP> getLoaiSPs(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiSPLocalService.getLoaiSPs(start, end);
	}

	/**
	* Returns the number of loai s ps.
	*
	* @return the number of loai s ps
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLoaiSPsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiSPLocalService.getLoaiSPsCount();
	}

	/**
	* Updates the loai s p in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param loaiSP the loai s p
	* @return the loai s p that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thanhnhan.model.LoaiSP updateLoaiSP(
		com.thanhnhan.model.LoaiSP loaiSP)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiSPLocalService.updateLoaiSP(loaiSP);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _loaiSPLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_loaiSPLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _loaiSPLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* getAllLoais lÃ¡ÂºÂ¥y tÃ¡ÂºÂ¥t cÃ¡ÂºÂ£ loÃ¡ÂºÂ¡i sp
	*
	* @return
	* @throws SystemException
	*/
	@Override
	public java.util.List<com.thanhnhan.model.LoaiSP> getAllLoais()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiSPLocalService.getAllLoais();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LoaiSPLocalService getWrappedLoaiSPLocalService() {
		return _loaiSPLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLoaiSPLocalService(
		LoaiSPLocalService loaiSPLocalService) {
		_loaiSPLocalService = loaiSPLocalService;
	}

	@Override
	public LoaiSPLocalService getWrappedService() {
		return _loaiSPLocalService;
	}

	@Override
	public void setWrappedService(LoaiSPLocalService loaiSPLocalService) {
		_loaiSPLocalService = loaiSPLocalService;
	}

	private LoaiSPLocalService _loaiSPLocalService;
}