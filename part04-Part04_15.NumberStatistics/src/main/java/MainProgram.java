
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise
        Statistics stat = new Statistics();
        System.out.println("Enter numbers:");
        int evenSum=0;
        int oddSum=0;
        while(true){
            int num = scanner.nextInt();
            if (num == -1) break;
            stat.addNumber(num);
            if (num % 2 == 0){
                evenSum+=num;
            }else {
                oddSum+=num;
            }
        }
        System.out.println("Sum: "+stat.sum());
        
        System.out.println("Sum of even numbers: "+evenSum);
        System.out.println("Sum of odd numbers: "+oddSum);
        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        scanner.close();
    }
}
