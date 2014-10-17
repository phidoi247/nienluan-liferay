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
 * Provides a wrapper for {@link SanPhamLocalService}.
 *
 * @author ThanhNhan
 * @see SanPhamLocalService
 * @generated
 */
public class SanPhamLocalServiceWrapper implements SanPhamLocalService,
	ServiceWrapper<SanPhamLocalService> {
	public SanPhamLocalServiceWrapper(SanPhamLocalService sanPhamLocalService) {
		_sanPhamLocalService = sanPhamLocalService;
	}

	/**
	* Adds the san pham to the database. Also notifies the appropriate model listeners.
	*
	* @param sanPham the san pham
	* @return the san pham that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thanhnhan.model.SanPham addSanPham(
		com.thanhnhan.model.SanPham sanPham)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sanPhamLocalService.addSanPham(sanPham);
	}

	/**
	* Creates a new san pham with the primary key. Does not add the san pham to the database.
	*
	* @param spId the primary key for the new san pham
	* @return the new san pham
	*/
	@Override
	public com.thanhnhan.model.SanPham createSanPham(long spId) {
		return _sanPhamLocalService.createSanPham(spId);
	}

	/**
	* Deletes the san pham with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param spId the primary key of the san pham
	* @return the san pham that was removed
	* @throws PortalException if a san pham with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thanhnhan.model.SanPham deleteSanPham(long spId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sanPhamLocalService.deleteSanPham(spId);
	}

	/**
	* Deletes the san pham from the database. Also notifies the appropriate model listeners.
	*
	* @param sanPham the san pham
	* @return the san pham that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thanhnhan.model.SanPham deleteSanPham(
		com.thanhnhan.model.SanPham sanPham)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sanPhamLocalService.deleteSanPham(sanPham);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sanPhamLocalService.dynamicQuery();
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
		return _sanPhamLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.SanPhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _sanPhamLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.SanPhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _sanPhamLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _sanPhamLocalService.dynamicQueryCount(dynamicQuery);
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
		return _sanPhamLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.thanhnhan.model.SanPham fetchSanPham(long spId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sanPhamLocalService.fetchSanPham(spId);
	}

	/**
	* Returns the san pham with the primary key.
	*
	* @param spId the primary key of the san pham
	* @return the san pham
	* @throws PortalException if a san pham with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thanhnhan.model.SanPham getSanPham(long spId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sanPhamLocalService.getSanPham(spId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sanPhamLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the san phams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.SanPhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of san phams
	* @param end the upper bound of the range of san phams (not inclusive)
	* @return the range of san phams
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.thanhnhan.model.SanPham> getSanPhams(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _sanPhamLocalService.getSanPhams(start, end);
	}

	/**
	* Returns the number of san phams.
	*
	* @return the number of san phams
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getSanPhamsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sanPhamLocalService.getSanPhamsCount();
	}

	/**
	* Updates the san pham in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sanPham the san pham
	* @return the san pham that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thanhnhan.model.SanPham updateSanPham(
		com.thanhnhan.model.SanPham sanPham)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sanPhamLocalService.updateSanPham(sanPham);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _sanPhamLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sanPhamLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sanPhamLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* AddSP method
	* return 1 SanPham Object
	*/
	@Override
	public com.thanhnhan.model.SanPham addSP(com.thanhnhan.model.SanPham newSP)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sanPhamLocalService.addSP(newSP);
	}

	@Override
	public java.util.List<com.thanhnhan.model.SanPham> getSanPhams()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sanPhamLocalService.getSanPhams();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public SanPhamLocalService getWrappedSanPhamLocalService() {
		return _sanPhamLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedSanPhamLocalService(
		SanPhamLocalService sanPhamLocalService) {
		_sanPhamLocalService = sanPhamLocalService;
	}

	@Override
	public SanPhamLocalService getWrappedService() {
		return _sanPhamLocalService;
	}

	@Override
	public void setWrappedService(SanPhamLocalService sanPhamLocalService) {
		_sanPhamLocalService = sanPhamLocalService;
	}

	private SanPhamLocalService _sanPhamLocalService;
}