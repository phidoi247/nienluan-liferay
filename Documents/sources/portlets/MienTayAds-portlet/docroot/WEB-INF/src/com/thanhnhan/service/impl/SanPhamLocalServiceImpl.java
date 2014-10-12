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

import com.liferay.portal.kernel.exception.SystemException;
import com.thanhnhan.model.SanPham;
import com.thanhnhan.service.base.SanPhamLocalServiceBaseImpl;

/**
 * The implementation of the san pham local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.thanhnhan.service.SanPhamLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author ThanhNhan
 * @see com.thanhnhan.service.base.SanPhamLocalServiceBaseImpl
 * @see com.thanhnhan.service.SanPhamLocalServiceUtil
 */
public class SanPhamLocalServiceImpl extends SanPhamLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * com.thanhnhan.service.SanPhamLocalServiceUtil} to access the san pham
	 * local service.
	 */
	/**
	 * AddSP method
	 * return 1 SanPham Object
	 */
	@SuppressWarnings("deprecation")
	public SanPham addSP(SanPham newSP) throws SystemException {
		SanPham sp = sanPhamPersistence.create(counterLocalService
				.increment(SanPham.class.getName()));
		sp.setSpName(newSP.getSpName());
		sp.setDesc(newSP.getDesc());
		sp.setNguoiDang(newSP.getNguoiDang());
		sp.setSdt(newSP.getSdt());
		sp.setDiaChi(newSP.getDiaChi());
		sp.setGia(newSP.getGia());
		sp.setNgayDang(newSP.getNgayDang());
		sp.setImage(newSP.getImage());
		sp.setLoaiSPId(newSP.getLoaiSPId());
		sp.setKhuVucId(newSP.getKhuVucId());
		sp.setPassWord(newSP.getPassWord());
		sp.setLoaiNguoiDung(newSP.getLoaiNguoiDung());
		sp.setLoaiMuaBan(newSP.getLoaiMuaBan());
		sp.setEmail(newSP.getEmail());
		return sanPhamPersistence.update(sp,false);
	}
	
	public List<SanPham> getSanPhams() throws SystemException{
		List<SanPham> SPs = sanPhamPersistence.findAll();
		return SPs;
	}
	
	public List<SanPham> getSanPhams(int start, int end) throws SystemException {
		List<SanPham> SPs = sanPhamPersistence.findAll(start, end);
		return SPs;
	}
}