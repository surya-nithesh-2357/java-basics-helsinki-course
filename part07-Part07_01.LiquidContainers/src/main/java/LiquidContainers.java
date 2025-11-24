
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first_value = 0;
        int second_value = 0;
        while (true) {
            System.out.print("> ");
            System.out.println("First: "+ first_value +"/100");
            System.out.println("Second: "+ second_value +"/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add") && amount > 0){
                if (amount + first_value <= 100){
                    first_value = first_value +amount;
                }
                else{
                    first_value = 100;
                }
            }

            if (command.equals("move") && amount > 0){
                if (first_value - amount >= 0){
                    first_value = first_value - amount;
                    if (second_value + amount <= 100){
                        second_value = second_value + amount;
                    }else{
                        second_value = 100;
                    }
                }else{
                        second_value =  first_value <= 100 ? first_value : 100 ;
                        first_value = 0;
                    }
                
            }

            if (command.equals("remove") && amount > 0){
                if (second_value - amount >= 0){
                    second_value = second_value - amount;
                } else {
                    second_value = 0;
                }
                
            }


        }       
    }

}
