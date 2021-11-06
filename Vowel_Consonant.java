package BasicCorePrograms.BasicCorePrograms;

import java.util.Scanner;

public class Vowel_Consonant {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter alphabet to check if its a vowel or consonant ");
		char c = scanner.next().charAt(0);
		
		char arr[] = {'a','e','i','o','u'};
		int a=0;
		for(int i=0;i<4;i++)
		{
			if(c==arr[i])
			{
				System.out.println("Yes, its a Vowel");
				a=1;
				break;
			}
		}
		if(a==0)
			System.out.println("Its a consonant");
		
		
		
	}

}
