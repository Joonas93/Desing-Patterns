package tehtävä18;

public class Pointer implements Cloneable{

	private int value;

	public Pointer(int value) {
		// TODO Auto-generated constructor stub
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public Pointer clone(){
		try {
			return (Pointer) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
