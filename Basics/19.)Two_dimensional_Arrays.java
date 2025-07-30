import java.util.Scanner;
public class Two_dimensional_Arrays {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana" ,"orange"};
        String[] veggies = {"potato", "tomato", "beetroot"};
        String[] meats  = {"chicken","fish","lamb"};

        // 2d  Array
        String[][] groceries = {fruits,veggies,meats};

        for(String[] foods:groceries ){ 
            for(String food: foods){
                System.out.print(food + " ");
            }
            System.out.println("\n");
        }

        // Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the 2D array:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns for the 2D array:");
        int cols = sc.nextInt();
        String[][] userArray = new String[rows][cols];
        sc.nextLine(); // Consume the newline character

        for(int i = 0; i < rows; i++) {
            System.out.println("Enter values for row " + (i + 1) + ":");    
            for(int j = 0; j < cols; j++) {
                userArray[i][j] = sc.nextLine();
            }
        }
        System.out.println("User-defined 2D Array:");
        for(String[] row : userArray) {
            for(String value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        sc.close();





        // 2d Array with different lengths
        String[][] groceries2 = {
            {"apple", "banana" ,"orange"},
            {"potato", "tomato"},
            {"chicken","fish","lamb","beef"}
        };

        for(String[] foods:groceries2 ){
            for(String food: foods){
                System.out.print(food + " ");
            }
            System.out.println("\n");
        }

        //Taking input from user for a 2D array with different lengths
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the number of rows for the 2D array with different lengths:");
        int rows2 = sc2.nextInt();
        String[][] userArray2 = new String[rows2][];
        sc2.nextLine(); // Consume the newline character

        for(int i = 0; i < rows2; i++) {
            System.out.println("Enter the number of columns for row " + (i + 1) + ":");
            int cols = sc2.nextInt();
            userArray2[i] = new String[cols];
            sc2.nextLine(); // Consume the newline character
            System.out.println("Enter values for row " + (i + 1) + ":");
            for(int j = 0; j < cols; j++) {
                userArray2[i][j] = sc2.nextLine();
            }
        }
        System.out.println("User-defined 2D Array with different lengths:");
        for(String[] row : userArray2) {
            for(String value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        sc2.close();

        // 2d Array with different lengths and different data types
        Object[][] groceries3 = {
            {"apple", "banana" ,"orange"},
            {"potato", "tomato"},
            {"chicken","fish","lamb","beef"},
            {1, 2, 3, 4} // Integer array
        };
        for(Object[] foods:groceries3 ){
            for(Object food: foods){
                System.out.print(food + " ");
            }   
            System.out.println("\n");
        }
    }
    
}
