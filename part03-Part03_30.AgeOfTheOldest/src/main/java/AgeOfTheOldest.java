
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest =0;
        while (true){
            String str = scanner.nextLine();
            if (str.equals("")){
                break;
            }
            String[] arr = str.split(",");
            oldest = Math.max(oldest,Integer.valueOf(arr[1]));
        }
        System.out.println("Age of the oldest: "+oldest);
    }
}
