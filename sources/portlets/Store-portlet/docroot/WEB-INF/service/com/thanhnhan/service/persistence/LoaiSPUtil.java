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

import com.thanhnhan.model.LoaiSP;

import java.util.List;

/**
 * The persistence utility for the loai s p service. This utility wraps {@link LoaiSPPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ThanhNhan
 * @see LoaiSPPersistence
 * @see LoaiSPPersistenceImpl
 * @generated
 */
public class LoaiSPUtil {
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
	public static void clearCache(LoaiSP loaiSP) {
		getPersistence().clearCache(loaiSP);
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
	public static List<LoaiSP> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LoaiSP> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LoaiSP> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static LoaiSP update(LoaiSP loaiSP) throws SystemException {
		return getPersistence().update(loaiSP);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static LoaiSP update(LoaiSP loaiSP, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(loaiSP, serviceContext);
	}

	/**
	* Returns all the loai s ps where loaiSPId = &#63; and loaiSPName = &#63;.
	*
	* @param loaiSPId the loai s p ID
	* @param loaiSPName the loai s p name
	* @return the matching loai s ps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.thanhnhan.model.LoaiSP> findByLoaiSP(
		long loaiSPId, java.lang.String loaiSPName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLoaiSP(loaiSPId, loaiSPName);
	}

	/**
	* Returns a range of all the loai s ps where loaiSPId = &#63; and loaiSPName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.LoaiSPModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param loaiSPId the loai s p ID
	* @param loaiSPName the loai s p name
	* @param start the lower bound of the range of loai s ps
	* @param end the upper bound of the range of loai s ps (not inclusive)
	* @return the range of matching loai s ps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.thanhnhan.model.LoaiSP> findByLoaiSP(
		long loaiSPId, java.lang.String loaiSPName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLoaiSP(loaiSPId, loaiSPName, start, end);
	}

	/**
	* Returns an ordered range of all the loai s ps where loaiSPId = &#63; and loaiSPName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.LoaiSPModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param loaiSPId the loai s p ID
	* @param loaiSPName the loai s p name
	* @param start the lower bound of the range of loai s ps
	* @param end the upper bound of the range of loai s ps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching loai s ps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.thanhnhan.model.LoaiSP> findByLoaiSP(
		long loaiSPId, java.lang.String loaiSPName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByLoaiSP(loaiSPId, loaiSPName, start, end,
			orderByComparator);
	}

	/**
	* Returns the first loai s p in the ordered set where loaiSPId = &#63; and loaiSPName = &#63;.
	*
	* @param loaiSPId the loai s p ID
	* @param loaiSPName the loai s p name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching loai s p
	* @throws com.thanhnhan.NoSuchLoaiSPException if a matching loai s p could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.thanhnhan.model.LoaiSP findByLoaiSP_First(long loaiSPId,
		java.lang.String loaiSPName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.thanhnhan.NoSuchLoaiSPException {
		return getPersistence()
				   .findByLoaiSP_First(loaiSPId, loaiSPName, orderByComparator);
	}

	/**
	* Returns the first loai s p in the ordered set where loaiSPId = &#63; and loaiSPName = &#63;.
	*
	* @param loaiSPId the loai s p ID
	* @param loaiSPName the loai s p name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching loai s p, or <code>null</code> if a matching loai s p could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.thanhnhan.model.LoaiSP fetchByLoaiSP_First(
		long loaiSPId, java.lang.String loaiSPName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByLoaiSP_First(loaiSPId, loaiSPName, orderByComparator);
	}

	/**
	* Returns the last loai s p in the ordered set where loaiSPId = &#63; and loaiSPName = &#63;.
	*
	* @param loaiSPId the loai s p ID
	* @param loaiSPName the loai s p name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching loai s p
	* @throws com.thanhnhan.NoSuchLoaiSPException if a matching loai s p could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.thanhnhan.model.LoaiSP findByLoaiSP_Last(long loaiSPId,
		java.lang.String loaiSPName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.thanhnhan.NoSuchLoaiSPException {
		return getPersistence()
				   .findByLoaiSP_Last(loaiSPId, loaiSPName, orderByComparator);
	}

	/**
	* Returns the last loai s p in the ordered set where loaiSPId = &#63; and loaiSPName = &#63;.
	*
	* @param loaiSPId the loai s p ID
	* @param loaiSPName the loai s p name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching loai s p, or <code>null</code> if a matching loai s p could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.thanhnhan.model.LoaiSP fetchByLoaiSP_Last(long loaiSPId,
		java.lang.String loaiSPName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByLoaiSP_Last(loaiSPId, loaiSPName, orderByComparator);
	}

	/**
	* Removes all the loai s ps where loaiSPId = &#63; and loaiSPName = &#63; from the database.
	*
	* @param loaiSPId the loai s p ID
	* @param loaiSPName the loai s p name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByLoaiSP(long loaiSPId, java.lang.String loaiSPName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByLoaiSP(loaiSPId, loaiSPName);
	}

	/**
	* Returns the number of loai s ps where loaiSPId = &#63; and loaiSPName = &#63;.
	*
	* @param loaiSPId the loai s p ID
	* @param loaiSPName the loai s p name
	* @return the number of matching loai s ps
	* @throws SystemException if a system exception occurred
	*/
	public static int countByLoaiSP(long loaiSPId, java.lang.String loaiSPName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByLoaiSP(loaiSPId, loaiSPName);
	}

	/**
	* Caches the loai s p in the entity cache if it is enabled.
	*
	* @param loaiSP the loai s p
	*/
	public static void cacheResult(com.thanhnhan.model.LoaiSP loaiSP) {
		getPersistence().cacheResult(loaiSP);
	}

	/**
	* Caches the loai s ps in the entity cache if it is enabled.
	*
	* @param loaiSPs the loai s ps
	*/
	public static void cacheResult(
		java.util.List<com.thanhnhan.model.LoaiSP> loaiSPs) {
		getPersistence().cacheResult(loaiSPs);
	}

	/**
	* Creates a new loai s p with the primary key. Does not add the loai s p to the database.
	*
	* @param loaiSPId the primary key for the new loai s p
	* @return the new loai s p
	*/
	public static com.thanhnhan.model.LoaiSP create(long loaiSPId) {
		return getPersistence().create(loaiSPId);
	}

	/**
	* Removes the loai s p with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param loaiSPId the primary key of the loai s p
	* @return the loai s p that was removed
	* @throws com.thanhnhan.NoSuchLoaiSPException if a loai s p with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.thanhnhan.model.LoaiSP remove(long loaiSPId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.thanhnhan.NoSuchLoaiSPException {
		return getPersistence().remove(loaiSPId);
	}

	public static com.thanhnhan.model.LoaiSP updateImpl(
		com.thanhnhan.model.LoaiSP loaiSP)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(loaiSP);
	}

	/**
	* Returns the loai s p with the primary key or throws a {@link com.thanhnhan.NoSuchLoaiSPException} if it could not be found.
	*
	* @param loaiSPId the primary key of the loai s p
	* @return the loai s p
	* @throws com.thanhnhan.NoSuchLoaiSPException if a loai s p with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.thanhnhan.model.LoaiSP findByPrimaryKey(long loaiSPId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.thanhnhan.NoSuchLoaiSPException {
		return getPersistence().findByPrimaryKey(loaiSPId);
	}

	/**
	* Returns the loai s p with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param loaiSPId the primary key of the loai s p
	* @return the loai s p, or <code>null</code> if a loai s p with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.thanhnhan.model.LoaiSP fetchByPrimaryKey(long loaiSPId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(loaiSPId);
	}

	/**
	* Returns all the loai s ps.
	*
	* @return the loai s ps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.thanhnhan.model.LoaiSP> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.thanhnhan.model.LoaiSP> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the loai s ps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.LoaiSPModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of loai s ps
	* @param end the upper bound of the range of loai s ps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of loai s ps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.thanhnhan.model.LoaiSP> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the loai s ps from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of loai s ps.
	*
	* @return the number of loai s ps
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static LoaiSPPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LoaiSPPersistence)PortletBeanLocatorUtil.locate(com.thanhnhan.service.ClpSerializer.getServletContextName(),
					LoaiSPPersistence.class.getName());

			ReferenceRegistry.registerReference(LoaiSPUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(LoaiSPPersistence persistence) {
	}

	private static LoaiSPPersistence _persistence;
}