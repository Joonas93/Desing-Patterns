package tehtävä7;

public class Charizard implements CharmanderState {
	private static CharmanderState pokemon = null;
	private Charizard() {
		
		
	}

	public static CharmanderState getInstance() {
		if (pokemon == null) pokemon = new Charizard();
		return pokemon;
	}
	@Override
	public void roar() {
		System.out.println("ROOOOAOAOAOAOAAAAAR!!");
	}

	@Override
	public void breathFire() {
		System.out.println("*LARGE flames*");
	}

	@Override
	public void tellName() {
		System.out.println("My name is Charizard");
	}

	@Override
	public CharmanderState evolve() {
		// TODO Auto-generated method stub
		System.out.print("Cannot evolve anymore..");
		return Charizard.getInstance();
		
	}

	

}
