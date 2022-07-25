/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.training.service.builder.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import com.training.service.builder.exception.NoSuchuserextException;
import com.training.service.builder.model.impl.userextImpl;
import com.training.service.builder.model.impl.userextModelImpl;
import com.training.service.builder.model.userext;
import com.training.service.builder.service.persistence.impl.constants.KritikaPersistenceConstants;
import com.training.service.builder.service.persistence.userextPersistence;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the userext service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = userextPersistence.class)
public class userextPersistenceImpl
	extends BasePersistenceImpl<userext> implements userextPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>userextUtil</code> to access the userext persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		userextImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the userexts where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching userexts
	 */
	@Override
	public List<userext> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the userexts where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>userextModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of userexts
	 * @param end the upper bound of the range of userexts (not inclusive)
	 * @return the range of matching userexts
	 */
	@Override
	public List<userext> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the userexts where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>userextModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of userexts
	 * @param end the upper bound of the range of userexts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching userexts
	 */
	@Override
	public List<userext> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<userext> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the userexts where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>userextModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of userexts
	 * @param end the upper bound of the range of userexts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching userexts
	 */
	@Override
	public List<userext> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<userext> orderByComparator, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<userext> list = null;

		if (useFinderCache) {
			list = (List<userext>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (userext userext : list) {
					if (!uuid.equals(userext.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_USEREXT_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(userextModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<userext>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first userext in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching userext
	 * @throws NoSuchuserextException if a matching userext could not be found
	 */
	@Override
	public userext findByUuid_First(
			String uuid, OrderByComparator<userext> orderByComparator)
		throws NoSuchuserextException {

		userext userext = fetchByUuid_First(uuid, orderByComparator);

		if (userext != null) {
			return userext;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchuserextException(sb.toString());
	}

	/**
	 * Returns the first userext in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching userext, or <code>null</code> if a matching userext could not be found
	 */
	@Override
	public userext fetchByUuid_First(
		String uuid, OrderByComparator<userext> orderByComparator) {

		List<userext> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last userext in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching userext
	 * @throws NoSuchuserextException if a matching userext could not be found
	 */
	@Override
	public userext findByUuid_Last(
			String uuid, OrderByComparator<userext> orderByComparator)
		throws NoSuchuserextException {

		userext userext = fetchByUuid_Last(uuid, orderByComparator);

		if (userext != null) {
			return userext;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchuserextException(sb.toString());
	}

	/**
	 * Returns the last userext in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching userext, or <code>null</code> if a matching userext could not be found
	 */
	@Override
	public userext fetchByUuid_Last(
		String uuid, OrderByComparator<userext> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<userext> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the userexts before and after the current userext in the ordered set where uuid = &#63;.
	 *
	 * @param userextId the primary key of the current userext
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next userext
	 * @throws NoSuchuserextException if a userext with the primary key could not be found
	 */
	@Override
	public userext[] findByUuid_PrevAndNext(
			long userextId, String uuid,
			OrderByComparator<userext> orderByComparator)
		throws NoSuchuserextException {

		uuid = Objects.toString(uuid, "");

		userext userext = findByPrimaryKey(userextId);

		Session session = null;

		try {
			session = openSession();

			userext[] array = new userextImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, userext, uuid, orderByComparator, true);

			array[1] = userext;

			array[2] = getByUuid_PrevAndNext(
				session, userext, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected userext getByUuid_PrevAndNext(
		Session session, userext userext, String uuid,
		OrderByComparator<userext> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_USEREXT_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(userextModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(userext)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<userext> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the userexts where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (userext userext :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(userext);
		}
	}

	/**
	 * Returns the number of userexts where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching userexts
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_USEREXT_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 = "userext.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(userext.uuid IS NULL OR userext.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the userext where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchuserextException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching userext
	 * @throws NoSuchuserextException if a matching userext could not be found
	 */
	@Override
	public userext findByUUID_G(String uuid, long groupId)
		throws NoSuchuserextException {

		userext userext = fetchByUUID_G(uuid, groupId);

		if (userext == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("uuid=");
			sb.append(uuid);

			sb.append(", groupId=");
			sb.append(groupId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchuserextException(sb.toString());
		}

		return userext;
	}

	/**
	 * Returns the userext where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching userext, or <code>null</code> if a matching userext could not be found
	 */
	@Override
	public userext fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the userext where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching userext, or <code>null</code> if a matching userext could not be found
	 */
	@Override
	public userext fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs, this);
		}

		if (result instanceof userext) {
			userext userext = (userext)result;

			if (!Objects.equals(uuid, userext.getUuid()) ||
				(groupId != userext.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_USEREXT_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				List<userext> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					userext userext = list.get(0);

					result = userext;

					cacheResult(userext);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (userext)result;
		}
	}

	/**
	 * Removes the userext where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the userext that was removed
	 */
	@Override
	public userext removeByUUID_G(String uuid, long groupId)
		throws NoSuchuserextException {

		userext userext = findByUUID_G(uuid, groupId);

		return remove(userext);
	}

	/**
	 * Returns the number of userexts where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching userexts
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_USEREXT_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"userext.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(userext.uuid IS NULL OR userext.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"userext.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the userexts where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching userexts
	 */
	@Override
	public List<userext> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the userexts where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>userextModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of userexts
	 * @param end the upper bound of the range of userexts (not inclusive)
	 * @return the range of matching userexts
	 */
	@Override
	public List<userext> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the userexts where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>userextModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of userexts
	 * @param end the upper bound of the range of userexts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching userexts
	 */
	@Override
	public List<userext> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<userext> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the userexts where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>userextModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of userexts
	 * @param end the upper bound of the range of userexts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching userexts
	 */
	@Override
	public List<userext> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<userext> orderByComparator, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid_C;
				finderArgs = new Object[] {uuid, companyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid_C;
			finderArgs = new Object[] {
				uuid, companyId, start, end, orderByComparator
			};
		}

		List<userext> list = null;

		if (useFinderCache) {
			list = (List<userext>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (userext userext : list) {
					if (!uuid.equals(userext.getUuid()) ||
						(companyId != userext.getCompanyId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_USEREXT_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(userextModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				list = (List<userext>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first userext in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching userext
	 * @throws NoSuchuserextException if a matching userext could not be found
	 */
	@Override
	public userext findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<userext> orderByComparator)
		throws NoSuchuserextException {

		userext userext = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (userext != null) {
			return userext;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchuserextException(sb.toString());
	}

	/**
	 * Returns the first userext in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching userext, or <code>null</code> if a matching userext could not be found
	 */
	@Override
	public userext fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<userext> orderByComparator) {

		List<userext> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last userext in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching userext
	 * @throws NoSuchuserextException if a matching userext could not be found
	 */
	@Override
	public userext findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<userext> orderByComparator)
		throws NoSuchuserextException {

		userext userext = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (userext != null) {
			return userext;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchuserextException(sb.toString());
	}

	/**
	 * Returns the last userext in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching userext, or <code>null</code> if a matching userext could not be found
	 */
	@Override
	public userext fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<userext> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<userext> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the userexts before and after the current userext in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param userextId the primary key of the current userext
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next userext
	 * @throws NoSuchuserextException if a userext with the primary key could not be found
	 */
	@Override
	public userext[] findByUuid_C_PrevAndNext(
			long userextId, String uuid, long companyId,
			OrderByComparator<userext> orderByComparator)
		throws NoSuchuserextException {

		uuid = Objects.toString(uuid, "");

		userext userext = findByPrimaryKey(userextId);

		Session session = null;

		try {
			session = openSession();

			userext[] array = new userextImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, userext, uuid, companyId, orderByComparator, true);

			array[1] = userext;

			array[2] = getByUuid_C_PrevAndNext(
				session, userext, uuid, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected userext getByUuid_C_PrevAndNext(
		Session session, userext userext, String uuid, long companyId,
		OrderByComparator<userext> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_USEREXT_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(userextModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(userext)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<userext> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the userexts where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (userext userext :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(userext);
		}
	}

	/**
	 * Returns the number of userexts where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching userexts
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_USEREXT_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_2 =
		"userext.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(userext.uuid IS NULL OR userext.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"userext.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByemail;
	private FinderPath _finderPathWithoutPaginationFindByemail;
	private FinderPath _finderPathCountByemail;

	/**
	 * Returns all the userexts where email = &#63;.
	 *
	 * @param email the email
	 * @return the matching userexts
	 */
	@Override
	public List<userext> findByemail(String email) {
		return findByemail(email, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the userexts where email = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>userextModelImpl</code>.
	 * </p>
	 *
	 * @param email the email
	 * @param start the lower bound of the range of userexts
	 * @param end the upper bound of the range of userexts (not inclusive)
	 * @return the range of matching userexts
	 */
	@Override
	public List<userext> findByemail(String email, int start, int end) {
		return findByemail(email, start, end, null);
	}

	/**
	 * Returns an ordered range of all the userexts where email = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>userextModelImpl</code>.
	 * </p>
	 *
	 * @param email the email
	 * @param start the lower bound of the range of userexts
	 * @param end the upper bound of the range of userexts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching userexts
	 */
	@Override
	public List<userext> findByemail(
		String email, int start, int end,
		OrderByComparator<userext> orderByComparator) {

		return findByemail(email, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the userexts where email = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>userextModelImpl</code>.
	 * </p>
	 *
	 * @param email the email
	 * @param start the lower bound of the range of userexts
	 * @param end the upper bound of the range of userexts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching userexts
	 */
	@Override
	public List<userext> findByemail(
		String email, int start, int end,
		OrderByComparator<userext> orderByComparator, boolean useFinderCache) {

		email = Objects.toString(email, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByemail;
				finderArgs = new Object[] {email};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByemail;
			finderArgs = new Object[] {email, start, end, orderByComparator};
		}

		List<userext> list = null;

		if (useFinderCache) {
			list = (List<userext>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (userext userext : list) {
					if (!email.equals(userext.getEmail())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_USEREXT_WHERE);

			boolean bindEmail = false;

			if (email.isEmpty()) {
				sb.append(_FINDER_COLUMN_EMAIL_EMAIL_3);
			}
			else {
				bindEmail = true;

				sb.append(_FINDER_COLUMN_EMAIL_EMAIL_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(userextModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEmail) {
					queryPos.add(email);
				}

				list = (List<userext>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first userext in the ordered set where email = &#63;.
	 *
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching userext
	 * @throws NoSuchuserextException if a matching userext could not be found
	 */
	@Override
	public userext findByemail_First(
			String email, OrderByComparator<userext> orderByComparator)
		throws NoSuchuserextException {

		userext userext = fetchByemail_First(email, orderByComparator);

		if (userext != null) {
			return userext;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("email=");
		sb.append(email);

		sb.append("}");

		throw new NoSuchuserextException(sb.toString());
	}

	/**
	 * Returns the first userext in the ordered set where email = &#63;.
	 *
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching userext, or <code>null</code> if a matching userext could not be found
	 */
	@Override
	public userext fetchByemail_First(
		String email, OrderByComparator<userext> orderByComparator) {

		List<userext> list = findByemail(email, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last userext in the ordered set where email = &#63;.
	 *
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching userext
	 * @throws NoSuchuserextException if a matching userext could not be found
	 */
	@Override
	public userext findByemail_Last(
			String email, OrderByComparator<userext> orderByComparator)
		throws NoSuchuserextException {

		userext userext = fetchByemail_Last(email, orderByComparator);

		if (userext != null) {
			return userext;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("email=");
		sb.append(email);

		sb.append("}");

		throw new NoSuchuserextException(sb.toString());
	}

	/**
	 * Returns the last userext in the ordered set where email = &#63;.
	 *
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching userext, or <code>null</code> if a matching userext could not be found
	 */
	@Override
	public userext fetchByemail_Last(
		String email, OrderByComparator<userext> orderByComparator) {

		int count = countByemail(email);

		if (count == 0) {
			return null;
		}

		List<userext> list = findByemail(
			email, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the userexts before and after the current userext in the ordered set where email = &#63;.
	 *
	 * @param userextId the primary key of the current userext
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next userext
	 * @throws NoSuchuserextException if a userext with the primary key could not be found
	 */
	@Override
	public userext[] findByemail_PrevAndNext(
			long userextId, String email,
			OrderByComparator<userext> orderByComparator)
		throws NoSuchuserextException {

		email = Objects.toString(email, "");

		userext userext = findByPrimaryKey(userextId);

		Session session = null;

		try {
			session = openSession();

			userext[] array = new userextImpl[3];

			array[0] = getByemail_PrevAndNext(
				session, userext, email, orderByComparator, true);

			array[1] = userext;

			array[2] = getByemail_PrevAndNext(
				session, userext, email, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected userext getByemail_PrevAndNext(
		Session session, userext userext, String email,
		OrderByComparator<userext> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_USEREXT_WHERE);

		boolean bindEmail = false;

		if (email.isEmpty()) {
			sb.append(_FINDER_COLUMN_EMAIL_EMAIL_3);
		}
		else {
			bindEmail = true;

			sb.append(_FINDER_COLUMN_EMAIL_EMAIL_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(userextModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindEmail) {
			queryPos.add(email);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(userext)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<userext> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the userexts where email = &#63; from the database.
	 *
	 * @param email the email
	 */
	@Override
	public void removeByemail(String email) {
		for (userext userext :
				findByemail(
					email, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(userext);
		}
	}

	/**
	 * Returns the number of userexts where email = &#63;.
	 *
	 * @param email the email
	 * @return the number of matching userexts
	 */
	@Override
	public int countByemail(String email) {
		email = Objects.toString(email, "");

		FinderPath finderPath = _finderPathCountByemail;

		Object[] finderArgs = new Object[] {email};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_USEREXT_WHERE);

			boolean bindEmail = false;

			if (email.isEmpty()) {
				sb.append(_FINDER_COLUMN_EMAIL_EMAIL_3);
			}
			else {
				bindEmail = true;

				sb.append(_FINDER_COLUMN_EMAIL_EMAIL_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEmail) {
					queryPos.add(email);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_EMAIL_EMAIL_2 =
		"userext.email = ?";

	private static final String _FINDER_COLUMN_EMAIL_EMAIL_3 =
		"(userext.email IS NULL OR userext.email = '')";

	private FinderPath _finderPathWithPaginationFindByofficeID;
	private FinderPath _finderPathWithoutPaginationFindByofficeID;
	private FinderPath _finderPathCountByofficeID;

	/**
	 * Returns all the userexts where officeID = &#63;.
	 *
	 * @param officeID the office ID
	 * @return the matching userexts
	 */
	@Override
	public List<userext> findByofficeID(long officeID) {
		return findByofficeID(
			officeID, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the userexts where officeID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>userextModelImpl</code>.
	 * </p>
	 *
	 * @param officeID the office ID
	 * @param start the lower bound of the range of userexts
	 * @param end the upper bound of the range of userexts (not inclusive)
	 * @return the range of matching userexts
	 */
	@Override
	public List<userext> findByofficeID(long officeID, int start, int end) {
		return findByofficeID(officeID, start, end, null);
	}

	/**
	 * Returns an ordered range of all the userexts where officeID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>userextModelImpl</code>.
	 * </p>
	 *
	 * @param officeID the office ID
	 * @param start the lower bound of the range of userexts
	 * @param end the upper bound of the range of userexts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching userexts
	 */
	@Override
	public List<userext> findByofficeID(
		long officeID, int start, int end,
		OrderByComparator<userext> orderByComparator) {

		return findByofficeID(officeID, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the userexts where officeID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>userextModelImpl</code>.
	 * </p>
	 *
	 * @param officeID the office ID
	 * @param start the lower bound of the range of userexts
	 * @param end the upper bound of the range of userexts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching userexts
	 */
	@Override
	public List<userext> findByofficeID(
		long officeID, int start, int end,
		OrderByComparator<userext> orderByComparator, boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByofficeID;
				finderArgs = new Object[] {officeID};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByofficeID;
			finderArgs = new Object[] {officeID, start, end, orderByComparator};
		}

		List<userext> list = null;

		if (useFinderCache) {
			list = (List<userext>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (userext userext : list) {
					if (officeID != userext.getOfficeID()) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_USEREXT_WHERE);

			sb.append(_FINDER_COLUMN_OFFICEID_OFFICEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(userextModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(officeID);

				list = (List<userext>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first userext in the ordered set where officeID = &#63;.
	 *
	 * @param officeID the office ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching userext
	 * @throws NoSuchuserextException if a matching userext could not be found
	 */
	@Override
	public userext findByofficeID_First(
			long officeID, OrderByComparator<userext> orderByComparator)
		throws NoSuchuserextException {

		userext userext = fetchByofficeID_First(officeID, orderByComparator);

		if (userext != null) {
			return userext;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("officeID=");
		sb.append(officeID);

		sb.append("}");

		throw new NoSuchuserextException(sb.toString());
	}

	/**
	 * Returns the first userext in the ordered set where officeID = &#63;.
	 *
	 * @param officeID the office ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching userext, or <code>null</code> if a matching userext could not be found
	 */
	@Override
	public userext fetchByofficeID_First(
		long officeID, OrderByComparator<userext> orderByComparator) {

		List<userext> list = findByofficeID(officeID, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last userext in the ordered set where officeID = &#63;.
	 *
	 * @param officeID the office ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching userext
	 * @throws NoSuchuserextException if a matching userext could not be found
	 */
	@Override
	public userext findByofficeID_Last(
			long officeID, OrderByComparator<userext> orderByComparator)
		throws NoSuchuserextException {

		userext userext = fetchByofficeID_Last(officeID, orderByComparator);

		if (userext != null) {
			return userext;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("officeID=");
		sb.append(officeID);

		sb.append("}");

		throw new NoSuchuserextException(sb.toString());
	}

	/**
	 * Returns the last userext in the ordered set where officeID = &#63;.
	 *
	 * @param officeID the office ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching userext, or <code>null</code> if a matching userext could not be found
	 */
	@Override
	public userext fetchByofficeID_Last(
		long officeID, OrderByComparator<userext> orderByComparator) {

		int count = countByofficeID(officeID);

		if (count == 0) {
			return null;
		}

		List<userext> list = findByofficeID(
			officeID, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the userexts before and after the current userext in the ordered set where officeID = &#63;.
	 *
	 * @param userextId the primary key of the current userext
	 * @param officeID the office ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next userext
	 * @throws NoSuchuserextException if a userext with the primary key could not be found
	 */
	@Override
	public userext[] findByofficeID_PrevAndNext(
			long userextId, long officeID,
			OrderByComparator<userext> orderByComparator)
		throws NoSuchuserextException {

		userext userext = findByPrimaryKey(userextId);

		Session session = null;

		try {
			session = openSession();

			userext[] array = new userextImpl[3];

			array[0] = getByofficeID_PrevAndNext(
				session, userext, officeID, orderByComparator, true);

			array[1] = userext;

			array[2] = getByofficeID_PrevAndNext(
				session, userext, officeID, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected userext getByofficeID_PrevAndNext(
		Session session, userext userext, long officeID,
		OrderByComparator<userext> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_USEREXT_WHERE);

		sb.append(_FINDER_COLUMN_OFFICEID_OFFICEID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(userextModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(officeID);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(userext)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<userext> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the userexts where officeID = &#63; from the database.
	 *
	 * @param officeID the office ID
	 */
	@Override
	public void removeByofficeID(long officeID) {
		for (userext userext :
				findByofficeID(
					officeID, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(userext);
		}
	}

	/**
	 * Returns the number of userexts where officeID = &#63;.
	 *
	 * @param officeID the office ID
	 * @return the number of matching userexts
	 */
	@Override
	public int countByofficeID(long officeID) {
		FinderPath finderPath = _finderPathCountByofficeID;

		Object[] finderArgs = new Object[] {officeID};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_USEREXT_WHERE);

			sb.append(_FINDER_COLUMN_OFFICEID_OFFICEID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(officeID);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_OFFICEID_OFFICEID_2 =
		"userext.officeID = ?";

	public userextPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(userext.class);

		setModelImplClass(userextImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the userext in the entity cache if it is enabled.
	 *
	 * @param userext the userext
	 */
	@Override
	public void cacheResult(userext userext) {
		entityCache.putResult(
			userextImpl.class, userext.getPrimaryKey(), userext);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {userext.getUuid(), userext.getGroupId()}, userext);
	}

	/**
	 * Caches the userexts in the entity cache if it is enabled.
	 *
	 * @param userexts the userexts
	 */
	@Override
	public void cacheResult(List<userext> userexts) {
		for (userext userext : userexts) {
			if (entityCache.getResult(
					userextImpl.class, userext.getPrimaryKey()) == null) {

				cacheResult(userext);
			}
		}
	}

	/**
	 * Clears the cache for all userexts.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(userextImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the userext.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(userext userext) {
		entityCache.removeResult(userextImpl.class, userext);
	}

	@Override
	public void clearCache(List<userext> userexts) {
		for (userext userext : userexts) {
			entityCache.removeResult(userextImpl.class, userext);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(userextImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(userextModelImpl userextModelImpl) {
		Object[] args = new Object[] {
			userextModelImpl.getUuid(), userextModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, userextModelImpl, false);
	}

	/**
	 * Creates a new userext with the primary key. Does not add the userext to the database.
	 *
	 * @param userextId the primary key for the new userext
	 * @return the new userext
	 */
	@Override
	public userext create(long userextId) {
		userext userext = new userextImpl();

		userext.setNew(true);
		userext.setPrimaryKey(userextId);

		String uuid = PortalUUIDUtil.generate();

		userext.setUuid(uuid);

		userext.setCompanyId(CompanyThreadLocal.getCompanyId());

		return userext;
	}

	/**
	 * Removes the userext with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userextId the primary key of the userext
	 * @return the userext that was removed
	 * @throws NoSuchuserextException if a userext with the primary key could not be found
	 */
	@Override
	public userext remove(long userextId) throws NoSuchuserextException {
		return remove((Serializable)userextId);
	}

	/**
	 * Removes the userext with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the userext
	 * @return the userext that was removed
	 * @throws NoSuchuserextException if a userext with the primary key could not be found
	 */
	@Override
	public userext remove(Serializable primaryKey)
		throws NoSuchuserextException {

		Session session = null;

		try {
			session = openSession();

			userext userext = (userext)session.get(
				userextImpl.class, primaryKey);

			if (userext == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchuserextException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(userext);
		}
		catch (NoSuchuserextException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected userext removeImpl(userext userext) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(userext)) {
				userext = (userext)session.get(
					userextImpl.class, userext.getPrimaryKeyObj());
			}

			if (userext != null) {
				session.delete(userext);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (userext != null) {
			clearCache(userext);
		}

		return userext;
	}

	@Override
	public userext updateImpl(userext userext) {
		boolean isNew = userext.isNew();

		if (!(userext instanceof userextModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(userext.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(userext);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in userext proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom userext implementation " +
					userext.getClass());
		}

		userextModelImpl userextModelImpl = (userextModelImpl)userext;

		if (Validator.isNull(userext.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			userext.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (userext.getCreateDate() == null)) {
			if (serviceContext == null) {
				userext.setCreateDate(now);
			}
			else {
				userext.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!userextModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				userext.setModifiedDate(now);
			}
			else {
				userext.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(userext);
			}
			else {
				userext = (userext)session.merge(userext);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(userextImpl.class, userextModelImpl, false, true);

		cacheUniqueFindersCache(userextModelImpl);

		if (isNew) {
			userext.setNew(false);
		}

		userext.resetOriginalValues();

		return userext;
	}

	/**
	 * Returns the userext with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the userext
	 * @return the userext
	 * @throws NoSuchuserextException if a userext with the primary key could not be found
	 */
	@Override
	public userext findByPrimaryKey(Serializable primaryKey)
		throws NoSuchuserextException {

		userext userext = fetchByPrimaryKey(primaryKey);

		if (userext == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchuserextException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return userext;
	}

	/**
	 * Returns the userext with the primary key or throws a <code>NoSuchuserextException</code> if it could not be found.
	 *
	 * @param userextId the primary key of the userext
	 * @return the userext
	 * @throws NoSuchuserextException if a userext with the primary key could not be found
	 */
	@Override
	public userext findByPrimaryKey(long userextId)
		throws NoSuchuserextException {

		return findByPrimaryKey((Serializable)userextId);
	}

	/**
	 * Returns the userext with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userextId the primary key of the userext
	 * @return the userext, or <code>null</code> if a userext with the primary key could not be found
	 */
	@Override
	public userext fetchByPrimaryKey(long userextId) {
		return fetchByPrimaryKey((Serializable)userextId);
	}

	/**
	 * Returns all the userexts.
	 *
	 * @return the userexts
	 */
	@Override
	public List<userext> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the userexts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>userextModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of userexts
	 * @param end the upper bound of the range of userexts (not inclusive)
	 * @return the range of userexts
	 */
	@Override
	public List<userext> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the userexts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>userextModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of userexts
	 * @param end the upper bound of the range of userexts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of userexts
	 */
	@Override
	public List<userext> findAll(
		int start, int end, OrderByComparator<userext> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the userexts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>userextModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of userexts
	 * @param end the upper bound of the range of userexts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of userexts
	 */
	@Override
	public List<userext> findAll(
		int start, int end, OrderByComparator<userext> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<userext> list = null;

		if (useFinderCache) {
			list = (List<userext>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_USEREXT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_USEREXT;

				sql = sql.concat(userextModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<userext>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the userexts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (userext userext : findAll()) {
			remove(userext);
		}
	}

	/**
	 * Returns the number of userexts.
	 *
	 * @return the number of userexts
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_USEREXT);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "userextId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_USEREXT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return userextModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the userext persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class, new userextModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", userext.class.getName()));

		_finderPathWithPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathFetchByUUID_G = _createFinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, true);

		_finderPathCountByUUID_G = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, false);

		_finderPathWithPaginationFindByUuid_C = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathWithoutPaginationFindByUuid_C = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathCountByUuid_C = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, false);

		_finderPathWithPaginationFindByemail = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByemail",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"email"}, true);

		_finderPathWithoutPaginationFindByemail = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByemail",
			new String[] {String.class.getName()}, new String[] {"email"},
			true);

		_finderPathCountByemail = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByemail",
			new String[] {String.class.getName()}, new String[] {"email"},
			false);

		_finderPathWithPaginationFindByofficeID = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByofficeID",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"officeID"}, true);

		_finderPathWithoutPaginationFindByofficeID = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByofficeID",
			new String[] {Long.class.getName()}, new String[] {"officeID"},
			true);

		_finderPathCountByofficeID = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByofficeID",
			new String[] {Long.class.getName()}, new String[] {"officeID"},
			false);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(userextImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();

		for (ServiceRegistration<FinderPath> serviceRegistration :
				_serviceRegistrations) {

			serviceRegistration.unregister();
		}
	}

	@Override
	@Reference(
		target = KritikaPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = KritikaPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = KritikaPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private BundleContext _bundleContext;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_USEREXT =
		"SELECT userext FROM userext userext";

	private static final String _SQL_SELECT_USEREXT_WHERE =
		"SELECT userext FROM userext userext WHERE ";

	private static final String _SQL_COUNT_USEREXT =
		"SELECT COUNT(userext) FROM userext userext";

	private static final String _SQL_COUNT_USEREXT_WHERE =
		"SELECT COUNT(userext) FROM userext userext WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "userext.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No userext exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No userext exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		userextPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	private FinderPath _createFinderPath(
		String cacheName, String methodName, String[] params,
		String[] columnNames, boolean baseModelResult) {

		FinderPath finderPath = new FinderPath(
			cacheName, methodName, params, columnNames, baseModelResult);

		if (!cacheName.equals(FINDER_CLASS_NAME_LIST_WITH_PAGINATION)) {
			_serviceRegistrations.add(
				_bundleContext.registerService(
					FinderPath.class, finderPath,
					MapUtil.singletonDictionary("cache.name", cacheName)));
		}

		return finderPath;
	}

	private Set<ServiceRegistration<FinderPath>> _serviceRegistrations =
		new HashSet<>();
	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class userextModelArgumentsResolver
		implements ArgumentsResolver {

		@Override
		public Object[] getArguments(
			FinderPath finderPath, BaseModel<?> baseModel, boolean checkColumn,
			boolean original) {

			String[] columnNames = finderPath.getColumnNames();

			if ((columnNames == null) || (columnNames.length == 0)) {
				if (baseModel.isNew()) {
					return FINDER_ARGS_EMPTY;
				}

				return null;
			}

			userextModelImpl userextModelImpl = (userextModelImpl)baseModel;

			long columnBitmask = userextModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(userextModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						userextModelImpl.getColumnBitmask(columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(userextModelImpl, columnNames, original);
			}

			return null;
		}

		private Object[] _getValue(
			userextModelImpl userextModelImpl, String[] columnNames,
			boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] = userextModelImpl.getColumnOriginalValue(
						columnName);
				}
				else {
					arguments[i] = userextModelImpl.getColumnValue(columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}