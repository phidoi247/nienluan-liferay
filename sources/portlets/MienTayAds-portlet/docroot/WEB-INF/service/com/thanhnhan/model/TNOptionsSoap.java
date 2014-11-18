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
 * This class is used by SOAP remote services, specifically {@link com.thanhnhan.service.http.TNOptionsServiceSoap}.
 *
 * @author ThanhNhan
 * @see com.thanhnhan.service.http.TNOptionsServiceSoap
 * @generated
 */
public class TNOptionsSoap implements Serializable {
	public static TNOptionsSoap toSoapModel(TNOptions model) {
		TNOptionsSoap soapModel = new TNOptionsSoap();

		soapModel.setId(model.getId());
		soapModel.setOption_name(model.getOption_name());
		soapModel.setValue(model.getValue());

		return soapModel;
	}

	public static TNOptionsSoap[] toSoapModels(TNOptions[] models) {
		TNOptionsSoap[] soapModels = new TNOptionsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TNOptionsSoap[][] toSoapModels(TNOptions[][] models) {
		TNOptionsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TNOptionsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TNOptionsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TNOptionsSoap[] toSoapModels(List<TNOptions> models) {
		List<TNOptionsSoap> soapModels = new ArrayList<TNOptionsSoap>(models.size());

		for (TNOptions model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TNOptionsSoap[soapModels.size()]);
	}

	public TNOptionsSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getOption_name() {
		return _option_name;
	}

	public void setOption_name(String option_name) {
		_option_name = option_name;
	}

	public String getValue() {
		return _value;
	}

	public void setValue(String value) {
		_value = value;
	}

	private long _id;
	private String _option_name;
	private String _value;
}