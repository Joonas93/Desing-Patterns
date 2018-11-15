package tehtävä11;

public class Customer extends Thread {

	public Customer(){
		this.start();
	}
	private Object obj;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public void saveMemento(Object m) {
		this.obj = m;
	}
	
	public Object getMemento(){
		return this.obj;
	}
	

}
