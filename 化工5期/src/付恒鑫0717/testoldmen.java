package 付恒鑫0717;

public class testoldmen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
oldman o=new oldman("张三", "男", 70);
oldman o1=new oldman("李四", "女", 60);
oldman o2=new oldman("王五", "男", 68);
oldman o3=new oldman("赵六", "女", 75);

oldman[] old= {o,o1,o2,o3};
o.check(old);


olidmanfamily f=new olidmanfamily();
int sum=f.comein(old);
System.out.println("共缴费"+sum);
	}

}
