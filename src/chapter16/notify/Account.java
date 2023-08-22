package chapter16.notify;

public class Account {

    private String accountId;
    private double amount;

    private boolean flag;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public synchronized void draw(double amount) {
        try {
            if (!flag) {
                wait();
            } else {
                System.out.println(Thread.currentThread().getName() + "执行取钱，取钱金额：" + amount);
                this.amount -= amount;
                System.out.println(Thread.currentThread().getName() + "取钱之后的余额是：" + this.amount);
                flag = false;
                notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public synchronized void deposit(double amount) {
        try {
            if (flag) {
                wait();
            } else {
                System.out.println(Thread.currentThread().getName() + "执行存钱，存钱金额：" + amount);
                this.amount += amount;
                System.out.println(Thread.currentThread().getName() + "存钱之后的余额是：" + this.amount);
                flag = true;
                notifyAll();
            }
        } catch (InterruptedException e) {
        }
    }

}
