package com.chatgpt;

//program to remove duplicates in an array
public class A {
	public static void main(String[] args) {
		
		int arry[]= {1,2,3,1,2,2,5};
		
		for(int i =0; i<arry.length; i++) {
			
			for(int j=i+1;j<arry.length; j++) {
				
				if(arry[i] == arry[j]) {
					arry[j]= ' ';
				}
			}
		}
		
		for(int i =0; i<arry.length;i++) {
			if (arry[i]!= ' ') {
				System.out.println(arry[i]+" ");
			}
		}
		
	}
}
