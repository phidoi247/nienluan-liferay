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

package com.thanhnhan.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.thanhnhan.model.Options;

import java.util.List;

/**
 * The persistence utility for the options service. This utility wraps {@link OptionsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ThanhNhan
 * @see OptionsPersistence
 * @see OptionsPersistenceImpl
 * @generated
 */
public class OptionsUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Options options) {
		getPersistence().clearCache(options);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Options> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Options> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Options> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Options update(Options options) throws SystemException {
		return getPersistence().update(options);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Options update(Options options, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(options, serviceContext);
	}

	/**
	* Caches the options in the entity cache if it is enabled.
	*
	* @param options the options
	*/
	public static void cacheResult(com.thanhnhan.model.Options options) {
		getPersistence().cacheResult(options);
	}

	/**
	* Caches the optionses in the entity cache if it is enabled.
	*
	* @param optionses the optionses
	*/
	public static void cacheResult(
		java.util.List<com.thanhnhan.model.Options> optionses) {
		getPersistence().cacheResult(optionses);
	}

	/**
	* Creates a new options with the primary key. Does not add the options to the database.
	*
	* @param id the primary key for the new options
	* @return the new options
	*/
	public static com.thanhnhan.model.Options create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the options with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the options
	* @return the options that was removed
	* @throws com.thanhnhan.NoSuchOptionsException if a options with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.thanhnhan.model.Options remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.thanhnhan.NoSuchOptionsException {
		return getPersistence().remove(id);
	}

	public static com.thanhnhan.model.Options updateImpl(
		com.thanhnhan.model.Options options)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(options);
	}

	/**
	* Returns the options with the primary key or throws a {@link com.thanhnhan.NoSuchOptionsException} if it could not be found.
	*
	* @param id the primary key of the options
	* @return the options
	* @throws com.thanhnhan.NoSuchOptionsException if a options with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.thanhnhan.model.Options findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.thanhnhan.NoSuchOptionsException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the options with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the options
	* @return the options, or <code>null</code> if a options with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.thanhnhan.model.Options fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the optionses.
	*
	* @return the optionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.thanhnhan.model.Options> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.thanhnhan.model.Options> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the optionses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.OptionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of optionses
	* @param end the upper bound of the range of optionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of optionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.thanhnhan.model.Options> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the optionses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of optionses.
	*
	* @return the number of optionses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static OptionsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (OptionsPersistence)PortletBeanLocatorUtil.locate(com.thanhnhan.service.ClpSerializer.getServletContextName(),
					OptionsPersistence.class.getName());

			ReferenceRegistry.registerReference(OptionsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(OptionsPersistence persistence) {
	}

	private static OptionsPersistence _persistence;
}