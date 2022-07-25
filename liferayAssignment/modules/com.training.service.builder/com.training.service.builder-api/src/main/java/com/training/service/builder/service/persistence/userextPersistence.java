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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.training.service.builder.exception.NoSuchuserextException;
import com.training.service.builder.model.userext;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the userext service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see userextUtil
 * @generated
 */
@ProviderType
public interface userextPersistence extends BasePersistence<userext> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link userextUtil} to access the userext persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the userexts where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching userexts
	 */
	public java.util.List<userext> findByUuid(String uuid);

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
	public java.util.List<userext> findByUuid(String uuid, int start, int end);

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
	public java.util.List<userext> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<userext>
			orderByComparator);

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
	public java.util.List<userext> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<userext>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first userext in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching userext
	 * @throws NoSuchuserextException if a matching userext could not be found
	 */
	public userext findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<userext>
				orderByComparator)
		throws NoSuchuserextException;

	/**
	 * Returns the first userext in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching userext, or <code>null</code> if a matching userext could not be found
	 */
	public userext fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<userext>
			orderByComparator);

	/**
	 * Returns the last userext in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching userext
	 * @throws NoSuchuserextException if a matching userext could not be found
	 */
	public userext findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<userext>
				orderByComparator)
		throws NoSuchuserextException;

	/**
	 * Returns the last userext in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching userext, or <code>null</code> if a matching userext could not be found
	 */
	public userext fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<userext>
			orderByComparator);

	/**
	 * Returns the userexts before and after the current userext in the ordered set where uuid = &#63;.
	 *
	 * @param userextId the primary key of the current userext
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next userext
	 * @throws NoSuchuserextException if a userext with the primary key could not be found
	 */
	public userext[] findByUuid_PrevAndNext(
			long userextId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<userext>
				orderByComparator)
		throws NoSuchuserextException;

	/**
	 * Removes all the userexts where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of userexts where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching userexts
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the userext where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchuserextException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching userext
	 * @throws NoSuchuserextException if a matching userext could not be found
	 */
	public userext findByUUID_G(String uuid, long groupId)
		throws NoSuchuserextException;

	/**
	 * Returns the userext where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching userext, or <code>null</code> if a matching userext could not be found
	 */
	public userext fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the userext where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching userext, or <code>null</code> if a matching userext could not be found
	 */
	public userext fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the userext where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the userext that was removed
	 */
	public userext removeByUUID_G(String uuid, long groupId)
		throws NoSuchuserextException;

	/**
	 * Returns the number of userexts where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching userexts
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the userexts where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching userexts
	 */
	public java.util.List<userext> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<userext> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<userext> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<userext>
			orderByComparator);

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
	public java.util.List<userext> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<userext>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first userext in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching userext
	 * @throws NoSuchuserextException if a matching userext could not be found
	 */
	public userext findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<userext>
				orderByComparator)
		throws NoSuchuserextException;

	/**
	 * Returns the first userext in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching userext, or <code>null</code> if a matching userext could not be found
	 */
	public userext fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<userext>
			orderByComparator);

	/**
	 * Returns the last userext in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching userext
	 * @throws NoSuchuserextException if a matching userext could not be found
	 */
	public userext findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<userext>
				orderByComparator)
		throws NoSuchuserextException;

	/**
	 * Returns the last userext in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching userext, or <code>null</code> if a matching userext could not be found
	 */
	public userext fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<userext>
			orderByComparator);

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
	public userext[] findByUuid_C_PrevAndNext(
			long userextId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<userext>
				orderByComparator)
		throws NoSuchuserextException;

	/**
	 * Removes all the userexts where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of userexts where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching userexts
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the userexts where email = &#63;.
	 *
	 * @param email the email
	 * @return the matching userexts
	 */
	public java.util.List<userext> findByemail(String email);

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
	public java.util.List<userext> findByemail(
		String email, int start, int end);

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
	public java.util.List<userext> findByemail(
		String email, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<userext>
			orderByComparator);

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
	public java.util.List<userext> findByemail(
		String email, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<userext>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first userext in the ordered set where email = &#63;.
	 *
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching userext
	 * @throws NoSuchuserextException if a matching userext could not be found
	 */
	public userext findByemail_First(
			String email,
			com.liferay.portal.kernel.util.OrderByComparator<userext>
				orderByComparator)
		throws NoSuchuserextException;

	/**
	 * Returns the first userext in the ordered set where email = &#63;.
	 *
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching userext, or <code>null</code> if a matching userext could not be found
	 */
	public userext fetchByemail_First(
		String email,
		com.liferay.portal.kernel.util.OrderByComparator<userext>
			orderByComparator);

	/**
	 * Returns the last userext in the ordered set where email = &#63;.
	 *
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching userext
	 * @throws NoSuchuserextException if a matching userext could not be found
	 */
	public userext findByemail_Last(
			String email,
			com.liferay.portal.kernel.util.OrderByComparator<userext>
				orderByComparator)
		throws NoSuchuserextException;

	/**
	 * Returns the last userext in the ordered set where email = &#63;.
	 *
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching userext, or <code>null</code> if a matching userext could not be found
	 */
	public userext fetchByemail_Last(
		String email,
		com.liferay.portal.kernel.util.OrderByComparator<userext>
			orderByComparator);

	/**
	 * Returns the userexts before and after the current userext in the ordered set where email = &#63;.
	 *
	 * @param userextId the primary key of the current userext
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next userext
	 * @throws NoSuchuserextException if a userext with the primary key could not be found
	 */
	public userext[] findByemail_PrevAndNext(
			long userextId, String email,
			com.liferay.portal.kernel.util.OrderByComparator<userext>
				orderByComparator)
		throws NoSuchuserextException;

	/**
	 * Removes all the userexts where email = &#63; from the database.
	 *
	 * @param email the email
	 */
	public void removeByemail(String email);

	/**
	 * Returns the number of userexts where email = &#63;.
	 *
	 * @param email the email
	 * @return the number of matching userexts
	 */
	public int countByemail(String email);

	/**
	 * Returns all the userexts where officeID = &#63;.
	 *
	 * @param officeID the office ID
	 * @return the matching userexts
	 */
	public java.util.List<userext> findByofficeID(long officeID);

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
	public java.util.List<userext> findByofficeID(
		long officeID, int start, int end);

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
	public java.util.List<userext> findByofficeID(
		long officeID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<userext>
			orderByComparator);

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
	public java.util.List<userext> findByofficeID(
		long officeID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<userext>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first userext in the ordered set where officeID = &#63;.
	 *
	 * @param officeID the office ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching userext
	 * @throws NoSuchuserextException if a matching userext could not be found
	 */
	public userext findByofficeID_First(
			long officeID,
			com.liferay.portal.kernel.util.OrderByComparator<userext>
				orderByComparator)
		throws NoSuchuserextException;

	/**
	 * Returns the first userext in the ordered set where officeID = &#63;.
	 *
	 * @param officeID the office ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching userext, or <code>null</code> if a matching userext could not be found
	 */
	public userext fetchByofficeID_First(
		long officeID,
		com.liferay.portal.kernel.util.OrderByComparator<userext>
			orderByComparator);

	/**
	 * Returns the last userext in the ordered set where officeID = &#63;.
	 *
	 * @param officeID the office ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching userext
	 * @throws NoSuchuserextException if a matching userext could not be found
	 */
	public userext findByofficeID_Last(
			long officeID,
			com.liferay.portal.kernel.util.OrderByComparator<userext>
				orderByComparator)
		throws NoSuchuserextException;

	/**
	 * Returns the last userext in the ordered set where officeID = &#63;.
	 *
	 * @param officeID the office ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching userext, or <code>null</code> if a matching userext could not be found
	 */
	public userext fetchByofficeID_Last(
		long officeID,
		com.liferay.portal.kernel.util.OrderByComparator<userext>
			orderByComparator);

	/**
	 * Returns the userexts before and after the current userext in the ordered set where officeID = &#63;.
	 *
	 * @param userextId the primary key of the current userext
	 * @param officeID the office ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next userext
	 * @throws NoSuchuserextException if a userext with the primary key could not be found
	 */
	public userext[] findByofficeID_PrevAndNext(
			long userextId, long officeID,
			com.liferay.portal.kernel.util.OrderByComparator<userext>
				orderByComparator)
		throws NoSuchuserextException;

	/**
	 * Removes all the userexts where officeID = &#63; from the database.
	 *
	 * @param officeID the office ID
	 */
	public void removeByofficeID(long officeID);

	/**
	 * Returns the number of userexts where officeID = &#63;.
	 *
	 * @param officeID the office ID
	 * @return the number of matching userexts
	 */
	public int countByofficeID(long officeID);

	/**
	 * Caches the userext in the entity cache if it is enabled.
	 *
	 * @param userext the userext
	 */
	public void cacheResult(userext userext);

	/**
	 * Caches the userexts in the entity cache if it is enabled.
	 *
	 * @param userexts the userexts
	 */
	public void cacheResult(java.util.List<userext> userexts);

	/**
	 * Creates a new userext with the primary key. Does not add the userext to the database.
	 *
	 * @param userextId the primary key for the new userext
	 * @return the new userext
	 */
	public userext create(long userextId);

	/**
	 * Removes the userext with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userextId the primary key of the userext
	 * @return the userext that was removed
	 * @throws NoSuchuserextException if a userext with the primary key could not be found
	 */
	public userext remove(long userextId) throws NoSuchuserextException;

	public userext updateImpl(userext userext);

	/**
	 * Returns the userext with the primary key or throws a <code>NoSuchuserextException</code> if it could not be found.
	 *
	 * @param userextId the primary key of the userext
	 * @return the userext
	 * @throws NoSuchuserextException if a userext with the primary key could not be found
	 */
	public userext findByPrimaryKey(long userextId)
		throws NoSuchuserextException;

	/**
	 * Returns the userext with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userextId the primary key of the userext
	 * @return the userext, or <code>null</code> if a userext with the primary key could not be found
	 */
	public userext fetchByPrimaryKey(long userextId);

	/**
	 * Returns all the userexts.
	 *
	 * @return the userexts
	 */
	public java.util.List<userext> findAll();

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
	public java.util.List<userext> findAll(int start, int end);

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
	public java.util.List<userext> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<userext>
			orderByComparator);

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
	public java.util.List<userext> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<userext>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the userexts from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of userexts.
	 *
	 * @return the number of userexts
	 */
	public int countAll();

}