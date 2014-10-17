package vn.edu.ctu;

import java.util.ArrayList;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import vn.edu.ctu.model.PRProduct;
import vn.edu.ctu.service.PRProductLocalServiceUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class ProductAdminPortlet
 */
public class ProductAdminPortlet extends MVCPortlet {
	public void addProduct(ActionRequest request, ActionResponse response)	throws Exception {
		ThemeDisplay themeDisplay =(ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		PRProduct product = ActionUtil.productFromRequest(request);
		ArrayList<String> errors = new ArrayList<String>();
		if (ProdRegValidator.validateProduct(product,errors)) {
				PRProductLocalServiceUtil.addProduct(product,themeDisplay.getUserId());
				SessionMessages.add(request, "product-saved-successfully");
		}
		else {
				SessionErrors.add(request,"fields-required");
		}
	}
	
	public void editProduct(ActionRequest request, ActionResponse response)
	        throws Exception {

	        long productKey = ParamUtil.getLong(request, "resourcePrimKey");

	        if (Validator.isNotNull(productKey)) {
	            PRProduct product =
	                PRProductLocalServiceUtil.getPRProduct(productKey);
	            request.setAttribute("product", product);
	            response.setRenderParameter("mvcPath", "/html/productadmin/edit_product.jsp");
	        }
	}
	
	public void updateProduct(ActionRequest request, ActionResponse response)
	        throws Exception {

	        long productKey = ParamUtil.getLong(request, "resourcePrimKey");
	        ArrayList<String> errors = new ArrayList<String>();
	        if (Validator.isNotNull(productKey)) {
	            PRProduct product =
	                PRProductLocalServiceUtil.getPRProduct(productKey);
	            PRProduct requestProduct = ActionUtil.productFromRequest(request);

	            if (ProdRegValidator.validateProduct(requestProduct, errors)) {
	                product.setProductName(requestProduct.getProductName());
	                product.setSerialNumber(requestProduct.getSerialNumber());
	                PRProductLocalServiceUtil.updatePRProduct(product);
	                SessionMessages.add(request, "productUpdated");

	            }
	            else {
	                for (String error : errors) {
	                    SessionErrors.add(request, error);

	                }

	            }

	        }
	        else {
	            SessionErrors.add(request, "error-updating");
	        }

	    }
	public void deleteProduct(ActionRequest request, ActionResponse response)
	        throws Exception {

	        long productKey = ParamUtil.getLong(request, "resourcePrimKey");

	        if (Validator.isNotNull(productKey)) {
	            PRProductLocalServiceUtil.deleteProduct(productKey);
	            SessionMessages.add(request, "productDeleted");
	        }
	        else {
	            SessionErrors.add(request, "error-deleting");
	        }
	    }

}
