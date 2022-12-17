<%@ include file="/init.jsp" %>
<% long groupId = themeDisplay.getLayout().getGroupId(); %>

<p>
	<b><liferay-ui:message key="inicio.caption"/></b>
</p>

<portlet:renderURL var="createEditRender">
	<portlet:param name="mvcRenderCommandName" value="/create/detalle" />
	<portlet:param name="articuloId" value="46395" />
	<portlet:param name="groupId" value="<%=Long.toString(groupId)%>" />
</portlet:renderURL>

<a href="${createEditRender}"><liferay-ui:message key="enlace.caption"/></a>