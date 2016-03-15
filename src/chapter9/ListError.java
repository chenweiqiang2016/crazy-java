package chapter9;

import java.util.ArrayList;
import java.util.List;

public class ListError{
	public static void main(String[] args){
		List l = new ArrayList();
		l.add("疯狂Java讲义");
		l.add("疯狂Ajax讲义");
		l.add(2);
		l.forEach(ele -> System.out.println(((String) ele).length())); //java.lang.ClassCastException
	}
}
