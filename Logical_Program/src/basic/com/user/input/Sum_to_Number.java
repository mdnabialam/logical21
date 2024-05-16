package basic.com.user.input;

import java.util.Scanner;

public class Sum_to_Number {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Any 1st  Number");
		int a = scanner.nextInt();
		
		System.out.println("Enter the  Any 2nd Number");
		int b = scanner.nextInt();
		
		scanner.close();
		
		int c= a+b;
		int d = a-b;
		int e = a*b;
		System.out.println("Total sum of A & B : "+c);
		System.out.println("Sub "+d);
		System.out.println("Mault "+e);
		
	}
}
