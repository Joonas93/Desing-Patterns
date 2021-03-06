package tehtävä13;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker lazy = new Worker();
		Worker diligent = new Worker();
		diligent.switchStage(); //switch state to diligent
		
		Visitor boss = new BossVisitor();
		
		lazy.accept(boss);
		diligent.accept(boss);
		
		System.out.println(lazy); //Worker [pay=500]
		System.out.println(diligent); //Worker [pay=1000]
		
		
	}

}
