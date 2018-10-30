package tehtävä3;

import java.util.ArrayList;
import java.util.List;

public class Emolevy extends Komponentti {

	private List<Laiteosa> osat = new ArrayList();
	public Emolevy(int hinta) {
		// TODO Auto-generated constructor stub
		super(hinta);
	}
 
	public void lisääOsa(Laiteosa osa){
		osat.add(osa);
	}
	@Override
	public int LaskeHinta(){
		int hinta = 0;
		
		for(Laiteosa l : osat){
			
			hinta = hinta + l.LaskeHinta();
		}
		return hinta + this.hinta;
	}
}
