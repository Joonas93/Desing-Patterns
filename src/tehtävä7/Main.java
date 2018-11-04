package tehtävä7;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		int States = 3;
		Pokemon pokemon = new Pokemon();
		
		for (int i = 0; i < States; i++) {
		
		pokemon.tellName();
		pokemon.breathFire();
		pokemon.roar();
		pokemon.evolve();
		System.out.println();
		}
	}

}
