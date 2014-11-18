<%@page import="com.thanhnhan.service.base.SanPhamLocalServiceBaseImpl"%>
<%@page import="com.thanhnhan.model.impl.SanPhamImpl"%>
<%@page import="com.thanhnhan.service.SanPhamLocalService"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>


<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ include file="/init.jsp"%>
<%@ page import="java.util.Calendar"%>
<%@ page import="java.util.Date"%>

<portlet:defineObjects />
<%
	List<SanPham> listSP;
	try{
		int start = Integer.parseInt(PortalUtil.getOriginalServletRequest(request).getParameter("start"));
		int end = Integer.parseInt(PortalUtil.getOriginalServletRequest(request).getParameter("end"));
		listSP = ActionUtil.getListSPs(start, end);
	}catch(NumberFormatException e){
		listSP = ActionUtil.getListSPs();
	}
	SanPham sp = new SanPhamImpl();
	Date d = new Date();
%>
<div class="list-sanpham">
	<%
		if (listSP == null) {
	%>
	Hiện tại không có sản phẩm nào
	<%
		} // end if
		else {

			for (SanPham s : listSP) {
	%>
	<div class="sanpham-item spid_<%=s.getSpId()%>"
		onClick="location.href='./details?id=<%=s.getSpId()%>&name=<%=s.getSpName()%>';">

		<div class="img-thumb">
			<img src="<%=s.getImage()%>"></img>
		</div>
		<div class="sp-info">
			<div class="sp-name panel-title">
				<%=s.getSpName()%></div>
			<div class="details">
				Giá: <span class="sp-gia"> <%=s.getGia()%></span> Đăng<%=s.getNgayDang()%>
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
	int pages = ceil($get_total_rows[0]/$item_per_page);   

//create pagination
$pagination = '';
if($pages > 1)
{
    $pagination .= '<ul class="paginate">';
    for($i = 1; $i<$pages; $i++)
    {
        $pagination .= '<li><a href="#" class="paginate_click" id="'.$i.'-page">'.$i.'</a></li>';
    }
    $pagination .= '</ul>';
}

?>
    
%>
<%@page import="com.liferay.portal.kernel.search.Hits" %>
<%
Hits hits = AssetUtil.search(request, assetEntryQuery, 0, AssetEntryLocalServiceUtil.getAssetEntriesCount());
int groupTotal = hits.getLength();
%>