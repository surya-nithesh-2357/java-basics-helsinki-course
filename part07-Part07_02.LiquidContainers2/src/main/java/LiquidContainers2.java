
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first_container = new Container();
        Container second_container = new Container();
        while (true) {
            System.out.print("> ");
            System.out.println("First: "+ first_container);
            System.out.println("Second: "+ second_container );
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add") && amount > 0){
                first_container.add(amount);
            }

            if (command.equals("remove") && amount > 0){
                if (second_container.contains() - amount >= 0){
                    second_container.remove(amount);
                }
                
            }

            if (command.equals("move") && amount > 0){
                if (first_container.contains() - amount >= 0){
                    first_container.remove(amount);
                    if (second_container.contains() + amount <= 100){
                        second_container.add(amount);
                    }else{
                        second_container.add(100);
                    }
                }else{
                    second_container.add(first_container.contains() <= 100 ? first_container.contains() : 100);
                    first_container.remove(amount);
                }
            }

        }
    }

}
