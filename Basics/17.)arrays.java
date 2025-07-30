import java.util.Arrays; // we need to import the Arrays class to use its methods such as sort, fill, etc.
import java.util.Scanner;
public class arrays {
    public static void main(String[] args){

        String[] fruits = {"apple","orange","beetroot","cocunut"};
        //Accessing the an bject of the array
        System.out.println(fruits[1]);

        // length of the array
        int numofFruits= fruits.length;
        System.out.println("The Length of array fruits is: "+numofFruits);

        // iterating through the array
        for(int i=0;i<fruits.length;i++){
            System.out.print(fruits[i]+ " ");
        }

        //enhanced for loop:
        for(String fruit: fruits){
            System.out.println(fruit);
        }

        // sorting the array
        Arrays.sort(fruits);
        System.out.println("The sorted array:");
        for(String fruit: fruits){
            System.out.println(fruit);
        }

        //Fill an array with a value
        int[] numbers = new int[5];
        Arrays.fill(numbers, 10); // Fills the entire array with the value 10   
        System.out.println("The filled array:");
        for(int number: numbers){   
            System.out.print(number+ " ");
            System.out.println("\n");
        }

        // Copying an array
        String[] moreFruits = Arrays.copyOf(fruits, fruits.length);
        System.out.println("The copied array:");
        for(String fruit: moreFruits){
            System.out.println(fruit);
        }

        // Checking if two arrays are equal
        String[] anotherFruits = {"apple", "orange", "beetroot", "cocunut"};
        boolean areEqual = Arrays.equals(fruits, anotherFruits);
        System.out.println("Are the two arrays equal? " + areEqual);

        // Converting an array to a string
        String numberString = Arrays.toString(numbers);
        System.out.println("The array as a string: " + numberString);

        // Searching for an element in an array
        // Linear Search

        String target = "orange";
        boolean found = false;
        for(int i=0;i<fruits.length;i++){
            if(fruits[i].equals(target)){
                System.out.println("Element found at index: "+i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("elemnet not present in the array");
        }


        // Binary search (Make sure the Array is sorted first)
        int index = Arrays.binarySearch(fruits, "orange");
        if (index >= 0) {
            System.out.println("Found 'orange' at index: " + index);
        } else {
            System.out.println("'orange' not found in the array.");
        }

// **********************************************************************************************************

        // Taking user input into an array:
        Scanner sc = new Scanner(System.in);

        // Create an array and assing a length to the array
        // String[] places = new String[5]:
        // Or we can take the size of array as input

        String[] places;
        int size;
        System.out.print("Enter the the number of places you want to visit: ");
        size= sc.nextInt();
        sc.nextLine(); // Always remeber to add a newline after nextInt() input
        places = new String[size];
        System.out.println("Enter the "+ size + " places you want to visit:");

        for(int i = 0; i<places.length;i++){
            places[i] = sc.nextLine();
        }

        System.out.println("You have entered:");
        for(String place:places){
            System.out.println(place);
        }
        sc.close();
    }
}
