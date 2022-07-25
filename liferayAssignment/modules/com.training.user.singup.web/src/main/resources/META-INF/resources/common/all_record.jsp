<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="java.util.List"%>
<%@ include file="/init.jsp" %>
<h3><liferay-ui:message key="all-registered-user"/></h3>
<%
	String userIdFromParam = renderRequest.getParameter("userId");
%>
<%=userIdFromParam%>
<%
 List<User> users = UserLocalServiceUtil.getUsers(-1,-1);
 System.out.println(users.size());
%>

<liferay-ui:search-container total="<%=users.size()%>" var="searchContainer" delta="3" deltaConfigurable="true" 
  emptyResultsMessage="Oops. There Are No Users To Display, Please add Users">
 	<liferay-ui:search-container-results results="<%=ListUtil.subList(users, searchContainer.getStart(),searchContainer.getEnd())%>">
  </liferay-ui:search-container-results>
   <liferay-ui:search-container-row className="com.liferay.portal.kernel.model.User" modelVar="user" keyProperty="userId" >
   <liferay-ui:search-container-column-text name="User Id" value="${user.userId}"/>
   <liferay-ui:search-container-column-text name="firstName" property="firstName"/>
   <liferay-ui:search-container-column-text name="lastName" property="lastName"/>
   <liferay-ui:search-container-column-text name="Email" value="${user.emailAddress}"/>
  </liferay-ui:search-container-row>
 <liferay-ui:search-iterator searchContainer="<%=searchContainer%>" paginate="true" type="article" />

</liferay-ui:search-container>

<liferay-portlet:renderURL varImpl="iteratorURL" />
<liferay-ui:search-container total="<%= users.size() %>"
                            delta="3"
                            emptyResultsMessage="no-projects-found"
                            iteratorURL="<%=iteratorURL%>">
   <liferay-ui:search-container-results
           results="<%= ListUtil.subList(users, searchContainer.getStart(),searchContainer.getEnd()) %>"/>
   <liferay-ui:search-container-row className="com.liferay.portal.kernel.model.User" modelVar="user" keyProperty="userId" >
		   <liferay-ui:search-container-column-text name="User Id" value="${user.userId}"/>
		   <liferay-ui:search-container-column-text name="firstName" property="firstName"/>
		   <liferay-ui:search-container-column-text name="lastName" property="lastName"/>
		   <liferay-ui:search-container-column-text name="Email" value="${user.emailAddress}"/>
		   <liferay-ui:search-container-column-text name="actions.label">
           <liferay-ui:icon-menu direction="left-side" icon="" markupView="lexicon" message="actions" showWhenSingleIcon="<%= true %>">
               <portlet:renderURL var="editProjectURL">
                   <portlet:param name="mvcRenderCommandName" value="/user/editUser" />
                   <portlet:param name="userId" value="<%= String.valueOf(user.getUserId()) %>" />
               </portlet:renderURL>
               <liferay-ui:icon message="Edit" url="${editProjectURL}" />
               <portlet:actionURL var="deleteProjectURL" name="/user/deleteUser">
                   <portlet:param name="userId" value="<%= String.valueOf(user.getUserId()) %>" />
               </portlet:actionURL>
               <liferay-ui:icon message="Delete" url="${deleteProjectURL}" />
           </liferay-ui:icon-menu>
       </liferay-ui:search-container-column-text>
   </liferay-ui:search-container-row>
   <liferay-ui:search-iterator markupView="lexicon" />
</liferay-ui:search-container>

