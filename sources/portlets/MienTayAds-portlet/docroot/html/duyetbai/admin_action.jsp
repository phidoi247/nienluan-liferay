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
	<portlet:actionURL name="unPublicSP" var="Reject">
		<portlet:param name="resourcePrimKey" value="<%=primKey%>" />
	</portlet:actionURL>

	<%
		if (sp.getStatus() == 0) {
	%>
	<liferay-ui:icon image="edit" message="Duyet"
		url="<%=Public.toString()%>" />
	<liferay-ui:icon image="edit" message="Khong duyet"
		url="<%=Reject.toString()%>" />
	<%
		}
	%>
</liferay-ui:icon-list>