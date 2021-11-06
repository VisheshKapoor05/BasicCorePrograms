package BasicCorePrograms.BasicCorePrograms;

import java.util.Scanner;

public class Swaping2Numbers {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number N1 ");
		int N1 = scanner.nextInt();
		System.out.println("Enter number N2 ");
		int N2 = scanner.nextInt();
		
		int N3=N2;
		N2=N1;
		N1=N3;
		
		System.out.println("N1= " +N1 +" N2= " +N2);
		
	}

}
