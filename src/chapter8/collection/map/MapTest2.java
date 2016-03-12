package chapter8.collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * replace方法与put方法的区别
 * merge 给某个key对应的value进行改变
 * computeIfAbsent 添加一个新key
 * computeIfPresent 根据key value生成新的value
 */

public class MapTest2 {
	public static void main(String[] args){
	    Map m = new HashMap();
	    m.put("疯狂Java讲义", 109);
	    m.put("疯狂IOS讲义", 99);
	    m.put("疯狂Ajax讲义", 79);
	    //replace在key不存在的情况下不会增加key-value
	    m.replace("疯狂XML讲义", 66);
	    System.out.println(m);
	    m.merge("疯狂IOS讲义", 10, (old, param) -> (Integer)old + (Integer)param);
	    System.out.println(m);
	    
	    m.computeIfAbsent("Java", key -> ((String)key).length());
	    System.out.println(m);
	    
	    m.computeIfPresent("Java", (key, value) -> (Integer)value * (Integer)value);
	    System.out.println(m);
	    
	}
}
