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

package com.thanhnhan.service.impl;

import com.liferay.portal.SystemException;
import com.thanhnhan.NoSuchOptionsException;
import com.thanhnhan.NoSuchTNOptionsException;
import com.thanhnhan.model.TNOptions;
import com.thanhnhan.service.base.TNOptionsLocalServiceBaseImpl;

/**
 * The implementation of the t n options local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.thanhnhan.service.TNOptionsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author ThanhNhan
 * @see com.thanhnhan.service.base.TNOptionsLocalServiceBaseImpl
 * @see com.thanhnhan.service.TNOptionsLocalServiceUtil
 */
public class TNOptionsLocalServiceImpl extends TNOptionsLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * com.thanhnhan.service.TNOptionsLocalServiceUtil} to access the t n
	 * options local service.
	 * Option from Store
	 */
	public TNOptions getOption(int id) {
		TNOptions op = null;

		try {
			op = tnOptionsPersistence.findByPrimaryKey(id);
		} catch (NoSuchTNOptionsException
				| com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
		}

		return op;
	}
}