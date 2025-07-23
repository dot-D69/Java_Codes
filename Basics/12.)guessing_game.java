import java.util.Scanner;
import java.util.Random;

public class guessing_game {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int Num = rand.nextInt(101); // Generates a random number between 0 and 100
        int guess  = 0;
        int attempts = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("You have to guess a number between 0 and 100. within 6 attempts.");

        while(attempts<6){
            System.out.println(6-attempts + " attempts left");
            System.out.print("Enter the number you've guessed: ");
            guess = sc.nextInt();
            
            if(guess<Num){
                System.out.println("You have guessed a lower number");
            }
            else if (guess>Num) {
                System.out.println("You have guessed a higher number");
            }
            else{
                System.out.println("Congratulations! " +Num+ " is the right number you guessed it right in: "+ attempts+" attempts");
                break;
            }
            attempts++;
        }
        if(attempts == 6){
            System.out.println("\nWell womp womp you couldn't even guess a number in 6 attempts, the number was: " + Num);
        }
        sc.close(); // Close the scanner to prevent resource leaks
        System.out.println("Thank you for playing the Guessing Game!");
    }
}
