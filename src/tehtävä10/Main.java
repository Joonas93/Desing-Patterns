package tehtävä10;

public class Main {

	public static void main(String[] args) {

		PayRaiseHandler supervisor = new Supervisor();
		PayRaiseHandler manager = new Manager();
		PayRaiseHandler ceo = new CEO();
		
		supervisor.setNextHandler(manager);
		manager.setNextHandler(ceo);
		ceo.setNextHandler(supervisor);
		
		ceo.handle(3);
		supervisor.handle(5);
		manager.handle(1);
		ceo.handle(2);
		ceo.handle(66);
		
	}

}
