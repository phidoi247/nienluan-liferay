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
 * Provides a wrapper for {@link TNOptionsLocalService}.
 *
 * @author ThanhNhan
 * @see TNOptionsLocalService
 * @generated
 */
public class TNOptionsLocalServiceWrapper implements TNOptionsLocalService,
	ServiceWrapper<TNOptionsLocalService> {
	public TNOptionsLocalServiceWrapper(
		TNOptionsLocalService tnOptionsLocalService) {
		_tnOptionsLocalService = tnOptionsLocalService;
	}

	/**
	* Adds the t n options to the database. Also notifies the appropriate model listeners.
	*
	* @param tnOptions the t n options
	* @return the t n options that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thanhnhan.model.TNOptions addTNOptions(
		com.thanhnhan.model.TNOptions tnOptions)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tnOptionsLocalService.addTNOptions(tnOptions);
	}

	/**
	* Creates a new t n options with the primary key. Does not add the t n options to the database.
	*
	* @param id the primary key for the new t n options
	* @return the new t n options
	*/
	@Override
	public com.thanhnhan.model.TNOptions createTNOptions(long id) {
		return _tnOptionsLocalService.createTNOptions(id);
	}

	/**
	* Deletes the t n options with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the t n options
	* @return the t n options that was removed
	* @throws PortalException if a t n options with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thanhnhan.model.TNOptions deleteTNOptions(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tnOptionsLocalService.deleteTNOptions(id);
	}

	/**
	* Deletes the t n options from the database. Also notifies the appropriate model listeners.
	*
	* @param tnOptions the t n options
	* @return the t n options that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thanhnhan.model.TNOptions deleteTNOptions(
		com.thanhnhan.model.TNOptions tnOptions)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tnOptionsLocalService.deleteTNOptions(tnOptions);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tnOptionsLocalService.dynamicQuery();
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
		return _tnOptionsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.TNOptionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tnOptionsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.TNOptionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tnOptionsLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _tnOptionsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tnOptionsLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.thanhnhan.model.TNOptions fetchTNOptions(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tnOptionsLocalService.fetchTNOptions(id);
	}

	/**
	* Returns the t n options with the primary key.
	*
	* @param id the primary key of the t n options
	* @return the t n options
	* @throws PortalException if a t n options with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thanhnhan.model.TNOptions getTNOptions(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tnOptionsLocalService.getTNOptions(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tnOptionsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the t n optionses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.TNOptionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of t n optionses
	* @param end the upper bound of the range of t n optionses (not inclusive)
	* @return the range of t n optionses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.thanhnhan.model.TNOptions> getTNOptionses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tnOptionsLocalService.getTNOptionses(start, end);
	}

	/**
	* Returns the number of t n optionses.
	*
	* @return the number of t n optionses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTNOptionsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tnOptionsLocalService.getTNOptionsesCount();
	}

	/**
	* Updates the t n options in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tnOptions the t n options
	* @return the t n options that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thanhnhan.model.TNOptions updateTNOptions(
		com.thanhnhan.model.TNOptions tnOptions)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tnOptionsLocalService.updateTNOptions(tnOptions);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tnOptionsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tnOptionsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tnOptionsLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public com.thanhnhan.model.TNOptions getOption(int id) {
		return _tnOptionsLocalService.getOption(id);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TNOptionsLocalService getWrappedTNOptionsLocalService() {
		return _tnOptionsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTNOptionsLocalService(
		TNOptionsLocalService tnOptionsLocalService) {
		_tnOptionsLocalService = tnOptionsLocalService;
	}

	@Override
	public TNOptionsLocalService getWrappedService() {
		return _tnOptionsLocalService;
	}

	@Override
	public void setWrappedService(TNOptionsLocalService tnOptionsLocalService) {
		_tnOptionsLocalService = tnOptionsLocalService;
	}

	private TNOptionsLocalService _tnOptionsLocalService;
}