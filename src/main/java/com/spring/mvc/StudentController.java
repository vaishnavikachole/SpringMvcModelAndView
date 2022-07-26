package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@RequestMapping("/students")
	public 	ModelAndView getStudents()
	{
		System.out.println("this is student controller");
		
		//creating object
		ModelAndView modelandview = new ModelAndView();
		
		//setting data
		modelandview.addObject("name","shifali");
		modelandview.addObject("rollnumber",12);
		
		
		modelandview.setViewName("student");
		return modelandview;
	}
	
	

}
