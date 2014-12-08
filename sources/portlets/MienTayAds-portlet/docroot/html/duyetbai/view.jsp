<%@include file="/init.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<h3>Quản lý Sản Phẩm</h3>

<liferay-ui:search-container emptyResultsMessage="no-any-sp" delta="10">
	<liferay-ui:search-container-results>
		<%
			List<SanPham> tempResults = ActionUtil.getListWaits();
					results = ListUtil.subList(tempResults,
							searchContainer.getStart(),
							searchContainer.getEnd());
					total = tempResults.size();
					pageContext.setAttribute("results", results);
					pageContext.setAttribute("total", total);
		%>

	</liferay-ui:search-container-results>

	<liferay-ui:search-container-row
		className="com.thanhnhan.model.SanPham" keyProperty="spId"
		modelVar="sp">
		<liferay-ui:search-container-column-text name="san-pham-name"
			property="spName" orderable="true" />
		<liferay-ui:search-container-column-text name="san-pham-nguoidang"
			property="nguoiDang" orderable="true" />
		<liferay-ui:search-container-column-text name="san-pham-startdate"
			property="ngayDang" orderable="true" />
		<liferay-ui:search-container-column-text name="san-pham-gia"
			property="gia" orderable="true" />
		<liferay-ui:search-container-column-jsp name="thao-tac"
			path="/html/duyetbai/admin_action.jsp" />
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />
</liferay-ui:search-container>