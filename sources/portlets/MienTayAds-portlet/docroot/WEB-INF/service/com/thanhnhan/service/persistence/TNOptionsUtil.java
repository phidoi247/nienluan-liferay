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

import com.thanhnhan.model.TNOptions;

import java.util.List;

/**
 * The persistence utility for the t n options service. This utility wraps {@link TNOptionsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ThanhNhan
 * @see TNOptionsPersistence
 * @see TNOptionsPersistenceImpl
 * @generated
 */
public class TNOptionsUtil {
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
	public static void clearCache(TNOptions tnOptions) {
		getPersistence().clearCache(tnOptions);
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
	public static List<TNOptions> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TNOptions> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TNOptions> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TNOptions update(TNOptions tnOptions)
		throws SystemException {
		return getPersistence().update(tnOptions);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TNOptions update(TNOptions tnOptions,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(tnOptions, serviceContext);
	}

	/**
	* Returns the t n options where id = &#63; or throws a {@link com.thanhnhan.NoSuchTNOptionsException} if it could not be found.
	*
	* @param id the ID
	* @return the matching t n options
	* @throws com.thanhnhan.NoSuchTNOptionsException if a matching t n options could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.thanhnhan.model.TNOptions findByid(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.thanhnhan.NoSuchTNOptionsException {
		return getPersistence().findByid(id);
	}

	/**
	* Returns the t n options where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param id the ID
	* @return the matching t n options, or <code>null</code> if a matching t n options could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.thanhnhan.model.TNOptions fetchByid(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByid(id);
	}

	/**
	* Returns the t n options where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param id the ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching t n options, or <code>null</code> if a matching t n options could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.thanhnhan.model.TNOptions fetchByid(long id,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByid(id, retrieveFromCache);
	}

	/**
	* Removes the t n options where id = &#63; from the database.
	*
	* @param id the ID
	* @return the t n options that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.thanhnhan.model.TNOptions removeByid(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.thanhnhan.NoSuchTNOptionsException {
		return getPersistence().removeByid(id);
	}

	/**
	* Returns the number of t n optionses where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching t n optionses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByid(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByid(id);
	}

	/**
	* Caches the t n options in the entity cache if it is enabled.
	*
	* @param tnOptions the t n options
	*/
	public static void cacheResult(com.thanhnhan.model.TNOptions tnOptions) {
		getPersistence().cacheResult(tnOptions);
	}

	/**
	* Caches the t n optionses in the entity cache if it is enabled.
	*
	* @param tnOptionses the t n optionses
	*/
	public static void cacheResult(
		java.util.List<com.thanhnhan.model.TNOptions> tnOptionses) {
		getPersistence().cacheResult(tnOptionses);
	}

	/**
	* Creates a new t n options with the primary key. Does not add the t n options to the database.
	*
	* @param id the primary key for the new t n options
	* @return the new t n options
	*/
	public static com.thanhnhan.model.TNOptions create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the t n options with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the t n options
	* @return the t n options that was removed
	* @throws com.thanhnhan.NoSuchTNOptionsException if a t n options with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.thanhnhan.model.TNOptions remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.thanhnhan.NoSuchTNOptionsException {
		return getPersistence().remove(id);
	}

	public static com.thanhnhan.model.TNOptions updateImpl(
		com.thanhnhan.model.TNOptions tnOptions)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tnOptions);
	}

	/**
	* Returns the t n options with the primary key or throws a {@link com.thanhnhan.NoSuchTNOptionsException} if it could not be found.
	*
	* @param id the primary key of the t n options
	* @return the t n options
	* @throws com.thanhnhan.NoSuchTNOptionsException if a t n options with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.thanhnhan.model.TNOptions findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.thanhnhan.NoSuchTNOptionsException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the t n options with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the t n options
	* @return the t n options, or <code>null</code> if a t n options with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.thanhnhan.model.TNOptions fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the t n optionses.
	*
	* @return the t n optionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.thanhnhan.model.TNOptions> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.thanhnhan.model.TNOptions> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the t n optionses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.TNOptionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of t n optionses
	* @param end the upper bound of the range of t n optionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of t n optionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.thanhnhan.model.TNOptions> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the t n optionses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of t n optionses.
	*
	* @return the number of t n optionses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TNOptionsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TNOptionsPersistence)PortletBeanLocatorUtil.locate(com.thanhnhan.service.ClpSerializer.getServletContextName(),
					TNOptionsPersistence.class.getName());

			ReferenceRegistry.registerReference(TNOptionsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TNOptionsPersistence persistence) {
	}

	private static TNOptionsPersistence _persistence;
}