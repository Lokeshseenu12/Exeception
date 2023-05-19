package com.oneosft_Exception_funtion;

public class MultiCatchProgram {
	public static void main(String[]args) {
		System.out.println("Start");
		try {
			String[] words= {"Sun","moon","star"};
			System.out.println(words[0].charAt(8));
		}
		catch(ArrayIndexOutOfBoundsException a) {
			a.printStackTrace();
		}
		catch(IndexOutOfBoundsException i) {
			i.printStackTrace();
		}
		catch(RuntimeException r) {
			r.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("End");
	}

}
