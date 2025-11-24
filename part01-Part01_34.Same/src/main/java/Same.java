
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Enter the first string:");
        String firString = scan.nextLine();
        System.out.println("Enter the second string:");
        String secString = scan.nextLine();
        String tString = firString+secString;
        secString = "Hello dear";
        System.out.println(tString);
        if (firString.equals(secString)){
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
