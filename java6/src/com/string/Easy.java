package com.string;
import java.util.*;
//program 1
/*
public class Easy{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		System.out.println("1)Encrypt\n2)Decrypt");
		int n=sc.nextInt();
		for(int i=0;i<ch.length;i++) {
			if(n==1) {
				System.out.print((char)(ch[i]+2));
			}
			else {
				System.out.print((char)(ch[i]-2));
			}
		}
	}
}
*/
//program 2
/*
public class Easy {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s.toUpperCase();
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A' && ch[i]<='Z') {
				System.out.print(ch[i]);
			}
		}
		
	}
}
*/
//program 3
/*
public class Easy{
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
//program 4
/*
public class Easy{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int c=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					c++;
					ch[j]='#';
				}
			}
			if(ch[i]!='#') {
			System.out.println(ch[i]+" "+c);
			}
		}
	}
}
*/

