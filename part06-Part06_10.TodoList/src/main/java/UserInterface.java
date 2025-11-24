import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList checklist;

    public UserInterface (TodoList todoList, Scanner scan){
        this.scanner = scan;
        this.checklist = todoList;
    }

    public void start(){
        while(true){
            System.out.print("command: ");
            String input = scanner.nextLine();
            if (input.equals("stop")){
                break;
            }
            if (input.equals("add")){
                System.out.print("To add:");
                String str = scanner.nextLine();
                checklist.add(str);
            }
            if (input.equals("list")){
                checklist.print();
            }
            if (input.equals("remove")){
                System.out.print("Which one is removed? ");
                int num = scanner.nextInt();
                scanner.nextLine();
                checklist.remove(num);
            }
        }
    }

    

    
}