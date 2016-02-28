package chapter8;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {
	public static void main(String[] args){
		LinkedHashSet books = new LinkedHashSet();
		books.add("Java疯狂讲义");
		books.add("轻量级Java EE企业应用实战");
		System.out.println(books);
		
		books.remove("Java疯狂讲义");
		books.add("Java疯狂讲义");
		System.out.println(books);
	}
}