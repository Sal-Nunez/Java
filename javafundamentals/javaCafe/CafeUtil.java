import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CafeUtil {
    public String getStreakGoal(int numWeeks){
        int sum = 0;
        for (int i = 0; i < numWeeks; i++){
            sum += i;
        }
        String answer = String.valueOf(sum);
        return answer;
    }
    public String printPriceChart(String productName, double price, int maxNumber){
        System.out.println(productName);
        for (int i = 1; i < maxNumber + 1; i++){
            System.out.println(i + " - $" + String.format("%.2f",(price * i - ((i-1)*.50))));
        }
        return productName;
    }
    public String getOrderTotal(double[] lineItems){
        double sum = 0.00;
        for (int i = 0; i < lineItems.length; i++){
            sum += lineItems[i];
        }
        return String.format("%.2f", sum);
    }
    public String displayMenu(ArrayList<String> menu, ArrayList<Double> prices){
        for (int i = 0; i < menu.size(); i++){
            System.out.println(i + " " + menu.get(i) + " -- " + String.format("%.2f", prices.get(i)));
        }
        return "Done";
    }
    public String addCustomer(ArrayList<String> customers){
        String userName = System.console().readLine("What is your name? : ");
        return userName;
    }
}