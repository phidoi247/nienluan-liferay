<%@include file="/init.jsp"%>
<%
	ResultRow row = (ResultRow) request
			.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	KhuVuc kv = (KhuVuc) row.getObject();
	// long groupId = themeDisplay.getLayout().getGroupId();
	String name = KhuVuc.class.getName();
	String primKey = String.valueOf(kv.getPrimaryKey());
%>
<liferay-ui:icon-list>
	<portlet:actionURL name="editKV" var="editURL">
		<portlet:param name="resourcePrimKey" value="<%=primKey%>" />
	</portlet:actionURL>
	<liferay-ui:icon image="edit" message="Edit"
		url="<%=editURL.toString()%>" />
	<portlet:actionURL name="deleteKV" var="deleteURL">
		<portlet:param name="resourcePrimKey" value="<%=primKey%>" />
	</portlet:actionURL>
	<liferay-ui:icon-delete url="<%=deleteURL.toString()%>" />
</liferay-ui:icon-list>