
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;


public class Main {

    //JAVA BANKING PROGRAM FOR NEWBIES
    //"Move it from local scope and put it within a class scope"
    // "assessible to the whole program and avoid numerous scanners"

    //static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // My first test

        /*
        This
        is
        a
        multi-line
        comment
         */

        //System.out.print("Hello World\n");
        //System.out.print("Here is some text\n");
        //System.out.print("Here is another text");
        //System.out.println();

        // LESSON 2

        //int age = 21;
        //int year = 2025;
        //int quantity = 1;

        //double price = 19999.99;
        //double gpa = 3.5;
        //double temperature = 12.5;

        //char grade =  'A';
        //char symbol = '!';
        //char currency = '$';

        //boolean isStudent = false;
        //boolean forSale = false;
        //boolean isOnline = true;

        //String name = "Bro Code";
        //String food = "pizza";
        //String email = "brocode@gmail.com";
        //String car = "Ford";
        //String color = "red";

        //System.out.println("Your choice is " + color + " " + year + " " + car);
        //System.out.println("The price is " + currency + price);

        //if(forSale){
        //System.out.println("There is a " + car + "for sale");
        //}
        //else{
        //System.out.println("The " + car + " is not for sale");

        // LESSON 3 (import java.util.Scanner; is placed)

        //Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter your name: ");
        //String name = scanner.nextLine();

        //System.out.print("Enter your age: ");
        //int age = scanner.nextInt();

        //System.out.print("What is your gpa: ");
        //double gpa = scanner.nextDouble();

        //System.out.print("Are you a student? (true/false): ");
        //boolean isStudent = scanner.nextBoolean();

        //System.out.println("Hello " + name);
        //System.out.println("You are " + age + " years old");
        //System.out.println("Your gpa is: " + gpa);

        //if (isStudent) {
        //System.out.println("You are enrolled as a student");
        //}
        //else{
        //    System.out.println("You are NOT enrolled");
        //}

        //scanner.close();


        //LESSON 4 MAD LIBS GAME

        //Scanner scanner = new Scanner(System.in);

        //String adjective1;
        //String noun1;
        //String adjective2;
        //String verb1;
        //String adjective3;

        //System.out.print("Enter an adjective (description): ");
        //adjective1 = scanner.nextLine();
        //System.out.print("Enter a noun (person or animal): ");
        //noun1 = scanner.nextLine();
        //System.out.print("Enter an adjective (description): ");
        //adjective2 = scanner.nextLine();
        //System.out.print("Enter a verb end with -ing (action): ");
        //verb1 = scanner.nextLine();
        //System.out.print("Enter an adjective (description): ");
        //adjective3 = scanner.nextLine();


        //System.out.println("\nToday I went to a " + adjective1 + " zoo.");
        //System.out.println("In a exhibit, I saw a " + noun1 + ".");
        //System.out.println(noun1 + " was " + adjective1 + " and " +verb1 + "!");
        //System.out.println("I was " + adjective3 + "!");


        //LESSON 5: SHOPPING CART PROGRAM
        //Scanner scanner = new Scanner(System.in);


        //String item;
        //double price;
        //int quantity;
        //char currency = '$';
        //double total;

        //System.out.print("What item do you want to buy?: ");
        //item = scanner.nextLine();

        //System.out.print("What the price for each?: ");
        //price = scanner.nextDouble();

        //System.out.print("How many do you want to buy?: ");
        //quantity = scanner.nextInt();

        //total = price * quantity;
        //System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        //System.out.println("Total price is " + currency + total);

        //scanner.close();

        // LESSON 6: If statement = performs a block of code if its condition is true

        //Scanner scanner = new Scanner(System.in);

        //String name;
        //int age;
        //boolean isStudent;

        /* System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a student? (true/false): ");
        isStudent = scanner.nextBoolean();

        //GROUP 1
        if (name.isEmpty()){
            System.out.println("You did not enter a name.");
        }
        else{
            System.out.println("Hello, " + name + "!");
        }

        //GROUP 2

        if(age >= 65){
            System.out.println("You are a Boomer!");
        }
        else if(age >= 18){
            System.out.println("You are an Adult!");
        }
        else if (age < 0){
            System.out.println("You haven't been born yet");
        }
        else if(age == 0){
            System.out.println("Your a baby!");
        }
        else{
            System.out.println("You are a child!");

        }

        //GROUP 3

        if(isStudent){
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You are not a student!");
        }

        scanner.close(); */

        //LESSON 7: Always add an extra as the number will be exclusive.
        //Random rand = new Random();

        /*
        int number1;
        int number2;
        int number3 ;

        number1 = rand.nextInt(1,101);
        number2 = rand.nextInt(1,101);
        number3 = rand.nextInt(1,101);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);


        //Double or BooLean

        boolean isHeads;

        isHeads = rand.nextBoolean();

        if(isHeads){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }
        */

        //LESSON 8

        //System.out.println(Math.PI);
        //System.out.println(Math.E);

