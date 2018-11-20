package tehtävä13;

public interface workerState {

	public void doYourStuff();
	public workerState switchState();
	public int accept(Visitor visitor);
}
