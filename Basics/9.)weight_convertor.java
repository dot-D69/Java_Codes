import java.util.Scanner;
public class weight_convertor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Hello! This is Weight convertor, But you should use google like normal people.");
        System.out.println("There are Three options available:\n1. Convert Kgs to Lbs.\n2. Convert Lbs to Kgs \n3. To exit the Program enter 0.");
        boolean isActive = true; // 
        while(isActive){
        System.out.print("Enter your choice(1/2/0):");
        int Options = sc.nextInt();
        double kgs;
        double lbs;
        switch (Options) {
            case 1:
                System.out.print("Please Enter the weight(in Kgs) you wish to convert: ");
                kgs=sc.nextDouble();
                lbs = kgs*2.204;
                System.out.printf("The weight in pounds is %.2f\n",lbs);
                break;
            case 2:
                System.out.print("Please Enter the weight(in Lbs) you wish to convert: ");
                lbs= sc.nextDouble();
                kgs = lbs*0.453;
                System.out.printf("The Weight in Kilos is %.2f\n",kgs);
                break;
            case 0:
                isActive = false;
                break;
            default:
                System.out.println("This input is invalid");
                break;
        }
    }
    System.out.println("Congrats you have wasted both of our times!, Please don't do this again");
        sc.close();
    }
}
