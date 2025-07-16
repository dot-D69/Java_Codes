import java.util.Scanner;

public class Airthmetic_Operators {
    public static void main(String[] args){
        Airthmetic Operators
        int x =6;
        int y= 3;
        int z;

        z=x+y; 9
        z=x-y; 3
        z=x*y; 18
        z=x/y; 3
        z=x%y; 0 (Remainder)
       
        //Augmented Assignment Operators

        x+=y
        x-=y
        x*=y
        x/=y
        x%=y


        //Increment and Decrement Operators
        x++; // Increment x by 1 (postfix)
        x--; // Decrement x by 1 (postfix)

        Scanner sc = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        double total;

        System.out.print("What item would you like to buy?: ");
        item = sc.nextLine();
        System.out.print("What is the  price for each?: ");
        price= sc.nextDouble();
        System.out.print("How many would you like?: ");
        quantity=sc.nextInt();
        System.out.println("\nYou have bought "+ quantity + " "+ item +"/s");
        total = price*quantity;
        System.out.println("Your total is: "+total);

        sc.close();


    }
}
