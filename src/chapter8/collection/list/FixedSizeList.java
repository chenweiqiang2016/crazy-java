package chapter8.collection.list;

import java.util.Arrays;
import java.util.List;

/**
 * 固定长度List 是Arrays$ArrayList内部类
 */
public class FixedSizeList {
	public static void main(String[] args){
		List fixedList = Arrays.asList("Java", "C#"); //传入多个对象 或者数组
		System.out.println(fixedList.getClass()); //输出 class java.util.Arrays$ArrayList
		
		for(int i=0; i<fixedList.size(); i++){
			System.out.println(fixedList.get(i));
		}
		
		//fixedList.add("Spring"); //Exception in thread "main" java.lang.UnsupportedOperationException
	}
}
