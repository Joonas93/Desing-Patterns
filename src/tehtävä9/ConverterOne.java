package tehtävä9;

import java.util.List;

public class ConverterOne implements ListConverter {

	public ConverterOne() {
		// TODO Auto-generated constructor stub
	}


	public String listToString(List list) {

		String result = "";
	
		
		for (int i = 0; i<list.size(); i++) {
		result += list.get(i) + "\n";
		}
		
		return result;
	}

}
