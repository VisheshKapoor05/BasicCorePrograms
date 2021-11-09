package BasicCorePrograms.BasicCorePrograms;

import java.util.Scanner;

public class PrimeFactors {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number N to calculate its prime factors ");
		int N = scanner.nextInt();
		
		int a=2; 
		System.out.println("Prime Factors of " +N +" are");
		
		if(N%2==0)
			System.out.println(2);
		
		for(int i=3;i<=N/2;i++)
		{
			if(N%i == 0)
			{
				for(int j=2; j<i; j++)
				{
					if(i%j == 0)
					{
						a=0;
						break;	
					}
					else
					{
						a=1;
					}	
				}
				if(a==1)
				{
					System.out.println(i);
				}
			}
			
			
		}
	}
}
