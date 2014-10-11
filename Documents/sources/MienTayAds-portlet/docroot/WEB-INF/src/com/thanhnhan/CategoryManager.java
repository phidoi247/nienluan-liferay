package com.thanhnhan;

import java.util.ArrayList;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.thanhnhan.model.LoaiSP;
import com.thanhnhan.service.LoaiSPLocalServiceUtil;

/**
 * Portlet implementation class ThemLoaiSP
 */
public class CategoryManager extends MVCPortlet {
	/**
	 * Thêm một sp mới
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void addLoaiSP(ActionRequest request, ActionResponse response)
			throws Exception {
//		ThemeDisplay themeDisplay = (ThemeDisplay) request
//				.getAttribute(WebKeys.THEME_DISPLAY);
		LoaiSP loai = ActionUtil.loaiSPFromRequest(request);
		LoaiSPLocalServiceUtil.addLoaiSP(loai);
//		JSONObject jloai=JSONFactoryUtil.createJSONObject();
//		if(loai!=null){
//		jloai.put("loaiSPName", loai.getLoaiSPName());
//		}else{
//			System.out.println("===========error in getloai===");
//			jloai.put("error","Khong thuc hien duoc");
//		}
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
