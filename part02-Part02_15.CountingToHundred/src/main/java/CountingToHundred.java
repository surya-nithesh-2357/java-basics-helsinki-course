
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 100;
        while (num <= i){
            System.out.println(num);
            num++;
        }
    }
}