        /* double result;

        result = Math.pow(2,3);
        result = Math.abs(-5);
        result = Math.sqrt(9);
        result = Math.round(3.14);
        result = Math.ceil(3.14);
        result = Math.floor(3.99);
        result = Math.max(10,20);
        result = Math.min(10,20);

        System.out.println(result);

         */

        // HYPOTENUSE c = Math.sqrt (a^2 + b^2)

        /*
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt (Math.pow(a,2) + Math.pow(b,2));

        System.out.println("The hypotenuse (side c) is: " + c + "cm");

        scanner.close();

         */

        // circumference = 2 * Math.PI * Radius;
        //area = Math.PI * Mathpow(radius, 2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius,3)

        /*
        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius,2);
        volume = 4.0 / 3.0 * Math.PI * Math.pow(radius,3);

        System.out.printf("The circumference is %.1fcm\n" , circumference);
        System.out.printf("The area is %.1fcm^2\n", area);
        System.out.printf("The volume is %.1fcm^3\n", volume);

        scanner.close();

         */

        // printf() used to format output (Alt to print and println)

        // %[flags][width][.precision][specifier-character]

        /*
        String name = "Spongebob";
        char firstletter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);

        //lowercase c if char "%c"
        // %s: Strings
        // %c: char
        // %d: int
        // %f: double
        // %b: boolean

        System.out.printf("Your name starts with %c\n", firstletter);
        System.out.printf("Your are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old", name, age);

         */

        // [flags]

        /*
        + = output a plus
        , = comma grouping separator
        ( = negative numbers are enclosed in ()
        space = display a minus if negative, space if positive
         */

        /*
        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("% .2f\n", price1);
        System.out.printf("% .2f\n", price2);
        System.out.printf("% .2f\n", price3);

         */

        // 0 = zero padding
        //number = right justified padding
        //negative number = left justified padding
/*
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);

1:56:18
 */

        // Compound interest calc

        /*
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        //System.out.printf("The amount after " + years + " is: $" + amount);
        // INSTEAD
        System.out.printf("The amount after %d years is $%.2f", years, amount);

        scanner.close();
         */

        /*
        boolean isStudent = true;
        boolean isSenior= true;
        double price = 9.99;

        if (isStudent) {
            if (isSenior) {
                System.out.println("You get a senior discount of %20");
                System.out.println("You get a senior discount of %10");
                price *= 0.7;

            }
            else {
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }
        }
        else{
            if (isSenior) {
                System.out.println("You get a senior discount of %20");
                price *= 0.8;
            }

        }
        System.out.printf("The price of a ticket is $%.2f", price);
        */

// String methods

        /* String name = "l";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf(" ");
        int lastIndex = name.lastIndexOf("o");

         */

        //name = name.toUpperCase();
        //name = name.toLowerCase();
        //name = name.trim();

        //trim removes space

        //name = name.replace("o","a");

/*
     if (name.isEmpty()){
         System.out.println("your name is empty");

     }
     else{
         System.out.println("hello " + name);

     }



        if(name.contains(" ")){
            System.out.println("your name contains spaces");

        }
        else{
            System.out.println("Your name does not contain any spaces");
        }

        if (name.equals("password")) {

            System.out.println("Your name cannot be password");
        } else {
            System.out.println("Hello " + name);

        }
*/
        //Sub Strings
        // .substring() = a method used to extract a portion of a string
        // .substring(start, end)

       /* Scanner sc = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email address: ");

        email = sc.nextLine();

        if (email.contains("@")) {

            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println(username);
            System.out.println(domain);
        }
        else {
            System.out.println("You have entered an invalid email address");
        }


        */

//Weight conversion Program

        /*
        Scanner sc = new Scanner(System.in);

        // Declare variables
        double weight;
        double newWeight;
        int choice;

        // Welcome message
        System.out.println("Weight conversion program");
        System.out.println("1: convert lbs to kgs");
        System.out.println("2: convert lbs to kgs");

        // Prompt for user choice
        System.out.print("choose an option: ");
        choice = sc.nextInt();

        // 1 convert lbs to kgs
        // 2 convert kgs to lbs
        if (choice == 1) {
            System.out.print("Enter weight in lbs: ");
            weight = sc.nextDouble();
            newWeight = weight * 0.453592;
        System.out.printf("New weight in kgs is: %.2f", newWeight);
        }
        else if (choice == 2) {
            System.out.print("Enter weight in lbs: ");
            weight = sc.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f", newWeight);
        }

            // Else print not a valid choice
        else{
            System.out.println("Invalid option");
        }
        sc.close();
*/

        //Ternary operator ? = Return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

