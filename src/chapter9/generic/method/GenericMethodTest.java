package chapter9.generic.method;

import java.util.ArrayList;
import java.util.Collection;

public class GenericMethodTest {
	static <T> void copyArrayToCollection(T[] a, Collection<T> c) {
		for (T t : a) {
			c.add(t);
		}
	}

	public static void main(String[] args) {
		Object[] ao = new Object[5];
		Collection<Object> co = new ArrayList<>();
		copyArrayToCollection(ao, co); // T为Object
		String[] as = new String[5];
		Collection<String> cs = new ArrayList<>();
		copyArrayToCollection(as, cs); // T为String
		Number[] an = new Number[5];
		Integer[] ai = new Integer[5];
		Float[] af = new Float[5];
		Collection<Number> cn = new ArrayList<>();
		copyArrayToCollection(an,cn); //T为Number类型
		copyArrayToCollection(ai,cn);
		copyArrayToCollection(af,cn);
		//错误代码
		//copyArrayToCollection(ao, cs);
	}
}
