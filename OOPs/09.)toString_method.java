class Car {
    String model;
    String color;
    int year;

    Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.model + " " + this.color + " " + this.year;
    }

}

public class toString_method {
    public static void main(String[] args) {

        // .toString() = Method that returns a string representation of an object
        // by default, it returns the class name followed by the object's hash code.
        // It is used to convert an object into a string format for easy readability.
        // It can be overridden to provide a more meaningful string representation.

        Car c = new Car("Toyota", "Red", 2022);

        System.out.println(c); // c is an object of class Car, so it will print the class name and hash code by
                               // default.
        // However, since we have overridden the toString() method in the Car class,
        // it will print the string representation defined in that method.
        // Normally to get it print we would use
        // System.out.println(c.model + " " + c.color + " " + c.year);

        Car c2 = new Car("Impala", "Black", 2005);
        System.out.println(c2); // This will also use the overridden toString() method.

        // If we didn't override the toString() method, it would print something like:
        // Car@15db9742 (where 15db9742 is the hash code of the object)
        // Instead, it prints: Impala Black 2005

    }
}

/*
 * 
 * Q: What is the toString() method in Java?
 * A: toString() is a method inherited from the Object class that returns a
 * string representation of an object.
 * 
 * Q: Do all classes have toString() even if I don’t write it?
 * A: Yes. Every class in Java implicitly extends Object, so they all have a toString() method by default.
 * toString() method by default.
 * 
 * Q: What does the default toString() do?
 * A: It returns something like ClassName@hashcode, which looks like this:
 * Car@1a2b3c4d. This is not human-friendly.
 * 
 * Q:: What happens when I print an object like System.out.println(c)?
 * A: Java automatically calls c.toString() behind the scenes.
 * 
 * Q:: Why override toString() if I’m not using inheritance?
 * A: You are still inheriting from Object, so you're overriding its method.
 * Overriding toString() helps provide meaningful string output for your object.
 * 
 * Q:: Does overriding toString() only help in printing?
 * A: No. It also helps with:
 * Debugging
 * Logging
 * Viewing objects in the IDE
 * Concatenating objects to strings
 * JSON or UI frameworks that convert objects to string
 * 
 * Q:: What does System.out.println(obj) do internally?
 * A: It calls obj.toString() to get the string to print.
 * 
 * Q:: What if I don’t override toString() in my class?
 * A: You’ll get the default output like "ClassName@hexHash", which is not
 * useful to humans.
 *
 * 
 */