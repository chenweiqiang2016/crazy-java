package chapter9.generic.method;

import java.util.ArrayList;
import java.util.Collection;

public class RightTest {
	static <T> void copy(Collection<? extends T> a, Collection<T> b){
		
	}
	
	public static void main(String[] args){
		Collection<String> cs = new ArrayList<>();
		Collection<Object> co = new ArrayList<>();
		copy(cs,co);
	}
}
