package 老师0806;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Map接口 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new Hashtable<>();

		map.put(9527, "周星馳");
//        map.put(null, 9527);
		map.put(9526, "周杰伦");
		map.put(9528, "周润发");
		map.put(9525, "周笔畅");

		System.out.println(map);
		// 无序 键唯一 值不唯一 键和值允许为空
		
		Set<Integer> s = map.keySet();//返回所有键的集合
		for(int ss:s) {
			System.out.println(ss+" "+map.get(ss));
		}
		
		System.out.println("=============================");
		
		Collection<String> coll =map.values();//返回所有值的集合
		
		//System.out.println(map.);
		
		System.out.println("================================");
		
		Set<Map.Entry<Integer, String>> set=map.entrySet();//得到键值对的集合set
		for(Map.Entry<Integer, String> me:set) {
			System.out.println(me.getKey()+" " +me.getValue());
		}
		
		System.out.println(map.containsKey(957));//true
		System.out.println(map.containsValue("周笔畅"));//true
		
		System.out.println(map.size());
	}

}
