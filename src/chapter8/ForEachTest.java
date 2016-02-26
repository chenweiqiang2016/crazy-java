package chapter8;

import java.util.Collection;
import java.util.HashSet;

public class ForEachTest {
	public static void main(String[] args){
		Collection c = new HashSet();
		c.add("java疯狂讲义");
		c.add("Spring In Action");
		c.add("疯狂ajax讲义"); //疯 和 a 都各算一个长度
		//foreach循环
		for(Object item:c){
			System.out.println("集合元素: " + item);
		}
		//Java8新增 参数Predicate filter
		c.removeIf(ele -> ((String)ele).contains("Spring")); // 关键一步:((String)ele)
		System.out.println(c);
	}

}
