package tehtävä10;

public class HandlerClass implements PayRaiseHandler{

	private PayRaiseHandler next;

	public void setNextHandler(PayRaiseHandler p) {

		this.next = p;
	}

	public PayRaiseHandler getNext() {
		return next;
	}

	
	public void handle(int procent) {
		// TODO Auto-generated method stub
		
	}

	
}
