package com.iPrimed.week1.q1;

public class SimpleInterest {
	final static double interestRate = 10.56;
	static double principleBalance = 200552.68;
	static int time = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double finalAmount;
		finalAmount = principleBalance*(1+(interestRate*time));
		System.out.println("The Final Amount was " + finalAmount);
	}
}
