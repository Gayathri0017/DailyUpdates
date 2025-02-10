package com.string;
import java.util.*;
//Program 1
/*
public class Medium{
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String arr[]=s.split("\s");
	for(int i=0;i<arr.length+1;i++) {
		if(i<2) {
			System.out.print(arr[i]+" ");
		}
		else if(i==2) {
			System.out.println("\n....Please wait");
		}
		else if(i>2) {
			System.out.print(arr[i-1]+" ");
		}
	}
}
}
*/

//Program 2
/*
public class Medium{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String fn=sc.nextLine();
		String ln=sc.nextLine();
		int l=fn.length();
		int l1=ln.length();
		String pass=fn.substring(0,3);
		String pass1=ln.substring(l1-3,l1);
		System.out.print(pass+pass1+(l+l1));
	}
}
*/
//Program 3
/*
public class Medium{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.nextLine();
	String arr[]=new String[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextLine();
	}
	Arrays.sort(arr);
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
	}
	}
}
*/

//Program 4
/*
public class Medium{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int c=0;
		for(int i=0;i<s.length()-1;i++) {
			if((s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') && (s.charAt(i+1)=='a'|| s.charAt(i+1)=='e'|| s.charAt(i+1)=='i'||s.charAt(i+1)=='o'||s.charAt(i+1)=='u')){
				c++;
			}
		}
		System.out.println(c);
		
	}
}
*/