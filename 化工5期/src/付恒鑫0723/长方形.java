package 付恒鑫0723;

public abstract class 长方形 extends shape{
public 长方形 (int chang,int kuan) {
	super(chang, kuan);
}
	@Override
	public double mianji() {
		return chang*kuan;
	}
	@Override
	public double zhouchang() {
		return (chang+kuan)*2;
	}
}
