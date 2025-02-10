package com.oops;
import java.util.*;
class Bc{
	int[] memId;
	String[] memName;
	String[] memLocation;
	String[] memType;
	double[] bill;
	int c;
	Bc(int n){
		memId=new int[n];
		memName=new String[n];
		memLocation=new String[n];
		memType=new String[n];
		bill=new double[n];
		c=0;
	}
	public void Prime(int id,String name,String location,int week){
		if(c<memName.length) {
			memId[c]=id;
			memName[c]=name;
			memLocation[c]=location;
			memType[c]="Prime";
			bill[c]=week*400;
			c++;
		}
	}
	public void Normal(int id,String name,String location,int hrs) {
		if(c<memName.length) {
			memId[c]=id;
			memName[c]=name;
			memLocation[c]=location;
			memType[c]="Normal";
			bill[c]=hrs*50;
			c++;
		}
	}
	public void displayProfile(){
		int f=0;
		for(int i=0;i<memId.length;i++){
			if(bill[i]>2000 && memType[i].equals("Normal")) {
				System.out.println("Id:"+memId[i]);
				System.out.println("Name:"+memName[i]);
				System.out.println("Location:"+memLocation[i]);
				System.out.println("Total bill:"+bill[i]);
				f=1;
			}
		}
		if(f==0) {
				System.out.println("No members found!");
			}
	}
}
public class BrowsingCentre{
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of people");
	int n=sc.nextInt();
	Bc b=new Bc(n);
	for(int i=0;i<n;i++) {
	System.out.println("Enter the memId");
	int id=sc.nextInt();
	System.out.println("Enter the memName");
	String name=sc.next();
	System.out.println("Enter the Location");
	String loc=sc.next();
	System.out.println("Enter your type\n1)Prime member\n2)Normal member");
	int type=sc.nextInt();
	if(type==1){
		System.out.println("Enter the number of weeks");
		int pWeeks=sc.nextInt();
		b.Prime(id,name,loc,pWeeks);
	}
	else if(type==2){
		System.out.println("Enter the number of hours");
		int hrs=sc.nextInt();
		b.Normal(id,name,loc,hrs);
		}
	else if(type==3) {
		break;
	}
}
	b.displayProfile();
	}
}
