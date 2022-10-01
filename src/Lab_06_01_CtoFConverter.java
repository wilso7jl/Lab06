import java.util.Scanner;
public class Lab_06_01_CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsiusTemp;
        double fahrenheitTemp;


        System.out.println("What is the temperature in celsius?");
        //Input code for f temp
        if (in.hasNextDouble()) {
            celsiusTemp = in.nextDouble();
            in.nextLine();
            //process math calculation
            // (celsiusTemp * 1.8) + 32 = fahrenheitTemp
            fahrenheitTemp = (celsiusTemp * 1.8) + 32;

            System.out.println("The temperature in Fahrenheit is " + fahrenheitTemp);
        } else {
            System.out.println("You've entered an invalid input");
        }
    }
}
