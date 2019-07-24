package Áõâù¶«0723;

public class Cude extends Shap{
	private int a,b;

	public Cude(String name, int a, int b) {
		super(name);
		this.a = a;
		this.b = b;
	}
	@Override
	public double showL() {
		// TODO Auto-generated method stub
		return (a+b)*2;
	}

	@Override
	public double showS() {
		// TODO Auto-generated method stub
		return a*b;
	}

}
