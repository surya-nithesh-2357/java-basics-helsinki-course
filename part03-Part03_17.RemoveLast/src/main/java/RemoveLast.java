
import java.util.ArrayList;
import java.util.List;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
       List<Integer> numsB = new ArrayList<>(List.of(1, 2,2, 3));
        // for (int i = numsB.size()-1; i >=0; i--) {
        //     if (numsB.get(i) == 2) numsB.remove(i);
        // }
        // System.out.println(numsB);
        String s ="sd1";
        String k ="sd";
        System.out.println(s==k);
    }

    public static void removeLast(ArrayList<String> numbers) {
        int size = numbers.size();
        if (size == 0) {
            return;
        }

        numbers.remove(size-1);
}

}
