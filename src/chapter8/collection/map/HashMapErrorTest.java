package chapter8.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * key不能随便变动 
 * Q: 为何不能直接引用A ?
 */

class C{
	int count;
	
	public C(int count){
		this.count = count;
	}
	
	public int hashCode(){
		return count;
	}
	
	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		if(obj!=null && obj.getClass()==C.class){
			C a = (C) obj;
			return a.count == this.count;
		}
		return false;
	}
}

public class HashMapErrorTest {
	public static void main(String[] args){
		Map m = new HashMap();
		m.put(new C(6000), "疯狂Java讲义");
		m.put(new C(57563), "疯狂Cjax讲义");
		System.out.println(m);
		
		Iterator it = m.keySet().iterator();
		C element = (C)it.next();
		element.count = 57563;
		
		System.out.println(m);
		
		m.remove(new C(57563));//未变的旧值可以删除
		System.out.println(m);
		
		System.out.println(m.get(new C(57563)));//存储位置不符
		System.out.println(m.get(new C(6000)));//值不相等
	}

}
