package com.thanhnhan;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
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
		SanPhamLocalServiceUtil.addSP(sp);
	}

	public void editSP(ActionRequest request, ActionResponse response)
			throws Exception {
		long spid = ParamUtil.getLong(request, "resourcePrimKey");
		SanPham sp = SanPhamLocalServiceUtil.getSanPham(spid);
		request.setAttribute("sp", sp);
		response.setRenderParameter("mvcPath", "/html/listsanpham/edit_sp.jsp");
	}

	public void upLoadImg(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception
	{
//		LinkedList<FileMeta> files = new LinkedList<FileMeta>();
		String folder = getInitParameter("uploadFolder");
		String realPath = getPortletContext().getRealPath("/");

		System.out.println("RealPath" + realPath + " UploadFolder :" + folder);
		try {
//			logger.info("Siamo nel try");
			UploadPortletRequest uploadRequest = PortalUtil
					.getUploadPortletRequest(actionRequest);
			System.out.println("Size: " + uploadRequest.getSize("fileName"));

			if (uploadRequest.getSize("fileName") == 0) {
				SessionErrors.add(actionRequest, "error");
			}

			String sourceFileName = uploadRequest.getFileName("fileName");
			File file = uploadRequest.getFile("fileName");

			System.out.println("Nome file:" + uploadRequest.getFileName("fileName"));
			File newFile = null;
			newFile = new File(folder + sourceFileName);
			System.out.println("New file name: " + newFile.getName());
			System.out.println("New file path: " + newFile.getPath());
			InputStream in = new BufferedInputStream(
					uploadRequest.getFileAsStream("fileName"));
			FileInputStream fis = new FileInputStream(file);
			FileOutputStream fos = new FileOutputStream(newFile);

			byte[] bytes_ = FileUtil.getBytes(in);
			int i = fis.read(bytes_);

			while (i != -1) {
				fos.write(bytes_, 0, i);
				i = fis.read(bytes_);
			}
			fis.close();
			fos.close();
			Float size = (float) newFile.length();
			System.out.println("file size bytes:" + size);
			System.out.println("file size Mb:" + size / 1048576);

			System.out.println("File created: " + newFile.getName());
			SessionMessages.add(actionRequest, "success");

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found.");
			e.printStackTrace();
			SessionMessages.add(actionRequest, "error");
		} catch (NullPointerException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
			SessionMessages.add(actionRequest, "error");
		}

		catch (IOException e1) {
			System.out.println("Error Reading The File.");
			SessionMessages.add(actionRequest, "error");
			e1.printStackTrace();
		}
	}

}
