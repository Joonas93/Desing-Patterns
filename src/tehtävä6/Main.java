package tehtävä6;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Disk disk = new Disk();//as a disk where the data could been written
		Text  teksti = new NormalText();
		
		teksti.write(disk);
		System.out.println(teksti.getText(disk));
		
		teksti = new CipherDecorator(teksti);
		
		teksti.write(disk);
		System.out.println(disk.getText()); //Encrypted text
		System.out.println(teksti.getText(disk)); //Decrypted message
		
		
		
	}

}
