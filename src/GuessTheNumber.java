import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner keyboard = new Scanner(System.in);
        int computerNum = random.nextInt(100) + 1;
        int playerGuess = 0;
        int guessCount = 0;
        while (playerGuess != computerNum) {
            System.out.println("What is your guess?");
            int playerNum = keyboard.nextInt();
            if (playerNum == computerNum) {
                System.out.println("Correct!");
                playerGuess += playerNum;
            }
            else if (playerNum > 101 || playerNum < 1) {
                System.out.println("Wasted guess");
                guessCount++;
            }
            else if (playerNum > computerNum) {
                System.out.println("Too high!");
                guessCount++;
            }
            else if (playerNum < computerNum) {
                System.out.println("Too low!");
                guessCount++;
            }
            else {
                System.out.println("Try again!");
                guessCount++;
            }

        }
        System.out.println("You guessed the number in " + guessCount + " guesses");
    }
   
}
