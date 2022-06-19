import java.util.Scanner;
public class Main
{
    public static void main(String[] args)

    {
        double celsius;
        double fahrenheit;
        String trash;
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a Celsius value to convert to Fahrenheit: ");
        if (in.hasNextDouble())
        {
            celsius = in.nextDouble();
            in.nextLine();
            fahrenheit = (celsius * 5/9) + 32;
            System.out.println(celsius + " degrees C is " + fahrenheit + " degrees F.");
        }
        else {
            trash = in.nextLine();
            System.out.println("Must enter a valid number for temperature in C. You entered: " + trash);
        }
    }
}