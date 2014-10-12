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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.thanhnhan.NoSuchLoaiSPException;

import com.thanhnhan.model.LoaiSP;
import com.thanhnhan.model.impl.LoaiSPImpl;
import com.thanhnhan.model.impl.LoaiSPModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the loai s p service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ThanhNhan
 * @see LoaiSPPersistence
 * @see LoaiSPUtil
 * @generated
 */
public class LoaiSPPersistenceImpl extends BasePersistenceImpl<LoaiSP>
	implements LoaiSPPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LoaiSPUtil} to access the loai s p persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LoaiSPImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LoaiSPModelImpl.ENTITY_CACHE_ENABLED,
			LoaiSPModelImpl.FINDER_CACHE_ENABLED, LoaiSPImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LoaiSPModelImpl.ENTITY_CACHE_ENABLED,
			LoaiSPModelImpl.FINDER_CACHE_ENABLED, LoaiSPImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LoaiSPModelImpl.ENTITY_CACHE_ENABLED,
			LoaiSPModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LOAISP = new FinderPath(LoaiSPModelImpl.ENTITY_CACHE_ENABLED,
			LoaiSPModelImpl.FINDER_CACHE_ENABLED, LoaiSPImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLoaiSP",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOAISP =
		new FinderPath(LoaiSPModelImpl.ENTITY_CACHE_ENABLED,
			LoaiSPModelImpl.FINDER_CACHE_ENABLED, LoaiSPImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLoaiSP",
			new String[] { Long.class.getName(), String.class.getName() },
			LoaiSPModelImpl.LOAISPID_COLUMN_BITMASK |
			LoaiSPModelImpl.LOAISPNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOAISP = new FinderPath(LoaiSPModelImpl.ENTITY_CACHE_ENABLED,
			LoaiSPModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLoaiSP",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the loai s ps where loaiSPId = &#63; and loaiSPName = &#63;.
	 *
	 * @param loaiSPId the loai s p ID
	 * @param loaiSPName the loai s p name
	 * @return the matching loai s ps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LoaiSP> findByLoaiSP(long loaiSPId, String loaiSPName)
		throws SystemException {
		return findByLoaiSP(loaiSPId, loaiSPName, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the loai s ps where loaiSPId = &#63; and loaiSPName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.LoaiSPModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param loaiSPId the loai s p ID
	 * @param loaiSPName the loai s p name
	 * @param start the lower bound of the range of loai s ps
	 * @param end the upper bound of the range of loai s ps (not inclusive)
	 * @return the range of matching loai s ps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LoaiSP> findByLoaiSP(long loaiSPId, String loaiSPName,
		int start, int end) throws SystemException {
		return findByLoaiSP(loaiSPId, loaiSPName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the loai s ps where loaiSPId = &#63; and loaiSPName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.LoaiSPModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param loaiSPId the loai s p ID
	 * @param loaiSPName the loai s p name
	 * @param start the lower bound of the range of loai s ps
	 * @param end the upper bound of the range of loai s ps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching loai s ps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LoaiSP> findByLoaiSP(long loaiSPId, String loaiSPName,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOAISP;
			finderArgs = new Object[] { loaiSPId, loaiSPName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LOAISP;
			finderArgs = new Object[] {
					loaiSPId, loaiSPName,
					
					start, end, orderByComparator
				};
		}

		List<LoaiSP> list = (List<LoaiSP>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (LoaiSP loaiSP : list) {
				if ((loaiSPId != loaiSP.getLoaiSPId()) ||
						!Validator.equals(loaiSPName, loaiSP.getLoaiSPName())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_LOAISP_WHERE);

			query.append(_FINDER_COLUMN_LOAISP_LOAISPID_2);

			boolean bindLoaiSPName = false;

			if (loaiSPName == null) {
				query.append(_FINDER_COLUMN_LOAISP_LOAISPNAME_1);
			}
			else if (loaiSPName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LOAISP_LOAISPNAME_3);
			}
			else {
				bindLoaiSPName = true;

				query.append(_FINDER_COLUMN_LOAISP_LOAISPNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LoaiSPModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(loaiSPId);

				if (bindLoaiSPName) {
					qPos.add(loaiSPName);
				}

				if (!pagination) {
					list = (List<LoaiSP>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LoaiSP>(list);
				}
				else {
					list = (List<LoaiSP>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first loai s p in the ordered set where loaiSPId = &#63; and loaiSPName = &#63;.
	 *
	 * @param loaiSPId the loai s p ID
	 * @param loaiSPName the loai s p name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching loai s p
	 * @throws com.thanhnhan.NoSuchLoaiSPException if a matching loai s p could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiSP findByLoaiSP_First(long loaiSPId, String loaiSPName,
		OrderByComparator orderByComparator)
		throws NoSuchLoaiSPException, SystemException {
		LoaiSP loaiSP = fetchByLoaiSP_First(loaiSPId, loaiSPName,
				orderByComparator);

		if (loaiSP != null) {
			return loaiSP;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("loaiSPId=");
		msg.append(loaiSPId);

		msg.append(", loaiSPName=");
		msg.append(loaiSPName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLoaiSPException(msg.toString());
	}

	/**
	 * Returns the first loai s p in the ordered set where loaiSPId = &#63; and loaiSPName = &#63;.
	 *
	 * @param loaiSPId the loai s p ID
	 * @param loaiSPName the loai s p name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching loai s p, or <code>null</code> if a matching loai s p could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiSP fetchByLoaiSP_First(long loaiSPId, String loaiSPName,
		OrderByComparator orderByComparator) throws SystemException {
		List<LoaiSP> list = findByLoaiSP(loaiSPId, loaiSPName, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last loai s p in the ordered set where loaiSPId = &#63; and loaiSPName = &#63;.
	 *
	 * @param loaiSPId the loai s p ID
	 * @param loaiSPName the loai s p name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching loai s p
	 * @throws com.thanhnhan.NoSuchLoaiSPException if a matching loai s p could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiSP findByLoaiSP_Last(long loaiSPId, String loaiSPName,
		OrderByComparator orderByComparator)
		throws NoSuchLoaiSPException, SystemException {
		LoaiSP loaiSP = fetchByLoaiSP_Last(loaiSPId, loaiSPName,
				orderByComparator);

		if (loaiSP != null) {
			return loaiSP;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("loaiSPId=");
		msg.append(loaiSPId);

		msg.append(", loaiSPName=");
		msg.append(loaiSPName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLoaiSPException(msg.toString());
	}

	/**
	 * Returns the last loai s p in the ordered set where loaiSPId = &#63; and loaiSPName = &#63;.
	 *
	 * @param loaiSPId the loai s p ID
	 * @param loaiSPName the loai s p name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching loai s p, or <code>null</code> if a matching loai s p could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiSP fetchByLoaiSP_Last(long loaiSPId, String loaiSPName,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByLoaiSP(loaiSPId, loaiSPName);

		if (count == 0) {
			return null;
		}

		List<LoaiSP> list = findByLoaiSP(loaiSPId, loaiSPName, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the loai s ps where loaiSPId = &#63; and loaiSPName = &#63; from the database.
	 *
	 * @param loaiSPId the loai s p ID
	 * @param loaiSPName the loai s p name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByLoaiSP(long loaiSPId, String loaiSPName)
		throws SystemException {
		for (LoaiSP loaiSP : findByLoaiSP(loaiSPId, loaiSPName,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(loaiSP);
		}
	}

	/**
	 * Returns the number of loai s ps where loaiSPId = &#63; and loaiSPName = &#63;.
	 *
	 * @param loaiSPId the loai s p ID
	 * @param loaiSPName the loai s p name
	 * @return the number of matching loai s ps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByLoaiSP(long loaiSPId, String loaiSPName)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LOAISP;

		Object[] finderArgs = new Object[] { loaiSPId, loaiSPName };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_LOAISP_WHERE);

			query.append(_FINDER_COLUMN_LOAISP_LOAISPID_2);

			boolean bindLoaiSPName = false;

			if (loaiSPName == null) {
				query.append(_FINDER_COLUMN_LOAISP_LOAISPNAME_1);
			}
			else if (loaiSPName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LOAISP_LOAISPNAME_3);
			}
			else {
				bindLoaiSPName = true;

				query.append(_FINDER_COLUMN_LOAISP_LOAISPNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(loaiSPId);

				if (bindLoaiSPName) {
					qPos.add(loaiSPName);
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

	private static final String _FINDER_COLUMN_LOAISP_LOAISPID_2 = "loaiSP.loaiSPId = ? AND ";
	private static final String _FINDER_COLUMN_LOAISP_LOAISPNAME_1 = "loaiSP.loaiSPName IS NULL";
	private static final String _FINDER_COLUMN_LOAISP_LOAISPNAME_2 = "loaiSP.loaiSPName = ?";
	private static final String _FINDER_COLUMN_LOAISP_LOAISPNAME_3 = "(loaiSP.loaiSPName IS NULL OR loaiSP.loaiSPName = '')";

	public LoaiSPPersistenceImpl() {
		setModelClass(LoaiSP.class);
	}

	/**
	 * Caches the loai s p in the entity cache if it is enabled.
	 *
	 * @param loaiSP the loai s p
	 */
	@Override
	public void cacheResult(LoaiSP loaiSP) {
		EntityCacheUtil.putResult(LoaiSPModelImpl.ENTITY_CACHE_ENABLED,
			LoaiSPImpl.class, loaiSP.getPrimaryKey(), loaiSP);

		loaiSP.resetOriginalValues();
	}

	/**
	 * Caches the loai s ps in the entity cache if it is enabled.
	 *
	 * @param loaiSPs the loai s ps
	 */
	@Override
	public void cacheResult(List<LoaiSP> loaiSPs) {
		for (LoaiSP loaiSP : loaiSPs) {
			if (EntityCacheUtil.getResult(
						LoaiSPModelImpl.ENTITY_CACHE_ENABLED, LoaiSPImpl.class,
						loaiSP.getPrimaryKey()) == null) {
				cacheResult(loaiSP);
			}
			else {
				loaiSP.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all loai s ps.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LoaiSPImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LoaiSPImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the loai s p.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LoaiSP loaiSP) {
		EntityCacheUtil.removeResult(LoaiSPModelImpl.ENTITY_CACHE_ENABLED,
			LoaiSPImpl.class, loaiSP.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<LoaiSP> loaiSPs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LoaiSP loaiSP : loaiSPs) {
			EntityCacheUtil.removeResult(LoaiSPModelImpl.ENTITY_CACHE_ENABLED,
				LoaiSPImpl.class, loaiSP.getPrimaryKey());
		}
	}

	/**
	 * Creates a new loai s p with the primary key. Does not add the loai s p to the database.
	 *
	 * @param loaiSPId the primary key for the new loai s p
	 * @return the new loai s p
	 */
	@Override
	public LoaiSP create(long loaiSPId) {
		LoaiSP loaiSP = new LoaiSPImpl();

		loaiSP.setNew(true);
		loaiSP.setPrimaryKey(loaiSPId);

		return loaiSP;
	}

	/**
	 * Removes the loai s p with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param loaiSPId the primary key of the loai s p
	 * @return the loai s p that was removed
	 * @throws com.thanhnhan.NoSuchLoaiSPException if a loai s p with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiSP remove(long loaiSPId)
		throws NoSuchLoaiSPException, SystemException {
		return remove((Serializable)loaiSPId);
	}

	/**
	 * Removes the loai s p with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the loai s p
	 * @return the loai s p that was removed
	 * @throws com.thanhnhan.NoSuchLoaiSPException if a loai s p with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiSP remove(Serializable primaryKey)
		throws NoSuchLoaiSPException, SystemException {
		Session session = null;

		try {
			session = openSession();

			LoaiSP loaiSP = (LoaiSP)session.get(LoaiSPImpl.class, primaryKey);

			if (loaiSP == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLoaiSPException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(loaiSP);
		}
		catch (NoSuchLoaiSPException nsee) {
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
	protected LoaiSP removeImpl(LoaiSP loaiSP) throws SystemException {
		loaiSP = toUnwrappedModel(loaiSP);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(loaiSP)) {
				loaiSP = (LoaiSP)session.get(LoaiSPImpl.class,
						loaiSP.getPrimaryKeyObj());
			}

			if (loaiSP != null) {
				session.delete(loaiSP);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (loaiSP != null) {
			clearCache(loaiSP);
		}

		return loaiSP;
	}

	@Override
	public LoaiSP updateImpl(com.thanhnhan.model.LoaiSP loaiSP)
		throws SystemException {
		loaiSP = toUnwrappedModel(loaiSP);

		boolean isNew = loaiSP.isNew();

		LoaiSPModelImpl loaiSPModelImpl = (LoaiSPModelImpl)loaiSP;

		Session session = null;

		try {
			session = openSession();

			if (loaiSP.isNew()) {
				session.save(loaiSP);

				loaiSP.setNew(false);
			}
			else {
				session.merge(loaiSP);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !LoaiSPModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((loaiSPModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOAISP.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						loaiSPModelImpl.getOriginalLoaiSPId(),
						loaiSPModelImpl.getOriginalLoaiSPName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOAISP, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOAISP,
					args);

				args = new Object[] {
						loaiSPModelImpl.getLoaiSPId(),
						loaiSPModelImpl.getLoaiSPName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOAISP, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOAISP,
					args);
			}
		}

		EntityCacheUtil.putResult(LoaiSPModelImpl.ENTITY_CACHE_ENABLED,
			LoaiSPImpl.class, loaiSP.getPrimaryKey(), loaiSP);

		return loaiSP;
	}

	protected LoaiSP toUnwrappedModel(LoaiSP loaiSP) {
		if (loaiSP instanceof LoaiSPImpl) {
			return loaiSP;
		}

		LoaiSPImpl loaiSPImpl = new LoaiSPImpl();

		loaiSPImpl.setNew(loaiSP.isNew());
		loaiSPImpl.setPrimaryKey(loaiSP.getPrimaryKey());

		loaiSPImpl.setLoaiSPId(loaiSP.getLoaiSPId());
		loaiSPImpl.setLoaiSPName(loaiSP.getLoaiSPName());

		return loaiSPImpl;
	}

	/**
	 * Returns the loai s p with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the loai s p
	 * @return the loai s p
	 * @throws com.thanhnhan.NoSuchLoaiSPException if a loai s p with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiSP findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLoaiSPException, SystemException {
		LoaiSP loaiSP = fetchByPrimaryKey(primaryKey);

		if (loaiSP == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLoaiSPException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return loaiSP;
	}

	/**
	 * Returns the loai s p with the primary key or throws a {@link com.thanhnhan.NoSuchLoaiSPException} if it could not be found.
	 *
	 * @param loaiSPId the primary key of the loai s p
	 * @return the loai s p
	 * @throws com.thanhnhan.NoSuchLoaiSPException if a loai s p with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiSP findByPrimaryKey(long loaiSPId)
		throws NoSuchLoaiSPException, SystemException {
		return findByPrimaryKey((Serializable)loaiSPId);
	}

	/**
	 * Returns the loai s p with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the loai s p
	 * @return the loai s p, or <code>null</code> if a loai s p with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiSP fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		LoaiSP loaiSP = (LoaiSP)EntityCacheUtil.getResult(LoaiSPModelImpl.ENTITY_CACHE_ENABLED,
				LoaiSPImpl.class, primaryKey);

		if (loaiSP == _nullLoaiSP) {
			return null;
		}

		if (loaiSP == null) {
			Session session = null;

			try {
				session = openSession();

				loaiSP = (LoaiSP)session.get(LoaiSPImpl.class, primaryKey);

				if (loaiSP != null) {
					cacheResult(loaiSP);
				}
				else {
					EntityCacheUtil.putResult(LoaiSPModelImpl.ENTITY_CACHE_ENABLED,
						LoaiSPImpl.class, primaryKey, _nullLoaiSP);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(LoaiSPModelImpl.ENTITY_CACHE_ENABLED,
					LoaiSPImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return loaiSP;
	}

	/**
	 * Returns the loai s p with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param loaiSPId the primary key of the loai s p
	 * @return the loai s p, or <code>null</code> if a loai s p with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiSP fetchByPrimaryKey(long loaiSPId) throws SystemException {
		return fetchByPrimaryKey((Serializable)loaiSPId);
	}

	/**
	 * Returns all the loai s ps.
	 *
	 * @return the loai s ps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LoaiSP> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the loai s ps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.LoaiSPModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of loai s ps
	 * @param end the upper bound of the range of loai s ps (not inclusive)
	 * @return the range of loai s ps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LoaiSP> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the loai s ps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thanhnhan.model.impl.LoaiSPModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of loai s ps
	 * @param end the upper bound of the range of loai s ps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of loai s ps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LoaiSP> findAll(int start, int end,
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

		List<LoaiSP> list = (List<LoaiSP>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LOAISP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LOAISP;

				if (pagination) {
					sql = sql.concat(LoaiSPModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LoaiSP>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LoaiSP>(list);
				}
				else {
					list = (List<LoaiSP>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the loai s ps from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (LoaiSP loaiSP : findAll()) {
			remove(loaiSP);
		}
	}

	/**
	 * Returns the number of loai s ps.
	 *
	 * @return the number of loai s ps
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

				Query q = session.createQuery(_SQL_COUNT_LOAISP);

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

	/**
	 * Initializes the loai s p persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.thanhnhan.model.LoaiSP")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<LoaiSP>> listenersList = new ArrayList<ModelListener<LoaiSP>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<LoaiSP>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(LoaiSPImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_LOAISP = "SELECT loaiSP FROM LoaiSP loaiSP";
	private static final String _SQL_SELECT_LOAISP_WHERE = "SELECT loaiSP FROM LoaiSP loaiSP WHERE ";
	private static final String _SQL_COUNT_LOAISP = "SELECT COUNT(loaiSP) FROM LoaiSP loaiSP";
	private static final String _SQL_COUNT_LOAISP_WHERE = "SELECT COUNT(loaiSP) FROM LoaiSP loaiSP WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "loaiSP.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LoaiSP exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No LoaiSP exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LoaiSPPersistenceImpl.class);
	private static LoaiSP _nullLoaiSP = new LoaiSPImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<LoaiSP> toCacheModel() {
				return _nullLoaiSPCacheModel;
			}
		};

	private static CacheModel<LoaiSP> _nullLoaiSPCacheModel = new CacheModel<LoaiSP>() {
			@Override
			public LoaiSP toEntityModel() {
				return _nullLoaiSP;
			}
		};
}