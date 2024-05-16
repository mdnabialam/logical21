package com.Pif.Pelse.program;

import java.util.Scanner;

public class Q3_Months_of_Days_years {
	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("Enter the Month . . . ");
		int m =scanner.nextInt();
		
		System.out.println("Enter the Year  . . .");
		int y = scanner.nextInt();
		
		scanner.close();
		
		if (m == 1) {
			System.out.println("January in 31 days");
		}else if(m == 2) {
			if(y%400==0 || y%400 ==0 && y%100 !=0) {
				System.out.println("29 Days in Feb");
			}
			else {
				System.out.println("28 Days in Feb");
			}
		}
		else if(m == 3) {
			System.out.println("31 days in March");
		}
		else if(m == 4) {
			System.out.println("30 days in April");
		}
		else if(m ==5) {
			System.out.println("31 Days in May");
		}
		else if(m==6) {
			System.out.println("30 days in June");
		}
		else if (m ==7) {
			System.out.println("31 days in July");
		}
		else if (m ==8) {
			System.out.println("31 days in August");
		}
		else if(m ==9) {
			System.out.println("30 days in september");
		}
		else if (m==10) {
			System.out.println("31 days in October");
		}
		else if(m ==11) {
			System.out.println("30 days in November");
		}
		else if (m ==12) {
			System.out.println("31 days in December");
		}
		else {
			System.out.println("this Mounth ");
		}
		
	}

}
