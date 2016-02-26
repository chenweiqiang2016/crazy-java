package chapter8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate; //test()方法


/*
 * Tip: 关键是calAll参数的定义 传入Predicate对象 等于有了一个匿名方法
 */

//Warning: 这个代码等于没写出来

public class PredicateTest {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("疯狂Java讲义");
		c.add("疯狂Android讲义");
		c.add("疯狂Ajax讲义");
		c.add("我的互联网方法论");
		c.add("轻量级Java EE企业应用实战");
		
		System.out.println(calAll(c, ele -> ((String)ele).contains("Java")));
	}

	public static int calAll(Collection c, Predicate p) {
		int total = 0;
		for (Object obj : c) {
			if (p.test(obj)) {
				total += 1;
			}
		}
		return total;
	}

}
