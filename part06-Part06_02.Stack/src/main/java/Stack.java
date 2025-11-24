import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;

    public Stack(){
        this.stack = new ArrayList<String>();
    }
    public boolean isEmpty(){
        // System.out.println("stack size: "+stack.size());
        return stack.isEmpty();
    }

    public void add(String value){
        stack.addFirst(value);
    }

    public ArrayList<String> values(){
        return stack;
    }

    public String take(){
        return stack.remove(0);
    }
}

