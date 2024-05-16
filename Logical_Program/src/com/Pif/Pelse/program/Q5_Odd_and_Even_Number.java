package com.Pif.Pelse.program;

import java.util.Scanner;

public class Q5_Odd_and_Even_Number {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Any Number ");
		int number= scanner.nextInt();
		scanner.close();
		if (number%2==0) {
			System.out.println("This is Even Number");
		} else {
			System.out.println("This is Odd Number");
		}
	}

}
