<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="java.util.List"%>
<%@ include file="../init.jsp" %>
<%@page import="javax.portlet.ResourceRequest"%>
<%@page import="com.training.user.signup.service.model.UserRegistration"%>
<%
	UserRegistration userRegistration = (UserRegistration)resourceRequest.getAttribute("userRegistration");
%>
<%=userRegistration.toString()%>
