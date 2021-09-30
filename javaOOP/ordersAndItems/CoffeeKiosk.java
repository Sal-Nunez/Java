import java.util.ArrayList;
public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk(){
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }
    static int index = 0;

    public void addMenuItem(String name, double price){
        Item item = new Item(name, price, index);
        System.out.println(index);
        index += 1;
        menu.add(item);
    }

    public void displayMenu(){
        for (Item item : this.menu){
            System.out.println(item.getIndex() + " " + item.getName() + " -- $" + String.format("%.2f", item.getPrice()));
        }
    }
    public void newOrder() {
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    	// Your code:
        // Create a new order with the given input string
        Order order = new Order(name);
        displayMenu();
        // Show the user the menu, so they can choose items to add.
        
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            // Get the item object from the menu, and add the item to the order
            order.addItem(this.menu.get(Integer.parseInt(itemNumber)));
            // Ask them to enter a new item index or q again, and take their input
            displayMenu();
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        // After you have collected their order, print the order details 
    	// as the example below. You may use the order's display method.
        order.displayOrder();
    }
    public void addMenuItemByInput(){
        String password = "root";
        System.out.println("Enter Password:");
        String input = System.console().readLine();
        System.out.println(input + "---" + password);
        if (input.equals("exit")){
            System.out.println("Thanks for coming");
        }
        else if (password.equals(input)){
            System.out.println("Please enter menu item name:");
            String name = System.console().readLine();
            System.out.println("Please enter menu item price:");
            double price = Double.parseDouble(System.console().readLine());
            addMenuItem(name, price);
            System.out.println("Succesfully Added " + name);
            displayMenu();
        } 
        else {
            System.out.println("Wrong Pasword");
        }
    }
}