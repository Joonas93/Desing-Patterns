package tehtävä9;

import java.util.ArrayList;
import java.util.List;

public class TheList {

	List list = new ArrayList();
	ListConverter converter;
	
	

	public TheList() {
		
		String word = "word";
		int i = 1;
		for(;i<10 ; i++) {
			list.add(word + i);
		}
	}
	
	public void printList() {
		System.out.print(converter.listToString(list));
	}
	public void setConverter(ListConverter converter) {
		this.converter = converter;
	}

}
