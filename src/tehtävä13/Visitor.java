package tehtävä13;

public interface Visitor {

	public int visit(Diligent diligent);
	public int visit(Lazy lazy);
}
