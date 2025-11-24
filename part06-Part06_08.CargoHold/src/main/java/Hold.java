import java.util.ArrayList;

public class Hold {

    private int max_weight;
    private ArrayList<Suitcase> holder;

    public Hold(int max_weight){
        this.max_weight =max_weight;
        this.holder = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase){
        if (this.totalWeight()+suitcase.totalWeight()<= this.max_weight){
            this.holder.add(suitcase);
        }
    }

    public int totalWeight(){
        int sum = 0;
        for (Suitcase item :holder) {
            sum += item.totalWeight();
        }
        return sum;
    }

    public String toString(){
        return this.holder.size()+" suitcases ("+this.totalWeight()+" kg)";
    }

    public void printItems(){
        // System.out.println("The suitcases in the hold contain the following items:");
        for (Suitcase suit: holder){
            //System.out.println(suit.printItems(););
            suit.printItems();
        }
    }
}
