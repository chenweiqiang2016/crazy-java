package chapter8.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrrayDequeTest {
	
	public static void main(String[] args){
		Deque pq = new ArrayDeque();
		System.out.println("演示Deque接口特有的方法");
		//增加元素
		pq.addFirst("cwq1");
		pq.addLast("cwq2");
		pq.offerFirst("cwq3");
		pq.offerLast("pq4");
		System.out.println(pq);
		//获取元素
		System.out.println("获取第一个元素: " + pq.getFirst());
		System.out.println("获取最后一个元素: " + pq.peekLast());
		//删除元素
		System.out.println("删除第一个元素: " + pq.removeFirst());
		System.out.println("删除最后一个元素: " + pq.pollLast());
		System.out.println(pq);
		//栈方法
		System.out.println(pq.pop());
		pq.push("New cwq");
		System.out.println(pq);
		
		//下面开始测Deque用作栈
		Deque dq = new ArrayDeque();
		dq.push(1);
		dq.push(2);
		dq.push(3);
		System.out.println(dq.pop());
		System.out.println(dq.pop());
		System.out.println(dq.pop());
		//System.out.println(dq.pop()); //java.util.NoSuchElementException
	}

}
