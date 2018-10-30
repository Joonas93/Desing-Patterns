package tehtävä3;

public class Tietokone {
private Kotelo kotelo;
private Prosessori prosessori;
private Verkkokortti verkkokortti;
private Muistipiiri muistipiiri;
private Emolevy emolevy;
private Näytönohjain näytönohjain;
	public Tietokone() {
		// TODO Auto-generated constructor stub
	}

	public void KasaaKone(LaiteosaTehdas tehdas){
		this.kotelo = tehdas.teeKotelo();
		this.prosessori = tehdas.teeProsessori();
		this.verkkokortti = tehdas.teeVerkkokortti();
		this.muistipiiri = tehdas.teeMuistipiiri();
		this.emolevy = tehdas.teeEmolevy();
		this.näytönohjain = tehdas.teeNäytönohjain();
		
		emolevy.lisääOsa(prosessori);
		emolevy.lisääOsa(verkkokortti);
		emolevy.lisääOsa(muistipiiri);
		emolevy.lisääOsa(näytönohjain);
		kotelo.lisääOsa(emolevy);
	
		
	}
	
	public String kerroHinta(){
		return kotelo.laskeHinta() + "E";
	}
	
}
