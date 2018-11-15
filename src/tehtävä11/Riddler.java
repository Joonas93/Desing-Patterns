package tehtävä11;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Riddler {

	private static final int MAX_NUMBER_TO_GUESS = 20;
	private static final int MIN_NUMBER_TO_GUESS = 1;
	
	public Riddler() {
		// TODO Auto-generated constructor stub
	}

	public void liityPeliin(Customer customer) {
		int numberToGuess = ThreadLocalRandom.current().nextInt(MIN_NUMBER_TO_GUESS, MAX_NUMBER_TO_GUESS + 1);
		customer.saveMemento(new Memento(numberToGuess));
	}
	
	public void arvaus(Object m) {
		Memento tmp = (Memento) m;
		Scanner s = new Scanner(System.in);
		System.out.print("Arvaa numero: ");
		int guess = s.nextInt();
		if (tmp.getNumberToGuess() == guess) {
			System.out.print("OIKEIN!");
		}
		else { 
			System.out.print("Väärin");
		}
	}
	private class Memento {
		private int NumberToGuess;

		public Memento(int num){
			NumberToGuess = num;
		}
		public int getNumberToGuess() {
			return NumberToGuess;
		}

		public void setNumberToGuess(int numberToGuess) {
			NumberToGuess = numberToGuess;
		}	
		
	}
}
