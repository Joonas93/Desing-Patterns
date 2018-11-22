package tehtävä14;

public class HesburgerBuilder implements HamburgerBuilder {

	private StringBuilder hamburger = new StringBuilder();
	@Override
	public void addMeat() {
		// TODO Auto-generated method stub
		hamburger.append("Meat ");
	}

	@Override
	public void addSalad() {
		// TODO Auto-generated method stub
		hamburger.append("Salad ");
	}

	@Override
	public void addCheese() {
		// TODO Auto-generated method stub
		hamburger.append("Cheese ");
	}

	@Override
	public StringBuilder getBurger() {
		// TODO Auto-generated method stub
		return hamburger;
	}

}
