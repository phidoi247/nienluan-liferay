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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.thanhnhan.service.ClpSerializer;
import com.thanhnhan.service.SanPhamLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ThanhNhan
 */
public class SanPhamClp extends BaseModelImpl<SanPham> implements SanPham {
	public SanPhamClp() {
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
	public long getPrimaryKey() {
		return _spId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSpId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _spId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getSpId() {
		return _spId;
	}

	@Override
	public void setSpId(long spId) {
		_spId = spId;

		if (_sanPhamRemoteModel != null) {
			try {
				Class<?> clazz = _sanPhamRemoteModel.getClass();

				Method method = clazz.getMethod("setSpId", long.class);

				method.invoke(_sanPhamRemoteModel, spId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSpName() {
		return _spName;
	}

	@Override
	public void setSpName(String spName) {
		_spName = spName;

		if (_sanPhamRemoteModel != null) {
			try {
				Class<?> clazz = _sanPhamRemoteModel.getClass();

				Method method = clazz.getMethod("setSpName", String.class);

				method.invoke(_sanPhamRemoteModel, spName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDesc() {
		return _desc;
	}

	@Override
	public void setDesc(String desc) {
		_desc = desc;

		if (_sanPhamRemoteModel != null) {
			try {
				Class<?> clazz = _sanPhamRemoteModel.getClass();

				Method method = clazz.getMethod("setDesc", String.class);

				method.invoke(_sanPhamRemoteModel, desc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNguoiDang() {
		return _nguoiDang;
	}

	@Override
	public void setNguoiDang(String nguoiDang) {
		_nguoiDang = nguoiDang;

		if (_sanPhamRemoteModel != null) {
			try {
				Class<?> clazz = _sanPhamRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiDang", String.class);

				method.invoke(_sanPhamRemoteModel, nguoiDang);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSdt() {
		return _sdt;
	}

	@Override
	public void setSdt(String sdt) {
		_sdt = sdt;

		if (_sanPhamRemoteModel != null) {
			try {
				Class<?> clazz = _sanPhamRemoteModel.getClass();

				Method method = clazz.getMethod("setSdt", String.class);

				method.invoke(_sanPhamRemoteModel, sdt);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDiaChi() {
		return _diaChi;
	}

	@Override
	public void setDiaChi(String diaChi) {
		_diaChi = diaChi;

		if (_sanPhamRemoteModel != null) {
			try {
				Class<?> clazz = _sanPhamRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChi", String.class);

				method.invoke(_sanPhamRemoteModel, diaChi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGia() {
		return _gia;
	}

	@Override
	public void setGia(String gia) {
		_gia = gia;

		if (_sanPhamRemoteModel != null) {
			try {
				Class<?> clazz = _sanPhamRemoteModel.getClass();

				Method method = clazz.getMethod("setGia", String.class);

				method.invoke(_sanPhamRemoteModel, gia);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayDang() {
		return _ngayDang;
	}

	@Override
	public void setNgayDang(Date ngayDang) {
		_ngayDang = ngayDang;

		if (_sanPhamRemoteModel != null) {
			try {
				Class<?> clazz = _sanPhamRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayDang", Date.class);

				method.invoke(_sanPhamRemoteModel, ngayDang);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImage() {
		return _image;
	}

	@Override
	public void setImage(String image) {
		_image = image;

		if (_sanPhamRemoteModel != null) {
			try {
				Class<?> clazz = _sanPhamRemoteModel.getClass();

				Method method = clazz.getMethod("setImage", String.class);

				method.invoke(_sanPhamRemoteModel, image);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLoaiSPId() {
		return _loaiSPId;
	}

	@Override
	public void setLoaiSPId(long loaiSPId) {
		_loaiSPId = loaiSPId;

		if (_sanPhamRemoteModel != null) {
			try {
				Class<?> clazz = _sanPhamRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiSPId", long.class);

				method.invoke(_sanPhamRemoteModel, loaiSPId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getKhuVucId() {
		return _khuVucId;
	}

	@Override
	public void setKhuVucId(long khuVucId) {
		_khuVucId = khuVucId;

		if (_sanPhamRemoteModel != null) {
			try {
				Class<?> clazz = _sanPhamRemoteModel.getClass();

				Method method = clazz.getMethod("setKhuVucId", long.class);

				method.invoke(_sanPhamRemoteModel, khuVucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPassWord() {
		return _passWord;
	}

	@Override
	public void setPassWord(String passWord) {
		_passWord = passWord;

		if (_sanPhamRemoteModel != null) {
			try {
				Class<?> clazz = _sanPhamRemoteModel.getClass();

				Method method = clazz.getMethod("setPassWord", String.class);

				method.invoke(_sanPhamRemoteModel, passWord);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLoaiNguoiDung() {
		return _loaiNguoiDung;
	}

	@Override
	public void setLoaiNguoiDung(int loaiNguoiDung) {
		_loaiNguoiDung = loaiNguoiDung;

		if (_sanPhamRemoteModel != null) {
			try {
				Class<?> clazz = _sanPhamRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiNguoiDung", int.class);

				method.invoke(_sanPhamRemoteModel, loaiNguoiDung);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLoaiMuaBan() {
		return _loaiMuaBan;
	}

	@Override
	public void setLoaiMuaBan(int loaiMuaBan) {
		_loaiMuaBan = loaiMuaBan;

		if (_sanPhamRemoteModel != null) {
			try {
				Class<?> clazz = _sanPhamRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiMuaBan", int.class);

				method.invoke(_sanPhamRemoteModel, loaiMuaBan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmail() {
		return _email;
	}

	@Override
	public void setEmail(String email) {
		_email = email;

		if (_sanPhamRemoteModel != null) {
			try {
				Class<?> clazz = _sanPhamRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_sanPhamRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getSanPhamRemoteModel() {
		return _sanPhamRemoteModel;
	}

	public void setSanPhamRemoteModel(BaseModel<?> sanPhamRemoteModel) {
		_sanPhamRemoteModel = sanPhamRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _sanPhamRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_sanPhamRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			SanPhamLocalServiceUtil.addSanPham(this);
		}
		else {
			SanPhamLocalServiceUtil.updateSanPham(this);
		}
	}

	@Override
	public SanPham toEscapedModel() {
		return (SanPham)ProxyUtil.newProxyInstance(SanPham.class.getClassLoader(),
			new Class[] { SanPham.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SanPhamClp clone = new SanPhamClp();

		clone.setSpId(getSpId());
		clone.setSpName(getSpName());
		clone.setDesc(getDesc());
		clone.setNguoiDang(getNguoiDang());
		clone.setSdt(getSdt());
		clone.setDiaChi(getDiaChi());
		clone.setGia(getGia());
		clone.setNgayDang(getNgayDang());
		clone.setImage(getImage());
		clone.setLoaiSPId(getLoaiSPId());
		clone.setKhuVucId(getKhuVucId());
		clone.setPassWord(getPassWord());
		clone.setLoaiNguoiDung(getLoaiNguoiDung());
		clone.setLoaiMuaBan(getLoaiMuaBan());
		clone.setEmail(getEmail());

		return clone;
	}

	@Override
	public int compareTo(SanPham sanPham) {
		long primaryKey = sanPham.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SanPhamClp)) {
			return false;
		}

		SanPhamClp sanPham = (SanPhamClp)obj;

		long primaryKey = sanPham.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{spId=");
		sb.append(getSpId());
		sb.append(", spName=");
		sb.append(getSpName());
		sb.append(", desc=");
		sb.append(getDesc());
		sb.append(", nguoiDang=");
		sb.append(getNguoiDang());
		sb.append(", sdt=");
		sb.append(getSdt());
		sb.append(", diaChi=");
		sb.append(getDiaChi());
		sb.append(", gia=");
		sb.append(getGia());
		sb.append(", ngayDang=");
		sb.append(getNgayDang());
		sb.append(", image=");
		sb.append(getImage());
		sb.append(", loaiSPId=");
		sb.append(getLoaiSPId());
		sb.append(", khuVucId=");
		sb.append(getKhuVucId());
		sb.append(", passWord=");
		sb.append(getPassWord());
		sb.append(", loaiNguoiDung=");
		sb.append(getLoaiNguoiDung());
		sb.append(", loaiMuaBan=");
		sb.append(getLoaiMuaBan());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("com.thanhnhan.model.SanPham");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>spId</column-name><column-value><![CDATA[");
		sb.append(getSpId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>spName</column-name><column-value><![CDATA[");
		sb.append(getSpName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>desc</column-name><column-value><![CDATA[");
		sb.append(getDesc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiDang</column-name><column-value><![CDATA[");
		sb.append(getNguoiDang());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sdt</column-name><column-value><![CDATA[");
		sb.append(getSdt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diaChi</column-name><column-value><![CDATA[");
		sb.append(getDiaChi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gia</column-name><column-value><![CDATA[");
		sb.append(getGia());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayDang</column-name><column-value><![CDATA[");
		sb.append(getNgayDang());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>image</column-name><column-value><![CDATA[");
		sb.append(getImage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiSPId</column-name><column-value><![CDATA[");
		sb.append(getLoaiSPId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>khuVucId</column-name><column-value><![CDATA[");
		sb.append(getKhuVucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passWord</column-name><column-value><![CDATA[");
		sb.append(getPassWord());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiNguoiDung</column-name><column-value><![CDATA[");
		sb.append(getLoaiNguoiDung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiMuaBan</column-name><column-value><![CDATA[");
		sb.append(getLoaiMuaBan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _spId;
	private String _spName;
	private String _desc;
	private String _nguoiDang;
	private String _sdt;
	private String _diaChi;
	private String _gia;
	private Date _ngayDang;
	private String _image;
	private long _loaiSPId;
	private long _khuVucId;
	private String _passWord;
	private int _loaiNguoiDung;
	private int _loaiMuaBan;
	private String _email;
	private BaseModel<?> _sanPhamRemoteModel;
}