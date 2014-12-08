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

import com.thanhnhan.model.LoaiSP;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing LoaiSP in entity cache.
 *
 * @author ThanhNhan
 * @see LoaiSP
 * @generated
 */
public class LoaiSPCacheModel implements CacheModel<LoaiSP>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{loaiSPId=");
		sb.append(loaiSPId);
		sb.append(", loaiSPName=");
		sb.append(loaiSPName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LoaiSP toEntityModel() {
		LoaiSPImpl loaiSPImpl = new LoaiSPImpl();

		loaiSPImpl.setLoaiSPId(loaiSPId);

		if (loaiSPName == null) {
			loaiSPImpl.setLoaiSPName(StringPool.BLANK);
		}
		else {
			loaiSPImpl.setLoaiSPName(loaiSPName);
		}

		loaiSPImpl.resetOriginalValues();

		return loaiSPImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		loaiSPId = objectInput.readLong();
		loaiSPName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(loaiSPId);

		if (loaiSPName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiSPName);
		}
	}

	public long loaiSPId;
	public String loaiSPName;
}