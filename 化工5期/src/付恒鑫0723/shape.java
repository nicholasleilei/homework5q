package ¸¶ºãöÎ0723;

public abstract class shape {
	 int chang;
 int kuan;

	public int getChang() {
		return chang;
	}
	public void setChang(int chang) {
		this.chang = chang;
	}
	public int getKuan() {
		return kuan;
	}
	public void setKuan(int kuan) {
		this.kuan = kuan;
	}
	public shape(int chang, int kuan) {
		super();
		this.chang = chang;
		this.kuan = kuan;
	}
	public shape() {
		super();
		// TODO Auto-generated constructor stub
	}
	public abstract double mianji();
public abstract double zhouchang();
}
