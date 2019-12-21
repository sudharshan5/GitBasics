package com.biogen.telephony.java_basics;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Accounts ssr = new Accounts();
		Accounts asp = new Accounts();
		
		ssr.name= "sudharshan";
		ssr.age=27;
		ssr.sal=50000;
		ssr.testeligible();
		
		asp.name="Shree";
		asp.age=25;
		asp.sal=50000;
		asp.testeligible();
		System.out.println("SSR eligile "+ssr.eligiblity);
		System.out.println("ASP eligile "+asp.eligiblity);

	}

}
