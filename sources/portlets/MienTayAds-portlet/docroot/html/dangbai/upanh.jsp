<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/init.jsp"%>
<%@ page import="com.mysql.jdbc.MysqlDataTruncation"%>
<%@ page import="javax.portlet.PortletSession"%>
<%@ page import="javax.portlet.PortletPreferences;"%>
<portlet:defineObjects />
<portlet:actionURL name="addSP" var="dangBaiUrl" />


<%
	ResultRow row = (ResultRow) request
			.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	SanPham sp = (SanPham) row.getObject();
	String primKey = String.valueOf(sp.getPrimaryKey());
	String name = SanPham.class.getName();
%>
<%=sp.getDesc()%>
<aui:row class="ui_row">
	<label for="images">Up load hình ảnh(tối đa 5 hình ảnh):</label>
	<input type="file" name="images" multiple />
</aui:row>
