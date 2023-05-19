package com.oneosft_Exception_funtion;

public class ArrayIndex {
	public static void main(String[]args) {
		System.out.println("Start");
		try {
		String[] a={"Lokesh","Seenu","Nandha"};
		System.out.println(a[3]);	
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println(a);
		}
		System.out.println("End");                      
		
	}

}
