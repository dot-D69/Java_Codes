import java.util.ArrayList;
import java.util.Collections;


public class ArrayLists {
    public static void main(String[] args) {
        // ArrayLsit = a re-sizeable array that stores objects(autoboxing)

        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(2);
        list.add(4);

        System.out.println(list);

        ArrayList<String> Fruits = new ArrayList<>();

    
        Fruits.add("Apple");
        Fruits.add("watermelon");
        Fruits.add("Peach");
        Fruits.add("Cocunut");

        System.out.println(Fruits);

        Fruits.remove(2);
        System.out.println(Fruits);

        Fruits.set(0,"PineApple"); // Replace the element
        System.out.println(Fruits);
        System.out.println(Fruits.get(1));   // To find the element in the arraylist
        
        
        // To get the size
        System.out.println(Fruits.size());

        // To sort the arraylist
        Collections.sort(Fruits);
        System.out.println("The sorted Fruits array: "+ Fruits);

        for(String Fruit: Fruits){
            System.out.println(Fruit );
        }






    }
}
