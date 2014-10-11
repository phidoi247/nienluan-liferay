<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored ="false" %>
<%@ include file="/init.jsp"%>
<portlet:defineObjects />
 
		<%
			SanPham sp = SanPhamLocalServiceUtil.getSanPham(1);
		%>
	<c:forEach var="sp" items="${sp}">
	<c:out value="${sp.desc}"></c:out>
	</c:forEach>
	<%
	%>