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

import com.thanhnhan.model.Options;

/**
 * The persistence interface for the options service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ThanhNhan
 * @see OptionsPersistenceImpl
 * @see OptionsUtil
 * @generated
 */
public interface OptionsPersistence extends BasePersistence<Options> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OptionsUtil} to access the options persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the options in the entity cache if it is enabled.
	*
	* @param options the options
	*/
	public void cacheResult(com.thanhnhan.model.Options options);

	/**
	* Caches the optionses in the entity cache if it is enabled.
	*
	* @param optionses the optionses
	*/
	public void cacheResult(
		java.util.List<com.thanhnhan.model.Options> optionses);

	/**
	* Creates a new options with the primary key. Does not add the options to the database.
	*
	* @param id the primary key for the new options
	* @return the new options
	*/
	public com.thanhnhan.model.Options create(long id);

	/**
	* Removes the options with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the options
	* @return the options that was removed
	* @throws com.thanhnhan.NoSuchOptionsException if a options with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.thanhnhan.model.Options remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.thanhnhan.NoSuchOptionsException;

	public com.thanhnhan.model.Options updateImpl(
		com.thanhnhan.model.Options options)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the options with the primary key or throws a {@link com.thanhnhan.NoSuchOptionsException} if it could not be found.
	*
	* @param id the primary key of the options
	* @return the options
	* @throws com.thanhnhan.NoSuchOptionsException if a options with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.thanhnhan.model.Options findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.thanhnhan.NoSuchOptionsException;

	/**
	* Returns the options with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the options
	* @return the options, or <code>null</code> if a options with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.thanhnhan.model.Options fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the optionses.
	*
	* @return the optionses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.thanhnhan.model.Options> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.thanhnhan.model.Options> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.thanhnhan.model.Options> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the optionses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of optionses.
	*
	* @return the number of optionses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}