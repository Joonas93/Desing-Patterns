package tehtävä6;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class CipherDecorator extends TextDecorator {
private final String AVAIN = "Jee";
private StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
	public CipherDecorator(Text text) {
		super(text);
		encryptor.setPassword(AVAIN);
	}

	public void write(Disk disk){
		super.write(disk);
		disk.setText(Encrypt(disk));
		
	}
	
	private String Encrypt(Disk disk){
		return encryptor.encrypt(disk.getText());
		}
	
	public void Decrypt(Disk disk) {
		disk.setText(encryptor.decrypt(disk.getText()));
	}
	
	public String getText(Disk disk){
		Decrypt(disk);
		return disk.getText();
	}
	
	
	
}
