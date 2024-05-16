package operators.basic.Cif;

import java.util.Scanner;

public class PaymentOption {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1- CC , 2 - DC, 3 - C,4 - Cash ");
		
		int payment = scanner.nextInt();
		scanner.close();
		
		switch(payment) {
		case 1:
			System.out.println("payment by CC Card");
			break;
		case 2:
			System.out.println("Payment by Debit Card ");
			break;
		case 3:
			System.out.println("Payment by Check");
			break;
		case 4:
			System.out.println("Paymet by Cash");
			break;
			default:
				System.err.println("More No Option..");
				break;
		}
	}

}
