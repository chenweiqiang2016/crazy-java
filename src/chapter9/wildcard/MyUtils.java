package chapter9.wildcard;

import java.util.ArrayList;
import java.util.Collection;

public class MyUtils {
	public static <T> T copy(Collection<? super T> dest, Collection<T> src){
		T last=null;
		for(T t:src){
			dest.add(t);
			last=t;
		}
		return last;
	}
	public static void main(String[] args){
		Collection<Number> n = new ArrayList<>();
		Collection<Integer> i = new ArrayList<>();
		i.add(1);
		i.add(3);
		i.add(5);
		Integer last = copy(n, i);
		System.out.println(last);
	}
}
