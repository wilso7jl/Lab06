import java.util.Scanner;
public class Lab_06_04_MetricConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double meters = 0;
        double miles;
        double feet;
        double inches;

        System.out.println("Enter the length in meters: ");

        if(in.hasNextDouble()) {
            meters = in.nextDouble();
            in.nextLine();
        }
        else{
                System.out.println("You entered an invalid response");
            }

        miles = meters * 0.000621371;
        feet = meters * 3.28084;
        inches = meters * 39.3701;

        System.out.println("That's equivalent to: " + miles + " miles");
        System.out.println("That's equivalent to: " + feet + " feet");
        System.out.println("That's equivalent to: " + inches + " inches");
        }
}
