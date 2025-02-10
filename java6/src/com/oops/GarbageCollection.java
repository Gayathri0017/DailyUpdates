package com.oops;

public class GarbageCollection {
	public static void main(String args[]) {
		GarbageCollector obj=new GarbageCollector();
		obj.finalize();
		System.gc(); 
	}	
}
class GarbageCollector{
	@Override
	public void finalize() {
		System.out.println("Object is destroyed");
	}
}
