package chapter16.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Account {

    private String accountId;
    private double amount;
    private boolean flag;


    private final ReentrantLock reentrantLock = new ReentrantLock();
    private final Condition condition = reentrantLock.newCondition();


    public void draw(double amount) {
        reentrantLock.lock();
        try {
            if (!flag) {
                condition.await();
            } else {
                System.out.println(Thread.currentThread().getName() + "执行取钱，取钱金额：" + amount);
                this.amount -= amount;
                System.out.println(Thread.currentThread().getName() + "取钱之后的余额是：" + this.amount);
                flag = false;
                condition.signalAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
    }

    public void deposit(double amount) {
        reentrantLock.lock();
        try {
            if (flag) {
                condition.await();
            } else {
                System.out.println(Thread.currentThread().getName() + "执行存钱，存钱金额：" + amount);
                this.amount += amount;
                System.out.println(Thread.currentThread().getName() + "存钱之后的余额是：" + this.amount);
                flag = true;
                condition.signalAll();
            }
        } catch (InterruptedException e) {

        } finally {
            reentrantLock.unlock();
        }
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}
