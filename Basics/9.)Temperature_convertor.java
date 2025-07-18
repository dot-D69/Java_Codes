import java.util.Scanner;
public class Temperature_convertor {
    public static void main(String[] args){
        // This is a Temperature converter program
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        double temperature = sc.nextDouble();
        System.out.println("Convert to Fahrenheit (F) or Kelvin (K): ");
        char unit = sc.next().charAt(0);
        double convertedTemperature;
        if (unit == 'F' || unit == 'f') {
            convertedTemperature = (temperature * 9/5) + 32;
            System.out.printf("Temperature in Fahrenheit: %.2f°F%n", convertedTemperature);
        } else if (unit == 'K' || unit == 'k') {
            convertedTemperature = temperature + 273.15;
            System.out.printf("Temperature in Kelvin: %.2fK%n", convertedTemperature);
        } else {
            System.out.println("Invalid unit. Please enter 'F' for Fahrenheit or 'K' for Kelvin.");
        }
        sc.close(); 
    }
}
