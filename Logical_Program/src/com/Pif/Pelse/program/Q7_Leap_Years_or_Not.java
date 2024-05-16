package com.Pif.Pelse.program;

import java.util.Scanner;

public class Q7_Leap_Years_or_Not {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the any Year's");
		
		int years = scanner.nextInt();
		scanner.close();
		if (years%400==0 || years%4==0 && years%100!=0) {
			System.out.println("this is leap year");
		} else {
			System.out.println("This is Not Leap year");
		}
	}

}
