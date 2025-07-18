public class nested_conditonals {
    public  static void main(String[] args){
    boolean isStudent = false;
    boolean isSenior = false;
    boolean isMember = false;


        // Calculate ticket price based on conditions

    double ticketPrice = 20.0;
        if (isStudent) {
            if(isMember) {
                System.out.println("You are eligible for a member discount.");
               ticketPrice *= 0.8; // Student member discount
            } else {
                System.out.println("You are eligible for a student discount.");
               ticketPrice *= 0.9; // Student non-member price
            }
        } else if (isMember) {
            if (isSenior) {
                System.out.println("You are eligible for a member and senior discount.");
                ticketPrice *= 0.7; // Member senior discount
            } else {
                System.out.println("You are eligible for a member discount.");
                ticketPrice *= 0.8; // Member non-senior price
            }
        } else {
            if(isSenior) {
                System.out.println("You are eligible for a senior discount.");
               ticketPrice *= 0.5; // Senior discount
            } else {
                System.out.println("You are not eligible for any discounts.");
               ticketPrice *= 1.0; // Regular price
            }
        }

        System.out.printf("Final ticket price: $%.2f%n", ticketPrice);

    }
}
