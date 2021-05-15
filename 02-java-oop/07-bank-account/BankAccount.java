import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;


public class BankAccount {
    private static String accountNum;
    private  double checking = 0;
    private double savings = 0;
    public static int activeAccounts = 0;
    public static double totalChecking = 0;

    public BankAccount(){
        this.accountNum = this.acntNumGen("New Account");
        activeAccounts ++;
    }

    public void displayAccountNum(){     //just to check that the incrementation of the activeAccount variable is working
        System.out.println(activeAccounts);
    }

    public void getAccount(){
        System.out.println("For testing purposes...:  " + accountNum);
    }


    public void deposit(double checking, double savings){
        this.checking += checking;
        this.savings +=  savings;
        totalChecking += checking;    //for adding the totalChecking together, added incrementer to the deposit method
        System.out.println("New Balance is: " + this.checking);
        System.out.println("New Balance is: " + this.savings);
    }

    public void getBalances(){
        System.out.println("Your current Checking funds: " + this.checking);
        System.out.println("Your current Savings funds:  " + this.savings);
    }

    public void withdrawl(double checking, double savings){
        if ((this.checking - checking) >= 0){
            this.checking -= checking;
            totalChecking -= checking;
            System.out.println("Balance after transaction: " + this.checking);
        } else {
            System.out.println("We're sorry, you do not have enough funds for this transaction.");
        }

        if ((this.savings - savings) >= 0){
            this.savings -= savings;
            System.out.println("Balance after transaction: " + this.savings);
        } else {
            System.out.println("We're sorry, you do not have enough funds for this transaction.");
        }
    }

    private static String acntNumGen(String account){
        ArrayList<Integer> baNum = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            baNum.add(i);
        }
        Collections.shuffle(baNum);
        account = Arrays.toString(baNum.toArray());
        accountNum = account;
        return account;
    }

    public void displayTotals(){
        System.out.println("There is " + totalChecking + " in total checking accounts.");
        System.out.println("There are " + activeAccounts + " accounts that make this amount.");
    }


}