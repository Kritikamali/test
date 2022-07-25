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

package com.training.service.builder.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.training.service.builder.model.userext;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the userext service. This utility wraps <code>com.training.service.builder.service.persistence.impl.userextPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see userextPersistence
 * @generated
 */
public class userextUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(userext userext) {
		getPersistence().clearCache(userext);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, userext> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<userext> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<userext> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<userext> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<userext> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static userext update(userext userext) {
		return getPersistence().update(userext);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static userext update(
		userext userext, ServiceContext serviceContext) {

		return getPersistence().update(userext, serviceContext);
	}

	/**
	 * Returns all the userexts where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching userexts
	 */
	public static List<userext> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
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
	public static List<userext> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
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
	public static List<userext> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<userext> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
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
	public static List<userext> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<userext> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first userext in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching userext
	 * @throws NoSuchuserextException if a matching userext could not be found
	 */
	public static userext findByUuid_First(
			String uuid, OrderByComparator<userext> orderByComparator)
		throws com.training.service.builder.exception.NoSuchuserextException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first userext in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching userext, or <code>null</code> if a matching userext could not be found
	 */
	public static userext fetchByUuid_First(
		String uuid, OrderByComparator<userext> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last userext in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching userext
	 * @throws NoSuchuserextException if a matching userext could not be found
	 */
	public static userext findByUuid_Last(
			String uuid, OrderByComparator<userext> orderByComparator)
		throws com.training.service.builder.exception.NoSuchuserextException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last userext in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching userext, or <code>null</code> if a matching userext could not be found
	 */
	public static userext fetchByUuid_Last(
		String uuid, OrderByComparator<userext> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
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
	public static userext[] findByUuid_PrevAndNext(
			long userextId, String uuid,
			OrderByComparator<userext> orderByComparator)
		throws com.training.service.builder.exception.NoSuchuserextException {

		return getPersistence().findByUuid_PrevAndNext(
			userextId, uuid, orderByComparator);
	}

	/**
	 * Removes all the userexts where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of userexts where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching userexts
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the userext where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchuserextException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching userext
	 * @throws NoSuchuserextException if a matching userext could not be found
	 */
	public static userext findByUUID_G(String uuid, long groupId)
		throws com.training.service.builder.exception.NoSuchuserextException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the userext where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching userext, or <code>null</code> if a matching userext could not be found
	 */
	public static userext fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the userext where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching userext, or <code>null</code> if a matching userext could not be found
	 */
	public static userext fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the userext where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the userext that was removed
	 */
	public static userext removeByUUID_G(String uuid, long groupId)
		throws com.training.service.builder.exception.NoSuchuserextException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of userexts where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching userexts
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the userexts where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching userexts
	 */
	public static List<userext> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
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
	public static List<userext> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
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
	public static List<userext> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<userext> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
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
	public static List<userext> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<userext> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
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
	public static userext findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<userext> orderByComparator)
		throws com.training.service.builder.exception.NoSuchuserextException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first userext in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching userext, or <code>null</code> if a matching userext could not be found
	 */
	public static userext fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<userext> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
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
	public static userext findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<userext> orderByComparator)
		throws com.training.service.builder.exception.NoSuchuserextException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last userext in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching userext, or <code>null</code> if a matching userext could not be found
	 */
	public static userext fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<userext> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
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
	public static userext[] findByUuid_C_PrevAndNext(
			long userextId, String uuid, long companyId,
			OrderByComparator<userext> orderByComparator)
		throws com.training.service.builder.exception.NoSuchuserextException {

		return getPersistence().findByUuid_C_PrevAndNext(
			userextId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the userexts where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of userexts where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching userexts
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the userexts where email = &#63;.
	 *
	 * @param email the email
	 * @return the matching userexts
	 */
	public static List<userext> findByemail(String email) {
		return getPersistence().findByemail(email);
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
	public static List<userext> findByemail(String email, int start, int end) {
		return getPersistence().findByemail(email, start, end);
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
	public static List<userext> findByemail(
		String email, int start, int end,
		OrderByComparator<userext> orderByComparator) {

		return getPersistence().findByemail(
			email, start, end, orderByComparator);
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
	public static List<userext> findByemail(
		String email, int start, int end,
		OrderByComparator<userext> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByemail(
			email, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first userext in the ordered set where email = &#63;.
	 *
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching userext
	 * @throws NoSuchuserextException if a matching userext could not be found
	 */
	public static userext findByemail_First(
			String email, OrderByComparator<userext> orderByComparator)
		throws com.training.service.builder.exception.NoSuchuserextException {

		return getPersistence().findByemail_First(email, orderByComparator);
	}

	/**
	 * Returns the first userext in the ordered set where email = &#63;.
	 *
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching userext, or <code>null</code> if a matching userext could not be found
	 */
	public static userext fetchByemail_First(
		String email, OrderByComparator<userext> orderByComparator) {

		return getPersistence().fetchByemail_First(email, orderByComparator);
	}

	/**
	 * Returns the last userext in the ordered set where email = &#63;.
	 *
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching userext
	 * @throws NoSuchuserextException if a matching userext could not be found
	 */
	public static userext findByemail_Last(
			String email, OrderByComparator<userext> orderByComparator)
		throws com.training.service.builder.exception.NoSuchuserextException {

		return getPersistence().findByemail_Last(email, orderByComparator);
	}

	/**
	 * Returns the last userext in the ordered set where email = &#63;.
	 *
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching userext, or <code>null</code> if a matching userext could not be found
	 */
	public static userext fetchByemail_Last(
		String email, OrderByComparator<userext> orderByComparator) {

		return getPersistence().fetchByemail_Last(email, orderByComparator);
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
	public static userext[] findByemail_PrevAndNext(
			long userextId, String email,
			OrderByComparator<userext> orderByComparator)
		throws com.training.service.builder.exception.NoSuchuserextException {

		return getPersistence().findByemail_PrevAndNext(
			userextId, email, orderByComparator);
	}

	/**
	 * Removes all the userexts where email = &#63; from the database.
	 *
	 * @param email the email
	 */
	public static void removeByemail(String email) {
		getPersistence().removeByemail(email);
	}

	/**
	 * Returns the number of userexts where email = &#63;.
	 *
	 * @param email the email
	 * @return the number of matching userexts
	 */
	public static int countByemail(String email) {
		return getPersistence().countByemail(email);
	}

	/**
	 * Returns all the userexts where officeID = &#63;.
	 *
	 * @param officeID the office ID
	 * @return the matching userexts
	 */
	public static List<userext> findByofficeID(long officeID) {
		return getPersistence().findByofficeID(officeID);
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
	public static List<userext> findByofficeID(
		long officeID, int start, int end) {

		return getPersistence().findByofficeID(officeID, start, end);
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
	public static List<userext> findByofficeID(
		long officeID, int start, int end,
		OrderByComparator<userext> orderByComparator) {

		return getPersistence().findByofficeID(
			officeID, start, end, orderByComparator);
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
	public static List<userext> findByofficeID(
		long officeID, int start, int end,
		OrderByComparator<userext> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByofficeID(
			officeID, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first userext in the ordered set where officeID = &#63;.
	 *
	 * @param officeID the office ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching userext
	 * @throws NoSuchuserextException if a matching userext could not be found
	 */
	public static userext findByofficeID_First(
			long officeID, OrderByComparator<userext> orderByComparator)
		throws com.training.service.builder.exception.NoSuchuserextException {

		return getPersistence().findByofficeID_First(
			officeID, orderByComparator);
	}

	/**
	 * Returns the first userext in the ordered set where officeID = &#63;.
	 *
	 * @param officeID the office ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching userext, or <code>null</code> if a matching userext could not be found
	 */
	public static userext fetchByofficeID_First(
		long officeID, OrderByComparator<userext> orderByComparator) {

		return getPersistence().fetchByofficeID_First(
			officeID, orderByComparator);
	}

	/**
	 * Returns the last userext in the ordered set where officeID = &#63;.
	 *
	 * @param officeID the office ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching userext
	 * @throws NoSuchuserextException if a matching userext could not be found
	 */
	public static userext findByofficeID_Last(
			long officeID, OrderByComparator<userext> orderByComparator)
		throws com.training.service.builder.exception.NoSuchuserextException {

		return getPersistence().findByofficeID_Last(
			officeID, orderByComparator);
	}

	/**
	 * Returns the last userext in the ordered set where officeID = &#63;.
	 *
	 * @param officeID the office ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching userext, or <code>null</code> if a matching userext could not be found
	 */
	public static userext fetchByofficeID_Last(
		long officeID, OrderByComparator<userext> orderByComparator) {

		return getPersistence().fetchByofficeID_Last(
			officeID, orderByComparator);
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
	public static userext[] findByofficeID_PrevAndNext(
			long userextId, long officeID,
			OrderByComparator<userext> orderByComparator)
		throws com.training.service.builder.exception.NoSuchuserextException {

		return getPersistence().findByofficeID_PrevAndNext(
			userextId, officeID, orderByComparator);
	}

	/**
	 * Removes all the userexts where officeID = &#63; from the database.
	 *
	 * @param officeID the office ID
	 */
	public static void removeByofficeID(long officeID) {
		getPersistence().removeByofficeID(officeID);
	}

	/**
	 * Returns the number of userexts where officeID = &#63;.
	 *
	 * @param officeID the office ID
	 * @return the number of matching userexts
	 */
	public static int countByofficeID(long officeID) {
		return getPersistence().countByofficeID(officeID);
	}

	/**
	 * Caches the userext in the entity cache if it is enabled.
	 *
	 * @param userext the userext
	 */
	public static void cacheResult(userext userext) {
		getPersistence().cacheResult(userext);
	}

	/**
	 * Caches the userexts in the entity cache if it is enabled.
	 *
	 * @param userexts the userexts
	 */
	public static void cacheResult(List<userext> userexts) {
		getPersistence().cacheResult(userexts);
	}

	/**
	 * Creates a new userext with the primary key. Does not add the userext to the database.
	 *
	 * @param userextId the primary key for the new userext
	 * @return the new userext
	 */
	public static userext create(long userextId) {
		return getPersistence().create(userextId);
	}

	/**
	 * Removes the userext with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userextId the primary key of the userext
	 * @return the userext that was removed
	 * @throws NoSuchuserextException if a userext with the primary key could not be found
	 */
	public static userext remove(long userextId)
		throws com.training.service.builder.exception.NoSuchuserextException {

		return getPersistence().remove(userextId);
	}

	public static userext updateImpl(userext userext) {
		return getPersistence().updateImpl(userext);
	}

	/**
	 * Returns the userext with the primary key or throws a <code>NoSuchuserextException</code> if it could not be found.
	 *
	 * @param userextId the primary key of the userext
	 * @return the userext
	 * @throws NoSuchuserextException if a userext with the primary key could not be found
	 */
	public static userext findByPrimaryKey(long userextId)
		throws com.training.service.builder.exception.NoSuchuserextException {

		return getPersistence().findByPrimaryKey(userextId);
	}

	/**
	 * Returns the userext with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userextId the primary key of the userext
	 * @return the userext, or <code>null</code> if a userext with the primary key could not be found
	 */
	public static userext fetchByPrimaryKey(long userextId) {
		return getPersistence().fetchByPrimaryKey(userextId);
	}

	/**
	 * Returns all the userexts.
	 *
	 * @return the userexts
	 */
	public static List<userext> findAll() {
		return getPersistence().findAll();
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
	public static List<userext> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<userext> findAll(
		int start, int end, OrderByComparator<userext> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<userext> findAll(
		int start, int end, OrderByComparator<userext> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the userexts from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of userexts.
	 *
	 * @return the number of userexts
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static userextPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<userextPersistence, userextPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(userextPersistence.class);

		ServiceTracker<userextPersistence, userextPersistence> serviceTracker =
			new ServiceTracker<userextPersistence, userextPersistence>(
				bundle.getBundleContext(), userextPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}