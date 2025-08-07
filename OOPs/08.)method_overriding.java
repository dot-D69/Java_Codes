class Animal{

    void move(){
        System.out.println("Animal is moving");
    }

}

class Dog extends Animal{

}

class Cat extends Animal{

}

class Fish extends Animal{

    @Override
    void move(){
        System.out.println("Fish is swimming");
    }
}



public class method_overriding {
    public static void main(String[] args) {   
        // Method Overridng = 
        // When a subclass has the same method as declared in the parent class.
        // The method in the subclass overrides the method in the parent class.
        // i.e the subclass method has the same name, return type, and parameters as the parent class method but with a different implementation.

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move(); // Calls the move method from Animal class
        cat.move(); // Calls the move method from Animal class
        fish.move(); // Calls the overridden move method from fish class


        // Explanation:        // In this example, we have an Animal class with a method called move.
        // The Dog and Cat classes inherit from Animal but do not override the move method, so they use the implementation from Animal.
        // The Fish class overrides the move method to provide its own implementation, which prints "Fish is swimming".

        
        // What is the use of method overriding? and can't we just name the method differently?
        // Method overriding allows a subclass to provide a specific implementation of a method that is already defined in its superclass.
        // This is useful for achieving runtime polymorphism, where the method that gets executed is determined by the actual object type, not the reference type.
        // If we named the method differently, we would lose this polymorphic behavior and have to use different method names for different behaviors, which is less flexible and harder to maintain.
        // In summary, method overriding allows for more dynamic and flexible code, enabling subclasses to tailor inherited methods to their specific needs.
        // It also allows for cleaner code by reusing method names, making it easier to understand and maintain.

        // For example, if we had a method named "swim" in the fish class instead of overriding "move", we would have to call it explicitly using the fish reference, losing the polymorphic behavior:
        // fish.swim(); // This would not allow polymorphism, as it would not be called through the Animal reference.
        // In conclusion, method overriding is a powerful feature in object-oriented programming that enhances code flexibility and maintainability.


        


}
}