       /* int score = 70;

        if(score >= 60){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }

        */
        /*
        int score = 0;
        String passOrFail = (score >= 60) ? "PASS" : "FAIL";
        System.out.println(passOrFail);

         */
/*
int number = 2;
String evenOrOdd = (number % 2 == 0) ? "even" : "odd";
        System.out.println(evenOrOdd);

 */
/*
        int hours = 13;
        String timeOfDay = (hours < 12) ? "AM" : "PM";
        System.out.println(timeOfDay);

 */
       /*  int income = 30000;
        double taxRate = (income >= 400000) ? 0.25 : 0.15;
        System.out.println(taxRate);

        */

/*
        Scanner sc = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = sc.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = sc.next().toUpperCase();

       // (condition)? true : false
        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5/9) + 32;

        System.out.printf("%.1f° %s", newTemp, unit);

        sc.close();

 */

        //Enhanced switch = a replacement to many else if statements (Java14 feat)

        /*
        String day = "Sunday";

        if(day.equals("Monday")){
            System.out.println("It is a weekday");
        }
        else if(day.equals("Tuesday")){
            System.out.println("It is a weekday");
        }
        else if(day.equals("Wednesday")){
            System.out.println("It is a weekday");
        }
        else if(day.equals("Thursday")){
            System.out.println("It is a weekday");
        }
        else if(day.equals("Friday")){
            System.out.println("It is a weekday");
        }
        else if(day.equals("Saturday")){
            System.out.println("It is a weekend");
        }
        else if(day.equals("Sunday")){
            System.out.println("It is a weekend");
        }

         */
        /*
        //Instead use

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the day of the week: ");
        String day = sc.nextLine();

        //day.toUppercase();

        switch (day) {
            case "monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                    System.out.println("It is a weekday");
            case "Saturday", "Sunday" ->
                    System.out.println("It is a weekend");

            default -> System.out.println(day + " not a day");

        }

         */
        /*
        //CALCULATOR
        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperation = true;

        System.out.println("Enter the first number: ");
        num1 = sc.nextDouble();

        System.out.println("Enter an operator (+, -, *, /, ^): ");
        operator = sc.next().charAt(0);

        System.out.println("Enter the second number: ");
        num2 = sc.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0){
                    System.out.println("Cannot divide by zero");
                    validOperation = false;
                }
                else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator");
                validOperation = false;
            }
        }

        if(validOperation){
            System.out.println(result);
        }

            sc.close();

         */

        //LOGICAL OPERATORS

        // && = AND
        // || = OR
        // ! = NOT
/*
        double temp = -30;
        boolean isSunny = true;

        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is GOOD ");
            System.out.println("It is Sunny outside ");
        }
        else if(temp <= 30 && temp >= 0 && !isSunny){
            System.out.println("The weather is GOOD ");
            System.out.println("It is Cloudy outside ");

        } else if (temp > 30 || temp < 0) {
            System.out.println("The weather is BAD ");

 */
        // SECOND EXAMPLE
        /*

        Scanner sc = new Scanner(System.in);

            //username must be between 4-12 characters, no spaces or underscores.
        String username;
        System.out.println("Please enter your username: ");
        username = sc.nextLine();

        if(username.length() <4 || username.length() > 12) {
            System.out.println("Invalid username, must be between 4-12 characters ");
        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Invalid username, must not contain spaces or underscores. ");
            
        } else {
            System.out.println("Welcome " + username);
        }

         */

        // while loop = repeats some code 4ever
        // while some condition remains true

       /* Scanner sc = new Scanner(System.in);

        String name = "";

        while(name.isEmpty()){
            System.out.println("Please enter your name");
            name = sc.nextLine();
        }

        System.out.println("Hello " + name);
        sc.close();

        */

        /*
       Scanner scanner = new Scanner(System.in);

       String response = "";
       while(!response.equals("L")) {
           System.out.println("Stuck?");
           System.out.print("L 2 Quit: ");
           response = scanner.nextLine().toUpperCase();
       }
        System.out.println("You have left!");

         */

        /*
        Scanner scanner = new Scanner(System.in);
        int age = 0;

        do {
            System.out.println("Your age is not negative");
            System.out.println("Enter your age: ");
            age = scanner.nextInt();
        } while (age < 0);


        System.out.println("You are " + age + " years old.");
        scanner.close();

         */

        //INSTEAD OF (BELOW) you can check it at the end (while)
/*
        Scanner scanner = new Scanner(System.in);

        int number = 0;

        //while(number < 1 || number > 10){ [ADD DO and move it to bottom]

        do{
            System.out.print("Please enter a number between 1 and 10: ");
            number = scanner.nextInt();
        } while(number < 1 || number > 10){

        }
        System.out.println("You entered " + number);
        scanner.close();

 */
// NUMBER GUESSING GAME
        /*
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = rand.nextInt(min, max + 1);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n", min, max);

        do{
            System.out.println("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("Your number is too low!");
            }
            else if(guess > randomNumber){
                System.out.println("Your number is too high!");
            }
            else{
                System.out.println("Your number is correct!");
                System.out.println("Number of attempts: " + attempts);
            }

        }while(guess != randomNumber);
        scanner.close();


         */

        // For loop = execute some code a CERTAIN amount of times
        /*
        for(int i = 10; i > 0; i-=3){
            System.out.println(i);
        }

         */

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for(int i = 1; i <= max; i++) {
            System.out.println(i);
        }

