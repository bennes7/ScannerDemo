import java.util.Scanner;
public class NumCompare
{
    public static void main(String[] args)
    {
        //System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first number: ");

        if (scanner.hasNextDouble()) {
            double num1 = scanner.nextDouble();

            System.out.print("Enter your second number: ");
            if (scanner.hasNextDouble()) {
                double num2 = scanner.nextDouble();

                if (num1 == num2)
                {
                    System.out.println("Your two numbers are equal! ");
                }
                else if (num1 < num2)
                {
                    System.out.println("The smaller number is: " + num1);
                }
                else if (num1 > num2)
                {
                    System.out.println("The smaller number is: " + num2);
                }
            }
            else
            {
                System.out.println("The program did not work as intended because of an invalid input. Please try again. ");
            }
        }
        else
        {
            System.out.println("The program did not work as intended because of an invalid input. Please try again. ");
        }
        scanner.close();
    }
}