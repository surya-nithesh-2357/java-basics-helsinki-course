import java.util.ArrayList;

public class Recipes {
    private String dish_name;
    private int time_taken;
    private ArrayList<String>ingredients;

    public Recipes(String dish_name,int time_taken){
        this.dish_name = dish_name;
        this.time_taken = time_taken;
        this.ingredients = new ArrayList<String>();
    }

    public void AddIngredients(String material){
        this.ingredients.add(material);
    }

    public String toString(){
        return this.dish_name +", cooking time: "+this.time_taken;
    }

    public ArrayList<String> ingredientsList(){
        return this.ingredients;
    }

    public String getName(){
        return this.dish_name;
    }

    public int getTimeTaken(){
        return this.time_taken;
    }


}
