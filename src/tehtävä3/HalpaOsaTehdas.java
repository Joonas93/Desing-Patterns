package tehtävä3;

public class HalpaOsaTehdas implements LaiteosaTehdas {

	public HalpaOsaTehdas() {
		// TODO Auto-generated constructor stub
	}

	
	public Emolevy teeEmolevy() {
		// TODO Auto-generated method stub
		
		return new Emolevy(100);
	}

	
	public Kotelo teeKotelo() {
		// TODO Auto-generated method stub
		return new Kotelo(100);
	}

	public Muistipiiri teeMuistipiiri() {
		// TODO Auto-generated method stub
		return new Muistipiiri(25);
	}

	
	public Näytönohjain teeNäytönohjain() {
		// TODO Auto-generated method stub
		return new Näytönohjain(50);
	}

	
	public Verkkokortti teeVerkkokortti() {
		// TODO Auto-generated method stub
		return new Verkkokortti(10);
	}

	
	public Prosessori teeProsessori() {
		// TODO Auto-generated method stub
		return new Prosessori(125);
	}

}
