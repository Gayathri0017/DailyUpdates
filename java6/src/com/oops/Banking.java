package com.oops;   
import java.util.*;
public class Banking {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int id=sc.nextInt();
	String name=sc.nextLine();
	String loc=sc.nextLine();
	Customer c=new Customer(id,name,loc);
	}
}

class Customer{
	int cusId;
	String cusName;
	String cusLoc;
	Customer(int id,String name,String location){
		cusId=id;
		cusName=name;
		cusLoc=location;
	}	
	public void displayDetails() {
		System.out.println("Id: "+cusId);
		System.out.println("Name: "+cusName);
		System.out.println("Location: "+cusLoc);
	}
}
class Account{
	String accNum;
	Account(String accNum){
		this.accNum=accNum;
	}
}
class RBI{
	Customer c;
	Account a;
	public double getInterestRate() {
		
	}
	public double getWithdrawlLimit(){
		
	}
}
class SBI extends RBI{
	
}
class ICICI extends RBI{
	
}