package tehtävä11;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Riddler r = new Riddler();
		
		r.liityPeliin(c1);
		r.liityPeliin(c2);
		
		r.arvaus(c1.getMemento());
		r.arvaus(c2.getMemento());
		
	}

}
