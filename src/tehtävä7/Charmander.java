package tehtävä7;

public class Charmander implements CharmanderState {
	private static CharmanderState pokemon = null;
	public Charmander() {
		
	}

	public static CharmanderState getInstance() {
		if (pokemon == null)  
		{pokemon = new Charmander();}
		return pokemon;
	}
	@Override
	public void roar() {
		System.out.println("roarr");

	}

	@Override
	public void breathFire() {
		System.out.println("*Small flames*");

	}

	@Override
	public void tellName() {
		System.out.println("My name is Charmander");
	}

	@Override
	public CharmanderState evolve() {
		
		return Charmeleon.getInstance();
		
	}

}
