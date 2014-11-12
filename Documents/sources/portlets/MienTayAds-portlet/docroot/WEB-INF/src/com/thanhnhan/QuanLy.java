package com.thanhnhan;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.thanhnhan.model.KhuVuc;
import com.thanhnhan.model.LoaiSP;
import com.thanhnhan.service.KhuVucLocalServiceUtil;
import com.thanhnhan.service.LoaiSPLocalServiceUtil;

/**
 * Portlet implementation class QuanLy
 */
public class QuanLy extends MVCPortlet {
	/**
	 * Quan Ly Khu Vuc Action
	 * addKV, editKV,updateKV, deleteKV
	 */
	public void addKV(ActionRequest request, ActionResponse response)
			throws Exception {

		KhuVuc kv = ActionUtil.KhuVucFromRequest(request);
		KhuVucLocalServiceUtil.addKhuVuc(kv);
	}

	/**
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void editKV(ActionRequest request, ActionResponse response)
			throws Exception {
		long kvId = ParamUtil.getLong(request, "resourcePrimKey");
		KhuVuc kv = KhuVucLocalServiceUtil.getKhuVuc(kvId);
		request.setAttribute("kv", kv);
		response.setRenderParameter("mvcPath", "/html/quanlykv/editkhuvuc.jsp");
	}

	public void updateKV(ActionRequest request, ActionResponse response)
			throws Exception {
		long kvId = ParamUtil.getLong(request, "resourcePrimKey");
		// ArrayList<String> err = new ArrayList<String>();
		KhuVuc kv = KhuVucLocalServiceUtil.getKhuVuc(kvId);
		KhuVuc requestKV = ActionUtil.KhuVucFromRequest(request);
		kv.setKhuVucId(requestKV.getKhuVucId());
		kv.setKhuVucName(requestKV.getKhuVucName());
		KhuVucLocalServiceUtil.updateKhuVuc(kv);
		SessionMessages.add(request, "KhuVucUpdated");
	}

	public void deleteKV(ActionRequest request, ActionResponse response)
			throws Exception {
		long kvId = ParamUtil.getLong(request, "resourcePrimKey");
		KhuVucLocalServiceUtil.deleteKhuVuc(kvId);
	}
	
	/**
	 * Quan ly Danh Muc, Loai SP
	 * addLoaiSP, editLoaiSP, deleteLoaiSP
	 * 
	 */
	/**
	 * Thêm một sp mới
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void addLoaiSP(ActionRequest request, ActionResponse response)
			throws Exception { 
		LoaiSP loai = ActionUtil.loaiSPFromRequest(request);
		LoaiSPLocalServiceUtil.addLoaiSP(loai);
	}

	/**
	 * PT Sửa loại SP
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void editLoaiSP(ActionRequest request, ActionResponse response)
			throws Exception {
		long loaiSPId = ParamUtil.getLong(request, "resourcePrimKey");
		LoaiSP loai = LoaiSPLocalServiceUtil.getLoaiSP(loaiSPId);
		request.setAttribute("loai", loai);
		response.setRenderParameter("mvcPath",
				"/html/themloaisp/edit_loaisp.jsp");
	}

	public void updateLoaiSP(ActionRequest request, ActionResponse response)
			throws Exception {
		long loaiSPId = ParamUtil.getLong(request, "resourcePrimKey");
		//ArrayList<String> err = new ArrayList<String>();
		LoaiSP loai = LoaiSPLocalServiceUtil.getLoaiSP(loaiSPId);
		LoaiSP requestLoai = ActionUtil.loaiSPFromRequest(request);
		loai.setLoaiSPId(requestLoai.getLoaiSPId());
		loai.setLoaiSPName(requestLoai.getLoaiSPName());
		LoaiSPLocalServiceUtil.updateLoaiSP(loai);
		SessionMessages.add(request, "loaiUpdated");
	}

	public void deleteLoaiSP(ActionRequest request, ActionResponse response)
			throws Exception {
		long loaiSPId = ParamUtil.getLong(request, "resourcePrimKey");
		LoaiSPLocalServiceUtil.deleteLoaiSP(loaiSPId);
	}

}
