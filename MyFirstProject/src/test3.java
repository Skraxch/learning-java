import java.util.Scanner;
import java.util.Random;

public class test3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();


        int num1 = rand.nextInt(20)+1;
        int correctAnswer = num1;

        int randTotal = num1;

        int guess = 1;
        System.out.println("Guess a number between 1 and 20");

        while (guess > 0) {
            System.out.print("Your answer: ");

            if (sc.hasNextInt()) {
                int userAnswer = sc.nextInt();


                    if (userAnswer > correctAnswer) {
                        System.out.println("Higher.");

                        if (userAnswer < correctAnswer) {
                            System.out.println("Lower.");

                        } else {
                            guess++;
                            if (guess > 0) {
                                System.out.println("Wrong. ");
                                if (userAnswer == correctAnswer) {
                                    System.out.println("Congratulations! You got it right.");
                            }


                            sc.next();
                            return;
                        }


                    }
                }
            }
        }
    }
}

