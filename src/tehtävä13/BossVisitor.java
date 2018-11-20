package tehtävä13;

public class BossVisitor implements Visitor {

	@Override
	public int visit(Diligent diligent) {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	public int visit(Lazy lazy) {
		// TODO Auto-generated method stub
		return 500;
	}

}
