import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int userPackage;
        int userCourses;
        int baseCost;
        System.out.println("What package are you choosing?");
        userPackage = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("How many courses are you taking");
        userCourses = keyboard.nextInt();
        switch (userPackage) {
            case 1 -> {
                baseCost = 10;
                if (userCourses > 2) {
                    baseCost += ((userCourses - 2) * 6);
                    System.out.println("Your sum is:\t" + baseCost);
                } else {

                    System.out.println("Your total is\t" + baseCost);
                }
            }
            case 2 -> {
                baseCost = 12;
                if (userCourses > 4) {
                    baseCost += ((userCourses - 4) * 4);
                    System.out.println("Your sum is:\t" + baseCost);
                } else {

                    System.out.println("Your total is\t" + baseCost);
                }
            }
            case 3 -> {
                baseCost = 15;
                if (userCourses > 6) {
                    baseCost += ((userCourses - 6) * 3);
                    System.out.println("Your sum is:\t" + baseCost);
                } else {

                    System.out.println("Your total is\t" + baseCost);
                }
            }
        }
    }
}