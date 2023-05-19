package com.oneosft_Exception_funtion;

public class Login {
	public void checkPassWord(String password) throws PassWordException {
		try {
			if(password.length()<8) {
				throw new PassWordException("Password must contain above 8 letters");
			}
			else {
				System.out.println("Login sucesssfully");
				
			}
			System.out.println("End");
	}
	catch(PassWordException a) {
	System.out.println(a);
	}
}
}

