package chapter9.generic.method;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 不使用泛型方法的限制 数组可以使用子类 集合必须严格遵照
 */

public class SimpleCopy {
	static void copyArrayToCollection(Object[] a, Collection<Object> c){
		for(Object o:a){
			c.add(o);
		}
	}
	
//	static void copy(Object[] a, Collection<?> c); //使用通配符是不行的 元素类型不确定 不能进行add

	public static void main(String[] args){
		String[] s = {"chenweiqiang", "chenweiping", "zhengming"};
		Collection<Object> c = new ArrayList<>();
		copyArrayToCollection(s, c);
		System.out.println(c);
	}
}
