package ������0723;

public class �ӿ�TEST {
public static void main(String[] args) {
	Person a=new smokeStudent("����");
	smokeStudent A=(smokeStudent)a;
	A.smoke();
	Person b=new smokeTeacher("����");
	smokeTeacher B=(smokeTeacher)b;
	B.smoke();
	
	
	Pingpong c=new Pingpongteacher("������");
	c.studyenglish();
	Pingpong d=new Pingpongstudent("����");
	d.studyenglish();
	Basketball e=new Basketballteacher("����");
	
	
	
	Fish f=new Redfishcan("��ѧ¿�еĺ�����");
	Redfishcan F=(Redfishcan)f;
	F.jiao();
	Fish g=new Greenfishcan("��ѧ¿�е�������");
	Greenfishcan G=(Greenfishcan)g;
	G.jiao();
	
}
}
