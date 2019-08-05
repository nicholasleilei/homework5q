package 老师0805;

public class 作业04 {

	public static void main(String[] args) {
		/*
		 * 统计一个字符串中小串出现的次数
		 */
		
		String str="你好你java好你好你好java你好你java好你好你好你好java你好你好java你好你好你好java你好你好你好你好你好";
        String xiao ="java";
        int i=str.indexOf(xiao);
        int count=0;
        while(i!=-1) {
        	count++;
        	str=str.substring(i+xiao.length()-1);
        	i=str.indexOf(xiao);
        }
        System.out.println(count);
	}

}
