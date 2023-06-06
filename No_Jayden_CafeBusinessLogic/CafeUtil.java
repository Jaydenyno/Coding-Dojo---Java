import java.util.ArrayList;
import java.util.Arrays;
public class CafeUtil {

    public int getStreakGoal() {
        int sum = 0;
        for (int x = 0; x <= 10; x++) {
            sum += x;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double sum = 0;
        for (int x = 0; x < prices.length; x++) {
            sum += prices[x];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int x = 0; x < menuItems.size(); x++) {
            String name = menuItems.get(x);
            System.out.println(x + " " + name);
        }
    }
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        int numCustomers = customers.size();
        System.out.println("There are " + numCustomers + " people ahead of you.");
        customers.add(userName);
        System.out.println(customers);
    }
}