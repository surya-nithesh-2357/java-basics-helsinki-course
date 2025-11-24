import java.util.ArrayList;

public class Suitcase {

    private int max_weight;
    private ArrayList<Item> items;
    // private int tot_items;
    // private int tot_weight;

    public Suitcase(int max_weight){
        this.max_weight = max_weight;
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        if (this.totalWeight()+item.getWeight() <= this.max_weight){
            this.items.add(item);
        }
    }

    public void printItems(){
        for (Item pack:items){
            System.out.println(pack);
        }
    }


    public String toString(){
        // 0 items (0 kg)
        if (items.size()== 0){
            return "no items (0 kg)";
        }
        else if (items.size() == 1){
            return "1 item ("+this.totalWeight()+" kg)";
        }else {
            return this.items.size() + " items (" +this.totalWeight()+" kg)";
        }
    }


    public int totalWeight(){
        int sum = 0;
        for (Item item : items) {
            sum += item.getWeight();
        }
        return sum;
    }

    public Item heaviestItem(){
        int heaviestItem = 0;
        if (items.size() == 0){
            return null;
        }
        for (Item pack: items){
            if (heaviestItem <= pack.getWeight()){
                heaviestItem = pack.getWeight();
            }
        }
        for (Item item:items){
            if (item.getWeight() == heaviestItem){
                return item;
            }
        }
        return null;
    }
}
