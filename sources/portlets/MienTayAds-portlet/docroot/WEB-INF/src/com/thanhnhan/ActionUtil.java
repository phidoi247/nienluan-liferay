package com.thanhnhan;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.RenderRequest;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
//import com.liferay.portal.kernel.util.WebKeys;
//import com.liferay.portal.theme.ThemeDisplay;
import com.thanhnhan.model.KhuVuc;
import com.thanhnhan.model.LoaiSP;
import com.thanhnhan.model.SanPham;
import com.thanhnhan.model.impl.KhuVucImpl;
import com.thanhnhan.model.impl.LoaiSPImpl;
import com.thanhnhan.model.impl.SanPhamImpl;
import com.thanhnhan.service.KhuVucLocalServiceUtil;
import com.thanhnhan.service.LoaiSPLocalServiceUtil;
import com.thanhnhan.service.SanPhamLocalServiceUtil;

public class ActionUtil {
	/**
	 * LoaiSP Manager
	 */

	/**
	 * loaiSPFromRequest
	 * 
	 * @param request
	 * @return
	 */
	public static LoaiSP loaiSPFromRequest(ActionRequest request) {
		// ThemeDisplay themeDisplay = (ThemeDisplay) request
		// .getAttribute(WebKeys.THEME_DISPLAY);
		LoaiSP loai = new LoaiSPImpl();
		loai.setLoaiSPId(ParamUtil.getLong(request, "loaiSPId"));
		loai.setLoaiSPName(ParamUtil.getString(request, "loaiSPName"));
		return loai;
	}

	public static List<LoaiSP> getLoais(RenderRequest request) {
		// ThemeDisplay themeDisplay = (ThemeDisplay) request
		// .getAttribute(WebKeys.THEME_DISPLAY);
		List<LoaiSP> tempResult;
		try {
			int count = LoaiSPLocalServiceUtil.getLoaiSPsCount();
			tempResult = LoaiSPLocalServiceUtil.getLoaiSPs(0, count);
		} catch (SystemException e) {
			// TODO: handle exception
			tempResult = Collections.emptyList();
		}

		return tempResult;
	}

	/**
	 * KhuVuc Manager
	 * 
	 * @author ThanhNhan
	 */
	public static KhuVuc KhuVucFromRequest(ActionRequest request) {
		KhuVuc kv = new KhuVucImpl();
		kv.setKhuVucId(ParamUtil.getString(request, "khuVucId"));
		kv.setKhuVucName(ParamUtil.getString(request, "khuVucName"));

		return kv;
	}

	public static List<KhuVuc> getKVs(RenderRequest request) {
		// ThemeDisplay themeDisplay = (ThemeDisplay) request
		// .getAttribute(WebKeys.THEME_DISPLAY);
		List<KhuVuc> tempResult;
		try {
			int count = KhuVucLocalServiceUtil.getKhuVucsCount();
			tempResult = KhuVucLocalServiceUtil.getKhuVucs(0, count);
		} catch (SystemException e) {
			// TODO: handle exception
			// KHong co KV nao
			tempResult = Collections.emptyList();
		}
		return tempResult;
	}

	public static SanPham SanPhamFromRequest(ActionRequest request) {
		SanPham sp = new SanPhamImpl();
		sp.setSpName(ParamUtil.getString(request, "spName"));
		sp.setDesc(ParamUtil.getString(request, "desc"));
		sp.setNguoiDang(ParamUtil.getString(request, "nguoiDang"));
		sp.setSdt(ParamUtil.getString(request, "sdt"));
		sp.setDiaChi(ParamUtil.getString(request, "diaChi"));
		sp.setGia(ParamUtil.getString(request, "gia"));
		sp.setNgayDang(new Date());
		sp.setImage("/image");
		// sp.setImage(ParamUtil.getString(request, "image"));
		sp.setLoaiSPId(ParamUtil.getLong(request, "loaiSPId"));
		sp.setKhuVucId(ParamUtil.getLong(request, "khuVucId"));
		sp.setPassWord(ParamUtil.getString(request, "passWord"));
		sp.setLoaiNguoiDung(ParamUtil.getInteger(request, "loaiNguoiDung"));
		sp.setLoaiMuaBan(ParamUtil.getInteger(request, "LoaiMuaBan"));
		sp.setEmail(ParamUtil.getString(request, "email"));
		return sp;
	}

	public static List<SanPham> getListSPs() {
		// ThemeDisplay themeDisplay = (ThemeDisplay) request
		// .getAttribute(WebKeys.THEME_DISPLAY);
		List<SanPham> tempResult;
		try {
			tempResult = SanPhamLocalServiceUtil.getSanPhams();
		} catch (SystemException e) {
			// TODO: handle exception
			// KHong co SP nao
			tempResult = Collections.emptyList();
		}
		return tempResult;
	}

	public static List<SanPham> getListSPs(int start, int end) {
		// ThemeDisplay themeDisplay = (ThemeDisplay) request
		// .getAttribute(WebKeys.THEME_DISPLAY);
		List<SanPham> tempResult;
		try {
			tempResult = SanPhamLocalServiceUtil.getSanPhams(start, end);
		} catch (SystemException e) {
			// TODO: handle exception
			// KHong co KV nao
			tempResult = Collections.emptyList();
		}
		return tempResult;
	}

}
