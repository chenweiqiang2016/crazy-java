package chapter8;

import java.util.EnumSet;
import java.util.HashSet;

/**
 * 练习EnumSet的各种类方法
 * EnumSet类对应的对象不是使用new生成的
 * 
 * allOf
 * of
 * copyOf //要求元素是同一个枚举类的枚举值
 * complementOf
 */

enum Season{
	SPRING, SUMMER, FALL, WINTER;
}

public class EnumSetTest {
    public static void main(String[] args){
    	EnumSet es1 = EnumSet.allOf(Season.class);
    	System.out.println(es1);
    	
    	EnumSet es2 = EnumSet.of(Season.SPRING, Season.FALL);
    	System.out.println(es2);
    	
    	
    	HashSet hs = new HashSet(); 
    	hs.add(Season.SPRING);
    	hs.add(Season.WINTER);
    	EnumSet es3 = EnumSet.copyOf(hs);
    	System.out.println(es3);
    	
    	EnumSet es4 = EnumSet.complementOf(es3);
    	System.out.println(es4);
    }
}
