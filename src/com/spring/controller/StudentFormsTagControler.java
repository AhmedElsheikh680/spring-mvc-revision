package com.spring.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
	public String processLogin(@Valid @ModelAttribute("myStudent") Student student, BindingResult rs) {
		if(rs.hasErrors()) {
			return "student-formstag/login";
		}else {
			return "student-formstag/show-data";
		}
		
	}
	
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, editor);
	}
	
	
	
	
	
	
	
}
