package tehtävä4;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer{

	private ClockTimer ct;
	public DigitalClock(ClockTimer ct) {
		this.ct = ct;
		ct.addObserver(this);
	}

	@Override
	public void update(Observable obs, Object obj) {
		// TODO Auto-generated method stub
		if(obs == ct)
		draw();
	}
	
	public void draw(){
		System.out.println(ct.getHour()+":"+ct.getMinute()+":"+ct.getSecond());
	}
}
