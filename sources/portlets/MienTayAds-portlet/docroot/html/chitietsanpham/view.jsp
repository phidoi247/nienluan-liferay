<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="com.thanhnhan.ChiTietSanPham"%>
<%-- <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ include file="/init.jsp"%>
<portlet:defineObjects />

<%
	try {
		String id = PortalUtil.getOriginalServletRequest(request)
				.getParameter("id");
		Long imgid = Long.parseLong(id);
		System.out.println(imgid);
		String[] imgs = ChiTietSanPham.getPhotos(imgid);
		int demImg = imgs.length;
		System.out.println(demImg);
%>
<portlet:actionURL name="chitiet" var="chitiet" />
<%
	SanPham sp = SanPhamLocalServiceUtil.getSanPham(Integer
				.parseInt(id));
%>
<div class="detail-body">
	<div class="detail-right">
		<div class="detail-title">
			<h2><%=sp.getSpName()%></h2>
		</div>
		<div class="image">
			<%
				for (int i = 1; i < demImg; i++) {
					
 			%>
			<img src="data:image/jpg;base64,<%=imgs[i] %>"
				title="Hình ảnh cho <%=sp.getSpName()%>" alt="<%=sp.getSpName()%>" />
			<%
			}
		%> 
		</div>
		<div class="detail-description">
			<div class="gia"><%=sp.getGia()%></div>
			<div class="des-info"><%=sp.getDesc()%></div>
		</div>
		<div class="thao-tac">
			<ul class="">
				<li><a href="#">Chia sẽ tin</a></li>
				<li><a href="javascript:void();" rel="nofollow"
					onclick="window.print()">In nội dung tin</a></li>
				<li><a href="#">Sửa tin</a></li>
				<li><a href="#">Xóa</a></li>
				<li><a href="#">Báo cáo sai phạm</a></li>
			</ul>
			<p class="info">
				Ban quản lý sẽ kiểm duyệt toàn bộ tin trước khi đăng để việc mua bán
				an toàn & hiệu quả hơn. Tuy nhiên, quá trình duyệt tin chỉ có thể
				hạn chế tối đa các trường hợp không trung thực.<br /> Hãy báo cho
				chúng tôi những tin xấu để chúng tôi có thể xác minh & xây dựng
				trang web mua bán an toàn nhất cho người Việt.
			</p>
		</div>
		<div class="clear"></div>
	</div>
	<div class="detail-left">
		<div class="contact-box">
			<h2 class="label-contact">Liên hệ</h2>
			<div class="info-contact"><%=sp.getNguoiDang()%></div>

		</div>
		<div class="tips"></div>
	</div>
</div>

<%
	} catch (Exception e) { // Exception if not give id of SP
%>
<div class="portlet-msg-error">
	<liferay-ui:message key="detail-error" />
</div>
<%
	e.printStackTrace();
	}
%>