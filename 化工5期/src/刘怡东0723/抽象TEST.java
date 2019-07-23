package 刘怡东0723;

public class 抽象TEST {
public static void main(String[] args) {
	员工 a=new 经理("张三",1223);
	a.work();System.out.println(a.earn());
	员工 b=new 财会("李四",1234);
	b.work();System.out.println(b.earn());
	System.out.println();
	
	
	Shap p=new Cude("长方形1", 6, 10);
	System.err.println(p.showL()+"  "+p.showS());
	Shap o=new Circle("圆1",5);
	System.out.println(o.showL()+"  "+o.showS());
}
}
