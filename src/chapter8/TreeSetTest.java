package chapter8;

import java.util.TreeSet;

/**
 * 练习TreeSet八种种方法
 * comparator()获得比较器
 * first() last() lower() higher()
 * headSet tailSet subSet
 */

public class TreeSetTest {
	public static void main(String[] args){
		TreeSet nums = new TreeSet();
		nums.add(2);
		nums.add(-3);
		nums.add(10);
		nums.add(-5);
		System.out.println(nums);
		//最小
		System.out.println((Integer)nums.first());
		//最大
		System.out.println((Integer)nums.last());
		//小于-3
		System.out.println(nums.lower(-3));
		//大于2
		System.out.println(nums.higher(2));
		
		//不包括-3
		System.out.println(nums.headSet(-3));
	    //包括2
		System.out.println(nums.tailSet(2));
		//含首不含尾
		System.out.println(nums.subSet(-5,10));
		
		//比较器 Comparator 自然排序为null
		System.out.println(nums.comparator());
	}
}
