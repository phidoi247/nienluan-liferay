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
 * Portlet implementation class QuanLyKV
 */
public class QuanLyKV extends MVCPortlet {
//	public void addKV(ActionRequest request, ActionResponse response)
//			throws Exception {
//		
//		KhuVuc kv = ActionUtil.KhuVucFromRequest(request);
//		KhuVucLocalServiceUtil.addKhuVuc(kv);
//	}
//	
//	/**
//	 * PT Sửa loại SP
//	 * 
//	 * @param request
//	 * @param response
//	 * @throws Exception
//	 */
//	public void editKV(ActionRequest request, ActionResponse response)
//			throws Exception {
//		long kvId = ParamUtil.getLong(request, "resourcePrimKey");
//		KhuVuc kv = KhuVucLocalServiceUtil.getKhuVuc(kvId);
//		request.setAttribute("kv", kv);
//		response.setRenderParameter("mvcPath",
//				"/html/quanlykv/editkhuvuc.jsp");
//	}
//
//	public void updateKV(ActionRequest request, ActionResponse response)
//			throws Exception {
//		long kvId = ParamUtil.getLong(request, "resourcePrimKey");
//		//ArrayList<String> err = new ArrayList<String>();
//		KhuVuc kv = KhuVucLocalServiceUtil.getKhuVuc(kvId);
//		KhuVuc requestKV = ActionUtil.KhuVucFromRequest(request);
//		kv.setKhuVucId(requestKV.getKhuVucId());
//		kv.setKhuVucName(requestKV.getKhuVucName());
//		KhuVucLocalServiceUtil.updateKhuVuc(kv);
//		SessionMessages.add(request, "KhuVucUpdated");
//	}
//
//	public void deleteLoaiSP(ActionRequest request, ActionResponse response)
//			throws Exception {
//		long loaiSPId = ParamUtil.getLong(request, "resourcePrimKey");
//		LoaiSPLocalServiceUtil.deleteLoaiSP(loaiSPId);
//	}

}

