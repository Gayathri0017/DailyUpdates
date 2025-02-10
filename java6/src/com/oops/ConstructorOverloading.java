package com.oops;
public class ConstructorOverloading {
	public static void main(String args[]) {
		Theatre obj=new Theatre(2,"INOX");
		Theatre obj1=new Theatre();
		obj1.display();
		obj.display();
		}
}
class Theatre{
	int tId;
	String tName;
	Theatre(){
		tId=1;
		tName="Multiplex";
	}
	Theatre(int tId,String tName){
		this.tId=tId;
		this.tName=tName;
	}
	public void display() {
		System.out.println("-----Theatre Details-----");
		System.out.println("Theatre id:"+tId);
		System.out.println("Theatre name:"+tName);
	}
}
