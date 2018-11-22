package tehtävä15;

public class SteakAdapter implements Food {

	private Steak steak;
	
	public SteakAdapter(Steak steak){
		this.steak = new Steak();
	}

	@Override
	public void eat() {
		steak.prepareSteak();
		steak.enjoySteak();
		
	}
	
}
