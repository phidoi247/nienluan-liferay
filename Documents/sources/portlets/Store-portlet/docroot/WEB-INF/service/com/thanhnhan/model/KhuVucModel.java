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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the KhuVuc service. Represents a row in the &quot;MienTayAds_KhuVuc&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.thanhnhan.model.impl.KhuVucModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.thanhnhan.model.impl.KhuVucImpl}.
 * </p>
 *
 * @author ThanhNhan
 * @see KhuVuc
 * @see com.thanhnhan.model.impl.KhuVucImpl
 * @see com.thanhnhan.model.impl.KhuVucModelImpl
 * @generated
 */
public interface KhuVucModel extends BaseModel<KhuVuc> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a khu vuc model instance should use the {@link KhuVuc} interface instead.
	 */

	/**
	 * Returns the primary key of this khu vuc.
	 *
	 * @return the primary key of this khu vuc
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this khu vuc.
	 *
	 * @param primaryKey the primary key of this khu vuc
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this khu vuc.
	 *
	 * @return the ID of this khu vuc
	 */
	public long getId();

	/**
	 * Sets the ID of this khu vuc.
	 *
	 * @param id the ID of this khu vuc
	 */
	public void setId(long id);

	/**
	 * Returns the khu vuc ID of this khu vuc.
	 *
	 * @return the khu vuc ID of this khu vuc
	 */
	@AutoEscape
	public String getKhuVucId();

	/**
	 * Sets the khu vuc ID of this khu vuc.
	 *
	 * @param khuVucId the khu vuc ID of this khu vuc
	 */
	public void setKhuVucId(String khuVucId);

	/**
	 * Returns the khu vuc name of this khu vuc.
	 *
	 * @return the khu vuc name of this khu vuc
	 */
	@AutoEscape
	public String getKhuVucName();

	/**
	 * Sets the khu vuc name of this khu vuc.
	 *
	 * @param khuVucName the khu vuc name of this khu vuc
	 */
	public void setKhuVucName(String khuVucName);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(KhuVuc khuVuc);

	@Override
	public int hashCode();

	@Override
	public CacheModel<KhuVuc> toCacheModel();

	@Override
	public KhuVuc toEscapedModel();

	@Override
	public KhuVuc toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}