<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%-- <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored ="false" %>
<%@ include file="/init.jsp"%>
<portlet:defineObjects />
 <portlet:actionURL name="chitiet" var="chitiet" />
		<%
			SanPham sp = SanPhamLocalServiceUtil.getSanPham(1);
		%>
<%-- 	<c:forEach var="sp" items="${sp}"> --%>
<%-- 	<c:out value="${sp.desc}"></c:out> --%>
<%-- 	</c:forEach> --%>
	<ul>
	<li><a href="<%=chitiet.toString()%>?sp=<%=sp.getSpId()%>-<%=sp.getSpName()%>">
	Tên sp: <%=sp.getSpName() %><br/>
	Giá: <%=sp.getGia() %><br/>
	Link hình :# <%=sp.getImage() %><br/>
	Người đăng: <%=sp.getNguoiDang()%><br/>
	</a>
	</li>
	</ul>