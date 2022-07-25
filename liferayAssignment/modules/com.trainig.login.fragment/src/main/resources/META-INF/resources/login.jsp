<%--
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
 *
--%>

<%@ include file="/init.jsp" %>

<script>
$(document).ready(function() {
	$('.modal-header').addClass('hide');
	$('.control-label').addClass('hide');
	$(".modal-body").attr("style","overflow:hidden");
	
});
</script>

<c:choose>
	<c:when test="<%= themeDisplay.isSignedIn() %>">

        <%
        String signedInAs = HtmlUtil.escape(user.getFullName());

        if (themeDisplay.isShowMyAccountIcon() && (themeDisplay.getURLMyAccount() != null)) {
            String myAccountURL = String.valueOf(themeDisplay.getURLMyAccount());

            signedInAs = "<a class=\"signed-in\" href=\"" + HtmlUtil.escape(myAccountURL) + "\">" + signedInAs + "</a>";
        }
        %>

        <liferay-ui:message arguments="<%= signedInAs %>" key="you-are-signed-in-as-x" translateArguments="<%= false %>" />
    </c:when>
	<c:otherwise>

		<%
		String formName = "loginForm";

		if (windowState.equals(LiferayWindowState.EXCLUSIVE)) {
			formName += "Modal";
		}

		String redirect = ParamUtil.getString(request, "redirect");

		String login = (String)SessionErrors.get(renderRequest, "login");

		if (Validator.isNull(login)) {
			login = LoginUtil.getLogin(request, "login", company);
		}

		String password = StringPool.BLANK;
		boolean rememberMe = ParamUtil.getBoolean(request, "rememberMe");

		if (Validator.isNull(authType)) {
			authType = company.getAuthType();
		}
		%>

		<div class="login-container">
			<portlet:actionURL name="/login/login" secure="<%= PropsValues.COMPANY_SECURITY_AUTH_REQUIRES_HTTPS || request.isSecure() %>" var="loginURL">
				<portlet:param name="mvcRenderCommandName" value="/login/login" />
			</portlet:actionURL>
			
			<div class="col-xs-12 img-responsive text-center">
				 <img src="https://faconnect.britam.com/o/fa-login-theme/images/layout_set_logo.png" alt="logoimage"> 
			</div>
			
			<aui:form action="<%= loginURL %>" autocomplete='on' cssClass="sign-in-form" method="post" name="loginForm">
        
            <aui:input name="saveLastPath" type="hidden" value="<%= false %>" />
            <aui:input name="redirect" type="hidden" value="<%= redirect %>" />
                    
            <aui:input autoFocus="true" cssClass="clearable" name="login" placeholder="User Name" style="outline=0; box-shadow:none; border-color:black; background-color:white;" showRequiredLabel="<%= false %>" type="text" value="">
                <aui:validator name="required" />
            </aui:input>

            <aui:input name="password" showRequiredLabel="<%= false %>" style="outline=0; box-shadow:none; border-color:black; background-color:white;"  placeholder="Password" type="password">
                <aui:validator name="required" />
            </aui:input>
            
            <aui:button-row>
                <aui:button cssClass="btn-lg" style="background-color: #F44336 !important; text-align:center; height: 36px; border-radius: 2px; border: none; text-transform: uppercase; width: 100%; padding: 0 16px; font-size: 14px; outline: 0;" type="submit" value="sign-in" />
            </aui:button-row>
            <a href="#" style=" color: red; display: block; margin-top: 10px; width: 100%; border: 1px solid #ccc; height: 36px; padding: 9px; text-decoration: none; text-transform: uppercase; box-shadow: 0 2px 2px 0 rgba(0,0,0,0.14), 0 3px 1px -2px rgba(0,0,0,0.12), 0 1px 5px 0 rgba(0,0,0,0.2); text-align: center; font-size: 14px;line-height: 1.42857;" cssclass="waves-effect waves-red btn defualtBtn next-btn white sign-up-btn">Sign UP</a>
                
        </aui:form>

			<%@ include file="/navigation.jspf" %>
		</div>

		<aui:script sandbox="<%= true %>">
			var form = document.getElementById('<portlet:namespace /><%= formName %>');

			if (form) {
				form.addEventListener(
					'submit',
					function(event) {
						<c:if test="<%= Validator.isNotNull(redirect) %>">
							var redirect = form.querySelector('#<portlet:namespace />redirect');

							if (redirect) {
								var redirectVal = redirect.getAttribute('value');

								redirect.setAttribute('value', redirectVal + window.location.hash);
							}
						</c:if>

						submitForm(form);
					}
				);

				var password = form.querySelector('#<portlet:namespace />password');

				if (password) {
					password.addEventListener(
						'keypress',
						function(event) {
							Liferay.Util.showCapsLock(event, '<portlet:namespace />passwordCapsLockSpan');
						}
					);
				}
			}
		</aui:script>
	</c:otherwise>
</c:choose>