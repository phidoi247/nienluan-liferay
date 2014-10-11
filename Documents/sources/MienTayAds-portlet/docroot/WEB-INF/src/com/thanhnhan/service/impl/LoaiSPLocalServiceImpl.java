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
import com.thanhnhan.model.LoaiSP;
import com.thanhnhan.service.base.LoaiSPLocalServiceBaseImpl;

/**
 * The implementation of the loai s p local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.thanhnhan.service.LoaiSPLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author ThanhNhan
 * @see com.thanhnhan.service.base.LoaiSPLocalServiceBaseImpl
 * @see com.thanhnhan.service.LoaiSPLocalServiceUtil
 */
public class LoaiSPLocalServiceImpl extends LoaiSPLocalServiceBaseImpl {
	/**
	 * Them loai san pham khoi CSDL
	 * @param newLoaiSP
	 * @param userid
	 * @return
	 * @throws SystemException
	 */
	public LoaiSP addLoaiSP(LoaiSP newLoaiSP)
			throws SystemException {
		LoaiSP loai = loaiSPPersistence.create(counterLocalService
				.increment(LoaiSP.class.getName()));
		loai.setLoaiSPId(newLoaiSP.getLoaiSPId());
		loai.setLoaiSPName(newLoaiSP.getLoaiSPName());
		return loaiSPPersistence.update(loai,false);
	}
	
	
	public LoaiSP deleteLoaiSP(long loaiSPId) throws SystemException,PortalException{
		LoaiSP loai = loaiSPPersistence.findByPrimaryKey(loaiSPId);
		deleteLoaiSP(loai);
		return loai;
	}
	
	public LoaiSP deleteLoaiSP(LoaiSP loai) throws SystemException{
		loaiSPPersistence.remove(loai);
		return loai;
	}
	/**
	 * getAllLoais lấy tất cả loại sp 
	 * @return
	 * @throws SystemException
	 */
	public List<LoaiSP> getAllLoais() throws SystemException{
		List<LoaiSP> loais = loaiSPPersistence.findAll();
		return loais;
	}
}