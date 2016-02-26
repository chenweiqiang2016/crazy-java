package chapter8;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 调用集合对象的stream方法
 * TODO:尝试使用中间方法mapToInt转换为IntStream 参数是mapper
 */

public class CollectionStream {
	public static void main(String[] args){
		Collection c = new ArrayList();
		c.add("中国经济双重转型之路");
		c.add("玉米");
		c.add("我的互联网方法论");
		c.add("Java疯狂讲义");
		//Cannot invoke stream() on the primitive type boolean
		//错误写法:System.out.println(c.removeIf(ele -> ((String)ele).length()>10).stream().count());
		System.out.println(c.stream().filter(ele -> ((String)ele).length()>2).count());
		System.out.println(c.stream().filter(ele -> ((String)ele).contains("Java")).count());
	}
}
