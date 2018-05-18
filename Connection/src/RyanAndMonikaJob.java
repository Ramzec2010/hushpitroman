public class RyanAndMonikaJob implements Runnable {

    private BankAccount account = new BankAccount();

    public static void main(String[] args) {
        RyanAndMonikaJob theJob = new RyanAndMonikaJob();
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);
        one.setName("Ryan");
        two.setName("Monika");
        one.start();
        two.start();
    }

    @Override
    public void run() {
        for (int x = 0; x<10; x++) {
            makeWithdrawl (10);
            if(account.getBalance()<0) {
                System.out.println("overdrawn!");
            }
        }
    }

    private synchronized void makeWithdrawl (int amount) {
        if (account.getBalance()>= amount) {
            System.out.println(Thread.currentThread().getName() + " is about to withdraw");
            try {
                System.out.println(Thread.currentThread().getName() + " is going to sleep");
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " woke up");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " complete the withdrawl");
        }
        else {
            System.out.println("Sorry, not enough for " + Thread.currentThread().getName());
        }
    }
}
