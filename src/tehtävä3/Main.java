package tehtävä3;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LaiteosaTehdas tehdas;
		Tietokone halppisTietokone = new Tietokone();
		tehdas = new HalpaOsaTehdas();
		halppisTietokone.KasaaKone(tehdas);
		System.out.println("Halppis: " + halppisTietokone.kerroHinta());
		
		Tietokone kallisKone = new Tietokone();
		tehdas = new KallisOsaTehdas();
		kallisKone.KasaaKone(tehdas);
		System.out.println("Kallis: " + kallisKone.kerroHinta());
	}

	
	
}
