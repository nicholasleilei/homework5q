package ��ʦ0806;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Map�ӿ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new Hashtable<>();

		map.put(9527, "�����Y");
//        map.put(null, 9527);
		map.put(9526, "�ܽ���");
		map.put(9528, "����");
		map.put(9525, "�ܱʳ�");

		System.out.println(map);
		// ���� ��Ψһ ֵ��Ψһ ����ֵ����Ϊ��
		
		Set<Integer> s = map.keySet();//�������м��ļ���
		for(int ss:s) {
			System.out.println(ss+" "+map.get(ss));
		}
		
		System.out.println("=============================");
		
		Collection<String> coll =map.values();//��������ֵ�ļ���
		
		//System.out.println(map.);
		
		System.out.println("================================");
		
		Set<Map.Entry<Integer, String>> set=map.entrySet();//�õ���ֵ�Եļ���set
		for(Map.Entry<Integer, String> me:set) {
			System.out.println(me.getKey()+" " +me.getValue());
		}
		
		System.out.println(map.containsKey(957));//true
		System.out.println(map.containsValue("�ܱʳ�"));//true
		
		System.out.println(map.size());
	}

}
