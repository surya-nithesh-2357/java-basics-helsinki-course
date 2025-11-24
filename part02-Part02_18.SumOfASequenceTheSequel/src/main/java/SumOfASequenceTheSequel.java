
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        System.out.println("First number? "+firstNum);
        int secNum =scanner.nextInt();
        System.out.println("Last number? "+secNum);
        int total =0;
        for (int i= firstNum ; i <= secNum; i++){
            total+=i;
        }
        System.out.println("The sum is "+total);
    }
}
