package tehtävä9;

import java.util.Iterator;
import java.util.List;

public class ConverterThree implements ListConverter {

	public ConverterThree() {
		// TODO Auto-generated constructor stub
	}

	
	public String listToString(List list) {
		// TODO Auto-generated method stub
		String result = "";
		int count = 0;
		
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			count++;
			String word = (String)itr.next() + " ";
			if(count == 3){
			result += word + "\n";
			count = 0;
			}
			else {
				result += word;
			}
			
		}
		
		return result;
	}

}
