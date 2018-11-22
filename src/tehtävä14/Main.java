package tehtävä14;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List McDonaldsHamburger;
		StringBuilder HesburgerHamburger;

		HamburgerBuilder McDonalds = new McDonaldsBuilder();
		HamburgerBuilder Hesburger = new HesburgerBuilder();
		
		Cook cook = new Cook(McDonalds);
		cook.makeBurger();
		McDonaldsHamburger = (List)cook.getBurger();
		
		cook.setBuilder(Hesburger);
		cook.makeBurger();
		HesburgerHamburger = (StringBuilder)cook.getBurger();
		
		System.out.print(HesburgerHamburger.toString());
		
		
		
	}

}
