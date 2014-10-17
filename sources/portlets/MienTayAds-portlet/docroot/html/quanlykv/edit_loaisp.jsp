<%@include file="/init.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
	LoaiSP loai = (LoaiSP) request.getAttribute("loai");
%>
<portlet:renderURL var="cancelURL">
	<portlet:param name="mvcPath" value="/html/themloaisp/view.jsp" />
</portlet:renderURL>
<portlet:actionURL name="updateLoaiSP" var="updateLoaiSPURL" />
<h2>Edit Loại Sản Phẩm</h2>

<aui:form name="fm" action="<%=updateLoaiSPURL.toString()%>"
	method="post">
	<aui:fieldset>
		<aui:input name="resourcePrimKey" value="<%=loai.getLoaiSPId()%>"
			type="hidden" />
		<aui:input name="loaiSPName" value="<%=loai.getLoaiSPName()%>"
			size="45" />

		<aui:button-row>
			<aui:button type="submit" />
			<aui:button type="cancel" value="Cancel"
				onClick="<%=cancelURL.toString()%>" />
		</aui:button-row>
	</aui:fieldset>
</aui:form>