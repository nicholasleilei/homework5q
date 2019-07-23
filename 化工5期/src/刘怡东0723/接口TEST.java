package 刘怡东0723;

public class 接口TEST {
public static void main(String[] args) {
	Person a=new smokeStudent("张三");
	smokeStudent A=(smokeStudent)a;
	A.smoke();
	Person b=new smokeTeacher("李四");
	smokeTeacher B=(smokeTeacher)b;
	B.smoke();
	
	
	Pingpong c=new Pingpongteacher("刘国梁");
	c.studyenglish();
	Pingpong d=new Pingpongstudent("马龙");
	d.studyenglish();
	Basketball e=new Basketballteacher("张三");
	
	
	
	Fish f=new Redfishcan("会学驴叫的红鲤鱼");
	Redfishcan F=(Redfishcan)f;
	F.jiao();
	Fish g=new Greenfishcan("会学驴叫的绿鲤鱼");
	Greenfishcan G=(Greenfishcan)g;
	G.jiao();
	
}
}
