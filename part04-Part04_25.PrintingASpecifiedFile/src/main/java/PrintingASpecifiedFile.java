
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String pathFile = scanner.nextLine();
        scanner.close();
        try (Scanner scan = new Scanner(Paths.get(pathFile))){
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }

        

    }
}
