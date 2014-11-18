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
 * This class is used by SOAP remote services, specifically {@link com.thanhnhan.service.http.OptionsServiceSoap}.
 *
 * @author ThanhNhan
 * @see com.thanhnhan.service.http.OptionsServiceSoap
 * @generated
 */
public class OptionsSoap implements Serializable {
	public static OptionsSoap toSoapModel(Options model) {
		OptionsSoap soapModel = new OptionsSoap();

		soapModel.setId(model.getId());
		soapModel.setOption_name(model.getOption_name());

		return soapModel;
	}

	public static OptionsSoap[] toSoapModels(Options[] models) {
		OptionsSoap[] soapModels = new OptionsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OptionsSoap[][] toSoapModels(Options[][] models) {
		OptionsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OptionsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OptionsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OptionsSoap[] toSoapModels(List<Options> models) {
		List<OptionsSoap> soapModels = new ArrayList<OptionsSoap>(models.size());

		for (Options model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OptionsSoap[soapModels.size()]);
	}

	public OptionsSoap() {
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

	private long _id;
	private String _option_name;
}