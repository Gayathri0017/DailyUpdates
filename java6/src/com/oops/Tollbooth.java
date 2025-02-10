package com.oops;
import java.util.*;
public class Tollbooth {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	Highway h=new Highway();
	int n=0;
	System.out.println("1)Paying Vehicle\n2)Nopay Vehicle");
	while(n!=3) {
	n=sc.nextInt();
	if(n==1) {
		h.payingVehicle();
	}
	else if(n==2) {
		h.nopayVehicle();
	}
	else if(n==3) {
		break;
	}
	else {
		System.out.println("Please enter valid number");
	}
	}
	h.display();
	}
}
class Highway{
	int n[];
	double tot;
	Highway(){
		n=new int[2];
		tot=0.0;
	}
	public void payingVehicle() {
			n[0]++;
			tot=tot+0.50;
	}
	public void nopayVehicle() {
			n[1]++;
	}
	public void display() {
		System.out.println("Total number of vehicle:"+(n[0]+n[1]));
		System.out.println("Total Cost:"+tot);
	}
}

