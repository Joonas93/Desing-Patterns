package tehtävä15;

public class Steak {

	private boolean isCooked = false;
	
	public void prepareSteak(){
		cookSteak();
	}

	private void cookSteak() {
		// TODO Auto-generated method stub
		isCooked = true;
	}
	
	public void enjoySteak() {
		if (isCooked) System.out.println("Enjoying some fine steak");
	}
}
