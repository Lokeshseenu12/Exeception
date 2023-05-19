package com.oneosft_Exception_funtion;

public class VoterAge {
	public static void main(String[]args) throws AgeException{
		int age=13;
		System.out.println("Start");
		try {
		if(age<18) {
			throw new AgeException("NotEligible");
		}
		else {
			System.out.println("Eligible");
		}
		}
		catch(AgeException b) {
			System.out.println(b);
		}
		System.out.println("End");
	}

}
