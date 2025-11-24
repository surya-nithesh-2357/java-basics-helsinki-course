
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> myList = new ArrayList<>();
        while (true){
            int num = scanner.nextInt();
            if (num == 9999){
                break;
            }else{
                myList.add(num);
            }
        }
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int mini = myList.get(0);
        for (int i: myList){
            mini = Math.min(i,mini);
        }
        int cnt =0;
        for (int j=0; j<myList.size();j++){
            if(myList.get(j)==mini && cnt !=1){
                System.out.println("Smallest number: "+mini);
                cnt++;
                System.out.println("Found at index: "+j);
            }else if (myList.get(j)==mini && cnt ==1){
                System.out.println("Found at index: "+j);
            }
            
        }

        
    }
}
