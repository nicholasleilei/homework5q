package 老师0726;

public class StringBuffer类 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s="hello";
          
          s.substring(2);
          s+="world";//s=s+"";concat
          s+=true;
          s+=12.345;
          System.out.println(s);//hello  llo 
          
          StringBuffer sb = new StringBuffer("hello");
          sb.append("world").append(true).append(12.345);
          sb.insert(2, "HELLO");
          System.out.println(sb);
          sb.setCharAt(2, 'Z');
          System.out.println(sb);
          sb.reverse();
          System.out.println(sb);
          sb.delete(1, 3);
          System.out.println(sb);
          sb.deleteCharAt(1);
          System.out.println(sb);
          sb.replace(0, 10, "我爱中国");
          System.out.println(sb);
		/*
		 * 1.使用stringbuffer类中的方法完成下列操作 （1）向stringbuffer的对象中添加不同数据类型的数据 （2）将其按照逆序输出
		 * （3）删除其前五个字符
		 * 
		 * 
		 * 
		 * 2. 使用stringbuffer类中的方法完成判断字符串是否对称
		 */
	}

}
