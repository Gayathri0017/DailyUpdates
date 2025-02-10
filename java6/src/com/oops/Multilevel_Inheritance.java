package com.oops;
import java.util.*;
public class Multilevel_Inheritance {
	public static void main(String args[]) {
		Adminn a=new Adminn();
		a.personDetails("abc","123,Salem","1234567890","2k21cse030","male");
		a.displayDetails();
		a.setUserDetails(2308,"abc@");
		a.userDetails();
	}
}
class Personn{
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
class User extends Personn{
	private int id;
	private String password;
	private boolean status;
	public void setUserDetails(int uId,String uPassword) {
		id=uId;
		password=uPassword;
	}
	public void userDetails() {
		System.out.println("User Id: "+id);
		System.out.println("Password:"+password);
	}
}
class Adminn extends User{
	String userType;
	Adminn(){
		userType="Admin";
	}
	public void getUserTYpe() {
		System.out.println("UserType:"+userType);
	}
}