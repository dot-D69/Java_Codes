public class Conditionals {
    public static void main(String[] args) {
        // Example of a simple conditional statement
        int age = 20;
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else if (age >= 13) {
            System.out.println("You are a teenager.");
        } else if (age >= 0) {
            System.out.println("You are a child.");
        } else {
            System.out.println("You are a minor.");
        }

        // Example of a switch statement
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("It's the start of the week.");
                break;
            case "Friday":
                System.out.println("It's almost the weekend!");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("It's a regular weekday.");
        }

        // Enhanced switch statement (Java 12+)
        String month = "April";
        switch (month) {
            case "January", "February", "March" -> System.out.println("It's the first quarter of the year.");
            case "April", "May", "June" -> System.out.println("It's the second quarter of the year.");
            case "July", "August", "September" -> System.out.println("It's the third quarter of the year.");
            case "October", "November", "December" -> System.out.println("It's the fourth quarter of the year.");
            default -> System.out.println("Invalid month.");
        }

        // ternary operator

        int score = 70;

        String result = (score >= 60) ? "Pass" : "Fail";
        System.out.println(result);

        int num = 3;
        String check = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(check);

    }

}
