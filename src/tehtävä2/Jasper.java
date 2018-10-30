package tehtävä2;

public class Jasper {

	private Lippis Lippis;
	private Farkut Farkut;
	private Kengät Kengät;
	private Vaate Paita;
	public Jasper() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Jasper [Lippis=" + Lippis.merkki + ", Farkut=" + Farkut.merkki + ", Kengät=" + Kengät.merkki + ", Paita=" + Paita.merkki + "]";
	}

	public void puePaalle(VaateTehdas vaateTehdas) {
		Lippis = vaateTehdas.luoLippis();
		Farkut = vaateTehdas.luoFarkut();
		Kengät = vaateTehdas.luoKengät();
		Paita = vaateTehdas.luoPaita();
	}
}
