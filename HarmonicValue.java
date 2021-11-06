package BasicCorePrograms.BasicCorePrograms;

import java.util.Scanner;

public class HarmonicValue {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter Nth harmonic number to calculate its harmonic value");
		double N = scanner.nextDouble();
		
		double Harmonic_Value = 0;
		if(N==0)
		{
			System.out.println("Please enter a positive non-zero value");
		}
		else
		{
			for(double i=1;i<=N;i++)
			{
				Harmonic_Value=Harmonic_Value+(1/i);
			}
		}
		System.out.println("Harmonic Value = " +Harmonic_Value);
	}

}
