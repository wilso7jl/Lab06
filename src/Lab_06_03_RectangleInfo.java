import java.util.Scanner;
public class Lab_06_03_RectangleInfo {
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        double perimeter;
        double diagonal;
        String trash ="";
        //area = l * w
        //perimeter
        //diagonal = SquareRoot (Length * length +

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle");

        if(in.hasNextDouble()) {
            length = in.nextDouble();
            in.nextLine();

            System.out.println("Enter the width of the rectangle");

            if(in.hasNextDouble()){
                width = in.nextDouble();
                in.nextLine();

                diagonal = Math.sqrt(length * length + width * width);

                area = length * width;

                perimeter = 2 * length + 2 * width;

                System.out.println();
                System.out.printf("area of the rectangle: %.2f%n" , area);
                System.out.println();
                System.out.printf("perimeter of the rectangle: %.2f%n" , perimeter);
                System.out.println();
                System.out.printf("diagonal of the rectangle: %.2f%n" , diagonal);

            } else{
                trash = in.nextLine();
                System.out.println("You entered an invalid response");
            }
        } else{
            System.out.println("You entered an invalid value: " + trash);
        }
    }
}
