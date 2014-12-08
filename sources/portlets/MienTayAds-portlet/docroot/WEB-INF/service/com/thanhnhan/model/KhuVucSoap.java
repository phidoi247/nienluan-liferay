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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.thanhnhan.service.http.KhuVucServiceSoap}.
 *
 * @author ThanhNhan
 * @see com.thanhnhan.service.http.KhuVucServiceSoap
 * @generated
 */
public class KhuVucSoap implements Serializable {
	public static KhuVucSoap toSoapModel(KhuVuc model) {
		KhuVucSoap soapModel = new KhuVucSoap();

		soapModel.setKVid(model.getKVid());
		soapModel.setKhuVucId(model.getKhuVucId());
		soapModel.setKhuVucName(model.getKhuVucName());

		return soapModel;
	}

	public static KhuVucSoap[] toSoapModels(KhuVuc[] models) {
		KhuVucSoap[] soapModels = new KhuVucSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static KhuVucSoap[][] toSoapModels(KhuVuc[][] models) {
		KhuVucSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new KhuVucSoap[models.length][models[0].length];
		}
		else {
			soapModels = new KhuVucSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static KhuVucSoap[] toSoapModels(List<KhuVuc> models) {
		List<KhuVucSoap> soapModels = new ArrayList<KhuVucSoap>(models.size());

		for (KhuVuc model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new KhuVucSoap[soapModels.size()]);
	}

	public KhuVucSoap() {
	}

	public long getPrimaryKey() {
		return _kVid;
	}

	public void setPrimaryKey(long pk) {
		setKVid(pk);
	}

	public long getKVid() {
		return _kVid;
	}

	public void setKVid(long kVid) {
		_kVid = kVid;
	}

	public String getKhuVucId() {
		return _khuVucId;
	}

	public void setKhuVucId(String khuVucId) {
		_khuVucId = khuVucId;
	}

	public String getKhuVucName() {
		return _khuVucName;
	}

	public void setKhuVucName(String khuVucName) {
		_khuVucName = khuVucName;
	}

	private long _kVid;
	private String _khuVucId;
	private String _khuVucName;
}