        scanner.close();

         */

        //For Threads, gotta add "throws InterruptedException" behind args
/*
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many seconds to countdown from?: ");
        int start = scanner.nextInt();

        for(int i = start; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("Happy New Year");

 */
        // break = break out of a loop (stop)
        // continue = skip current iteration of a loop (skip)

        /*
        for(int i = 0; i < 10; i++) {
            if (i == 5){
                break;
            }
            System.out.print(i + " ");

        }

         */

        // nested loop = A loop inside another loop
        // Used often with matrices or DS&A

        /*
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
         */
/*
        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Please enter the # of rows: ");
        rows = scanner.nextInt();

        System.out.print("Please enter the # of columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbol = scanner.next().charAt(0);

        for(int i = 1; i < rows; i++){
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
        scanner.close();

 */
        // method = a block of reusuable code that is executed when called ()

        /*
        String name = "Kai";
                int age = 19;

        happyBirthday(name, age);

    }
        static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");

         */
//Instead of getFullName("Spongebob", "Squarepants"); do whats below.

        /*

        String fullName = "Spongebob Squarepants";
        System.out.println(fullName);
    }

    static void happyBirthday(String name, int age) {
    }

    static double square(double number) {
        return number * number;
    }

    static double cube(double number) {
        return number * number * number;
    }

    static String getFullName(String first, String last) {
        return first + " " + last;

         */

        /*
    int age = 19;

            if(ageCheck(age)){
                System.out.println("You may sign up");
            }
            else{
                System.out.println("You must be 18+ to sign up");
            }
    }

    static void happyBirthday(String name, int age) {
    }

    static double square(double number) {
        return number * number;
    }

    static double cube(double number) {
        return number * number * number;
    }

    static String getFullName(String first, String last) {
        return first + " " + last;
    }
    static boolean ageCheck(int age) {
        if (age >= 18){
            return true;
        }
        else{
            return false;
        }

         */

        // overloaded methods = methods that share the same name but diff parameters
        // signature = name + parameters
/*
        System.out.println(add(1,2, 3, 4));
    }
    static double add(double a, double b) {
        return a + b;
    }
    static double add(double a, double b, double c) {
        return a + b + c;
    }
    static double add(double a, double b, double c, double d) {
        return a + b + c + d;

 */
        /*
        String pizza = bakePizza("flat bread", "mozzarella", "pepperoni");
        System.out.println(pizza);
    }
    static String bakePizza(String bread) {
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese) {
        return cheese + " " + bread + " pizza";
    }
    static String bakePizza(String bread, String cheese, String topping) {
        return topping + " " + cheese + " " + bread + " pizza";

         */
        // variable scope = where a variable can be accessed.

        // static int x = 3; CLASS (STICK WITH LOCAL BUT SOMETIMES CLASS - constants)

        /*
        int x = 1; //local variable

        System.out.println(x);

       doSomething();
    }
    static void doSomething() {
        int x = 2; //local variable

        System.out.println(x);

         */

        // JAVA BANKING PROGRAM FOR NEWBIES

        // DECLARE VARIABLES

        //"Move scanner sc from local scope and put it within a class scope AKA above public"
        // "assessible to the whole program and avoid numerous scanners"

        /*
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            // DISPLAY MENU
            System.out.println("***********");
            System.out.println("Banking Program");
            System.out.println("***********");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***********");

            // GET AND PROCESS USERS CHOICE
            System.out.println("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }
        }


        // showBalance()

        // deposit()

        // withdraw()

        // EXIT MESSAGE

        System.out.println("***********");
        System.out.println("Exiting Program");
        System.out.println("***********");
        scanner.close();
    }
    static void showBalance(double balance) {
        System.out.println("***********");
        System.out.printf("$%.2f\n", balance);
    }
    static double deposit(){

        double amount;
        System.out.print("Enter an amount to deposit: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }

    }
    static double withdraw(double balance){
        double amount;

        System.out.print("Enter an amount to withdraw: ");
        amount = scanner.nextDouble();

        if (amount > balance){
            System.out.println("insufficient funds");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
}

         */

        //JAVA DICE ROLLER PROGRAM
/*
        //DECLARE VARIABLES
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int numOfDice;
        int total = 0;

        //GET # OF DICE FROM USER
        System.out.print("Enter the number of dice to roll: ");
        numOfDice = scanner.nextInt();

        //CHECK IF # OF DICE > 0
           if(numOfDice > 0){
               for(int i = 0; i < numOfDice; i++){
                   int roll = rand.nextInt(1,7);
                   printDie(roll);
                   System.out.println("You rolled " + roll);
                   total += roll;
           }
               System.out.println("The total is " + total);
        }
        else{
            System.out.println("# of dice must be greater than 0");
        }

        //ROLL ALL THE DICE AND TOTAL AKA IT WORKS!

        //DISPLAY ASCII OF DICE

        scanner.close();

    }
    static void printDie(int roll){
        String dice1 = """
                ------ 
               |      |
               |   •  |
               |      |
                ------ 
                """;

        String dice2 = """
                ------ 
               |  •   |
               |   •  |
               |      |
                ------ 
                """;

        String dice3 = """
                ------ 
               | •     |
               |   •  |
               |    •  |
                ------ 
                """;

        String dice4 = """
                ------ 
               | •   • |
               |       |
               | •   • |
                ------ 
                """;

        String dice5 = """
                ------ 
               | •   • |
               |   •  |
               | •   • |
                ------ 
                """;

        String dice6 = """
                ------ 
               | •   • |
               | •   • |
               | •   • |
                ------ 
                """;

        switch(roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);

        }
    }
}

 */

