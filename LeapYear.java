package BasicCorePrograms.BasicCorePrograms;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any year to check whether it is a leap year or not ");
		double year = scanner.nextDouble();
		if((year%4) == 0)
		{
			System.out.println("Yes, it is a leap year");
		}
		else
		{
			System.out.println("It is not a leap year");
		}
	}
}
