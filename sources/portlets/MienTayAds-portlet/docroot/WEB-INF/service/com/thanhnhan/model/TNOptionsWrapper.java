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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TNOptions}.
 * </p>
 *
 * @author ThanhNhan
 * @see TNOptions
 * @generated
 */
public class TNOptionsWrapper implements TNOptions, ModelWrapper<TNOptions> {
	public TNOptionsWrapper(TNOptions tnOptions) {
		_tnOptions = tnOptions;
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

	/**
	* Returns the primary key of this t n options.
	*
	* @return the primary key of this t n options
	*/
	@Override
	public long getPrimaryKey() {
		return _tnOptions.getPrimaryKey();
	}

	/**
	* Sets the primary key of this t n options.
	*
	* @param primaryKey the primary key of this t n options
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tnOptions.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this t n options.
	*
	* @return the ID of this t n options
	*/
	@Override
	public long getId() {
		return _tnOptions.getId();
	}

	/**
	* Sets the ID of this t n options.
	*
	* @param id the ID of this t n options
	*/
	@Override
	public void setId(long id) {
		_tnOptions.setId(id);
	}

	/**
	* Returns the option_name of this t n options.
	*
	* @return the option_name of this t n options
	*/
	@Override
	public java.lang.String getOption_name() {
		return _tnOptions.getOption_name();
	}

	/**
	* Sets the option_name of this t n options.
	*
	* @param option_name the option_name of this t n options
	*/
	@Override
	public void setOption_name(java.lang.String option_name) {
		_tnOptions.setOption_name(option_name);
	}

	/**
	* Returns the value of this t n options.
	*
	* @return the value of this t n options
	*/
	@Override
	public java.lang.String getValue() {
		return _tnOptions.getValue();
	}

	/**
	* Sets the value of this t n options.
	*
	* @param value the value of this t n options
	*/
	@Override
	public void setValue(java.lang.String value) {
		_tnOptions.setValue(value);
	}

	@Override
	public boolean isNew() {
		return _tnOptions.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tnOptions.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tnOptions.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tnOptions.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tnOptions.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tnOptions.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tnOptions.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tnOptions.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tnOptions.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tnOptions.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tnOptions.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TNOptionsWrapper((TNOptions)_tnOptions.clone());
	}

	@Override
	public int compareTo(com.thanhnhan.model.TNOptions tnOptions) {
		return _tnOptions.compareTo(tnOptions);
	}

	@Override
	public int hashCode() {
		return _tnOptions.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.thanhnhan.model.TNOptions> toCacheModel() {
		return _tnOptions.toCacheModel();
	}

	@Override
	public com.thanhnhan.model.TNOptions toEscapedModel() {
		return new TNOptionsWrapper(_tnOptions.toEscapedModel());
	}

	@Override
	public com.thanhnhan.model.TNOptions toUnescapedModel() {
		return new TNOptionsWrapper(_tnOptions.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tnOptions.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tnOptions.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tnOptions.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TNOptionsWrapper)) {
			return false;
		}

		TNOptionsWrapper tnOptionsWrapper = (TNOptionsWrapper)obj;

		if (Validator.equals(_tnOptions, tnOptionsWrapper._tnOptions)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TNOptions getWrappedTNOptions() {
		return _tnOptions;
	}

	@Override
	public TNOptions getWrappedModel() {
		return _tnOptions;
	}

	@Override
	public void resetOriginalValues() {
		_tnOptions.resetOriginalValues();
	}

	private TNOptions _tnOptions;
}