import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String firstName = "";
        String lastName = "";
        String fullName = "";
        String trash = "";

        int favNum = 0; // 1 - 10
        double salary = 0.0;

        Scanner in = new Scanner(System.in);

        // This is the Way that we do a prompt using print instead of  println
        System.out.println("Enter your first name: ");
        firstName = in.nextLine();

        System.out.println("You told me your first name is: " + firstName);

        System.out.println("Enter your last name: ");
        lastName = in.nextLine();

        System.out.println("You told me your last name is: " + lastName);

        fullName = firstName + " " + lastName;

        System.out.println("I'm guessing that your full name is: " + fullName);

        // OK now lets read some numbers

        System.out.println("Enter your fav number [1 - 10]: ");
        if (in.hasNextInt())
        {
            favNum = in.nextInt(); // read the int into the variable
            in.nextLine(); // Clear the newLine /Enter from the buffer
            System.out.println("You said your fav num is: " + favNum);
        }
        else // Don't have a number must read buffer as a Trash String
        {
            trash = in.nextLine();
            System.out.println("You told me " + trash);
            System.out.println("Run the program again and do the input correctly");

        }

        // Read a double for Salary

        System.out.println("Enter your salary: ");
        if(in.hasNextDouble())
        {
            salary = in.nextDouble();
            in.nextLine(); // CLEAR THE BUFFER EVERY TIME AFTER READING A NUMBER
            System.out.println("You said your salary is: " + salary);
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered " + trash + " which is wrong!");
            System.out.println("Run the program again with the correct input!");
        }

        System.out.println("Enter your fav number [1 - 10]: ");
        if (in.hasNextInt()) // User entered a number correctly
        {
            favNum = in.nextInt(); // read the int into the variable
            in.nextLine(); // Clear the newLine /Enter from the buffer

            if (favNum >= 1 && favNum <= 10)
            {
                System.out.println("You said your fav num is: " + favNum);
            }
            else
            {
                System.out.println("You said your fav num is: " + favNum);
                System.out.println("But, that is not within the range [1 - 10]");
            }


        }
        else // Don't have a number must read buffer as a Trash String
        {
            trash = in.nextLine();
            System.out.println("You told me " + trash);
            System.out.println("Run the program again and do the input correctly");

        }
    }
}