package BasicCorePrograms.BasicCorePrograms;

import java.util.Scanner;

public class PowerOf2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter any number to print table of power of 2");
		double N = scanner.nextDouble();
		
		for(int i=1;i<=N;i++)
		{
			System.out.print("2^" +i);
			System.out.print("= ");
			System.out.println(Math.pow(2, i));
		}
	}
}
