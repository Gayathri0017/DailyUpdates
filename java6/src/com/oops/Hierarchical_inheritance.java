package com.oops;
/*
class Cricket{
	String playerName;
	String teamName;
	void setDetails(String pName,String tName) {
		playerName=pName;
		teamName=tName;
	}
	void displayDetails() {
		System.out.println("Player Name "+playerName);
		System.out.println("Team Name "+teamName);
	}
}
class Batsman extends Cricket{
	int hScore;
	double batAvg;
	void setBatDetails(int s,double avg) {
		hScore=s;
		batAvg=avg;
	}
	void displayBatDetails() {
		System.out.println("High Score "+hScore);
		System.out.println("Batting Avg "+batAvg);
	}
}
class Bowler extends Cricket{
	int wicket;
	double bowlAvg;
	void setBowlDetails(int w,double avg) {
		wicket=w;
		bowlAvg=avg;
	}
	void displayBowlDetails() {
		System.out.println("No of wickets "+wicket);
		System.out.println("Bowling Avg "+bowlAvg);
	}
}
public class Hierarchical_inheritance {
//one base class and multiple derived class
	public static void main(String args[]) {
		Batsman bat=new Batsman();
		Bowler bowl=new Bowler();
		bat.setDetails("Dhoni","CSK");
		bat.setBatDetails(300,7.9);
		bowl.setDetails("Sharma","CSK");
		bowl.setBowlDetails(9, 8.9);
		bat.displayDetails();
		bat.displayBatDetails();
		bowl.displayDetails();
		bowl.displayBowlDetails();
	}
}
*/

/*
public class Hierarchical_inheritance {
	public static void main(String args[]) {
		Adminn a=new Adminn();
		a.getUserTYpe();
		a.personDetails("abc","123,Salem","1234567890","2k21cse030","male");
		a.displayDetails();
		Officer o=new Officer();
		o.getUserType();
		o.personDetails("abc","123,Salem","1234567890","2k21cse030","male");
		o.displayDetails();
		Customer c=new Customer();
		c.getUserType();
		c.personDetails("abc","123,Salem","1234567890","2k21cse030","male");
		c.displayDetails();
	}
}
class Personn_1{
	private String name;
	private String add;
	private String mobile;
	private String email;
	private String gender;
	
	protected void personDetails(String pname,String padd,String pmobile,String pemail,String pgender) {
		name=pname;
		add=padd;
		mobile=pmobile;
		email=pemail;
		gender=pgender;
	}
	protected void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Address:"+add);
		System.out.println("Mobile number:"+mobile);
		System.out.println("Email:"+email);
		System.out.println("Gender:"+gender);
	}
}
//class User extends Personn{
//	private int id;
//	private String password;
//	private boolean status;
//	public void setUserDetails(int uId,String uPassword) {
//		id=uId;
//		password=uPassword;
//	}
//	public void userDetails() {
//		System.out.println("User Id: "+id);
//		System.out.println("Password:"+password);
//	}
//}
class Adminnn extends Personn{
	String userType;
	Adminnn(){
		userType="Admin";
	}
	public void getUserType() {
		System.out.println("UserType:"+userType);
	}
}
class Customer extends Personn_1{
	String userType;
	Customer(){
		userType="Customer";
	}
	public void getUserType() {
		System.out.println("UserType:"+userType);
	}
}
class Officer extends Personn_1{
	String userType;
	Officer(){
		userType="Officer";
	}
	public void getUserType() {
		System.out.println("UserType:"+userType);
	}
}
*/
	
public class Hierarchical_inheritance{
	public static void main(String args[]) {
		Student s=new Student("Dharu","100,Salem","PG",2025,200000);
		Staff st=new Staff("Jeevika","200,Salem","xyz schhol",25000);
		System.out.print(s);
		System.out.print(st);
		}
}
class Persons{
	private String name;
	private String address;
	Persons(String name,String address){
		this.name=name;
		this.address=address;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		return this.address;
		
	}
	@Override
	public String toString() {
		return "\nName:"+name+"\nAddress:"+address;
	}
}
class Student extends Persons{
	private String program;
	private int year;
	private double fee;
	Student(String name,String address,String program,int year,double fee){
		super(name,address);
		this.program=program;
		this.year=year;
		this.fee=fee;
	}
	public void setProgram(String program) {
		this.program=program;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public void setFee(double fee) {
		this.fee=fee;
	}
	public String getProgram() {
		return this.program;
	}
	public int getYear() {
		return this.year;
	}
	public double getFee() {
		return this.fee;
	}
	@Override
	public String toString() {
		return super.toString()+"\nProgram:"+program+"\nYear:"+year+"\nFees:"+fee+"\n------------------";
	}
}
class Staff extends Persons{
	private String school;
	private double pay;
	Staff(String name,String address,String school,double pay){
		super(name,address);
		this.school=school;
		this.pay=pay;
	}
	public void setSchool(String school) {
		this.school=school;
	}
	public void setPay(double pay) {
		this.pay=pay;
	}
	public String getSchool() {
		return this.school;
	}
	public double getPay() {
		return this.pay;
	}
	@Override
	public String toString() {
		return super.toString()+"\nSchool:"+school+"\nPay:"+pay;
	}
}