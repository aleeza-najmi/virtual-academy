import java.util.*;
import java.util.Scanner;

public class NumberAnalyzer {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // -- YOUR CODE GOES HERE --
        // Part 1: Declare your variables here to keep track of the sum,
        // even count, and odd count.
        int sum = 0;
        int even = 0;
        int odd = 0;

        // Ask the user how many numbers they want to analyze.
        System.out.print("How many numbers do you want to analyze? ");
        int count = keyboard.nextInt();

        // Part 2: Use a for loop to get 'count' number of integers from the user.
        for(int i = 0; i<count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = keyboard.nextInt();
            sum += number;
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        // Part 3: After the loop, print a final report.
        System.out.println("analysis (made me do all this when u could've done it urself)");
        System.out.println("Total = " + sum);
        System.out.println("amount of even numbers = " + even);
        System.out.println("amount of odd numbers = " + odd);
        System.out.println("use a calculator next time alr?");

        keyboard.close();
    }
}
