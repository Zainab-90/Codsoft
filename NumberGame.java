// Task 1: Number Game

import java.util.Random;
import java.util.Scanner;
public class NumberGame
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int answer = r.nextInt(100)+1;
		
		int tries = 5;
		System.out.println("\n********** Number Game **********\n")

		while(tries > 0)
		{
			System.out.print("Guess A Number Between 1-100 : ");
			int guess = sc.nextInt();
			System.out.println(" ");
			if(guess == answer)
			{
				System.out.println("You Have Guessed Correctly!!");
				break;
			}

			else if(guess > answer)
			{
				System.out.println("You Guess Is Too High!!.");									
				System.out.println("You Have "+(tries-1)+" Tries Left\n");
				tries--;	
			}

			else if(guess < answer)
			{
				System.out.println("You Guess Is Too Low!!.");
				System.out.println("You Have "+(tries-1)+" Tries Left\n");
				tries--;
			}
		} 
		if(tries<=0)
		{
			System.out.println("Sorry!! You Have Run Out Of Tries.\n");
			System.out.println("The Correct answer is: "+answer);
		}

		
	}
}