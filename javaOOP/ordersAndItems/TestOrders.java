import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    // Menu items
    // Order variables -- order1, order2 etc.

    CoffeeKiosk coffeeKiosk = new CoffeeKiosk();
    coffeeKiosk.addMenuItem("Drip Coffee", 1.50);
    coffeeKiosk.addMenuItem("Cappucino", 3.00);
    coffeeKiosk.addMenuItem("Latte", 4.50);
    coffeeKiosk.addMenuItem("Mocha", 3.50);
    coffeeKiosk.addMenuItem("Banana", 2.00);
    coffeeKiosk.addMenuItem("Muffin", 4.00);
    coffeeKiosk.displayMenu();
    // coffeeKiosk.newOrder();
    coffeeKiosk.addMenuItemByInput();
    // Order order1 = new Order("Cindhuri");
    // order1.addItem(item1);
    // order1.addItem(item1);
    // order1.displayOrder();
    // System.out.println(order1.getStatusMessage());
    // System.out.println(order1.getReadyStatus());
    // // System.out.println(order1.getItemList());
    // // System.out.println("Your Total is: $" + String.format("%.2f", order1.getOrderTotal()));
    // Order order2 = new Order("Jimmy");
    // order2.addItem(item2);
    // order2.addItem(item4);
    // order2.setReadyStatus(true);
    // System.out.println(order2.getStatusMessage());
    // System.out.println(order2.getReadyStatus());
    // Order order3 = new Order("Noah");
    // order3.addItem(item3);
    // order3.addItem(item2);
    // order3.setReadyStatus(true);
    // System.out.println(order3.getStatusMessage());
    // System.out.println(order3.getReadyStatus());

    // Order order4 = new Order("Sam");
    // order1.addItem(item1);
    // order1.addItem(item4);
    // System.out.println(order4.getStatusMessage());
    // System.out.println(order4.getReadyStatus());

    // // Application Simulations
    // // ----------------------------------------------------------------
    // order2.items.add(item1);
    // order3.items.add(item2);
    // order4.items.add(item3);
    // order4.items.add(item3);
    // order4.items.add(item3);
    // // Use this example code to test various orders' updates
    
    // // System.out.printf("Name: %s\n", order1.name);
    // // System.out.printf("Total: %s\n", order1.total);
    // // System.out.printf("Ready: %s\n", order1.ready);
    // System.out.println(order1.items);
    // System.out.println(order2.items);
    // System.out.println(order3.items);
    // System.out.println(order4.items);
    // Item item1 = new Item("Drip Coffee", 1.50);
    // Item item2 = new Item("Cappucino", 3.50);
    // Item item3 = new Item("Latte", 4.50);
    // Item item4 = new Item("Mocha", 3.50);
    }
}
