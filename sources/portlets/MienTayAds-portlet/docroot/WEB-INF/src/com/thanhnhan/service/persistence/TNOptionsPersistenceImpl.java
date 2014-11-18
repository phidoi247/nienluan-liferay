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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.thanhnhan.NoSuchTNOptionsException;

import com.thanhnhan.model.TNOptions;
import com.thanhnhan.model.impl.TNOptionsImpl;
import com.thanhnhan.model.impl.TNOptionsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the t n options service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ThanhNhan
 * @see TNOptionsPersistence
 * @see TNOptionsUtil
 * @generated
 */
public class TNOptionsPersistenceImpl extends BasePersistenceImpl<TNOptions>
	implements TNOptionsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TNOptionsUtil} to access the t n options persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TNOptionsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TNOptionsModelImpl.ENTITY_CACHE_ENABLED,
			TNOptionsModelImpl.FINDER_CACHE_ENABLED, TNOptionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TNOptionsModelImpl.ENTITY_CACHE_ENABLED,
			TNOptionsModelImpl.FINDER_CACHE_ENABLED, TNOptionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TNOptionsModelImpl.ENTITY_CACHE_ENABLED,
			TNOptionsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_ID = new FinderPath(TNOptionsModelImpl.ENTITY_CACHE_ENABLED,
			TNOptionsModelImpl.FINDER_CACHE_ENABLED, TNOptionsImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByid",
			new String[] { Long.class.getName() },
			TNOptionsModelImpl.ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ID = new FinderPath(TNOptionsModelImpl.ENTITY_CACHE_ENABLED,
			TNOptionsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByid",
			new String[] { Long.class.getName() });

	/**
	 * Returns the t n options where id = &#63; or throws a {@link com.thanhnhan.NoSuchTNOptionsException} if it could not be found.
	 *
	 * @param id the ID
	 * @return the matching t n options
	 * @throws com.thanhnhan.NoSuchTNOptionsException if a matching t n options could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TNOptions findByid(long id)
		throws NoSuchTNOptionsException, SystemException {
		TNOptions tnOptions = fetchByid(id);

		if (tnOptions == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("id=");
			msg.append(id);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTNOptionsException(msg.toString());
		}

		return tnOptions;
	}

	/**
	 * Returns the t n options where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param id the ID
	 * @return the matching t n options, or <code>null</code> if a matching t n options could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TNOptions fetchByid(long id) throws SystemException {
		return fetchByid(id, true);
	}

	/**
	 * Returns the t n options where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param id the ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching t n options, or <code>null</code> if a matching t n options could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TNOptions fetchByid(long id, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { id };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_ID,
					finderArgs, this);
		}

		if (result instanceof TNOptions) {
			TNOptions tnOptions = (TNOptions)result;

			if ((id != tnOptions.getId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_TNOPTIONS_WHERE);

			query.append(_FINDER_COLUMN_ID_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

				List<TNOptions> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ID,
						finderArgs, list);
				}
				else {
					TNOptions tnOptions = list.get(0);

					result = tnOptions;

					cacheResult(tnOptions);

					if ((tnOptions.getId() != id)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ID,
							finderArgs, tnOptions);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ID, finderArgs);

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
			return (TNOptions)result;
		}
	}

	/**
	 * Removes the t n options where id = &#63; from the database.
	 *
	 * @param id the ID
	 * @return the t n options that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TNOptions removeByid(long id)
		throws NoSuchTNOptionsException, SystemException {
		TNOptions tnOptions = findByid(id);

		return remove(tnOptions);
	}

	/**
	 * Returns the number of t n optionses where id = &#63;.
	 *
	 * @param id the ID
	 * @return the number of matching t n optionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByid(long id) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ID;

		Object[] finderArgs = new Object[] { id };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TNOPTIONS_WHERE);

			query.append(_FINDER_COLUMN_ID_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

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

	private static final String _FINDER_COLUMN_ID_ID_2 = "tnOptions.id = ?";

	public TNOptionsPersistenceImpl() {
		setModelClass(TNOptions.class);
	}

	/**
	 * Caches the t n options in the entity cache if it is enabled.
	 *
	 * @param tnOptions the t n options
	 */
	@Override
	public void cacheResult(TNOptions tnOptions) {
		EntityCacheUtil.putResult(TNOptionsModelImpl.ENTITY_CACHE_ENABLED,
			TNOptionsImpl.class, tnOptions.getPrimaryKey(), tnOptions);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ID,
			new Object[] { tnOptions.getId() }, tnOptions);

		tnOptions.resetOriginalValues();
	}

	/**
	 * Caches the t n optionses in the entity cache if it is enabled.
	 *
	 * @param tnOptionses the t n optionses
	 */
	@Override
	public void cacheResult(List<TNOptions> tnOptionses) {
		for (TNOptions tnOptions : tnOptionses) {
			if (EntityCacheUtil.getResult(
						TNOptionsModelImpl.ENTITY_CACHE_ENABLED,
						TNOptionsImpl.class, tnOptions.getPrimaryKey()) == null) {
				cacheResult(tnOptions);
			}
			else {
				tnOptions.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all t n optionses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TNOptionsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TNOptionsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the t n options.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TNOptions tnOptions) {
		EntityCacheUtil.removeResult(TNOptionsModelImpl.ENTITY_CACHE_ENABLED,
			TNOptionsImpl.class, tnOptions.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(tnOptions);
	}

	@Override
	public void clearCache(List<TNOptions> tnOptionses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TNOptions tnOptions : tnOptionses) {
			EntityCacheUtil.removeResult(TNOptionsModelImpl.ENTITY_CACHE_ENABLED,
				TNOptionsImpl.class, tnOptions.getPrimaryKey());

			clearUniqueFindersCache(tnOptions);
		}
	}

	protected void cacheUniqueFindersCache(TNOptions tnOptions) {
		if (tnOptions.isNew()) {
			Object[] args = new Object[] { tnOptions.getId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ID, args, tnOptions);
		}
		else {
			TNOptionsModelImpl tnOptionsModelImpl = (TNOptionsModelImpl)tnOptions;

			if ((tnOptionsModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { tnOptions.getId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ID, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ID, args,
					tnOptions);
			}
		}
	}

	protected void clearUniqueFindersCache(TNOptions tnOptions) {
		TNOptionsModelImpl tnOptionsModelImpl = (TNOptionsModelImpl)tnOptions;

		Object[] args = new Object[] { tnOptions.getId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ID, args);

		if ((tnOptionsModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_ID.getColumnBitmask()) != 0) {
			args = new Object[] { tnOptionsModelImpl.getOriginalId() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ID, args);
		}
	}

	/**
	 * Creates a new t n options with the primary key. Does not add the t n options to the database.
	 *
	 * @param id the primary key for the new t n options
	 * @return the new t n options
	 */
	@Override
	public TNOptions create(long id) {
		TNOptions tnOptions = new TNOptionsImpl();

		tnOptions.setNew(true);
		tnOptions.setPrimaryKey(id);

		return tnOptions;
	}

	/**
	 * Removes the t n options with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the t n options
	 * @return the t n options that was removed
	 * @throws com.thanhnhan.NoSuchTNOptionsException if a t n options with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TNOptions remove(long id)
		throws NoSuchTNOptionsException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the t n options with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t n options
	 * @return the t n options that was removed
	 * @throws com.thanhnhan.NoSuchTNOptionsException if a t n options with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TNOptions remove(Serializable primaryKey)
		throws NoSuchTNOptionsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TNOptions tnOptions = (TNOptions)session.get(TNOptionsImpl.class,
					primaryKey);

			if (tnOptions == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTNOptionsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tnOptions);
		}
		catch (NoSuchTNOptionsException nsee) {
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
	protected TNOptions removeImpl(TNOptions tnOptions)
		throws SystemException {
		tnOptions = toUnwrappedModel(tnOptions);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tnOptions)) {
				tnOptions = (TNOptions)session.get(TNOptionsImpl.class,
						tnOptions.getPrimaryKeyObj());
			}

			if (tnOptions != null) {
				session.delete(tnOptions);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tnOptions != null) {
			clearCache(tnOptions);
		}

		return tnOptions;
	}

	@Override
	public TNOptions updateImpl(com.thanhnhan.model.TNOptions tnOptions)
		throws SystemException {
		tnOptions = toUnwrappedModel(tnOptions);

		boolean isNew = tnOptions.isNew();

		Session session = null;

		try {
			session = openSession();

			if (tnOptions.isNew()) {
				session.save(tnOptions);

				tnOptions.setNew(false);
			}
			else {
				session.merge(tnOptions);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TNOptionsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(TNOptionsModelImpl.ENTITY_CACHE_ENABLED,
			TNOptionsImpl.class, tnOptions.getPrimaryKey(), tnOptions);

		clearUniqueFindersCache(tnOptions);
		cacheUniqueFindersCache(tnOptions);

		return tnOptions;
	}

	protected TNOptions toUnwrappedModel(TNOptions tnOptions) {
		if (tnOptions instanceof TNOptionsImpl) {
			return tnOptions;
		}

		TNOptionsImpl tnOptionsImpl = new TNOptionsImpl();

		tnOptionsImpl.setNew(tnOptions.isNew());
		tnOptionsImpl.setPrimaryKey(tnOptions.getPrimaryKey());

		tnOptionsImpl.setId(tnOptions.getId());
		tnOptionsImpl.setOption_name(tnOptions.getOption_name());
		tnOptionsImpl.setValue(tnOptions.getValue());

		return tnOptionsImpl;
	}

	/**
	 * Returns the t n options with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the t n options
	 * @return the t n options
	 * @throws com.thanhnhan.NoSuchTNOptionsException if a t n options with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TNOptions findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTNOptionsException, SystemException {
		TNOptions tnOptions = fetchByPrimaryKey(primaryKey);

		if (tnOptions == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTNOptionsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tnOptions;
	}

	/**
	 * Returns the t n options with the primary key or throws a {@link com.thanhnhan.NoSuchTNOptionsException} if it could not be found.
	 *
	 * @param id the primary key of the t n options
	 * @return the t n options
	 * @throws com.thanhnhan.NoSuchTNOptionsException if a t n options with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TNOptions findByPrimaryKey(long id)
		throws NoSuchTNOptionsException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the t n options with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t n options
	 * @return the t n options, or <code>null</code> if a t n options with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TNOptions fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TNOptions tnOptions = (TNOptions)EntityCacheUtil.getResult(TNOptionsModelImpl.ENTITY_CACHE_ENABLED,
				TNOptionsImpl.class, primaryKey);

		if (tnOptions == _nullTNOptions) {
			return null;
		}

		if (tnOptions == null) {
			Session session = null;

			try {
				session = openSession();

				tnOptions = (TNOptions)session.get(TNOptionsImpl.class,
						primaryKey);

				if (tnOptions != null) {
					cacheResult(tnOptions);
				}
				else {
					EntityCacheUtil.putResult(TNOptionsModelImpl.ENTITY_CACHE_ENABLED,
						TNOptionsImpl.class, primaryKey, _nullTNOptions);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TNOptionsModelImpl.ENTITY_CACHE_ENABLED,
					TNOptionsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tnOptions;
	}

	/**
	 * Returns the t n options with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the t n options
	 * @return the t n options, or <code>null</code> if a t n options with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TNOptions fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the t n optionses.
	 *
	 * @return the t n optionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TNOptions> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t n optionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.TNOptionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of t n optionses
	 * @param end the upper bound of the range of t n optionses (not inclusive)
	 * @return the range of t n optionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TNOptions> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the t n optionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.TNOptionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of t n optionses
	 * @param end the upper bound of the range of t n optionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of t n optionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TNOptions> findAll(int start, int end,
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

		List<TNOptions> list = (List<TNOptions>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TNOPTIONS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TNOPTIONS;

				if (pagination) {
					sql = sql.concat(TNOptionsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TNOptions>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TNOptions>(list);
				}
				else {
					list = (List<TNOptions>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the t n optionses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TNOptions tnOptions : findAll()) {
			remove(tnOptions);
		}
	}

	/**
	 * Returns the number of t n optionses.
	 *
	 * @return the number of t n optionses
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

				Query q = session.createQuery(_SQL_COUNT_TNOPTIONS);

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
	 * Initializes the t n options persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.thanhnhan.model.TNOptions")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TNOptions>> listenersList = new ArrayList<ModelListener<TNOptions>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TNOptions>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TNOptionsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TNOPTIONS = "SELECT tnOptions FROM TNOptions tnOptions";
	private static final String _SQL_SELECT_TNOPTIONS_WHERE = "SELECT tnOptions FROM TNOptions tnOptions WHERE ";
	private static final String _SQL_COUNT_TNOPTIONS = "SELECT COUNT(tnOptions) FROM TNOptions tnOptions";
	private static final String _SQL_COUNT_TNOPTIONS_WHERE = "SELECT COUNT(tnOptions) FROM TNOptions tnOptions WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tnOptions.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TNOptions exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TNOptions exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TNOptionsPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static TNOptions _nullTNOptions = new TNOptionsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TNOptions> toCacheModel() {
				return _nullTNOptionsCacheModel;
			}
		};

	private static CacheModel<TNOptions> _nullTNOptionsCacheModel = new CacheModel<TNOptions>() {
			@Override
			public TNOptions toEntityModel() {
				return _nullTNOptions;
			}
		};
}