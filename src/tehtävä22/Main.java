package tehtävä22;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhiteScreen ws = new WhiteScreen();
		Command rollScreenUp = new WhiteScreenUp(ws);
		Command rollScreenDown = new WhiteScreenDown(ws);
		
		rollScreenUp.execute();
		rollScreenDown.execute();
	}

}
