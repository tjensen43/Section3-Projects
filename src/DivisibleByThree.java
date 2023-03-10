import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int userInput;

        System.out.println("Enter an integer:");
        userInput = keyboard.nextInt();
        if(userInput % 3 != 0) {
            System.out.println("Not divisible by three");
        }
        else if (userInput % 3 == 0) {
            System.out.println("Divisible by three");
        }
        else {
            System.out.println("Idk man you fucked something up");
        }

        }
    }
