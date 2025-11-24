import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Title: ");
            String name = scanner.nextLine();
            if (name.equals("")){
                break;
            }
            System.out.print("pages: ");
            int duration = scanner.nextInt();

            System.out.println("Publication year: ");
            int publicationYear = scanner.nextInt();
            programs.add(new Book(name,duration,publicationYear));
            scanner.nextLine();
        }
        System.out.println("What information will be printed?");
        String need = scanner.nextLine();
        for (Book book:programs){
            if(need.equals("everything")){
                System.out.println(book);
            }
            else if (need.equals("name")){
                System.out.println(book.getTitle());
            }
        }

    }
}
