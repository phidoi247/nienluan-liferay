package com.thanhnhan;

import java.io.File;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletSession;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.Base64;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.thanhnhan.model.SanPham;
import com.thanhnhan.service.SanPhamLocalServiceUtil;

/**
 * Portlet implementation class DangBaiPortlet
 */
public class DangBaiPortlet extends MVCPortlet {
	public void addSP(ActionRequest request, ActionResponse response)
			throws SystemException {
		SanPham sp = ActionUtil.SanPhamFromRequest(request);
		UploadPortletRequest ureq = PortalUtil.getUploadPortletRequest(request);
		sp.setSpName(ureq.getParameter("spName"));
		sp.setDesc(ureq.getParameter("desc"));
		sp.setNguoiDang(ureq.getParameter("nguoiDang"));
		sp.setSdt(ureq.getParameter("sdt"));
		sp.setDiaChi(ureq.getParameter("diaChi"));
		sp.setGia(ureq.getParameter("gia"));
		sp.setNgayDang(new Date());
		sp.setLoaiSPId(Long.parseLong(ureq.getParameter("loaiSPId")));
		sp.setPassWord(ureq.getParameter("passWord"));
		sp.setLoaiNguoiDung(Integer.parseInt(ureq.getParameter("loaiNguoiDung")));
		sp.setLoaiMuaBan(Integer.parseInt(ureq.getParameter("loaiMuaBan")));
		sp.setEmail(ureq.getParameter("email"));
		sp.setKVid(Long.parseLong(ureq.getParameter("khuVucId")));
		sp.setStatus(0);
		// upload file
		File[] file = ureq.getFiles("images");
		String imgs = "";
		for (File f : file) {
			byte[] bt;
			try {
				bt = FileUtil.getBytes(f);
				imgs += "imgs_" + (Base64.objectToString(bt));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		sp.setImage(imgs);
		SanPhamLocalServiceUtil.addSP(sp); // add san pham vao database

	}

	// public void dangSP(ActionRequest request, ActionResponse response)
	// throws SystemException {
	// SanPham sp = ActionUtil.SanPhamFromRequest(request);
	// /**
	// * Upload images
	// */
	// UploadPortletRequest ureq = PortalUtil.getUploadPortletRequest(request);
	// File[] file = ureq.getFiles("images");
	// String imgs = "";
	// for (File f : file) {
	// byte[] bt;
	// try {
	// bt = FileUtil.getBytes(f);
	// imgs += "imgs_" + (Base64.objectToString(bt));
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }
	// sp.setImage(imgs);
	// request.setAttribute("sp", sp);
	// response.setRenderParameter("mvcPath", "/html/dangbai/upanh.jsp");
	//
	// }

	public void editSP(ActionRequest request, ActionResponse response)
			throws Exception {
		long spid = ParamUtil.getLong(request, "resourcePrimKey");
		SanPham sp = SanPhamLocalServiceUtil.getSanPham(spid);
		request.setAttribute("sp", sp);
		response.setRenderParameter("mvcPath", "/html/listsanpham/edit_sp.jsp");
	}

}
