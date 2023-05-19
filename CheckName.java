package com.oneosft_Exception_funtion;

public class CheckName {
	public static void main(String[]args) throws NameException{
		String a="Lokesh";
		System.out.println("Start");
		try {
		if(a.startsWith("a")==true ){
			System.out.println("It is startWith A");
		}
		else {
			throw new NameException("Not startsWith A");
		}
	}
	catch (NameException c) {
		System.out.println(c);	
	}
	finally {
		System.out.println(a);
	}
	}

}
