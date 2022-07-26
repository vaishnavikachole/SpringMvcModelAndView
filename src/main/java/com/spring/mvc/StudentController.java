package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	
	@RequestMapping("/students")
	public String getStudents()
	{
		System.out.println("this is student controller");
		return "student";
	}
	
	

}
