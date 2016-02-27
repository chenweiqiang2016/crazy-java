package chapter8;

import java.util.Collection;
import java.util.HashSet;

/**
 * 测试HashSet对象元素的equals()和hashCode()方法
 * 规范来讲: 如果两个对象equals()返回true那么hashCode()值也应该相等
 */
class A{
	public boolean equals(Object obj){ //hashCode()不相等存储在不同位置
		return true;
	}
}

class B{
	public int hashCode(){ //equals()返回为false 同一位置存储了两个对象
		return 1;
	}
}

class C{
	public boolean equals(Object obj){
		return true;
	}
	public int hashCode(){
		return 2;
	}
}

public class HashSetTest {
	public static void main(String[] args){
		Collection c = new HashSet();
		c.add(new A());
		c.add(new A());
		c.add(new B());
		c.add(new B());
		c.add(new C());
		c.add(new C());
		System.out.println(c);
	}
}