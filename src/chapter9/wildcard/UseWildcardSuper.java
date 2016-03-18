package chapter9.wildcard;

import java.util.Comparator;
import java.util.TreeSet;

public class UseWildcardSuper {
	public static void main(String[] args) {
		TreeSet<String> ts1 = new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String t1, String t2) {
				return -1;
			}
		});
		
		ts1.add("Java疯狂讲义");
		ts1.add("IOS疯狂讲义");
		System.out.println(ts1);

	}
}
