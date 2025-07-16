import java.util.Scanner; // Importing the Scanner class from the java.util package

public class Main {
    public static void main(String[] args) {
        // Printing
        System.out.println("Hello World");
        System.out.println("Goodbye World");
        System.out.println("This is the year " + 2025);

        // ------------------------------------------------------------------------------------------------------------------------//

        // Variables
        /*
         * variable = a resuable container for data
         * 
         * Primitives: simple values stored directly in memory(stack)
         * Reference: memory address of an object stored in heap
         * 
         * Primitives: int, double, char, boolean
         * Reference: String, Array, Object
         * Variable Types:
         * - Local: declared inside a method, accessible only within that method
         * - Instance: declared inside a class, accessible by all methods in that class
         * - Static: declared with the static keyword, shared across all instances of a
         * class
         * - Final: declared with the final keyword, cannot be reassigned after
         * initialization
         * - Constant: a variable that cannot be changed after it is initialized,
         * typically declared with the final (eg: final int MAX_VALUE = 100;)
         */

        int age = 25;
        double price = 19.99;
        char grade = 'A';
        boolean isActive = true;
        String name = "John Doe"; // Reference type variable
        int[] numbers = {1, 2, 3, 4, 5}; // Array as a reference type variable

        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Is Active: " + isActive);
        System.out.println("Name: " + name);
        for(int n : numbers){
        System.out. println("Number: "+ n);
        }
        // ----------------------------------------------------------------------------------------------------------------------------------------//

        /*
         * Taking user input
         * To Take user input we Use the Scanner class
         * In order to use the Scanner class, we need to import it from the java.util
         * package
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String Name = sc.nextLine();// The nextline method reads as string of characters including spaces
        String Name_2= sc.next(); // The next will not read spaces it ends if there is a space
        System.out.println("Hello "+ Name);

        // TO read integer:
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
        System.out.println("You are "+ age + " "+ "years old");

        //To read boolean
        System.out.println("Are you a student? (true/false)");
        boolean isStudent = sc.nextBoolean();
        System.out.println(Name+" is a Student.");

        // To get double:
        System.out.print("What is your GPA: ");
        double gpa = sc.nextDouble();
        System.out.println("You are an "+ gpa+" "+"Pointer.");

        if(isStudent){
        System.out.println(Name+" is a "+age+" years old Student who has an gpa of
        "+gpa);
        }
        else{
        System.out.println(Name+" is a "+age+" years old Graduate who has an gpa of
        "+gpa);

        }

        /*COMMON ISSUES IN USER INPUT*/
        System.out.print("Enter your age:");
        int ageInput = sc.nextInt();
        sc.nextLine(); // This line consumes the newline character left by nextInt()

        System.out.print("Enter your fav color: ");
        String color = sc.nextLine(); /*  This will cause an issue because nextInt() does not consume the newline character which means the nextLine() will read an empty string because the newline character is still in the input bufferafter nextInt().*/
        // To fix this, we can add an extra sc.nextLine() after nextInt()

        System.out.println("Your age is: " + ageInput);
        System.out.println("Your favorite color is: " + color);

        // ----------------------------------------------------------------------------------------------------------------------------------------//

        // Area of a rectangle
        double height;
        int width;
        double area;
        System.out.print("Enter the width of the rectangle: ");
        width = sc.nextInt();
        System.out.print("Enter the height of the rectangle: ");
        height = sc.nextDouble();
        area = width * height;
        System.out.println(("The area of the rectangle is: " + area));

        sc.close(); // Closing the scanner to prevent resource leaks
        // Note: Always close the Scanner object when done to free up resources.
    }
}