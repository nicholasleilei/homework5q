package 老师0717;

public class TestOldMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        OldMan o1 = new OldMan("张三",70,"男");
        OldMan o2 = new OldMan("李四",60,"女");
        OldMan o3 = new OldMan("王五",68,"男");
        OldMan o4 = new OldMan("赵六",75,"女");
        OldMan[] oms = {o1,o2,o3,o4};
        
         Family f = new Family();
         System.out.println("共缴费："+f.comein(oms));
       
	}

}
