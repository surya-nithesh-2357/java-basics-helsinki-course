import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
public class fileHandling {

    private ArrayList<Recipes> recipesList;


    public fileHandling(String file_name){
        this.recipesList = new ArrayList<>();
        try (Scanner scan = new Scanner(Paths.get(file_name))){
            while (scan.hasNextLine()) {
                String dish_name = scan.nextLine();
                int time_taken = scan.nextInt();
                Recipes recipes = new Recipes(dish_name, time_taken);
                scan.nextLine();
                while(scan.hasNext()){
                    String ingredient = scan.nextLine();
                    // System.out.println("ingredients "+ingredient);
                    if (ingredient.equals("")){
                        break;
                    }
                    recipes.AddIngredients(ingredient);
                }
                // System.out.println("scan has next val "+scan.hasNextLine());
                recipesList.add(recipes);
                // System.out.println(scan.hasNextLine());
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Reached erro line");
        }
    }

    public void returnList(){
        System.out.println("Recipes:");
        for (Recipes res:this.recipesList){
            System.out.println(res);
        }
    }

    public void findByName(String name) {
        String needle = name.toLowerCase();

        for (Recipes res : this.recipesList) {
            if (res.getName().toLowerCase().contains(needle)) {
                System.out.println(res);
            }
        }
    }

    public void findBymaxTime(int time){
        for (Recipes res : this.recipesList) {
            if (res.getTimeTaken()<= time) {
                System.out.println(res);
            }
        }
    }

    public void findbyIngredients(String ingredirnt){
        for (Recipes res : this.recipesList) {
            if (res.ingredientsList().contains(ingredirnt)){
                System.out.println(res);
            }
        }
    }
}