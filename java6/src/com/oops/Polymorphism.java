package com.oops;
import java.util.*;
/*
class adder{
	static int add(int a,int b) {
		return a+b;
	}
	static double add(double a,double b) {
		return a+b;
	}
}
public class Polymorphism {
	public static void main(String args[]) {
		System.out.println("Method 1: "+adder.add(5, 6));
		System.out.println("Method 2: "+adder.add(10.5, 6.0));
		System.out.println((int)adder.add(10.5, 6.5));
	}
}
*/
class Vehicle{
	void run() {
		System.out.println("Vehicle is running");
	}
}
class Car extends Vehicle{
	void run() {
		System.out.println("Car is running");
	}
}
public class Polymorphism{
	public static void main(String args[]) {
		Vehicle v=new Vehicle();
		v.run();
		Vehicle c=new Car();
		c.run();
	}
}