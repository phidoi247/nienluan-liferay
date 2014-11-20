<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%-- <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ include file="/init.jsp"%>
<portlet:defineObjects />

<%
	try {
		String id = PortalUtil.getOriginalServletRequest(request)
				.getParameter("id");
%>
<portlet:actionURL name="chitiet" var="chitiet" />
<%
	SanPham sp = SanPhamLocalServiceUtil.getSanPham(Integer
				.parseInt(id));
%>

Tên sp:
<%=sp.getSpName()%><br />
Giá:
<%=sp.getGia()%><br />
Link hình :#
<%=sp.getImage()%><br />
Người đăng:
<%=sp.getNguoiDang()%><br />
<%
	} catch (Exception e) { // Exception if not give id of SP
%>
<div class="portlet-msg-error"><liferay-ui:message key="detail-error" /></div>
<%
	}
%>