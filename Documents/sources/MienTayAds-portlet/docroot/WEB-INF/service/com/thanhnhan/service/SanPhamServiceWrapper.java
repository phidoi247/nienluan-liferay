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

package com.thanhnhan.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SanPhamService}.
 *
 * @author ThanhNhan
 * @see SanPhamService
 * @generated
 */
public class SanPhamServiceWrapper implements SanPhamService,
	ServiceWrapper<SanPhamService> {
	public SanPhamServiceWrapper(SanPhamService sanPhamService) {
		_sanPhamService = sanPhamService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _sanPhamService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sanPhamService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sanPhamService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public SanPhamService getWrappedSanPhamService() {
		return _sanPhamService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedSanPhamService(SanPhamService sanPhamService) {
		_sanPhamService = sanPhamService;
	}

	@Override
	public SanPhamService getWrappedService() {
		return _sanPhamService;
	}

	@Override
	public void setWrappedService(SanPhamService sanPhamService) {
		_sanPhamService = sanPhamService;
	}

	private SanPhamService _sanPhamService;
}