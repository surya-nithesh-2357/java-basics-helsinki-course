
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total =0;
        int longNameLength =0;
        String res ="";
        int cnt =0;
        while (true){
            String str = scanner.nextLine();
            if (str.equals("")){
                break;
            }
            String[] arr = str.split(",");
            // oldest = Math.max(oldest,Integer.valueOf(arr[1]));
            if (arr[0].length() >= longNameLength){
                longNameLength = arr[0].length();
                res =arr[0];
            }
            total+= Integer.valueOf(arr[1]);
            cnt++;
        }
        System.out.println("Longest name: "+res);
        System.out.println("Average of the birth years: "+ (1.0)*total/cnt);

    }
}
