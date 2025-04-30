/*
import java.util.Scanner;
public class Nav {

    public static Scanner myImput = new Scanner(System.in);
    private static int currentLocation = 220;
    private static int tempLocation;

    public static void main(String[] args) {



    }

    public static void navigation() {
        tempLocation = currentLocation;
        System.out.println("You are currently at " + currentLocation);
        System.out.println("Which direction would you like to go?");
        System.out.println("[n]orth, [e]ast, [w]est, [s]outh\n");
        System.out.println("Press Q to quit");
        System.out.println("Enter direction: ");
        String directionEntered = myImput.nextLine().toLowerCase();

        switch (directionEntered)
        {
            case "n":
            {
                currentLocation = currentLocation + 100;
                goToLocation(currentLocation);
                break;
            }
            case "e":
            {
                currentLocation = currentLocation + 100;
                goToLocation(currentLocation);
                break;
            }
            case "w":
            {
                currentLocation = currentLocation - 10;
                goToLocation(currentLocation);
                break;
            }
            case "s": {
                currentLocation = currentLocation - 100;
                goToLocation(currentLocation);
                break;
            }
            case "q": {}
        }
    }
}

 */
