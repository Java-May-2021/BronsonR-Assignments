public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount client = new BankAccount();

        client.deposit(150.00, 0.00);

        client.displayTotals();
        client.displayAccountNum(); //private variable, will not show string value for account number, but function works
        client.withdrawl(200.00, 0.00);
    }
}
