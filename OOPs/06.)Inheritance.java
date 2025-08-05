class Organism{ // Parent class
    // Parent class is the class being inherited from
    // Child class inherits from a parent class
    // Organism <- Animal <- Dog, Cat
    boolean isALive;

    Organism() {
        isALive = true;
    }
}

class Plant extends Organism { // Child class
    void photosynthesize() {
        System.out.println("The plant is photosynthesizing.");
    }
}

class Animal extends Organism { 
    void eat(){
        System.out.println("The animal is eating.");
    }
}

class Dog extends Animal { // Child class
    int lives =1;

    void speak() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal { // Child class
    int lives = 9;  
    void speak() {
        System.out.println("The cat meows.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Inheritance = one class inherits the attributes and methods from another class
        // Child class inherits from a parent class
        // CHild <- Animal

        Plant plant  = new Plant();
        plant.photosynthesize();
        System.out.println("Plant is alive: " + plant.isALive);

        Dog dog = new Dog();
        dog.eat();
        dog.speak();
        System.out.println("Dog is alive: " + dog.isALive);
        System.out.println("Dog has " + dog.lives + " life(s).");

        Cat cat = new Cat();
        cat.eat();
        cat.speak();
        System.out.println("Cat is alive: " + cat.isALive);
        System.out.println("Cat has " + cat.lives + " life(s).");
    }
}

/*
 * Inheritance allows a class to inherit fields and methods from another class.
 * 
 *                     Organism
 *                     /       \
 *                Animal        Plant
 *                /     \
 *              Dog     Cat
 * 
 * In this example, the `Animal` class inherits from `Organism`, and both `Dog` and `Cat` inherit from `Animal`.
 * The `Plant` class also inherits from `Organism`, demonstrating how inheritance can create a hierarchy of classes.
 * 
 * A subclass inherits all non-private members (variables + methods) of the superclass.
*
*Java does not support multiple inheritance (1 class can only extend 1 class).
*
*Private members are not inherited, but protected members are.
*
*Constructors are not inherited, but super() can call them

    * Types of Inheritance in Java:
    Type	       Description
    Single	       One child, one parent
    Multilevel	   Class B inherits A, Class C inherits B
    Hierarchical   Multiple classes inherit a single class
 */