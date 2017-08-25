/**
 * Created by ruken on 8/12/17.
 */
public class Deposit extends Thread {

    Account account; //instance variable for Account class
    double amount = 1000;

    public Deposit (Account acct1){

        account = acct1; //gives a reference to Account in order to call Deposit

    }

    public void run() {

        while(true) {
            try {
                System.out.println("Deposit: " + amount);
                Thread.currentThread().sleep(1000);
                account.deposit(amount);
            } catch (Throwable t) {

            }
        }
    }
}
