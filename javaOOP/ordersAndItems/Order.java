import java.util.ArrayList;
public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items;
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }
    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name){
        this.name = name;
        this.items = new ArrayList<Item>();
    }
    
    // ORDER METHODS
    // Most of your code will go here, 
	// so implement the getters and setters first!
    // GETTERS & SETTERS
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean getReadyStatus() {
        return ready;
    }
    public void setReadyStatus(boolean ready) {
        this.ready = ready;
    }
    public ArrayList<Item> getItemList(){
        return items;
    }
    public void setItemList(ArrayList<Item> items){
        this.items = items;
    }
    public void addItem(Item item){
        this.items.add(item);
    }
    public String getStatusMessage() {
        if (this.ready == true){
            return "Your order is ready!";
        } else {
            return "Thanks you for waiting. Your order will be ready soon.";
        }
    }
    public double getOrderTotal(){
        double sum = 0.00;
        for(Item item : this.items){
            sum += item.getPrice();
        }
        return sum;
    }

    public void displayOrder() {
        System.out.println("Customer Name: " + this.getName());
        for(Item item : this.items){
            System.out.println(item.getName() + " - $" + String.format("%.2f", item.getPrice()));
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }
}