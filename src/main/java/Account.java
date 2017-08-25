/**
 * Created by ruken on 8/12/17.
 */
public class Account {

    private double balance = 0.0;
    public Account (){

    }

    public double deposit(double depositAmt){
        balance = balance + depositAmt;
        return balance;
    }

    public double withdraw(double withdrawAmt){
        balance = balance - withdrawAmt;
        return balance;
    }

    public double getBalance(){
        return balance;
    }

    public static void main (String[] args){

        Account accountObject = new Account();

        try {
            Withdraw withdrawThread = new Withdraw(accountObject);
            Deposit depositThread = new Deposit(accountObject);

            withdrawThread.start();

            depositThread.start();
        } catch (Throwable t){

        }

        while (true){
            try {
                System.out.println(accountObject.getBalance());
                Thread.currentThread().sleep(2000);
            }catch(Throwable t){

            }
        }
    }
}
