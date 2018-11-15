package tehtävä10;

public class Manager extends HandlerClass {

	private final int HOW_BIG_RAISE_CAN_HANDLE = 5;
	private final int HOW_LOW_RAISE_CAN_HANDLE = 2;
		
		public void handle (int procent){
			
			if (procent <= HOW_BIG_RAISE_CAN_HANDLE && procent > HOW_LOW_RAISE_CAN_HANDLE) {
				System.out.println(this + " can handle it");
			}
			else {
				getNext().handle(procent);
			}
		}
	
		@Override
		public String toString() {
			return "Manager";
		}

	

}
