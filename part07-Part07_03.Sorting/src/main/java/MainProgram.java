import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};

        // System.out.println(Arrays.toString(numbers));

        // MainProgram.swap(numbers, 1, 0);
        // System.out.println(Arrays.toString(numbers));

        // MainProgram.swap(numbers, 0, 3);
        // System.out.println(Arrays.toString(numbers));

        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array){
        if (array.length > 0){
            int smallest = array[0];
            for (int k: array){
                smallest = Math.min(smallest, k);
            }
            return smallest;
        }
        
        return 0;
    }

    public static int indexOfSmallest(int[] array){
    // write your code here
        if (array.length > 0){
                int smallest_index = 0;
                int smallest = array[0];
                for (int i=0; i < array.length; i++){
                    if (smallest >= array[i]){
                        smallest = array[i];
                        smallest_index = i;
                    }
                }
                return smallest_index;
            }
            return 0;
        }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
    // write your code here
        if (array.length > 0){
                int smallest_index = startIndex;
                int smallest = array[startIndex];
                for (int i=startIndex; i < array.length; i++){
                    if (smallest >= array[i]){
                        smallest = array[i];
                        smallest_index = i;
                    }
                }
                return smallest_index;
            }
            return 0;
    }


    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int num = array[index1];
        array[index1] = array[index2];
        array[index2] = num;

    }   

    public static void sort(int[] array) {
        for (int i=0; i < array.length; i++){
            swap(array, i, indexOfSmallestFrom(array,i));
            System.out.println(Arrays.toString(array));
        }
    }

}
