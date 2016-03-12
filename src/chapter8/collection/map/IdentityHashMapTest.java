package chapter8.collection.map;

import java.util.IdentityHashMap;

/**
 * 要求key严格相等 ==
 */
public class IdentityHashMapTest {
	public static void main(String[] args){
		IdentityHashMap ihm = new IdentityHashMap();
		//两个key-value 全部添加成功
		ihm.put(new String("Java"), 86);
		ihm.put(new String("Java"), 90);
		//两个key-value 添加成功一个
		ihm.put("Java", 94);
		ihm.put("Java", 95);
		
		System.out.println(ihm);
	}

}
