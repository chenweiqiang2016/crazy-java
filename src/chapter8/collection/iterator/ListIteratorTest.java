package chapter8.collection.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * 练习ListIterator
 * 反向迭代
 */

public class ListIteratorTest {
	public static void main(String[] args){
		String[] books = {"JAVA", "C#", "Spring", "JDBC"};
		List bookList = new ArrayList();
		for(int i=0; i<books.length; i++){
			bookList.add(books[i]);
		}
		
		ListIterator lit = bookList.listIterator();
		while(lit.hasNext()){
			System.out.println(lit.next());
			lit.add("分割线--------");
		}
		
		System.out.println("下面开始反向迭代...");
		
		while(lit.hasPrevious()){
			System.out.println(lit.previous());
		}
	}
}
