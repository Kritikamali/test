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

package com.training.service.builder.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link userextLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see userextLocalService
 * @generated
 */
public class userextLocalServiceWrapper
	implements ServiceWrapper<userextLocalService>, userextLocalService {

	public userextLocalServiceWrapper(userextLocalService userextLocalService) {
		_userextLocalService = userextLocalService;
	}

	/**
	 * Adds the userext to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect userextLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userext the userext
	 * @return the userext that was added
	 */
	@Override
	public com.training.service.builder.model.userext adduserext(
		com.training.service.builder.model.userext userext) {

		return _userextLocalService.adduserext(userext);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userextLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new userext with the primary key. Does not add the userext to the database.
	 *
	 * @param userextId the primary key for the new userext
	 * @return the new userext
	 */
	@Override
	public com.training.service.builder.model.userext createuserext(
		long userextId) {

		return _userextLocalService.createuserext(userextId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userextLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the userext with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect userextLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userextId the primary key of the userext
	 * @return the userext that was removed
	 * @throws PortalException if a userext with the primary key could not be found
	 */
	@Override
	public com.training.service.builder.model.userext deleteuserext(
			long userextId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userextLocalService.deleteuserext(userextId);
	}

	/**
	 * Deletes the userext from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect userextLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userext the userext
	 * @return the userext that was removed
	 */
	@Override
	public com.training.service.builder.model.userext deleteuserext(
		com.training.service.builder.model.userext userext) {

		return _userextLocalService.deleteuserext(userext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _userextLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _userextLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.training.service.builder.model.impl.userextModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _userextLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.training.service.builder.model.impl.userextModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _userextLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _userextLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _userextLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.training.service.builder.model.userext fetchuserext(
		long userextId) {

		return _userextLocalService.fetchuserext(userextId);
	}

	/**
	 * Returns the userext matching the UUID and group.
	 *
	 * @param uuid the userext's UUID
	 * @param groupId the primary key of the group
	 * @return the matching userext, or <code>null</code> if a matching userext could not be found
	 */
	@Override
	public com.training.service.builder.model.userext
		fetchuserextByUuidAndGroupId(String uuid, long groupId) {

		return _userextLocalService.fetchuserextByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _userextLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<com.training.service.builder.model.userext>
		getByEmailId(String emailAddress) {

		return _userextLocalService.getByEmailId(emailAddress);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _userextLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _userextLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _userextLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userextLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the userext with the primary key.
	 *
	 * @param userextId the primary key of the userext
	 * @return the userext
	 * @throws PortalException if a userext with the primary key could not be found
	 */
	@Override
	public com.training.service.builder.model.userext getuserext(long userextId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userextLocalService.getuserext(userextId);
	}

	/**
	 * Returns the userext matching the UUID and group.
	 *
	 * @param uuid the userext's UUID
	 * @param groupId the primary key of the group
	 * @return the matching userext
	 * @throws PortalException if a matching userext could not be found
	 */
	@Override
	public com.training.service.builder.model.userext
			getuserextByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userextLocalService.getuserextByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the userexts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.training.service.builder.model.impl.userextModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of userexts
	 * @param end the upper bound of the range of userexts (not inclusive)
	 * @return the range of userexts
	 */
	@Override
	public java.util.List<com.training.service.builder.model.userext>
		getuserexts(int start, int end) {

		return _userextLocalService.getuserexts(start, end);
	}

	/**
	 * Returns all the userexts matching the UUID and company.
	 *
	 * @param uuid the UUID of the userexts
	 * @param companyId the primary key of the company
	 * @return the matching userexts, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.training.service.builder.model.userext>
		getuserextsByUuidAndCompanyId(String uuid, long companyId) {

		return _userextLocalService.getuserextsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of userexts matching the UUID and company.
	 *
	 * @param uuid the UUID of the userexts
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of userexts
	 * @param end the upper bound of the range of userexts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching userexts, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.training.service.builder.model.userext>
		getuserextsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.training.service.builder.model.userext>
					orderByComparator) {

		return _userextLocalService.getuserextsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of userexts.
	 *
	 * @return the number of userexts
	 */
	@Override
	public int getuserextsCount() {
		return _userextLocalService.getuserextsCount();
	}

	@Override
	public com.training.service.builder.model.userext saveExtData(
		long userId, String screenName, String email, long officeID,
		String officeLocation, String officeDesignation, String reportingTo) {

		return _userextLocalService.saveExtData(
			userId, screenName, email, officeID, officeLocation,
			officeDesignation, reportingTo);
	}

	/**
	 * Updates the userext in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect userextLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userext the userext
	 * @return the userext that was updated
	 */
	@Override
	public com.training.service.builder.model.userext updateuserext(
		com.training.service.builder.model.userext userext) {

		return _userextLocalService.updateuserext(userext);
	}

	@Override
	public userextLocalService getWrappedService() {
		return _userextLocalService;
	}

	@Override
	public void setWrappedService(userextLocalService userextLocalService) {
		_userextLocalService = userextLocalService;
	}

	private userextLocalService _userextLocalService;

}