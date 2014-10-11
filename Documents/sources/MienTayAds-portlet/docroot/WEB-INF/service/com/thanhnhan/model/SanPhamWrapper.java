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

package com.thanhnhan.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SanPham}.
 * </p>
 *
 * @author ThanhNhan
 * @see SanPham
 * @generated
 */
public class SanPhamWrapper implements SanPham, ModelWrapper<SanPham> {
	public SanPhamWrapper(SanPham sanPham) {
		_sanPham = sanPham;
	}

	@Override
	public Class<?> getModelClass() {
		return SanPham.class;
	}

	@Override
	public String getModelClassName() {
		return SanPham.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("spId", getSpId());
		attributes.put("spName", getSpName());
		attributes.put("desc", getDesc());
		attributes.put("nguoiDang", getNguoiDang());
		attributes.put("sdt", getSdt());
		attributes.put("diaChi", getDiaChi());
		attributes.put("gia", getGia());
		attributes.put("ngayDang", getNgayDang());
		attributes.put("image", getImage());
		attributes.put("loaiSPId", getLoaiSPId());
		attributes.put("khuVucId", getKhuVucId());
		attributes.put("passWord", getPassWord());
		attributes.put("loaiNguoiDung", getLoaiNguoiDung());
		attributes.put("loaiMuaBan", getLoaiMuaBan());
		attributes.put("email", getEmail());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long spId = (Long)attributes.get("spId");

		if (spId != null) {
			setSpId(spId);
		}

		String spName = (String)attributes.get("spName");

		if (spName != null) {
			setSpName(spName);
		}

		String desc = (String)attributes.get("desc");

		if (desc != null) {
			setDesc(desc);
		}

		String nguoiDang = (String)attributes.get("nguoiDang");

		if (nguoiDang != null) {
			setNguoiDang(nguoiDang);
		}

		String sdt = (String)attributes.get("sdt");

		if (sdt != null) {
			setSdt(sdt);
		}

		String diaChi = (String)attributes.get("diaChi");

		if (diaChi != null) {
			setDiaChi(diaChi);
		}

		String gia = (String)attributes.get("gia");

		if (gia != null) {
			setGia(gia);
		}

		Date ngayDang = (Date)attributes.get("ngayDang");

		if (ngayDang != null) {
			setNgayDang(ngayDang);
		}

		String image = (String)attributes.get("image");

		if (image != null) {
			setImage(image);
		}

		Long loaiSPId = (Long)attributes.get("loaiSPId");

		if (loaiSPId != null) {
			setLoaiSPId(loaiSPId);
		}

		Long khuVucId = (Long)attributes.get("khuVucId");

		if (khuVucId != null) {
			setKhuVucId(khuVucId);
		}

		String passWord = (String)attributes.get("passWord");

		if (passWord != null) {
			setPassWord(passWord);
		}

		Integer loaiNguoiDung = (Integer)attributes.get("loaiNguoiDung");

		if (loaiNguoiDung != null) {
			setLoaiNguoiDung(loaiNguoiDung);
		}

		Integer loaiMuaBan = (Integer)attributes.get("loaiMuaBan");

		if (loaiMuaBan != null) {
			setLoaiMuaBan(loaiMuaBan);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}
	}

	/**
	* Returns the primary key of this san pham.
	*
	* @return the primary key of this san pham
	*/
	@Override
	public long getPrimaryKey() {
		return _sanPham.getPrimaryKey();
	}

	/**
	* Sets the primary key of this san pham.
	*
	* @param primaryKey the primary key of this san pham
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_sanPham.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the sp ID of this san pham.
	*
	* @return the sp ID of this san pham
	*/
	@Override
	public long getSpId() {
		return _sanPham.getSpId();
	}

	/**
	* Sets the sp ID of this san pham.
	*
	* @param spId the sp ID of this san pham
	*/
	@Override
	public void setSpId(long spId) {
		_sanPham.setSpId(spId);
	}

