
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        Integer firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        Integer secNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        Integer thiInteger = Integer.valueOf(scanner.nextLine());
        System.out.println("The average is "+(firstNum+secNum+thiInteger)/3.0);

    }
}
