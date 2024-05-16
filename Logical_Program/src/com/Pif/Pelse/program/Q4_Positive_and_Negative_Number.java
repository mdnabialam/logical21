package com.Pif.Pelse.program;

import java.util.Scanner;

public class Q4_Positive_and_Negative_Number {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Any Number");
		int number = scanner.nextInt();
		scanner.close();
		
		if (number ==0) {
			System.out.println("This  Number is  Zero ");
		}  else if(number >0) {
			System.out.println("This Number is Positive Number");
		}
		else {
			System.out.println("This Number is Negativ Number");
		}
		
	}
}
