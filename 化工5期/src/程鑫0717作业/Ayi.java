package ����0717��ҵ;

public class Ayi {
String name ;
public Ayi(String name) {
	this.name=name;}
int sum=0;
public void dafan(Fantong [] b) {
	for(Fantong st:b) {
		if(st.getXing()=="��") {
			sum+=4;
			System.out.println(st.getName()+"������");}
			else {
		   sum+=2;
		System.out.println(st.getName()+"������");}
		}
	

}}

