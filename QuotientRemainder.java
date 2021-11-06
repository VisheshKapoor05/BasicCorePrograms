package BasicCorePrograms.BasicCorePrograms;

import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number N1 to get divided ");
		double N1 = scanner.nextDouble();
		System.out.println("Enter number N2 to divide N1 ");
		double N2 = scanner.nextDouble();
		
		double Quotient = N1/N2 ;
		double Remainder = N1%N2 ;
		
		System.out.println("Quotient = " +Quotient);
		System.out.println("Remainder = " +Remainder);
	}
}
