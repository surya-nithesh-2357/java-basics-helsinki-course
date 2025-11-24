public class Container {
    private int first_value;

    public Container(){
        this.first_value = 0;
    }

    public int contains(){
        return this.first_value;
    }

    public void add(int amount){
        if (amount > 0){
            if (amount + first_value <= 100){
                this.first_value = this.first_value +amount;
            }
            else{
                this.first_value = 100;
            }
        }
    }

    public void remove(int amount){
        if (first_value - amount >= 0){
            first_value = first_value - amount;
        } else {
            first_value = 0;
        }
    }

    public String toString(){
        return this.first_value+"/100";
    }

}
