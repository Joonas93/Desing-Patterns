package tehtävä15;

public class Main {

	public static void main(String[] args) {
		Food pizza = new Pizza();
		Food hotDog = new HotDog();
		
		Steak steak = new Steak();
		
		Food steakAdapter = new SteakAdapter(steak);
		
		pizza.eat();
		hotDog.eat();
		steakAdapter.eat();
	}

}
