package chapter8.collection.map;

import java.util.WeakHashMap;

/**
 * 弱引用 垃圾回收 自动删除key-value
 */

public class WeakHashMapTest {
	public static void main(String[] args){
		WeakHashMap whm = new WeakHashMap();
		whm.put(new String("疯狂Java讲义"), 90);
		whm.put(new String("疯狂IOS讲义"), 100);
		
		whm.put("Java", 20);
		System.out.println(whm);
		
		System.gc();
		System.runFinalization();
		
		System.out.println(whm);
	}
}
