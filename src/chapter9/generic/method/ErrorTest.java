package chapter9.generic.method;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 编译出错 无法识别出类型形参的实际类型
 */

public class ErrorTest {
	static <T> void copy(Collection<T> a, Collection<T> b){
		for(T t : a){
			b.add(t);
		}
	}
	public static void main(String[] args){
		Collection<String> as = new ArrayList<>();
		Collection<Object> ao = new ArrayList<>();
//		copy(as, ao);
	}
}
