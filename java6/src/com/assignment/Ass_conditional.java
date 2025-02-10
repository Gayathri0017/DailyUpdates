package com.assignment;
import java.util.*;
import java.util.Arrays;
//public class Ass_conditional {
////Hard:4. A cloth showroom has announced the following festival discounts on the purchase of items based on the total cost of the items purchased:
//	public static void main(String args[]) {
//	Scanner sc=new Scanner(System.in);
	/*
	int n=sc.nextInt();
	double amt=0;
	if(n<2000) {
		double per=0.05*n;
		System.out.print(n-per);
	}
	else if(n>2000 && n<=5000) {
		double per=0.25*n;
		System.out.print(n-per);
	}
	else if(n>5000 && n<=10000) {
		double per=0.35*n;
		System.out.print(n-per);
	}
	else {
		double per=0.50*n;
		System.out.print(n-per);
	}
	*/
/*hard 3:Ana planned to choose the four digit lucky number for her car. Her lucky numbers are 3, 
5 and 7. Help her to find the number, whose sum is divisible by 3 or 5 or 7. Provide a 
valid car number, Fails to provide a valid input then display that number is not a valid 
car number.
*/
	/*
	int n=sc.nextInt();
	int num=n;
	int sum=0;
	int c=0;
	if(n<=999){
		System.out.print(num+" is Invalid input");
	}
	while(n>0) {
		int rem=n%10;
		sum+=rem;
		n/=10;
	}
	else if(sum%3==0 || sum%5==0 || sum%7==0) {
		System.out.print("Lucky number");
	}
	else {
		System.out.print("Sorry! it is not my lucky number");
	}
	*/
	
