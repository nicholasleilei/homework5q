package 老师0710;

public class 方法 {
	//首字母小写 从第二个字母开始首字母大写
    public static  void doSum(int c,int d) {//占位 ，，形参
    	System.out.println(d+c);
    }
	public static void main(String[] a) {
		// TODO Auto-generated method stub
      doSum(3,6);//实参    //直接调用
      
      System.out.println(doAdd(4, 5));//输出调用
      
      int sum =doAdd(6, 2);//赋值调用
      System.out.println(sum+10);
	}
	
	public static int doAdd(int a,int b) {
		return a+b;
	}
	

}
