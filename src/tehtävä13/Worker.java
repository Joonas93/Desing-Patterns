package tehtävä13;

public class Worker {

	private workerState currentState;
	private int pay;
	
	public Worker() {
		currentState = Lazy.getInstance();
	}
	
	public void doYourStuff(){
		currentState.doYourStuff();
	}
	public void switchStage(){
		currentState = currentState.switchState();
	}
	public void accept(Visitor visitor){
		this.pay = currentState.accept(visitor);
	}

	@Override
	public String toString() {
		return "Worker [pay=" + pay + "]";
	}
}
