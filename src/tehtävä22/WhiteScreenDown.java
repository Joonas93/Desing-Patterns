package tehtävä22;

public class WhiteScreenDown implements Command{

	private WhiteScreen whiteScreen;
	
	public WhiteScreenDown(WhiteScreen w){
		this.whiteScreen = w;
	}

	@Override
	public void execute() {
		whiteScreen.rollDown();
		
	}
}
