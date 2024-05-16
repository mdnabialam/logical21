package com.Pif.Pelse.program;

import java.util.Scanner;

public class Q10_Upper_and_lower {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the any Char");
		char ch = scanner.next().charAt(0);
		scanner.close();
		if (ch >= 'a' && ch<='z') {
			System.out.println("this is lowelcase . . . :  "+ch);
		}else {
			System.out.println("This is UpperCase . . .  :  "+ch);
		}
		
	}

}
