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

import com.thanhnhan.model.KhuVuc;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing KhuVuc in entity cache.
 *
 * @author ThanhNhan
 * @see KhuVuc
 * @generated
 */
public class KhuVucCacheModel implements CacheModel<KhuVuc>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", khuVucId=");
		sb.append(khuVucId);
		sb.append(", khuVucName=");
		sb.append(khuVucName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public KhuVuc toEntityModel() {
		KhuVucImpl khuVucImpl = new KhuVucImpl();

		khuVucImpl.setId(id);

		if (khuVucId == null) {
			khuVucImpl.setKhuVucId(StringPool.BLANK);
		}
		else {
			khuVucImpl.setKhuVucId(khuVucId);
		}

		if (khuVucName == null) {
			khuVucImpl.setKhuVucName(StringPool.BLANK);
		}
		else {
			khuVucImpl.setKhuVucName(khuVucName);
		}

		khuVucImpl.resetOriginalValues();

		return khuVucImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		khuVucId = objectInput.readUTF();
		khuVucName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (khuVucId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(khuVucId);
		}

		if (khuVucName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(khuVucName);
		}
	}

	public long id;
	public String khuVucId;
	public String khuVucName;
}