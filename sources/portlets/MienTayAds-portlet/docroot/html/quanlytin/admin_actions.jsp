<%@include file="/init.jsp"%>
<%
	ResultRow row = (ResultRow) request
			.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	SanPham sp = (SanPham) row.getObject();
	// long groupId = themeDisplay.getLayout().getGroupId();
	String primKey = String.valueOf(sp.getPrimaryKey());
	String name = SanPham.class.getName();
	
%>
<liferay-ui:icon-list>
	<portlet:actionURL name="publicSP" var="Public">
		<portlet:param name="resourcePrimKey" value="<%=primKey%>" />
	</portlet:actionURL>
	<portlet:actionURL name="unPublicSP" var="UnPublic">
		<portlet:param name="resourcePrimKey" value="<%=primKey%>" />
	</portlet:actionURL>
	
	<%if(sp.getStatus()==1){ %>
	<liferay-ui:icon image="edit" message="UnPublic"
		url="<%=UnPublic.toString()%>" />
	<%}else if(sp.getStatus()==-1){ %>
	<liferay-ui:icon image="edit" message="Public"
		url="<%=Public.toString()%>" />
	
	<%}%>
	<portlet:actionURL name="deleteSP" var="deleteURL">
		<portlet:param name="resourcePrimKey" value="<%=primKey%>" />
	</portlet:actionURL>
	<liferay-ui:icon-delete url="<%=deleteURL.toString()%>" />
</liferay-ui:icon-list>