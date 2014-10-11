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

package com.thanhnhan.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.thanhnhan.model.SanPham;
import com.thanhnhan.model.SanPhamModel;
import com.thanhnhan.model.SanPhamSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the SanPham service. Represents a row in the &quot;MienTayAds_SanPham&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.thanhnhan.model.SanPhamModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SanPhamImpl}.
 * </p>
 *
 * @author ThanhNhan
 * @see SanPhamImpl
 * @see com.thanhnhan.model.SanPham
 * @see com.thanhnhan.model.SanPhamModel
 * @generated
 */
@JSON(strict = true)
public class SanPhamModelImpl extends BaseModelImpl<SanPham>
	implements SanPhamModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a san pham model instance should use the {@link com.thanhnhan.model.SanPham} interface instead.
	 */
	public static final String TABLE_NAME = "MienTayAds_SanPham";
	public static final Object[][] TABLE_COLUMNS = {
			{ "spId", Types.BIGINT },
			{ "spName", Types.VARCHAR },
			{ "desc_", Types.VARCHAR },
			{ "nguoiDang", Types.VARCHAR },
			{ "sdt", Types.VARCHAR },
			{ "diaChi", Types.VARCHAR },
			{ "gia", Types.VARCHAR },
			{ "ngayDang", Types.TIMESTAMP },
			{ "image", Types.VARCHAR },
			{ "loaiSPId", Types.BIGINT },
			{ "khuVucId", Types.BIGINT },
			{ "passWord", Types.VARCHAR },
			{ "loaiNguoiDung", Types.INTEGER },
			{ "loaiMuaBan", Types.INTEGER },
			{ "email", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table MienTayAds_SanPham (spId LONG not null primary key,spName VARCHAR(75) null,desc_ VARCHAR(75) null,nguoiDang VARCHAR(75) null,sdt VARCHAR(75) null,diaChi VARCHAR(75) null,gia VARCHAR(75) null,ngayDang DATE null,image VARCHAR(75) null,loaiSPId LONG,khuVucId LONG,passWord VARCHAR(75) null,loaiNguoiDung INTEGER,loaiMuaBan INTEGER,email VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table MienTayAds_SanPham";
	public static final String ORDER_BY_JPQL = " ORDER BY sanPham.spId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY MienTayAds_SanPham.spId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.thanhnhan.model.SanPham"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.thanhnhan.model.SanPham"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static SanPham toModel(SanPhamSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		SanPham model = new SanPhamImpl();

		model.setSpId(soapModel.getSpId());
		model.setSpName(soapModel.getSpName());
		model.setDesc(soapModel.getDesc());
		model.setNguoiDang(soapModel.getNguoiDang());
		model.setSdt(soapModel.getSdt());
		model.setDiaChi(soapModel.getDiaChi());
		model.setGia(soapModel.getGia());
		model.setNgayDang(soapModel.getNgayDang());
		model.setImage(soapModel.getImage());
		model.setLoaiSPId(soapModel.getLoaiSPId());
		model.setKhuVucId(soapModel.getKhuVucId());
		model.setPassWord(soapModel.getPassWord());
		model.setLoaiNguoiDung(soapModel.getLoaiNguoiDung());
		model.setLoaiMuaBan(soapModel.getLoaiMuaBan());
		model.setEmail(soapModel.getEmail());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<SanPham> toModels(SanPhamSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<SanPham> models = new ArrayList<SanPham>(soapModels.length);

		for (SanPhamSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.thanhnhan.model.SanPham"));

	public SanPhamModelImpl() {
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

	@JSON
	@Override
	public long getSpId() {
		return _spId;
	}

	@Override
	public void setSpId(long spId) {
		_spId = spId;
	}

	@JSON
	@Override
	public String getSpName() {
		if (_spName == null) {
			return StringPool.BLANK;
		}
		else {
			return _spName;
		}
	}

	@Override
	public void setSpName(String spName) {
		_spName = spName;
	}

	@JSON
	@Override
	public String getDesc() {
		if (_desc == null) {
			return StringPool.BLANK;
		}
		else {
			return _desc;
		}
	}

	@Override
	public void setDesc(String desc) {
		_desc = desc;
	}

	@JSON
	@Override
	public String getNguoiDang() {
		if (_nguoiDang == null) {
			return StringPool.BLANK;
		}
		else {
			return _nguoiDang;
		}
	}

	@Override
	public void setNguoiDang(String nguoiDang) {
		_nguoiDang = nguoiDang;
	}

	@JSON
	@Override
	public String getSdt() {
		if (_sdt == null) {
			return StringPool.BLANK;
		}
		else {
			return _sdt;
		}
	}

	@Override
	public void setSdt(String sdt) {
		_sdt = sdt;
	}

	@JSON
	@Override
	public String getDiaChi() {
		if (_diaChi == null) {
			return StringPool.BLANK;
		}
		else {
			return _diaChi;
		}
	}

	@Override
	public void setDiaChi(String diaChi) {
		_diaChi = diaChi;
	}

	@JSON
	@Override
	public String getGia() {
		if (_gia == null) {
			return StringPool.BLANK;
		}
		else {
			return _gia;
		}
	}

	@Override
	public void setGia(String gia) {
		_gia = gia;
	}

	@JSON
	@Override
	public Date getNgayDang() {
		return _ngayDang;
	}

	@Override
	public void setNgayDang(Date ngayDang) {
		_ngayDang = ngayDang;
	}

	@JSON
	@Override
	public String getImage() {
		if (_image == null) {
			return StringPool.BLANK;
		}
		else {
			return _image;
		}
	}

	@Override
	public void setImage(String image) {
		_image = image;
	}

	@JSON
	@Override
	public long getLoaiSPId() {
		return _loaiSPId;
	}

	@Override
	public void setLoaiSPId(long loaiSPId) {
		_loaiSPId = loaiSPId;
	}

	@JSON
	@Override
	public long getKhuVucId() {
		return _khuVucId;
	}

	@Override
	public void setKhuVucId(long khuVucId) {
		_khuVucId = khuVucId;
	}

	@JSON
	@Override
	public String getPassWord() {
		if (_passWord == null) {
			return StringPool.BLANK;
		}
		else {
			return _passWord;
		}
	}

	@Override
	public void setPassWord(String passWord) {
		_passWord = passWord;
	}

	@JSON
	@Override
	public int getLoaiNguoiDung() {
		return _loaiNguoiDung;
	}

	@Override
	public void setLoaiNguoiDung(int loaiNguoiDung) {
		_loaiNguoiDung = loaiNguoiDung;
	}

	@JSON
	@Override
	public int getLoaiMuaBan() {
		return _loaiMuaBan;
	}

	@Override
	public void setLoaiMuaBan(int loaiMuaBan) {
		_loaiMuaBan = loaiMuaBan;
	}

	@JSON
	@Override
	public String getEmail() {
		if (_email == null) {
			return StringPool.BLANK;
		}
		else {
			return _email;
		}
	}

	@Override
	public void setEmail(String email) {
		_email = email;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			SanPham.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SanPham toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (SanPham)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SanPhamImpl sanPhamImpl = new SanPhamImpl();

		sanPhamImpl.setSpId(getSpId());
		sanPhamImpl.setSpName(getSpName());
		sanPhamImpl.setDesc(getDesc());
		sanPhamImpl.setNguoiDang(getNguoiDang());
		sanPhamImpl.setSdt(getSdt());
		sanPhamImpl.setDiaChi(getDiaChi());
		sanPhamImpl.setGia(getGia());
		sanPhamImpl.setNgayDang(getNgayDang());
		sanPhamImpl.setImage(getImage());
		sanPhamImpl.setLoaiSPId(getLoaiSPId());
		sanPhamImpl.setKhuVucId(getKhuVucId());
		sanPhamImpl.setPassWord(getPassWord());
		sanPhamImpl.setLoaiNguoiDung(getLoaiNguoiDung());
		sanPhamImpl.setLoaiMuaBan(getLoaiMuaBan());
		sanPhamImpl.setEmail(getEmail());

		sanPhamImpl.resetOriginalValues();

		return sanPhamImpl;
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

		if (!(obj instanceof SanPham)) {
			return false;
		}

		SanPham sanPham = (SanPham)obj;

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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<SanPham> toCacheModel() {
		SanPhamCacheModel sanPhamCacheModel = new SanPhamCacheModel();

		sanPhamCacheModel.spId = getSpId();

		sanPhamCacheModel.spName = getSpName();

		String spName = sanPhamCacheModel.spName;

		if ((spName != null) && (spName.length() == 0)) {
			sanPhamCacheModel.spName = null;
		}

		sanPhamCacheModel.desc = getDesc();

		String desc = sanPhamCacheModel.desc;

		if ((desc != null) && (desc.length() == 0)) {
			sanPhamCacheModel.desc = null;
		}

		sanPhamCacheModel.nguoiDang = getNguoiDang();

		String nguoiDang = sanPhamCacheModel.nguoiDang;

		if ((nguoiDang != null) && (nguoiDang.length() == 0)) {
			sanPhamCacheModel.nguoiDang = null;
		}

		sanPhamCacheModel.sdt = getSdt();

		String sdt = sanPhamCacheModel.sdt;

		if ((sdt != null) && (sdt.length() == 0)) {
			sanPhamCacheModel.sdt = null;
		}

		sanPhamCacheModel.diaChi = getDiaChi();

		String diaChi = sanPhamCacheModel.diaChi;

		if ((diaChi != null) && (diaChi.length() == 0)) {
			sanPhamCacheModel.diaChi = null;
		}

		sanPhamCacheModel.gia = getGia();

		String gia = sanPhamCacheModel.gia;

		if ((gia != null) && (gia.length() == 0)) {
			sanPhamCacheModel.gia = null;
		}

		Date ngayDang = getNgayDang();

		if (ngayDang != null) {
			sanPhamCacheModel.ngayDang = ngayDang.getTime();
		}
		else {
			sanPhamCacheModel.ngayDang = Long.MIN_VALUE;
		}

		sanPhamCacheModel.image = getImage();

		String image = sanPhamCacheModel.image;

		if ((image != null) && (image.length() == 0)) {
			sanPhamCacheModel.image = null;
		}

		sanPhamCacheModel.loaiSPId = getLoaiSPId();

		sanPhamCacheModel.khuVucId = getKhuVucId();

		sanPhamCacheModel.passWord = getPassWord();

		String passWord = sanPhamCacheModel.passWord;

		if ((passWord != null) && (passWord.length() == 0)) {
			sanPhamCacheModel.passWord = null;
		}

		sanPhamCacheModel.loaiNguoiDung = getLoaiNguoiDung();

		sanPhamCacheModel.loaiMuaBan = getLoaiMuaBan();

		sanPhamCacheModel.email = getEmail();

		String email = sanPhamCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			sanPhamCacheModel.email = null;
		}

		return sanPhamCacheModel;
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

	private static ClassLoader _classLoader = SanPham.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			SanPham.class
		};
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
	private SanPham _escapedModel;
}