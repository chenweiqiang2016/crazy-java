package chapter8.collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
 * 传入参数是一个集合对象
 * Q: Collections.synchronizedList()会报错
 */

public class SynchronizedTest {
	public static void main(String[] args){
	    Collection c = Collections.synchronizedCollection(new ArrayList());	
	    //List list = Collections.synchronizedList(new ArrayList());
	    Map m = Collections.synchronizedMap(new HashMap());
	
	    Set s = Collections.synchronizedSet(new HashSet());
	    
	}
}
