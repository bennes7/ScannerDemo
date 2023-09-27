import java.util.Scanner;
public class TheaterKiosk
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //int age = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter your age: ");
        int age = input.nextInt();

        //scanner.nextInt();
        if ( age >= 21) {
            System.out.println("Here's your wristband! ");
        } else {
            System.out.println("Have a nice day! ");
        }
        scanner.close();
    }
}