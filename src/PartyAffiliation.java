import java.util.Scanner;
public class PartyAffiliation
{
    public static void main (String[] agrs)
    {
        Scanner scanner = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        String menuChoice = "";
        String menu = "D - Democrat R - Republican I - Independent O - Other: ";

        //display menu

        System.out.print(menu);
        System.out.println( "Enter your party: [D(emocrat) R(epublican I(ndependant)] Other: ");
        menuChoice = in.nextLine();

        if(menuChoice.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Donkey Democrat ");
        }
        else if(menuChoice.equalsIgnoreCase( "R"))
        {
            System.out.println("You get a Republican Elephant ");
        }
        else if(menuChoice.equalsIgnoreCase(  "I"))
        {
            System.out.println("you get an Independent Man");
        }
        else if(menuChoice.equalsIgnoreCase(  "O"))
        {
            System.out.println("you get Other ");
        }
        else
        {
            System.out.println("Incorrect input ");
        }
        scanner.close();
    }
}