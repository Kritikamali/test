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

package com.training.service.builder.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link userext}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see userext
 * @generated
 */
public class userextWrapper
	extends BaseModelWrapper<userext>
	implements ModelWrapper<userext>, userext {

	public userextWrapper(userext userext) {
		super(userext);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("userextId", getUserextId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("screenName", getScreenName());
		attributes.put("email", getEmail());
		attributes.put("officeID", getOfficeID());
		attributes.put("officeLocation", getOfficeLocation());
		attributes.put("officeDesignation", getOfficeDesignation());
		attributes.put("reportingTo", getReportingTo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long userextId = (Long)attributes.get("userextId");

		if (userextId != null) {
			setUserextId(userextId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String screenName = (String)attributes.get("screenName");

		if (screenName != null) {
			setScreenName(screenName);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		Long officeID = (Long)attributes.get("officeID");

		if (officeID != null) {
			setOfficeID(officeID);
		}

		String officeLocation = (String)attributes.get("officeLocation");

		if (officeLocation != null) {
			setOfficeLocation(officeLocation);
		}

		String officeDesignation = (String)attributes.get("officeDesignation");

		if (officeDesignation != null) {
			setOfficeDesignation(officeDesignation);
		}

		String reportingTo = (String)attributes.get("reportingTo");

		if (reportingTo != null) {
			setReportingTo(reportingTo);
		}
	}

	/**
	 * Returns the company ID of this userext.
	 *
	 * @return the company ID of this userext
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this userext.
	 *
	 * @return the create date of this userext
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email of this userext.
	 *
	 * @return the email of this userext
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the group ID of this userext.
	 *
	 * @return the group ID of this userext
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this userext.
	 *
	 * @return the modified date of this userext
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the office designation of this userext.
	 *
	 * @return the office designation of this userext
	 */
	@Override
	public String getOfficeDesignation() {
		return model.getOfficeDesignation();
	}

	/**
	 * Returns the office ID of this userext.
	 *
	 * @return the office ID of this userext
	 */
	@Override
	public long getOfficeID() {
		return model.getOfficeID();
	}

	/**
	 * Returns the office location of this userext.
	 *
	 * @return the office location of this userext
	 */
	@Override
	public String getOfficeLocation() {
		return model.getOfficeLocation();
	}

	/**
	 * Returns the primary key of this userext.
	 *
	 * @return the primary key of this userext
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the reporting to of this userext.
	 *
	 * @return the reporting to of this userext
	 */
	@Override
	public String getReportingTo() {
		return model.getReportingTo();
	}

	/**
	 * Returns the screen name of this userext.
	 *
	 * @return the screen name of this userext
	 */
	@Override
	public String getScreenName() {
		return model.getScreenName();
	}

	/**
	 * Returns the userext ID of this userext.
	 *
	 * @return the userext ID of this userext
	 */
	@Override
	public long getUserextId() {
		return model.getUserextId();
	}

	/**
	 * Returns the user ID of this userext.
	 *
	 * @return the user ID of this userext
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this userext.
	 *
	 * @return the user name of this userext
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this userext.
	 *
	 * @return the user uuid of this userext
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this userext.
	 *
	 * @return the uuid of this userext
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this userext.
	 *
	 * @param companyId the company ID of this userext
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this userext.
	 *
	 * @param createDate the create date of this userext
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email of this userext.
	 *
	 * @param email the email of this userext
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the group ID of this userext.
	 *
	 * @param groupId the group ID of this userext
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this userext.
	 *
	 * @param modifiedDate the modified date of this userext
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the office designation of this userext.
	 *
	 * @param officeDesignation the office designation of this userext
	 */
	@Override
	public void setOfficeDesignation(String officeDesignation) {
		model.setOfficeDesignation(officeDesignation);
	}

	/**
	 * Sets the office ID of this userext.
	 *
	 * @param officeID the office ID of this userext
	 */
	@Override
	public void setOfficeID(long officeID) {
		model.setOfficeID(officeID);
	}

	/**
	 * Sets the office location of this userext.
	 *
	 * @param officeLocation the office location of this userext
	 */
	@Override
	public void setOfficeLocation(String officeLocation) {
		model.setOfficeLocation(officeLocation);
	}

	/**
	 * Sets the primary key of this userext.
	 *
	 * @param primaryKey the primary key of this userext
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the reporting to of this userext.
	 *
	 * @param reportingTo the reporting to of this userext
	 */
	@Override
	public void setReportingTo(String reportingTo) {
		model.setReportingTo(reportingTo);
	}

	/**
	 * Sets the screen name of this userext.
	 *
	 * @param screenName the screen name of this userext
	 */
	@Override
	public void setScreenName(String screenName) {
		model.setScreenName(screenName);
	}

	/**
	 * Sets the userext ID of this userext.
	 *
	 * @param userextId the userext ID of this userext
	 */
	@Override
	public void setUserextId(long userextId) {
		model.setUserextId(userextId);
	}

	/**
	 * Sets the user ID of this userext.
	 *
	 * @param userId the user ID of this userext
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this userext.
	 *
	 * @param userName the user name of this userext
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this userext.
	 *
	 * @param userUuid the user uuid of this userext
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this userext.
	 *
	 * @param uuid the uuid of this userext
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected userextWrapper wrap(userext userext) {
		return new userextWrapper(userext);
	}

}