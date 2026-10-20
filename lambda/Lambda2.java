package com.lambda;

//marker interface  empty interface --serializable

@FunctionalInterface  // must have exactly one abstract method
//lambda can work with functional interface only
interface Calculate
{
	void sum(int a,int b);
}
interface Banner
{
	String  print();
}
public class Lambda2 {

	public static void main(String[] args) throws Exception {
		
	//Calculate e= (int a,int b)->System.out.println("sum="+(a+b));
	Calculate e= ( a, b)->System.out.println("sum="+(a+b));
	e.sum(10,20);
	e.sum(20,30);
	
	Banner m= ()-> {
		            return "testing return value";
	               };
	 
//multithraeding 
	class abc implements Runnable
	{
		public void run()
		{
			System.out.println("welcome");
		}
		
		}
	Thread s= new Thread( new abc());
	s.start();//start called run method 
	
	
	Thread s1=  new Thread(()->System.out.println("testing"));
    s1.start();
	
	}
	 
	
	
	interface Drawing
	{
	
		int show(int u,String y);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	}

	
} 		


interface 
        
 

 
