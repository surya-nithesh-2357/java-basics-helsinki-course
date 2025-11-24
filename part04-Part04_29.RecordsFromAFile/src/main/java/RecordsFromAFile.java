
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String filePath = scanner.nextLine();
        try (Scanner sc = new Scanner(Paths.get(filePath))){
            while(sc.hasNextLine()){
                String str = sc.nextLine();
                String [] parts = str.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                System.out.println(name+"age: "+age+" years");

            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
