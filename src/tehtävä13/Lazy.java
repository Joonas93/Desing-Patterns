package tehtävä13;

public class Lazy implements workerState {

	private static Lazy lazy = null;
	private Lazy(){
		
	}
	
	public static workerState getInstance(){
		if(lazy==null) {lazy = new Lazy();}
	 return lazy;
	}
	@Override
	public void doYourStuff() {
		// TODO Auto-generated method stub
		System.out.print("I work lazy");
	}

	@Override
	public workerState switchState() {
		// TODO Auto-generated method stub
		return Diligent.getInstance();
	}

	@Override
	public int accept(Visitor visitor) {
		// ODO Auto-generated method stub
		return visitor.visit(this);
	}



	

}
