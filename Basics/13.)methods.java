public class methods {
    public static void main(String[] args){
        
        // Method = a block if reusable code that performs a specific task and that is executed when it is called
        // Parameters = variables that are passed into a method
        // Arguments = values that are passed into a method when it is called

        // Calling the method

        // We are trying to call the method 'add' here.
        // BUT 'add' is NOT static — it belongs to an object (a real copy of the class).
        // Since 'main' is static and doesn't create an object, it CANNOT access 'add' directly.
        // So this line will give an error unless we fix it in one of the following ways:

        // FIX 1: Make 'add' method static
        // OR
        // FIX 2: Create an object of the Methods class and use that to call 'add'
        // methods obj = new methods(); // Creating an object of the methods class

        int sum = add(5, 10); // Calling the add method with arguments 5 and 10
        System.out.println("The sum is: " + sum);

        // Calling the square method
        System.out.println("The square of 5.0 is: " + square(5.0)); // Calling the square method with argument 5.0


        // overloaded methods = methods that have the same name but different parameters (different type, number, or order of parameters)
        double sumDouble = add(5.5, 10.5); // Calling the overloaded add method with two double arguments
        System.out.println("The sum of doubles is: " + sumDouble);
        
        int sumThree = add(5, 10, 15); // Calling the overloaded add method with three integer arguments
        System.out.println("The sum of three integers is: " + sumThree);

        String concatenated = add("Hello, ", "World!"); // Calling the overloaded add method with two string arguments
        System.out.println("The concatenated string is: " + concatenated); // Printing the concatenated string

    }

    // Example of a method 
        static int add(int a, int b) { // Static method that takes two integers as parameters and returns their sum
        // Parameters: a and b are the parameters of the method
            return a + b;
        }

        static double square(double num){
            return num * num; // Returns the square of the number
        }

        // Overloaded method example
        static double add(double a, double b) { // Overloaded method that takes two doubles as parameters and returns their sum
            return a + b;
        }
        static int add(int a, int b, int c) { // Overloaded method that takes three integers as parameters and returns their sum
            return a + b + c;
        }
        static String add(String a, String b) { // Overloaded method that takes two strings as parameters and returns their concatenation
            return a + b;
        }


    
}
