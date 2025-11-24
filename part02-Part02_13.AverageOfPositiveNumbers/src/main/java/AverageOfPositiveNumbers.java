
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count =0;
        int num = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }else if ( number > 0)  {
                count++;
                num+=number;
            }
        }
        
        double avg = (double)num/count;
        if (avg > 0){
            System.out.println(avg);
        } else {
            System.out.println("Cannot calculate the average");
        }
        
        
        
    }
}
