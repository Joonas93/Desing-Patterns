package tehtävä9;

public class Main {
	public static void main(String[] args) {
		
		TheList list = new TheList();
		list.setConverter(new ConverterOne());
		list.printList();
		
		list.setConverter(new ConverterTwo());
		list.printList();
		
		list.setConverter(new ConverterThree());
		list.printList();
	}



}
