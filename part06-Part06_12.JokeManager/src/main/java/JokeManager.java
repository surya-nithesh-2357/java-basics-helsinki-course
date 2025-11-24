import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes = new ArrayList<>();

    public JokeManager(){
        this.jokes = new ArrayList<String>();
    }

    public void addJoke(String joke){
        this.jokes.add(joke);
    }

    public String drawJoke(){
        System.out.println("I reached here in draw joke "+this.jokes.isEmpty());
        if (this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        } 
        Random draw = new Random();
        int index = draw.nextInt(this.jokes.size());
        String str = this.jokes.get(index);
        return str;
    }

    public void printJokes(){
         for (String joke : this.jokes) {
            System.out.println(joke);
        }
    }
}
