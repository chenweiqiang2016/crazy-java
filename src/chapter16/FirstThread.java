package chapter16;

// 线程类 继承 Thread
public class FirstThread extends Thread {

    private int i;

    public void run() {
        for (; i < 100; i++) {
            System.out.println(getName() + "输出" + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 20) {
                FirstThread f1 = new FirstThread();
                f1.start();
                FirstThread f2 = new FirstThread();
                f2.start();
            }
            System.out.println(Thread.currentThread().getName() + "输出" + i);
        }
    }

}
