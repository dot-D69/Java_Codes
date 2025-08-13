

class Car{
    private String model;
    private String color;
    private int price;

    Car(String model,String color,int price){
        this.color = color;
        this.model = model;
        this.price = price;
    }

    //GETTER Methods
    String getModel(){
        return this.model;
    }
    String getColor(){
        return this.color;
    }
    String getPrice(){ // We can add our own rules like here we are not returning int that is the type of price but we are returning String 
        return "$"+this.price;
    }

    // SETTER Methods
    void setColor(String color){
        this.color= color;
    }

    void setPrice(int Price){ //  We can also set our own rules
        if(Price<0){
            System.out.println("Price can't be less than 0");
        }
        else{
            this.price = Price;
        }
    }

    // We just didn't set the setter method for model cause we can change the color f the car and sell it at a different price but cannot the change the model in reality so just logic
}


public class getters_setters {
    public static void main(String[] args) {
        // Getter and Setter help protect object data and add rules for accessing or modifying
        // GETTERS = Methods that make a field READABLE
        // SETTERS = Methods that make a field WRITEABLE


        Car car = new Car("Mustang", "Black", 4000);

        // System.out.println(car.model + car.color + car.price);// This would give error since the attributes for the Car object are private thus cannot be viewed

        // We can now view the fields of the object by using Getter methods
        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getPrice());

        // Using the Setter methods we can chnage the values of the attributes

        car.setColor("Blue");
        car.setPrice(2000);
        System.out.println("The car has a new " + car.getColor() + " and is at a disocunt for the price $"+car.getPrice());

    }
}
