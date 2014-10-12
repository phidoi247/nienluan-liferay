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
import com.thanhnhan.service.KhuVucLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ThanhNhan
 */
public class KhuVucClp extends BaseModelImpl<KhuVuc> implements KhuVuc {
	public KhuVucClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return KhuVuc.class;
	}

	@Override
	public String getModelClassName() {
		return KhuVuc.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("khuVucId", getKhuVucId());
		attributes.put("khuVucName", getKhuVucName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String khuVucId = (String)attributes.get("khuVucId");

		if (khuVucId != null) {
			setKhuVucId(khuVucId);
		}

		String khuVucName = (String)attributes.get("khuVucName");

		if (khuVucName != null) {
			setKhuVucName(khuVucName);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_khuVucRemoteModel != null) {
			try {
				Class<?> clazz = _khuVucRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_khuVucRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKhuVucId() {
		return _khuVucId;
	}

	@Override
	public void setKhuVucId(String khuVucId) {
		_khuVucId = khuVucId;

		if (_khuVucRemoteModel != null) {
			try {
				Class<?> clazz = _khuVucRemoteModel.getClass();

				Method method = clazz.getMethod("setKhuVucId", String.class);

				method.invoke(_khuVucRemoteModel, khuVucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKhuVucName() {
		return _khuVucName;
	}

	@Override
	public void setKhuVucName(String khuVucName) {
		_khuVucName = khuVucName;

		if (_khuVucRemoteModel != null) {
			try {
				Class<?> clazz = _khuVucRemoteModel.getClass();

				Method method = clazz.getMethod("setKhuVucName", String.class);

				method.invoke(_khuVucRemoteModel, khuVucName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getKhuVucRemoteModel() {
		return _khuVucRemoteModel;
	}

	public void setKhuVucRemoteModel(BaseModel<?> khuVucRemoteModel) {
		_khuVucRemoteModel = khuVucRemoteModel;
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

		Class<?> remoteModelClass = _khuVucRemoteModel.getClass();

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

		Object returnValue = method.invoke(_khuVucRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			KhuVucLocalServiceUtil.addKhuVuc(this);
		}
		else {
			KhuVucLocalServiceUtil.updateKhuVuc(this);
		}
	}

	@Override
	public KhuVuc toEscapedModel() {
		return (KhuVuc)ProxyUtil.newProxyInstance(KhuVuc.class.getClassLoader(),
			new Class[] { KhuVuc.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		KhuVucClp clone = new KhuVucClp();

		clone.setId(getId());
		clone.setKhuVucId(getKhuVucId());
		clone.setKhuVucName(getKhuVucName());

		return clone;
	}

	@Override
	public int compareTo(KhuVuc khuVuc) {
		long primaryKey = khuVuc.getPrimaryKey();

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

		if (!(obj instanceof KhuVucClp)) {
			return false;
		}

		KhuVucClp khuVuc = (KhuVucClp)obj;

		long primaryKey = khuVuc.getPrimaryKey();

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
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", khuVucId=");
		sb.append(getKhuVucId());
		sb.append(", khuVucName=");
		sb.append(getKhuVucName());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.thanhnhan.model.KhuVuc");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>khuVucId</column-name><column-value><![CDATA[");
		sb.append(getKhuVucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>khuVucName</column-name><column-value><![CDATA[");
		sb.append(getKhuVucName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _khuVucId;
	private String _khuVucName;
	private BaseModel<?> _khuVucRemoteModel;
}