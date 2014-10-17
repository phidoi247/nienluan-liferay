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

import com.thanhnhan.model.SanPham;

import java.util.List;

/**
 * The persistence utility for the san pham service. This utility wraps {@link SanPhamPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ThanhNhan
 * @see SanPhamPersistence
 * @see SanPhamPersistenceImpl
 * @generated
 */
public class SanPhamUtil {
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
	public static void clearCache(SanPham sanPham) {
		getPersistence().clearCache(sanPham);
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
	public static List<SanPham> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SanPham> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SanPham> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static SanPham update(SanPham sanPham) throws SystemException {
		return getPersistence().update(sanPham);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static SanPham update(SanPham sanPham, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(sanPham, serviceContext);
	}

	/**
	* Caches the san pham in the entity cache if it is enabled.
	*
	* @param sanPham the san pham
	*/
	public static void cacheResult(com.thanhnhan.model.SanPham sanPham) {
		getPersistence().cacheResult(sanPham);
	}

	/**
	* Caches the san phams in the entity cache if it is enabled.
	*
	* @param sanPhams the san phams
	*/
	public static void cacheResult(
		java.util.List<com.thanhnhan.model.SanPham> sanPhams) {
		getPersistence().cacheResult(sanPhams);
	}

	/**
	* Creates a new san pham with the primary key. Does not add the san pham to the database.
	*
	* @param spId the primary key for the new san pham
	* @return the new san pham
	*/
	public static com.thanhnhan.model.SanPham create(long spId) {
		return getPersistence().create(spId);
	}

	/**
	* Removes the san pham with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param spId the primary key of the san pham
	* @return the san pham that was removed
	* @throws com.thanhnhan.NoSuchSanPhamException if a san pham with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.thanhnhan.model.SanPham remove(long spId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.thanhnhan.NoSuchSanPhamException {
		return getPersistence().remove(spId);
	}

	public static com.thanhnhan.model.SanPham updateImpl(
		com.thanhnhan.model.SanPham sanPham)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(sanPham);
	}

	/**
	* Returns the san pham with the primary key or throws a {@link com.thanhnhan.NoSuchSanPhamException} if it could not be found.
	*
	* @param spId the primary key of the san pham
	* @return the san pham
	* @throws com.thanhnhan.NoSuchSanPhamException if a san pham with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.thanhnhan.model.SanPham findByPrimaryKey(long spId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.thanhnhan.NoSuchSanPhamException {
		return getPersistence().findByPrimaryKey(spId);
	}

	/**
	* Returns the san pham with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param spId the primary key of the san pham
	* @return the san pham, or <code>null</code> if a san pham with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.thanhnhan.model.SanPham fetchByPrimaryKey(long spId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(spId);
	}

	/**
	* Returns all the san phams.
	*
	* @return the san phams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.thanhnhan.model.SanPham> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.thanhnhan.model.SanPham> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the san phams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.SanPhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of san phams
	* @param end the upper bound of the range of san phams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of san phams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.thanhnhan.model.SanPham> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the san phams from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of san phams.
	*
	* @return the number of san phams
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SanPhamPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SanPhamPersistence)PortletBeanLocatorUtil.locate(com.thanhnhan.service.ClpSerializer.getServletContextName(),
					SanPhamPersistence.class.getName());

			ReferenceRegistry.registerReference(SanPhamUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(SanPhamPersistence persistence) {
	}

	private static SanPhamPersistence _persistence;
}