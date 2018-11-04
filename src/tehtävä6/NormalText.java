package tehtävä6;

public class NormalText implements Text {

	public NormalText() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void write(Disk disk) {
		
		disk.setText("Normaalia tekstiä");
	}

	@Override
	public String getText(Disk disk) {
		// TODO Auto-generated method stub
		return disk.getText();
	}

}
