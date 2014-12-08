package com.thanhnhan;

import java.io.IOException;

import java.sql.SQLException;

import javax.servlet.http.HttpServletResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.thanhnhan.model.SanPham;
import com.thanhnhan.service.SanPhamLocalServiceUtil;

/**
 * Portlet implementation class ChiTietSanPham
 */
public class ChiTietSanPham extends MVCPortlet {
	public static String[] getPhotos(Long id) throws PortalException,
			SystemException, SQLException {

		SanPham sp = SanPhamLocalServiceUtil.getSanPham(id);
		return sp.getImage().split("imgs_");

	}

}
