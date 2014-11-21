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
import javax.portlet.PortletException;

import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class Upload
 */
public class Upload extends MVCPortlet {

	public void uploadCase(ActionRequest actionRequest,
			ActionResponse actionRresponse) throws PortletException,
			IOException {

		String folder = getInitParameter("uploadFolder");
		String realPath = getPortletContext().getRealPath("/");

//		logger.info("RealPath" + realPath + " UploadFolder :" + folder);
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

//			logger.info("Nome file:" + uploadRequest.getFileName("fileName"));
			File newFile = null;
			newFile = new File(folder + sourceFileName);
//			logger.info("New file name: " + newFile.getName());
//			logger.info("New file path: " + newFile.getPath());
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

//			logger.info("File created: " + newFile.getName());
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
