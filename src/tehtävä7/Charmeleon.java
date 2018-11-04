package tehtävä7;

public class Charmeleon implements CharmanderState {
	private static CharmanderState pokemon = null;
	public Charmeleon() {
		// TODO Auto-generated constructor stub
	}

	public static CharmanderState getInstance() {
		if (pokemon == null) pokemon =  new Charmeleon();
		return pokemon;
	}
	@Override
	public void roar() {
		System.out.println("ROARR!");

	}

	@Override
	public void breathFire() {
		System.out.println("*Medium Flames");

	}

	@Override
	public void tellName() {
		System.out.println("My name is Charmeleon");

	}

	@Override
	public CharmanderState evolve() {
		// TODO Auto-generated method stub
		return Charizard.getInstance();
	}


}
