package com.lambda;
class Emp1
{
	int x=10;
	protected void finalize()
	{
		System.out.println("garbage collection done");
	}
}
public class GarbageCollection {

	public static void main(String[] args) {
		Emp1 e= new Emp1();
		Emp1 e1= e;
		e=null;
		e1=null;
		System.gc();//expliciltly call GC
		
	
	} 
	}
	