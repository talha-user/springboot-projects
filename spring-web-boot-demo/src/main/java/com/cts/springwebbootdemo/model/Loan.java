package com.cts.springwebbootdemo.model;

public class Loan {

		private double principle;
		private double term;
		private double interestRate; 
		
		public double getPrinciple() {
			return principle;
		}
		public void setPrinciple(double principle) {
			this.principle = principle;
		}
		public double getTerm() {
			return term;
		}
		public void setTerm(double term) {
			this.term = term;
		}
		public double getInterestRate() {
			return interestRate;
		}
		public void setInterestRate(double interestRate) {
			this.interestRate = interestRate;
		}
		
		
	
	
	public Loan() {
			super();
			// TODO Auto-generated constructor stub
		}
	public Loan(double principle,double term,double interestRate) {
		super();
		this.principle = principle;
		this.term = term;
		this.interestRate=interestRate;
	}

	
	

	

}
