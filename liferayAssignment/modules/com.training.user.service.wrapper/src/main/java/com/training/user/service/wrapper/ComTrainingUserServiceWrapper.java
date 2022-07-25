package com.training.user.service.wrapper;


import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.UserLocalServiceWrapper;
import com.training.service.builder.model.userext;
import com.training.service.builder.service.userextLocalServiceUtil;

import java.util.Locale;

import org.osgi.service.component.annotations.Component;

/**
 * @author kritika.mali
 */
@Component(
	immediate = true,
	property = {
	},
	service = ServiceWrapper.class
)
public class ComTrainingUserServiceWrapper extends UserLocalServiceWrapper {

	public ComTrainingUserServiceWrapper() {
		super(null);
	}
@Override
	public User addUserWithWorkflow(long creatorUserId, long companyId, boolean autoPassword, String password1,
			String password2, boolean autoScreenName, String screenName, String emailAddress, long facebookId,
			String openId, Locale locale, String firstName, String middleName, String lastName, long prefixId,
			long suffixId, boolean male, int birthdayMonth, int birthdayDay, int birthdayYear, String jobTitle,
			long[] groupIds, long[] organizationIds, long[] roleIds, long[] userGroupIds, boolean sendEmail,
			ServiceContext serviceContext) throws PortalException {
		// TODO Auto-generated method stub
		User user = super.addUserWithWorkflow(creatorUserId, companyId, autoPassword, password1, password2, autoScreenName,
				screenName, emailAddress, facebookId, openId, locale, firstName, middleName, lastName, prefixId, suffixId, male,
				birthdayMonth, birthdayDay, birthdayYear, jobTitle, groupIds, organizationIds, roleIds, userGroupIds, sendEmail,
				serviceContext);
		
		emailAddress = user.getEmailAddress();
		long userId = user.getUserId();
		System.out.println("Service Wrapper----------------------------");
		
		userext userext = userextLocalServiceUtil.getByEmailId(emailAddress).get(0);
		userext .setUserId(userId);
		userextLocalServiceUtil.updateuserext(userext);
		return user;
		
	}
}
