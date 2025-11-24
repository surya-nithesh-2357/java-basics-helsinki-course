
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Last number? "+n);
        int sum = n*(n+1)/2;
        System.out.println("The sum is "+sum);
    }
}
