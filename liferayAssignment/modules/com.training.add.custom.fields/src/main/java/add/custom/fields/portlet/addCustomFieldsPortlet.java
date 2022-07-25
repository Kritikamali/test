package add.custom.fields.portlet;

import add.custom.fields.constants.addCustomFieldsPortletKeys;

import com.liferay.portal.kernel.model.Portlet;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.training.service.builder.service.userextLocalServiceUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
//import javax.portlet.Portlet;


import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author kritika.mali
 */
@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + addCustomFieldsPortletKeys.MY_ORGANIZATIONS,
		"javax.portlet.name=" + addCustomFieldsPortletKeys.USERS_ADMIN,
		"mvc.command.name=/users_admin/edit_user",
		"service.ranking:Integer=1000"

	},
	service = MVCActionCommand.class
)
public class addCustomFieldsPortlet extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String screenName = ParamUtil.getString(actionRequest, "screenName");
		String emailAddress = ParamUtil.getString(actionRequest, "emailAddress");
		String Userid = ParamUtil.getString(actionRequest, "userId","");
		String OfficeId = ParamUtil.getString(actionRequest, "officeID");
		String OfficeDesignation = ParamUtil.getString(actionRequest, "officeDesignation");
		String OfficeLocation = ParamUtil.getString(actionRequest, "officeLocation");
		String ReportingTo = ParamUtil.getString(actionRequest, "reportingTo");
		System.out.println("Hello action hook");
		//List<LiferayAssignment> liferayAssignment = LiferayAssignmentLocalServiceUtil.getByEmailId("kriti@gmail.com");
		long userId = 0;
		if(Validator.isNotNull(Userid)) {
			try {
				userId = Long.parseLong(Userid);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		try {
			userextLocalServiceUtil.saveExtData(userId, screenName, emailAddress, Long.parseLong(OfficeId), OfficeLocation, OfficeDesignation, ReportingTo);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		mvcActionCommand.processAction(actionRequest, actionResponse);
	}
	
	@Reference
	(target =  "(&(mvc.command.name=/users_admin/edit_user)"
			+"(javax.portlet.name=com_liferay_users_admin_web_portlet_MyOrganizationsPortlet)"
			+"(javax.portlet.name=com_liferay_users_admin_web_portlet_UsersAdminPortlet)"
			+"(component.name=com.liferay.users.admin.web.internal.portlet.action.EditUserMVCActionCommand))") 
	private MVCActionCommand mvcActionCommand;

	}
	