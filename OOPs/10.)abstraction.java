import java.util.Scanner;

abstract class Shape{
    abstract double area(); // Abstract method, must be implemented by subclasses
    
    void display() {
        System.out.println("This is a shape."); //This is a concrete method with a body , it can be inherited by subclasses.
        // We dont need to implement this method in subclasses.
    }
}

class Circle extends Shape{

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area(){
        return Math.PI * radius * radius;
    }

}

class Rectangle extends Shape{
    
    double length;
    double width;   

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }  
    

    @Override
    double area(){
        return length * width;
    }
}

class Triangle extends Shape{

    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area(){
        return 0.5 * base * height;
    }
}



public class abstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // abstraction  = is a process of hiding the implementation details and showing only the essential features of the object.
        // abstract classes  Cant be instantiated, can have abstract methods (without body[which must be implemented]) and concrete methods (with body [ which are inherited]).
        // abstract methods must be implemented by subclasses.
        // abstract classes can have constructors, fields, and methods.

        // Shape shape = new Shape(); // We can't create an object of the shape class as it is abstract.
        // This provides us with security as no else can make any irregular shapes.
        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        System.out.println("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        double width = sc.nextDouble();

        System.out.println("Enter the base of the triangle: ");
        double base = sc.nextDouble();
        System.out.println("Enter the height of the triangle: ");
        double height = sc.nextDouble();

        Circle circle = new Circle(radius);
        Rectangle rectangle = new Rectangle(length, width);
        Triangle triangle = new Triangle(base, height);

        circle.display(); // Calls the concrete method from the abstract class
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Triangle: " + triangle.area());

        sc.close();


    }
}
