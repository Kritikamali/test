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

package com.training.service.builder.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.training.service.builder.model.userext;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing userext in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class userextCacheModel implements CacheModel<userext>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof userextCacheModel)) {
			return false;
		}

		userextCacheModel userextCacheModel = (userextCacheModel)object;

		if (userextId == userextCacheModel.userextId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, userextId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", userextId=");
		sb.append(userextId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", screenName=");
		sb.append(screenName);
		sb.append(", email=");
		sb.append(email);
		sb.append(", officeID=");
		sb.append(officeID);
		sb.append(", officeLocation=");
		sb.append(officeLocation);
		sb.append(", officeDesignation=");
		sb.append(officeDesignation);
		sb.append(", reportingTo=");
		sb.append(reportingTo);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public userext toEntityModel() {
		userextImpl userextImpl = new userextImpl();

		if (uuid == null) {
			userextImpl.setUuid("");
		}
		else {
			userextImpl.setUuid(uuid);
		}

		userextImpl.setUserextId(userextId);
		userextImpl.setGroupId(groupId);
		userextImpl.setCompanyId(companyId);
		userextImpl.setUserId(userId);

		if (userName == null) {
			userextImpl.setUserName("");
		}
		else {
			userextImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			userextImpl.setCreateDate(null);
		}
		else {
			userextImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			userextImpl.setModifiedDate(null);
		}
		else {
			userextImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (screenName == null) {
			userextImpl.setScreenName("");
		}
		else {
			userextImpl.setScreenName(screenName);
		}

		if (email == null) {
			userextImpl.setEmail("");
		}
		else {
			userextImpl.setEmail(email);
		}

		userextImpl.setOfficeID(officeID);

		if (officeLocation == null) {
			userextImpl.setOfficeLocation("");
		}
		else {
			userextImpl.setOfficeLocation(officeLocation);
		}

		if (officeDesignation == null) {
			userextImpl.setOfficeDesignation("");
		}
		else {
			userextImpl.setOfficeDesignation(officeDesignation);
		}

		if (reportingTo == null) {
			userextImpl.setReportingTo("");
		}
		else {
			userextImpl.setReportingTo(reportingTo);
		}

		userextImpl.resetOriginalValues();

		return userextImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		userextId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		screenName = objectInput.readUTF();
		email = objectInput.readUTF();

		officeID = objectInput.readLong();
		officeLocation = objectInput.readUTF();
		officeDesignation = objectInput.readUTF();
		reportingTo = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(userextId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (screenName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(screenName);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		objectOutput.writeLong(officeID);

		if (officeLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(officeLocation);
		}

		if (officeDesignation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(officeDesignation);
		}

		if (reportingTo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(reportingTo);
		}
	}

	public String uuid;
	public long userextId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String screenName;
	public String email;
	public long officeID;
	public String officeLocation;
	public String officeDesignation;
	public String reportingTo;

}