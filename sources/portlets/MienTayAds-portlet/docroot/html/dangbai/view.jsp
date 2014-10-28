<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/init.jsp"%>

<portlet:defineObjects />
<portlet:actionURL name="addSP" var="dangBaiUrl" />
<aui:form action="<%=dangBaiUrl.toString()%>" method="post">
	<div class="ui_header">
		<liferay-ui:message key="dang-tin-noi-dung-tin"></liferay-ui:message>
		<span class="ui_header_notice">(<liferay-ui:message
				key="header-notice"></liferay-ui:message>)
		</span>
	</div>
	<aui:row class="ui_row">
		<aui:select label="chon-khu-vuc" model="<%=KhuVuc.class%>"
			id="dang-tin-khuvuc" name="khuVucId" showEmptyOption="<%=false%>">
			<%
				// lay danh sach khu vuc trong Database, 
							// vong lap trong danh sach in ra select các Khuvuc
							List<KhuVuc> khuVucList = KhuVucLocalServiceUtil
									.getKVs();
							for (KhuVuc kv : khuVucList) {
			%>
			<aui:option label="<%=kv.getKhuVucName()%>"
				value="<%=kv.getKhuVucId()%>"></aui:option>
			<%
				} // end for KhuVuc
			%>
		</aui:select>
	</aui:row>
	<aui:row class="ui_row">
		<aui:select label="chon-loai-sp" model="<%=KhuVuc.class%>"
			id="dang-tin-loaisp" name="loaiSPId" required="true">
			<%
				// lay danh sach LoaiSP trong Database, 
							// vong lap trong danh sach in ra select các LoaiSP
							List<LoaiSP> loaiSPList = LoaiSPLocalServiceUtil
									.getAllLoais();
							for (LoaiSP loai : loaiSPList) {
			%>
			<aui:option label="<%=loai.getLoaiSPName()%>"
				value="<%=loai.getLoaiSPId()%>"></aui:option>
			<%
				} // end for LoaiSP
			%>
		</aui:select>
	</aui:row>
	<aui:row name="loaiNguoiDung" class="ui_row" id="dang-tin-cty">
		<label class="ui_label"><liferay-ui:message key="nguoi-dung" /></label>
		<aui:input label="ca-nhan" name="loaiNguoiDung" type="radio"
			required="true" value="0"></aui:input>
		<aui:input label="cong-ty" name="loaiNguoiDung" type="radio"
			required="true" value="1"></aui:input>
	</aui:row>
	<aui:row name="LoaiMuaBan" class="ui_row" id="dang-tin-loai">
		<label class="ui_label"><liferay-ui:message key="mua-ban" /></label>

		<aui:input name="loaiMuaBan" label="can-ban" type="radio"
			required="true" value="0"></aui:input>
		<aui:input name="loaiMuaBan" label="can-mua" type="radio"
			required="true" value="1"></aui:input>
	</aui:row>
	<aui:row class="ui_row">
		<aui:input name="spName" length="50" placeholder="place-name"
			id="dang-tin-tieu-de" label="tieu-de-dang-tin"></aui:input>
	</aui:row>
	<aui:row class="ui_row">
		<aui:input type="textarea" cols="80" rows="8" id="dang-tin-desc"
			name="desc" length="1000" placeholder="place-desc"
			label="desc-dang-tin" />
	</aui:row>

	<aui:row class="ui_row">
		<aui:input type="money" name="gia" id="dang-tin-gia"
			placeholder="place-gia" label="gia-dang-tin" />đ
	</aui:row>
	<aui:row class="ui_row">
		// upload image
	</aui:row>

	<aui:row class="ui_row">
		<aui:input type="textarea" cols="80" rows="8" id="dang-tin-van-chuyen"
			name="desc" length="1000" placeholder="place-van-chuyen"
			label="van-chuyen-dang-tin" />
	</aui:row>

	<div class="ui_header">
		<liferay-ui:message key="dang-tin-thong-tin"></liferay-ui:message>
	</div>
	<aui:row class="ui_row">
		<aui:input name="nguoiDang" length="50" placeholder="place-nguoidang"
			id="dang-tin-nguoidang" label="dang-tin-nguoidang"></aui:input>
	</aui:row>
	<aui:row class="ui_row">
		<aui:input name="passWord" length="50" placeholder="place-password"
			id="dang-tin-password" label="dang-tin-password"></aui:input>
	</aui:row>
	
	<aui:row class="ui_row">
		<aui:input name="sdt" length="50" placeholder="place-sdt"
			id="dang-tin-sdt" label="dang-tin-sdt"></aui:input>
	</aui:row>
	<aui:row class="ui_row">
		<aui:input name="email" type="email" placeholder="place-email"
			id="dang-tin-email" label="dang-tin-email"></aui:input>
	</aui:row>
	<aui:row class="ui_row">
		<aui:input name="diaChi" length="50" placeholder="place-diachi"
			id="dang-tin-diachi" label="dang-tin-diachi"></aui:input>
	</aui:row>
	<aui:button-row>
		<aui:button type="submit" value="add" />
	</aui:button-row>
</aui:form>
