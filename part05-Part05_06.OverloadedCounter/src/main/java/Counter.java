public class Counter {
    private int value;
 
    public Counter(int value) {
        this.value = value;
    }

    public Counter(){
        this(0);
    }

    public void increase() {
        this.value = this.value + 1;
    }

    public void increase(int increaseBy) {
        if(increaseBy > 0){
            this.value = this.value + increaseBy;
        }
    }

    public void decrease() {
        this.value = this.value - 1;
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0){
            this.value = this.value - decreaseBy;
        }
    }

    public int value() {
        return value;
    }
}
