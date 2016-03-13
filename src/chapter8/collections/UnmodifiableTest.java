package chapter8.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 不可变的集合对象 emptyXXX返回类型是Collection
 */

public class UnmodifiableTest {
	public static void main(String[] args){
		
	Collection l = Collections.emptyList();
	
	Set s = Collections.singleton("疯狂Java讲义");
	
	Map m = new HashMap();
	m.put("语文", 88);
	m.put("数学", 90);
	
	Map unm = Collections.unmodifiableMap(m);
	
	//list.add(123); //java.lang.UnsupportedOperationException
	//s.add("AIMS");
	//unm.remove("语文");
}

}
