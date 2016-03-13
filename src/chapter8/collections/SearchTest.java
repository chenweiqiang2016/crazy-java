package chapter8.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchTest {
	public static void main(String[] args){
		List list = new ArrayList();
		list.add(-5);
		list.add(3);
		list.add(-9);
		list.add(0);
		
		System.out.println(list);
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		System.out.println(Collections.frequency(list, 0));
		
		List list2 = new ArrayList();
		list2.add(3);
		
		System.out.println(Collections.indexOfSubList(list, list2));
		
		Collections.sort(list);
		
		System.out.println(Collections.binarySearch(list, -5));
		
	}

}
