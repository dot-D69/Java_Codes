import java.util.Scanner;

public class Maths {
    public static void main(String[] args){
        // If you want to get the value of pie
        System.out.println(Math.PI);
        // If you want the exponential constant or ulers number
        System.out.println(Math.E);

        // If you want to get the square root of a number
        double num = 16;
        System.out.println(Math.sqrt(num)); // This will return 4.0

        // If you want to get the power of a number
        double result = Math.pow(2, 3); // This will return 8.0 (2 raised to the power of 3)
        System.out.println(result);

        // If you want to get the absolute value of a number
        int negativeNum = -10;
        System.out.println(Math.abs(negativeNum)); // This will return 10

        // If you want to get the maximum of two numbers
        int a = 5; 
        int b = 10;
        System.out.println(Math.max(a, b)); // This will return 10

        // If you want to get the minimum of two numbers
        System.out.println(Math.min(a, b)); // This will return 5

        // If you want to round a number
        double decimalNum = 5.3;
        System.out.println(Math.round(decimalNum)); // This will return 5
        // CEIL AND FLOOR
        System.out.println(Math.ceil(decimalNum)); // This will return 6.0 (rounds up)
        System.out.println(Math.floor(decimalNum)); // This will return 5.0 (round down)


        // Exercises: calculate the circumference ,area and volume of a circle
        // Circumference = 2 * π * r
        // Area = π * r^2
        // Volume = (4/3) * π * r^3

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        // System.out.println("Circumference: " + circumference);
        // System.out.println("Area: " + area);
        // System.out.println("Volume: " + volume);
        // WE USE %n String.format to format the output to 2 decimal places
        System.out.printf("Circumference: %.2f%n", circumference);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Volume: %.2f%n", volume);
        // IF WE WANTED UPTO 1 DECIMAL PLACE WE WOULD USE %.1f
        // IF WE WANTED UPTO 3 DECIMAL PLACES WE WOULD USE %.3f
        sc.close();

    }
}
