
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        long prod =1;
        while (num >=1){
            prod*=num;
            num--;
        }
        System.out.println(prod);
    }
}
