package ��ʦ0717;

public class Rect {
    private int c;
    int  k;
    public int getC() {
    	return c;
    }
	/*
	 * public void setC(int c) { this.c=c; }
	 */
    
    public Rect(int c,int k) {
    	this.c=c;
    	this.k=k;
    }
    public void getZhouChang() {
    	System.out.println("�ܳ���:"+(c+k)*2);
    }
    public void getMianJi() {
    	System.out.println("�����:"+(c*k));
    }
}
