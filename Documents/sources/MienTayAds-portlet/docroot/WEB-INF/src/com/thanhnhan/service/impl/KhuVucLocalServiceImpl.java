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

import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.thanhnhan.model.KhuVuc;
import com.thanhnhan.service.base.KhuVucLocalServiceBaseImpl;

/**
 * The implementation of the khu vuc local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.thanhnhan.service.KhuVucLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ThanhNhan
 * @see com.thanhnhan.service.base.KhuVucLocalServiceBaseImpl
 * @see com.thanhnhan.service.KhuVucLocalServiceUtil
 */
public class KhuVucLocalServiceImpl extends KhuVucLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.thanhnhan.service.KhuVucLocalServiceUtil} to access the khu vuc local service.
	 */
	/**
	 * Add new Khu vuc with KhuVuc Object
	 * 
	 * @param newKV
	 * @return
	 * @throws SystemException
	 * @author ThanhNhan
	 */
	@SuppressWarnings("deprecation")
	public KhuVuc addKhuVuc(KhuVuc newKV) throws SystemException {
		KhuVuc kv = khuVucPersistence.create(counterLocalService
				.increment(KhuVuc.class.getName()));
		kv.setKhuVucId(newKV.getKhuVucId());
		kv.setKhuVucName(newKV.getKhuVucName());
		return khuVucPersistence.update(kv, false);
	}

	/**
	 * Delete Khu Vuc by Id
	 * 
	 * @param kvId
	 * @return
	 * @throws SystemException
	 * @throws PortalException
	 * @author ThanhNhan
	 */
	public KhuVuc deleteKV(long kvId) throws SystemException, PortalException {
		KhuVuc kv = khuVucPersistence.findByPrimaryKey(kvId);
		deleteKhuVuc(kvId);
		return kv;
	}

	/**
	 * Delete Khu Vuc by KhuVuc Object
	 * 
	 * @param kv
	 * @return
	 * @throws SystemException
	 * @throws PortalException
	 * @author ThanhNhan
	 */
	public KhuVuc deleteKV(KhuVuc kv) throws SystemException, PortalException {
		khuVucPersistence.remove(kv);
		return kv;
	}

	/**
	 * Get all KhuVuc
	 * 
	 * @return
	 * @throws SystemException
	 * @author ThanhNHan
	 */
	public List<KhuVuc> getKVs() throws SystemException {
		List<KhuVuc> kvs = khuVucPersistence.findAll();
		return kvs;
	}
}