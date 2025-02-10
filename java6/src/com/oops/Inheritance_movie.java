package com.oops;

public class Inheritance_movie {
public static void main(String args[]) {
	Admin a=new Admin();
	a.personDetails("abc","123,Salem","1234567890","2k21cse030","male");
	a.displayDetails();
	a.getUserTYpe();
}
}
class Person{
	private String name;
	private String add;
	private String mobile;
	private String email;
	private String gender;
	
	protected void personDetails(String pname,String padd,String pmobile,String pemail,String pgender) {
		name=pname;
		add=padd;
		mobile=pmobile;
		email=pemail;
		gender=pgender;
	}
	protected void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Address:"+add);
		System.out.println("Mobile number:"+mobile);
		System.out.println("Email:"+email);
		System.out.println("Gender:"+gender);
	}
}
class Admin extends Person{
	String userType;
	Admin(){
		userType="Admin";
	}
	public void getUserTYpe() {
		System.out.println("UserType:"+userType);
	}
	
}