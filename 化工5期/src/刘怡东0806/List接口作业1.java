package ������0806;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List�ӿ���ҵ1 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	List<Emp> l=new ArrayList();
	l.add(new Emp("00", "����","32","20190808"));
	l.add(new Emp("01", "����","33","20190804"));
	l.add(new Emp("02", "����","42","20190828"));
	for(Emp i:l) {System.out.println(i);}
	System.out.println("����");
	String sr=s.next();
	Sreachemp(sr,l);//����
	System.out.println("���");
	while(true) {
	String num=s.next(),name=s.next(),year=s.next(),time=s.next();
	Emp a=new Emp(num,name,year,time);
	ADDemp(a,l);
	if(a.getName().equals("����")) {break;}
	}
	System.out.println("ɾ��");
	String ra =s.next();
	}

public static void Sreachemp(String a,List<Emp> l) {
	for(Emp i:l) {
		if(i.getName().equals(a)) {
			System.out.println(i);
		}
	}
	
}
public static void ADDemp(Emp a,List<Emp> l) {
	l.add(a);
}
public static void DELETEemp(String a,List<Emp> l) {
	for(Emp i:l) {
		if(i.getName().equals(a)) {
			l.remove(i);
		}
	}
}
}