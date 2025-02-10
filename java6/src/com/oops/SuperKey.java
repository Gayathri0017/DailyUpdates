package com.oops;
import java.util.*;
class ProLead{
	String pName="Dharu";
	int eId=100;
	public void display() {
		System.out.println("Project Leader name:" + pName);
		System.out.println("Project Leader Emp_id:" + eId);
	}
}
class Prog extends ProLead{
	String proName;
	int eId;
	public void setDetails(String proName,int eId) {
		this.proName=proName;
		this.eId=eId;
	}
	public void display() {
		System.out.println("Programmer name:"+proName);
		System.out.println("Programmer Emp_id:"+eId);
		super.display();
	}
}
public class SuperKey {
	public static void main(String args[]) {
	Prog p=new Prog();
	p.setDetails("Jeevika",200);
	p.display();
	}
}

