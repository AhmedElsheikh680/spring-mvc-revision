package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.Student;

@Controller
@RequestMapping("/studentformstag")
public class StudentFormsTagControler {

	@RequestMapping("/login")
	public String login(Model model) {
		Student student = new Student();
		model.addAttribute("myStudent", student);
		return "student-formstag/login";
	}
	
	@RequestMapping("/processLogin")
	public String processLogin(@ModelAttribute("myStudent") Student student) {
		return "student-formstag/show-data";
	}
}
