package chapter16.condition;



public class DepositThread extends Thread {
    private Account account;
    private double amount;

    public DepositThread(String name, Account account, double amount) {
        super(name);
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            account.deposit(amount);
        }
    }
}
