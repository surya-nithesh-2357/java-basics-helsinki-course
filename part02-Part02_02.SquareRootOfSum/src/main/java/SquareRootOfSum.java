import java.lang.Math;
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        double res = Math.sqrt(num2 + num1);
        System.out.println(res);
    }
}
