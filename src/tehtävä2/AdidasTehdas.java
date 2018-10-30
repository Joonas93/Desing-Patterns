package tehtävä2;

public class AdidasTehdas implements VaateTehdas {

	public AdidasTehdas() {
		// TODO Auto-generated constructor stub
	}
	public Paita luoPaita() {
		return new Paita("Adidas");
	}
	public Farkut luoFarkut() {
		return new Farkut("Adidas");
	}
	public Kengät luoKengät() {
		return new Kengät("Adidas");
	}
	public Lippis luoLippis() {
		return new Lippis("Adidas");
	}
}

