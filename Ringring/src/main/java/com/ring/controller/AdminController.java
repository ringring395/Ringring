package com.ring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {
	
	//관리자 ->1:1문의 리스트
	@RequestMapping(value="/admin_help_list", method = RequestMethod.GET)
	public String admin_help_list() {
		return "/Admin/admin_help_list";
	}
	
	//관리자 ->1:1문의 답변
	@RequestMapping(value="/admin_help", method = RequestMethod.GET)
	public String admin_help() {
		return "/Admin/admin_help";
	}	
}