	/**
	* Returns the sp name of this san pham.
	*
	* @return the sp name of this san pham
	*/
	@Override
	public java.lang.String getSpName() {
		return _sanPham.getSpName();
	}

	/**
	* Sets the sp name of this san pham.
	*
	* @param spName the sp name of this san pham
	*/
	@Override
	public void setSpName(java.lang.String spName) {
		_sanPham.setSpName(spName);
	}

	/**
	* Returns the desc of this san pham.
	*
	* @return the desc of this san pham
	*/
	@Override
	public java.lang.String getDesc() {
		return _sanPham.getDesc();
	}

	/**
	* Sets the desc of this san pham.
	*
	* @param desc the desc of this san pham
	*/
	@Override
	public void setDesc(java.lang.String desc) {
		_sanPham.setDesc(desc);
	}

	/**
	* Returns the nguoi dang of this san pham.
	*
	* @return the nguoi dang of this san pham
	*/
	@Override
	public java.lang.String getNguoiDang() {
		return _sanPham.getNguoiDang();
	}

	/**
	* Sets the nguoi dang of this san pham.
	*
	* @param nguoiDang the nguoi dang of this san pham
	*/
	@Override
	public void setNguoiDang(java.lang.String nguoiDang) {
		_sanPham.setNguoiDang(nguoiDang);
	}

	/**
	* Returns the sdt of this san pham.
	*
	* @return the sdt of this san pham
	*/
	@Override
	public java.lang.String getSdt() {
		return _sanPham.getSdt();
	}

	/**
	* Sets the sdt of this san pham.
	*
	* @param sdt the sdt of this san pham
	*/
	@Override
	public void setSdt(java.lang.String sdt) {
		_sanPham.setSdt(sdt);
	}

	/**
	* Returns the dia chi of this san pham.
	*
	* @return the dia chi of this san pham
	*/
	@Override
	public java.lang.String getDiaChi() {
		return _sanPham.getDiaChi();
	}

	/**
	* Sets the dia chi of this san pham.
	*
	* @param diaChi the dia chi of this san pham
	*/
	@Override
	public void setDiaChi(java.lang.String diaChi) {
		_sanPham.setDiaChi(diaChi);
	}

	/**
	* Returns the gia of this san pham.
	*
	* @return the gia of this san pham
	*/
	@Override
	public java.lang.String getGia() {
		return _sanPham.getGia();
	}

	/**
	* Sets the gia of this san pham.
	*
	* @param gia the gia of this san pham
	*/
	@Override
	public void setGia(java.lang.String gia) {
		_sanPham.setGia(gia);
	}

	/**
	* Returns the ngay dang of this san pham.
	*
	* @return the ngay dang of this san pham
	*/
	@Override
	public java.util.Date getNgayDang() {
		return _sanPham.getNgayDang();
	}

	/**
	* Sets the ngay dang of this san pham.
	*
	* @param ngayDang the ngay dang of this san pham
	*/
	@Override
	public void setNgayDang(java.util.Date ngayDang) {
		_sanPham.setNgayDang(ngayDang);
	}

	/**
	* Returns the image of this san pham.
	*
	* @return the image of this san pham
	*/
	@Override
	public java.lang.String getImage() {
		return _sanPham.getImage();
	}

	/**
	* Sets the image of this san pham.
	*
	* @param image the image of this san pham
	*/
	@Override
	public void setImage(java.lang.String image) {
		_sanPham.setImage(image);
	}

	/**
	* Returns the loai s p ID of this san pham.
	*
	* @return the loai s p ID of this san pham
	*/
	@Override
	public long getLoaiSPId() {
		return _sanPham.getLoaiSPId();
	}

	/**
	* Sets the loai s p ID of this san pham.
	*
	* @param loaiSPId the loai s p ID of this san pham
	*/
	@Override
	public void setLoaiSPId(long loaiSPId) {
		_sanPham.setLoaiSPId(loaiSPId);
	}

