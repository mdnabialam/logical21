package com.Pif.Pelse.program;

import java.util.Scanner;

public class Q9_Alphabet_Or_Digit_Or_SpecialCharacter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the any Character ");
		 	char character = scanner.next().charAt(0);
		 	scanner.close();
		 	if ((character >='a' && character <='z')||
		 			(character >='A' && character<='Z')) {
		 		System.out.println("This is character :  "+character);
			} else if(character >='0' && character<='9') {
				System.out.println("This is Number : "+character);
			}
			else {
				System.out.println("This is Special Character : "+character);
			}
		 	
	}

}
