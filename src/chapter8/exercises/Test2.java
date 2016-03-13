package chapter8.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建List对象 添加10个元素 进行访问
 */

public class Test2 {
	public static void main(String[] args){
		List list = new ArrayList();
		list.add("疯狂Java讲义");
		list.add("疯狂IOS讲义");
		list.add("疯狂Ajax讲义");
		list.add("轻量级Java EE企业应用实战");
		list.add("Spring in action");
		//获取元素
		System.out.println(list.get(4));
		//获取索引
		System.out.println(list.indexOf("疯狂Java讲义"));
		System.out.println(list.indexOf("疯狂IOS讲义"));
        //删除元素
		System.out.println(list.remove(0));
		System.out.println(list);
	}
}
