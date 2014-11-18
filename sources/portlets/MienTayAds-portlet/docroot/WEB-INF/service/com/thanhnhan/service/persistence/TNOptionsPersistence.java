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

import com.thanhnhan.model.TNOptions;

/**
 * The persistence interface for the t n options service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ThanhNhan
 * @see TNOptionsPersistenceImpl
 * @see TNOptionsUtil
 * @generated
 */
public interface TNOptionsPersistence extends BasePersistence<TNOptions> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TNOptionsUtil} to access the t n options persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the t n options where id = &#63; or throws a {@link com.thanhnhan.NoSuchTNOptionsException} if it could not be found.
	*
	* @param id the ID
	* @return the matching t n options
	* @throws com.thanhnhan.NoSuchTNOptionsException if a matching t n options could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.thanhnhan.model.TNOptions findByid(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.thanhnhan.NoSuchTNOptionsException;

	/**
	* Returns the t n options where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param id the ID
	* @return the matching t n options, or <code>null</code> if a matching t n options could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.thanhnhan.model.TNOptions fetchByid(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the t n options where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param id the ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching t n options, or <code>null</code> if a matching t n options could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.thanhnhan.model.TNOptions fetchByid(long id,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the t n options where id = &#63; from the database.
	*
	* @param id the ID
	* @return the t n options that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.thanhnhan.model.TNOptions removeByid(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.thanhnhan.NoSuchTNOptionsException;

	/**
	* Returns the number of t n optionses where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching t n optionses
	* @throws SystemException if a system exception occurred
	*/
	public int countByid(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the t n options in the entity cache if it is enabled.
	*
	* @param tnOptions the t n options
	*/
	public void cacheResult(com.thanhnhan.model.TNOptions tnOptions);

	/**
	* Caches the t n optionses in the entity cache if it is enabled.
	*
	* @param tnOptionses the t n optionses
	*/
	public void cacheResult(
		java.util.List<com.thanhnhan.model.TNOptions> tnOptionses);

	/**
	* Creates a new t n options with the primary key. Does not add the t n options to the database.
	*
	* @param id the primary key for the new t n options
	* @return the new t n options
	*/
	public com.thanhnhan.model.TNOptions create(long id);

	/**
	* Removes the t n options with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the t n options
	* @return the t n options that was removed
	* @throws com.thanhnhan.NoSuchTNOptionsException if a t n options with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.thanhnhan.model.TNOptions remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.thanhnhan.NoSuchTNOptionsException;

	public com.thanhnhan.model.TNOptions updateImpl(
		com.thanhnhan.model.TNOptions tnOptions)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the t n options with the primary key or throws a {@link com.thanhnhan.NoSuchTNOptionsException} if it could not be found.
	*
	* @param id the primary key of the t n options
	* @return the t n options
	* @throws com.thanhnhan.NoSuchTNOptionsException if a t n options with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.thanhnhan.model.TNOptions findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.thanhnhan.NoSuchTNOptionsException;

	/**
	* Returns the t n options with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the t n options
	* @return the t n options, or <code>null</code> if a t n options with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.thanhnhan.model.TNOptions fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the t n optionses.
	*
	* @return the t n optionses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.thanhnhan.model.TNOptions> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.thanhnhan.model.TNOptions> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.thanhnhan.model.TNOptions> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the t n optionses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of t n optionses.
	*
	* @return the number of t n optionses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}