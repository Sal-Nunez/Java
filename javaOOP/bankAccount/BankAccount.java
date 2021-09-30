import java.util.Random;
public class BankAccount {
    private Double checkingsBalance;
    private Double savingsBalance;
    private String accountNumber;

    Random rand = new Random();
    }
    static int bankAccounts = 0;
    static double totalMoney = 0.0;
    {
        bankAccounts += 1;
    }

    public BankAccount(Double checkingsBalance, Double savingsBalance){
        this.checkingsBalance = checkingsBalance;
        this.savingsBalance = savingsBalance;
        this.accountNumber = makeAccountNumber();
        totalMoney += (checkingsBalance + savingsBalance);
    }
    public BankAccount(){
        this.checkingsBalance = 0.0;
        this.savingsBalance = 0.0;
    public static int getBankAccounts() {
        return bankAccounts;
    }
    public static double getTotalMoney() {
        return totalMoney;
    }
    public double getCheckingsBalance() {
        return checkingsBalance;
    }
    public double getSavingsBalance() {
        return savingsBalance;
    }
    public String getBankAccountNumber() {
        return accountNumber;
    }
    public void depositMoney(boolean intoCheckings, double amount){
        totalMoney += amount;
        if (intoCheckings){
            this.checkingsBalance += amount;
        } else{
            this.savingsBalance += amount;
        }
    }
    public void withdrawMoney(boolean fromCheckings, double amount){
        if (fromCheckings){
            if (amount < this.checkingsBalance){
                this.checkingsBalance -= amount;
                totalMoney -= amount;
            } else {
                System.out.println("Insufficient Funds");
            }
        } else {
            if (amount < this.savingsBalance){
                this.savingsBalance -= amount;
                totalMoney -= amount;
            } else {
                System.out.println("Insufficient Funds");
            }
        }
    }
    public String allMyMoney(){
        return "Total Money: $" + String.format("%.2f", (this.checkingsBalance + this.savingsBalance));
    }
    private String makeAccountNumber(){
        StringBuilder newString = new StringBuilder(10);
        for (int i = 0; i < 10; i++) {
            newString.append(String.format("%1d", (rand.nextInt(9)+1)));
        }
        return newString.toString();
    }
}