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
 * Provides a wrapper for {@link OptionsLocalService}.
 *
 * @author ThanhNhan
 * @see OptionsLocalService
 * @generated
 */
public class OptionsLocalServiceWrapper implements OptionsLocalService,
	ServiceWrapper<OptionsLocalService> {
	public OptionsLocalServiceWrapper(OptionsLocalService optionsLocalService) {
		_optionsLocalService = optionsLocalService;
	}

	/**
	* Adds the options to the database. Also notifies the appropriate model listeners.
	*
	* @param options the options
	* @return the options that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thanhnhan.model.Options addOptions(
		com.thanhnhan.model.Options options)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _optionsLocalService.addOptions(options);
	}

	/**
	* Creates a new options with the primary key. Does not add the options to the database.
	*
	* @param id the primary key for the new options
	* @return the new options
	*/
	@Override
	public com.thanhnhan.model.Options createOptions(long id) {
		return _optionsLocalService.createOptions(id);
	}

	/**
	* Deletes the options with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the options
	* @return the options that was removed
	* @throws PortalException if a options with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thanhnhan.model.Options deleteOptions(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _optionsLocalService.deleteOptions(id);
	}

	/**
	* Deletes the options from the database. Also notifies the appropriate model listeners.
	*
	* @param options the options
	* @return the options that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thanhnhan.model.Options deleteOptions(
		com.thanhnhan.model.Options options)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _optionsLocalService.deleteOptions(options);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _optionsLocalService.dynamicQuery();
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
		return _optionsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.OptionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _optionsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.OptionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _optionsLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _optionsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _optionsLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.thanhnhan.model.Options fetchOptions(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _optionsLocalService.fetchOptions(id);
	}

	/**
	* Returns the options with the primary key.
	*
	* @param id the primary key of the options
	* @return the options
	* @throws PortalException if a options with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thanhnhan.model.Options getOptions(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _optionsLocalService.getOptions(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _optionsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the optionses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.OptionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of optionses
	* @param end the upper bound of the range of optionses (not inclusive)
	* @return the range of optionses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.thanhnhan.model.Options> getOptionses(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _optionsLocalService.getOptionses(start, end);
	}

	/**
	* Returns the number of optionses.
	*
	* @return the number of optionses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getOptionsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _optionsLocalService.getOptionsesCount();
	}

	/**
	* Updates the options in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param options the options
	* @return the options that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thanhnhan.model.Options updateOptions(
		com.thanhnhan.model.Options options)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _optionsLocalService.updateOptions(options);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _optionsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_optionsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _optionsLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public OptionsLocalService getWrappedOptionsLocalService() {
		return _optionsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedOptionsLocalService(
		OptionsLocalService optionsLocalService) {
		_optionsLocalService = optionsLocalService;
	}

	@Override
	public OptionsLocalService getWrappedService() {
		return _optionsLocalService;
	}

	@Override
	public void setWrappedService(OptionsLocalService optionsLocalService) {
		_optionsLocalService = optionsLocalService;
	}

	private OptionsLocalService _optionsLocalService;
}