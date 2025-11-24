
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        int cnt =0;
        int tot =0;
        ArrayList<Integer> list = new ArrayList<>();
        while (true){
            int num = scanner.nextInt();
            if (num == -1){
                break;
            }else{
                cnt++;
                tot+=num;
            }

        }
        // Then it computes the average of the numbers on the list
        double avg = 1.0 * (tot)/cnt;
        // and prints it.
        System.out.println("Average: "+avg);
        
    }
}
