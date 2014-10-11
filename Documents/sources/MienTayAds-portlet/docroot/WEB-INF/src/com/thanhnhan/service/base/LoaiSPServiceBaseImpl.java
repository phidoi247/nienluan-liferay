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

package com.thanhnhan.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import com.thanhnhan.model.LoaiSP;

import com.thanhnhan.service.LoaiSPService;
import com.thanhnhan.service.persistence.KhuVucPersistence;
import com.thanhnhan.service.persistence.LoaiSPPersistence;
import com.thanhnhan.service.persistence.SanPhamPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the loai s p remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.thanhnhan.service.impl.LoaiSPServiceImpl}.
 * </p>
 *
 * @author ThanhNhan
 * @see com.thanhnhan.service.impl.LoaiSPServiceImpl
 * @see com.thanhnhan.service.LoaiSPServiceUtil
 * @generated
 */
public abstract class LoaiSPServiceBaseImpl extends BaseServiceImpl
	implements LoaiSPService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.thanhnhan.service.LoaiSPServiceUtil} to access the loai s p remote service.
	 */

	/**
	 * Returns the khu vuc local service.
	 *
	 * @return the khu vuc local service
	 */
	public com.thanhnhan.service.KhuVucLocalService getKhuVucLocalService() {
		return khuVucLocalService;
	}

	/**
	 * Sets the khu vuc local service.
	 *
	 * @param khuVucLocalService the khu vuc local service
	 */
	public void setKhuVucLocalService(
		com.thanhnhan.service.KhuVucLocalService khuVucLocalService) {
		this.khuVucLocalService = khuVucLocalService;
	}

	/**
	 * Returns the khu vuc remote service.
	 *
	 * @return the khu vuc remote service
	 */
	public com.thanhnhan.service.KhuVucService getKhuVucService() {
		return khuVucService;
	}

	/**
	 * Sets the khu vuc remote service.
	 *
	 * @param khuVucService the khu vuc remote service
	 */
	public void setKhuVucService(
		com.thanhnhan.service.KhuVucService khuVucService) {
		this.khuVucService = khuVucService;
	}

	/**
	 * Returns the khu vuc persistence.
	 *
	 * @return the khu vuc persistence
	 */
	public KhuVucPersistence getKhuVucPersistence() {
		return khuVucPersistence;
	}

	/**
	 * Sets the khu vuc persistence.
	 *
	 * @param khuVucPersistence the khu vuc persistence
	 */
	public void setKhuVucPersistence(KhuVucPersistence khuVucPersistence) {
		this.khuVucPersistence = khuVucPersistence;
	}

	/**
	 * Returns the loai s p local service.
	 *
	 * @return the loai s p local service
	 */
	public com.thanhnhan.service.LoaiSPLocalService getLoaiSPLocalService() {
		return loaiSPLocalService;
	}

	/**
	 * Sets the loai s p local service.
	 *
	 * @param loaiSPLocalService the loai s p local service
	 */
	public void setLoaiSPLocalService(
		com.thanhnhan.service.LoaiSPLocalService loaiSPLocalService) {
		this.loaiSPLocalService = loaiSPLocalService;
	}

	/**
	 * Returns the loai s p remote service.
	 *
	 * @return the loai s p remote service
	 */
	public com.thanhnhan.service.LoaiSPService getLoaiSPService() {
		return loaiSPService;
	}

	/**
	 * Sets the loai s p remote service.
	 *
	 * @param loaiSPService the loai s p remote service
	 */
	public void setLoaiSPService(
		com.thanhnhan.service.LoaiSPService loaiSPService) {
		this.loaiSPService = loaiSPService;
	}

	/**
	 * Returns the loai s p persistence.
	 *
	 * @return the loai s p persistence
	 */
	public LoaiSPPersistence getLoaiSPPersistence() {
		return loaiSPPersistence;
	}

	/**
	 * Sets the loai s p persistence.
	 *
	 * @param loaiSPPersistence the loai s p persistence
	 */
	public void setLoaiSPPersistence(LoaiSPPersistence loaiSPPersistence) {
		this.loaiSPPersistence = loaiSPPersistence;
	}

	/**
	 * Returns the san pham local service.
	 *
	 * @return the san pham local service
	 */
	public com.thanhnhan.service.SanPhamLocalService getSanPhamLocalService() {
		return sanPhamLocalService;
	}

	/**
	 * Sets the san pham local service.
	 *
	 * @param sanPhamLocalService the san pham local service
	 */
	public void setSanPhamLocalService(
		com.thanhnhan.service.SanPhamLocalService sanPhamLocalService) {
		this.sanPhamLocalService = sanPhamLocalService;
	}

	/**
	 * Returns the san pham remote service.
	 *
	 * @return the san pham remote service
	 */
	public com.thanhnhan.service.SanPhamService getSanPhamService() {
		return sanPhamService;
	}

	/**
	 * Sets the san pham remote service.
	 *
	 * @param sanPhamService the san pham remote service
	 */
	public void setSanPhamService(
		com.thanhnhan.service.SanPhamService sanPhamService) {
		this.sanPhamService = sanPhamService;
	}

	/**
	 * Returns the san pham persistence.
	 *
	 * @return the san pham persistence
	 */
	public SanPhamPersistence getSanPhamPersistence() {
		return sanPhamPersistence;
	}

	/**
	 * Sets the san pham persistence.
	 *
	 * @param sanPhamPersistence the san pham persistence
	 */
	public void setSanPhamPersistence(SanPhamPersistence sanPhamPersistence) {
		this.sanPhamPersistence = sanPhamPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return LoaiSP.class;
	}

	protected String getModelClassName() {
		return LoaiSP.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = loaiSPPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.thanhnhan.service.KhuVucLocalService.class)
	protected com.thanhnhan.service.KhuVucLocalService khuVucLocalService;
	@BeanReference(type = com.thanhnhan.service.KhuVucService.class)
	protected com.thanhnhan.service.KhuVucService khuVucService;
	@BeanReference(type = KhuVucPersistence.class)
	protected KhuVucPersistence khuVucPersistence;
	@BeanReference(type = com.thanhnhan.service.LoaiSPLocalService.class)
	protected com.thanhnhan.service.LoaiSPLocalService loaiSPLocalService;
	@BeanReference(type = com.thanhnhan.service.LoaiSPService.class)
	protected com.thanhnhan.service.LoaiSPService loaiSPService;
	@BeanReference(type = LoaiSPPersistence.class)
	protected LoaiSPPersistence loaiSPPersistence;
	@BeanReference(type = com.thanhnhan.service.SanPhamLocalService.class)
	protected com.thanhnhan.service.SanPhamLocalService sanPhamLocalService;
	@BeanReference(type = com.thanhnhan.service.SanPhamService.class)
	protected com.thanhnhan.service.SanPhamService sanPhamService;
	@BeanReference(type = SanPhamPersistence.class)
	protected SanPhamPersistence sanPhamPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private LoaiSPServiceClpInvoker _clpInvoker = new LoaiSPServiceClpInvoker();
}