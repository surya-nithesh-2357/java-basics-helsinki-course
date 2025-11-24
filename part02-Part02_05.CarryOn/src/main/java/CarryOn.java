
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String str = scanner.nextLine();
            System.out.println("Shall we carry on?");
            if (str.equalsIgnoreCase("no")){
                break;
            }
            
        }
    }
}
