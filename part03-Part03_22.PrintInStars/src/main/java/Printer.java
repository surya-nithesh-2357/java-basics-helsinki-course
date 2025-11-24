
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for (int k:array){
            printStars(k);
            System.out.println();
        }
    }
    public static void printStars(int num){
        int j=0;
        while (j< num){
            System.out.print("*");
            j++;
        }
    }

}
