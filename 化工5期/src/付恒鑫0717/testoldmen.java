package ������0717;

public class testoldmen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
oldman o=new oldman("����", "��", 70);
oldman o1=new oldman("����", "Ů", 60);
oldman o2=new oldman("����", "��", 68);
oldman o3=new oldman("����", "Ů", 75);

oldman[] old= {o,o1,o2,o3};
o.check(old);


olidmanfamily f=new olidmanfamily();
int sum=f.comein(old);
System.out.println("���ɷ�"+sum);
	}

}
