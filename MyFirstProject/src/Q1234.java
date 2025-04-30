import java.util.Scanner;
import java.util.Random;

public class Q1234 {
    public static void main(String[] args) {

/*
Scanner sc = new Scanner(System.in);
System.out.print("enter a colour:");
        String colour = sc.nextLine();

        if (colour.equals("blue")) {
           System.out.print("YOU WON:");}
        else if (colour.equals("red")) {
        System.out.print("YOU CAME SECOND:");}
        else if (colour.equals("green")) {
        System.out.print("You came third");}
        else if (colour.equals("yellow")) {
            System.out.print("YOU LOST");}
        else {
            System.out.print("better luck next time");
        }

 */

/*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a limit: ");
        int limit = scanner.nextInt();
        boolean number = true;

        for (int num = 1; num <= limit; num += 3) {

            if (!number) {
                System.out.print(",");
            }
            System.out.print(num);
            number = false;
        }


        scanner.close();

        */
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        if (num == 21 || num == 32) {
            System.out.println("You have triggered a forbidden number!");
        }
        else {
            int i = 1;
            while (i <= 10) {
                System.out.println(num + " X " + i + " = " + (num * i));
                i++;
            }

        }


 */


        Random random = new Random();
        Scanner sc = new Scanner(System.in);

                int num1 = random.nextInt(101);
        int num2 = random.nextInt(101);
        int correctAnswer = num1 + num2;

        int attempts = 4;

        System.out.println("Solve: " + num1 + " + " + num2);

        while (attempts > 0) {
            System.out.print("Your answer: ");

            if (sc.hasNextInt()) {
                int userAnswer = sc.nextInt();

                if (userAnswer == correctAnswer) {
                    System.out.println("Congratulations! You got it right.");
                    break;
                } else {
                    attempts--;
                    if (attempts > 0) {
                        System.out.println("Incorrect. You have " + attempts + " attempt(s) left.");
                    } else {
                        System.out.println("Sorry, you're out of attempts. The correct answer was " + correctAnswer + ".");
                    }
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // Clear the invalid input
            }
        }

        sc.close();



        }
    }









