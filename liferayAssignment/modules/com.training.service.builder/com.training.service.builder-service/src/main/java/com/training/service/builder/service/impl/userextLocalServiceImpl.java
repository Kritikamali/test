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

package com.training.service.builder.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.training.service.builder.model.userext;
import com.training.service.builder.service.userextLocalServiceUtil;
import com.training.service.builder.service.base.userextLocalServiceBaseImpl;
import com.training.service.builder.service.persistence.userextUtil;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the userext local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.training.service.builder.service.userextLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see userextLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.training.service.builder.model.userext",
	service = AopService.class
)
public class userextLocalServiceImpl extends userextLocalServiceBaseImpl {

	public userext saveExtData(long userId, String screenName, String email, long officeID, String officeLocation, String officeDesignation, String reportingTo){
        userext ext = null;

        long uniqueId = 0;
        try {
            uniqueId = CounterLocalServiceUtil.increment();
            ext = userextLocalServiceUtil.createuserext(uniqueId);
            ext.setUserextId(uniqueId);
            ext.setUserId(userId);
            ext.setScreenName(screenName);
            ext.setEmail(email);
            ext.setOfficeID(officeID);
            ext.setOfficeLocation(officeLocation);
            ext.setOfficeDesignation(officeDesignation);
            ext.setReportingTo(reportingTo);

            userextLocalServiceUtil.updateuserext(ext);

            return ext;
            } catch (Exception e) {
            return null;
            }
        }

    public List<userext> getByEmailId(String emailAddress){
        return userextUtil.findByemail(emailAddress);
    }
}