
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        System.out.println("Enter point totals, -1 stops:");
        // multiple classes.
        Grades grades = new Grades();
        while(true){
            int num = scanner.nextInt();
            if (num == -1){
                break;
            }else{
               grades.add(num);
            }
        }
        System.out.println("Point average (all): "+grades.average());
        System.out.println("Point average (passing): "+grades.passAverage());
        System.out.println("Pass percentage: "+grades.PassPercentage());
        System.out.println("Grade distribution:" );
        grades.printGradeDistribution();
        

    }

}
