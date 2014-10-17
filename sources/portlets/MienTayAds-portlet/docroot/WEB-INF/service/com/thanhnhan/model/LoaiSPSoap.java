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
 * This class is used by SOAP remote services, specifically {@link com.thanhnhan.service.http.LoaiSPServiceSoap}.
 *
 * @author ThanhNhan
 * @see com.thanhnhan.service.http.LoaiSPServiceSoap
 * @generated
 */
public class LoaiSPSoap implements Serializable {
	public static LoaiSPSoap toSoapModel(LoaiSP model) {
		LoaiSPSoap soapModel = new LoaiSPSoap();

		soapModel.setLoaiSPId(model.getLoaiSPId());
		soapModel.setLoaiSPName(model.getLoaiSPName());

		return soapModel;
	}

	public static LoaiSPSoap[] toSoapModels(LoaiSP[] models) {
		LoaiSPSoap[] soapModels = new LoaiSPSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LoaiSPSoap[][] toSoapModels(LoaiSP[][] models) {
		LoaiSPSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LoaiSPSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LoaiSPSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LoaiSPSoap[] toSoapModels(List<LoaiSP> models) {
		List<LoaiSPSoap> soapModels = new ArrayList<LoaiSPSoap>(models.size());

		for (LoaiSP model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LoaiSPSoap[soapModels.size()]);
	}

	public LoaiSPSoap() {
	}

	public long getPrimaryKey() {
		return _loaiSPId;
	}

	public void setPrimaryKey(long pk) {
		setLoaiSPId(pk);
	}

	public long getLoaiSPId() {
		return _loaiSPId;
	}

	public void setLoaiSPId(long loaiSPId) {
		_loaiSPId = loaiSPId;
	}

	public String getLoaiSPName() {
		return _loaiSPName;
	}

	public void setLoaiSPName(String loaiSPName) {
		_loaiSPName = loaiSPName;
	}

	private long _loaiSPId;
	private String _loaiSPName;
}