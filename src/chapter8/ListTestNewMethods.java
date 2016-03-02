package chapter8;

import java.util.ArrayList;
import java.util.List;

/**
 * Java8 为List新增的两个方法 sort replaceAll
 * 传入的是函数式接口对象
 * 改变集合本身
 */

public class ListTestNewMethods {
    public static void main(String[] args){
    	List books = new ArrayList();
    	books.add("Java疯狂讲义");
    	books.add("轻量级Java EE企业应用实战");
    	books.add("IOS编程");
    	
    	//参数是一个比较器 函数式接口
    	books.sort((o1, o2) -> ((String)o1).length() - ((String)o2).length());
    	
    	books.forEach(System.out::println);
    	
    	
    	books.replaceAll(ele -> ((String)ele).length());
    	System.out.println(books);
    }
}
