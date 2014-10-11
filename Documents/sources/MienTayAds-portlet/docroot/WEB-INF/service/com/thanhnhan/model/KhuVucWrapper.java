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
 * This class is a wrapper for {@link KhuVuc}.
 * </p>
 *
 * @author ThanhNhan
 * @see KhuVuc
 * @generated
 */
public class KhuVucWrapper implements KhuVuc, ModelWrapper<KhuVuc> {
	public KhuVucWrapper(KhuVuc khuVuc) {
		_khuVuc = khuVuc;
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

	/**
	* Returns the primary key of this khu vuc.
	*
	* @return the primary key of this khu vuc
	*/
	@Override
	public long getPrimaryKey() {
		return _khuVuc.getPrimaryKey();
	}

	/**
	* Sets the primary key of this khu vuc.
	*
	* @param primaryKey the primary key of this khu vuc
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_khuVuc.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this khu vuc.
	*
	* @return the ID of this khu vuc
	*/
	@Override
	public long getId() {
		return _khuVuc.getId();
	}

	/**
	* Sets the ID of this khu vuc.
	*
	* @param id the ID of this khu vuc
	*/
	@Override
	public void setId(long id) {
		_khuVuc.setId(id);
	}

	/**
	* Returns the khu vuc ID of this khu vuc.
	*
	* @return the khu vuc ID of this khu vuc
	*/
	@Override
	public java.lang.String getKhuVucId() {
		return _khuVuc.getKhuVucId();
	}

	/**
	* Sets the khu vuc ID of this khu vuc.
	*
	* @param khuVucId the khu vuc ID of this khu vuc
	*/
	@Override
	public void setKhuVucId(java.lang.String khuVucId) {
		_khuVuc.setKhuVucId(khuVucId);
	}

	/**
	* Returns the khu vuc name of this khu vuc.
	*
	* @return the khu vuc name of this khu vuc
	*/
	@Override
	public java.lang.String getKhuVucName() {
		return _khuVuc.getKhuVucName();
	}

	/**
	* Sets the khu vuc name of this khu vuc.
	*
	* @param khuVucName the khu vuc name of this khu vuc
	*/
	@Override
	public void setKhuVucName(java.lang.String khuVucName) {
		_khuVuc.setKhuVucName(khuVucName);
	}

	@Override
	public boolean isNew() {
		return _khuVuc.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_khuVuc.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _khuVuc.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_khuVuc.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _khuVuc.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _khuVuc.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_khuVuc.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _khuVuc.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_khuVuc.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_khuVuc.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_khuVuc.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new KhuVucWrapper((KhuVuc)_khuVuc.clone());
	}

	@Override
	public int compareTo(com.thanhnhan.model.KhuVuc khuVuc) {
		return _khuVuc.compareTo(khuVuc);
	}

	@Override
	public int hashCode() {
		return _khuVuc.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.thanhnhan.model.KhuVuc> toCacheModel() {
		return _khuVuc.toCacheModel();
	}

	@Override
	public com.thanhnhan.model.KhuVuc toEscapedModel() {
		return new KhuVucWrapper(_khuVuc.toEscapedModel());
	}

	@Override
	public com.thanhnhan.model.KhuVuc toUnescapedModel() {
		return new KhuVucWrapper(_khuVuc.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _khuVuc.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _khuVuc.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_khuVuc.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KhuVucWrapper)) {
			return false;
		}

		KhuVucWrapper khuVucWrapper = (KhuVucWrapper)obj;

		if (Validator.equals(_khuVuc, khuVucWrapper._khuVuc)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public KhuVuc getWrappedKhuVuc() {
		return _khuVuc;
	}

	@Override
	public KhuVuc getWrappedModel() {
		return _khuVuc;
	}

	@Override
	public void resetOriginalValues() {
		_khuVuc.resetOriginalValues();
	}

	private KhuVuc _khuVuc;
}