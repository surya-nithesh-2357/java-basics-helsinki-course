
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int a = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int b = scan.nextInt();
        int c = a >= b ? a : b;
        if(a != b){
            System.out.println("Greater number is: "+c);
        } else{
            System.out.println("The numbers are equal!");
        }
        
        


    }
}
