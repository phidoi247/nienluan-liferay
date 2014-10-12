<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%-- <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>
<%@ page isELIgnored ="false" %>
<%@ include file="/init.jsp"%>
<portlet:defineObjects />
 
		<%
			List<SanPham> SPs = SanPhamLocalServiceUtil.getSanPhams(0, 99);
		%>
<%-- 	<c:forEach var="SPs" items="${SPs}"> --%>
<%-- 	<c:out value="${SPs.desc}"></c:out> --%>
<%-- 	</c:forEach> --%>
	<%
	%>