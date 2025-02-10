package com.assignment;
import java.util.*;
//public class ass_functions {
	//med: 4. Write a function to find whether the blood donor is eligible or not for donating blood.4. Write a function to find whether the blood donor is eligible or not for donating blood.
/*
 
	public static void isEligible(int age,float weight) {
		if(age>18 && age<55) {
			if(weight>45) {
			System.out.print("You are eligible to donat blood");
			}
			else {
				System.out.print("you are not eligible bcoz you are under weight");
			}
		}
		else {
			System.out.print("You are not eligible");
		}
	}
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your age:\n");
	int age=sc.nextInt();
	System.out.print("Enter your weight:\n");
	float wei=sc.nextFloat();
	isEligible(age,wei);
}
*/
	/*hard: XYZ college wants to recognize the department which has succeeded in getting the 
maximum number of placements for this academic year. The departments that have 
participated in the recruitment drive are CS, EC, ME. Help the college to find the 
department getting maximum placements. Check for all the possible output given in 
the sample snapshot.
*/ 
	/*
	public static void checkMax(int cs,int ec,int me) {
		if(cs<0 || ec<0 || me<0) {
			System.out.print("Invalid input\n");
		}
		else if(cs==ec && ec==me) {
			System.out.print("None of the department has got the highest placement");
		}
		else if(cs>ec && cs>me) {
			System.out.print("CS has highest placemSent");
		}
		else if(ec>me && ec>cs) {
			System.out.print("EC has highest placemSent");
		}
		else if(me>cs && me>ec){
			System.out.print("ME has highest placemSent");
		}
		else if(cs==ec && cs>me) {
			System.out.print("CS ,EC has highest placement");
		}
		else if(ec==me && ec>cs) {
			System.out.print("EC ,ME has highest placement");
		}
		else if(cs==me && cs>ec){
			System.out.print("CS ,ME has highest placement");
		}
	}
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of students places in CS:\n");
	int cs=sc.nextInt();
	System.out.print("Enter the number of students places in EC:\n");
	int ec=sc.nextInt();
	System.out.print("Enter the number of students places in ME:\n");
	int me=sc.nextInt();
	checkMax(cs,ec,me);
	
}
*/	
	/*
XYZ Technologies is in the process of increment the salary of the employees. This 
increment is done based on their salary and their performance appraisal rating. 
a. If the appraisal rating is between 1 and 4, the increment is 10% of the salary. 
b.  If the appraisal rating is between 4.1 and 7, the increment is 25% of the salary. 
c. If the appraisal rating is between 7.1 and 10, the increment is 30% of the salary. 
	 */
	/*
	public static void incrementSal(int sal,float rating) {
		if(sal<=0 || rating <=0 || rating>10) {
			System.out.print("Invalid inputs:\n");
		}
		else if(rating>=1 && rating<=4) {
			double incre=sal*0.10;
			System.out.print("Incremen salary: "+(sal+incre));
		}
		else if(rating>=4.1 && rating<=7) {
			double incre=sal*0.25;
			System.out.print("Incremen salary: "+(sal+incre));
		}
		else if(rating>=7.1 && rating<=10) {
			double incre=sal*0.30;
			System.out.print("Incremen salary: "+(sal+incre));
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Employee salary:\n");
		int sal=sc.nextInt();
		System.out.print("Enter the appraisal rating:\n");
		float rating=sc.nextFloat();
		incrementSal(sal,rating);
	}
	*/
	/*
	  Write a C# program to find the sums of the running odd numbers and even numbers 
	from a given lowerbound to an upperbound. Also compute their absolute 
	difference.
	 */
	/*
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter lowerBound:\n");
		int lb=sc.nextInt();
		System.out.print("Enter upperBound:\n");
		int ub=sc.nextInt();
		int oSum=oddSum(lb,ub);
		int eSum=evenSum(lb,ub);
		System.out.print(Math.abs(oSum-eSum));
	}
	public static int oddSum(int lb,int ub) {
		int sum=0;
		for(int i=lb;i<=ub;i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		return sum;
	}
	public static int evenSum(int lb,int ub) {
		int sum=0;
		for(int i=lb;i<=ub;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		return sum;
	}
	*/
	
	//med: prime number
	/*
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter lowerBound:\n");
		int lb=sc.nextInt();
		System.out.print("Enter upperBound:\n");
		int ub=sc.nextInt();
		isPrime(lb,ub);
	}
	public static void isPrime(int l,int u) {
		int c;
		for(int i=l;i<=u;i++) {
			c=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					c++;
				}
			}
			if(c<=2) {
				System.out.print(i+" ");
			}
		}
	}
	}
	*/
	
	//EASY
	
//1. Write a function to Calculate the Sum of Odd & Even Numbers
/*
	public class ass_functions {
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter lowerBound:\n");
			int lb=sc.nextInt();
			System.out.print("Enter upperBound:\n");
			int ub=sc.nextInt();
			int oSum=oddSum(lb,ub);
			int eSum=evenSum(lb,ub);
			System.out.print("Odd Sum:"+oSum+"\nEven Sum:"+eSum);
		}
		public static int oddSum(int lb,int ub) {
			int sum=0;
			for(int i=lb;i<=ub;i++) {
				if(i%2!=0) {
					sum+=i;
				}
			}
			return sum;
		}
		public static int evenSum(int lb,int ub) {
			int sum=0;
			for(int i=lb;i<=ub;i++) {
				if(i%2==0) {
					sum+=i;
				}
			}
			return sum;
		}	
}
*/

//2.Write a function to find the prime numbers between 1 to 100.
/*
public class ass_functions{
public static void main(String args[]) {
	isPrime(1,100);
}
public static void isPrime(int l,int u) {
	int c;
	for(int i=l;i<=u;i++) {
		c=0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
				c++;
			}
		}
		if(c<=2) {
			System.out.print(i+" ");
		}
	}
}
}
*/
//3. Get the salary per month and hike from user and the write a java program to 
//calculate new salary with hike.
/*
public class ass_functions{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter salary per month:\n");
		double sal=sc.nextDouble();
		System.out.print("Enter hike:\n");
		double hike=sc.nextDouble();
		double newSal=calculateSal(sal,hike);
		System.out.print(newSal);
		
	}

public static double calculateSal(double sal,double hike){
	return sal+(sal*(hike/100));
}
}
*/

//4. A person is elligible to vote if his/her age is greater than or equal to 18. Define a 
//method to find out if he/she is elligible to vote
/*
public class ass_functions{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age:\n");
		int age=sc.nextInt();
		isEligible(age);
	}

public static void isEligible(int age){
	if(age>=18) {
		System.out.print("You are eligible:\n");
	}
	else {
		System.out.print("You are not eligible:\n");
	}
}
}
*/
