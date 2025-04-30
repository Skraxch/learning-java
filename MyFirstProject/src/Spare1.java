import java.util.Scanner;
public class Spare1 {

    public static void main(String[] args) {


//Scanner scanner = new Scanner(System.in);

//System.out.print("Enter your age: ");
//int age = scanner.nextInt();
//scanner.nextLine();

//System.out.print("Enter your favourite color: ");
//String color = scanner.nextLine();

//System.out.println("You are " + age + " years old");
//System.out.println("You like the color " + color);

//scanner.close();

        //CALCULATE AREA OF RECTANGLE

        double width;
        double height;
        double area;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is " + area + "cm^2");

        scanner.close();
    }
}