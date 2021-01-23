package com.techproed.springmvctutorial;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResultController {
	
	//1.Way
//	@RequestMapping("add")
//	public String addAndMultiplyNums1(HttpServletRequest req) {
//		
//		int a = Integer.parseInt(req.getParameter("n1"));
//		int b = Integer.parseInt(req.getParameter("n2"));
//		int sum = a + b;
//		int product = a * b;
//		
//		HttpSession session = req.getSession();
//		session.setAttribute("sumOfNumbers", sum);
//		session.setAttribute("productOfNumbers", product);
//		
//		return "result";
//	}
	
	//2.Way
//	@RequestMapping("add")
//	public String addAndMultiplyNums2(@RequestParam("n1") int a, @RequestParam("n2") int b, HttpSession session) {
//		
//		int sum = a + b;
//		int product = a * b;
//		
//		session.setAttribute("sumOfNumbers", sum);
//		session.setAttribute("productOfNumbers", product);
//		
//		return "result";
//	}
	
	//3.Way
	//First way of using ModelAndView
//	@RequestMapping("add")
//	public ModelAndView addAndMultiplyNums3(@RequestParam("n1") int a, @RequestParam("n2") int b) {
//		
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("result");
//		
//		int sum = a + b;
//		int product = a * b;
//		
//		mv.addObject("sumOfNumbers", sum);
//		mv.addObject("productOfNumbers", product);
//		
//		return mv;
//	}
	
	//4.Way
	//Second way of using ModelAndView (Recommended)
//	@RequestMapping("add")
//	public ModelAndView addAndMultiplyNums4(@RequestParam("n1") int a, @RequestParam("n2") int b) {
//		
//		ModelAndView mv = new ModelAndView("result");
//		
//		int sum = a + b;
//		int product = a * b;
//		
//		mv.addObject("sumOfNumbers", sum);
//		mv.addObject("productOfNumbers", product);
//		
//		return mv;
//	}
	
	//5.Way
//	@RequestMapping("add")
//	public String addAndMultiplyNums5(@RequestParam("n1") int a, @RequestParam("n2") int b, Model m) {
//		
//		int sum = a + b;
//		int product = a * b;
//		
//		//First usage
////		m.addAttribute("sumOfNumbers", sum);
////		m.addAttribute("productOfNumbers", product);
//		
//		//Second usage
//		m.addAttribute("sumOfNumbers", sum)
//		 .addAttribute("productOfNumbers", product);
//
//		return "result";
//	}
	
	//6.Way
//	@RequestMapping("add")
//	public String addAndMultiplyNums6(@RequestParam("n1") int a, @RequestParam("n2") int b, ModelMap mm) {
//		
//		int sum = a + b;
//		int product = a * b;
//		
//		//First usage
////		mm.addAttribute("sumOfNumbers", sum);
////		mm.addAttribute("productOfNumbers", product);
//		
//		//Second usage
//		mm.addAttribute("sumOfNumbers", sum)
//		 .addAttribute("productOfNumbers", product);
//
//		return "result";
//	}

//**************************************************************************************************************************
	//1.Way
//	@RequestMapping("addStudent")
//	public String addStudent1(@RequestParam("id") int id, @RequestParam("name") String name, Model m) {
//		
//		//First object creation way
////		Student student = new Student();
////		student.setId(id);
////		student.setName(name);
//		
//		//Second object creation way
//		Student student = new Student(id, name);
//		
//		m.addAttribute("studentObject", student);
//		
//		return "result";		
//	}
	
	//2.Way
//	@RequestMapping("addStudent")
//	public String addStudent2(@ModelAttribute Student student, Model m) {
//		
//		m.addAttribute("studentObject", student);
//		
//		return "result";
//	}
	
	//3.Way
//	@RequestMapping("addStudent")
//	public String addStudent3(@ModelAttribute("studentObject") Student student) {
//		return "result";
//	}
//	
//	//How to get a specific field from an object
//	@ModelAttribute
//	public void greetStudent(Model m, Student student) {
//		m.addAttribute("greetStudent", student.getName());
//	}
	
	//How to use POST Method
	//1.Way
	/*
	  To use POST Method 
	  1)Inside the method paranthesis type "method = RequestMethod.POST"
	  2)Go to index.jsp file and add "method = "post"" inside the form tag 
	*/
//	@RequestMapping(value = "addStudent", method = RequestMethod.POST)
//	public String addStudent3(@ModelAttribute("studentObject") Student student) {
//		return "result";
//	}
//	
//	@ModelAttribute
//	public void greetStudent(Model m, Student student) {
//		m.addAttribute("greetStudent", student.getName());
//	}
	
	//2.Way
	/*
	  To use POST Method 
	  1)Use @PostMapping("addStudent") with action name from the form tag
	  2)Go to index.jsp file and add " method = "post" " inside the form tag 
	*/
//	@PostMapping("addStudent")
//	public String addStudent3(@ModelAttribute("studentObject") Student student) {
//		return "result";
//	}
//	
//	@ModelAttribute
//	public void greetStudent(Model m, Student student) {
//		m.addAttribute("greetStudent", student.getName());
//	}
	
	//How to use GET Method
	//1.Way
		/*
		  To use GET Method 
		  1)Inside the method paranthesis type "method = RequestMethod.GET"
		  2)Go to index.jsp file and add "method = "get"" inside the form tag 
		  3)Go to result.jsp file and type ==> ${studentList}
		*/
//	@RequestMapping(value = "getStudent", method = RequestMethod.GET)
//	public String getStudent(Model m) {
//		
//		List<Student> students = new ArrayList<>();
//		students.add(new Student(101, "Ali Can"));
//		students.add(new Student(102, "Veli Han"));
//		students.add(new Student(103, "Mary Star"));
//		students.add(new Student(104, "Tom Hanks"));
//		students.add(new Student(105, "Angie Ocean"));
//		
//		m.addAttribute("studentList", students);
//		
//		return "result";
//	}
	
	//2.Way
	@GetMapping("getStudent")
	public String getStudent(Model m) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student(101, "Ali Can"));
		students.add(new Student(102, "Veli Han"));
		students.add(new Student(103, "Mary Star"));
		students.add(new Student(104, "Tom Hanks"));
		students.add(new Student(105, "Angie Ocean"));
		
		m.addAttribute("studentList", students);
		
		return "result";
	}

}
