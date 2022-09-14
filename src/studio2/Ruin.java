package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
	//Variables
		int startAmount;
		int winLimit;
		int loseLimit;
		int totalSimulations;
		
		startAmount = 5;
		winLimit = 10;
		loseLimit = 0;
		totalSimulations = 0;
		
		System.out.println("How many days? ");
		int totalSimulations=in.nextInt();
		
		
		while(totalSimulations<8)
		{
		 totalSimulations=totalSimulations+1;
		 
		while (startAmount > loseLimit && startAmount < winLimit)
		
		{
		double winChance = (int) (Math.random() + 0.5);
		
			if (winChance == 1)
			{
				startAmount = 1 + startAmount;
				System.out.println("You win! Your current amount is: " + startAmount);
			}
			else
			{
				startAmount = startAmount - 1;
				System.out.println("You lose. Your current amount is: " + startAmount);
			}
		}	
		if (startAmount == 10)
		{
			System.out.println("Good Job! You've won!");
		}
		else
		{
			System.out.println("Sorry, better luck next time. The day is ruined.");
		}
		}
	}

}
