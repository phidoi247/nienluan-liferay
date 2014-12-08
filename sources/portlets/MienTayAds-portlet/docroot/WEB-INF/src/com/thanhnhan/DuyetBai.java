package com.thanhnhan;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.thanhnhan.model.SanPham;
import com.thanhnhan.service.SanPhamLocalServiceUtil;

/**
 * Portlet implementation class DuyetBai
 */
public class DuyetBai extends MVCPortlet {
	public void publicSP(ActionRequest request, ActionResponse response)
			throws Exception {
		long spId = ParamUtil.getLong(request, "resourcePrimKey");
		SanPham sp = SanPhamLocalServiceUtil.getSanPham(spId);
		sp.setStatus(1);
		SanPhamLocalServiceUtil.updateSanPham(sp);
		response.setRenderParameter("mvcPath",
				"/html/quanly/view.jsp?tabs1=Quản lý Tin");
	}
	public void unPublicSP(ActionRequest request, ActionResponse response)
			throws Exception {
		long spId = ParamUtil.getLong(request, "resourcePrimKey");
		SanPham sp = SanPhamLocalServiceUtil.getSanPham(spId);
		sp.setStatus(-1);
		SanPhamLocalServiceUtil.updateSanPham(sp);
	}
}
