import java.util.Scanner;
public class ab_06_02_FuelCosts {
    public static void main(String[] args) {
        double gasLeft = 0;
        double fuelEfficiency = 0;
        double gasPrice = 0;

        double gallonsQuantity;
        double hundredMile;
        double milesLeft;
        Scanner in = new Scanner(System.in);

        System.out.println("How many gallons of gas are left in the tank? ");

        if(in.hasNextDouble()) {
            gasLeft = in.nextDouble();
            in.nextLine();
        } else {
            System.out.println("Your input is invalid");

        }
        System.out.println("What is your fuel efficiency in Miles per Gallon? ");

        if(in.hasNextDouble()) {
            fuelEfficiency = in.nextDouble();
            in.nextLine();
        } else {
            System.out.println("Your input is invalid");

        }
        System.out.println("What is the price of gas per Gallon? ");

        if(in.hasNextDouble()) {
            gasPrice = in.nextDouble();
            in.nextLine();
        } else {
            System.out.println("Your input is invalid");

        }

        gallonsQuantity = 100 / fuelEfficiency;
        hundredMile =  gallonsQuantity * gasPrice;
        milesLeft = gasLeft * fuelEfficiency;

        System.out.println("100 miles of travel will cost: " + hundredMile + "$");
        System.out.println(milesLeft + " miles left before your tank is empty");
    }
}
