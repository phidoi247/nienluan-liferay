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
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.thanhnhan.NoSuchKhuVucException;

import com.thanhnhan.model.KhuVuc;
import com.thanhnhan.model.impl.KhuVucImpl;
import com.thanhnhan.model.impl.KhuVucModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the khu vuc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ThanhNhan
 * @see KhuVucPersistence
 * @see KhuVucUtil
 * @generated
 */
public class KhuVucPersistenceImpl extends BasePersistenceImpl<KhuVuc>
	implements KhuVucPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link KhuVucUtil} to access the khu vuc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = KhuVucImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(KhuVucModelImpl.ENTITY_CACHE_ENABLED,
			KhuVucModelImpl.FINDER_CACHE_ENABLED, KhuVucImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(KhuVucModelImpl.ENTITY_CACHE_ENABLED,
			KhuVucModelImpl.FINDER_CACHE_ENABLED, KhuVucImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(KhuVucModelImpl.ENTITY_CACHE_ENABLED,
			KhuVucModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_KHUVUCID = new FinderPath(KhuVucModelImpl.ENTITY_CACHE_ENABLED,
			KhuVucModelImpl.FINDER_CACHE_ENABLED, KhuVucImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByKhuVucId",
			new String[] { String.class.getName() },
			KhuVucModelImpl.KHUVUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_KHUVUCID = new FinderPath(KhuVucModelImpl.ENTITY_CACHE_ENABLED,
			KhuVucModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByKhuVucId",
			new String[] { String.class.getName() });

	/**
	 * Returns the khu vuc where khuVucId = &#63; or throws a {@link com.thanhnhan.NoSuchKhuVucException} if it could not be found.
	 *
	 * @param khuVucId the khu vuc ID
	 * @return the matching khu vuc
	 * @throws com.thanhnhan.NoSuchKhuVucException if a matching khu vuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhuVuc findByKhuVucId(String khuVucId)
		throws NoSuchKhuVucException, SystemException {
		KhuVuc khuVuc = fetchByKhuVucId(khuVucId);

		if (khuVuc == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("khuVucId=");
			msg.append(khuVucId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchKhuVucException(msg.toString());
		}

		return khuVuc;
	}

	/**
	 * Returns the khu vuc where khuVucId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param khuVucId the khu vuc ID
	 * @return the matching khu vuc, or <code>null</code> if a matching khu vuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhuVuc fetchByKhuVucId(String khuVucId) throws SystemException {
		return fetchByKhuVucId(khuVucId, true);
	}

	/**
	 * Returns the khu vuc where khuVucId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param khuVucId the khu vuc ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching khu vuc, or <code>null</code> if a matching khu vuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhuVuc fetchByKhuVucId(String khuVucId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { khuVucId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_KHUVUCID,
					finderArgs, this);
		}

		if (result instanceof KhuVuc) {
			KhuVuc khuVuc = (KhuVuc)result;

			if (!Validator.equals(khuVucId, khuVuc.getKhuVucId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_KHUVUC_WHERE);

			boolean bindKhuVucId = false;

			if (khuVucId == null) {
				query.append(_FINDER_COLUMN_KHUVUCID_KHUVUCID_1);
			}
			else if (khuVucId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_KHUVUCID_KHUVUCID_3);
			}
			else {
				bindKhuVucId = true;

				query.append(_FINDER_COLUMN_KHUVUCID_KHUVUCID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindKhuVucId) {
					qPos.add(khuVucId);
				}

				List<KhuVuc> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_KHUVUCID,
						finderArgs, list);
				}
				else {
					KhuVuc khuVuc = list.get(0);

					result = khuVuc;

					cacheResult(khuVuc);

					if ((khuVuc.getKhuVucId() == null) ||
							!khuVuc.getKhuVucId().equals(khuVucId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_KHUVUCID,
							finderArgs, khuVuc);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_KHUVUCID,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (KhuVuc)result;
		}
	}

	/**
	 * Removes the khu vuc where khuVucId = &#63; from the database.
	 *
	 * @param khuVucId the khu vuc ID
	 * @return the khu vuc that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhuVuc removeByKhuVucId(String khuVucId)
		throws NoSuchKhuVucException, SystemException {
		KhuVuc khuVuc = findByKhuVucId(khuVucId);

		return remove(khuVuc);
	}

	/**
	 * Returns the number of khu vucs where khuVucId = &#63;.
	 *
	 * @param khuVucId the khu vuc ID
	 * @return the number of matching khu vucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByKhuVucId(String khuVucId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_KHUVUCID;

		Object[] finderArgs = new Object[] { khuVucId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_KHUVUC_WHERE);

			boolean bindKhuVucId = false;

			if (khuVucId == null) {
				query.append(_FINDER_COLUMN_KHUVUCID_KHUVUCID_1);
			}
			else if (khuVucId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_KHUVUCID_KHUVUCID_3);
			}
			else {
				bindKhuVucId = true;

				query.append(_FINDER_COLUMN_KHUVUCID_KHUVUCID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindKhuVucId) {
					qPos.add(khuVucId);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_KHUVUCID_KHUVUCID_1 = "khuVuc.khuVucId IS NULL";
	private static final String _FINDER_COLUMN_KHUVUCID_KHUVUCID_2 = "khuVuc.khuVucId = ?";
	private static final String _FINDER_COLUMN_KHUVUCID_KHUVUCID_3 = "(khuVuc.khuVucId IS NULL OR khuVuc.khuVucId = '')";

	public KhuVucPersistenceImpl() {
		setModelClass(KhuVuc.class);
	}

	/**
	 * Caches the khu vuc in the entity cache if it is enabled.
	 *
	 * @param khuVuc the khu vuc
	 */
	@Override
	public void cacheResult(KhuVuc khuVuc) {
		EntityCacheUtil.putResult(KhuVucModelImpl.ENTITY_CACHE_ENABLED,
			KhuVucImpl.class, khuVuc.getPrimaryKey(), khuVuc);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_KHUVUCID,
			new Object[] { khuVuc.getKhuVucId() }, khuVuc);

		khuVuc.resetOriginalValues();
	}

	/**
	 * Caches the khu vucs in the entity cache if it is enabled.
	 *
	 * @param khuVucs the khu vucs
	 */
	@Override
	public void cacheResult(List<KhuVuc> khuVucs) {
		for (KhuVuc khuVuc : khuVucs) {
			if (EntityCacheUtil.getResult(
						KhuVucModelImpl.ENTITY_CACHE_ENABLED, KhuVucImpl.class,
						khuVuc.getPrimaryKey()) == null) {
				cacheResult(khuVuc);
			}
			else {
				khuVuc.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all khu vucs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(KhuVucImpl.class.getName());
		}

		EntityCacheUtil.clearCache(KhuVucImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the khu vuc.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(KhuVuc khuVuc) {
		EntityCacheUtil.removeResult(KhuVucModelImpl.ENTITY_CACHE_ENABLED,
			KhuVucImpl.class, khuVuc.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(khuVuc);
	}

	@Override
	public void clearCache(List<KhuVuc> khuVucs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (KhuVuc khuVuc : khuVucs) {
			EntityCacheUtil.removeResult(KhuVucModelImpl.ENTITY_CACHE_ENABLED,
				KhuVucImpl.class, khuVuc.getPrimaryKey());

			clearUniqueFindersCache(khuVuc);
		}
	}

	protected void cacheUniqueFindersCache(KhuVuc khuVuc) {
		if (khuVuc.isNew()) {
			Object[] args = new Object[] { khuVuc.getKhuVucId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_KHUVUCID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_KHUVUCID, args,
				khuVuc);
		}
		else {
			KhuVucModelImpl khuVucModelImpl = (KhuVucModelImpl)khuVuc;

			if ((khuVucModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_KHUVUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { khuVuc.getKhuVucId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_KHUVUCID, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_KHUVUCID, args,
					khuVuc);
			}
		}
	}

	protected void clearUniqueFindersCache(KhuVuc khuVuc) {
		KhuVucModelImpl khuVucModelImpl = (KhuVucModelImpl)khuVuc;

		Object[] args = new Object[] { khuVuc.getKhuVucId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_KHUVUCID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_KHUVUCID, args);

		if ((khuVucModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_KHUVUCID.getColumnBitmask()) != 0) {
			args = new Object[] { khuVucModelImpl.getOriginalKhuVucId() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_KHUVUCID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_KHUVUCID, args);
		}
	}

	/**
	 * Creates a new khu vuc with the primary key. Does not add the khu vuc to the database.
	 *
	 * @param id the primary key for the new khu vuc
	 * @return the new khu vuc
	 */
	@Override
	public KhuVuc create(long id) {
		KhuVuc khuVuc = new KhuVucImpl();

		khuVuc.setNew(true);
		khuVuc.setPrimaryKey(id);

		return khuVuc;
	}

	/**
	 * Removes the khu vuc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the khu vuc
	 * @return the khu vuc that was removed
	 * @throws com.thanhnhan.NoSuchKhuVucException if a khu vuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhuVuc remove(long id) throws NoSuchKhuVucException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the khu vuc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the khu vuc
	 * @return the khu vuc that was removed
	 * @throws com.thanhnhan.NoSuchKhuVucException if a khu vuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhuVuc remove(Serializable primaryKey)
		throws NoSuchKhuVucException, SystemException {
		Session session = null;

		try {
			session = openSession();

			KhuVuc khuVuc = (KhuVuc)session.get(KhuVucImpl.class, primaryKey);

			if (khuVuc == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchKhuVucException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(khuVuc);
		}
		catch (NoSuchKhuVucException nsee) {
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
	protected KhuVuc removeImpl(KhuVuc khuVuc) throws SystemException {
		khuVuc = toUnwrappedModel(khuVuc);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(khuVuc)) {
				khuVuc = (KhuVuc)session.get(KhuVucImpl.class,
						khuVuc.getPrimaryKeyObj());
			}

			if (khuVuc != null) {
				session.delete(khuVuc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (khuVuc != null) {
			clearCache(khuVuc);
		}

		return khuVuc;
	}

	@Override
	public KhuVuc updateImpl(com.thanhnhan.model.KhuVuc khuVuc)
		throws SystemException {
		khuVuc = toUnwrappedModel(khuVuc);

		boolean isNew = khuVuc.isNew();

		Session session = null;

		try {
			session = openSession();

			if (khuVuc.isNew()) {
				session.save(khuVuc);

				khuVuc.setNew(false);
			}
			else {
				session.merge(khuVuc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !KhuVucModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(KhuVucModelImpl.ENTITY_CACHE_ENABLED,
			KhuVucImpl.class, khuVuc.getPrimaryKey(), khuVuc);

		clearUniqueFindersCache(khuVuc);
		cacheUniqueFindersCache(khuVuc);

		return khuVuc;
	}

	protected KhuVuc toUnwrappedModel(KhuVuc khuVuc) {
		if (khuVuc instanceof KhuVucImpl) {
			return khuVuc;
		}

		KhuVucImpl khuVucImpl = new KhuVucImpl();

		khuVucImpl.setNew(khuVuc.isNew());
		khuVucImpl.setPrimaryKey(khuVuc.getPrimaryKey());

		khuVucImpl.setId(khuVuc.getId());
		khuVucImpl.setKhuVucId(khuVuc.getKhuVucId());
		khuVucImpl.setKhuVucName(khuVuc.getKhuVucName());

		return khuVucImpl;
	}

	/**
	 * Returns the khu vuc with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the khu vuc
	 * @return the khu vuc
	 * @throws com.thanhnhan.NoSuchKhuVucException if a khu vuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhuVuc findByPrimaryKey(Serializable primaryKey)
		throws NoSuchKhuVucException, SystemException {
		KhuVuc khuVuc = fetchByPrimaryKey(primaryKey);

		if (khuVuc == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchKhuVucException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return khuVuc;
	}

	/**
	 * Returns the khu vuc with the primary key or throws a {@link com.thanhnhan.NoSuchKhuVucException} if it could not be found.
	 *
	 * @param id the primary key of the khu vuc
	 * @return the khu vuc
	 * @throws com.thanhnhan.NoSuchKhuVucException if a khu vuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhuVuc findByPrimaryKey(long id)
		throws NoSuchKhuVucException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the khu vuc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the khu vuc
	 * @return the khu vuc, or <code>null</code> if a khu vuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhuVuc fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		KhuVuc khuVuc = (KhuVuc)EntityCacheUtil.getResult(KhuVucModelImpl.ENTITY_CACHE_ENABLED,
				KhuVucImpl.class, primaryKey);

		if (khuVuc == _nullKhuVuc) {
			return null;
		}

		if (khuVuc == null) {
			Session session = null;

			try {
				session = openSession();

				khuVuc = (KhuVuc)session.get(KhuVucImpl.class, primaryKey);

				if (khuVuc != null) {
					cacheResult(khuVuc);
				}
				else {
					EntityCacheUtil.putResult(KhuVucModelImpl.ENTITY_CACHE_ENABLED,
						KhuVucImpl.class, primaryKey, _nullKhuVuc);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(KhuVucModelImpl.ENTITY_CACHE_ENABLED,
					KhuVucImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return khuVuc;
	}

	/**
	 * Returns the khu vuc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the khu vuc
	 * @return the khu vuc, or <code>null</code> if a khu vuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhuVuc fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the khu vucs.
	 *
	 * @return the khu vucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KhuVuc> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the khu vucs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.KhuVucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of khu vucs
	 * @param end the upper bound of the range of khu vucs (not inclusive)
	 * @return the range of khu vucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KhuVuc> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the khu vucs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.KhuVucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of khu vucs
	 * @param end the upper bound of the range of khu vucs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of khu vucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KhuVuc> findAll(int start, int end,
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

		List<KhuVuc> list = (List<KhuVuc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_KHUVUC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_KHUVUC;

				if (pagination) {
					sql = sql.concat(KhuVucModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<KhuVuc>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KhuVuc>(list);
				}
				else {
					list = (List<KhuVuc>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the khu vucs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (KhuVuc khuVuc : findAll()) {
			remove(khuVuc);
		}
	}

	/**
	 * Returns the number of khu vucs.
	 *
	 * @return the number of khu vucs
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

				Query q = session.createQuery(_SQL_COUNT_KHUVUC);

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
	 * Initializes the khu vuc persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.thanhnhan.model.KhuVuc")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<KhuVuc>> listenersList = new ArrayList<ModelListener<KhuVuc>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<KhuVuc>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(KhuVucImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_KHUVUC = "SELECT khuVuc FROM KhuVuc khuVuc";
	private static final String _SQL_SELECT_KHUVUC_WHERE = "SELECT khuVuc FROM KhuVuc khuVuc WHERE ";
	private static final String _SQL_COUNT_KHUVUC = "SELECT COUNT(khuVuc) FROM KhuVuc khuVuc";
	private static final String _SQL_COUNT_KHUVUC_WHERE = "SELECT COUNT(khuVuc) FROM KhuVuc khuVuc WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "khuVuc.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No KhuVuc exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No KhuVuc exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(KhuVucPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static KhuVuc _nullKhuVuc = new KhuVucImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<KhuVuc> toCacheModel() {
				return _nullKhuVucCacheModel;
			}
		};

	private static CacheModel<KhuVuc> _nullKhuVucCacheModel = new CacheModel<KhuVuc>() {
			@Override
			public KhuVuc toEntityModel() {
				return _nullKhuVuc;
			}
		};
}