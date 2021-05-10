   package com.junittesting;

   import java.util.Scanner;
   import java.util.regex.Pattern;

   public class UserRegistration {
	
	//Regular Expressions
	static final String namePattern = "^[A-Z]{1,}[a-z]{2,}$";
	static final String emailPattern = "^(?!\\.)[A-Za-z0-9]+([._%+-]?[0-9])*@[A-Za-z0-9-]+\\.[a-zA-Z]{2,}(\\.[A-Za-z]{2,})?$";
	static final String phoneNumberPattern = "^[91]{2}[0-9]{10}";
	static final String passwordPattern = "(?=.[A-Z])(?=.[a-z])(?=.[0-9])(?=.[-+!@#$%^&*()]).{8,}";
	
	// The method is used to validate your Name
	public void checkNamePattern() {
	    try {
		Scanner userInput1 = new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String checkPattern = userInput1.nextLine();
		
		if(Pattern.matches(namePattern, checkPattern)) {
			System.out.println(checkPattern+" Matches pattern");
		}
		else {
			throw new UserDefinedException("Enter a valid pattern");
		}
	     }
	     catch(UserDefinedException e) {
		System.out.println(e.errormessage);
		checkNamePattern();
	      }
	}
	
	// The Method is used to validate your Email
	 public void checkEmailPattern() {
		try {
			Scanner userInput2 = new Scanner(System.in);
			System.out.println("Enter the Email:");
			String checkPattern = userInput2.nextLine();
		
			if(Pattern.matches(emailPattern, checkPattern)) {
				System.out.println(checkPattern+"  Matches Pattern");
			}
			else {
				throw new UserDefinedException("Enter a valid pattern");
			}
		}
		catch(UserDefinedException e) {
			System.out.println(e.errormessage);
			checkEmailPattern();
	     }
	}
	 
	// The method is used to validate your Phone-Number
	 public void checkPhoneNumberPattern() {
		try {
		    Scanner userInput3 = new Scanner(System.in);
		    System.out.println("Enter Your Phone Number:");
		    String checkPattern = userInput3.nextLine();
			
		    if(Pattern.matches(phoneNumberPattern, checkPattern)) {
			 System.out.println(checkPattern+" Matches Pattern");
		     }
		     else {
			  throw new UserDefinedException("Enter a valid Phone-Number");
		     }
			}
			catch(UserDefinedException e) {
				System.out.println(e.errormessage);
				checkPhoneNumberPattern();
		     }
	 }
	 
	 // The method is used to validate your Password
	 public void checkPasswordPattern() {
		  try {
			Scanner userInput4 = new Scanner(System.in);
			System.out.println("Enter a Password:");
			String checkPattern = userInput4.nextLine();
			
			if(Pattern.matches(phoneNumberPattern, checkPattern)) {
			    System.out.println(checkPattern+" Matches Pattern");
			}
			else {
			    throw new UserDefinedException("Enter a valid password");
			}
		   }
		   catch(UserDefinedException e) {
			System.out.println(e.errormessage);
			checkPasswordPattern();
		     }
	}
	public static void main(String[] args) {
		new UserRegistration().checkNamePattern();
		new UserRegistration().checkEmailPattern();
		new UserRegistration().checkPhoneNumberPattern();
		new UserRegistration().checkPasswordPattern();
	}
}
