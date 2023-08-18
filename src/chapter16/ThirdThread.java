package chapter16;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

// 线程类 实现Callable接口
public class ThirdThread {

    public static void main(String[] args) throws Exception {
        Callable<Integer> callable = () -> {
            int i = 0;
            for (; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "输出" + i);
            }
            return i;
        };
        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        for (int i = 0; i < 100; i++) {
            if (i == 20) {
                Thread thread = new Thread(futureTask, "自定义线程");
                thread.start();
                System.out.println(Thread.currentThread().getName() + "得到返回结果" + futureTask.get());
            }
            System.out.println(Thread.currentThread().getName() + "输出" + i);
        }
    }

}
