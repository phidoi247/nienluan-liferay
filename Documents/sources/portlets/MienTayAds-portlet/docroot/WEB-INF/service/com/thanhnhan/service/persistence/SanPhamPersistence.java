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

import com.liferay.portal.service.persistence.BasePersistence;

import com.thanhnhan.model.SanPham;

/**
 * The persistence interface for the san pham service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ThanhNhan
 * @see SanPhamPersistenceImpl
 * @see SanPhamUtil
 * @generated
 */
public interface SanPhamPersistence extends BasePersistence<SanPham> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SanPhamUtil} to access the san pham persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the san pham in the entity cache if it is enabled.
	*
	* @param sanPham the san pham
	*/
	public void cacheResult(com.thanhnhan.model.SanPham sanPham);

	/**
	* Caches the san phams in the entity cache if it is enabled.
	*
	* @param sanPhams the san phams
	*/
	public void cacheResult(
		java.util.List<com.thanhnhan.model.SanPham> sanPhams);

	/**
	* Creates a new san pham with the primary key. Does not add the san pham to the database.
	*
	* @param spId the primary key for the new san pham
	* @return the new san pham
	*/
	public com.thanhnhan.model.SanPham create(long spId);

	/**
	* Removes the san pham with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param spId the primary key of the san pham
	* @return the san pham that was removed
	* @throws com.thanhnhan.NoSuchSanPhamException if a san pham with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.thanhnhan.model.SanPham remove(long spId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.thanhnhan.NoSuchSanPhamException;

	public com.thanhnhan.model.SanPham updateImpl(
		com.thanhnhan.model.SanPham sanPham)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the san pham with the primary key or throws a {@link com.thanhnhan.NoSuchSanPhamException} if it could not be found.
	*
	* @param spId the primary key of the san pham
	* @return the san pham
	* @throws com.thanhnhan.NoSuchSanPhamException if a san pham with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.thanhnhan.model.SanPham findByPrimaryKey(long spId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.thanhnhan.NoSuchSanPhamException;

	/**
	* Returns the san pham with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param spId the primary key of the san pham
	* @return the san pham, or <code>null</code> if a san pham with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.thanhnhan.model.SanPham fetchByPrimaryKey(long spId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the san phams.
	*
	* @return the san phams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.thanhnhan.model.SanPham> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.thanhnhan.model.SanPham> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.thanhnhan.model.SanPham> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the san phams from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of san phams.
	*
	* @return the number of san phams
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}