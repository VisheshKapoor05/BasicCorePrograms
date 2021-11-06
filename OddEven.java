package BasicCorePrograms.BasicCorePrograms;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number N to check whether its an odd or even ");
		double N = scanner.nextDouble();
		
		if(N%2 == 0)
		{
			System.out.println("Yes, its an even number");
		}
		else
		{
			System.out.println("Its a odd number");
		}
	}
}
