package BasicCorePrograms.BasicCorePrograms;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number N1 ");
		int N1 = scanner.nextInt();
		System.out.println("Enter number N2 ");
		int N2 = scanner.nextInt();
		System.out.println("Enter number N3 ");
		int N3 = scanner.nextInt();
		
		if(N1>N2 && N1>N3)
			System.out.println(N1 +" is the largest number out of all 3");
		else if(N2>N1 && N2>N3)
			System.out.println(N2 +" is the largest number out of all 3");
		else 
			System.out.println(N3 +" is the largest number out of all 3");
	}
}