        //Arrays - Collection of values of the same data type
        //Think of it as a variable that can store >1 value

       /*
        String[] fruits = {"apple", "orange", "banana", "coconut"};

        //fruits[0]= "pineapple";
                //fint numOfFruits = fruits.length;

        //Arrays.sort(fruits);
        //Arrays.fill(fruits, "pineapple");

        // for(int i = 0; i < fruits.length; i++) {
        //            System.out.print(fruits[i] + " ");

       //ENHANCED FOR LOOP
        for(String fruit : fruits){
           System.out.println(fruit);
       }

        */

        //ENTER USER IMPUT INTO ARRAY
/*
        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int size;

        System.out.println("What number of foods you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

    for(int i = 0; i < foods.length; i++){
        System.out.print("Enter food name: ");
        foods[i] = scanner.nextLine();
    }
        for(String food : foods){
            System.out.println(food);
        }
        scanner.close();

 */

        /*
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        String[] fruits = {"apple", "orange", "banana"};
        boolean isFound = false;
        String target;

        System.out.print("Enter a fruit to search: ");
        target = scanner.nextLine();


        for (int i = 0; i < fruits.length; i++){
if (fruits[i].equals(target)){
    System.out.println("Element found at index: " + i);
    isFound = true;
    break;
}
        }
        if(!isFound){
            System.out.println("Element not found");
        }
    scanner.close();

         */
        //varargs = allow a method to accept a varying # of arguments
        //makes methods for flexible, no need for overloaded methods
        //java will pack the arguments into an array
        //... (ellipsis)
/*
        System.out.println(average());
    }
static double average(double... numbers) {
        double sum = 0;
        if (numbers.length == 0){
            return 0;
        }

        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}
 */

        //2D array = an array where each element is an array
        // useful for storing a matrix of data

/*

        String[][] groceries = {{"apple", "banana", "orange"},
            {"potatoes", "carrots", "onions"},
            {"chicken", "pork", "fish", "beef"}};

        groceries[1][0] = "papple";

        for(String[] foods : groceries) {
            for(String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }

 */
        /*
        char[][] telephone = {{'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}};

        for(char[] row : telephone) {
            for(char number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

         */
//JAVA QUIZ GAME
        /*
        //INSTRUCTIONS:
        //OPTIONS array[]
        //DECLARE VARIABLES
        //WELCOME MSG
        //QUESTIONS (loop)
        //OPTIONS
        //GET GUESS FROM USER
        //CHECK OUR GUESS
        //DISPLAY FINAL SCORE

        String[] questions = {"What is the main function of a router?",
                "Which part of the computer is considered the brain",
                "When was FB launched",
                "Who is the father of the computer?",
                "What was the first programming language?",};

        String[][] options = {{"1. Storing files", "2. Encrypting Data", "3. Directing internet traffic", "4. Managing passwords"},
            {"1. CPU", "2. Hard drive", "3. RAM", "4. GPU"},
            {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
            {"1. Steve", "2. Bill", "3. Alan", "4. Charles"},
            {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}};

        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("*****************************");
        System.out.println("Welcome to the JAVA quiz game");
        System.out.println("*****************************");

        for (int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(String option : options[i]){
                System.out.println(option);
            }
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                System.out.println("*****************************");
                System.out.println("Congratulations! You got it!");
                System.out.println("*****************************");
                score++;
            }
            else{
                System.out.println("Wrong guess!");
            }
        }


        System.out.println("your score is " + score + " out of " + questions.length);
        scanner.close();

         */

        // RPS GAME
/*
        // DECLARE VARIABLES
            Scanner scanner = new Scanner(System.in);
            Random rand = new Random();

            String[] choices = {"rock", "paper", "scissors"};
            String playerChoice;
            String opponentChoice;
            String playAgain = "Yes";

            do{
            // GET CHOICE FROM USER
            System.out.print("Please enter your choice (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")) {
                System.out.println("You entered an invalid choice. Please try again.");
                continue;
            }
            // GET RANDOM CHOICE FOR COMPUTER
            opponentChoice = choices[rand.nextInt(3)];
            System.out.println("Computer choice: " + opponentChoice);

            // CHECK WIN CONDITIONS
            if (playerChoice.equals(opponentChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equals("rock") && opponentChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && opponentChoice.equals("rock")) ||
                    playerChoice.equals("scissors") && opponentChoice.equals("paper")) {
                System.out.println("It's a win!");
            } else {
                System.out.println("It's a loss!");
            }
            // ASK TO PLAY AGAIN
            System.out.println("Wanna play again? (Y/N)");
            playAgain = scanner.nextLine().toLowerCase();

        }while(playAgain.equals("y"));

// CYA MSG
        System.out.println("Thank you for playing!");

        scanner.close();

 */

