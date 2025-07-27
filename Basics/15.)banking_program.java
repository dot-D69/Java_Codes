import java.util.Scanner;

public class banking_program {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        

        // Declare variables
        double balance = 10000.0; // Class variable to hold the balance
        int choice; // Variable to hold the user's choice   
        boolean running = true; // Variable to control the loop 
        System.out.println("----------------------");
        System.out.println("Banking Menu:");
        System.out.println("-----------------------");
    while(running){
        // Display the menu
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("-----------------------");

        // Get user choice
        System.out.print("Enter your choice (1-4): ");
        choice = sc.nextInt();

        switch (choice) {
            case 1 -> showBalance(balance);
            case 2 -> balance += Deposit();
            case 3 -> balance -= Withdraw();
            case 4 -> running = false;
            default -> System.out.println("Invalid choice");
        }
    }
        System.out.println("Hey yaba doodle doo");
        System.out.println("La di da");
        
    }

    static void showBalance(double balance){
        System.out.println("Displaying Balance");
        System.out.println("Balance: $"+balance);
        System.out.println("       ");
    }

    static double Deposit(){
        System.out.println("Depositing:");
        System.out.print("Enter the amount to deposit:");
        double amount = sc.nextDouble();
        System.out.println("An amount of "+amount+" have been deposited to your account");
        System.out.println("       ");
        return amount;
    }

    static double Withdraw(){
        System.out.println("Withdrawal");
        System.out.print("Enter the amount to be withdrawn:");
        double amount = sc.nextDouble();
        System.out.println("An amount of "+amount+" have been withdrwan from your account");
        System.out.println("       ");
        return amount;
    }

}
