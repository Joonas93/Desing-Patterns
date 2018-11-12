package tehtävä9;

import java.util.List;

public class ConverterTwo implements ListConverter {

	public ConverterTwo() {
		// TODO Auto-generated constructor stub
	}

	
	public String listToString(List list) {
		String result = "";
		String[] wordArray = (String[]) list.toArray(new String[list.size()]);
		int count = 0;
		for (int i = 0; i<wordArray.length; i++) {
			String word = wordArray[i] + " ";
			count ++;
				if(count == 2) {
				 result += word + "\n"	;
				 count = 0;
				}
				else {
					result += word;
				}
			
		}
		
		return result;
		
		
		
		
	}

}
