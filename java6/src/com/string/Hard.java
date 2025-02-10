package com.string;
import java.util.*;

/*
//Program 1
public class Hard {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your choice\n1.Sender\n2.Receiver");
	int n=sc.nextInt();
	System.out.println("Enter the key");
	int key=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the original text");
	String ot=sc.nextLine();
	char c[]=ot.toCharArray();
	for(int i=0;i<c.length;i++){
		if(n==1){
			if(c[i]!='z') {
			System.out.print((char)(c[i]+key)+" ");
			}
			else {
				System.out.println((char)('a'+key-1));
			}
		}
		else if(n==2){
			if(c[i]!='a') {
			System.out.print((char)(c[i]-key)+" ");
			}
			else {
					System.out.println((char)('z'-key+1));
				}
		}
		else{
		System.out.println("Please enter valid choice");
		}
	}
	}
}
*/
//Program 2
/*
public class Hard{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String pass=sc.nextLine();
		int d=0,l=0,u=0,lo=0,s=0;
		int len=pass.length();
		if(len>=6) {
			l=1;
		}
		for(int i=0;i<pass.length();i++) {
			char a=pass.charAt(i);
			if(a>='0' && a<='9') {
				d=1;
			}
			if(a>='a' && a<='z') {
				lo=1;
			}
			if(a>='A' && a<='Z') {
				u=1;
			}
			if(a>=32 && a<=47 || a>=58 && a<=64 || a>=91 && a<=96 || a>=123 && a<=126) {
				s=1;
			}
		}
		//32–47 / 58–64 / 91–96 / 123–126
		if(d==1 && l==1 && lo==1 && u==1 && s==1) {
			System.out.println("Strong..");
		}
		else if(l==1 && d==1 && lo==1) {
			System.out.println("Moderate..");
		}
		else {
		System.out.println("Week..");
		}
		}
}
*/