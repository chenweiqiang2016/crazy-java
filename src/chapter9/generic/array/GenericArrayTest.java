package chapter9.generic.array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 泛型和数组的关系
 * 泛型设计原则
 */

public class GenericArrayTest {
	public static void main(String[] args){
		//List<String>[] lsa = new ArrayList<String>[10]; //Cannot create a generic array of ArrayList<String>

		//错, 报了
		//以下代码未报unchecked 但是执行出现ClassCastException 违反泛型设计原则
		List<String>[] lsa = new ArrayList[10];
		
		Object[] oa = lsa;
		
		List<Integer> li = new ArrayList<>();
		
		li.add(new Integer(5));
		
		//lsa[1] = li; //不可以赋值, Type mismatch: cannot convert from List<Integer> to List<String>
		oa[1] = li; //可以赋值
		
		System.out.println(((List<Integer>)oa[1]).get(0)); //正确
		//System.out.println(((List<String>)oa[1]).get(0)); //java.lang.ClassCastException
		
		//++++++++++++++++
		//String s = lsa[1].get(0);
		//++++++++++++++++
		
		
		List<?>[] lsa2 = new ArrayList<?>[10];
		
		Object[] oa2 = lsa2;
		
		List<Integer> li2 = new ArrayList<>();
		
		li2.add(new Integer(15));
		
		oa2[1] = li2;
		
		//System.out.println(((List<String>)oa2[1]).get(0)); //java.lang.Integer cannot be cast to java.lang.String
		
		//+++++++++++++
		//String s2 = (String)(lsa2[1].get(0));
		Object target = lsa2[1].get(0);
		if(target instanceof String){
			String s3 = (String)target;
		}
		//+++++++++++++

	}

	public <T> T[] copyToArray(Collection<T> c){
		//return T[c.size()]; //T cannot be resolved to a variable
		return null; //这个是对的
	}
}
