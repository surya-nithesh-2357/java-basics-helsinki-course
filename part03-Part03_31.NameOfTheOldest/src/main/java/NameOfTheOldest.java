
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest =0;
        String tet = "";
        while (true){
            String str = scanner.nextLine();
            if (str.equals("")){
                break;
            }
            String[] arr = str.split(",");
            // oldest = Math.max(oldest,Integer.valueOf(arr[1]));
            if (oldest <= Integer.valueOf(arr[1])){
                oldest = Integer.valueOf(arr[1]);
                tet = arr[0];
            }
        }
        System.out.println("Name of the oldest: "+tet);

    }
}
