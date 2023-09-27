import java.util.Scanner;

public class LoopScanner
{
    public static void main(String[] args)
    {
        int favNum = 0;
        String trash = "";
        boolean done = false;

        Scanner in = new Scanner(System.in);

//        do {
//
//
//            System.out.println("Enter your fav number [1 - 10]: ");
//            if (in.hasNextInt()) // User entered a number correctly
//            {
//                favNum = in.nextInt(); // read the int into the variable
//                in.nextLine(); // Clear the newLine /Enter from the buffer
//
//                if (favNum >= 1 && favNum <= 10)
//                {
//                    System.out.println("You said your fav num is: " + favNum);
//                    done = true;
//                } else // out of range
//                {
//                    System.out.println("You said your fav num is: " + favNum);
//                    System.out.println("But, that is not within the range [1 - 10]");
//                }
//
//            } else // Don't have a number must read buffer as a Trash String
//            {
//                trash = in.nextLine();
//                System.out.println("You told me " + trash);
//            }
//        } while(!done);

        /* Do while java syntax
           do
           {

           }while(condition); // as long as condition is true

         */

        // Age program must be 18 and not older than 35

        int age = 0;

        done = false;

        do {

            System.out.print("Enter your age [18 - 35]: ");
            if(in.hasNextInt())
            {
                age = in.nextInt();
                in.nextLine();
                // Test the range of the int you read
                if(age >= 18 && age <= 35)
                {
                    System.out.println("Your age is: " + age);
                    done = true;
                }
                else // NUmber is not in range
                {
                    System.out.println("The age you entered: " + age + " is out of range!");
                }
            }
            else // Don't have a number
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " which is invalid");
            }

        }while (!done);
    }
}
