package com.cts.springwebbootdemo.controller;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
////import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
//
import com.cts.springwebbootdemo.model.Loan;
import com.cts.springwebbootdemo.service.LoanService;

@Controller
@RequestMapping("/loans")
public class LoanController {
	@GetMapping
	public ModelAndView loanPageAction() {
		return new ModelAndView("loan-page","loan",new Loan());
	}
	
	@Autowired
	private LoanService loanService;

	@PostMapping
	public ModelAndView computeSimpleInterest(@ModelAttribute("loan") Loan loan) {
		double interest = loanService.getSimpleInterest(loan);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("loan-page");
		mv.addObject("loan",loan);
		mv.addObject("si",interest);
		
		return mv;
	}
	

}


