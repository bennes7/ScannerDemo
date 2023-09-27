import java.util.Scanner;

public class ShipCostCalculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the item price
        System.out.print("Enter the price of the item: $");
        double itemPrice = scanner.nextDouble();

        double shippingCost;

        // Check if the item price is $100 or more
        if (itemPrice < 100.0) {
            shippingCost = 0.0; // Shipping is free
        } else {
            shippingCost = 0.02 * itemPrice; // 2% of the item price
        }

        // Calculate the total price
        double totalPrice = itemPrice + shippingCost;

        // Display the shipping cost and total price
        System.out.println("Shipping Cost: $" + shippingCost);
        System.out.println("Total Price: $" + totalPrice);

        scanner.close();
    }
}