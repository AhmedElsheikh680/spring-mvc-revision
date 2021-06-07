package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/loginUser")
	public String login() {
		return "student/loginUser";
	}
	
	@RequestMapping("/pocess")
	public String loginProcess(@RequestParam("fName") String fName, @RequestParam("lName") String lName,
			@RequestParam("age") String age, Model model) {
			Student student = new Student();
			student.setfName(fName);
			student.setlName(lName);
			student.setAge(age);
			model.addAttribute("myStudent", student);
		return "student/show-data";
		
	}

}
