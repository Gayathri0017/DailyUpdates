package com.oops;
class Base{
	Base(){
	System.out.println("Base");
	}
}
class Derived1 extends Base{
	Derived1(){
		System.out.println("Derived 1");
	}
}
class Derived2 extends Derived1{
	Derived2(){
		System.out.println("Derived 2");
	}
}
public class ConstructorChaining {
	public static void main(String args[]) {
		Derived2 d=new Derived2();
	}
}
