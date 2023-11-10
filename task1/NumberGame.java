/*
 * Name : Manoj Kale
 * 
 * */
package task1;

import java.util.Scanner;

public class NumberGame {
	
	private int targetNumber;
	private int attempts;
	private int roundsWon;
	
	public int generateRandomNumber(int min, int max) 
	{
		return (int)(Math.random()*(max - min + 1)) + min;
	}
	
	public void playGame(int min, int max, int maxAttempts) 
	{
		targetNumber = generateRandomNumber(min, max);
		attempts = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(attempts < maxAttempts) 
		{
			System.out.print("Enter your guess between " +min+ " and " +max+" : ");
			int userGuess = sc.nextInt();
			
			attempts++;
			
			if(userGuess < targetNumber)
			{
				System.out.println("Tow low! Try again.");
			}
			else if(userGuess > targetNumber) 
			{
				System.out.println("Tow high! Try again.");
			}
			else 
			{
				System.out.println("Congratulations! You guessed the number in "+ attempts+ " attempts.");
				roundsWon++;
				break;
			}
		}
		
		if(attempts == maxAttempts) 
		{
			System.out.println("Sorry, you've reached the maximum number of attempts.\nThe correct number was : " + targetNumber);
		}
		
	}
	
	public void startGame() 
	{
		Scanner sc2 = new Scanner(System.in);
		int minRange = 1;
		int maxRange = 100;
		int maxAttempts = 5;
		
		int round = 1;
		
		while(true)
		{
			System.out.println("\nRound " + round);
			playGame(minRange, maxRange, maxAttempts);
			
			System.out.print("Do you want play another round?(Yes/No): ");
			String playAgain = sc2.next();
			
			if(playAgain.equalsIgnoreCase("no")) 
			{
				break;
			}
			
			round++;
		}
		
		System.out.println("Game over!!! \nRounds won : " + roundsWon);
		sc2.close();
	}
	
	public static void main(String[] args) 
	{
		NumberGame numberGame = new NumberGame();
		numberGame.startGame();
	}

}
