package com.poordata.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.poordata.dto.param.UserParam;
import com.poordata.service.UserService;
import com.poordata.util.PdUtil;

@Controller
@RequestMapping("/ajax")
public class AjaxController {

	@Autowired
	private UserService userService;

	@RequestMapping("dupChkNickname.pd")
	public @ResponseBody
	Object dupChkNickname(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("param") UserParam param) {
		Object obj = null;

		boolean isDuplicate = false;
		isDuplicate = userService.dupChkNickname(param);

		obj = PdUtil.getResult(isDuplicate, param.getResultType());
		return obj;
	}

	@RequestMapping("dupChkEmail.pd")
	public @ResponseBody
	Object dupChkEmail(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("param") UserParam param) {
		Object obj = null;

		boolean isDuplicate = false;
		isDuplicate = userService.dupChkEmail(param);

		obj = PdUtil.getResult(isDuplicate, param.getResultType());

		return obj;
	}
}
