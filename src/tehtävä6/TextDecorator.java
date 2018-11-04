package tehtävä6;

public class TextDecorator implements Text {

	protected Text text;
	public TextDecorator(Text text) {
		// TODO Auto-generated constructor stub
		this.text = text;
	}

	@Override
	public void write(Disk disk) {
		// TODO Auto-generated method stub
		text.write(disk);
	}

	@Override
	public String getText(Disk disk) {
		// TODO Auto-generated method stub
		return text.getText(disk);
	}

}
