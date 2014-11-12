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
	<portlet:actionURL name="editSP" var="editURL">
		<portlet:param name="resourcePrimKey" value="<%=primKey%>" />
	</portlet:actionURL>
	<liferay-ui:icon image="edit" message="Edit"
		url="<%=editURL.toString()%>" />
	<portlet:actionURL name="deleteSP" var="deleteURL">
		<portlet:param name="resourcePrimKey" value="<%=primKey%>" />
	</portlet:actionURL>
	<liferay-ui:icon-delete url="<%=deleteURL.toString()%>" />
</liferay-ui:icon-list>