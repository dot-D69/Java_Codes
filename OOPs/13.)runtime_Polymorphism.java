import java.util.Scanner;

abstract class Animal{ // fr good practice we make the Animal class abstract as a developer we don't ant anyone else making any other absurd animals
    abstract void speak();
}

class Dog extends Animal{

    @Override
    void speak(){
        System.out.println("The Dog Barks as *woof*");
    }
}

class Cat extends Animal{

    @Override
    void speak(){
        System.out.println("The Cat Meows as *meeoww*");
    }
}

public class runtime_Polymorphism {
    public static void main(String[] args) {
        // Runtime Polymorphism = When the method that gets executed is decided at the runtime
        //                        based on the actual type of the object.


        // Animal animal = new Animal(); // Animal is an abstract class and thus cannot be instantiated
        Scanner sc = new Scanner(System.in);
        Animal animal;
        System.out.print("Would you like to  select a DOG or a CAT?"+" For Dog enter 1."+ " For Cat enter 2 :  ");
        int choice = sc.nextInt();

        if(choice==1){
            animal = new Dog();
            animal.speak();

        }
        else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }
        else{
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}


// This is Runtime Polymorphism: The actual method we call like the speak for the dog or the cat 
// It is determined at runtime after the program is already running, the method speak that has been called
// It depends on the actual type of object that is selected after the program starts running and the user gives input
// So if the input is 1 , the tpye of object becomes dog so wooof
// else the type is 2, the type of object becomes cat so meooww
