package com.techproed.springmvctutorial;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ResultController {
	
	//1.Way
//	@RequestMapping("add")
//	public String addNums1(HttpServletRequest req) {
//		
//		int a = Integer.parseInt(req.getParameter("n1"));
//		int b = Integer.parseInt(req.getParameter("n2"));
//		int sum = a + b;
//		int product = a * b;
//		
//		HttpSession session = req.getSession();
//		session.setAttribute("sumOfTwoIntegers", sum);
//		session.setAttribute("productOfTwoIntegers", product);
//		
//		return "result.jsp";
//		
//	}
	
	//2.Way
	@RequestMapping("add")
	public String addNums2(@RequestParam("n1") int a, @RequestParam("n2") int b, HttpSession session) {
		
		int sum = a + b;
		int product = a * b;
		
		session.setAttribute("sumOfTwoIntegers", sum);
		session.setAttribute("productOfTwoIntegers", product);
		
		return "result.jsp";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
