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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.thanhnhan.model.SanPham;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SanPham in entity cache.
 *
 * @author ThanhNhan
 * @see SanPham
 * @generated
 */
public class SanPhamCacheModel implements CacheModel<SanPham>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{spId=");
		sb.append(spId);
		sb.append(", spName=");
		sb.append(spName);
		sb.append(", desc=");
		sb.append(desc);
		sb.append(", nguoiDang=");
		sb.append(nguoiDang);
		sb.append(", sdt=");
		sb.append(sdt);
		sb.append(", diaChi=");
		sb.append(diaChi);
		sb.append(", gia=");
		sb.append(gia);
		sb.append(", ngayDang=");
		sb.append(ngayDang);
		sb.append(", image=");
		sb.append(image);
		sb.append(", loaiSPId=");
		sb.append(loaiSPId);
		sb.append(", khuVucId=");
		sb.append(khuVucId);
		sb.append(", passWord=");
		sb.append(passWord);
		sb.append(", loaiNguoiDung=");
		sb.append(loaiNguoiDung);
		sb.append(", loaiMuaBan=");
		sb.append(loaiMuaBan);
		sb.append(", email=");
		sb.append(email);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SanPham toEntityModel() {
		SanPhamImpl sanPhamImpl = new SanPhamImpl();

		sanPhamImpl.setSpId(spId);

		if (spName == null) {
			sanPhamImpl.setSpName(StringPool.BLANK);
		}
		else {
			sanPhamImpl.setSpName(spName);
		}

		if (desc == null) {
			sanPhamImpl.setDesc(StringPool.BLANK);
		}
		else {
			sanPhamImpl.setDesc(desc);
		}

		if (nguoiDang == null) {
			sanPhamImpl.setNguoiDang(StringPool.BLANK);
		}
		else {
			sanPhamImpl.setNguoiDang(nguoiDang);
		}

		if (sdt == null) {
			sanPhamImpl.setSdt(StringPool.BLANK);
		}
		else {
			sanPhamImpl.setSdt(sdt);
		}

		if (diaChi == null) {
			sanPhamImpl.setDiaChi(StringPool.BLANK);
		}
		else {
			sanPhamImpl.setDiaChi(diaChi);
		}

		if (gia == null) {
			sanPhamImpl.setGia(StringPool.BLANK);
		}
		else {
			sanPhamImpl.setGia(gia);
		}

		if (ngayDang == Long.MIN_VALUE) {
			sanPhamImpl.setNgayDang(null);
		}
		else {
			sanPhamImpl.setNgayDang(new Date(ngayDang));
		}

		if (image == null) {
			sanPhamImpl.setImage(StringPool.BLANK);
		}
		else {
			sanPhamImpl.setImage(image);
		}

		sanPhamImpl.setLoaiSPId(loaiSPId);
		sanPhamImpl.setKhuVucId(khuVucId);

		if (passWord == null) {
			sanPhamImpl.setPassWord(StringPool.BLANK);
		}
		else {
			sanPhamImpl.setPassWord(passWord);
		}

		sanPhamImpl.setLoaiNguoiDung(loaiNguoiDung);
		sanPhamImpl.setLoaiMuaBan(loaiMuaBan);

		if (email == null) {
			sanPhamImpl.setEmail(StringPool.BLANK);
		}
		else {
			sanPhamImpl.setEmail(email);
		}

		sanPhamImpl.resetOriginalValues();

		return sanPhamImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		spId = objectInput.readLong();
		spName = objectInput.readUTF();
		desc = objectInput.readUTF();
		nguoiDang = objectInput.readUTF();
		sdt = objectInput.readUTF();
		diaChi = objectInput.readUTF();
		gia = objectInput.readUTF();
		ngayDang = objectInput.readLong();
		image = objectInput.readUTF();
		loaiSPId = objectInput.readLong();
		khuVucId = objectInput.readLong();
		passWord = objectInput.readUTF();
		loaiNguoiDung = objectInput.readInt();
		loaiMuaBan = objectInput.readInt();
		email = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(spId);

		if (spName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(spName);
		}

		if (desc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(desc);
		}

		if (nguoiDang == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nguoiDang);
		}

		if (sdt == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sdt);
		}

		if (diaChi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(diaChi);
		}

		if (gia == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(gia);
		}

		objectOutput.writeLong(ngayDang);

		if (image == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(image);
		}

		objectOutput.writeLong(loaiSPId);
		objectOutput.writeLong(khuVucId);

		if (passWord == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(passWord);
		}

		objectOutput.writeInt(loaiNguoiDung);
		objectOutput.writeInt(loaiMuaBan);

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}
	}

	public long spId;
	public String spName;
	public String desc;
	public String nguoiDang;
	public String sdt;
	public String diaChi;
	public String gia;
	public long ngayDang;
	public String image;
	public long loaiSPId;
	public long khuVucId;
	public String passWord;
	public int loaiNguoiDung;
	public int loaiMuaBan;
	public String email;
}