/*
7. med: To input basic salary of an employee and calculate gross salary based on the condition 
given below using if-else-if ststement: 
*/
	/*
	System.out.print("Enter the basic salary");
	int sal=sc.nextInt();
	if(sal<=10000) {
		double hra=sal*0.20;
		double da=sal*0.80;
		System.out.print(hra+da+sal);
	}
	else if(sal>10000 && sal<=20000) {
		double hra=sal*0.25;
		double da=sal*0.90;
		System.out.print(hra+da+sal);
	}
	else if(sal>20000) {
		double hra=sal*0.30;
		double da=sal*0.95;
		System.out.print(hra+da+sal);
	}
	*/
 /*
  9. To check whether the given number is Armstrong number or not.
  */
	/*
	System.out.print("Enter a number");
	int n=sc.nextInt();
	int num=n,nu=n;
	int sum=0;
	int dig=0;
	while(nu>0) {
		dig++;
		nu/=10;
	}
	//System.out.print(dig);
	while(n>0) {
		int rem=n%10;
		sum+=Math.pow(rem,dig);
		n/=10;
	}
	//System.out.print(sum);
	if(sum==num) {
		System.out.print("Amstrong num");
	}
	else {
		System.out.print("Not Amstrong");
	}
	*/
	//8. Accepts a string and calculate the number of digits and letters.
	/*
	System.out.print("Enter a string");
	String s=sc.nextLine();
	int d=0,c=0,sp=0;
	for(int i=0;i<s.length();i++) {
		if(Character.isDigit(s.charAt(i))) {
			d++;
		}
		else if(Character.isAlphabetic(s.charAt(i))) {
			c++;
		}
		else {
			sp++;
		}
	}
	System.out.print("Letters: "+c+"\nDigits: "+d+"\nOther Symbols: "+sp);
	*/
	/*6. Calculate purchase amount to be paid after discount using if-else. Consider 10 % 
	discount for the Sale amount above 1000 and 5% discount for the Sale amount less 
	than 1000. 
	 */
	/*
	System.out.print("Enter the price\n");
	int p=sc.nextInt();
	System.out.print("Enter quantity\n");
	int q=sc.nextInt();
	int pa=p*q;
	if(pa>=1000) {
		double d=pa*0.10;
		System.out.print("Paid amount: "+(pa-d));
	}
	else if(p<1000) {
		double d=pa*0.05;
		System.out.print("Paid amount: "+(pa-d));
	}
	*/
	/*
	1. Keeping in mind there are 86400 seconds per day, write a program that calculates how 
	many seconds there are in a week if a week is 7 days. 
	*/
	//System.out.print(86400*7);
	
	/*
	 Sam teaches his student to find the factorial of a number. He wanted to test the 
	understanding of the student.  For that, he provides a number.  He wants the students 
	to tell him that number is a factorial of which number. Help the student by writing a 
	program to do this.   
	 */
	
	/*
	System.out.print("Enter a number\n");
	int n=sc.nextInt();
	int fact=1;
	int i=1;
	if(n<=0){
		System.out.print("Invalid number");
	}
	else{
	while(fact<n){
		i++;
		fact=fact*i;
	}
	if(fact==n) {
	System.out.print(i+" Factorial is "+n);	
	}
	else {
		System.out.print("Sorry. The given number is not a perfect factorial");
		}
	}
	 */
	
	/*1. Numbers and Alphabets has equivalent ASCII values i.e Numbers (0 to 9) equivalent 
	ASCII value is 48 to 57, uppercase alphabet (A to Z) equivalent ASCII value is 65 to 90 
	and lowercase alphabet (a to z) equivalent ASCII value is 97 to 120. Write a program to 
	sort numbers 0 to 9, alphabets in upper and lowercase using equivalent ASCII values. 
	 */
	/*
	String s=sc.nextLine();
	char[] arr=s.toCharArray();
	Arrays.sort(arr);
	for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]);
	}
	*/
	
	/*
	 *med: 2 Mark is purchasing certain glossary items in a supermarket. While purchasing certain items, 
a discount of 15% is offered to him if the quantity purchased is more than 500. Help, Mark 
to calculate the total expenses.  
	 */
	/*
	System.out.print("Enter the amount:\n");
	int amt=sc.nextInt();
	System.out.print("Enter total quantity:\n");
	int qn=sc.nextInt();
	int tot=amt*qn;
	if(qn>500){
		double dis=tot*0.15;
		System.out.print("total expenses:"+(tot-dis));
	}
	else {
		System.out.print("total expenses:"+tot);
	}
	*/
	/*
	 * 
	 * Write a program to calculate bill of a job work done as follows by using if-else 
statement. 
a. Rate of typing 3 Rs. per page 
b. Printing of 1s copy Rs. per page and later every copy 3 Rs. per page. 
	 */
	/*
	System.out.print("Enter the number of pages:\n");
	int n=sc.nextInt();
	System.out.print("Enter the type of work:\n1.Typing\n2.Printing");
	String s=sc.next();
	if(s.equals("Typing")) {
		System.out.print("Total cost for typing: "+(n*3));
	}
	else if(s.equals("Printing")) {
		int rem=n-1;
		System.out.print("Total cost for typing: "+((rem*3)+1));
	}
	*/
	//}
