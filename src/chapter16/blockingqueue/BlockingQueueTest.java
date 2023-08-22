package chapter16.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(2);
        blockingQueue.add("java");
        blockingQueue.add("python");
        // blockingQueue.add("c"); //抛出异常
        // System.out.println(blockingQueue.offer("c")); //返回false
        blockingQueue.put("c");
    }
}
