package chapter16.condition;


public class DrawThread extends Thread{
    private Account account;
    private double amount;

    public DrawThread(String name, Account account, double amount) {
        super(name);
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            account.draw(amount);
        }
    }

}
