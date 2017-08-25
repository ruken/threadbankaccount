/**
 * Created by ruken on 8/12/17.
 */
public class Withdraw extends Thread {

    Account account; //instance variable for Account class
    double amount = 500;

    public Withdraw (Account acct1){

        account = acct1; //gives a reference to Account in order to call Deposit

    }

    public void run(){
        while(true) {

            try {
                System.out.println("Withdrawing: " + amount);
                Thread.currentThread().sleep(1000);
                account.withdraw(amount);
            } catch (Throwable t) {

            }

        }
    }
}


