
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String file_name = scanner.nextLine();
        fileHandling fileHandle = new fileHandling(file_name);
        System.out.println();
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println();
        while (true){
            System.out.print("Enter command:");
            String str = scanner.nextLine();
            if (str.equals("stop")){
                break;
            }
            if (str.equals("list")){
                fileHandle.returnList();
            }
            if (str.equals("find name")){
                System.out.print("Searched word: ");
                String name = scanner.nextLine();
               fileHandle.findByName(name);
            }
            if(str.equals("find cooking time")){
                System.out.print("Max cooking time: ");
                int time = scanner.nextInt();
                scanner.nextLine();
                fileHandle.findBymaxTime(time);
            }
            if (str.equals("find ingredient")){
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println("Recipes:");
                fileHandle.findbyIngredients(ingredient);
            }
        }
        scanner.close();
       
    }   

}
