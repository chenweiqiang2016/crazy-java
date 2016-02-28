package chapter8;

import java.util.TreeSet;
import java.util.Date;

/**
 * 测试结果是这样的: 添加一个没有实现Comparable接口的对象就失败了 跟书上要添加第二个才失败不符
 */

/*
 * Tip1: 很多类实现了Comparable接口
 * BigDecimal BigInteger 数值型的包装类
 * boolean对应的包装类 false < true
 * Character String Date
 */

class Error{}

public class TreeSetErrorTest {
	public static void main(String[] args){
		TreeSet ts = new TreeSet();
		//Error 1
		//ts.add(new Error()); //java.lang.ClassCastException: chapter8.Error cannot be cast to java.lang.Comparable
	
		//Error 2
		ts.add("Java 疯狂讲义");
		ts.add(new Date()); //java.lang.ClassCastException: java.lang.String cannot be cast to java.util.Date
	} 
}
