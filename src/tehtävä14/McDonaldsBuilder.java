package tehtävä14;

import java.util.ArrayList;
import java.util.List;

public class McDonaldsBuilder implements HamburgerBuilder{

	private List<String> hamburger = new ArrayList();
	@Override
	public void addMeat() {
		// TODO Auto-generated method stub
		this.hamburger.add("Meat");
	}

	@Override
	public void addSalad() {
		// TODO Auto-generated method stub
		this.hamburger.add("Salad");
	}

	@Override
	public void addCheese() {
		// TODO Auto-generated method stub
		this.hamburger.add("Cheese");
	}

	@Override
	public List<String> getBurger() {
		// TODO Auto-generated method stub
		return hamburger;
	}

}
