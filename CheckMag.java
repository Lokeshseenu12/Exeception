package com.oneosft_Exception_funtion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckMag {
	public static void main(String[] args) throws IOException {
		try {
		File a=new File("C:\\Users\\VICKY\\Documents\\lokes.txt");
		FileReader b=new FileReader(a);
		int temp=0;
		while((temp=b.read())!=-1) {
			System.out.print((char)(temp));
		}
		}
		catch(FileNotFoundException a) {
			System.out.println(a);
		}
	}

}
