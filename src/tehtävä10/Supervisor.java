package tehtävä10;

public class Supervisor extends HandlerClass {



	private final int HOW_BIG_RAISE_CAN_HANDLE = 2;
	
	
	public void handle (int procent){
		
		if (procent <= HOW_BIG_RAISE_CAN_HANDLE) {
			System.out.println(this + " can handle it");
		}
		else {
			getNext().handle(procent);
		}
	}
		@Override
		public String toString() {
			return "Supervisor";
		}

}

	


	

	





	

