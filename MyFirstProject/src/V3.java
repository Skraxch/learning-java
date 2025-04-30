import java.util.Arrays;
import java.util.Scanner;

public class V3 {
    public static void main(String[] args) {
        int [] originalArray = {12, 3, 6, 4, 7};
                int [] copyArray = Arrays.copyOf(originalArray, originalArray.length);
        Arrays.sort(copyArray);
        System.out.println("Please enter a value you wish to seek:" );
Scanner sc = new Scanner(System.in);
int searchValue = sc.nextInt();

    int foundIndex = Arrays.binarySearch(copyArray, searchValue);
    if (foundIndex <= 0) {
        System.out.println(" value " +searchValue+ " not found in sorted array");
    }
    else {
        System.out.println(" value " +searchValue+ " found at index" + foundIndex + " in sorted array");
    }
    }
}
