package com.lambda;

import java.util.LinkedList;

public class Listlambda {

	public static void main(String[] args) {

  LinkedList <String> e = new LinkedList();
  e.add("amit");
  e.add("mayank");
  e.add("mayank");
  e.add("meera");
  
  e.forEach((r)->System.out.println(r));
  
  
  for(String r:e)
	  System.out.println(r);
  

	}

}
