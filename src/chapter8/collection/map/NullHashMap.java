package chapter8.collection.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * HashMap允许使用一个null作为key, 任意多个null作为value
 * Hashtable不允许
 */

public class NullHashMap {

	public static void main(String[] args) {
		Map m = new HashMap();
		
		m.put(null, null);
		m.put(null, null);
		m.put(1, null);
		
		System.out.println(m);

	}

}
