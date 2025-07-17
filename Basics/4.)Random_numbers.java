import java.util.Random; // Import the Random class from java.util package

public class Random_numbers {
    public static void main(String[] args){
        Random rand = new Random(); // Import the Random class from java.util package
        // int num = rand.nextInt(); If we don't specify a bound, it can return any integer upto Integer.MAX_VALUE
        int num = rand.nextInt(1,7);// The first parameter is inclusive, the second is exclusive
        // This will generate a random number between 1 and 6 (inclusive of 1 and exclusive of 7)
        System.out.println(num);

        //You can also generate a random double
        double num2 = rand.nextDouble(); // Generates a random double between 0 (inclusive) and 1 (exclusive)
        System.out.println(num2);

        // You can also generate a random boolean
        boolean isHeads = rand.nextBoolean(); // Generates a random boolean value (true or false) ,can be used to simulate a coin flip
        System.out.println(isHeads);
    }
}
