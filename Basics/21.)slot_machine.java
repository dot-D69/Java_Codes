import java.util.Random;
import java.util.Scanner;

public class slot_machine{
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        //Declare Variables
        int balance;
        int bet;
        int payout;
        String[] row;
        
        // Display Welcome Message
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        System.out.println("   Welcome to detox version of gambling   ");
        System.out.println("Symbols: 🔔 🍉 🍓 🍑 💦");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        System.out.print("How much would you like to deposit:");
        balance = sc.nextInt();
        sc.nextLine();


        //Play if Balance >0
        while(balance>0){
            System.out.println("Your Balance is: $"+balance);
            // Enter bet Amount
            System.out.print("Enter the amount you want to Bet: ");
            bet = sc.nextInt();
            //Verify if bet > balance
            if (bet>balance) {
                System.out.println("Insufficient Funds");
                continue;
            }else if (bet<0) {
                System.out.println("You can't bet 0 $");
            }else{
            balance-=bet;
            }

            //Spin row
            System.out.println("Spinning");
            row = spinRow();

            //Display row
            printRow(row);

            // Get Payout
            payout = getPayout(row,bet);
            if(payout>0){
                System.out.println("You won: $" + payout);
                balance += payout; 
            }
            else {
                System.out.println("You lost: $" + bet);
            }

            // Ask to Play again
            System.out.print("Do you want to play again? (Y/N): ");
            char response = sc.next().charAt(0);
            sc.nextLine(); // Consume newline character
            if(response != 'Y' && response != 'y'){
                break;
            }   
        }

        sc.close();
        System.out.println("Thank you for playing! Your final balance is: $" + balance);
    }

    static String[] spinRow(){
        String[] symbols = {"🔔" ,"🍉", "🍓", "🍑", "💦"};
        String[] row = new String[3];
        Random rand = new Random();

        for(int i =0;i<row.length;i++){
            row[i] = symbols[rand.nextInt(symbols.length)];
        }

        return row;
    }

    static void printRow(String[]row){
        System.out.println("#########################");
        System.out.println(" "+ String.join("|",row));
        System.out.println("#########################");

    }

    static int getPayout(String[] row, int bet){

        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return bet * 10;
        }
        else if(row[0].equals(row[1]) || row[1].equals(row[2]) || row[0].equals(row[2])){
            return bet * 2;
        }   
        else {
            return 0;
        }
    }
}
