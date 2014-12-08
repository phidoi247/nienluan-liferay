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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.thanhnhan.service.http.SanPhamServiceSoap}.
 *
 * @author ThanhNhan
 * @see com.thanhnhan.service.http.SanPhamServiceSoap
 * @generated
 */
public class SanPhamSoap implements Serializable {
	public static SanPhamSoap toSoapModel(SanPham model) {
		SanPhamSoap soapModel = new SanPhamSoap();

		soapModel.setSpId(model.getSpId());
		soapModel.setSpName(model.getSpName());
		soapModel.setDesc(model.getDesc());
		soapModel.setNguoiDang(model.getNguoiDang());
		soapModel.setSdt(model.getSdt());
		soapModel.setDiaChi(model.getDiaChi());
		soapModel.setGia(model.getGia());
		soapModel.setNgayDang(model.getNgayDang());
		soapModel.setImage(model.getImage());
		soapModel.setLoaiSPId(model.getLoaiSPId());
		soapModel.setPassWord(model.getPassWord());
		soapModel.setLoaiNguoiDung(model.getLoaiNguoiDung());
		soapModel.setLoaiMuaBan(model.getLoaiMuaBan());
		soapModel.setEmail(model.getEmail());
		soapModel.setKVid(model.getKVid());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static SanPhamSoap[] toSoapModels(SanPham[] models) {
		SanPhamSoap[] soapModels = new SanPhamSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SanPhamSoap[][] toSoapModels(SanPham[][] models) {
		SanPhamSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SanPhamSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SanPhamSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SanPhamSoap[] toSoapModels(List<SanPham> models) {
		List<SanPhamSoap> soapModels = new ArrayList<SanPhamSoap>(models.size());

		for (SanPham model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SanPhamSoap[soapModels.size()]);
	}

	public SanPhamSoap() {
	}

	public long getPrimaryKey() {
		return _spId;
	}

	public void setPrimaryKey(long pk) {
		setSpId(pk);
	}

	public long getSpId() {
		return _spId;
	}

	public void setSpId(long spId) {
		_spId = spId;
	}

	public String getSpName() {
		return _spName;
	}

	public void setSpName(String spName) {
		_spName = spName;
	}

	public String getDesc() {
		return _desc;
	}

	public void setDesc(String desc) {
		_desc = desc;
	}

	public String getNguoiDang() {
		return _nguoiDang;
	}

	public void setNguoiDang(String nguoiDang) {
		_nguoiDang = nguoiDang;
	}

	public String getSdt() {
		return _sdt;
	}

	public void setSdt(String sdt) {
		_sdt = sdt;
	}

	public String getDiaChi() {
		return _diaChi;
	}

	public void setDiaChi(String diaChi) {
		_diaChi = diaChi;
	}

	public String getGia() {
		return _gia;
	}

	public void setGia(String gia) {
		_gia = gia;
	}

	public Date getNgayDang() {
		return _ngayDang;
	}

	public void setNgayDang(Date ngayDang) {
		_ngayDang = ngayDang;
	}

	public String getImage() {
		return _image;
	}

	public void setImage(String image) {
		_image = image;
	}

	public long getLoaiSPId() {
		return _loaiSPId;
	}

	public void setLoaiSPId(long loaiSPId) {
		_loaiSPId = loaiSPId;
	}

	public String getPassWord() {
		return _passWord;
	}

	public void setPassWord(String passWord) {
		_passWord = passWord;
	}

	public int getLoaiNguoiDung() {
		return _loaiNguoiDung;
	}

	public void setLoaiNguoiDung(int loaiNguoiDung) {
		_loaiNguoiDung = loaiNguoiDung;
	}

	public int getLoaiMuaBan() {
		return _loaiMuaBan;
	}

	public void setLoaiMuaBan(int loaiMuaBan) {
		_loaiMuaBan = loaiMuaBan;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public long getKVid() {
		return _kVid;
	}

	public void setKVid(long kVid) {
		_kVid = kVid;
	}

	public int getStatus() {
		return _Status;
	}

	public void setStatus(int Status) {
		_Status = Status;
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
	private String _passWord;
	private int _loaiNguoiDung;
	private int _loaiMuaBan;
	private String _email;
	private long _kVid;
	private int _Status;
}