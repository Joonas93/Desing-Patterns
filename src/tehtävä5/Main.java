package tehtävä5;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		User u = new User(1);
		LoggedInUser.createInstance(u);
		System.out.println(LoggedInUser.getInstance().getId()); //Printtaa "1"
		
		User u2 = new User(2);
		LoggedInUser.createInstance(u2);
		System.out.println(LoggedInUser.getInstance().getId()); //Printtaa "1"
		
		
		
	}

}
