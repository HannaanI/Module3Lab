package Q2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hannaan
 */
import java.util.Scanner;
public class guessTheNumber {
    
    public static void main(String[] args) {
    int randNumber = 455;
    
    System.out.print("Try to guess a number between 1 and 1000: ");
    
    Scanner scanner = new Scanner(System.in);
    
    int userInput = scanner.nextInt();
    
    while (true) {
            // Get the user's guess
            int guess = scanner.nextInt();

            // Check if the guess is too high or too low
            if (guess > randNumber) {
                System.out.println("You are too high, guess again.");
            } else if (guess < randNumber) {
                System.out.println("You are too low, guess again.");
            } else {
                // The user guessed correctly, so break out of the loop
                System.out.println("Congratulations, you guessed the number!");
                break;
            }
        }
    }
}

