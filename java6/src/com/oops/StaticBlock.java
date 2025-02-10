package com.oops;
/*
 * 
public class StaticBlock {
	static int eId;
	static String eName;
	static {
		System.out.println("Static Block 1");
		eId=101;
		eName="xyz";
	}
	static {
		System.out.println("Static Block 2");
		eId=102;
		eName="abc";
	}
	public static void main(String args[]) {
		System.out.println("Id:"+eId);
		System.out.println("Id:"+eName);
	}
}
*/

/*
class Employee{
	int eId;
	String eName;
	static String cName="KIOT";
	Employee(int id,String name){
		eId=id;
		eName=name;
	}
	void display() {
		System.out.println("Id:"+eId);
		System.out.println("Name:"+eName);
		System.out.println("Company Name:"+cName);
	}
}
public class StaticBlock{
	public static void main(String args[]) {
		Employee e=new Employee(001,"abc");
		//e.cName="kiot";
		e.display();
	}
}
*/
//static method
class Employee{
	int eId;
	String eName;
	int c=0;
	static String cName="KIOT";
	Employee(int id,String name){
		eId=id;
		eName=name;
		//c++;
	}
	static void getCompany() {
		cName="kiot";
	}
	void display() {
		System.out.println("Id:"+eId);
		System.out.println("Name:"+eName);
		System.out.println("Company Name:"+cName);
		c++;
		System.out.println("Employee Count:"+ c +"\n-----------------");
	}
}
public class StaticBlock{
	public static void main(String args[]) {
		Employee e=new Employee(001,"abc");
		//e.getCompany(); 
		e.display();
		Employee e1=new Employee(002,"abcd");
		e1.display();
	}
}

