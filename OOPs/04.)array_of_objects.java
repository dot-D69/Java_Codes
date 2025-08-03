// import java.util.Scanner;

class Car{
    String model;
    String color;

    Car(String model, String color){
        this.model = model;
        this.color = color;
    }

    void drive(){
        System.out.println("You drive a "+this.color+" "+this.model);
    }
}


public class array_of_objects {
    public static void main(String[] args){
        Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("Defender", "white");
        Car car3 = new Car("Maruti", "orange");

        // // Array of Object;
        // // we can fill like this
        // // Car[] car  = new Car[3];
        // // car[0] = car1;
        // // car[1] = car2;
        // // car[2] = car3;

        // Or we can fill like this like this
        Car[] cars = {car1, car2, car3, new Car("BMW", "Black")};

        for(Car car: cars){
            car.drive();
        }


        // // Or via user input;
        // Scanner sc = new Scanner(System.in);
        // Car[] cars = new Car[3];

        // for(int i=0;i<cars.length;i++){
        //     System.out.print("Enter Model: ");
        //     String model = sc.nextLine();
        //     System.out.print("Enter Color: ");
        //     String color = sc.nextLine();
        //     cars[i] = new Car(model,color);
        // }

        // for(Car c: cars){
        //     c.drive();
        // }

        // sc.close();


    }
}
