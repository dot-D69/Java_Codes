
interface Prey{
    
    void flee();  // Method signature for fleeing behavior
    // No method body here, just the signature
    // Classes that implement this interface must provide an implementation for this method
}

interface Predator{
    void hunt();  // Method signature for hunting behavior
    // No method body here, just the signature
    // Classes that implement this interface must provide an implementation for this method
}

class Rabbit implements Prey{

    @Override  // we use @Override to indicate that we are overriding a method from the interface
    public void flee(){
        System.out.println("The rabbit flees quickly!");
    }
}

class Fish implements Prey, Predator{

    @Override
    public void flee(){
        System.out.println("The fish swims away swiftly!");
    }

    @Override
    public void hunt(){
        System.out.println("The fish hunts smaller fish!");
    }

}

class Hawk implements Predator{

    @Override
    public void hunt(){
        System.out.println("The hawk hunts its prey!");
    }
}


public class interfaces {
    public static void main(String[] args) {
//    An interface in Java defines a **contract** or a **set of rules** that a class must follow.
//  * It contains only method signatures (no method bodies).
//  * 
//  * When a class implements an interface, it's saying:
//  *   "I PROMISE to provide code for every method declared in this interface."
//  *
//  * Think of it like a job description — if you take the job, you must do everything listed in it.

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();  // Fish can also hunt since it implements Predator

        Hawk hawk = new Hawk();
        hawk.hunt();

        // You can also create a more complex interaction
        Prey myPrey = new Rabbit();  // Using interface type
        myPrey.flee();  // Calls Rabbit's flee method
        myPrey = new Fish();  // Reassigning to another Prey type
        myPrey.flee();  // Calls Fish's flee method

        // Similarly, you can use the Predator interface
        
        Predator myPredator = new Hawk();  // Using interface type
        myPredator.hunt();  // Calls Hawk's hunt method
        myPredator = new Fish();  // Reassigning to another Predator type
        myPredator.hunt();  // Calls Fish's hunt method

        // Note: A class can implement multiple interfaces
        // For example, if we had a class that is both Prey and Predator, it could implement both interfaces
    }
}









/*
 * 
 * Why use interfaces?
 * - To enforce common behavior across different classes
 * - To support multiple inheritance (a class can implement multiple interfaces)
 * - To allow flexible and scalable design (e.g., plugins, APIs, callback systems)
 */