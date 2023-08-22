package chapter16.condition;

public class ConditionTest {
    public static void main(String[] args) {
        Account account = new Account();
        Thread t1 = new DepositThread("存钱线程1", account, 800);
        Thread t2 = new DepositThread("存钱线程2", account, 800);
        Thread t3 = new DepositThread("存钱线程3", account, 800);
        Thread t4 = new DrawThread("取钱线程1", account, 800);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
