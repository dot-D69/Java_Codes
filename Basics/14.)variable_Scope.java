public class variabel_Scope {
    int y = 4; // CLass variable (also known as instance variable) - belongs to the class and can be accessed by all methods in the class
    public static void main(String[] args){
        // variable scope = the region of the program where a variable can be accessed
        // local variable = a variable that is declared inside a method or block and can only be accessed within that method or block

        int x =10;  // local variable 
        System.out.println("The value of x is: " + x); // Accessing the local variable x
        anotherMethod(); // Calling anotherMethod to demonstrate variable scope
    }

    static void anotherMethod() {
        // System.out.println(x); // This would cause an error because x is not accessible here
        // Local variables are not accessible outside the method they are declared in

        int x = 20; // This is a different x, local to this method local variable
        System.out.println("The value of x is: " + x + " from anotherMethod"); // Accessing the local variable x from anotherMethod

    }
}
