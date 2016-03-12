package chapter8.collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * put的用法, 除了添加, 还可以覆盖, 并且返回之前的值
 * containsKey() 和 containsValue()
 * remove(key)删除key-value对
 */

public class MapTest {
	public static void main(String[] args){
		Map m = new HashMap();
		m.put(1, 1);
		m.put(2, 2);
		m.put(3, 3);
		
		System.out.println(m.isEmpty());
		System.out.println(m.entrySet());
		System.out.println(m.containsKey(1));
		System.out.println(m.containsValue(1));
		System.out.println(m.keySet());
		m.clear();
		System.out.println(m.isEmpty());
		
		System.out.println("================================");
		
		Map m2 = new HashMap();
		m2.put("疯狂java讲义", 109);
		m2.put("疯狂IOS讲义", 10);
		m2.put("疯狂Ajax讲义", 79);
		m2.put("轻量级Java EE企业应用实战", 99);
		System.out.println(m2);
		
		System.out.println(m2.put("疯狂IOS讲义", 99));
		System.out.println(m2);
		
		System.out.println("包含[疯狂IOS讲义]的key:" + m2.containsKey("疯狂IOS讲义"));
		System.out.println("包含[99]的value:" + m2.containsValue(99));
		
		for(Object key : m2.keySet()){
			System.out.println(key + "-->" + m2.get(key));
		}
		
		m2.remove("疯狂Ajax讲义");
		System.out.println(m2);
	}
}
