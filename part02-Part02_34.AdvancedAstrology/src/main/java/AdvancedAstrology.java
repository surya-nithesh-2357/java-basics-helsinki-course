
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        while (number > 0){
            System.out.print("*");
            number--;
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        while (number > 0){
            System.out.print(" ");
            number--;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int i =1;
        while (size >= i){
            printSpaces(size - i);
            printStars(i);
            i++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int i = 1;
        int cnt =0;
        int j = height -1 ;
        while (height > cnt){
            printSpaces(j);
            printStars(i);
            i+=2;
            cnt++;
            j--;
        }
        printSpaces(height-2);
        printStars(3);
        printSpaces(height-2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
