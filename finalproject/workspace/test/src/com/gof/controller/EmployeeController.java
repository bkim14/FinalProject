package com.gof.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gof.model.service.EmployeeService;
import com.gof.model.vo.Employee;

@Controller
public class EmployeeController {
	
	private EmployeeService employeeService;
	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/login.do")
	public String login(@RequestParam String rfid, String password
			,HttpSession session) {
		Employee emp = employeeService.login(rfid, password);
		if(emp!=null) {
			session.setAttribute("employee", emp);
			return "redirect:/test.jsp";
		}else {
			return "redirect:/login.jsp";
		}
	}
}
