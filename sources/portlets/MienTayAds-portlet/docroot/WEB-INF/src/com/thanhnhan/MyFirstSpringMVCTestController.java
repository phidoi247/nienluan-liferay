package com.thanhnhan;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller(value = "MyFirstSpringMVCTestController")
@RequestMapping("VIEW")
public class MyFirstSpringMVCTestController {
	@RenderMapping
	public String handleRenderRequest(RenderRequest request,
			RenderResponse response, Model model) {
		return "defaultRender";
	}
}