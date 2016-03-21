package chapter9.erasure;

import java.util.ArrayList;
import java.util.List;

/**
 * List<Integer> --> List --> List<String> 类型擦除和转换
 * get方法会报异常
 */

public class ErasureTest2 {
	public static void main(String[] args){
		List<Integer> iList = new ArrayList<>();
		iList.add(10);
		iList.add(20);
		List list = iList;
		List<String> strList = list; //此处没有问题
		System.out.println(strList.get(0)); // java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
	
		//===============分析上述代码的本质=======================
		
		List<Integer> integerList = new ArrayList<>();
		integerList.add(20);
//		System.out.println((String)integerList.get(0));
	}
}
