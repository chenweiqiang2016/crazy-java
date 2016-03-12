package chapter8.collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap和Hashtable在key和value问题上的判断是一致的
 * 注意key相同的判断方式和value相同的判断方式
 */

class A{
	int count;
	
	public A(int count){
		this.count = count;
	}
	
	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		if(obj!=null && obj.getClass()==A.class){
			A a = (A)obj;
			return a.count == this.count;
		}
		return false;
	}
	
	public int hashCode(){
		return count;
	}
}

class B{
	public boolean equals(Object obj){
		return true;
	}
}


public class HashtableTest {

	public static void main(String[] args) {
        Map m = new HashMap();
        m.put(new A(6000), "疯狂Java讲义");
        m.put(new A(87563), "轻量级Java EE企业应用实战");
        //m.put(new A(1232), new B());
        System.out.println(m);
        //value的判断原则
        System.out.println(m.containsValue(new B())); //"测试字符串")); //与书上的情形并不吻合
        //key的判断原则
        System.out.println(m.containsKey(new A(87563)));
        System.out.println(m.remove(new A(1232)));
        System.out.println(m);
	}
}
