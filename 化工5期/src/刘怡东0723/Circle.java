package Áõâù¶«0723;

public class Circle extends Shap{
	int r;
	public Circle(String name, int r) {
	super(name);
	this.r = r;
}
	@Override
	public double showL() {
		// TODO Auto-generated method stub
		return 6.28*r;
	}

	@Override
	public double showS() {
		// TODO Auto-generated method stub
		return 3.14*r*r;
	}

}
