package com.assignment;
import java.util.*;
public class ASS_1 {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	/*
	System.out.println("Enter the wage of the employee");
	int wage=sc.nextInt();
	System.out.println("Enter the No of days worked");
	int num=sc.nextInt();
	System.out.println("Your Total salary is "+(num*wage));
	*/
	
	/*
	System.out.println("Enter a number");
	int num=sc.nextInt();
	if(num%7==0) {
		System.out.println("Number "+num+" is divisor of 7");
	}
	else {
		System.out.println("Number "+num+" is not a divisor of 7");
	}
	*/
	
	/*
	System.out.println("Enter your Age");
	int age=sc.nextInt();
	System.out.println("Enter your weight");
	float wei=sc.nextFloat();
	if(age>18 && age<55 && wei>45) {
		System.out.println("You are eligible");
	}
	else {
		System.out.println("You are not eligible");
	}
	*/
	
	/*
	System.out.println("Enter the Value");
	char c=sc.next().charAt(0);
	if(c>='A'&& c<='Z' || c>='a'&& c<='z') {
		System.out.println("Albhabets");
	}
	else if(c>='0' && c<='9'){
		System.out.println("Numbers");
	}
	else {
		System.out.println("Special Symbols");
	}
	*/
	
	//nestedif
	/*
	String UserName="Gayathri001",PassWord="G4863";
	boolean seat=true;
	System.out.println("Enter UserName");
	String un=sc.next();
	System.out.println("Enter PassWord");
	String pass=sc.next();
	if(un.equals(UserName) && pass.equals(PassWord)) {
		System.out.println("Enter your seat number");
		int s=sc.nextInt();
		if(seat) {
			System.out.println("Seat number "+s+" booked");
		}
		else {
			System.out.println("Seat number "+s+" is not available");
		}
	}
	else {
		System.out.println("Please enter valid user name and password");
		}
	*/
	//switch case
	/*
	System.out.print("Choose the seat type \n1) REGULAR\n2) PREMIMUM\n3) EXECUTIVE\n4) VIP\n");
	int type=sc.nextInt();
	switch(type) {
	case 1:
		System.out.print("You choose regular seat type");
		break;
	case 2:
		System.out.print("You choose premimum seat type");
		break;	
	case 3:
		System.out.print("You choose executive seat type");
		break;	
	case 4:
		System.out.print("You choose VIP seat type");
		break;	
	default:
	case 5:
		System.out.print("Please enter a valid seat type");
		break;
	}
	*/
	
	//while loop
	/*
	int max=10;
	int seat=0;
	while(max>seat) {
		System.out.println("Current available is "+(max-seat));
		seat++;
	}
	System.out.print("Seats are filled");
	*/
	
	//do while
	/*
	int max=10;
	int seat=0;
		do {
			System.out.println("Current available is "+(max-seat));
			seat++;
		}while(max>seat);
		System.out.print("Seats are filled");
	}
	*/
	//for loop
	/*
	int max=10;
	int seat=0;
	for(seat=0;seat<max;seat++) {
		System.out.println("Current available is "+(max-seat));
	}
	System.out.print("Seats are filled");
	*/
	
	//for each
	/*
	int[] marks= {100,29,38,44,55};
	int max=0;
	for(int val:marks) {
		if(val>max) {
			max=val;
		}
	}
	System.out.println("Maximum mark is : "+max);
	*/
	/*
	String name[]= {"ab","abc","abcd"};
	String genre[]= {"action","comedy","action"};
	System.out.println("Enter the genre");
	String gType=sc.next();
	int c=0;
	System.out.print(gType+" Movies are:\n");
	for(String val:genre) {
		if(val.equals(gType)) {
			System.out.println(name[c]);
		}
		c++;
	}
	*/
	//nested loop
	/*
	int maxSeats=10,maxScreen=2;
	int seat=0,screen=0;
	while(maxScreen>screen) {
		seat=0;
		System.out.println("Seats filled in screen "+(seat+1));
		while(maxSeats>seat){
		System.out.println("Current available is "+(maxSeats-seat));
		seat++;
		}
		screen++;
	}
	System.out.print("Seats are filled");
	*/
	/*
	int maxSeats=10,maxScreen=2;
	int seat=0,screen=0;
	do{
		seat=0;
		System.out.println("Seats filled in screen "+(seat+1));
		do{
		System.out.println("Current available is "+(maxSeats-seat));
		seat++;
		}while(maxSeats>seat);
		screen++;
	}while(maxScreen>screen);
	System.out.print("Seats are filled in "+(screen));
	*/
	/*
	//break
	int pre=5,vip=5,seat=0;
	int tot=pre+vip;
	for(seat=0;seat<tot;seat++) {
		if(seat>pre) {
			System.out.println("Premimum seats are filled");
			System.out.println("VIP seats are reserved");
			break;	
		}
		else {
			System.out.println("Available premimum seats are: "+(pre-seat));
		}
	}
	*/
	//continue
	/*
	int pre=5,vip=5,exe=5,seat=0;
	int tot=pre+vip+exe;
	for(seat=0;seat<tot;seat++){
		if(seat<vip) {
			System.out.println("VIP seats are reserved");
			continue;
		}
		else if(seat<(vip+pre)) {
			System.out.println("Available premimum seats are: "+(seat+1));
		}
		else if(seat<(vip+pre+exe)) {
			System.out.println("Available executive seats are: "+(seat+1));
		}
	}
	*/
	/*
	int maxSeats=5,maxScreen=2;
	int seat=0,screen=-1;
	start:
	while(maxScreen>screen) {
		screen++;
		System.out.println("Seats filled in screen "+(seat+1));
		seat=0;
		while(maxSeats>seat) {
			if(seat>=3 & screen==1) {
				System.out.println("Seats 4 and 5 are reserved");
				continue start;
			}
			else {
				System.out.println("Seat no "+(seat+1)+" booked");
				seat++;
			}
		}
		System.out.println("Seats are filled in "+(screen+1));
	}
	*/
//	int i=0;
//	int res=1;
//	while(true) {
//		++i;
//		if(i%2==0) {
//			continue;
//		}
//		else if(i%5==0) {
//			break;
//		}
//		res*=3;
//	}
//	for(int i=0; ; i++) {
//	System.out.print("hello");
//	}
	
	//harshad number
	/*
	int n=sc.nextInt();
	int num=n;
	int sum=0;
	while(n!=0) {
		int rem=n%10;
		sum=sum+rem;
		n/=10;
	}
	if(num%sum==0) {
		System.out.print("true");
	}
	else {
		System.out.print("false");
	}
	*/
}
}
