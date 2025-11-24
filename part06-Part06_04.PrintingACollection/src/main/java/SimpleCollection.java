
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public void printElements(){
       
        for (String k:elements){
            System.out.println(k);
        }
    }

    public String toString(){
        if (this.elements.isEmpty()) {
        return "The collection " + this.name + " is empty.";
    }

    // Build the list of elements
    StringBuilder sb = new StringBuilder();
    sb.append("The collection ").append(this.name)
      .append(" has ").append(this.elements.size()).append(" element");

    if (this.elements.size() > 1) {
        sb.append("s");
    }

    sb.append(":\n");

    for (String element : this.elements) {
        sb.append(element).append("\n");
    }

    return sb.toString().trim();
        
    }
    
}
