package com.Pif.Pelse.program;

import java.util.Scanner;

public class Q11_WeekName_of_Days {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the day of Number");
		int number=scanner.nextInt();
		
		if (number ==1) {
			System.out.println("this is Monday");
		}
		else if(number ==2) {
			System.out.println("This is Thusday");
		}
		else if(number ==3) {
			System.out.println("This is Wednesday");
		}
		else if(number ==4) {
			System.out.println("This is Thursday");
		}
		else if(number ==5) {
			System.out.println("This is Friday");
		}
		else if(number == 6) {
			System.out.println("This is Saturday");
		}
		else if(number ==7) {
			System.out.println("This is Sundays");
		}
		else {
			System.out.println("this is Invaild ");
		}
		scanner.close();
	}

}
