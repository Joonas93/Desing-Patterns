package tehtävä22;

public class WhiteScreenUp implements Command{

	private WhiteScreen whiteScreen;
	
	public WhiteScreenUp(WhiteScreen w){
		this.whiteScreen = w;
	}

	@Override
	public void execute() {
		whiteScreen.rollUp();
		
	}
}
