public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0, 250.0);
        BankAccount account1 = new BankAccount(225.0, 250.0);
        System.out.println("Total number of Accounts: " + account.getBankAccounts());
        System.out.println("Total Money: $" + String.format("%.2f", account1.getTotalMoney()));
        System.out.println("Checkings Balance: $" + String.format("%.2f", account1.getCheckingsBalance()));
        System.out.println("Savings Balance: $" + String.format("%.2f", account1.getSavingsBalance()));

        account1.depositMoney(true, 150.00);

        System.out.println("Checkings Balance: $" + String.format("%.2f", account1.getCheckingsBalance()));
        System.out.println("Savings Balance: $" + String.format("%.2f", account1.getSavingsBalance()));
        System.out.println("Total Money: $" + String.format("%.2f", account1.getTotalMoney()));
        System.out.println(account1.getBankAccountNumber());
    }
}