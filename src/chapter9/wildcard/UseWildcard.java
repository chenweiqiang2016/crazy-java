package chapter9.wildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * List<String> 并非 List<Object>的子类
 * 
 * 通配符？可以应用于静态方法中
 * 传入错误的参数直接报编译错误的提示
 */

public class UseWildcard {
	public void test(List l){
		for(int i=0; i<l.size(); i++){
			Object item = l.get(i);
		}
	}
	
	public static void test_better(List<Object> l){
		for(int i=0; i<l.size(); i++){
			Object item = l.get(i);
		}
	}
	
	public static void test_best(List<?> l){ 
		for(int i=0; i<l.size(); i++){
			System.out.println(l.get(i));
		}
	}
	public static void main(String[] args){
		List<String> strList = new ArrayList<>();
		strList.add("abc");
		strList.add("def");
		strList.add("opq");

		//test_better(strList);
		
		test_best(strList);
	}
}
