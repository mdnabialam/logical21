package com.Pif.Pelse.program;

import java.util.Scanner;

public class Q1_Statement_program {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the First Number . . .");
		int First= scanner.nextInt();
		
		System.out.println("Enter the second  Number . . .");
		int second  = scanner.nextInt();
		
		scanner.close();
		
		if (First > second ) {
			System.out.println("this is big Number : "+First);
		}
		else {
			System.out.println("This is big Number : "+second  );
		}
		
	}

}
