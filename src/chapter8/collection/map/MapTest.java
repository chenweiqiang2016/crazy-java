package chapter8.collection.map;

import java.util.HashMap;
import java.util.Map;

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
	}
}
