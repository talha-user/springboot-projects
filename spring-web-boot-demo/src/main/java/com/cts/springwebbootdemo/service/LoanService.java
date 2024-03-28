package com.cts.springwebbootdemo.service;

import org.springframework.stereotype.Service;

import com.cts.springwebbootdemo.model.Loan;

@Service
public class LoanService {
	
	public double getSimpleInterest(Loan loan) {
		return loan.getPrinciple()*loan.getTerm()*loan.getInterestRate()/100;
	}

}
