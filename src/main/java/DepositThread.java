
class DepositThread extends Thread{
    Account account;
    int amount;

    public DepositThread(Account account, int amount){
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run(){
        for (int i = 0; i < 7; i++) {
            account.deposit(this.amount);
        }
    }
}
