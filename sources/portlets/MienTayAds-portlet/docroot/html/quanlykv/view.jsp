<%@include file="/init.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<h3>Thêm khu vực</h3>
<portlet:actionURL name="addKV" var="addKVURL" />
<aui:form action="<%=addKVURL.toString()%>" method="post">
	<aui:fieldset>
		<aui:input name="khuVucId" size="45" required="true" />
		<aui:input name="khuVucName" size="45" required="true" />
		<aui:button-row>
			<aui:button type="submit" value="add" />
		</aui:button-row>
	</aui:fieldset>
</aui:form>
<liferay-ui:search-container emptyResultsMessage="no-any-kv" delta="10">
	<liferay-ui:search-container-results>
		<%
			List<KhuVuc> tempResults = ActionUtil.getKVs(renderRequest);
					results = ListUtil.subList(tempResults,
							searchContainer.getStart(),
							searchContainer.getEnd());
					total = tempResults.size();
					pageContext.setAttribute("results", results);
					pageContext.setAttribute("total", total);
		%>

	</liferay-ui:search-container-results>

	<liferay-ui:search-container-row className="com.thanhnhan.model.KhuVuc"
		keyProperty="kVid" modelVar="kv">
		<liferay-ui:search-container-column-text name="khu-vuc-id"
			property="khuVucId" orderable="true" />
		<liferay-ui:search-container-column-text name="khu-vuc-name"
			property="khuVucName" orderable="true" />
		<liferay-ui:search-container-column-jsp name="thao-tac"
			path="/html/quanlykv/admin_actions.jsp" />
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />
</liferay-ui:search-container>