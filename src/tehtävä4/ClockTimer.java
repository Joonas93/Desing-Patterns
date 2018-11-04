package tehtävä4;

import java.util.Date;
import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;

public class ClockTimer extends Observable {

	private int Hour,Minute,Second = 0;
	
	public ClockTimer() {
		// TODO Auto-generated constructor stub
	}
	public int getHour() {
		return Hour;
	}
	public void setHour(int hour) {
		Hour = hour;
	}
	public int getMinute() {
		return Minute;
	}
	public void setMinute(int minute) {
		Minute = minute;
	}
	public int getSecond() {
		return Second;
	}
	public void setSecond(int second) {
		Second = second;
	}
	
	public void start () {
		TimerTask task = new TimerTask() {

		    @Override
		    public void run() {
		        tick();
		    }
		};
		Timer timer = new Timer();
		timer.schedule(task, new Date(), 1000);
	}
	
	public void tick(){
		
		if(Second < 59) Second++;
		else {Second = 0; 
				if (Minute < 59) Minute++;
				else { Minute = 0;
						if (Hour <23) Hour ++;
						else {Hour = 0;
						}
				}
		}
		setChanged();
		notifyObservers();
	}
}
