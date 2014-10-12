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

package com.thanhnhan.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author ThanhNhan
 */
public class KhuVucPK implements Comparable<KhuVucPK>, Serializable {
	public long id;
	public String khuVucId;

	public KhuVucPK() {
	}

	public KhuVucPK(long id, String khuVucId) {
		this.id = id;
		this.khuVucId = khuVucId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getKhuVucId() {
		return khuVucId;
	}

	public void setKhuVucId(String khuVucId) {
		this.khuVucId = khuVucId;
	}

	@Override
	public int compareTo(KhuVucPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (id < pk.id) {
			value = -1;
		}
		else if (id > pk.id) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		value = khuVucId.compareTo(pk.khuVucId);

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KhuVucPK)) {
			return false;
		}

		KhuVucPK pk = (KhuVucPK)obj;

		if ((id == pk.id) && (khuVucId.equals(pk.khuVucId))) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(id) + String.valueOf(khuVucId)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("id");
		sb.append(StringPool.EQUAL);
		sb.append(id);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("khuVucId");
		sb.append(StringPool.EQUAL);
		sb.append(khuVucId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}