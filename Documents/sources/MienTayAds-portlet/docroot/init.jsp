<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<% /// @ taglib uri="http://liferay.com/tld/portlet" prefix="liferayportlet"%>


<% // @ taglib uri="http://liferay.com/tld/security"	prefix="liferaysecurity"%>
<% /// @ taglib uri="http://liferay.com/tld/theme" prefix="liferaytheme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.Calendar"%>
<%@ page import="java.util.Collections"%>
<%// @ page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ page import="com.liferay.portal.kernel.util.CalendarFactoryUtil"%>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchEntry"%>

<%@ page import="com.liferay.portal.kernel.dao.search.SearchEntry"%>
<%@ page import="com.liferay.portal.kernel.exception.SystemException"%>
<%@ page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@ page import="com.liferay.portal.security.permission.ActionKeys"%>
<%@ page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@ page
	import="com.liferay.portal.service.permission.PortalPermissionUtil"%>
<%@ page
	import="com.liferay.portal.service.permission.PortletPermissionUtil"%>
<%@ page import="com.thanhnhan.model.LoaiSP"%>
<%@ page import="com.thanhnhan.ActionUtil"%>
<%@ page import="com.thanhnhan.service.LoaiSPLocalServiceUtil"%>
<%@ page import="com.thanhnhan.model.KhuVuc"%>
<%@ page import="com.thanhnhan.service.KhuVucLocalServiceUtil"%>
<%@ page import="com.thanhnhan.model.SanPham"%>
<%@ page import="com.thanhnhan.service.SanPhamLocalServiceUtil"%>


<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<% /// @ page import="javax.portlet.PortletURL"%>
<!-- jQuery -->
<script src="<%=request.getContextPath().toString() %>/js/jquery-2.1.1.min.js"></script>

<portlet:defineObjects />
