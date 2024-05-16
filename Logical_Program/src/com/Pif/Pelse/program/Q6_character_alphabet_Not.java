package com.Pif.Pelse.program;

import java.util.Scanner;

public class Q6_character_alphabet_Not {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the any  character ");
		char character= scanner.next().charAt(0);
		scanner.close();
		if ((character>='a' && character<='z')||
				(character>='A' && character <='Z')) {
			System.out.println("this is character : "+character);
		} else {
			System.out.println("this is not character : ");
		}
	}

}
