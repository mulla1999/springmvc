package com.te.springmvc.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.te.springmvc.employee.Employee;
import com.te.springmvc.employee.services.employeeServices;

@Controller
public class TestController {
	@Autowired
	employeeServices service;

	@GetMapping("/registerpage")
	public String welcome() {
		return "/WEB-INF/view/register.jsp";
	}

	@PostMapping("/register")
	public String register(@ModelAttribute Employee employee) {
		System.out.println(employee);
		service.save(employee);
		return "/WEB-INF/view/registrationdone.jsp";
	}

	@GetMapping("/view")
	public String view() { 
		return "/WEB-INF/view/viewlist.jsp";
	}
	
	@PostMapping("/viewlist")
	public String viewlist(Model model,@RequestParam String id) {
		Employee listEmployee = service.listEmployee(Integer.parseInt(id));
		model.addAttribute("abc", listEmployee);
		return "/WEB-INF/view/list.jsp";
	}
	
	@GetMapping("/update")
	public String update() {
		return "/WEB-INF/view/update.jsp";
	}
	
	@PostMapping("/updated")
	public String updated(Model model,@RequestParam String viewid, @RequestParam String newName, @ModelAttribute Employee emp) {
	service.update(Integer.parseInt(viewid), newName);
	model.addAttribute("update", emp);
		return "/WEB-INF/view/dataupdate.jsp";
	}

	@GetMapping("/delete")
	public String delete() {
		return "/WEB-INF/view/delete.jsp";
	}
	@PostMapping("/dadadeleted")
	public String datadeleted(@RequestParam String viewid) {
		service.delete(Integer.parseInt(viewid));
		return "/WEB-INF/view/empdeleted.jsp";
	}

}
