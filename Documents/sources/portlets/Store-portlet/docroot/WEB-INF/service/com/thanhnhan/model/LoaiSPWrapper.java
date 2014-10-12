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
 * This class is a wrapper for {@link LoaiSP}.
 * </p>
 *
 * @author ThanhNhan
 * @see LoaiSP
 * @generated
 */
public class LoaiSPWrapper implements LoaiSP, ModelWrapper<LoaiSP> {
	public LoaiSPWrapper(LoaiSP loaiSP) {
		_loaiSP = loaiSP;
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

	/**
	* Returns the primary key of this loai s p.
	*
	* @return the primary key of this loai s p
	*/
	@Override
	public long getPrimaryKey() {
		return _loaiSP.getPrimaryKey();
	}

	/**
	* Sets the primary key of this loai s p.
	*
	* @param primaryKey the primary key of this loai s p
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_loaiSP.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the loai s p ID of this loai s p.
	*
	* @return the loai s p ID of this loai s p
	*/
	@Override
	public long getLoaiSPId() {
		return _loaiSP.getLoaiSPId();
	}

	/**
	* Sets the loai s p ID of this loai s p.
	*
	* @param loaiSPId the loai s p ID of this loai s p
	*/
	@Override
	public void setLoaiSPId(long loaiSPId) {
		_loaiSP.setLoaiSPId(loaiSPId);
	}

	/**
	* Returns the loai s p name of this loai s p.
	*
	* @return the loai s p name of this loai s p
	*/
	@Override
	public java.lang.String getLoaiSPName() {
		return _loaiSP.getLoaiSPName();
	}

	/**
	* Sets the loai s p name of this loai s p.
	*
	* @param loaiSPName the loai s p name of this loai s p
	*/
	@Override
	public void setLoaiSPName(java.lang.String loaiSPName) {
		_loaiSP.setLoaiSPName(loaiSPName);
	}

	@Override
	public boolean isNew() {
		return _loaiSP.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_loaiSP.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _loaiSP.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_loaiSP.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _loaiSP.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _loaiSP.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_loaiSP.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _loaiSP.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_loaiSP.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_loaiSP.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_loaiSP.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LoaiSPWrapper((LoaiSP)_loaiSP.clone());
	}

	@Override
	public int compareTo(LoaiSP loaiSP) {
		return _loaiSP.compareTo(loaiSP);
	}

	@Override
	public int hashCode() {
		return _loaiSP.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<LoaiSP> toCacheModel() {
		return _loaiSP.toCacheModel();
	}

	@Override
	public LoaiSP toEscapedModel() {
		return new LoaiSPWrapper(_loaiSP.toEscapedModel());
	}

	@Override
	public LoaiSP toUnescapedModel() {
		return new LoaiSPWrapper(_loaiSP.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _loaiSP.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _loaiSP.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_loaiSP.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LoaiSPWrapper)) {
			return false;
		}

		LoaiSPWrapper loaiSPWrapper = (LoaiSPWrapper)obj;

		if (Validator.equals(_loaiSP, loaiSPWrapper._loaiSP)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public LoaiSP getWrappedLoaiSP() {
		return _loaiSP;
	}

	@Override
	public LoaiSP getWrappedModel() {
		return _loaiSP;
	}

	@Override
	public void resetOriginalValues() {
		_loaiSP.resetOriginalValues();
	}

	private LoaiSP _loaiSP;
}