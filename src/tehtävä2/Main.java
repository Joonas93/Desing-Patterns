package tehtävä2;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VaateTehdas vaateTehdas;
		Jasper jasper = new Jasper();
		vaateTehdas =  new AdidasTehdas();
		jasper.puePaalle(vaateTehdas);
		System.out.println(jasper.toString());
		vaateTehdas = new BossTehdas();
		jasper.puePaalle(vaateTehdas);
		System.out.println(jasper.toString());
	}

}
