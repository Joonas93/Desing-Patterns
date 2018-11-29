package tehtävä18;

public class Clock implements Cloneable{

	private Pointer hour;
	private Pointer minute;


	public Clock(int h, int m) {
		hour = new Pointer(h);
		minute = new Pointer(m);
	}
	public Pointer getHour() {
		return hour;
	}
	public void setHour(Pointer hour) {
		this.hour = hour;
	}
	public Pointer getMinute() {
		return minute;
	}
	public void setMinute(Pointer minute) {
		this.minute = minute;
	}
	
	@Override
	public Clock clone() {
		Clock c = null;
		try {
			c = (Clock) super.clone();
			c.setHour(getHour().clone());
			c.setMinute(getMinute().clone());
			return (Clock)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return c;
		}
	}
}
