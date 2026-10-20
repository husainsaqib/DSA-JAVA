package com.lambda;

//nested class  a) static b) inner (non static)


class Employee
{ 
	String name;
	
	static int code;
	//Non static class can access all properties of outer
	//class
	
	class Manager {}
	
	
	//static class can access only
	//static properties of outerclass
	static class Account{}
}




public class InnerClass {
     
	public static void main(String[] args) 
	{
		 class abc
		 {
			 void show()
			 {
				 System.out.println("dfdfdfd");
			 }
		 }
		 
		 interface pqr
		 {
			 void cal(int y,String r);
		 }//local class
		 class testing implements pqr
		 {
			public void cal(int y,String r)
			{
				System.out.println(" interface implementation");
			}
		 }
		 //lambda expression
		 pqr p =(y, r)->System.out.println("testing");
		 p.cal(22,"test");
		 
		 
		 int x=10;
		 int y=22;
		 if( x>y)  sysout(x)
		 else
			  sysout(y);
		 
		 int c= x >y ? x : y;
	
	/*
	 * unary operator   
	 *     a) prefix increment operator  ++a  --a
	 *     b) postfix increament oprator  a++  a--
	 * binary 
	 *    a+b a*b
	 * ternary 	
	 *    x> y  ? x :y	  
	 */
			  
			  
		 
	}

}
