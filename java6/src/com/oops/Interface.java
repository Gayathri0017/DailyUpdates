package com.oops;
import java.util.*;
interface Vehiclee{
	void changeGear(int newgear);
	void speedUp(int incre);
	void applyBracks(int decre);
}
class Bicycle implements Vehiclee{
	int speed;
	int gear;
	public void changeGear(int newgear) {
		gear=newgear;
	}
	public void speedUp(int incre) {
		speed=speed+incre;
	}
	public void applyBracks(int decre) {
		speed=speed-decre;
	}
	public void print() {
		System.out.println("Speed: "+speed+"\nGear: "+gear);
	}
}
class Bike implements Vehiclee{
	int speed;
	int gear;
	public void changeGear(int newgear) {
		gear=newgear;
	}
	public void speedUp(int incre) {
		speed=speed+incre;
	}
	public void applyBracks(int decre) {
		speed=speed-decre;
	}
	public void print() {
		System.out.println("Speed: "+speed+"\nGear: "+gear);
	}
}
public class Interface {
public static void main(String args[]) {
	Bicycle b=new Bicycle();
	b.changeGear(3);
	b.speedUp(2);
	b.applyBracks(1);
	b.print();
	Bike bi=new Bike();
	bi.changeGear(3);
	bi.speedUp(2);
	bi.applyBracks(1);
	bi.print();
}
}
