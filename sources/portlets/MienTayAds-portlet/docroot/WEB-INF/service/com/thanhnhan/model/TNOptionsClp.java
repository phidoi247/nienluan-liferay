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
import com.thanhnhan.service.TNOptionsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ThanhNhan
 */
public class TNOptionsClp extends BaseModelImpl<TNOptions> implements TNOptions {
	public TNOptionsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TNOptions.class;
	}

	@Override
	public String getModelClassName() {
		return TNOptions.class.getName();
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
		attributes.put("option_name", getOption_name());
		attributes.put("value", getValue());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String option_name = (String)attributes.get("option_name");

		if (option_name != null) {
			setOption_name(option_name);
		}

		String value = (String)attributes.get("value");

		if (value != null) {
			setValue(value);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tnOptionsRemoteModel != null) {
			try {
				Class<?> clazz = _tnOptionsRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tnOptionsRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOption_name() {
		return _option_name;
	}

	@Override
	public void setOption_name(String option_name) {
		_option_name = option_name;

		if (_tnOptionsRemoteModel != null) {
			try {
				Class<?> clazz = _tnOptionsRemoteModel.getClass();

				Method method = clazz.getMethod("setOption_name", String.class);

				method.invoke(_tnOptionsRemoteModel, option_name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getValue() {
		return _value;
	}

	@Override
	public void setValue(String value) {
		_value = value;

		if (_tnOptionsRemoteModel != null) {
			try {
				Class<?> clazz = _tnOptionsRemoteModel.getClass();

				Method method = clazz.getMethod("setValue", String.class);

				method.invoke(_tnOptionsRemoteModel, value);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTNOptionsRemoteModel() {
		return _tnOptionsRemoteModel;
	}

	public void setTNOptionsRemoteModel(BaseModel<?> tnOptionsRemoteModel) {
		_tnOptionsRemoteModel = tnOptionsRemoteModel;
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

		Class<?> remoteModelClass = _tnOptionsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tnOptionsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TNOptionsLocalServiceUtil.addTNOptions(this);
		}
		else {
			TNOptionsLocalServiceUtil.updateTNOptions(this);
		}
	}

	@Override
	public TNOptions toEscapedModel() {
		return (TNOptions)ProxyUtil.newProxyInstance(TNOptions.class.getClassLoader(),
			new Class[] { TNOptions.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TNOptionsClp clone = new TNOptionsClp();

		clone.setId(getId());
		clone.setOption_name(getOption_name());
		clone.setValue(getValue());

		return clone;
	}

	@Override
	public int compareTo(TNOptions tnOptions) {
		long primaryKey = tnOptions.getPrimaryKey();

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

		if (!(obj instanceof TNOptionsClp)) {
			return false;
		}

		TNOptionsClp tnOptions = (TNOptionsClp)obj;

		long primaryKey = tnOptions.getPrimaryKey();

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
		sb.append(", option_name=");
		sb.append(getOption_name());
		sb.append(", value=");
		sb.append(getValue());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.thanhnhan.model.TNOptions");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>option_name</column-name><column-value><![CDATA[");
		sb.append(getOption_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>value</column-name><column-value><![CDATA[");
		sb.append(getValue());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _option_name;
	private String _value;
	private BaseModel<?> _tnOptionsRemoteModel;
}