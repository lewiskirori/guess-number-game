package com.example.guessnumbergame;
import java.until.Scanner;
public class Main {
    public static void main(String args[]) {
        int attempt = 1;
        int userGuessNumber = 0;
        int secretNumber = (int) (Math.random() * 99 + 1);
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to Guess Number Game \nYou Will Be asked To Guess A Number To Win The Game \nYou have Maximum 3 Attempt Limit");
        do {
            System.out.println("Enter a guess number between 1 to 100\n");
            if (userInput.hasNextInt()) {
                userGuessNumber = userInput.nextInt();
                if (userGuessNumber == secretNumber) {
                    System.out.println("EXCELLENT!, Your Number is Correct. YoU Win the Game!");
                    break;
                } else if (userGuessNumber < secretNumber)
                    System.out.println("Your Guess Number is Smaller.");
                else if (userGuessNumber > secretNumber)
                    System.out.println("Your Guess Number is Greater.");
                if (attempt == 3) {
                    System.out.println("You have exceexded the max attempt. TRY AGAIN");

                    break;
                }
                attempt++;
            } else {
                System.out.println("Enter valid Int NUmber.");
                break;
            }
        } while (userGuessNumber != secretNumber);
    }


}
