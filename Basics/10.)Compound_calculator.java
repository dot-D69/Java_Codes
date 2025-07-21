import java.util.Scanner;
public class Compound_calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double principal;
        double rate;
        int timesCompounded;
        int time;
        double amount;
        System.out.print("Enter the Principal amount:");
        principal = sc.nextDouble();
        System.out.print("Enter the interest rate (in %):");
        rate = sc.nextDouble() / 100;
        System.out.print("Enter the # of times Compounded per year(Yearly[1], quarterly[4], monthly[12]):");
        timesCompounded = sc.nextInt();
        System.out.print("Enter the no. of years: ");
        time = sc.nextInt();

        amount = principal*Math.pow(1+rate/timesCompounded, timesCompounded*time);
        System.out.println("The amount after "+ time + " is: $ "+ amount);
        sc.close();
    }
}
