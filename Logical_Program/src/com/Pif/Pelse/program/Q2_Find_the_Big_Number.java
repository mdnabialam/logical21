package com.Pif.Pelse.program;

import java.util.Scanner;

public class Q2_Find_the_Big_Number {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the First Number");
		int first = scanner.nextInt();
		
		System.out.println("Enter the Second Number ");
		int second = scanner.nextInt();
		
		System.out.println("Enter the Third Number ");
		int third = scanner.nextInt();
		
		scanner.close();
		
		if (first>second && first>third) {
			System.out.println("This is Big Number : "+first);
		} 
		else if(second>first && second>third){
			System.out.println("This is Big Number : "+second);
		}
		
		else {
			System.out.println("This is Big Number : "+third);
		}
		
	}

}