        //JAVA SLOT MACHINE (BROKEN??)f

        /*
        // DECLARE VARIABLES
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        // DISPLAY WELCOME MSG
        System.out.println("*************************");
        System.out.println(" Welcome to the game of Java Slot ");
        System.out.println(" Symbols: 🍒 🍉 🍋 🛎️ ⭐️ ");
        System.out.println("*************************");

        // PLAY IF BALANCE > 0
        // ENTER BET AMOUNT
        while (balance > 0) {
            System.out.println("Current balance: " + balance);
            System.out.print("Enter the amount to bet: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            // VERIFY IF BET > BALANCE
            // VERIFY IF BET > 0
            // SUBTRACT BET FROM BALANCE
            if (bet > balance) {
                System.out.println("Insufficient funds!");
                continue;
            } else if (bet <= 0) {
                System.out.println("Bet must be greater than 0!");
            } else {
                balance -= bet;

            }
            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if (payout > 0) {
                System.out.println("You won $" + payout);
                balance += payout;
            }
            else{
                System.out.println("You lost!");
            }
            System.out.print("Would you like to play again? (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();
            if (!playAgain.equals("Y")){
                break;
            }
        }


        // SPIN ROW
        // PRINT ROW
        // GET PAYOUT
        // PLAY AGAIN?
        // DISPLAY EXIT MSG
        System.out.println("GAME OVER! Your balance is $" + balance);

        scanner.close();
    }

    static String[] spinRow() {

        String[] symbols = {"🍒", "🍉", "🍋", "🛎", "⭐"};
        String[] row = new String[3];
        Random rand = new Random();


        for(int i = 0; i < 3; i++){
            row[i] = symbols[rand.nextInt(symbols.length)];
        }

        return row;

    }
    static void printRow(String[] row){
        System.out.println("*************************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("*************************");
    }
    static int getPayout(String[] row, int bet){

        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🛎️" -> bet * 10;
                case "⭐️" -> bet * 20;
                default -> 0;

            };
        }
        else if(row[0].equals(row[1])){
            return switch(row[0]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🛎️" -> bet * 5;
                case "⭐️" -> bet * 10;
                default -> 0;

            };
        }
        else if(row[1].equals(row[2])){
            return switch (row[1]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🛎️" -> bet * 5;
                case "⭐️" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    }

         */

        // Object orientated programming

/*
        // Object = An Entity that holds data (attributes)
        // Performs actions (methods)
        // Reference data type

        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println(car1.make + " " + car1.make);
        System.out.println(car2.make + " " + car2.make);

 */

        // Constructor = Special Method to initialise objects
        // Can pass arguments into it and set up initial value
/*
Student student1 = new Student("Bob", 30, 3.5);
Student student2 = new Student("John", 32, 2.5);
Student student3 = new Student("Jane", 33, 1.5);


       student1.study();
       student2.study();
       student3.study();

 */

// Overloaded constructors = allow a class to have numerous
        // diff parameter lists
        // enable objects to be initialised in various ways

        /*
        User user1 = new User("Bob");
        User user2 = new User("Alice", "Alas@aol.com");
        User user3 = new User("Bo", "Cool@gmail.com");
        User user4 = new User();

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);

         */

        // Array of Objects

/*

Car[] cars = {new Car("Mustang", "Red"),
        new Car("Charger", "Yellow"),
        new Car("Mustang", "Blue") };

for(Car car : cars) {
    car.color = "red";
}
for(Car car : cars) {
    car.drive();
}

 */

        // Static = makes a variable or method belong to the class
        // rather than to any specific object
        // commonly used for utility methods are shared resources.

        /*
        Friend friend1 = new Friend("Rick");
        Friend friend2 = new Friend("Mick");
        Friend friend3 = new Friend("Bob");
        Friend friend4 = new Friend("John");
        Friend friend5 = new Friend("Jane");

       Friend.showFriends();

       //HOVER OVER MATH
        Math.round(3.99);

         */

        // Inheritance = One class inherits the attributes and methods from another class.
        // Child <- Parent <- Grandparent

/*
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

     dog.speak();
     cat.speak();
     plant.photosynthesize();

 */

        // Super = refers to parent class (subclass <- superclass)
        // Used in constructors and method overriding
        // Calls the parent constructor to initalise attributes
/*
        Person person = new Person("Tom", "Riddle");
        Student student = new Student("Harry", "Potter", 3.25);
        Employee employee = new Employee("Rubeus", "Hagrid", 50000);

        employee.showSalary();
        student.showGPA();

 */


