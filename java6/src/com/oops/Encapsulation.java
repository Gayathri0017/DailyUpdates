package com.oops;

public class Encapsulation {
	public static void main(String args[]) {
	Details e=new Details();
	e.setId(1);
	e.setName("xyz");
	System.out.println("Id:"+e.getId());
	System.out.println("Name:"+e.getName());
	}
}
class Details{
	private int eId;
	private String eName;
	public void setId(int id) {
		this.eId=id;
	}
	public void setName(String name) {
		this.eName=name;
	}
	public int getId() {
		return this.eId;
	}
	public String getName() {
		return this.eName;
	}
}
