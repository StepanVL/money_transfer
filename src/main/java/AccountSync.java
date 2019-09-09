
public class AccountSync{
    public static void main(String[] args){
        Account account = new Account(5000);
        WithdrawThread wt = new WithdrawThread(account,1000);
        DepositThread dt = new DepositThread(account,1000);
        wt.start();
        dt.start();
        try  {
            wt.join();
            dt.join();
        } catch(Exception e){
            System.out.println("Error: "+ e);
        }
        System.out.println("Your account balance = " + account.getBalance() );
    }

}
