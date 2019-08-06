package 程鑫0717作业;

public class Ayi {
String name ;
public Ayi(String name) {
	this.name=name;}
int sum=0;
public void dafan(Fantong [] b) {
	for(Fantong st:b) {
		if(st.getXing()=="男") {
			sum+=4;
			System.out.println(st.getName()+"四两饭");}
			else {
		   sum+=2;
		System.out.println(st.getName()+"二两饭");}
		}
	

}}

