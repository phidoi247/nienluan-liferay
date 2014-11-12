<%@include file="/init.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
	KhuVuc kv = (KhuVuc) request.getAttribute("kv");
%>
<portlet:renderURL var="cancelURL">
	<portlet:param name="mvcPath" value="/html/quanlykv/view.jsp" />
</portlet:renderURL>
<portlet:actionURL name="updateKV" var="updateKVURL" />
<h2>Edit Khu Vực</h2>

<aui:form name="fm" action="<%=updateKVURL.toString()%>" method="post">
	<aui:fieldset>
		<aui:input name="resourcePrimKey" value="<%=kv.getKhuVucId()%>"
			type="hidden" />
		<aui:input name="kvName" value="<%=kv.getKhuVucName()%>" size="45" />

		<aui:button-row>
			<aui:button type="submit" />
			<aui:button type="cancel" value="Cancel"
				onClick="<%=cancelURL.toString()%>" />
		</aui:button-row>
	</aui:fieldset>
</aui:form>