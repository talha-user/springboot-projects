package com.cts.swbdd.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.swbdd.entity.Employee;
import com.cts.swbdd.service.EmployeeService;

@Controller
@RequestMapping("/emps")
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/list")
	public ModelAndView getAllEmployeesAction() {
		return new ModelAndView("emps/list-page","empsList",empService.getAll());
	}
	
	@GetMapping("/add")
	public ModelAndView showEmployeeFormActionToAdd() {
		return new ModelAndView("emps/emp-form-page","emp",new Employee());
	}
	
	@PostMapping("/add")
	public ModelAndView saveEmployeeAction(@ModelAttribute("emp") @Valid Employee emp,BindingResult br) {
		ModelAndView mv = null;

		if(br.hasErrors()) {
			mv = new ModelAndView("emps/emp-form-page","emp",emp);
		} else {
			empService.add(emp);
			//mv = getAllEmployeesAction();
			mv = new ModelAndView("redirect:/emps/list");
		}
		
		return mv;
	}
	
	@GetMapping("/edit")
	public ModelAndView showEmployeeFormActionToEdit(@RequestParam("empId") long empId) {
		return new ModelAndView("emps/emp-form-page","emp",empService.getEmployee(empId));
	}
		
	@PostMapping("/edit")
	public ModelAndView updateEmployeeAction(@ModelAttribute("emp") @Valid Employee emp,BindingResult br) {
		ModelAndView mv = null;

		if(br.hasErrors()) {
			mv = new ModelAndView("emps/emp-form-page","emp",emp);
		} else {
			empService.update(emp);
			//mv = getAllEmployeesAction();
			mv = new ModelAndView("redirect:/emps/list");
		}
		
		return mv;
	}
	
	@GetMapping("/del")
	public String deletingEmployeeAction(@RequestParam("empId") long empId) {
		empService.delete(empId);
		return "redirect:/emps/list";
	}
}