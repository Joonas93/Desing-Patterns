package tehtävä14;

public class Cook {

	private HamburgerBuilder builder;
	
	public Cook(HamburgerBuilder builder) {
		this.builder = builder;
	}
	
	public void makeBurger(){
		builder.addCheese();
		builder.addMeat();
		builder.addMeat();
	}
	
	public Object getBurger(){
		return this.builder.getBurger();
	}
	public void setBuilder(HamburgerBuilder builder){
		this.builder = builder;
	}
}
