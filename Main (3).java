import java.util.*;
import java.util.Scanner;

public class Main {

   
    public static void askQuestionOne() {
        System.out.println("Question 1: What is 9x9?");
        Scanner answerInput = new Scanner(System.in);
        int answerOne = answerInput.nextInt();

        if (answerOne == 81) {
            System.out.println("You're right!");
        } else {
            System.out.println("Incorrect, the correct answer was 81");
        }
       
    }
    
    public static void numberAnalyzer() {
        System.out.println("enter a number");
        Scanner number = new Scanner(System.in);
        int numberInput = number.nextInt();
        if (numberInput%2 == 0) {
            System.out.println("even");
        } else{
            System.out.println("odd");
        }
    }
    
    public static void playGame() {
        int randomNumber = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        int userGuess = 0; 
        Scanner inputting = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");
         while (true) {
            System.out.print("Enter your guess: ");
            userGuess = inputting.nextInt();
            attempts++;
            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            }
        }
    }
    public static void main(String[] args) {
        askQuestionOne();
        numberAnalyzer();
        playGame();
    }
}
