import java.util.Scanner;
public class FuelCosts
{
    public static void main (String[] args)
    {
        double gallons = 0;
        double milesPerGallon = 0;
        double pricePerGallon = 0;
        boolean done = false;
        String trash = "";
        double hundredMiles = 0;
        double howFar = 0;

        Scanner in = new Scanner(System.in);
        do {
            done = false;
            System.out.println("Enter the number of gallons in your tank: ");
            if (in.hasNextDouble())
            {
                gallons = in.nextDouble();
                in.nextLine();

                System.out.println("Enter you fuel efficiency in miles per gallon: ");
                if(in.hasNextDouble())
                {
                    milesPerGallon = in.nextDouble();
                    in.nextLine();
                }

                else
                {
                    trash = in.nextLine();
                    System.out.println("You told me " + trash);
                    System.out.println("Please try again and enter a correct input");
                }

                System.out.println("Enter the cost of gas per gallon: ");

                if (in.hasNextDouble())
                {
                    pricePerGallon = in.nextDouble();

                    in.nextLine();
                    hundredMiles = (100/milesPerGallon) * pricePerGallon;
                    howFar = milesPerGallon*gallons;

                    System.out.println("The cost for 100 miles worth of fuel is " + hundredMiles);
                    System.out.println("With the gas currently in your tank you can go " + howFar + " miles ");

                    done = true;
                }

                else
                {
                    trash = in.nextLine();
                    System.out.println("You told me " + trash);
                    System.out.println("Please try again and enter a correct input.");
                }

            }
            else
            {
                trash = in.nextLine();
                System.out.println("You told me " + trash);
                System.out.println("Please try again and enter a correct input.");
            }
        } while (!done);
    }
}
