<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@include file="/init.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<portlet:defineObjects />
<%
	// Tab value to preselect on page load
	// Default parameter name used by the taglib is "tabs1"
	String tabs1 = ParamUtil.getString(request, "tabs1", "Quản lý Khu Vực");
	//PortletURL portletURL = renderResponse.createRenderURL();
	String tabNames = "Quản lý Khu Vực,Quản lý Danh Mục,Quản lý Tin";
%>


<portlet:renderURL var="changeTabURL" />

<liferay-ui:tabs names="<%= tabNames %>" url="<%=changeTabURL %>" />

<%if(tabs1.equals("Quản lý Khu Vực")){ %>
<%@include file="/html/quanlykv/view.jsp"%>
<%}else if(tabs1.equals("Quản lý Danh Mục")){%>
	<%@include file="/html/themloaisp/view.jsp"%>
<%}else if(tabs1.equals("Quản lý Tin")){%>
	<%@include file="/html/quanlytin/view.jsp"%>
<%
	}
%>
