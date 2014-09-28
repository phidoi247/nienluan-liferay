/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package vn.edu.ctu;

import java.util.Collections;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.RenderRequest;

import vn.edu.ctu.model.PRProduct;
import vn.edu.ctu.model.impl.PRProductImpl;
import vn.edu.ctu.service.PRProductLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;



/**
 *
 * @author nbhung
 *
 */
public class ActionUtil {

    /**
     * Used by the view.jsp to grab the products from the database.
     * @param request
     * @return
     */
    public static List<PRProduct> getProducts(RenderRequest request) {
        ThemeDisplay themeDisplay =
            (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
        long groupId = themeDisplay.getScopeGroupId();
        List<PRProduct> tempResults;
        try {
            tempResults = PRProductLocalServiceUtil.getAllProducts(groupId);
        }   catch (SystemException ex) {
            tempResults  = Collections.EMPTY_LIST;
        }
        return tempResults;
    }

 
    public static PRProduct productFromRequest (ActionRequest request) {
       ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
       PRProduct product = new PRProductImpl();

       product.setCompanyId(themeDisplay.getCompanyId());
       product.setGroupId(themeDisplay.getScopeGroupId());
       product.setProductName(ParamUtil.getString(request, "productName"));
       product.setSerialNumber(ParamUtil.getString(request, "productSerial"));

       return product;
    }

}