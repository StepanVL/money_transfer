class WithdrawThread extends Thread{
    Account account;
    int amount;

    public WithdrawThread(Account account, int amount){
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 9; i++) {
            account.withdraw(this.amount);
        }
    }
}
