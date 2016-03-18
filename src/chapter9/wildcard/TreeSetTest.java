package chapter9.wildcard;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet 比较器的类型形参高于TreeSet类型形参
 * 灵活传入Comparator对象
 */

public class TreeSetTest {
	//通配符和泛型方法
	// void Collection addAll(Collection<? extends E> c)
	//<T> void Collection addAll(Collection<T extends E> c)
	
	// <T> void copy(List<S> dest, List<T extends S> src)
	// void copy(List<S> dest, List<? extends S> src) 错误 未声明S
	
	public static void main(String[] args) {
		TreeSet<String> ts1 = new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String t1, String t2) {
				return t1.length() > t2.length()? 1:
					t1.length() < t2.length()? -1 :0;
			}
		});
		
		ts1.add("Java疯狂讲义");
		ts1.add("IOS疯狂讲义");
		System.out.println(ts1);
		
		
		TreeSet<String> ts2 = new TreeSet<>(new Comparator<Object>(){
			public int compare(Object o1, Object o2){
				return o1.hashCode() > o2.hashCode()?1:
					o1.hashCode() < o2.hashCode()?-1:0;
			}
		});
		
		ts2.add("Java疯狂讲义");
		ts2.add("IOS疯狂讲义");
		System.out.println(ts2);
	}
}
