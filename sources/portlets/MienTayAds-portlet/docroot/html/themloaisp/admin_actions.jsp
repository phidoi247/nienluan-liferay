<%@include file="/init.jsp"%>
<%
	ResultRow row = (ResultRow) request
			.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	LoaiSP loai = (LoaiSP) row.getObject();
	// long groupId = themeDisplay.getLayout().getGroupId();
	String name = LoaiSP.class.getName();
	String primKey = String.valueOf(loai.getPrimaryKey());
%>
<liferay-ui:icon-list>
	<portlet:actionURL name="editLoaiSP" var="editURL">
		<portlet:param name="resourcePrimKey" value="<%=primKey%>" />
	</portlet:actionURL>
	<liferay-ui:icon image="edit" message="Edit"
		url="<%=editURL.toString()%>" />
	<portlet:actionURL name="deleteLoaiSP" var="deleteURL">
		<portlet:param name="resourcePrimKey" value="<%=primKey%>" />
	</portlet:actionURL>
	<liferay-ui:icon-delete url="<%=deleteURL.toString()%>" />
</liferay-ui:icon-list>