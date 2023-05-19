package com.oneosft_Exception_funtion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Mailid {
	public static void main(String[]args) throws IOException {
		File a=new File("C:\\Users\\VICKY\\Documents\\lokesh.txt");
		FileReader b=new FileReader(a);
		int temp=0;
		while((temp=b.read())!=-1) {
			System.out.print((char)(temp));
		}
	}

}
