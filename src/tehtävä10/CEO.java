package tehtävä10;

public class CEO extends HandlerClass {

	
	private final int HOW_LOW_RAISE_CAN_HANDLE = 5;
		
		public void handle (int procent){
			
			if (procent > HOW_LOW_RAISE_CAN_HANDLE) {
				System.out.println(this + " can handle it");
			}
			else {
				getNext().handle(procent);
			}
		}
		
		@Override
		public String toString() {
			return "CEO";
		}


}
