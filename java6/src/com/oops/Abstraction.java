package com.oops;
import java.util.*;
//enum paymentStatus{
//	UNPAID,COMPLETED;
//}

/*
abstract class Shape{
	protected String color="red";
	protected boolean filled=true;
	Shape(){
		
	}
	Shape(String color,boolean filled){
		this.color=color;
		this.filled=filled;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setFilled(boolean filled) {
		this.filled=filled;
	}
	public String getColor() {
		return this.color;
	}
	public boolean getFilled() {
		return this.filled;
	}
	abstract double getArea();
	abstract double getPerimeter();
	public String toString() {
		return "\nColor:"+getColor()+"\nFilled status:"+getFilled();
	}
}
class Rectangle extends Shape{
	protected double width=1.0;
	protected double length=1.0;
	Rectangle(){
		
	}
	Rectangle(double width,double length){
		this.width=width;
		this.length=length;
	}
	Rectangle(double width,double length,String color,boolean filled){
		super(color,filled);
		this.width=width;
		this.length=length;	
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public void setlength(double length) {
		this.length=length;
	}
	public double getWidth() {
		return this.width;
	}
	public double getLength() {
		return this.length;
	}
	@Override
	public double getArea() {
		return width*length;
	}
	public double getPerimeter() {
		return 2*(width+length);
	}
	public String toString(){
		return super.toString()+"\nArea of rectangle: " + getArea() + "\nPerimeter of rectangle: "+getPerimeter();
	}
}
class Circles extends Shape{
	double rad=1.0;
	final static double pi=3.14;
	Circles(double rad){
		this.rad=rad;
	}
	public void setRadius(double rad) {
		this.rad=rad;
	}
	public double getRadius() {
		return this.rad;
	}
	@Override
	public double getArea() {
		return pi*(rad*rad);
	}
	public double getPerimeter() {
		return 2*pi*rad;
	}
	public String toString() {
		return super.toString()+"\nArea of Circle: "+getArea()+"\nArea of perimeter: "+getPerimeter();
	}
}
class Square extends Shape{
	double side=1.0;
	Square(){
		
	}
	Square(double side){
		this.side=side;
	}
	Square(double side,String color,boolean filled){
		super(color,filled);
		this.side=side;
	}
	public void setSide(double side) {
		this.side=side;
	}
	public double getSide() {
		return this.side;
	}
	@Override
	public double getArea(){
		return side*side;
	}
	public double getPerimeter() {
		return 4*side;
	}
	public String toString(){
		return super.toString()+"\nArea of Square: "+getArea()+"\nPerimeter of Square: "+getPerimeter();
	}
}
public class Abstraction {
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	Shape s;
	System.out.println("Enter width:");
	double w=sc.nextDouble();
	System.out.println("Enter Length:");
	double l=sc.nextDouble();
	s=new Rectangle(w,l);
	System.out.println(s);
	System.out.println("Enter Radius:");
	double r=sc.nextDouble();
	s=new Circles(r);
	System.out.println(s);
	System.out.println("Enter side:");
	double side=sc.nextInt();
	s=new Square(side);
	System.out.println(s);
	}
}
*/

/*
abstract class Payment{
	static double amt;
	static int transactionId;
	static String CreatedOn;
	static paymentStatus status;
	Payment(int id,String date){
		transactionId=id;
		amt=0.0;
		status=paymentStatus.UNPAID;
		CreatedOn=date;
	}
	public abstract void pay(double amt);
	
}
class Card extends Payment{
	int cardNumber;
	Card(int id,String date){
		super(id,date);
	}
	@Override
	public void pay(double amts) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter card number");
		cardNumber=sc.nextInt();
		amt=amts;
		System.out.println("Thank you for making payment through card");
		status=paymentStatus.COMPLETED;
	}
	public void cardDetails() {
		System.out.println("Transaction ID: "+transactionId);
		System.out.println("Amount: "+amt);
		System.out.println("Created on: "+CreatedOn);
		System.out.println("Payment Status: "+status);
		System.out.println("Card number: "+cardNumber);
		
	}
}
class Cash extends Payment{
	double cashAmount;
	Cash(int id,String date){
		super(id,date);
	}
	@Override
	public void pay(double amt) {
		this.amt=amt;
		cashAmount=amt;
		System.out.println("Thank you for make cash payment");
		status=paymentStatus.COMPLETED;
	}
	public void cashDetails() {
		System.out.println("Transaction ID: "+transactionId);
		System.out.println("Amount: "+amt);
		System.out.println("Created on: "+CreatedOn);
		System.out.println("Payment Status: "+status);
		System.out.println("Cash amount: "+cashAmount);
		
	}
}
public class Abstraction{
	public static void main(String args[]) {
		Card c=new Card(1234,"03/05/2025");
		c.pay(120.0);
		c.cardDetails();
		Cash ca=new Cash(1566,"04/05/2025");
		ca.pay(120.0);
		ca.cashDetails();
	}
}
*/
