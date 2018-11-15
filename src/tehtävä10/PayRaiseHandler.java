package tehtävä10;

public interface PayRaiseHandler {

	public void handle(int procent);
	public void setNextHandler(PayRaiseHandler r);
}
