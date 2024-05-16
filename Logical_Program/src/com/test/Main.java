package com.test;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
        list.add("NABI");
        list.add("ALAM");
        list.add("NABI");
        list.add("MD NABI ALAM");
        list.add("TAHIR");
        list.add("AKRAM");
        list.add("NADEEM");
        list.add("NEHAL");
        
        System.out.println(list);
        
        for(int i =0; i < list.size(); i++) {
        	  if (list.lastIndexOf(list.get(i)) != i)  {
        	     System.out.println(list.get(i)+" is duplicated");
        	  }
        	}
	}

}
