import java.util.ArrayList;

public class Bird {
    private String name;
    private String latinName;
    private int observation = 0;

    public Bird (String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }

    public String toString(){
        return this.name+ " ("+this.latinName +" ):"+this.observation+" observations";
    }

    public String getName(){
        return this.name;
    }

    public void setObservation(){
        this.observation++;
    }
}
