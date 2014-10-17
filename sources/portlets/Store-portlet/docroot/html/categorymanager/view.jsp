<%@include file="/init.jsp"%>
<portlet:resourceURL var="getUserData" />
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<head>

</head>
<h3>Thêm danh mục sản phẩm</h3>
<portlet:actionURL name="addLoaiSP" var="addLoaiSPURL" />
<portlet:actionURL name="deleteLoaiSP" var="deleteURL" />

<aui:form action="<%=addLoaiSPURL.toString()%>" method="post"
	name="oForm">
	<aui:fieldset>
		<aui:input id="loaiSPName" name="loaiSPName" size="45" required="true" />
		<aui:button-row>
			<aui:button type="button" value="add"
				onclick="javascript:addLoaiSP()" />
		</aui:button-row>
	</aui:fieldset>
</aui:form>
<liferay-ui:search-container emptyResultsMessage="no-any-loai"
	delta="10">
	<%-- 	rowChecker="<%=new com.liferay.portal.kernel.dao.search.RowChecker( --%>
	<%-- 						renderResponse)%>"> --%>
	<liferay-ui:search-container-results>
		<%
			List<LoaiSP> tempResults = ActionUtil
							.getLoais(renderRequest);
					results = ListUtil.subList(tempResults,
							searchContainer.getStart(),
							searchContainer.getEnd());
					total = tempResults.size();
					pageContext.setAttribute("results", results);
					pageContext.setAttribute("total", total);

					//System.out.println(tempResults);
					//System.out.println(results);
					//System.out.println(total);
					//String json = new Gson().toJson(results);
		%>

	</liferay-ui:search-container-results>

	<liferay-ui:search-container-row className="com.thanhnhan.model.LoaiSP"
		keyProperty="loaiSPId" modelVar="loai">
		<liferay-ui:search-container-column-text name="loai-s-p-name"
			property="loaiSPName" orderable="true" />
		<liferay-ui:search-container-column-jsp name="thao-tac"
			path="/html/themloaisp/admin_actions.jsp" />
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator>

	</liferay-ui:search-iterator>

</liferay-ui:search-container>
