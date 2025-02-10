package com.oops;
class InvoiceItem{
	private String id;
	private String desc;
	private int qty;
	private double price;
	InvoiceItem(String id,String desc,int qty,double price){
		this.id=id;
		this.desc=desc;
		this.qty=qty;
		this.price=price;
	}
	@Override
	public String toString() {
		return "Total:"+ qty*price;
	}
}
public class Opps_ass2 {
	public static void main(String args[]) {
		InvoiceItem obj=new InvoiceItem("001","product",8,10);
		System.out.println(obj);
	}
}
                                                 