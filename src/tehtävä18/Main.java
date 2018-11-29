package tehtävä18;

public class Main {

	public static void main(String[] args) {

		int hour = 4, minute = 10;
		Clock original = new Clock(hour,minute);
		Clock copy = original.clone();
		//copy.getHour().setValue(5);
		
		Clock c = new Clock(hour, minute);
		Clock b = c;
		b.getHour().setValue(3);
		
		System.out.println(System.identityHashCode(original));
		System.out.println(System.identityHashCode(copy));
		System.out.print(c.getHour().getValue());
	}

}
