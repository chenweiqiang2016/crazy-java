package chapter8.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * Collections工具类
 */

public class SortTest {
	public static void main(String[] args){
		List nums = new ArrayList();
		nums.add(5);
		nums.add(-2);
		nums.add(9);
		nums.add(-5);
		System.out.println(nums);
		
		Collections.reverse(nums);
		System.out.println(nums);
		
		Collections.sort(nums);
		System.out.println(nums);
		
		Collections.shuffle(nums);
		System.out.println(nums);
		
	}

}
