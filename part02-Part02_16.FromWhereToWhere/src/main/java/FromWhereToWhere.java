
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int num = scanner.nextInt();
        // int i = 1;
        // while (num >= i){
        //     System.out.println(i);
        //     i++;
        // }

        System.out.println(("where from?"));
        int num1 =scanner.nextInt();
        while (num >= num1){
            System.out.println(num1);
            num1++;
        }
    }
}