        //Method overriding = When a subclass provides its own implementation
        // of a method already defined.
        // Allows code reusability and give specific implementations.

        /*
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();

         */

        // .toString() = Method inherited from the Object class.
        // Used to return a string representation of an object.
        // By default, it returns a hash code as a unique identifier.
        // It can be overridden to provide meaingful details.

        /*

        Car car1 = new Car("Ford", "Mustang", 2025, "Red");

        Car car2 = new Car("Chevrolet", "Corvette", 2026, "Blue");

        System.out.println(car1);
        System.out.println(car2);

         */

        // Abstract = Used to define abstract classes and methods.
        // Abstraction is the process of hiding implementation details and showing only the essential Features;
        // Abstract classes CAN'T be instantiated directly
        // Can contain 'abstract' methods (which must be implemented)
        // Can contain 'concrete' methods (which are inherited)
/*
      Circle circle = new Circle(3);
      Triangle triangle = new Triangle(4,5);
      Rectangle rectangle = new Rectangle(6,7);

        System.out.println(triangle.area());
        System.out.println(rectangle.area());
        System.out.println(circle.area());

 */

        // Interface = Blueprint for a class that specifies a set of abstract methods
        // that implementing classes must define.
        // Supports multiple inheritance like behaviour
/*
Rabbit rabbit = new Rabbit();
Hawk hawk = new Hawk();
Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.hunt();
        fish.flee();

 */

        // Polymorphism = "Poly" = "Many"
        // "Morph" = "Shape"
        // Objects can identify as other objects
        // Objects can be treated as objects of a common superclass.
/*
Car car = new Car();
Bike bike = new Bike();
Boat boat = new Boat();

Vehicle[] vehicles = {car, bike, boat};

for(Vehicle vehicle : vehicles) {
    vehicle.go();
}

 */

        // Runtime polymorphism AKA Dynamic
        // When the method that gets executed is decided at runtime based on the actual type of the object.

        /*
        Scanner scanner = new Scanner(System.in);

        Animal animal;

        System.out.println("Want a dog or cat? (1 = Dog, 2 = Cat)");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        }
        else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }

         */

        // Getters n Setters = Protect object data and add rules for accessing or modifying them.
        // G = Readable, S = Writable

        /*

        Car car = new Car("Charger", "Red", 10000);

       // car.setModel("Corvette");
        car.setColor("Blue");
        car.setPrice(-10);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());


         */

        // Aggregation = represents a "has a" relationship between objects.
        // One object contain another object as part of its structure.
        // But the contained objects can exist independently

        /*
        Book book1 = new Book("The Walking Dead Issue 1", 200);
        Book book2 = new Book("The Walking Dead Issue 2", 250);
        Book book3 = new Book("The Walking Dead Issue 3", 300);

        Book[] books = {book1, book2, book3};

    //for(Book book : books) {
     //   System.out.println(book.displayInfo());
   // }

        Library library = new Library("BH Public Library", 2005, books);

        library.displayInfo();

         */

        // Composition = Represents a "part of" relationship between objects
        // Eg. "Engine" is a part of a car
        // Allows complex objects to be constructed from smaller objects

/*
        Car car = new Car("Ford", 2025, "V5");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();

 */

        // Wrapper Classes = Allows primitive values (int, char, double, boolean)
        // To be used as objects, "Wrap them in an object"
        // Generally, don't wrap primitives unless you need an object.
        // Allows use of collections framework and static utility methods.

        //Autoboxing
        //Integer a = new Integer(123);
        //Double b = new Double(3.14)
        //Character c = new Character('$');
        //Boolean d = new Boolean(true);

        /*
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;

        //Unboxing

        int x = a;
        double x = b;
        char x = c;
        boolean x = d;

         */

        /*
        String a = Integer.toString(123);
        String b = Double.toString(3.14);
        String c = Character.toString('@');
        String d = Boolean.toString(false);

        String x = a + b + c + d;

        System.out.println(x);

         */

        // To revert a string from a primitive data type

        /*
        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");
        char c = "Pizza".charAt(0);
        boolean d = Boolean.parseBoolean("true");

         */

        // To convert a string to its primitive data type

        /*
        char letter = 'q';
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));

         */

        // ArrayList = A resizable array that stores objects (Autoboxing)
        // Arrays are fixed in size but ArrayLists can change

        /*
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3.5);
        list.add(1);
        list.add(2);
        System.out.println(list);

        If double, change it from Integer and add D.P
         */

        /*
        ArrayList<String> fruits = new ArrayList<>();

       fruits.add("Apple");
       fruits.add("Banana");
       fruits.add("Orange");

        // fruits.remove(0);
        // fruits.set(0, "Pear");

        // System.out.println(fruits.get(2));
        // System.out.println(fruits.size());

        Collections.sort(fruits);

        for(String fruit : fruits){
            System.out.println(fruit);
        }

         */

