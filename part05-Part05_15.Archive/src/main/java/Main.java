
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String Identifier = scanner.nextLine();
            if (Identifier.equals("")){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (Identifier.equals("") || name.equals("")){
                break;
            }
            Product item = new Product(Identifier, name);
            if (!products.contains(item)){
                products.add(item);
            }
        }
        for (Product i: products){
            System.out.println(i);
        }

    }
}
