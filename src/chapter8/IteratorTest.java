package chapter8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Tip1: it.next()后进行类型转换 (String)
 * Tip2: 字符串==和equals()
 */

/**
 * 调用集合对象的iterator()方法得到Iterator对象
 * 使用迭代器的四个方法hasNext next remove forEachRemaining
 * 在迭代过程中不能调用集合的remove方法 否则抛出java.util.ConcurrentModificationException异常
 */

public class IteratorTest {
	public static void main(String[] args){
		Collection c = new ArrayList();
		c.add("疯狂java讲义");
		c.add("疯狂ajax讲义");
		c.add("Java EE企业应用实战");
		c.add("HTML CSS JavaScript");
		System.out.println("迭代前的集合:" + c);
		//迭代器必须依赖于集合
		Iterator it = c.iterator();
		while(it.hasNext()){
			Object obj = it.next(); //没有使用泛型的时候 集合元素的类型都是Object
			if(obj=="Java EE企业应用实战"){
				it.remove();
			}
		}
		System.out.println("迭代后的集合:" + c);
		
		//使用新增的方法进行一次遍历集合元素
		Iterator it2 = c.iterator();
		System.out.println("使用Java8新增forEachRemaining方法和lambda表达式遍历元素:");
		it2.forEachRemaining(ele -> System.out.println(ele));
		
		//迭代过程中不可以使用colection的remove方法
		//否则引发java.util.ConcurrentModificationException
		Iterator it3 = c.iterator();
		while(it3.hasNext()){
			Object obj = it3.next();
			if(obj=="HTML CSS JavaScript"){
				c.remove("HTML CSS JavaScript");
			}
		}

	}
}
