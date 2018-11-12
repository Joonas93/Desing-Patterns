package tehtävä8;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessTheNumber extends Game {
private int NumberToGuess;
private int NumberGuessed;
private int Player;
private final int MAX_NUMBER = 20;

	public  int askHowManyPlayers() {
		int count = 0;
		Scanner s = new Scanner(System.in);
		
		do{
		System.out.println("How many players (1-4)");
		
		count = s.nextInt();
		
		
		}
		while(count > 4 && count < 1);
			return count;
		
	}
	@Override
	void initializeGame() {
		
		NumberToGuess = ThreadLocalRandom.current().nextInt(1, MAX_NUMBER + 1);
		System.out.println("Idea of the game is to guess random number from 1-" + MAX_NUMBER + " that the computer is thinking :)");
		System.out.println("First one to guess correctly wins!");
		
		
	
		
	}

	@Override
	void makePlay(int player) {
		this.Player = player;
		Scanner s = new Scanner(System.in);
		do{
		System.out.println("Player " + this.Player +", your guess: ");
		NumberGuessed = s.nextInt();
		System.out.print(NumberGuessed);
		} 
		while (NumberGuessed <1 || NumberGuessed > 20);
		
		if (NumberGuessed == NumberToGuess) {
			finished = true;
			System.out.println("Correct!");
		}
		else{
			System.out.println("Not Correct. Next turn");
		}
		
		
	}

	@Override
	boolean endOfGame() {
		// TODO Auto-generated method stub
		if (finished) return true;
		return false;
	}

	@Override
	void printWinner() {
		System.out.println("Winner is: player " + Player );
		
	}

	
}
