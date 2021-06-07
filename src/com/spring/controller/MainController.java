package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String main() {
		return "main-page";
	}
	
	@RequestMapping("/profile")
	public String profile() {
		return "profile";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping("loginProcess")
	public String loginProcess(HttpServletRequest req, Model model) {
		String user = "(Username = "+req.getParameter("user").toUpperCase() + " )";
		String pass = "(Passworrd = "+ req.getParameter("pass").toUpperCase() + " )";
		model.addAttribute("newUserName", user);
		model.addAttribute("newPassword", pass);
		return "main";
	}
}
