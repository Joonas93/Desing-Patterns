package tehtävä7;

public class Pokemon {

	private CharmanderState currentState;

	public Pokemon() {
		currentState = Charmander.getInstance();
		
	}
	
	protected  void evolve(){
		currentState = currentState.evolve();
	}
	
	public void roar(){
		currentState.roar();
	}
	public void breathFire() {
		currentState.breathFire();
	}
	public void tellName(){
		currentState.tellName();
	}

	

}
