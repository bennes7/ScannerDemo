public class FormattedOutput
{
    public static void main(String[] args)
    {
        String fName = "Sarah";
        int age = 18;
        double salary = 10000.50;
        double incomeTax = salary * .034;

        System.out.println(fName);
        System.out.println(age);
        System.out.println(salary);
        System.out.println(incomeTax);

        System.out.printf("%-35s %5d %15.2f %12.2f", fName, age, salary, incomeTax);

        System.out.println();

        for(int x = 1; x <= 5; x++)
            System.out.printf("%-35s %5d %15.2f %12.2f\n", fName, age, salary, incomeTax);
    }
}
