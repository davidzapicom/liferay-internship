<%@ include file="/init.jsp" %>

<%
String articuloId = (String) request.getAttribute("articuloId");
String groupId = (String) request.getAttribute("groupId");
%>

<liferay-journal:journal-article articleId="<%=articuloId%>" groupId="<%=Long.parseLong(groupId)%>" />