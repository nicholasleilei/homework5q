package ������0723;

public abstract class ������ extends shape{
public ������ (int chang,int kuan) {
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
