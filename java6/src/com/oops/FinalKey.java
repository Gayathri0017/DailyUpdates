package com.oops;
final class base{
	public final void display() {
		System.out.println("Derived class");
	}
}
class derived extends base{
	@Override;
	public void display() {
		System.out.println("Derived class");
	}
}
public class FinalKey{
	public static void main(String args[]) {
		derived d=new derived();
		d.display();
	}
}