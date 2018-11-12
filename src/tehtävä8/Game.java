package tehtävä8;

public abstract class Game {
	abstract  int askHowManyPlayers();
	protected int playersCount;
	abstract void initializeGame();
	abstract void makePlay(int player);
	abstract boolean endOfGame();
	abstract void printWinner();
	public boolean finished = false;
	
	public final void playOneGame(int playersCount){
		this.playersCount = playersCount;
		initializeGame();
		int j = 1;
		while(!endOfGame()){
			makePlay(j);
			j= (j+1) % playersCount;
		}
		printWinner();
	}
	public Game() {
		// TODO Auto-generated constructor stub
	}

}
