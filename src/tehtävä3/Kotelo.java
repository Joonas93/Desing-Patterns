package tehtävä3;

import java.util.ArrayList;
import java.util.List;

public class Kotelo extends Komponentti {
	private List<Laiteosa> osat = new ArrayList();
	public Kotelo(int hinta) {
		super(hinta);
	}
	public void lisääOsa(Laiteosa osa){
		osat.add(osa);
	}
	
	public int laskeHinta(){
		int hinta = 0;
		for(Laiteosa l : osat){
			
			hinta = hinta + l.LaskeHinta();
		}
		return hinta + this.hinta;
	}

}
