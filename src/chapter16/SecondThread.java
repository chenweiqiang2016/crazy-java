package chapter16;

//线程类 实现Runnable接口
public class SecondThread implements Runnable {

    private int i;

    @Override
    public void run() {
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "输出" + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 20) {
                SecondThread target = new SecondThread();
                Thread t1 = new Thread(target, "my-thread-1");
                t1.start();
                Thread t2 = new Thread(target, "my-thread-2");
                t2.start();
            }
            System.out.println(Thread.currentThread().getName() + "输出" + i);
        }
    }

}
