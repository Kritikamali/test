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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.training.service.builder.service.http.userextServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class userextSoap implements Serializable {

	public static userextSoap toSoapModel(userext model) {
		userextSoap soapModel = new userextSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setUserextId(model.getUserextId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setScreenName(model.getScreenName());
		soapModel.setEmail(model.getEmail());
		soapModel.setOfficeID(model.getOfficeID());
		soapModel.setOfficeLocation(model.getOfficeLocation());
		soapModel.setOfficeDesignation(model.getOfficeDesignation());
		soapModel.setReportingTo(model.getReportingTo());

		return soapModel;
	}

	public static userextSoap[] toSoapModels(userext[] models) {
		userextSoap[] soapModels = new userextSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static userextSoap[][] toSoapModels(userext[][] models) {
		userextSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new userextSoap[models.length][models[0].length];
		}
		else {
			soapModels = new userextSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static userextSoap[] toSoapModels(List<userext> models) {
		List<userextSoap> soapModels = new ArrayList<userextSoap>(
			models.size());

		for (userext model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new userextSoap[soapModels.size()]);
	}

	public userextSoap() {
	}

	public long getPrimaryKey() {
		return _userextId;
	}

	public void setPrimaryKey(long pk) {
		setUserextId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getUserextId() {
		return _userextId;
	}

	public void setUserextId(long userextId) {
		_userextId = userextId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getScreenName() {
		return _screenName;
	}

	public void setScreenName(String screenName) {
		_screenName = screenName;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public long getOfficeID() {
		return _officeID;
	}

	public void setOfficeID(long officeID) {
		_officeID = officeID;
	}

	public String getOfficeLocation() {
		return _officeLocation;
	}

	public void setOfficeLocation(String officeLocation) {
		_officeLocation = officeLocation;
	}

	public String getOfficeDesignation() {
		return _officeDesignation;
	}

	public void setOfficeDesignation(String officeDesignation) {
		_officeDesignation = officeDesignation;
	}

	public String getReportingTo() {
		return _reportingTo;
	}

	public void setReportingTo(String reportingTo) {
		_reportingTo = reportingTo;
	}

	private String _uuid;
	private long _userextId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _screenName;
	private String _email;
	private long _officeID;
	private String _officeLocation;
	private String _officeDesignation;
	private String _reportingTo;

}