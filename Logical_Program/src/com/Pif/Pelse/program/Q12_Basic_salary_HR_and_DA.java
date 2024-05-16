package com.Pif.Pelse.program;

import java.util.Scanner;

public class Q12_Basic_salary_HR_and_DA {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Basic Salary");
		double bs= scanner.nextLong();
		
		scanner.close();
		
		if (bs<=10000) {
			double gs = bs+0.2*bs+0.8*bs;
			System.out.println("Your Totel salary : "+gs);
		}/*
		else if(bs<=20000) {
			double gs = bs+0.2*bs+0.8*bs;
			System.out.println("Your Totel salary : "+gs);
		}
		*/
		
		else if(bs<30000) {
			double gs = bs+0.2*bs+0.8*bs;
			System.out.println("Your Totel salary : "+gs);
		}
		
	}

}
