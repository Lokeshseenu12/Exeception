package com.oneosft_Exception_funtion;

public class NullPointer {
	public static void main(String[] args){
		System.out.println("Start");
	    	String a=null;
	    	try {
	    	System.out.println(a);
	    }
	    catch(NullPointerException a1) {
	    	a1.printStackTrace();
	    }
	}

}
