<%@page import="com.thanhnhan.service.base.SanPhamLocalServiceBaseImpl"%>
<%@page import="com.thanhnhan.model.impl.SanPhamImpl"%>
<%@page import="com.thanhnhan.service.SanPhamLocalService"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="com.thanhnhan.ChiTietSanPham"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%> --%>


<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ include file="/init.jsp"%>
<%@ page import="java.util.Calendar"%>
<%@ page import="java.util.Date"%>

<portlet:defineObjects />
<%
	try{
	List<SanPham> listSP;
	try {
		int start = Integer.parseInt(PortalUtil
				.getOriginalServletRequest(request).getParameter(
						"start"));
		int end = Integer
				.parseInt(PortalUtil.getOriginalServletRequest(request)
						.getParameter("end"));
		listSP = ActionUtil.getListSPs(start, end);
	} catch (NumberFormatException e) {
		listSP = ActionUtil.getListSPs();
	}
	SanPham sp = new SanPhamImpl();
	Date d = new Date();
	
%>
<div class="list-sanpham">
	<%
		if (listSP == null) {
	%>
	<div class="portlet-msg-error">
	dsdsd
		<liferay-ui:message key="list-empty" />
	</div>
	<%
		} // end if
		else {

			for (SanPham s : listSP) {
			String[] imgs = ChiTietSanPham.getPhotos(s.getPrimaryKey());
	%>
	<div class="sanpham-item spid_<%=s.getSpId()%>"
		onClick="location.href='./details?id=<%=s.getSpId()%>&name=<%=s.getSpName()%>';">

		<div class="img-thumb">
			<img src="data:image/jpg;base64,<%=imgs[1] %>"
				title="Hình <%=sp.getSpName()%>" alt="<%=sp.getSpName()%>"/>
		</div>
		<div class="sp-info">
			<div class="sp-name panel-title">
				<%=s.getSpName()%></div>
			<div class="details">
				<div class="giasp">
					Giá: <span class="sp-gia"> <%=s.getGia()%></span>
				</div>
				<div class="time"><%=ActionUtil.printDate(s.getNgayDang().toString())%></div>

			</div>
		</div>
		<div class="clear"></div>
	</div>


	<%
		}
	%>

	<%
		} // end else
	
	%>
</div>
<%
	int totals = listSP.size(); //total records
	//break total records into pages
	// 	int pages = ceil($get_total_rows[0]/$item_per_page);   

	//create pagination
	// $pagination = '';
	// if($pages > 1)
	// {
	//     $pagination .= '<ul class="paginate">';
	//     for($i = 1; $i<$pages; $i++)
	//     {
	//         $pagination .= '<li><a href="#" class="paginate_click" id="'.$i.'-page">'.$i.'</a></li>';
	//     }
	//     $pagination .= '</ul>';
	// }

	// ?>
	}catch(Exception e1){
		%>
		<div class="portlet-msg-error">
			<liferay-ui:message key="list-empty" />
		</div>
		<%
	}
%>