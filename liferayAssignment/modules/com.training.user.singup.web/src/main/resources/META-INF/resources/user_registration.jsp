<%@page import="java.util.Map"%>

<%@ include file="/common/common.jsp" %>
<%
	Map<String, String> genderMap = UserSignup.getGender();
%>
<div class="parent" id="<portlet:namespace/>parent">
	<div class="row">
		<div><a class="btn btn-primary" href="<%=allRecordsURL%>"><liferay-ui:message key="all-records"/></a></div>
	</div>
	<form name="user-reg" action="" >
		<div class="row">
			<div class="col-md-4 form-group">
				<label><liferay-ui:message key="first-name"/><span><liferay-ui:message key="star"/></span></label>
				<input type="text" class="form-control" id="<portlet:namespace/>first-name" name="<portlet:namespace/>first-name" value="" onChange="validateFirstName();" >
				<span class="" id="<portlet:namespace/>first-name-error" name="<portlet:namespace/>first-name-error" style="display:none;"></span>
			</div>
			<div class="col-md-4 form-group">
				<label><liferay-ui:message key="middle-name"/><span><liferay-ui:message key="star"/></span></label>
				<input type="text" class="form-control" id="<portlet:namespace/>first-name" name="<portlet:namespace/>middle-name" value="" onChange="validateMiddleName();" >
				<span class="" id="<portlet:namespace/>middle-name-error" name="<portlet:namespace/>middle-name-error" style="display:none;"></span>
				
			</div>
			<div class="col-md-4 form-group">
				<label><liferay-ui:message key="last-name"/><span><liferay-ui:message key="star"/></span></label>
				<input type="text" class="form-control" id="<portlet:namespace/>last-name" name="<portlet:namespace/>last-name" value="" onChange="validateLastName();" >
				<span class="" id="<portlet:namespace/>last-name-error" name="<portlet:namespace/>last-name-error" style="display:none;"></span>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4 form-group">
				<label><liferay-ui:message key="email-address"/><span><liferay-ui:message key="star"/></span></label>
				<input type="text" class="form-control" id="<portlet:namespace/>email-address" name="<portlet:namespace/>email-address" value="" onChange="validateEmail();" >
				<span class="" id="<portlet:namespace/>email-address-error" name="<portlet:namespace/>email-address-error" style="display:none;"></span>
			</div>
			<div class="col-md-4 form-group">
				<label><liferay-ui:message key="mobile"/><span><liferay-ui:message key="star"/></span></label>
				<input type="text" class="form-control" id="<portlet:namespace/>mobile" name="<portlet:namespace/>mobile" value="" onChange="validateMobile();" >
				<span class="" id="<portlet:namespace/>mobile-error" name="<portlet:namespace/>mobile-error" style="display:none;"></span>
			</div>
			<div class="col-md-4 form-group">
				<label><liferay-ui:message key="gender"/><span><liferay-ui:message key="star"/></span></label>
				<select class="form-control" id="<portlet:namespace/>gender" name="<portlet:namespace/>gender" onChange="validateGender();" >
					<option value="">--Select--</option>
					<%for(Map.Entry<String, String> gender : genderMap.entrySet()){%>
						<option value="<%=gender.getKey()%>"><%=gender.getValue() %></option>
					<%} %>
				</select>
				<span class="" id="<portlet:namespace/>gender-error" name="<portlet:namespace/>gender-error" style="display:none;"></span>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4 form-group">
				<label><liferay-ui:message key="state"/><span><liferay-ui:message key="star"/></span></label>
				<input type="text" class="form-control" id="<portlet:namespace/>state" name="<portlet:namespace/>state" value="" onChange="validateState();" >
				<span class="" id="<portlet:namespace/>first-name-error" name="<portlet:namespace/>first-name-error" style="display:none;"></span>
			</div>
			<div class="col-md-4 form-group">
				<label><liferay-ui:message key="city"/><span><liferay-ui:message key="star"/></span></label>
				<input type="text" class="form-control" id="<portlet:namespace/>city" name="<portlet:namespace/>city" value="" onChange="validateCity();" >
				<span class="" id="<portlet:namespace/>city-error" name="<portlet:namespace/>city-error" style="display:none;"></span>
			</div>
			<div class="col-md-4 form-group">
				<label><liferay-ui:message key="pin-code"/><span><liferay-ui:message key="star"/></span></label>
				<input type="text" class="form-control" id="<portlet:namespace/>pin-code" name="<portlet:namespace/>pin-code" value="" onChange="validatePin();" >
				<span class="" id="<portlet:namespace/>pin-code-error" name="<portlet:namespace/>pin-code-error" style="display:none;"></span>
			</div>
		</div>
		<div class="row">
			<input type="button" class="btn btn-primary" id="<portlet:namespace/>save" name="<portlet:namespace/>save" value="Save" onClick="addRecord();">
		</div>
	</form>
<%-- 	<a href="<%=deleteRecordURL %>" class="btn btn-primary" id="<portlet:namespace/>delete" name="<portlet:namespace/>delete">Delete</a>
 --%>
</div>