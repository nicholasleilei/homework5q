package ��ʦ0726;

public class StringBuffer�� {

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
          sb.replace(0, 10, "�Ұ��й�");
          System.out.println(sb);
		/*
		 * 1.ʹ��stringbuffer���еķ���������в��� ��1����stringbuffer�Ķ�������Ӳ�ͬ�������͵����� ��2�����䰴���������
		 * ��3��ɾ����ǰ����ַ�
		 * 
		 * 
		 * 
		 * 2. ʹ��stringbuffer���еķ�������ж��ַ����Ƿ�Գ�
		 */
	}

}
