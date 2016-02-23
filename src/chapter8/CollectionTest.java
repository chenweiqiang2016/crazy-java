package chapter8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 练习Collection集合的基本方法
 * add
 * addAll
 * clear
 * contains
 * containsAll
 * isEmpty
 * iterator
 * remove
 * removeAll
 * retainAll
 * size
 * Object[] toArray()
 */

public class CollectionTest{
	public static void main(String[] args){
		Collection c = new ArrayList();
		c.add("孙悟空");
		//Collection容器内只可以盛装对象 Java支持自动装箱
		c.add(6); 
		System.out.println("元素个数是: " + c.size());
		System.out.println("集合是否包含元素\"孙悟空\": " + c.contains("孙悟空"));
		c.remove(6);
		System.out.println("删除一个元素后, 元素个数是: " + c.size());
		c.add("Java EE企业应用实战");
		System.out.println(c);
		Collection books = new HashSet();
		books.add("疯狂Java讲义");
		books.add("Java EE企业应用实战");
		c.removeAll(books);
		System.out.println("c集合减去books集合后: " + c);
		c.retainAll(books);
		System.out.println("两个集合取交集后: " + c);
		
		//Java 8新特性
		//forEach来自Collection的父接口
		//参数Consumer action 借助lambda表达式来处理每一个元素
		books.forEach(ele -> System.out.println("元素为: " + ele));
	}
}