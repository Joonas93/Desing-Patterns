package tehtävä3;

public class KallisOsaTehdas implements LaiteosaTehdas {

	public KallisOsaTehdas() {
		// TODO Auto-generated constructor stub
	}

	public Emolevy teeEmolevy() {
		// TODO Auto-generated method stub
		
		return new Emolevy(150);
	}

	
	public Kotelo teeKotelo() {
		// TODO Auto-generated method stub
		return new Kotelo(150);
	}

	public Muistipiiri teeMuistipiiri() {
		// TODO Auto-generated method stub
		return new Muistipiiri(35);
	}

	
	public Näytönohjain teeNäytönohjain() {
		// TODO Auto-generated method stub
		return new Näytönohjain(75);
	}

	
	public Verkkokortti teeVerkkokortti() {
		// TODO Auto-generated method stub
		return new Verkkokortti(15);
	}

	
	public Prosessori teeProsessori() {
		// TODO Auto-generated method stub
		return new Prosessori(225);
	}

}
