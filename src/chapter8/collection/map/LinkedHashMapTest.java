package chapter8.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 会记住元素的添加顺序
 */

public class LinkedHashMapTest {

	public static void main(String[] args) {
		Map m = new LinkedHashMap();
		m.put("语文", 100);
		m.put("数学", 92);
		m.put("英语", 95);
		
		m.forEach((k, v) -> System.out.println(k + " -> " + v));
		
	}

}
