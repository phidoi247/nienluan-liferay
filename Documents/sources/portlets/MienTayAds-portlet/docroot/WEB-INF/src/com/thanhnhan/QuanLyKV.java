package com.thanhnhan;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
 

import com.liferay.util.bridges.mvc.MVCPortlet;
import com.thanhnhan.model.KhuVuc;
import com.thanhnhan.service.KhuVucLocalServiceUtil;

/**
 * Portlet implementation class QuanLyKV
 */
public class QuanLyKV extends MVCPortlet {
	public void addKV(ActionRequest request, ActionResponse response)
			throws Exception {
		
		KhuVuc kv = ActionUtil.KhuVucFromRequest(request);
		KhuVucLocalServiceUtil.addKhuVuc(kv);
	}

}
