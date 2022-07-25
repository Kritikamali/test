<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />

<%
	long companyId = themeDisplay.getCompanyId();
	long userId = themeDisplay.getUserId();
%>

<portlet:actionURL var="addRecordURL">
	<portlet:param name="cmd" value="addRecord"/>
</portlet:actionURL>
<portlet:actionURL var="deleteRecordURL">
	<portlet:param name="cmd" value="deleteRecord"/>
</portlet:actionURL>
<portlet:actionURL var="addRecordURL1" name="addRecord">
</portlet:actionURL>
<portlet:renderURL var="allRecordsURL">
	<portlet:param name="userId" value="<%=String.valueOf(userId) %>"/>
	<portlet:param name="mvcPath" value="/common/all-record.jsp"/>
</portlet:renderURL>



<portlet:resourceURL var="resourceURL">
</portlet:resourceURL>
