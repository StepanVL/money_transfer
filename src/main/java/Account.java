class Account{
    private int balance;

    public int getBalance(){      return balance;    }

    public Account(int balance){
        super();
        this.balance = balance;
    }

    synchronized boolean withdraw(int amount){
        int temp = amount;
        try {
            Thread.sleep(1500);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        if(amount>balance) {
            System.out.println("Insufficient funds");
            return false;
        } else {
            balance = balance - temp;
            System.out.println("Your balance:" + balance);
            return true;
        }
    }

    synchronized void deposit(int amount){
        int temp = amount;
        try {
            Thread.sleep(1600);
        } catch (Exception e) {
            e.printStackTrace();
        }
        balance += amount;
        System.out.println("New balance:" + balance);
    }
}



