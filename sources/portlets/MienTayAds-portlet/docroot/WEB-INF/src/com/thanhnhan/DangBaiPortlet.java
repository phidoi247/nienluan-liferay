package com.thanhnhan;

import java.util.LinkedList;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
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
		SanPhamLocalServiceUtil.addSP(sp);
	}

	public void editSP(ActionRequest request, ActionResponse response)
			throws Exception {
		long spid = ParamUtil.getLong(request, "resourcePrimKey");
		SanPham sp = SanPhamLocalServiceUtil.getSanPham(spid);
		request.setAttribute("sp", sp);
		response.setRenderParameter("mvcPath", "/html/listsanpham/edit_sp.jsp");
	}

	public void imgUpload(ActionRequest request, ActionResponse reponse) throws Exception
	{
//		LinkedList<FileMeta> files = new LinkedList<FileMeta>();

	}

}
