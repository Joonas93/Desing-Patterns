package tehtävä2;

public class BossTehdas implements VaateTehdas {

	public BossTehdas() {
		// TODO Auto-generated constructor stub
	}
	public Paita luoPaita() {
		return new Paita("Boss");
	}
	public Farkut luoFarkut() {
		return new Farkut("Boss");
	}
	public Kengät luoKengät() {
		return new Kengät("Boss");
	}
	public Lippis luoLippis() {
		return new Lippis("Boss");
	}
}
