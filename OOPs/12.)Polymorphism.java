
// Polymorphism can also be acheived in the similiar way through using Interfaces
// If you prefer interfaces then just Interface Vehicle and in each class instead of extends it is implements
abstract class Vehicle{
    abstract void go();
}

class Car extends Vehicle{

    @Override
    void go(){
        System.out.println("The Car will drive");
    }
}

class Bike extends Vehicle{
    @Override
    void go(){
        System.out.println("The Bike will drive");
    }
}


class Bus extends Vehicle{
        @Override
    void go(){
        System.out.println("The Bus will drive");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Polymorphism
        // Poly = many
        // Morph = forms
        // One interface, multiple implementations 
        // Objects can take many forms
        // Objects can be identified as other objects
        // Example: A dog is an animal, a cat is an animal,  a dog is a pet ,  a dog is also an organism etc.
        // or // A car is a vehicle, a bike is a vehicle, etc.
        // In Java, polymorphism is achieved through method overriding and method overloading.

        Car car = new Car();
        Bike bike = new Bike();
        Bus bus = new Bus();

        Vehicle[] vehicles   = {car,bike,bus};

        for(Vehicle v : vehicles){
            v.go();
        }
    }
}
