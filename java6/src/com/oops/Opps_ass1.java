package com.oops;
import java.util.*;
class Circle{
	private double r;
	private String c;
	public void setRadius(double r){
		this.r=r;
	}
	public double getRadius(){
		return this.r;
	}
	public void setColor(String c) {
		this.c=c;
	}
	public String getColor() {
		return this.c;
	}
	public double getArea() {
		return 3.14159265359*(r*r);
	}
	Circle(){
		
	}
	Circle(double r){
		this.r=r;
	}
	Circle(double r,String c){
		this.r=r;
		this.c=c;
	}
	@Override
    public String toString() {
        return "Radius: " + getRadius() + "\nColor: " + getColor() + "\nArea of Circle: " + getArea();
    }
	
}
public class Opps_ass1 {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter radius");
	double r=sc.nextDouble();
	System.out.println("Enter color");
	String c=sc.next();
	Circle obj1=new Circle();
	Circle obj2=new Circle(r);
	Circle obj3=new Circle(r,c);
	System.out.println("Constructor 1");
	System.out.println(obj1);
	System.out.println("-------------------------------\nConstructor 2");
	System.out.println(obj2);
	System.out.println("-------------------------------\nConstructor 3");
	System.out.println(obj3);
	}
}
