
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.valueOf(scan.nextLine());

        if (number % 4 == 0 && number % 100 != 0) {
            System.out.println("The year is a leap year.");
        } else if (number % 400 == 0) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }

        String str = scan.nextLine();
        System.out.println(str+ " The value of str");
    }
}
