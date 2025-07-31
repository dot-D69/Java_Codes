

class Car{
    // Attributes
    String name = "BMW";
    String color = "Black";
    int year = 2020;
    int speed = 200;
    double price = 50000.00;
    boolean isElectric = false;
    boolean isRunning = false;

    // Methods 
    void start(){
        isRunning = true;
        System.out.println("Engine is Running");
    }
    void stop(){
        isRunning = false;
        System.out.println("Engine has stopped");
    }
}

class Student{
    // Attributes
    String Name;
    int rollNumber;

    //Method
    void display(){
        System.out.println("Name: " + Name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class Main {
    public static void main(String[] args) {
        // Object  = An entity that holds data( attribute) and can perfomr actions (methods)
        // It is a reference data type

        Car c1 = new Car(); // Object for the class Car
        System.out.println(c1.color);
        System.out.println(c1.name);
        System.out.println(c1.price);
        System.out.println(c1.year);
        System.out.println(c1.isElectric);
        c1.start();;
        c1.stop();

        

        
        Student s1 = new Student();// Object of Student class
        Student s2 = new Student(); // we have many objects from the same class

        s1.Name = "john";
        s1.rollNumber = 100;

        s2.Name = "Nolan";
        s2.rollNumber = 101;

        s1.display();
        s2.display();
    }
}
