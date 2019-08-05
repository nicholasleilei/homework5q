package 老师0805;

public class 作业05 {

	public static void main(String[] args) {
		/*
		 * 输入一个字符串，如果含有非数字给出提示，如果是纯数字则转换成double类型
		 */
		String str ="sdklskdla2131";
		boolean  f = true;
         for(int i=0;i<str.length();i++) {
        	 if(Character.isDigit(str.charAt(i))) {
        		 System.out.println(Double.parseDouble(str.charAt(i)+""));
        	 }else {
        		f=false;
        	 }
        		 
         }
         if(!f)
        	 System.out.println("含有非数字");
	}

}
