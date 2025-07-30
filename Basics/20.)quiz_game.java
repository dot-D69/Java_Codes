import java.util.Scanner;

public class quiz_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Questions Array
        String[] questions = {"1. What is the capital of France?",
                                "2. Who is the president of the United States?",
                                "3. What is the largest planet in our solar system?",
                                "4. Who wrote 'Romeo and Juliet'?",
                                "5. What is the boiling point of water in Celsius?"};

        // Answers Array
        String[][] options = {
            {"A) Paris", "B) London", "C) Berlin", "D) Madrid"},
            {"A) Joe Biden", "B) Donald Trump", "C) Barack Obama", "D) George W. Bush"},
            {"A) Earth", "B) Jupiter", "C) Saturn", "D) Mars"},
            {"A) Mark Twain", "B) William Shakespeare", "C) Charles Dickens", "D) Jane Austen"},
            {"A) 90", "B) 100", "C) 80", "D) 120"}
        };

        // Correct Answers Array
        String[] correctAnswers = {"A", "A", "B", "B", "B"};
        int score = 0;
        String guess;

        // Welcome message
        System.out.println("#############################");
        System.out.println("Welcome to the Quiz Game!");
        System.out.println("#############################");

        for(int i =0;i<questions.length;i++){
            System.out.println(questions[i]);
            for(int j=0;j<options.length-1;j++){
                System.out.print(options[i][j]+ " ");
            }
            System.out.println("\n");
            System.out.print("Enter your answer:");
            System.out.println("\n");
            guess = sc.nextLine();
                if(correctAnswers[i].equals(guess)){
                    score++;
                    System.out.println("*************");
                    System.out.println("You are correct");
                    System.out.println("*************");

                }
                else{
                    if(score == 0){
                        score = 0;
                    }
                    score --;
                    System.out.println("*************");
                    System.out.println("That is the wrong answer. Correct answer is:"+ correctAnswers[i]);
                    System.out.println("*************");
                }
        System.out.println("\n");
        }

        System.out.println("Your Score is: "+score+ " out of "+ questions.length);
        System.out.println("Thanks for getting involved in this foolishery");

    sc.close();
    }
    
}
