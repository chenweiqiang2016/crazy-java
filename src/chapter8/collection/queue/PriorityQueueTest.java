package chapter8.collection.queue;

import java.util.PriorityQueue;

/**
 * PriorityQueue 是 Queue的一个相对标准实现, 并不完全标准, 不满足FIFO
 */
public class PriorityQueueTest {
    public static void main(String[] args){
    	PriorityQueue pq = new PriorityQueue(); //可以订制排序 (o1, o2) -> (((Integer)o2) - ((Integer)o1))
    	pq.offer(1);
    	pq.offer(-3);
    	pq.offer(20);
    	pq.offer(6);
    	System.out.println(pq); //[-3, 1, 20, 6] 没有按序排列 这是toString()方法决定的
    	
    	System.out.println(pq.poll());
    	System.out.println(pq.poll());
    	System.out.println(pq.poll());
    	System.out.println(pq.poll());
    }
}
