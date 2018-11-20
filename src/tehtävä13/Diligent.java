package tehtävä13;

public class Diligent implements workerState {
	
	private static Diligent diligent = null;
	

	@Override
	public void doYourStuff() {
		System.out.print("I work hard");
		
	}

	@Override
	public workerState switchState() {
		// TODO Auto-generated method stub
		return Lazy.getInstance();
		
	}

	public static workerState getInstance() {
		if (diligent==null)  {diligent = new Diligent();}
		return diligent;
	}

	@Override
	public int accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}


}