        /*
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();
        System.out.print("Enter # food: ");

        int numOfFoods = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i < numOfFoods; i++) {
            System.out.println("Food #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        scanner.close();

         */

        // Exception = Event that interrupts the normal flow of a program
        // (Dividing by 0, file not found, mismatch imput type)
        // Surround any dangerous code with a try{} block
        // try{}, catch{}, finally{}


/*
        try{Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        }

        catch (InputMismatchException e){
            System.out.println("NOT a number");

        }
        catch(ArithmeticException e){
            System.out.println("CANNOT DIVIDE BY ZERO");

        }

        catch(Exception e){
            // Safety Net
            System.out.println("ERROR");
        }

        finally{
            System.out.println("ALWAYS EXECUTED");
        }

 */

        // How to write a file using java (4 main options)

        // File writer = good for small or medium sized text files
        // Buffed writer = better performance for large amounts of text
        // Paint writer = best for structured data like reports/logs
        // FileOutputStream = best for binary files (images, audio files)

/*
        String filePath = "test.txt";
        String textContent = "I like seaweed\nIt's good\nGive it all to me";

        // """ IF YOU HAVE ALOT OF TEXT DO THIS """;

            try(FileWriter writer = new FileWriter(filePath)) {
                writer.write(textContent);
                System.out.println("File written successfully");

            }
            catch(FileNotFoundException e){
                System.out.println("File not found");
            }
            catch(IOException e){
                System.out.println("Could not write file");

            }

 */

        // How to read a file using Java (3 options)
        // Buffed reader + file reader = Best for reading text files line by line
        // FileInputStream = Best for binary files images audio files
        // RandomAccessFile = Best for read and write specific portions of a large file

        // How 2 play audio with Java (.wav, .au, .aiff)

        /*

        String filePath = "/Users/skraxch/IdeaProjects/MyFirstProject/src/I Gave You My Heart - Jeremy Black.wav";
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(System.in);
             AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";
            while (!response.equals("Q")) {

                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Restart");
                System.out.println("Q = Quit");
                System.out.println("Enter your choice: ");

                response = scanner.nextLine().toUpperCase();

                switch (response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find the file");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio Format Not Supported");
        } catch (LineUnavailableException e) {
            System.out.println("Unable to access audio resource");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("Done");
            //scanner.close(); should be there but doesn't work?
        }
    }
}

         */

        // HANGMAN

        /*

        String filePath = "/Users/skraxch/IdeaProjects/MyFirstProject/src/Hwords";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null){
                words.add(line.trim());
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }

        Random rand = new Random();


        String word = words.get(rand.nextInt(words.size()));

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for(int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        System.out.println("*******************");
        System.out.println("Welcome to Hangman");
        System.out.println("*******************");

       while(wrongGuesses < 6) {


           System.out.println(getHangmanArt(wrongGuesses));
           System.out.print("Word: ");

           for (char c : wordState) {
               System.out.print(c + " ");
           }

           System.out.println();

           System.out.println("Guess a letter: ");
           char guess = scanner.next().toLowerCase().charAt(0);

           if (word.indexOf(guess) >= 0) {
               System.out.println("You guessed correctly!\n");

               for (int i = 0; i < word.length(); i++) {
                   if (word.charAt(i) == guess) {
                       wordState.set(i, guess);
                   }
               }

               if(!wordState.contains('_')){
                   System.out.println("You win");
                   System.out.println("Word was: " + word);
                   break;
               }
           } else {
               wrongGuesses++;
               System.out.println("WRONG GUESS!\n");
           }
       }
       if(wrongGuesses == 6){
           System.out.println(getHangmanArt(wrongGuesses));
           System.out.println("You lost!");
           System.out.println("Word was: " + word);
       }

        scanner.close();

    }
    static String getHangmanArt(int wrongGuesses) {
        return switch(wrongGuesses){
            case 0 -> """
                      
                      
                    
                      """;
            case 1 -> """
                       o
                      
                    
                      """;
            case 2 -> """
                       o
                       |
                    
                      """;
            case 3 -> """
                       o
                      /|
                    
                      """;
            case 4 -> """
                       o
                      /|\\
                    
                      """;
            case 5 -> """
                       o
                      /|\\
                      /
                      """;
            case 6 -> """
                       o
                      /|\\
                      / \\
                      """;
            default -> "";


        };

    }
}

         */

        // DATES AND TIMES using Java

        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        // LocalDateTime datetime = LocalDateTime.now();
        // System.out.println(datetime);

        // Instant instant = Instant.now();
        // System.out.println(instant);

        //CUSTOM FORMAT

        /*
        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);



        LocalDateTime date1 = LocalDateTime.of(2025, 1, 1, 0, 0, 0);
        LocalDateTime date2 = LocalDateTime.of(2025, 1, 1, 0, 0, 0);

        if(date1.isBefore(date2)) {
            System.out.println(date1 + " is earlier " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is later" + date2);
        } else if (date1.isEqual(date2)) {
            System.out.println(date1 + " is equal to " + date2);
        }

         */

        

    }
}
