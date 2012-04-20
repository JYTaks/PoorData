package com.poordata.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.poordata.dto.param.UserParam;
import com.poordata.service.UserService;

@Controller
public class AjaxController {

	@Autowired
	private UserService userService;

	@RequestMapping("/ajax/dupChkNickname.pd")
	public ModelAndView dupChkNickname(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("param") UserParam param) {
		ModelAndView mav = new ModelAndView();

		boolean isDuplicate = false;
		isDuplicate = userService.dupChkNickname(param);

		System.out.println("<<< isDuplicate : " + isDuplicate);
		mav.addObject(isDuplicate);
		return mav;
	}
}