//}
//EASY
//1. Write a program to get employee details, wages and number of days worked from user 
//and find total salary. 
/*
public class Ass_conditional{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of days worked");
		int n=sc.nextInt();
		System.out.println("Enter the wage");
		double w=sc.nextInt();
		System.out.println(n*w);
	}
}
*/
//2. Write a program to check whether the given number is divisor of 7 using simple if 
//statement. 
/*
public class Ass_conditional{
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter the number");
	int n=sc.nextInt();
	if(n%7==0) {
		System.out.println("Divisor of 7");
	}
	else {
		System.out.println("Not a Divisor of 7");
	}
	}
}
*/
//3. Use switch case structure to print the appropriate message to recognize the entered 
//character is vowel, consonant or symbol. 
/*
public class Ass_conditional{
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter a character");
	char c=sc.next().charAt(0);
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
		System.out.println("Entered character is vowel");
	}
	else if(c>=32 && c<=47 || c>=58 && c<=64 || c>=91 && c<=96 || c>=123 && c<=126) {
		System.out.println("Entered character is Special symbol");
	}
	else {
		System.out.println("Entered character is Consonant");
	}
	}
}
*/
//6. Write a program that reads an integer continuously and displays "Hello" as many times 
//as the value of the integer.
/*
public class Ass_conditional{
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter a number");
	int n=sc.nextInt();
	int c=0;
	while(n>=0){
		System.out.println("Hello");
		c++;
		n=sc.nextInt();
	}
	System.out.println("Total number of displayed Hello is:"+c);
}
}
*/
//8. Write a program to check whether the given Character is an Alphabet/ Digit /Special 
//Symbol using if-else-if statement. 
/*
public class Ass_conditional{
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter a character");
	char c=sc.next().charAt(0);
	if(c>='A' && c<='Z' || c>='a' && c<='z') {
		System.out.println("Alphabet");
	}
	else if(c>='1' && c<='9') {
		System.out.println("Digit");
	}
	else {
		System.out.println("Special symbol");
	}
	}
}
*/
//9. Write a program to print sum of digits of a given number. 
/*
public class Ass_conditional{
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter a number");
	int n=sc.nextInt();
	int sum=0;
	while(n!=0) {
		int rem=n%10;
		sum+=rem;
		n/=10;
	}
	System.out.println("Sum of the digits is:"+sum);
	}
}
*/
//10. Write a program to print the following number pattern 
/*
public class Ass_conditional{
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter a number");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	}
}
*/
/*
public class Ass_conditional{
	public static void main(String args[]) {
		char c='a',ch='z';
		for(int i=0;i<26;i++) {
			System.out.print(c++);
			System.out.print(ch--+" ");
		}
	}
}
*/
/*
public class Ass_conditional{
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int i=1,sum=0;
	do {
		sum+=i;
		i++;
	}while(n>=i);
	System.out.print(sum);
	}
}
*/
/*
public class Ass_conditional{

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
        System.out.println("Enter the month number");
        int month=sc.nextInt();
        System.out.println("Enter the starting day of the month");
        int start=sc.nextInt();
        int noofdays;
        if (month == 2) {
            System.out.print("Enter the number of days in February(28 or 29:)");
           noofdays= sc.nextInt();
        }
        else {
            int[] daysInMonths = { 0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
            noofdays = daysInMonths[month];
        }
        String[] Days = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };
        System.out.println(" Calendar");
        for (String a : Days) {
            System.out.print(a + "\t");
        }
        System.out.println();
        int c = 1;
        for (int i = 1; i < start; i++) {
            System.out.print("\t");
        }
        for (int i = start; c <= noofdays; i++) {
            System.out.print(c + "\t");
            if (i % 7 == 0) {
                System.out.println();
            }
            c++;
        }
        System.out.println("\n");
    }
}

*/
/*
public class Ass_conditional{
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);		
	System.out.println("Enter total hours of browsing");
	int hrs=sc.nextInt();
	System.out.println("Enter total mins of browsing");
	int mins=sc.nextInt();
	int bill=0;
if(hrs>7) {
	System.out.println("Invalid input");
}
else if(hrs>=5) {
	bill+=200;
	bill+=mins;
	System.out.println("Bill is "+bill);
}
else {
	bill+=hrs*50;
	bill+=mins;
	System.out.println("Bill is "+bill);
}
}
}*/
public class Ass_conditional{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	int c=0;
	double tot=0;
while(true) {
	System.out.println("Enter execise grade:");
	double exe=sc.nextDouble();
	System.out.println("Enter exam grades");
	double exam = sc.nextDouble();
if (exe== -1||exam==-1) {
	break;
}
if(exe< 0 || exe>10||exam<0||exam>10){
	System.out.println("enter the  values between 0 and 10");
	continue;
}
double f;
if (exe>=5 && exam>= 5) {
	f=(0.3 *exe)+(0.7 *exam);
}
else {
	f=Math.min(exe,exam);
}
System.out.println("Final Grade: "+f);
tot+=f;
c++;
}
if (c>0){
	System.out.println("Average Grade of all students:" + (tot/c));
}
else{
	System.out.println("Invalid");
}
}

}

