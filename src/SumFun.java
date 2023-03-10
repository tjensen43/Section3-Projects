import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int inputSum = 0;
        int userInput;

        userInput = keyboard.nextInt();

        while (userInput >= 0) {
            inputSum += userInput;
            userInput = keyboard.nextInt();

        }
        System.out.println("sum is" + inputSum);
    }
}
