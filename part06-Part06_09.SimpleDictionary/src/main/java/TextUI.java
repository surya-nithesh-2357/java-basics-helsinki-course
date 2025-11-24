import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scan, SimpleDictionary dictionary){
        this.scanner = scan;
        this.dict = dictionary;
    }

    public void start(){
        
        while (true){
            System.out.print("Command: ");
            String str = this.scanner.nextLine();
            if (str.equals("end")){
                System.out.println("Bye bye!");
                break;
            }
            if (str.equals("add")){
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                this.dict.add(word, translation);
            }
            if (str.equals("search")){
                System.out.print("To be translated:");
                String toBeTranslated = scanner.nextLine();
                if (dict.translate(toBeTranslated)!= null){
                    System.out.println("Translation: "+dict.translate(toBeTranslated));
                }else{
                    System.out.println("Word "+toBeTranslated+" was not found");
                }
                
            }
            else{
                System.out.println("Unknown command");
            }
            
        }
       
    }
}
