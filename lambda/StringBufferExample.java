package com.lambda;

public class StringBufferExample {

	public static void main(String[] args) {
	 
//String       - immutable java 1.0  no capacity
//StringBuffer - mutable   java 1.0 sync  slow capacity 16
//StringBuilder- mutable  java 5 non sync fast cap -16
	
	//String h="welcome";//correct 
	//StringBuffer r="welcome";//CTE
	//StringBuilder k="welcome";//CTE
	
		//StringBuffer e= new StringBuffer("welcome");
		StringBuilder e= new StringBuilder("welcome");
		System.out.println("capacity"+ e.capacity());
		System.out.println("capacity"+ e.append("to java"));
		System.out.println("capacity"+ e.insert(0, "Testing"));
		System.out.println("capacity"+ e.delete(0,5));
		System.out.println("capacity"+ e.reverse());
		System.out.println("capacity"+ e.replace(0,5,"abcde"));
		
		
		
	}

}
  