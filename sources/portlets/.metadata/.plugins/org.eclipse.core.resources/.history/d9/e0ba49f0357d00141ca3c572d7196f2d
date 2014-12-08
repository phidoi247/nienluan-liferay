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

import com.thanhnhan.model.TNOptions;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TNOptions in entity cache.
 *
 * @author ThanhNhan
 * @see TNOptions
 * @generated
 */
public class TNOptionsCacheModel implements CacheModel<TNOptions>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", option_name=");
		sb.append(option_name);
		sb.append(", value=");
		sb.append(value);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TNOptions toEntityModel() {
		TNOptionsImpl tnOptionsImpl = new TNOptionsImpl();

		tnOptionsImpl.setId(id);

		if (option_name == null) {
			tnOptionsImpl.setOption_name(StringPool.BLANK);
		}
		else {
			tnOptionsImpl.setOption_name(option_name);
		}

		if (value == null) {
			tnOptionsImpl.setValue(StringPool.BLANK);
		}
		else {
			tnOptionsImpl.setValue(value);
		}

		tnOptionsImpl.resetOriginalValues();

		return tnOptionsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		option_name = objectInput.readUTF();
		value = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (option_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(option_name);
		}

		if (value == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(value);
		}
	}

	public long id;
	public String option_name;
	public String value;
}