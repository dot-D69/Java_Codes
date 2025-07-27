import java.util.Scanner;
import java.util.Random;

public class dice_roller {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Declare variables
        int Dice;
        int total = 0;
        // get no. of dice 
        System.out.print("Enter the number of dice to roll: ");
        Dice = sc.nextInt();
        System.out.println("\n");

        //check if no. of dice>0
        if(Dice>0){
            //roll all the dice
            for(int i=0;i<Dice;i++){
                int roll = rand.nextInt(1,7);
                System.out.println("You rolled: "+roll+"\n");
                printdice(roll);
                total+=roll;
            }
            System.out.println("Total: "+total);
        }else{
            System.out.println("No. of dice cannot be 0.");
        }
        sc.close();
    }

    //Display ASCII of dice
    static void printdice(int roll){
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String dice2 = """
                 -------
                |       |
                | ●  ●  |
                |       |
                 -------
                """;
        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;
        String dice4 = """
                 -------
                | ●    ●|
                |       |
                |●     ●|
                 -------
                """;
        String dice5 = """
                 -------
                |●     ●|
                |   ●   |
                |●     ●|
                 -------
                """;
        String dice6 = """
                 -------
                |●     ●|
                |●     ●|
                |●     ●|
                 -------
                """;
        
        switch(roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default ->System.out.println("Invalid roll");
        }
    }
}
