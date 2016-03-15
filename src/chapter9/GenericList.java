package chapter9;

import java.util.ArrayList;
import java.util.List;

/**
 * 程序更加:
 * 1. 健壮
 * 2. 简洁
 */

public class GenericList {
	public static void main(String[] args){
		List<String> strList = new ArrayList<String>();
		strList.add("疯狂Java讲义");
		strList.add("疯狂Ajax讲义");
		//strList.add(8); 编译时进行类型检查
		strList.forEach(ele -> System.out.println(ele));
	}
}