	/**
	* Returns the khu vuc ID of this san pham.
	*
	* @return the khu vuc ID of this san pham
	*/
	@Override
	public long getKhuVucId() {
		return _sanPham.getKhuVucId();
	}

	/**
	* Sets the khu vuc ID of this san pham.
	*
	* @param khuVucId the khu vuc ID of this san pham
	*/
	@Override
	public void setKhuVucId(long khuVucId) {
		_sanPham.setKhuVucId(khuVucId);
	}

	/**
	* Returns the pass word of this san pham.
	*
	* @return the pass word of this san pham
	*/
	@Override
	public java.lang.String getPassWord() {
		return _sanPham.getPassWord();
	}

	/**
	* Sets the pass word of this san pham.
	*
	* @param passWord the pass word of this san pham
	*/
	@Override
	public void setPassWord(java.lang.String passWord) {
		_sanPham.setPassWord(passWord);
	}

	/**
	* Returns the loai nguoi dung of this san pham.
	*
	* @return the loai nguoi dung of this san pham
	*/
	@Override
	public int getLoaiNguoiDung() {
		return _sanPham.getLoaiNguoiDung();
	}

	/**
	* Sets the loai nguoi dung of this san pham.
	*
	* @param loaiNguoiDung the loai nguoi dung of this san pham
	*/
	@Override
	public void setLoaiNguoiDung(int loaiNguoiDung) {
		_sanPham.setLoaiNguoiDung(loaiNguoiDung);
	}

	/**
	* Returns the loai mua ban of this san pham.
	*
	* @return the loai mua ban of this san pham
	*/
	@Override
	public int getLoaiMuaBan() {
		return _sanPham.getLoaiMuaBan();
	}

	/**
	* Sets the loai mua ban of this san pham.
	*
	* @param loaiMuaBan the loai mua ban of this san pham
	*/
	@Override
	public void setLoaiMuaBan(int loaiMuaBan) {
		_sanPham.setLoaiMuaBan(loaiMuaBan);
	}

	/**
	* Returns the email of this san pham.
	*
	* @return the email of this san pham
	*/
	@Override
	public java.lang.String getEmail() {
		return _sanPham.getEmail();
	}

	/**
	* Sets the email of this san pham.
	*
	* @param email the email of this san pham
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_sanPham.setEmail(email);
	}

	@Override
	public boolean isNew() {
		return _sanPham.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_sanPham.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _sanPham.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_sanPham.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _sanPham.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _sanPham.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_sanPham.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _sanPham.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_sanPham.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_sanPham.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_sanPham.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SanPhamWrapper((SanPham)_sanPham.clone());
	}

	@Override
	public int compareTo(com.thanhnhan.model.SanPham sanPham) {
		return _sanPham.compareTo(sanPham);
	}

	@Override
	public int hashCode() {
		return _sanPham.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.thanhnhan.model.SanPham> toCacheModel() {
		return _sanPham.toCacheModel();
	}

	@Override
	public com.thanhnhan.model.SanPham toEscapedModel() {
		return new SanPhamWrapper(_sanPham.toEscapedModel());
	}

	@Override
	public com.thanhnhan.model.SanPham toUnescapedModel() {
		return new SanPhamWrapper(_sanPham.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _sanPham.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _sanPham.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_sanPham.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SanPhamWrapper)) {
			return false;
		}

		SanPhamWrapper sanPhamWrapper = (SanPhamWrapper)obj;

		if (Validator.equals(_sanPham, sanPhamWrapper._sanPham)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public SanPham getWrappedSanPham() {
		return _sanPham;
	}

	@Override
	public SanPham getWrappedModel() {
		return _sanPham;
	}

	@Override
	public void resetOriginalValues() {
		_sanPham.resetOriginalValues();
	}

	private SanPham _sanPham;
}