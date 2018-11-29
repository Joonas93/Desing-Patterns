package tehtävä18;

public class Main {

	public static void main(String[] args) {

		int hour = 4, minute = 10;
		Clock original = new Clock(hour,minute);
		Clock clone = original.clone();
		clone.getHour().setValue(5);
		
		System.out.println(original.getHour().getValue()); //4
		System.out.println(clone.getHour().getValue()); //5

	}

}
