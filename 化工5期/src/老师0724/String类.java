package ��ʦ0724;

public class String�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s="aa,bb,cc";
          String ss = new String("324324");
          
          System.out.println(s.length());
          System.out.println(s.indexOf("l"));//�� --- �±�
          System.out.println(s.lastIndexOf("i"));
          System.out.println(s.charAt(1));//�±�---��
          System.out.println(s.concat("world"));
          System.out.println(s+"world");
          System.out.println(s.equalsIgnoreCase("HELLO"));
          System.out.println(s.compareTo("a"));//�Ƚ��ַ��������ֵ�˳�򣩷��ز�
          System.out.println(s.startsWith("a"));
          System.out.println(s.endsWith("a"));
          System.out.println(s.substring(2));
          System.out.println(s.substring(2, 4));//[n,m)
          System.out.println(s.replace('l', 'H'));
          System.out.println(s.trim());
          System.out.println(s.toLowerCase());
          System.out.println(s.toUpperCase());
          
          char[] chas =s.toCharArray();
          for(char c:chas) {
        	  System.out.println(c);
          }
          
          String[] strs =s.split(",");
          for(String sr:strs) {
        	  System.out.println(sr);
          }
	}

}
