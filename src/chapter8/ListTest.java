package chapter8;

import java.util.ArrayList;
import java.util.List;

/**
 * List增加根据索引 增加 删除 重置元素
 * 理解 add的是new String("疯狂Android讲义")新对象 indexOf(new String("疯狂Android讲义"))也是新对象 为什么可以有值？
 * List 只要根据equals()判断相等 那么就认为是相同的元素
 * 
 * remove(index) add(index, element) set(index, element) indexOf lastIndexOf
 * 
 * remove(element) 调用element的equals()方法跟集合中的元素逐个比较
 */

class E{
	public boolean equals(Object obj){
		return true;
	}
}

public class ListTest {
	public static void main(String[] args){
		List books = new ArrayList();
		books.add(new String("轻量级Java EE企业应用实战"));
		books.add(new String("疯狂Java讲义"));
		books.add(new String("疯狂Android讲义"));

		System.out.println("下面测试List增加的依据索引的方法");
		System.out.println("========================================");
		
		System.out.println(books);
		
		books.add(1, "疯狂Ajax讲义"); //根据索引增加
		books.remove(2); //根据索引删除
		System.out.println(books);
		
		System.out.println(books.indexOf(new String("疯狂Android讲义")));//思考这个方法
		
		System.out.println(books.subList(2, 3));
		
		System.out.println(books.set(0, "Spring in Action"));
		System.out.println(books);
		
		System.out.println();
		System.out.println("下面测试List元素相等的原则");
		System.out.println("========================================");
		System.out.println(books);
		System.out.println("删除一个E对象");
		books.remove(new E());
		System.out.println(books);
		System.out.println("再删除一个E对象");
		books.remove(new E());
		System.out.println(books);
	}
}
