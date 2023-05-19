package com.oneosft_Exception_funtion;

public class ArithemeticException {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			int a=10;
			int b=0;
			System.out.println(a/b);
		}
		catch(ArithmeticException a) {
			//System.out.println("Error Occurs");
			//System.out.println(a);
			a.printStackTrace();
		}
		finally {
			System.out.println("Welcome");
		}
		System.out.println("End");
	}

}
