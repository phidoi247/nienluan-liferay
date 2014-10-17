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
import com.thanhnhan.service.LoaiSPLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ThanhNhan
 */
public class LoaiSPClp extends BaseModelImpl<LoaiSP> implements LoaiSP {
	public LoaiSPClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return LoaiSP.class;
	}

	@Override
	public String getModelClassName() {
		return LoaiSP.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _loaiSPId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setLoaiSPId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _loaiSPId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("loaiSPId", getLoaiSPId());
		attributes.put("loaiSPName", getLoaiSPName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long loaiSPId = (Long)attributes.get("loaiSPId");

		if (loaiSPId != null) {
			setLoaiSPId(loaiSPId);
		}

		String loaiSPName = (String)attributes.get("loaiSPName");

		if (loaiSPName != null) {
			setLoaiSPName(loaiSPName);
		}
	}

	@Override
	public long getLoaiSPId() {
		return _loaiSPId;
	}

	@Override
	public void setLoaiSPId(long loaiSPId) {
		_loaiSPId = loaiSPId;

		if (_loaiSPRemoteModel != null) {
			try {
				Class<?> clazz = _loaiSPRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiSPId", long.class);

				method.invoke(_loaiSPRemoteModel, loaiSPId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoaiSPName() {
		return _loaiSPName;
	}

	@Override
	public void setLoaiSPName(String loaiSPName) {
		_loaiSPName = loaiSPName;

		if (_loaiSPRemoteModel != null) {
			try {
				Class<?> clazz = _loaiSPRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiSPName", String.class);

				method.invoke(_loaiSPRemoteModel, loaiSPName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLoaiSPRemoteModel() {
		return _loaiSPRemoteModel;
	}

	public void setLoaiSPRemoteModel(BaseModel<?> loaiSPRemoteModel) {
		_loaiSPRemoteModel = loaiSPRemoteModel;
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

		Class<?> remoteModelClass = _loaiSPRemoteModel.getClass();

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

		Object returnValue = method.invoke(_loaiSPRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LoaiSPLocalServiceUtil.addLoaiSP(this);
		}
		else {
			LoaiSPLocalServiceUtil.updateLoaiSP(this);
		}
	}

	@Override
	public LoaiSP toEscapedModel() {
		return (LoaiSP)ProxyUtil.newProxyInstance(LoaiSP.class.getClassLoader(),
			new Class[] { LoaiSP.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LoaiSPClp clone = new LoaiSPClp();

		clone.setLoaiSPId(getLoaiSPId());
		clone.setLoaiSPName(getLoaiSPName());

		return clone;
	}

	@Override
	public int compareTo(LoaiSP loaiSP) {
		int value = 0;

		value = getLoaiSPName().compareTo(loaiSP.getLoaiSPName());

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

		if (!(obj instanceof LoaiSPClp)) {
			return false;
		}

		LoaiSPClp loaiSP = (LoaiSPClp)obj;

		long primaryKey = loaiSP.getPrimaryKey();

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
		StringBundler sb = new StringBundler(5);

		sb.append("{loaiSPId=");
		sb.append(getLoaiSPId());
		sb.append(", loaiSPName=");
		sb.append(getLoaiSPName());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.thanhnhan.model.LoaiSP");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>loaiSPId</column-name><column-value><![CDATA[");
		sb.append(getLoaiSPId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiSPName</column-name><column-value><![CDATA[");
		sb.append(getLoaiSPName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _loaiSPId;
	private String _loaiSPName;
	private BaseModel<?> _loaiSPRemoteModel;
}