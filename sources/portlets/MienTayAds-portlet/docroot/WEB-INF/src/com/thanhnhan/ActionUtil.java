package com.thanhnhan;

import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.RenderRequest;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.Base64;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;
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
import com.thanhnhan.service.impl.SanPhamLocalServiceImpl;

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
		// loai.setLoaiSPId(ParamUtil.getLong(request, "loaiSPId"));
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

		return sp;
	}

	@SuppressWarnings("unchecked")
	public static List<SanPham> getListSPs() {
		// ThemeDisplay themeDisplay = (ThemeDisplay) request
		// .getAttribute(WebKeys.THEME_DISPLAY);
		List<SanPham> tempResult;
		try {
			DynamicQuery dynamicQuery = DynamicQueryFactoryUtil
					.forClass(SanPham.class);
			dynamicQuery.add(PropertyFactoryUtil.forName("Status").eq(1));
			tempResult = (List<SanPham>) SanPhamLocalServiceUtil
					.dynamicQuery(dynamicQuery);
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
			DynamicQuery dynamicQuery = DynamicQueryFactoryUtil
					.forClass(SanPham.class);
			dynamicQuery.add(PropertyFactoryUtil.forName("Status").eq(1));
			tempResult = (List<SanPham>) SanPhamLocalServiceUtil.dynamicQuery(
					dynamicQuery, start, end);
			// tempResult = SanPhamLocalServiceUtil.getSanPhams(start, end);
		} catch (SystemException e) {
			// TODO: handle exception
			// KHong co KV nao
			tempResult = Collections.emptyList();
		}
		return tempResult;
	}

	/**
	 * get danh sach Cho xet duyet tra ve danh sach San Pham
	 */
	public static List<SanPham> getListWaits() {
		// ThemeDisplay themeDisplay = (ThemeDisplay) request
		// .getAttribute(WebKeys.THEME_DISPLAY);
		List<SanPham> tempResult;
		try {
			DynamicQuery dynamicQuery = DynamicQueryFactoryUtil
					.forClass(SanPham.class);
			dynamicQuery.add(PropertyFactoryUtil.forName("Status").eq(0));
			tempResult = (List<SanPham>) SanPhamLocalServiceUtil
					.dynamicQuery(dynamicQuery);
		} catch (SystemException e) {
			// TODO: handle exception
			// KHong co SP nao
			tempResult = Collections.emptyList();
		}
		return tempResult;
	}

	public static List<SanPham> getListWaits(int start, int end) {
		// ThemeDisplay themeDisplay = (ThemeDisplay) request
		// .getAttribute(WebKeys.THEME_DISPLAY);
		List<SanPham> tempResult;
		try {
			DynamicQuery dynamicQuery = DynamicQueryFactoryUtil
					.forClass(SanPham.class);
			dynamicQuery.add(PropertyFactoryUtil.forName("Status").eq(0));
			tempResult = (List<SanPham>) SanPhamLocalServiceUtil.dynamicQuery(
					dynamicQuery, start, end);
			// tempResult = SanPhamLocalServiceUtil.getSanPhams(start, end);
		} catch (SystemException e) {
			// TODO: handle exception
			// KHong co KV nao
			tempResult = Collections.emptyList();
		}
		return tempResult;
	}

	/**
	 * Convert to Date format
	 * 
	 * @param strDate
	 * @author ThanhNhan
	 */
	public static String toDate(String strDate) {
		DateFormat readFormat = new SimpleDateFormat(
				"EEE MMM dd hh:mm:ss zzz yyyy");
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
		try {
			Date date = readFormat.parse(strDate); // parse Input date
			return format.format(date); // Parse output date
		} catch (ParseException e) {
			return "...";
		}
	}

	/**
	 * Print date beautifuller
	 * 
	 * @param args
	 * @author ThanhNhan
	 * @throws ParseException
	 */
	public static String printDate(String strDate) {
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
		// get current date time with Calendar()
		Calendar cal = Calendar.getInstance();
		try {
			// Get milisecon to post
			long times = cal.getTimeInMillis()
					- dateFormat.parse(toDate(strDate)).getTime();
			if (times < 86400000) {
				if (times < 3600000) {
					return (times / 60000 + " phút trước");
				} else {
					return (times / 3600000 + " giờ trước");
				}
			}
			// System.out.println(times);
			else {
				return dateFormat.format(cal.getTime()).toString();
			}
		} catch (ParseException e) {
			return "...";
		}
	}

	public static void main(String[] args) {
		// toDate("Wed Nov 19 16:32:16 GMT 2014");
		// printDate("Sat Nov 22 11:12:03 ICT 2014");
	}
}
