package com.lambda;


//encapsulation |abstraction |inheritance polymorphism
abstract class OldInventory 
{
	int a;
	static int y;
	OldInventory(){}
	abstract void show();
	void print() {}
	
}

interface  abc
{
	int code=1111;//public static final 
	void show1();//public abstract
	default void p1() {//.... 
		              }
	static void p2() {} 
	}
 
class NewInventory extends OldInventory implements abc
{	//public private protected default 
	 String iname;
	int price;
	int qty;
	
	NewInventory(){}
	NewInventory(String iname, int price,int qty)
	{
     this.iname= iname;
     this.price=price;
     this.qty= qty;
	}
	
	public void show()
	{
		System.out.println(iname +""+ price +"  "+ qty);
	}
	
	
}











public class Revise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
