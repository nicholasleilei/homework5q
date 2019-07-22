package Áõâù¶«0718;

public class sts {
String name;
String sex;
int age;
public sts(String n,String s,int a) {
	this.age=a;
	this.sex=s;
	this.name=n;
}
public sts(String n,String s) {
	this.name=n;
	this.sex=s;
}
public void showid() {
	System.out.print(name+sex);
}
public void showage() {
	System.out.print(age);
} 
public void showstudy(String a) {
	System.out.println("Ñ§Ï°"+a); 
}
public void showeat() {
	System.out.print("³Ô·¹");
}
public void showsleep() {
	System.out.println("Ë¯¾õ");
}

}
