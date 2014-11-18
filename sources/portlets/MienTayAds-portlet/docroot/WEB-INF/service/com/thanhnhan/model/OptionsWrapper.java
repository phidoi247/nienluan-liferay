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
 * This class is a wrapper for {@link Options}.
 * </p>
 *
 * @author ThanhNhan
 * @see Options
 * @generated
 */
public class OptionsWrapper implements Options, ModelWrapper<Options> {
	public OptionsWrapper(Options options) {
		_options = options;
	}

	@Override
	public Class<?> getModelClass() {
		return Options.class;
	}

	@Override
	public String getModelClassName() {
		return Options.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("option_name", getOption_name());

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
	}

	/**
	* Returns the primary key of this options.
	*
	* @return the primary key of this options
	*/
	@Override
	public long getPrimaryKey() {
		return _options.getPrimaryKey();
	}

	/**
	* Sets the primary key of this options.
	*
	* @param primaryKey the primary key of this options
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_options.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this options.
	*
	* @return the ID of this options
	*/
	@Override
	public long getId() {
		return _options.getId();
	}

	/**
	* Sets the ID of this options.
	*
	* @param id the ID of this options
	*/
	@Override
	public void setId(long id) {
		_options.setId(id);
	}

	/**
	* Returns the option_name of this options.
	*
	* @return the option_name of this options
	*/
	@Override
	public java.lang.String getOption_name() {
		return _options.getOption_name();
	}

	/**
	* Sets the option_name of this options.
	*
	* @param option_name the option_name of this options
	*/
	@Override
	public void setOption_name(java.lang.String option_name) {
		_options.setOption_name(option_name);
	}

	@Override
	public boolean isNew() {
		return _options.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_options.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _options.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_options.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _options.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _options.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_options.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _options.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_options.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_options.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_options.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new OptionsWrapper((Options)_options.clone());
	}

	@Override
	public int compareTo(com.thanhnhan.model.Options options) {
		return _options.compareTo(options);
	}

	@Override
	public int hashCode() {
		return _options.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.thanhnhan.model.Options> toCacheModel() {
		return _options.toCacheModel();
	}

	@Override
	public com.thanhnhan.model.Options toEscapedModel() {
		return new OptionsWrapper(_options.toEscapedModel());
	}

	@Override
	public com.thanhnhan.model.Options toUnescapedModel() {
		return new OptionsWrapper(_options.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _options.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _options.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_options.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OptionsWrapper)) {
			return false;
		}

		OptionsWrapper optionsWrapper = (OptionsWrapper)obj;

		if (Validator.equals(_options, optionsWrapper._options)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Options getWrappedOptions() {
		return _options;
	}

	@Override
	public Options getWrappedModel() {
		return _options;
	}

	@Override
	public void resetOriginalValues() {
		_options.resetOriginalValues();
	}

	private Options _options;
}