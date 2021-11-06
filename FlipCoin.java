package BasicCorePrograms;
import java.util.Scanner;

public class FlipCoin {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many times the coin should be flipped? ");
		double flips = scanner.nextDouble();
		
		double heads = 0;
		double tails = 0;
		
		for(int i=0; i<flips; i++)
		{
			double coin = Math.floor(Math.random()*10)%2 ;
			if(coin==0.0) {
				heads=heads+1;	
			}
			else
			{
				tails=tails+1;
			}
		}
		
		System.out.println("percentage of heads: " +Math.floor((heads/flips)*100));
		System.out.println("percentage of tails: " +Math.floor((tails/flips)*100));
	}
}
