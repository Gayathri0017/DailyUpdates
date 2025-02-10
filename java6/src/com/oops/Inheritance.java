package com.oops;
class Employeee{
	String eName;
	int eId;
	void setData(String name,int id) {
		eName=name;
		eId=id;
	}
	void display() {
		System.out.println("Employee Name:"+eName);
		System.out.println("Employee Id:"+eId);
	}
}
class Manager extends Employeee{
	String eDept;
	void setDept(String dept) {
		eDept=dept;
	}
	void displayDept() {
		System.out.println("Employee Department:"+eDept);
	}
}
public class Inheritance{
	public static void main(String args[]) {
		Manager m=new Manager();
		m.setData("abc",1);
		m.setDept("CSE");
		m.display();
		m.displayDept();
	}
}
