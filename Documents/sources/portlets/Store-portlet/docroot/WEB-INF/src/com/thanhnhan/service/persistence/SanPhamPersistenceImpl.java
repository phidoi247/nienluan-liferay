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

package com.thanhnhan.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.thanhnhan.NoSuchSanPhamException;

import com.thanhnhan.model.SanPham;
import com.thanhnhan.model.impl.SanPhamImpl;
import com.thanhnhan.model.impl.SanPhamModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the san pham service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ThanhNhan
 * @see SanPhamPersistence
 * @see SanPhamUtil
 * @generated
 */
public class SanPhamPersistenceImpl extends BasePersistenceImpl<SanPham>
	implements SanPhamPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SanPhamUtil} to access the san pham persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SanPhamImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SanPhamModelImpl.ENTITY_CACHE_ENABLED,
			SanPhamModelImpl.FINDER_CACHE_ENABLED, SanPhamImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SanPhamModelImpl.ENTITY_CACHE_ENABLED,
			SanPhamModelImpl.FINDER_CACHE_ENABLED, SanPhamImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SanPhamModelImpl.ENTITY_CACHE_ENABLED,
			SanPhamModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public SanPhamPersistenceImpl() {
		setModelClass(SanPham.class);
	}

	/**
	 * Caches the san pham in the entity cache if it is enabled.
	 *
	 * @param sanPham the san pham
	 */
	@Override
	public void cacheResult(SanPham sanPham) {
		EntityCacheUtil.putResult(SanPhamModelImpl.ENTITY_CACHE_ENABLED,
			SanPhamImpl.class, sanPham.getPrimaryKey(), sanPham);

		sanPham.resetOriginalValues();
	}

	/**
	 * Caches the san phams in the entity cache if it is enabled.
	 *
	 * @param sanPhams the san phams
	 */
	@Override
	public void cacheResult(List<SanPham> sanPhams) {
		for (SanPham sanPham : sanPhams) {
			if (EntityCacheUtil.getResult(
						SanPhamModelImpl.ENTITY_CACHE_ENABLED,
						SanPhamImpl.class, sanPham.getPrimaryKey()) == null) {
				cacheResult(sanPham);
			}
			else {
				sanPham.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all san phams.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SanPhamImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SanPhamImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the san pham.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SanPham sanPham) {
		EntityCacheUtil.removeResult(SanPhamModelImpl.ENTITY_CACHE_ENABLED,
			SanPhamImpl.class, sanPham.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<SanPham> sanPhams) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SanPham sanPham : sanPhams) {
			EntityCacheUtil.removeResult(SanPhamModelImpl.ENTITY_CACHE_ENABLED,
				SanPhamImpl.class, sanPham.getPrimaryKey());
		}
	}

	/**
	 * Creates a new san pham with the primary key. Does not add the san pham to the database.
	 *
	 * @param spId the primary key for the new san pham
	 * @return the new san pham
	 */
	@Override
	public SanPham create(long spId) {
		SanPham sanPham = new SanPhamImpl();

		sanPham.setNew(true);
		sanPham.setPrimaryKey(spId);

		return sanPham;
	}

	/**
	 * Removes the san pham with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param spId the primary key of the san pham
	 * @return the san pham that was removed
	 * @throws com.thanhnhan.NoSuchSanPhamException if a san pham with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SanPham remove(long spId)
		throws NoSuchSanPhamException, SystemException {
		return remove((Serializable)spId);
	}

	/**
	 * Removes the san pham with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the san pham
	 * @return the san pham that was removed
	 * @throws com.thanhnhan.NoSuchSanPhamException if a san pham with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SanPham remove(Serializable primaryKey)
		throws NoSuchSanPhamException, SystemException {
		Session session = null;

		try {
			session = openSession();

			SanPham sanPham = (SanPham)session.get(SanPhamImpl.class, primaryKey);

			if (sanPham == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSanPhamException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(sanPham);
		}
		catch (NoSuchSanPhamException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected SanPham removeImpl(SanPham sanPham) throws SystemException {
		sanPham = toUnwrappedModel(sanPham);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sanPham)) {
				sanPham = (SanPham)session.get(SanPhamImpl.class,
						sanPham.getPrimaryKeyObj());
			}

			if (sanPham != null) {
				session.delete(sanPham);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (sanPham != null) {
			clearCache(sanPham);
		}

		return sanPham;
	}

	@Override
	public SanPham updateImpl(com.thanhnhan.model.SanPham sanPham)
		throws SystemException {
		sanPham = toUnwrappedModel(sanPham);

		boolean isNew = sanPham.isNew();

		Session session = null;

		try {
			session = openSession();

			if (sanPham.isNew()) {
				session.save(sanPham);

				sanPham.setNew(false);
			}
			else {
				session.merge(sanPham);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(SanPhamModelImpl.ENTITY_CACHE_ENABLED,
			SanPhamImpl.class, sanPham.getPrimaryKey(), sanPham);

		return sanPham;
	}

	protected SanPham toUnwrappedModel(SanPham sanPham) {
		if (sanPham instanceof SanPhamImpl) {
			return sanPham;
		}

		SanPhamImpl sanPhamImpl = new SanPhamImpl();

		sanPhamImpl.setNew(sanPham.isNew());
		sanPhamImpl.setPrimaryKey(sanPham.getPrimaryKey());

		sanPhamImpl.setSpId(sanPham.getSpId());
		sanPhamImpl.setSpName(sanPham.getSpName());
		sanPhamImpl.setDesc(sanPham.getDesc());
		sanPhamImpl.setNguoiDang(sanPham.getNguoiDang());
		sanPhamImpl.setSdt(sanPham.getSdt());
		sanPhamImpl.setDiaChi(sanPham.getDiaChi());
		sanPhamImpl.setGia(sanPham.getGia());
		sanPhamImpl.setNgayDang(sanPham.getNgayDang());
		sanPhamImpl.setImage(sanPham.getImage());
		sanPhamImpl.setLoaiSPId(sanPham.getLoaiSPId());
		sanPhamImpl.setKhuVucId(sanPham.getKhuVucId());
		sanPhamImpl.setPassWord(sanPham.getPassWord());
		sanPhamImpl.setLoaiNguoiDung(sanPham.getLoaiNguoiDung());
		sanPhamImpl.setLoaiMuaBan(sanPham.getLoaiMuaBan());
		sanPhamImpl.setEmail(sanPham.getEmail());

		return sanPhamImpl;
	}

	/**
	 * Returns the san pham with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the san pham
	 * @return the san pham
	 * @throws com.thanhnhan.NoSuchSanPhamException if a san pham with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SanPham findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSanPhamException, SystemException {
		SanPham sanPham = fetchByPrimaryKey(primaryKey);

		if (sanPham == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSanPhamException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return sanPham;
	}

	/**
	 * Returns the san pham with the primary key or throws a {@link com.thanhnhan.NoSuchSanPhamException} if it could not be found.
	 *
	 * @param spId the primary key of the san pham
	 * @return the san pham
	 * @throws com.thanhnhan.NoSuchSanPhamException if a san pham with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SanPham findByPrimaryKey(long spId)
		throws NoSuchSanPhamException, SystemException {
		return findByPrimaryKey((Serializable)spId);
	}

	/**
	 * Returns the san pham with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the san pham
	 * @return the san pham, or <code>null</code> if a san pham with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SanPham fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		SanPham sanPham = (SanPham)EntityCacheUtil.getResult(SanPhamModelImpl.ENTITY_CACHE_ENABLED,
				SanPhamImpl.class, primaryKey);

		if (sanPham == _nullSanPham) {
			return null;
		}

		if (sanPham == null) {
			Session session = null;

			try {
				session = openSession();

				sanPham = (SanPham)session.get(SanPhamImpl.class, primaryKey);

				if (sanPham != null) {
					cacheResult(sanPham);
				}
				else {
					EntityCacheUtil.putResult(SanPhamModelImpl.ENTITY_CACHE_ENABLED,
						SanPhamImpl.class, primaryKey, _nullSanPham);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(SanPhamModelImpl.ENTITY_CACHE_ENABLED,
					SanPhamImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return sanPham;
	}

	/**
	 * Returns the san pham with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param spId the primary key of the san pham
	 * @return the san pham, or <code>null</code> if a san pham with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SanPham fetchByPrimaryKey(long spId) throws SystemException {
		return fetchByPrimaryKey((Serializable)spId);
	}

	/**
	 * Returns all the san phams.
	 *
	 * @return the san phams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SanPham> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the san phams.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.SanPhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of san phams
	 * @param end the upper bound of the range of san phams (not inclusive)
	 * @return the range of san phams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SanPham> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the san phams.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.SanPhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of san phams
	 * @param end the upper bound of the range of san phams (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of san phams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SanPham> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<SanPham> list = (List<SanPham>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SANPHAM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SANPHAM;

				if (pagination) {
					sql = sql.concat(SanPhamModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SanPham>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SanPham>(list);
				}
				else {
					list = (List<SanPham>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the san phams from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (SanPham sanPham : findAll()) {
			remove(sanPham);
		}
	}

	/**
	 * Returns the number of san phams.
	 *
	 * @return the number of san phams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SANPHAM);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the san pham persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.thanhnhan.model.SanPham")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<SanPham>> listenersList = new ArrayList<ModelListener<SanPham>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<SanPham>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(SanPhamImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SANPHAM = "SELECT sanPham FROM SanPham sanPham";
	private static final String _SQL_COUNT_SANPHAM = "SELECT COUNT(sanPham) FROM SanPham sanPham";
	private static final String _ORDER_BY_ENTITY_ALIAS = "sanPham.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SanPham exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SanPhamPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"desc"
			});
	private static SanPham _nullSanPham = new SanPhamImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<SanPham> toCacheModel() {
				return _nullSanPhamCacheModel;
			}
		};

	private static CacheModel<SanPham> _nullSanPhamCacheModel = new CacheModel<SanPham>() {
			@Override
			public SanPham toEntityModel() {
				return _nullSanPham;
			}
		};
}