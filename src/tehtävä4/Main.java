package tehtävä4;

import java.util.Observer;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		ClockTimer ct = new ClockTimer();
		Observer dc = new DigitalClock(ct);
		ct.start();


	}

}
